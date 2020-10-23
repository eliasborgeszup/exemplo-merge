package br.com.exemplo.merge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.exemplo.merge.entity.AlunoEntity;
import br.com.exemplo.merge.repository.AlunoRepository;

@Controller
public class AlunoController {
	
	@Autowired
	AlunoRepository repository;

	@PostMapping
	public AlunoEntity insereAluno(@RequestBody AlunoEntity aluno) {
		if (repository.existsById(aluno.getMatricula())) {
			return null;
		}
		
		return this.repository.save(aluno);
	}

}
