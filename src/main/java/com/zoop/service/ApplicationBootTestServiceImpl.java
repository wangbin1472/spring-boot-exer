package com.zoop.service;


import org.springframework.stereotype.Service;

@Service
public class ApplicationBootTestServiceImpl implements ApplicationBootTestService {
    @Override
    public void printData() {

        System.out.println("ApplicationBootTestServiceImpl.printData()");
    }
}
