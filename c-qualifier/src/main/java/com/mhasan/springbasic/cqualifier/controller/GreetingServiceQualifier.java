package com.mhasan.springbasic.cqualifier.controller;

import com.mhasan.springbasic.cqualifier.service.ConstructorGreetingService;
import com.mhasan.springbasic.cqualifier.service.GetterGreetingService;
import com.mhasan.springbasic.cqualifier.service.PropertyGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component ("greetingQualifier")
public class GreetingServiceQualifier {

   private final PropertyGreetingService propertyGreetingService;
   private final GetterGreetingService getterGreetingService;
   private final ConstructorGreetingService constructorGreetingService;

   @Autowired
   public GreetingServiceQualifier (@Qualifier("property") PropertyGreetingService propertyGreetingService,
                                    @Qualifier("gettersetter") GetterGreetingService getterGreetingService,
                                    @Qualifier("constructor") ConstructorGreetingService constructorGreetingService) {
      this.propertyGreetingService = propertyGreetingService;
      this.getterGreetingService = getterGreetingService;
      this.constructorGreetingService = constructorGreetingService;
   }

   public String sayProperty(){
      return propertyGreetingService.sayGreeting ();
   }
   public String sayGetter(){
      return getterGreetingService.sayGreeting ();
   }
   public String sayConstructor(){
      return constructorGreetingService.sayGreeting ();
   }
}
