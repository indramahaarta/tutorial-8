package id.ac.ui.cs.advprog.tutorial8.asdos.repository;

import id.ac.ui.cs.advprog.tutorial8.asdos.model.Asdos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsdosRepository extends JpaRepository<Asdos, Integer> {

}
