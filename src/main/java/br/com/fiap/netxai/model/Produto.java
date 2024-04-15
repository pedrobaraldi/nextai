package br.com.fiap.netxai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;


@Data
@Entity
public class Produto {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "{produto.nome.not.blank}")
    private String nome;
    
    @NotBlank(message = "{produto.categoria.not.blank}")
    private String categoria;

    @Positive
    private Float valor;
}
