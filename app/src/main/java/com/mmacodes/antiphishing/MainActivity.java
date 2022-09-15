package com.mmacodes.antiphishing;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.mmacodes.antiphishing.api.service.IPQSService;
import com.mmacodes.antiphishing.model.ipqs.PhishingAnalyze;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private EditText url;
    private TextView show;
    private Button btnCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        url = findViewById(R.id.url);
        show = findViewById(R.id.tampilInformasiUrl);
        btnCheck = findViewById(R.id.btnCheck);

        btnCheck.setOnClickListener(view -> {
            try {
                onClick(view);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        });
    }

    private void onClick(View view) throws UnsupportedEncodingException {
        String url = URLEncoder.encode(this.url.getText().toString(), String.valueOf(StandardCharsets.UTF_8));
        IPQSService.ipqsEndpoint().analyzeUrl(url)
                .enqueue(new Callback<PhishingAnalyze>() {
                    @Override
                    public void onResponse(@NonNull Call<PhishingAnalyze> call, @NonNull Response<PhishingAnalyze> response) {
                        if (response.isSuccessful()) {
                            PhishingAnalyze phishingAnalyze = response.body();
                            assert phishingAnalyze != null;
                            if (phishingAnalyze.isSuccess()) {
                                show.setText(phishingAnalyze.toString());
                                Toast.makeText(getApplicationContext(), phishingAnalyze.getMessage(), Toast.LENGTH_SHORT).show();
                            } else {
                                show.setText(phishingAnalyze.getMessage());
                            }
                        } else {
                            show.setText(Objects.requireNonNull(response.toString()));
                        }
                    }

                    @Override
                    public void onFailure(@NonNull Call<PhishingAnalyze> call, @NonNull Throwable t) {
                        Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG).show();
                    }
                });
    }
}