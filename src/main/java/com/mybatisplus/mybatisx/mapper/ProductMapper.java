package com.mybatisplus.mybatisx.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.mybatisplus.mybatisx.bean.Product;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
* @author Administrator
* @description 针对表【t_product】的数据库操作Mapper
* @createDate 2022-07-08 16:09:43
* @Entity com.mybatisplus.mybatisx.bean.Product
*/
@Repository
public interface ProductMapper extends BaseMapper<Product> {
    Product selectAllById(@Param("id") Long id);
}




