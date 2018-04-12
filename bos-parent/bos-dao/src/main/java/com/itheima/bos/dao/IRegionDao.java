package com.itheima.bos.dao;

import java.util.List;

import com.itheima.bos.dao.base.IBaseDao;
import com.itheima.bos.domain.Region;

public interface IRegionDao extends IBaseDao<Region> {

	public List<Region> findListByQ(String q);

}
