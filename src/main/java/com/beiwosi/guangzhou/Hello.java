package com.beiwosi.guangzhou;

import com.beiwosi.guangzhou.modal.entity.GoodsEntity;
import com.beiwosi.guangzhou.modal.repo.GoodsEntityRepository;
import com.beiwosi.guangzhou.util.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class Hello {
    @Autowired
    GoodsEntityRepository goodsEntityRepository;

    @RequestMapping(value = "/hello")
    public BaseResponse hello(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        System.out.println("hello");
        Map<String, String> map = new HashMap<>();
        map.put("name", "zhangzhen");
        map.put("age", "18");
        List<GoodsEntity> list = goodsEntityRepository.findAll();
        Cookie cookie = new Cookie("test", "zhangzhen");
        cookie.setHttpOnly(true);
        cookie.setPath("/");
        cookie.setMaxAge(5000);
        httpServletResponse.addCookie(cookie);

//        System.out.println(goodsEntityRepository.findById(2));
//        Optional goodsEntity = goodsEntityRepository.findById(2);
        return BaseResponse.success(list);
    }

    @RequestMapping(value = "/login")
    public BaseResponse login() {
        System.out.println("login");
        BaseResponse baseResponse = BaseResponse.error();
        baseResponse.setData("登录失败");
        return baseResponse;
    }
}
