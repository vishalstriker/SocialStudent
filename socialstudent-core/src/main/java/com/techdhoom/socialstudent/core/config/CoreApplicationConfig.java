/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.core.config;

import com.techdhoom.socialstudent.database.config.DatabaseApplicationConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 *
 * @author ncontractor
 */
@Configuration
@ComponentScan(basePackages={"com.techdhoom.socialstudent"})
//@ComponentScan.Filter(type= FilterType.ANNOTATION, value=CoreApplicationConfig.class)
@Import(DatabaseApplicationConfig.class)
@ImportResource("classpath:cache-context.xml")
public class CoreApplicationConfig {
    
}
