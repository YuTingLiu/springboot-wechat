package com.ljb.repository;

import com.ljb.entity.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * Created by liujunbin on 17/8/9.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;


    @Test
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("情侣最爱");
        productCategory.setCategoryType(5);
        productCategoryRepository.save(productCategory);

    }

    @Test
    public void findOneTest(){
        ProductCategory result = productCategoryRepository.findOne(1);
        System.out.print(result);

    }



}