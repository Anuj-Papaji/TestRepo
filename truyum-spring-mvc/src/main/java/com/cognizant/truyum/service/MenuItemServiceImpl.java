package com.cognizant.truyum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.truyum.dao.MenuItemDao;
import com.cognizant.truyum.model.MenuItem;

@Service
public class MenuItemServiceImpl implements MenuItemService {

	@Autowired
	MenuItemDao menuItemDao;

	@Override
	public List<MenuItem> getMenuItemListAdmin() {
		return menuItemDao.getMenuItemListAdmin();
	}

	@Override
	public List<MenuItem> getMenuItemListCustomer() {
		return menuItemDao.getMenuItemListCustomer();
	}

	@Override
	public MenuItem getMenuItem(long menuItemId) {
		return menuItemDao.getMenuItem(menuItemId);
	}

	@Override
	public boolean modifyMenuItem(MenuItem menuItem) {
		// TODO Auto-generated method stub
		menuItemDao.modifyMenuItem(menuItem);
		return true;
	}

}
