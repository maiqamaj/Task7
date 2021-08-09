package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController	// This means that this class is a Controller
@RequestMapping(path="/Region") // This means URL's start with /demo (after Application path)
public class MainController  {
	
	@GetMapping("/allRegion")
	public ResponseEntity<List<Region>> getAllRegion()
	{ List <Region> region=null;
	 try {
	region=HrService.getAllRegion();
		
	}catch(Exception E)
	 {E.getMessage();}
	
	return new ResponseEntity<List<Region>>(region,HttpStatus.OK);
	
	
}
	@GetMapping("/getByid/{id}")
	public ResponseEntity <Region> getRegionById(@PathVariable("id")int id)
	{ Region region=null;
	 try {
	region=HrService.getRegionById(id);
		
	}catch(Exception E)
	 {E.getMessage();}
	
	return new ResponseEntity <Region >(region,HttpStatus.OK);
	
	
}
	
	@PostMapping("/addOrUpdateRegion")
	public ResponseEntity <Region> addOrUpdateRegion(@RequestBody Region region)
	{ Region regions=null;
	 try {
	region=HrService.addOrUpdateRegion(region);
		
	}catch(Exception E)
	 {E.getMessage();}
	
	return new ResponseEntity <Region >(regions,HttpStatus.OK);
	
	
}


	@DeleteMapping("/deleteRegion/{id}")
	public ResponseEntity <Region> deleteRegion(@PathVariable("id")int id)
	{ Region region=null;
	 try {
	region=HrService.deleteRegion(id);
		
	}catch(Exception E)
	 {E.getMessage();}
	
	return new ResponseEntity <Region >(region,HttpStatus.OK);
	
	
}




}
