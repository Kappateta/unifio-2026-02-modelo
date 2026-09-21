package br.edu.unifio.eventos.eventos;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "local")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Local {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private String endereco;

    private Integer capacidade;
}
