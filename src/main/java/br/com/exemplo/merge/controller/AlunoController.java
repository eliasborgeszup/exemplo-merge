package br.com.exemplo.merge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.exemplo.merge.entity.Aluno;
import br.com.exemplo.merge.repository.AlunoRepository;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

	@Autowired
	AlunoRepository repository;
		
	@PutMapping(path = "/{matricula}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Aluno alteraAluno(@PathVariable Long matricula, @RequestBody Aluno aluno) {
		return this.repository.save(aluno);
	}

}
