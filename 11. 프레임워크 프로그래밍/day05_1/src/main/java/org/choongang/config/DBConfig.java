package org.choongang.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import org.apache.tomcat.jdbc.pool.DataSource;

@Configuration
//@EnableTransactionManagement
//@MapperScan("org.choongang")
//@EnableJdbcRepositories("org.choongang")
public class DBConfig /*extends AbstractJdbcConfiguration */ {

    @Bean
    public DataSource dataSource() {
        DataSource ds = new DataSource();
        
        /* 연결 설정 S */
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
        ds.setUsername("SPRING");
        ds.setPassword("oracle");
        /* 연결 설정 E */

        /* 커넥션 풀 설정 S */
        ds.setInitialSize(2);
        ds.setMaxActive(10);
        ds.setTestWhileIdle(true);
        ds.setTimeBetweenEvictionRunsMillis(10 * 1000);
        ds.setMinEvictableIdleTimeMillis(1000 * 60);
        /* 커넥션 풀 설정 E */

        return ds;
    }
}
