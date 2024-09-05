package Dentista.reserva.repository;

import Dentista.reserva.entity.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Long> {

    // Encuentra todas las citas de un dentista en una fecha
    List<Cita> findByDentistaIdAndFecha(Long dentistaId, LocalDate fecha);

    // Encuentra una cita por dentista, fecha y hora
    Optional<Cita> findByDentistaIdAndFechaAndHora(Long dentistaId, LocalDate fecha, LocalTime hora);

    // Encuentra todas las citas de un paciente
    List<Cita> findByPacienteId(Long pacienteId);
}
