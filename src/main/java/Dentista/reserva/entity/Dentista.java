package Dentista.reserva.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "dentistas")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Dentista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "usuario_id", unique = true, nullable = false)
    private Usuario usuario;

    @Column(nullable = false)
    private String especialidad;
}

