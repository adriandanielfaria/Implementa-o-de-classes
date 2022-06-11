package funcionarios;

import java.util.Date;

import localizacao.Endereco;

public class Funcionarios {
    
    private String nome;
    private Date nascimento;
    private String cpf;
    private Endereco enderecos;

    public Funcionarios () {

    }

    public Funcionarios(String nome, Date nascimento, String cpf, Endereco enderecos) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.enderecos = enderecos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Endereco enderecos) {
        this.enderecos = enderecos;
    }

} 
