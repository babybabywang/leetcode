package bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author huang
 * @PACKAGE_NAME bean
 * @PROJECT_NAME leetcodetest
 * @date 2019/3/26
 */
@Configuration
public class MvcConfig {
    @Bean
    public Test test(){
        return new Test();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ant = new AnnotationConfigApplicationContext(MvcConfig.class);
        ant.getBean(Test.class);
    }
}
