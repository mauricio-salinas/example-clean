package aplication.data.repository;

import aplication.domain.model.ParticipanteModel;

import java.util.List;

public interface Repository {
    List<ParticipanteModel> obtenerParticipantes();
    ParticipanteModel obtenerParticipante(String rut);
}
