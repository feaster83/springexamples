package edu.feaster83.springexamples;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "edu.feaster83")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ZooAppConfig {
}
