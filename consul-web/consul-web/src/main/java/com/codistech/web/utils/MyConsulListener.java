/**
 * 
 */
package com.codistech.web.utils;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.consul.serviceregistry.ConsulAutoServiceRegistration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

/**
 * @author soumya
 *
 */
@EnableAutoConfiguration
@Configuration
public class MyConsulListener implements ApplicationContextAware {

    @Autowired(required=false)
    private ConsulAutoServiceRegistration registration;

    public void setApplicationContext(ApplicationContext context) throws BeansException {
        if (registration != null){
            registration.start();
        }
    }
}
