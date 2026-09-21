package br.edu.unifio.eventos.eventos;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "CategoriaEvento")
@Table(name = "categoria_evento")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private String descricao;
}
