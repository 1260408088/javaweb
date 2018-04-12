package com.itheima.bos.service;

import org.springframework.transaction.annotation.Transactional;

import com.itheima.bos.domain.Decidedzone;
import com.itheima.bos.utils.PageBean;
public interface IDecidedzoneService {

	public void save(Decidedzone model, String[] subareaid);

	public void pageQuery(PageBean pageBean);

}
