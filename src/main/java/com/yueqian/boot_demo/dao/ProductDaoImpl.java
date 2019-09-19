package com.yueqian.boot_demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.yueqian.boot_demo.vo.ProductInfo;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<ProductInfo> findAllProducts() {
		return jdbcTemplate.query("select * from products", new RowMapper<ProductInfo>() {

			@Override
			public ProductInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
				ProductInfo info = new ProductInfo();
				info.setProductId(rs.getInt("product_id"));
				info.setTypeId(rs.getInt("product_type_id"));
				info.setProductName(rs.getString("name"));
				info.setDesc(rs.getString("description"));
				info.setPrice(rs.getFloat("price"));
				return info;
			}

		});
	}

}
