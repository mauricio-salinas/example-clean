package aplication.data.local;

import aplication.data.entity.ParticitanteEntity;

import java.util.List;

public interface Local {
    List<ParticitanteEntity> obtenerPartcipantes();
    ParticitanteEntity obtenerParticipante(String rut);
}
