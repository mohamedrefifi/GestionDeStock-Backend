package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Service.MvtStkService;
import com.example.demo.controller.api.MvtStkApi;
import com.example.demo.model.MvtStock;

@RestController
public class MvtStkController implements MvtStkApi {

	private MvtStkService mvtStkService;
	@Autowired
	
	public MvtStkController(MvtStkService mvtStkService)
	{
		this.mvtStkService=mvtStkService;
	}

	@Override
	public MvtStock save(MvtStock mvtStock) {
		if(mvtStock==null)
		{
		return null;
	}
		return mvtStkService.save(mvtStock);
	}

	@Override
	public Optional<MvtStock> FindById(Integer id) {
		 if(id==null)
		 {
			 return null;
		 }
		 return mvtStkService.FindById(id);
	}

	@Override
	public List<MvtStock> FindAll() {
		return mvtStkService.FindAll();
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return;
		}
		mvtStkService.Delete(id);
	}

}
