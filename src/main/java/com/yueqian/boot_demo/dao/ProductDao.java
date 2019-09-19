package com.yueqian.boot_demo.dao;

import java.util.List;

import com.yueqian.boot_demo.vo.ProductInfo;

public interface ProductDao {
	List<ProductInfo> findAllProducts();
}
