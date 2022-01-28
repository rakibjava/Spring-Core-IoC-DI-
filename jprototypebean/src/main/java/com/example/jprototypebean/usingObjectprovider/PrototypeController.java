package com.example.jprototypebean.usingObjectprovider;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/op")
public class PrototypeController {

   final ObjectProvider<BeanProtoType> protoProvider;

   @Autowired
   public PrototypeController (ObjectProvider<BeanProtoType> protoProvider) {
      this.protoProvider = protoProvider;
   }

   @GetMapping("/{name}/{age}")
   public String getProto(@PathVariable("name") String name, @PathVariable("age") int age){
      // Here this BeanProtoType is prototype scope and this invokes BeanProtoType constructor
      BeanProtoType prototypeBean = protoProvider.getObject (name, age);

      return prototypeBean.getName ()+ " " + prototypeBean.getAge ()+
              " with hashCode for class"+System.identityHashCode(prototypeBean);
   }
}
