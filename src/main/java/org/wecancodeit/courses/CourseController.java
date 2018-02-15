package org.wecancodeit.courses;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CourseController {
	
	@Resource
	CourseRepository courseRepo;
	
	@RequestMapping(value = "courses")
	public String getAllCourses(Model model) {
		model.addAttribute("courses", courseRepo.findAll());
		return "courses";
	}
	
	@RequestMapping("course")
	public String getACourse(@RequestParam Long id,  Model model) {
		model.addAttribute("courses", courseRepo.findOne(id));
		return "course";
	}

}
