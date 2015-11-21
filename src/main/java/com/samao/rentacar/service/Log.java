package com.samao.rentacar.service;

import java.lang.annotation.*;

/**
 * Created by hsamao on 11/21/15.
 */

@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
}
