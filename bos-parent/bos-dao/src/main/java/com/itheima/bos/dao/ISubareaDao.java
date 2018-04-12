package com.itheima.bos.dao;

import java.util.List;

import com.itheima.bos.dao.base.IBaseDao;
import com.itheima.bos.domain.Subarea;

public interface ISubareaDao extends IBaseDao<Subarea>{

	public List<Object> findSubareasGroupByProvince();

}
