package akaza.gdt.com.serviceImplement;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import akaza.gdt.com.commone.CrudeService;
import akaza.gdt.com.entity.Terain;
import akaza.gdt.com.repository.TerainRepository;
import akaza.gdt.com.service.TerainService;

@Service
public class TerainServiceImpl implements CrudeService<Terain>, TerainService {
	@Autowired
	private TerainRepository repository;

	@Override
	public List<Terain> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Optional<Terain> getbyId(long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Terain> search(Map<String, String> cretaria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Terain saveOrUpdate(Terain t) {
		// TODO Auto-generated method stub
		return repository.save(t);
	}

	@Override
	public boolean delete(long id) {
		repository.deleteById(id);
		return true;
	}

	@Override
	public String ping() {
		// TODO Auto-generated method stub
		return null;
	}

}
