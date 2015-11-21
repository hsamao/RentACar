package com.samao.rentacar.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by hsamao on 11/20/15.
 */

@Component
public class MainService {

    @Log
    public void rent(){
        System.out.println("Main Service called");
    }
}
