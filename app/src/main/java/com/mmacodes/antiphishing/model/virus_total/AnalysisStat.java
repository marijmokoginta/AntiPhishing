package com.mmacodes.antiphishing.model.virus_total;

public class AnalysisStat {
    private int harmless;
    private int malicious;
    private int suspicious;
    private int undetected;
    private int timeout;

    public int getHarmless() {
        return harmless;
    }

    public void setHarmless(int harmless) {
        this.harmless = harmless;
    }

    public int getMalicious() {
        return malicious;
    }

    public void setMalicious(int malicious) {
        this.malicious = malicious;
    }

    public int getSuspicious() {
        return suspicious;
    }

    public void setSuspicious(int suspicious) {
        this.suspicious = suspicious;
    }

    public int getUndetected() {
        return undetected;
    }

    public void setUndetected(int undetected) {
        this.undetected = undetected;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    @Override
    public String toString() {
        return "AnalysisStat{" +
                "harmless=" + harmless +
                ", malicious=" + malicious +
                ", suspicious=" + suspicious +
                ", undetected=" + undetected +
                ", timeout=" + timeout +
                '}';
    }
}
