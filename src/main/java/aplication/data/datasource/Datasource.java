package aplication.data.datasource;

import aplication.data.entity.ParticitanteEntity;


public interface Datasource {

    ParticitanteEntity obtenerParticipante(String rut);
}
