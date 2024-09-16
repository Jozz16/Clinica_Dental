package Dentista.reserva.service;

import Dentista.reserva.entity.UserEntity;
import Dentista.reserva.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UserRepository usuarioRepository;

    public List<UserEntity> obtenerTodosLosUsuarios() {
        return usuarioRepository.findAll();
    }

    public Optional<UserEntity> obtenerUsuarioPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    public Optional<UserEntity> obtenerUsuarioPorEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }

    public UserEntity guardarUsuario(UserEntity usuario) {
        return usuarioRepository.save(usuario);
    }

    public void eliminarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}

