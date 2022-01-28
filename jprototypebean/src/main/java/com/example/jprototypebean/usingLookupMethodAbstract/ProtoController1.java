package com.example.jprototypebean.usingLookupMethodAbstract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abs")
public class ProtoController1 {

   private final SingletonModel singletonModel;

   @Autowired
   public ProtoController1 (SingletonModel singletonModel) {
      this.singletonModel = singletonModel;
   }

   @GetMapping("/test/{name}")
   public String getName1(@PathVariable ("name") String name){
      return singletonModel.byDefaultConstructor ( name );
   }

   @GetMapping("/test1/{name}")
   public String getName2(@PathVariable ("name") String name){
      return singletonModel.byParameterizedConstructor ( name );
   }
}
