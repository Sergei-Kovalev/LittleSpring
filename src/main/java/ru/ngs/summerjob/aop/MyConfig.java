package ru.ngs.summerjob.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("ru.ngs.summerjob.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
