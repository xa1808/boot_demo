package com.yueqian.boot_demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yueqian.boot_demo.dao.ProductDao;
import com.yueqian.boot_demo.vo.ProductInfo;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	@Override
	@Transactional(readOnly = true)
	public List<ProductInfo> findAllProducts() {
		return productDao.findAllProducts();
	}

}
