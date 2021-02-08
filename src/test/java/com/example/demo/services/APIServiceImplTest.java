package com.example.demo.services;

import com.example.Address;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

// HVORFOR skriver vi denne annotation? hvad gør den?
@SpringBootTest
class APIServiceImplTest
{

    // hvad fuck sker der lige her?
    @Autowired
    APIService apiService;

    @Test
    void getAddresses()
    {
        List<Address> addressList




    }
}