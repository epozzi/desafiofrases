package br.com.epozzi.desafiofrases.repository;

import br.com.epozzi.desafiofrases.model.FraseED;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraseRepository extends JpaRepository<FraseED, Long> {
}
