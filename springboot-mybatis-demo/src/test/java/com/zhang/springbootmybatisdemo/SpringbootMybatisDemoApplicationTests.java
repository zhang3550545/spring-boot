package com.zhang.springbootmybatisdemo;

import com.zhang.springbootmybatisdemo.util.RemoteShellExecutor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisDemoApplicationTests {

    @Test
    public void contextLoads() {

    }

    public static void main(String[] args) {
        try {
            RemoteShellExecutor executor = new RemoteShellExecutor("ip", "root", "123456");
            executor.exec("/Users/zhangzhiqiang/Documents/my_projects/bdexample/springboot-mybatis-demo/apidoc.sh");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
