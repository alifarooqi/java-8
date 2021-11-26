package com.company.exceptions;

public class NetworkException extends Exception {
    private String hostname;
    private String env;
    private String dc;

    public NetworkException(String hostname, String env, String dc){
        super("This is a Network Exception with hostname: " + hostname + " on environment: " + env);
        this.hostname = hostname;
        this.env = env;
        this.dc = dc;
    }

    public String getHostname() {
        return hostname;
    }

    public String getEnv() {
        return env;
    }
}
