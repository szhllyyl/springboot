package com.test.szh.service.impl;

import com.test.szh.service.GenericTable;
import com.test.szh.util.GenericTableUtils;
import groovy.lang.GroovyClassLoader;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.classloading.internal.ClassLoaderServiceImpl;
import org.hibernate.boot.registry.classloading.spi.ClassLoaderService;
import org.hibernate.service.ServiceRegistry;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author songzehui
 * @email <a href="mailto:songzehui@gtmap.cn">Email To</a>
 * @date 2020/12/10 15:25
 * @desc com.test.szh.service.impl:
 */
@Service
public class GenericTableImpl implements GenericTable {
    @Override
    public void createTable() {
        Map<String,Object> properties = new ConcurrentHashMap<>();
        properties.put("hibernate.connection.driver_class","com.mysql.cj.jdbc.Driver");
        properties.put("hibernate.connection.url","jdbc:mysql://192.168.2.139:3306/test?useUnicode=true&characterEncoding=utf-8&characterEncoding=utf8&autoReconnect=true&allowMultiQueries=true&serverTimezone=GMT%2b8");
        properties.put("hibernate.connection.username","root");
        properties.put("hibernate.connection.password","root");
        properties.put("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
        properties.put("hibernate.hbm2ddl.auto", "update");
        properties.put("show_sql", true);
        properties.put("format_sql", false);
        properties.put("current_session_context_class", "thread");
        properties.put("hibernate.connection.pool_size", 100);
        properties.put("hibernate.connection.isolation", 2);
        GroovyClassLoader groovyClassLoader = new GroovyClassLoader();
        StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(properties)
                .addService(ClassLoaderService.class, new ClassLoaderServiceImpl(groovyClassLoader))
                .build();
        Metadata metadata  = new MetadataSources(standardServiceRegistry)
                .addAnnotatedClass(GenericTableUtils.genericClass()[0])
                .buildMetadata();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder()
                .build();
    }
}
