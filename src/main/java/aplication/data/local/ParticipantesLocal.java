package aplication.data.local;

import aplication.data.entity.ParticitanteEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import java.util.Map;
import java.util.HashMap;

@Component
public class ParticipantesLocal implements Local {


    @Override
    public ParticitanteEntity obtenerParticipante(String rut) {
        Map<String,ParticitanteEntity> participantes = new HashMap<String,ParticitanteEntity>();

        ParticitanteEntity particitanteEntityUno = new ParticitanteEntity();
        particitanteEntityUno.setNombre("Mauricio Soto");
        participantes.put("1-9",particitanteEntityUno);

        ParticitanteEntity particitanteEntityDos = new ParticitanteEntity();
        particitanteEntityDos.setNombre("Oscar Schnake");
        participantes.put("2-7",particitanteEntityDos);

        ParticitanteEntity particitanteEntityTres = new ParticitanteEntity();
        particitanteEntityTres.setNombre("Sergio Sanchez");
        participantes.put("3-5",particitanteEntityTres);



        return  participantes.get(rut);
    }
}
