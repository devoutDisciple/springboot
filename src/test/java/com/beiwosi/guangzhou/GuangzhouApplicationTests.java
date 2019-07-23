package com.beiwosi.guangzhou;

import com.beiwosi.guangzhou.modal.repo.GoodsEntityRepository;
import com.beiwosi.guangzhou.modal.vo.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GuangzhouApplicationTests {

    @Autowired
    Person person;

    @Autowired
    GoodsEntityRepository goodsEntityRepository;

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
