package Dentista.reserva.service;

import Dentista.reserva.entity.Disponibilidad;
import Dentista.reserva.repository.DisponibilidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DisponibilidadService {

    @Autowired
    private DisponibilidadRepository disponibilidadRepository;

    public List<Disponibilidad> obtenerTodaLaDisponibilidad() {
        return disponibilidadRepository.findAll();
    }

    public Optional<Disponibilidad> obtenerDisponibilidadPorId(Long id) {
        return disponibilidadRepository.findById(id);
    }

    public List<Disponibilidad> obtenerDisponibilidadPorDentistaYDia(Long dentistaId, String diaSemana) {
        return disponibilidadRepository.findByDentistaIdAndDiaSemana(dentistaId, diaSemana);
    }

    public Disponibilidad guardarDisponibilidad(Disponibilidad disponibilidad) {
        return disponibilidadRepository.save(disponibilidad);
    }

    public void eliminarDisponibilidad(Long id) {
        disponibilidadRepository.deleteById(id);
    }
}
