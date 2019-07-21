package com.beiwosi.guangzhou;

import com.beiwosi.guangzhou.modal.entity.GoodsEntity;
import com.beiwosi.guangzhou.modal.repo.GoodsEntityRepository;
import com.beiwosi.guangzhou.modal.vo.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GuangzhouApplicationTests {

    @Value("${hello.world}")
    private String hello;

    @Autowired
    Person person;

    @Autowired
    GoodsEntityRepository goodsEntityRepository;

    @Test
    public void contextLoads() {
        System.out.println(hello);
        System.out.println(person);
        List<GoodsEntity> all = goodsEntityRepository.findAll();
        for (GoodsEntity goodsEntity: all) {
            System.out.println(goodsEntity);
        }
        System.out.println(all);
    }

}
