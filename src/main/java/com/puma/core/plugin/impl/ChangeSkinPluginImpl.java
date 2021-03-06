package com.puma.core.plugin.impl;

import org.springframework.stereotype.Component;

import com.puma.core.domain.Member;
import com.puma.core.plugin.IPumaPlugin;

@Component
public class ChangeSkinPluginImpl implements IPumaPlugin{

	@Override
	public String getName() {
		return "皮肤管理";
	}
	
	@Override
	public String getJsModuleName() {
		return "ChangeSkinModule";
	}

	@Override
	public String getVersion() {
		return "1.0";
	}
	
	@Override
	public void setUp() {
		
	}

	@Override
	public void tearDown() {
	}

	@Override
	public void enable() {
		
	}

	@Override
	public void disable() {
		
	}
	
	@Override
	public String getAuthUrl() {
		return "changeskin.html";
	}

	@Override
	public Class<?>[] depend() {
		Class<?>[] clses = new Class[1];
		Class<?> cls = Member.class;
		clses[0] = cls;
		return clses;
	}

}
