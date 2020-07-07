package com.example.demo.Service;

import com.example.demo.Pra.Par;

@org.springframework.stereotype.Service
public class Service {

    public String service(Par par){

        return par.getNum1() + par.getNum2();
    }
}
