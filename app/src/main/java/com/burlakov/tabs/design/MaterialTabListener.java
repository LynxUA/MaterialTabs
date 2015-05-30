package com.burlakov.tabs.design;

import com.burlakov.tabs.design.MaterialTab;

public interface MaterialTabListener {
	public void onTabSelected(MaterialTab tab);
	
	public void onTabReselected(MaterialTab tab);
	
	public void onTabUnselected(MaterialTab tab);
}
