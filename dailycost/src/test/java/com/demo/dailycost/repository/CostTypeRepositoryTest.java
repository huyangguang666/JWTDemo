package com.demo.dailycost.repository;

import com.demo.dailycost.domain.CostType;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class CostTypeRepositoryTest {

    @Autowired
    private CostTypeRepository costTypeRepository;

    @Test
    public void addTest() {
        CostType costType = new CostType();
        costType.setName("交通");
        CostType c = costTypeRepository.save(costType);
        System.out.println(c);
    }
}