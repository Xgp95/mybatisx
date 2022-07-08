package com.mybatisplus.mybatisx;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mybatisplus.mybatisx.bean.Product;
import com.mybatisplus.mybatisx.bean.User;
import com.mybatisplus.mybatisx.mapper.ProductMapper;
import com.mybatisplus.mybatisx.mapper.UserMapper;
import com.mybatisplus.mybatisx.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisxApplicationTests {

    @Autowired
    ProductMapper productMapper;

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {

        Product product = productMapper.selectAllById(1l);
        System.out.println(product);
    }

    @Test
    void selectPageTest() {
        Page<User> userPage = new Page<>(2, 10);
        userMapper.selectPage(userPage, new LambdaQueryWrapper<User>().eq(User::getAge, 20));
        long pages = userPage.getPages();
        long current = userPage.getCurrent();
        long total = userPage.getTotal();
        List<User> records = userPage.getRecords();
        for (User record : records) {
            System.out.println(record);
        }
        System.out.println("当前页" + current);
        System.out.println("总共" + pages + "页");
        System.out.println("总共" + total + "条记录");
    }

}
