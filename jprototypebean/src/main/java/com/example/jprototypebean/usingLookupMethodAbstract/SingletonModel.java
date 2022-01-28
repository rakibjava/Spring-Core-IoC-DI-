package com.example.jprototypebean.usingLookupMethodAbstract;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class SingletonModel {

   public String byDefaultConstructor(String name){
      PrototypeModel prototypeModel = getProtoObject ();
      prototypeModel.setName ( name );
      return prototypeModel.action ();
   }
   public String byParameterizedConstructor(String name){
      PrototypeModel prototypeModel = getProtoObject (name);
      return prototypeModel.action ();
   }

   @Lookup
   abstract PrototypeModel getProtoObject();

   @Lookup
   abstract PrototypeModel getProtoObject(String name);
}
