/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author ncontractor
 */
@Configuration
//@ComponentScan.Filter(type= FilterType.ANNOTATION, value=DatabaseApplicationConfig.class)
@ComponentScan(basePackages={"com.techdhoom.socialstudent.database"})
@EnableTransactionManagement
@PropertySource({"jdbc.properties"})
public class DatabaseApplicationConfig {

    @Autowired
    Environment env;
    
    @Bean
    public DataSource dataSourceSocialStudent() {
        System.out.println("\n\t-->");
//        DataSource dataSrc = new DriverManagerDataSource(env.getProperty("jdbc.driverClassName"), env.getProperty("jdbc.url"), env.getProperty("jdbc.username"), env.getProperty("jdbc.password"));
        DataSource dataSrc = new DriverManagerDataSource("org.postgresql.Driver","jdbc:postgresql://localhost:5432/socialstudent","postgres","manan");
        System.out.println("ds created.........................");
        System.out.println("\n\t-+->+"+dataSrc);
        return dataSrc;
    }
    
    @Bean
    public AnnotationSessionFactoryBean sessionFactorySocialStudent() {
        AnnotationSessionFactoryBean annotationBean = new AnnotationSessionFactoryBean();
        annotationBean.setDataSource(dataSourceSocialStudent());
        annotationBean.setSchemaUpdate(true);
        annotationBean.setPackagesToScan(new String[] {"com.techdhoom.socialstudent.model"});
        Properties props = new Properties();
        InputStream in = getClass().getResourceAsStream("/hibernate.properties");
        try {
            props.load(in);
        } catch (IOException ex) {
            System.out.println("got error......................");
            Logger.getLogger(DatabaseApplicationConfig.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        System.out.println("\n\t++++"+props.getProperty("hibernate.dialect"));
        annotationBean.setHibernateProperties(props);
        System.out.println("sf created........................");
        System.out.println("\n\t-a-->"+annotationBean);
        return annotationBean;
    }
    
    @Bean
    public HibernateTemplate hibernateTemplate() throws Exception {
        AnnotationSessionFactoryBean annotationSessionFactoryBean = sessionFactorySocialStudent();
        annotationSessionFactoryBean.afterPropertiesSet();
        System.out.println("\n\t+++b=="+annotationSessionFactoryBean.getObject());
        HibernateTemplate ht = new HibernateTemplate(annotationSessionFactoryBean.getObject());
        System.out.println("ht created..........................");
        return ht;
    }
    
    @Bean
    public HibernateTransactionManager transactionManager() {
        HibernateTransactionManager htm = new HibernateTransactionManager(sessionFactorySocialStudent().getObject());
        System.out.println("htm created...........................");
        return htm;
    }
    
}
