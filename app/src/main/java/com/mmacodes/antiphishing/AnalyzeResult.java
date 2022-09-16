package com.mmacodes.antiphishing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.mmacodes.antiphishing.model.ipqs.PhishingAnalyze;

public class AnalyzeResult extends AppCompatActivity {

    private TextView riskScore, urlScanned, spamming, malware, phishing, suspicious, adult, category, domainAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analyze_result);

        initView();

        Intent getAnalyzeResult = getIntent();
        PhishingAnalyze phishingAnalyze = getAnalyzeResult.getParcelableExtra("ANALYZE_RESULT");
        String url = getAnalyzeResult.getStringExtra("URL_SCANNED");

        riskScore.setText(String.valueOf(phishingAnalyze.getRisk_score()));
        urlScanned.setText(url);
        spamming.setText(phishingAnalyze.isSpamming() ? R.string.yes : R.string.no);
        malware.setText(phishingAnalyze.isMalware() ? R.string.yes : R.string.no);
        phishing.setText(phishingAnalyze.isPhishing() ? R.string.yes : R.string.no);
        suspicious.setText(phishingAnalyze.isSuspicious() ? R.string.yes : R.string.no);
        adult.setText(phishingAnalyze.isAdult() ? R.string.yes : R.string.no);
        category.setText(phishingAnalyze.getCategory());
        domainAge.setText(phishingAnalyze.getDomain_age().getHuman());
    }

    private void initView() {
        riskScore = findViewById(R.id.riskScore);
        urlScanned = findViewById(R.id.urlScanned);
        spamming = findViewById(R.id.spamming);
        malware = findViewById(R.id.malware);
        phishing = findViewById(R.id.phishing);
        suspicious = findViewById(R.id.suspicious);
        adult = findViewById(R.id.adult);
        category = findViewById(R.id.category);
        domainAge = findViewById(R.id.domainAge);
    }
}