package in.javamantra.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import in.javamantra.domain.ProviderBO;

@Transactional
public interface ProviderRepository extends CrudRepository<ProviderBO, Long> {
	
	List<ProviderBO> findByEthinicity(String ethinicity);

}
