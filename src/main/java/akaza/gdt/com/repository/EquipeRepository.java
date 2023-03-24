package akaza.gdt.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import akaza.gdt.com.entity.Equipe;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe,Long>{

}
