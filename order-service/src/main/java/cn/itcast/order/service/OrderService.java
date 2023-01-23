package cn.itcast.order.service;

import cn.itcast.order.client.UserClient;
import cn.itcast.order.mapper.OrderMapper;
import cn.itcast.order.pojo.Order;
import cn.itcast.order.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private UserClient userClient;
    /**
     * 注入RestTemplate
     */
    //@Autowired
    //private RestTemplate restTemplate;

    public Order queryOrderById(Long orderId) {
        // 1.查询订单
        Order order = orderMapper.findById(orderId);
        //// 2.url
        //String url = "http://userservice/user/"+order.getUserId();
        //// 3.使用restTemplate---user
        //User user = restTemplate.getForObject(url, User.class);
        //使用feign发起http的请求
        User user = userClient.findById(order.getUserId());
        // 4.返回
        order.setUser(user);
        return order;
    }
}
