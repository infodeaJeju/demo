package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.MyuserDto;

@Repository
public class MyuserDao {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	public List<MyuserDto> list() {
		String sql = "select EMP_NO"
				+ ", BR_CD"
				+ ", EMP_NM"
				+ ", EMP_JBLVL_CD"
				+ ", POSI_CD from IPSSG003TM";
		List<MyuserDto> list = jdbcTemplate.query(sql, 
				new BeanPropertyRowMapper<MyuserDto>( MyuserDto.class ) );
		return list;
	}
}
