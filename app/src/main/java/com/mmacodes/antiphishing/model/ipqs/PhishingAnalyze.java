package com.mmacodes.antiphishing.model.ipqs;

public class PhishingAnalyze {
    private String message;
    private boolean success;
    private boolean unsafe;
    private String domain;
    private String ip_address;
    private String server;
    private String content_type;
    private int status_code;
    private int page_size;
    private int domain_rank;
    private boolean dns_valid;
    private boolean parking;
    private boolean spamming;
    private boolean malware;
    private boolean phishing;
    private boolean suspicious;
    private boolean adult;
    private int risk_score;
    private String category;
    private DomainAge domain_age;
    private String request_id;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean isUnsafe() {
        return unsafe;
    }

    public void setUnsafe(boolean unsafe) {
        this.unsafe = unsafe;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getContent_type() {
        return content_type;
    }

    public void setContent_type(String content_type) {
        this.content_type = content_type;
    }

    public int getStatus_code() {
        return status_code;
    }

    public void setStatus_code(int status_code) {
        this.status_code = status_code;
    }

    public int getPage_size() {
        return page_size;
    }

    public void setPage_size(int page_size) {
        this.page_size = page_size;
    }

    public int getDomain_rank() {
        return domain_rank;
    }

    public void setDomain_rank(int domain_rank) {
        this.domain_rank = domain_rank;
    }

    public boolean isDns_valid() {
        return dns_valid;
    }

    public void setDns_valid(boolean dns_valid) {
        this.dns_valid = dns_valid;
    }

    public boolean isParking() {
        return parking;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public boolean isSpamming() {
        return spamming;
    }

    public void setSpamming(boolean spamming) {
        this.spamming = spamming;
    }

    public boolean isMalware() {
        return malware;
    }

    public void setMalware(boolean malware) {
        this.malware = malware;
    }

    public boolean isPhishing() {
        return phishing;
    }

    public void setPhishing(boolean phishing) {
        this.phishing = phishing;
    }

    public boolean isSuspicious() {
        return suspicious;
    }

    public void setSuspicious(boolean suspicious) {
        this.suspicious = suspicious;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public int getRisk_score() {
        return risk_score;
    }

    public void setRisk_score(int risk_score) {
        this.risk_score = risk_score;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public DomainAge getDomain_age() {
        return domain_age;
    }

    public void setDomain_age(DomainAge domain_age) {
        this.domain_age = domain_age;
    }

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    @Override
    public String toString() {
        return "PhishingAnalyze{" +
                "message='" + message + '\'' +
                ", success=" + success +
                ", unsafe=" + unsafe +
                ", domain='" + domain + '\'' +
                ", ipAddress='" + ip_address + '\'' +
                ", server='" + server + '\'' +
                ", contentType='" + content_type + '\'' +
                ", statusCode=" + status_code +
                ", pageSize=" + page_size +
                ", domainRank=" + domain_rank +
                ", dnsValid=" + dns_valid +
                ", parking=" + parking +
                ", spamming=" + spamming +
                ", malware=" + malware +
                ", phishing=" + phishing +
                ", suspicious=" + suspicious +
                ", adult=" + adult +
                ", riskScore=" + risk_score +
                ", category='" + category + '\'' +
                ", domainAge=" + domain_age +
                ", requestId='" + request_id + '\'' +
                '}';
    }
}
