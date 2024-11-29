package com.srikar.Spring1.config;

import com.srikar.Spring1.Alien;
import com.srikar.Spring1.Computer;
import com.srikar.Spring1.Desktop;
import com.srikar.Spring1.Laptop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

//This class will replace XML config
//Annotation to make this class a config

@Configuration
@ComponentScan("com.srikar.Spring1")
public class AppConfig {
	
//	/* 
//	 * @Bean(name = {"com1", "Beast", "desktop1"} ) 
//	 *  @Scope(value="prototype")
//	 */
//	
//	@Bean
//	public Desktop desktop() {
//		return new Desktop();
//	}
//	
//	@Bean
//	@Primary
//	public Laptop laptop() {
//		return new Laptop();
//	}
//	
//	
//	
//	
//	//comp obj autowires itself with classes which extend computer
//	@Bean
//	// (@Qualifier("desktop") 
//	public Alien alien (Computer comp) {
//		Alien obj= new Alien();
//		obj.setAge(45);
//		obj.setComp(comp);
//		return obj;
//	}
}
