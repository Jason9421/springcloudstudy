package com.bespin.service.feign.controller;

import com.bespin.service.feign.service.SchedualServiceHi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HiController {

    //如果使用@Autowired 编译器报错，无碍。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错
    //使用@Resource可以解决这个问题
    @Resource
    SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
