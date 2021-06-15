package kr.co.ensmart.sample.app.controller;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleRestController {

	@GetMapping("")
	public Map<String, Boolean> main() {
		return Collections.singletonMap("result", true);
	}
	
}
