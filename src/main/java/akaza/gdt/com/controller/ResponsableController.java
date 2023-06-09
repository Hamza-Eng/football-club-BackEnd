package akaza.gdt.com.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import akaza.gdt.com.commone.CrudeController;
import akaza.gdt.com.entity.Responsable;
import akaza.gdt.com.serviceImplement.ResponsableServiceImpl;

@RestController
@CrossOrigin
@RequestMapping("/responsable")
public class ResponsableController implements CrudeController<Responsable> {
	@Autowired
	private ResponsableServiceImpl service;

	@GetMapping("/all")
	@Override
	public List<Responsable> getAll() {
		// TODO Auto-generated method stub
		return service.getAll();
	}

	@GetMapping("/id/{id}")
	@Override
	public Optional<Responsable> getbyId(@PathVariable(name = "id") long id) {
		// TODO Auto-generated method stub
		return service.getbyId(id);
	}

	@Override
	public List<Responsable> search(Map<String, String> cretaria) {
		// TODO Auto-generated method stub
		return null;
	}

	@PostMapping("/add")
	@Override
	public Responsable saveOrUpdate(Responsable t) {
		// TODO Auto-generated method stub
		return service.saveOrUpdate(t);
	}

	@DeleteMapping("/delete")
	@Override
	public boolean delete(long id) {
		service.delete(id);
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String ping() {
		// TODO Auto-generated method stub
		return "ping=>pong" + this.getClass().getSimpleName();

	}

}
