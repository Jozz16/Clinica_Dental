package Dentista.reserva.repository;

import Dentista.reserva.entity.Disponibilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DisponibilidadRepository extends JpaRepository<Disponibilidad, Long> {

    // Encuentra la disponibilidad de un dentista por día de la semana
    List<Disponibilidad> findByDentistaIdAndDiaSemana(Long dentistaId, String diaSemana);
}
