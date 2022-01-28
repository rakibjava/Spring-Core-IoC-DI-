package com.example.jprototypebean.usingLookupMethod;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class MySingletonBean {

    public String showMessage(){
        MyPrototypeBean bean = getPrototypeBean();
        return bean.getDateTime();
    }

    public String showMessage1(String name, int age){
        MyPrototypeBean bean = getPrototypeBean1(name,age);
        return bean.getNameAge ();
    }

    public String showMessage3(String name, int age){
        MyPrototypeBean bean = getPrototypeBean();
        bean.setName ( name );
        bean.setAge ( age );
        return bean.getName () + bean.getAge ();
    }


    @Lookup(value = "prototypeBean") // return MyPrototypeBean instance with parameterized constructor
    public MyPrototypeBean getPrototypeBean1(String name, int age){
        return null;
    }

    @Lookup(value = "prototypeBean")
    public MyPrototypeBean getPrototypeBean(){ // return MyPrototypeBean instance with default constructor
        return null;
    }
}