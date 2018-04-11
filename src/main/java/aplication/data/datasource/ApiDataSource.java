package aplication.data.datasource;

import aplication.data.entity.ParticitanteEntity;
import aplication.data.api.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



@Component
@Qualifier("ApiDataSource")
public class ApiDataSource implements Datasource {

    @Autowired
    private Api participantesApi;

    @Override
    public ParticitanteEntity obtenerParticipante(String rut) {

        return participantesApi.obtenerParticipante(rut);
    }
}

