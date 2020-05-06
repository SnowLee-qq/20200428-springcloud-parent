package com.aaa.lwt.springcloud.service;

import com.aaa.lwt.springcloud.fallback.FallBackService;
import com.aaa.lwt.springcloud.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Classname IBookService
 * @Description 使用feign时的consumer项目的service层，用于调用provider项目的controller层
 * @Date 2020/5/6 9:45
 * @Created by Snow Lee
 */
/*单独使用feign时的注解*/
//@FeignClient(value = "book-provider")

//加上熔断之后的feign注解
@FeignClient(value = "book-provider", fallbackFactory = FallBackService.class)
public interface IBookService {

    /**
     *
     * @Description 调用provider项目中的controller层的方法
     *      注意：在api项目中，只能有一个接口去调用provider项目中的controller层的方法，不支持
     *      多个接口去调用多个controller层方法，一个接口内写所有的controller层方法。
     *           接口的返回值，方法名，参数必选要和controller层的方法完全一致
     *           必须有GetMapping,PostMapping等和其路径
     *           不要忘记添加@FeignClienta(value = "provider内配置在eureka中所显示Application的名称")
     * @param
     * @return
     * @date 2020/5/6 9:48
     * @auther Snow Lee
     */
    @GetMapping("/all")
    List<Book> selectAllBooks();
}
