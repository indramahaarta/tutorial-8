package id.ac.ui.cs.advprog.asdos.asdos.repository;

import id.ac.ui.cs.advprog.asdos.asdos.model.Asdos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsdosRepository extends JpaRepository<Asdos, Integer> {

}
