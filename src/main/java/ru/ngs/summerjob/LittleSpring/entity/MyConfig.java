package ru.ngs.summerjob.LittleSpring.entity;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.ngs.summerjob.LittleSpring.entity")
@PropertySource({"myApp.properies"})
public class MyConfig {
}
