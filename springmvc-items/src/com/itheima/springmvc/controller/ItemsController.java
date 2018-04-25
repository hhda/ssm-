package com.itheima.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itheima.springmvc.pojo.Items;
import com.itheima.springmvc.service.ItemsService;

@Controller
public class ItemsController {

	@Autowired
	private ItemsService itemsService;

	@RequestMapping("/itemsList")
	public String queryItems(Model model) {
		List<Items> itemsList = itemsService.findItemsList();
		model.addAttribute("itemList", itemsList);
		return "itemList";
	}
	
	@RequestMapping("/itemEdit")
	public String itemEdit(Model model,Integer id) {
		Items items = itemsService.findById(id);
		model.addAttribute("item", items);
		return "editItem";
	}
	
	@RequestMapping("/updateitem")
	public String updateItem(Items items) {
		itemsService.updateItem(items);
		return "success";
	}
}
