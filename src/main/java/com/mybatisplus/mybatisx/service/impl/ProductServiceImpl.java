package com.mybatisplus.mybatisx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mybatisplus.mybatisx.bean.Product;
import com.mybatisplus.mybatisx.service.ProductService;
import com.mybatisplus.mybatisx.mapper.ProductMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【t_product】的数据库操作Service实现
* @createDate 2022-07-08 16:09:43
*/
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product>
    implements ProductService{

}




