package aplication.data.repository;

import aplication.data.datasource.Datasource;
import aplication.data.factory.FactoryApi;
import aplication.data.mapper.ParticipanteModelToEntity;
import aplication.domain.model.ParticipanteModel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Qualifier("RepositoryApi")
public class RepositoryApi implements Repository{

    private Datasource apiDataSource;

    public RepositoryApi(FactoryApi factoryApi) {
        this.apiDataSource = factoryApi.crearDataSource();
    }


    @Override
    public ParticipanteModel obtenerParticipante(String rut) {
        return ParticipanteModelToEntity.reverse(apiDataSource.obtenerParticipante(rut));
    }
}
