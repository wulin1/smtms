package cn.jbit.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jbit.biz.BackstageBiz;
import cn.jbit.dao.BackstageMapper;
import cn.jbit.pojo.Backend_user;
@Service("BackstageBiz")
public class BackstageBizImpl implements BackstageBiz {
	@Autowired
	private BackstageMapper backstageMapper;

	@Override
	public Backend_user getLoginUser() {
		return backstageMapper.getLoginUser();
	}
}
