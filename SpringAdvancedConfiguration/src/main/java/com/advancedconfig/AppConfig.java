package com.advancedconfig;

import com.advancedconfig.util.CalenderFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import java.util.Calendar;

@Configuration
@ComponentScan({"com.advancedconfig"})
public class AppConfig {
    @Bean(name = "cal")
    public CalenderFactory calFactory() {
        CalenderFactory factory = new CalenderFactory();
        factory.addDays(2);
        return factory;
    }

    @Bean
    public Calendar cal() throws Exception{
        return calFactory().getObject();
    }

}
