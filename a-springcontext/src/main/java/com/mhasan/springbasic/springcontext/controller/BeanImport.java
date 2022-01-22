package com.mhasan.springbasic.springcontext.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({BeanImport.class,MyController.class})
public class BeanImport {
}
