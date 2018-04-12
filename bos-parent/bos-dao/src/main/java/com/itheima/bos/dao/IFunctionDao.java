package com.itheima.bos.dao;

import java.util.List;

import com.itheima.bos.dao.base.IBaseDao;
import com.itheima.bos.domain.Function;

public interface IFunctionDao extends IBaseDao<Function> {
	public List<Function> findFunctionListByUserId(String id);
	public List<Function> findAllMenu();
	public List<Function> findMenuByUserId(String id);
}
