package com.example.minjectingcollections.simplecollections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
public class CollectionOfBean {

   @Bean
   public List<String> listBean(){
      List<String> list = new ArrayList<> ();
      list.add ( "list1" );
      list.add ( "list2" );
      return list;
   }
   @Bean
   public Set<String> setBean(){
      Set<String> set = new HashSet<> ();
      set.add ( "set1" );
      set.add ( "set2" );
      return set;
   }

   @Bean
   public Map<Integer,String> mapBean(){
      Map<Integer,String> map = new HashMap<> ();
      map.put ( 1,"map1" );
      map.put ( 2,"map2" );
      return map;
   }
}
