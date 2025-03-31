package com.faculdade.apifacul.controller;

import com.faculdade.apifacul.Dto.PessoaDto;
import com.faculdade.apifacul.model.Pessoa;
import com.faculdade.apifacul.repository.PessoaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    private PessoaRepository pessoaRepository;

    @Autowired
    public PessoaController(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @PostMapping
    public ResponseEntity<Pessoa> createProduct(@RequestBody PessoaDto productDto){
        Pessoa pessoa = new Pessoa();
        BeanUtils.copyProperties(productDto, pessoa);
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaRepository.save(pessoa));
    }

    @GetMapping
    public ResponseEntity<List<Pessoa>> getAllPessoas() {
        List<Pessoa> pessoas = pessoaRepository.findAll();
        return ResponseEntity.ok(pessoas);
    }


}

