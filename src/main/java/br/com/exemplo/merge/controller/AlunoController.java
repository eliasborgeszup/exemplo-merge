package br.com.exemplo.merge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.exemplo.merge.repository.AlunoRepository;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	@Autowired
	AlunoRepository repository;
	
	@DeleteMapping(path = "/{matricula}")
	public boolean removeAluno(@PathVariable Long matricula) {	
		if(repository.existsById(matricula)) {
			this.repository.deleteById(matricula);
			return true;
		}
		return false;
	}
}
