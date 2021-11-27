package me.realblock;

import me.realblock.repositories.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import me.realblock.entities.Test;

@SpringBootApplication
@Controller
public class RealblockApplication {

	@Autowired
	TestRepository testRepository;

	public static void main(String[] args) {
		SpringApplication.run(RealblockApplication.class, args);
	}

	@GetMapping("/")
	@ResponseBody
	public String home(){
		testRepository.save(new Test());
		return "hello world";
	}
}
