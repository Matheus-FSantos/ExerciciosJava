package br.com.spring.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Target(ElementType.TYPE) //Para classes
@Retention(RetentionPolicy.RUNTIME)
@Configuration
@Profile("development")
public @interface Development {

}