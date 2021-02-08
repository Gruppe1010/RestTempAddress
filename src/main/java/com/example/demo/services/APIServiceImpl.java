package com.example.demo.services;

import com.example.Address;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class APIServiceImpl implements APIService
{

    private RestTemplate restTemplate;

    String url = "https://dawa.aws.dk/autocomplete?caretpos=5&fuzzy=&q=skovledet&startfra=adresse&type=adresse";


    public APIServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Address> getAddresses(Integer limit)
    {
        List<Address> addresses = new ArrayList<>();

        try
        {
            // ResponseEntity-obj == indeholder http-header, body og status
            // ResponseEntity<List<Address>> addressResponse == Vi vil have en response tilbage,
            // som indeholder en List af Address-objekter
            // exchange()-metode ==
            // den gør serialiseringen for os
            ResponseEntity<List<Address>> addressResponse =
                    restTemplate.exchange(url, HttpMethod.GET, null,
                            new ParameterizedTypeReference<List<Address>>(){});

            addresses = addressResponse.getBody();

        }
        catch (Exception e)
        {
            System.err.println("Error in getAddresses: " + e.getMessage());
        }


        return addresses;
    }
}
