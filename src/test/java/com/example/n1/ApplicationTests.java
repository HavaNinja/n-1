package com.example.n1;

import com.example.n1.entity.Order;
import com.example.n1.entity.User;
import com.example.n1.repo.OrderRepo;
import com.example.n1.repo.UserRepo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.UUID;

@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional
class ApplicationTests {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private OrderRepo orderRepo;

    @Test
    void shouldMake4SelectCalls() {
        Order o1 = new Order();
        o1.setId(UUID.randomUUID());
        orderRepo.save(o1);

        Order o2 = new Order();
        o2.setId(UUID.randomUUID());
        orderRepo.save(o2);

        Order o3 = new Order();
        o3.setId(UUID.randomUUID());
        orderRepo.save(o3);

        User u = new User();

        u.setId(UUID.randomUUID());

        u.setOrders(Arrays.asList(o1, o2, o3));

        userRepo.save(u);

        userRepo.findAll();


    }

}
