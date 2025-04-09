package com.example.atividade.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name = "tab_funcionario")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "nome obrigatorio")
    private String nome;

    @NotBlank(message = "cpf obrigatorio")
    private String cpf;

    @NotBlank(message = "data de nascimento obrigatorio")
    private String dataNascimento;

    @Positive(message = "salario positivo")
    private double salario;

    @NotBlank(message = "email e obrigatorio")
    @Email(message = "deve ser um email valido")
    private String email;

    @Enumerated(value = EnumType.STRING)
    private Sexo sexo;

    @Enumerated(value = EnumType.STRING)
    private Setor setor;

    @Enumerated(value = EnumType.STRING)
    private EstadoCivil estadoCivil;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;


    public Funcionario() {
    }

    public Funcionario(Long id, String nome, String cpf, String dataNascimento, double salario, String email, Sexo sexo, Setor setor, EstadoCivil estadoCivil, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
        this.email = email;
        this.sexo = sexo;
        this.setor = setor;
        this.estadoCivil = estadoCivil;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "") String getCpf() {
        return cpf;
    }

    public void setCpf(@NotBlank(message = "") String cpf) {
        this.cpf = cpf;
    }

    public @NotBlank(message = "") String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(@NotBlank(message = "") String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public @Positive(message = "") double getSalario() {
        return salario;
    }

    public void setSalario(@Positive(message = "") double salario) {
        this.salario = salario;
    }

    public @NotBlank(message = "") @Email(message = "") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "") @Email(message = "") String email) {
        this.email = email;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", salario=" + salario +
                ", email='" + email + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", estadoCivil=" + estadoCivil +
                ", endereco=" + endereco +
                '}';
    }
}
