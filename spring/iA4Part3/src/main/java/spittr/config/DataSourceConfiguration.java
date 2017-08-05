package spittr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Component
public class DataSourceConfiguration {
    private DriverManagerDataSource ds;

    @Bean
    public DriverManagerDataSource dataResource() {
        ds = new DriverManagerDataSource();
        ds.setDriverClassName("org.h2.Driver");
        ds.setUrl("jdbc:h2:tcp://localhost/~/spittr");
        ds.setUsername("sa");
        ds.setPassword("");
        return ds;
    }
}
