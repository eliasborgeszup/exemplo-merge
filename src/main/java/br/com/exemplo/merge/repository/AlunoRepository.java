package br.com.exemplo.merge.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.exemplo.merge.entity.Aluno;

@Repository
public interface AlunoRepository extends CrudRepository<Aluno, Long>{}