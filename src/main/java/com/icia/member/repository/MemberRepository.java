package com.icia.member.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.icia.member.dto.MemberDTO;

import org.mybatis.spring.SqlSessionTemplate;

@Repository
public class MemberRepository {

	@Autowired
	private SqlSessionTemplate sql;
	
	public int save(MemberDTO member) {
		return sql.insert("Member.save", member);
	}

}
