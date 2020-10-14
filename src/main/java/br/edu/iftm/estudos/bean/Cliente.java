package br.edu.iftm.estudos.bean;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Cliente {

    private Integer codigo;
    private String nome;
    private String endereco;
    private Date dataNascimento;
    private String telefone;
   
    
    
}
