package aplication.data.repository;

import aplication.data.datasource.Datasource;
import aplication.data.factory.FactoryLocal;
import aplication.data.mapper.ParticipanteModelToEntity;
import aplication.domain.model.ParticipanteModel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Qualifier("RepositoryLocal")
public class RepositoryLocal implements Repository{

    private Datasource localDataSource;

    public RepositoryLocal(FactoryLocal factoryLocal) {
        this.localDataSource = factoryLocal.crearDataSource();
    }


    @Override
    public ParticipanteModel obtenerParticipante(String rut) {
        return ParticipanteModelToEntity.reverse(localDataSource.obtenerParticipante(rut));
    }
}
