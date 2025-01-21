package com.tech.sii.demo.DL;

public class DataLayerBase {
    private String status;
    private String message;

    public String getStatus() {
        return this.status;
    }
    public String getMessage() {
        return this.message;
    }

    void setStatus(String status) {
        this.status = status;
    };
    void setMessage(String message) {
        this.message = message;
    };
}
