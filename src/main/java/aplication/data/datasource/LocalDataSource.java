package aplication.data.datasource;

import aplication.data.entity.ParticitanteEntity;
import aplication.data.local.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LocalDataSource implements Datasource {

    @Autowired
    private Local participantesLocal;

    @Override
    public List<ParticitanteEntity> obtenerPartcipantes() {
        return participantesLocal.obtenerPartcipantes();
    }

    @Override
    public ParticitanteEntity obtenerParticipante(String rut) {
        return participantesLocal.obtenerParticipante(rut);
    }
}
