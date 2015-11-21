package com.samao.rentacar.service.test;

import com.samao.rentacar.service.MainService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by hsamao on 11/20/15.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/rentacar-service.xml"})
public class RentACarServiceTest {

    @Autowired
    private MainService mainService;

    @Test
    public void testLoggerAspect(){
        mainService.rent();
    }
}
