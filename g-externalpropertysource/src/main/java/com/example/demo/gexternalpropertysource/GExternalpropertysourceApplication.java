package com.example.demo.gexternalpropertysource;

import com.example.demo.gexternalpropertysource.model.FakeDataSource;
import com.example.demo.gexternalpropertysource.usingenv.AnotherDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@SpringBootApplication
//@PropertySource("classpath:datasource.properties")
/*@PropertySources({
		@PropertySource("classpath:datasource.properties"),
		@PropertySource("classpath:datasource1.properties")
})*/
@PropertySource({"classpath:datasource.properties","classpath:datasource1.properties"})
public class GExternalpropertysourceApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(GExternalpropertysourceApplication.class, args);
		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUser());
		AnotherDataSource anotherDataSource = ctx.getBean(AnotherDataSource.class);
		System.out.println(anotherDataSource.getPassword());

	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer properties(){
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =new PropertySourcesPlaceholderConfigurer();
		return  propertySourcesPlaceholderConfigurer;
	}

}
