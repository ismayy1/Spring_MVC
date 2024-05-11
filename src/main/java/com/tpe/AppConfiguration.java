package com.tpe;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //this class will be responsible for configuration
@ComponentScan("com.tpe") //scans all classes in the same level packages
//by default it will scan all classes in the same package, but we can also customize
public class AppConfiguration {
}