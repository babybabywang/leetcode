package bean;

import javax.annotation.PostConstruct;

/**
 * @author huang
 * @PACKAGE_NAME bean
 * @PROJECT_NAME leetcodetest
 * @date 2019/3/26
 */
public class Test {
    public Test() {
        System.out.println("test");
    }
    @PostConstruct
    public void init(){
        System.out.println("init");
    }
}
