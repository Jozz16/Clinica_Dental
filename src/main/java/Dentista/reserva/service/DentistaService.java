package Dentista.reserva.service;

import Dentista.reserva.repository.DentistaRepository;
import Dentista.reserva.entity.Dentista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DentistaService {

    @Autowired
    private DentistaRepository dentistaRepository;

    public List<Dentista> obtenerTodosLosDentistas() {
        return dentistaRepository.findAll();
    }

    public Optional<Dentista> obtenerDentistaPorId(Long id) {
        return dentistaRepository.findById(id);
    }

    public Dentista guardarDentista(Dentista dentista) {
        return dentistaRepository.save(dentista);
    }

    public void eliminarDentista(Long id) {
        dentistaRepository.deleteById(id);
    }
}

