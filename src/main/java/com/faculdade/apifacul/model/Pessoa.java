package com.faculdade.apifacul.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "pessoas")
@Data
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String nome;
    private Date dataNascimento ;
    private String sexo;
    private String cpf;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
