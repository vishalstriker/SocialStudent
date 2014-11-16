/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.web.config;

import com.techdhoom.socialstudent.core.config.CoreApplicationConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * This is the configuration class for Spring.
 * @author mpritmani
 */
@Configuration
@Import(CoreApplicationConfig.class)
@ImportResource({"classpath:usermanagement-core-context.xml", "/WEB-INF/socialstudent-security-context.xml", "/WEB-INF/jcaptcha-context.xml"})
//@ImportResource({"classpath:usermanagement-core-context.xml", "/WEB-INF/socialstudent-security-context.xml", "classpath:internationalization-core-context.xml", "/WEB-INF/jcaptcha-context.xml", "classpath:email-core-context.xml", "classpath:scheduler-core-context.xml"})
@ComponentScan(basePackages = {"com.techdhoom.socialstudent"})
public class WebApplicationConfig {
}
