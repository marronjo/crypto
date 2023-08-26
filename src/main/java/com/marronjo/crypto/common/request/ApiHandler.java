package com.marronjo.crypto.common.request;

import lombok.RequiredArgsConstructor;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RequiredArgsConstructor
public class ApiHandler {

    private final RestTemplate restTemplate;

    public <T> T doGet(String path, Map<String, String> headers){
        return null;
    }

    public <T> T doPost(String path, T data, MultiValueMap<String, String> headers){
        return null;
    }

    public <T> T doPut(String path, T data, MultiValueMap<String, String> headers){
        return null;
    }

    public <T> T doDelete(String path, T data, MultiValueMap<String, String> headers){
        return null;
    }

}
