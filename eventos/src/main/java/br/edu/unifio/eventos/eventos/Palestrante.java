package br.edu.unifio.eventos.eventos;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "palestrante")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Palestrante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private String miniBio;

    private String email;
}
