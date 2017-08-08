package com.ljb.repository;

import com.ljb.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by liujunbin on 17/8/9.
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory , Integer> {

}
