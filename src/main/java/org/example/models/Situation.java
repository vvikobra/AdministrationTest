package org.example.models;

public class Situation {
    private final String id;
    private String situation;
    private String request;

    public Situation(String id, String situation, String request) {
        this.id = id;
        this.situation = situation;
        this.request = request;
    }

    public String getId() {
        return id;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }
}
