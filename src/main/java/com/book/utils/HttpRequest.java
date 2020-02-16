package com.book.utils;

public class HttpRequest {
    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    private String success;

    public static HttpRequest success(){
        HttpRequest httpRequest = new HttpRequest();
        httpRequest.setSuccess("true");
        return httpRequest;
    }
    public static HttpRequest error(){
        HttpRequest httpRequest = new HttpRequest();
        httpRequest.setSuccess("false");
        return httpRequest;
    }
}
