IoC is also known as dependency injection (DI). It is a process whereby objects define their dependencies (that is, the other objects they work with) 
only through constructor arguments, arguments to a factory method, or properties that are set on the object instance after it is constructed or returned 
from a factory method. The container then injects those dependencies when it creates the bean

Spring IoC container and is responsible for instantiating, configuring, and assembling the beans. The container gets its instructions on what objects 
to instantiate, configure, and assemble by reading configuration metadata. The configuration metadata is represented in XML, Java annotations,
or Java code. It lets you express the objects that compose your application and the rich interdependencies between those objects.

The following diagram shows a high-level view of how Spring works. Your application classes are combined with configuration metadata so that,
after the ApplicationContext is created and initialized, you have a fully configured and executable system or application.

![img.png](img.png)

As the preceding diagram shows, the Spring IoC container consumes a form of configuration metadata. This configuration metadata 
represents how you, as an application developer, tell the Spring container to instantiate, configure, and assemble the objects in your application.

## **Configuration Metadata:**
 
@Configuration and @Bean

The basic structure of creating bean with @Configuration and @Bean

    @Configuration
    public class BeanConfig {
        @Bean
        public SomeBean someBean() {
            // instantiate, configure and return bean instance ...
            return new SomeBeanImpl();
        }
    }

Multiple` @Configuration`:

    @Configuration
    public class DataSourceConfig {
        @Bean
        DataSourceBean dataSourceBean() {
            return new DataSourceBean();
        }
    }        
    
    @Configuration
    public class Client {
        @Autowired
        private DataSourceBean dataSourceBean;
        public void showData() {
            System.out.println(dataSourceBean.getData());
        }
    }
        
 @Import: Import annotation will allow for loading `@Bean` definitions into a single class from another configuration class if class define @Configuration and Bean 
 
 In Spring boot `@SpringBootApplication` will use` @Configuration, @EnableAutoConfiguration, and @ComponentScan` implicitly so all the @Configuration @Bean and along with
 `@Component, @Repository, @Service, @Controller, @RestController` are automatically detected as spring component. But Default it uses application class path packages to detect all component.
 If configuration/component are defined in outside class path then needs to override the `@ComponentScan` to detect all bean like `@ComponentScan(basePackages = {"com.test"})`
   
    package com.test;
    @Configuration
    @Import({BirdConfig.class, FishConfig.class})
    public class BeanCollection {
      @Bean ("dogConfig")
      public String getDog() {
          return "returned goldfish";
      }
    }
    All the bean defined in the BirdConfig.class and FishConfig.class will be available through this BeanCollection class with dogConfig bean.

    package com.example;
    @SpringBootApplication
    //@ComponentScan(basePackages = {"com.test"}) 
    @Import({BeanCollection.class})
    public class SpringbootMainApplication {
       ApplicationContext ctx= SpringApplication.run(SpringbootMainApplication.class, args);
       BirdConfig birdConfig  = ctx.getBean("bird"); // bird bean defined in the BirdConfig.class
    }

    This main application is com.example package but  BeanCollection class is in com.test package so to get bean from BeanCollection we can @ComponentScan or @Import like above
    @SpringBootApplication will automatically be scanned  all the bean and no need to use @Import annotation.But in some cases, 
    we want to scan only selected @Configuration classes and in this case @Import is useful or if it is outside the classpathpackages
    
