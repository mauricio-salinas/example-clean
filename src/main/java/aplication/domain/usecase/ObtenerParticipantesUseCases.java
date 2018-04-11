package aplication.domain.usecase;

import aplication.data.repository.Repository;
import aplication.domain.model.ParticipanteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ObtenerParticipantesUseCases {

    @Autowired
    private Repository repositoryLocal;

    public ParticipanteModel obtenerParticipante(String rut) {return repositoryLocal.obtenerParticipante(rut); }
}
