package com.itheima.springmvc.service;

import java.util.List;

import com.itheima.springmvc.pojo.Items;

public interface ItemsService {
	public List<Items> findItemsList();
	public Items findById(Integer id);
	public void updateItem(Items items);
}
