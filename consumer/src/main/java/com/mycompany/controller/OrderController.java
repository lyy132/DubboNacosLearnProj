package com.mycompany.controller;
import com.mycompany.common.Result.Result;
import com.mycompany.common.entity.Order;
import com.mycompany.common.service.OrderService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @DubboReference(interfaceClass = OrderService.class)
    private OrderService orderService;

    @PostMapping("/create_order/{id}")
    public Result createOrder(@PathVariable int id) {
        Order order = orderService.createOrder();
        order.setId(id);
        return Result.success(order);
    }
}
