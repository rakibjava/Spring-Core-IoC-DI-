package com.custompackage.config;

public class MySpringBean {
    private void onInitialize() {
        System.out.println("initialize");
    }

    private void onDestroy() {
        System.out.println("Destroy");
    }
}
