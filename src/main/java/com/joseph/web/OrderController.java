package com.joseph.web;

import com.joseph.entity.Customer;
import com.joseph.entity.Order;
import com.joseph.entity.Product;
import com.joseph.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {
    private static final Logger LOG = LoggerFactory.getLogger(OrderController.class);
    @Autowired
    private OrderService orderService;
    @GetMapping("/list")
    public String listProducts(Model theModel) {
        List<Order> theOrderss = orderService.getOrders();
        theModel.addAttribute("orders", theOrderss);
        System.out.println("mou");
        return "list-orders";
    }
    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        LOG.debug("inside show order-form handler method");
        Order theOrder = new Order();
        theModel.addAttribute("order", theOrder);
        return "order-form";
    }
    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("orderId") Long theId,
                                    Model theModel) throws NullPointerException {
        Order theOrder = orderService.getOrder(theId);
        theModel.addAttribute("order", theOrder);
        return "order-form";
    }
    @PostMapping("/saveOrder")
    public String saveOrder(@ModelAttribute("order") Order theOrder) {
       return "redirect:/order/list";
    }

    @GetMapping("/delete")
    public String deleteOrder(@RequestParam("orderId") Long theId) throws NullPointerException {
        orderService.deleteOrder(theId);
        return "redirect:/order/list";
    }
}
