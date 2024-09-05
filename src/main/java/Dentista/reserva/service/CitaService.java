package Dentista.reserva.service;

import Dentista.reserva.entity.Cita;
import Dentista.reserva.repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Service
public class CitaService {

    @Autowired
    private CitaRepository citaRepository;

    public List<Cita> obtenerTodasLasCitas() {
        return citaRepository.findAll();
    }

    public Optional<Cita> obtenerCitaPorId(Long id) {
        return citaRepository.findById(id);
    }

    public List<Cita> obtenerCitasPorDentistaYFecha(Long dentistaId, LocalDate fecha) {
        return citaRepository.findByDentistaIdAndFecha(dentistaId, fecha);
    }

    public Optional<Cita> obtenerCitaPorDentistaFechaYHora(Long dentistaId, LocalDate fecha, LocalTime hora) {
        return citaRepository.findByDentistaIdAndFechaAndHora(dentistaId, fecha, hora);
    }

    public List<Cita> obtenerCitasPorPaciente(Long pacienteId) {
        return citaRepository.findByPacienteId(pacienteId);
    }

    public Cita guardarCita(Cita cita) {
        return citaRepository.save(cita);
    }

    public void eliminarCita(Long id) {
        citaRepository.deleteById(id);
    }
}
