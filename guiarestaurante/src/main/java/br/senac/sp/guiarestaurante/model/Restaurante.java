package br.senac.sp.guiarestaurante.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data

public class Restaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private String endereco;
    private String cep;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String atracoes;
    private String telefone;
    private String email;
    private String site;
    private String horarioFuncionamento;
    private String descricao;
    private String palavrasChave;
    @ManyToOne
    private TipoRestaurante tipoRestaurante;

}
