package com.cg.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.dto.Trainee;
import com.cg.service.ITraineeService;





@Controller
public class MyController {
	
	@Autowired
	ITraineeService traineeservice;
	
	@RequestMapping(value="all",method=RequestMethod.GET)
	public String getAll()
	{
		//System.out.println("xxxxxxxx");
		return "home";
	}
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String employeeDelete()
	{
		return "trainee";
	}
	
	@RequestMapping(value="add",method=RequestMethod.GET)
	public String addTrainee(@ModelAttribute("my") Trainee trn,Map<String, Object>model)
	{
		List<String> myDesig= new ArrayList<>();
		myDesig.add("A");
		myDesig.add("B");
		myDesig.add("C");
		model.put("deg",myDesig);
		return "addtrainee";
	}
	@RequestMapping(value="insertdata",method=RequestMethod.POST)
	public ModelAndView insertTrainee(@Valid @ModelAttribute("my") Trainee trn,BindingResult result,Map<String, Object>model)
	{
		int id=0;
		if(result.hasErrors())
		{
			List<String> myDesig= new ArrayList<>();
			myDesig.add("A");
			myDesig.add("B");
			myDesig.add("C");
			model.put("deg",myDesig);
			return new ModelAndView("addtrainee");
		}
		else
		{
		 id=traineeservice.addTrainee(trn);
		}
		System.out.println("Name is "+trn.traineeName);
		return new ModelAndView("success", "tdata", id);
	}
	
	
	@RequestMapping(value="delete",method=RequestMethod.GET)
	public String deleteTrainee()
	{
		return "deletetrainee";
	}

	@RequestMapping(value="doodelete",method=RequestMethod.GET)
	public String traineeDeletee(@RequestParam("tid") int id)
	{
		traineeservice.deleteTrainee(id);
		System.out.println("Id is "+id);
		return "trainee";
	}
	
	@RequestMapping(value="dodelete",method=RequestMethod.GET)
	public ModelAndView traineeDelete(@RequestParam("tid") int id)
	{
		traineeservice.delTrainee(id);
		List<Trainee> myAllData=traineeservice.delTrainee(id);
		//System.out.println("Id is "+id);
		//traineeservice.deleteTrainee(id);
		return new ModelAndView("traineeinfo", "temp", myAllData);
	}
	
	
	

}
