package br.com.exemplo.merge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.exemplo.merge.repository.AlunoRepository;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.exemplo.merge.entity.Aluno;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
	AlunoRepository repository;

	@PostMapping
	public Aluno insereAluno(@RequestBody Aluno aluno) {
		if (repository.existsById(aluno.getMatricula())) {
			return null;
		}
		
		return this.repository.save(aluno);
	}
		
	@PutMapping(path = "/{matricula}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Aluno alteraAluno(@PathVariable Long matricula, @RequestBody Aluno aluno) {
		return this.repository.save(aluno);
	}

}
