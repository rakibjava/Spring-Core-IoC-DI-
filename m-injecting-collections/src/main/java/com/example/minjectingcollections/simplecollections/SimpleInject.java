package com.example.minjectingcollections.simplecollections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
public class SimpleInject {

   private final List<String> listBean;
   private final Set<String>  setBean;
   private final Map<Integer,String> mapBean;

   @Autowired
   public SimpleInject (List<String> listBean, Set<String> setBean, Map<Integer, String> mapBean) {
      this.listBean = listBean;
      this.setBean = setBean;
      this.mapBean = mapBean;
   }
   public List<String> getList(){
      return listBean;
   }
   public Set<String> getSet(){
      return setBean;
   }
   public Map<Integer,String> getMap(){
      return mapBean;
   }

}
