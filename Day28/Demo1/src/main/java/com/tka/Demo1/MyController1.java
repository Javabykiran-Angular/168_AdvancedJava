package com.tka.Demo1;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class MyController1 {
	
	
	
	
		@GetMapping("/getdata")
		public void getMapping1() {
			System.out.println("U r in MyController1 getMapping1 method...");
		}

		@GetMapping("/getalldata")
		public String getdata() {
			return "Return all data....";
		}
	
		@PostMapping("/senddata")
		public String postDataSend() {
			return "Data saved successfully...";
		}
		
		@PutMapping("/putData")
		public String putData() {
			return "Data Update successfully...";
		}
		
		@DeleteMapping("/deleteData")
		public String DeleteData() {
			return "Data Delete successfully...";
		}
		
		@GetMapping("/record")
		public String datasend() {
			return "Data is send...";
		}
		
		
		@PostMapping("/record")
		public String savedata() {
			return "Data is Saved...";
		}
		
		
		@PutMapping("/record")
		public String UpdateRecord() {
			return "Data is Update...";
		}
		
		@DeleteMapping("/record")
		public String deleteRecord() {
			return "Data is Delete...";
		}
		
	
}
