package in.javamantra.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.javamantra.domain.ProviderBO;
import in.javamantra.repo.ProviderRepository;

@Service
public class ProviderService {
private static Logger logger = Logger.getLogger(ProviderService.class);
	
	@Autowired
	private ProviderRepository providerRepository;
	
	public Iterable<ProviderBO> getAllProviderData(){
		return providerRepository.findAll();
	} 
}
