package br.senac.sp.epictask.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import jakarta.validation.constraints.Size;
import lombok.Data;


@Entity
@Data
public class Task {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    Long id;
    @NotBlank @Size(min = 3, max = 50, message = "Digite entre 3 e 50 caracteres")
    String title;

    @Size(min= 10, max = 200, message="Digite uma descrição com um tamanho entre 10 e 200 caracteres")
    String description;

    @Min(value= 1, message = "O valor de suas compras não pode ser negativo")
    Integer score;

}
