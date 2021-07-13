package com.cts.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cts.bean.Product;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class ProductDaoImpl implements ProductDao {

	//wire dependency
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Product getProductDetails(int product_code) {
		//add your code here
		String sql = "select * from product where product_code = ?";

		return jdbcTemplate.queryForObject(sql, new Object[] { product_code }, new RowMapper<Product>() {
			@Override
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Product(rs.getInt("product_code"), rs.getString("product_name"),
						rs.getString("product_category"), rs.getString("product_desc"), rs.getDouble("product_price"));
			}
		});
	}

}
