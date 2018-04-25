package com.itheima.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.springmvc.mapper.ItemsMapper;
import com.itheima.springmvc.pojo.Items;
import com.itheima.springmvc.pojo.ItemsExample;
import com.itheima.springmvc.service.ItemsService;

@Service
public class ItemsServiceImpl implements ItemsService {
	
	@Autowired
	private ItemsMapper itemsMapper;

	public List<Items> findItemsList() {
		ItemsExample example = new ItemsExample();
		List<Items> list = itemsMapper.selectByExample(example);
		return list;
	}

	public Items findById(Integer id) {
		Items items = itemsMapper.selectByPrimaryKey(id);
		return items;
	}

	public void updateItem(Items items) {
		itemsMapper.updateByPrimaryKeySelective(items);
	}

}
