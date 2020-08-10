package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaoshu.dao.TypeMapper;
import com.xiaoshu.entity.Type;

@Service
public class TypeService {

	@Autowired
	private TypeMapper tm;

	public List<Type> findType(Type type) {
		// TODO Auto-generated method stub
		return tm.findType(type);
	}
	
}
