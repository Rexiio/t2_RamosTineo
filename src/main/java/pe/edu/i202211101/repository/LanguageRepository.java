package pe.edu.i202211101.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.edu.i202211101.model.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Integer>{

}
