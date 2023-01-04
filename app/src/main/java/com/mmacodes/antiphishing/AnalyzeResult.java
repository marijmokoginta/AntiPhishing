package com.mmacodes.antiphishing;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.mmacodes.antiphishing.model.ipqs.PhishingAnalyze;

public class AnalyzeResult extends AppCompatActivity {

    private TextView riskScore, urlScanned, spamming, malware, phishing, suspicious, adult, category, domainAge;
    private PhishingAnalyze phishingAnalyze;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analyze_result);

        initView();

        Intent getAnalyzeResult = getIntent();
        phishingAnalyze = getAnalyzeResult.getParcelableExtra("ANALYZE_RESULT");
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

        setColor();
    }

    @SuppressLint({"UseCompatLoadingForDrawables", "UseCompatTextViewDrawableApis"})
    private void setColor() {
        if(phishingAnalyze.isSpamming()) {
            spamming.setTextColor(getResources().getColor(R.color.danger, getTheme()));
            spamming.setCompoundDrawables(getResources().getDrawable(R.drawable.ic_warning, getTheme()), null, null, null);
            spamming.setCompoundDrawableTintList(getColorStateList(R.color.danger));
        } else {
            spamming.setTextColor(getResources().getColor(R.color.success, getTheme()));
        }

        if(phishingAnalyze.isMalware()) {
            malware.setTextColor(getResources().getColor(R.color.danger, getTheme()));
            malware.setCompoundDrawables(getResources().getDrawable(R.drawable.ic_warning, getTheme()), null, null, null);
            malware.setCompoundDrawableTintList(getColorStateList(R.color.danger));
        } else {
            malware.setTextColor(getResources().getColor(R.color.success, getTheme()));
        }

        if(phishingAnalyze.isPhishing()) {
            phishing.setTextColor(getResources().getColor(R.color.danger, getTheme()));
            phishing.setCompoundDrawables(getResources().getDrawable(R.drawable.ic_warning, getTheme()), null, null, null);
            phishing.setCompoundDrawableTintList(getColorStateList(R.color.danger));
        } else {
            phishing.setTextColor(getResources().getColor(R.color.success, getTheme()));
        }

        if(phishingAnalyze.isSuspicious()) {
            suspicious.setTextColor(getResources().getColor(R.color.danger, getTheme()));
            suspicious.setCompoundDrawables(getResources().getDrawable(R.drawable.ic_warning, getTheme()), null, null, null);
            suspicious.setCompoundDrawableTintList(getColorStateList(R.color.danger));
        } else {
            suspicious.setTextColor(getResources().getColor(R.color.success, getTheme()));
        }

        if(phishingAnalyze.isAdult()) {
            adult.setTextColor(getResources().getColor(R.color.danger, getTheme()));
            adult.setCompoundDrawables(getResources().getDrawable(R.drawable.ic_warning, getTheme()), null, null, null);
            adult.setCompoundDrawableTintList(getColorStateList(R.color.danger));
        } else {
            adult.setTextColor(getResources().getColor(R.color.success, getTheme()));
        }
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