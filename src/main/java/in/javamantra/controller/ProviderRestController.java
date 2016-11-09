package in.javamantra.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.javamantra.domain.ProviderBO;
import in.javamantra.service.ProviderService;

@RestController("/provider")
public class ProviderRestController {
	private static Logger logger = Logger.getLogger(ProviderRestController.class);
	
	@Autowired
	private ProviderService providerService;
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Iterable<ProviderBO>> getAllProviderData(){
		Iterable<ProviderBO> providerData = providerService.getAllProviderData();
		
		return new ResponseEntity<Iterable<ProviderBO>>(providerData, HttpStatus.OK);
	}

}
