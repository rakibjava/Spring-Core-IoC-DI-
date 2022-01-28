package com.example.jprototypebean.usingLookupMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proto")
public class ProtoController {
	private final MySingletonBean serviceConfig;

	@Autowired
	public ProtoController(MySingletonBean serviceConfig) {
		this.serviceConfig = serviceConfig;
	}
	
	@GetMapping("/pr")
	public String returnProto() {
		return serviceConfig.showMessage ();
	}

	@GetMapping("/{name}/{age}")
	public String returnProto1(@PathVariable("name") String name, @PathVariable("age") int age) {
		return serviceConfig.showMessage1 (name,age);
	}

	@GetMapping("/pr/{name}/{age}")
	public String returnProto2(@PathVariable("name") String name, @PathVariable("age") int age) {
		return serviceConfig.showMessage3 (name,age);
	}
}
