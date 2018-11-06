package com.sucre.dao;

import java.util.List;

import com.sucre.entity.Weibo;

public interface weiboDao {
	//从文件加载数据
	public void loadList(String fileName);
	//根据索引取一条数据
	public Weibo get(int index);
	//根据id,pass加载一个类
	public Weibo load(String id,String pass);
	//把文件的数据加载到类
	public Weibo load(String inputData);
	//取一页的数据
	public List<Weibo> getPage(int page);
}