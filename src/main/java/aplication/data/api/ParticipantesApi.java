package aplication.data.api;

import aplication.data.entity.ParticitanteEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class ParticipantesApi implements Api {

    private final String HTTPS_API_RUTIFY_SEARCH = "https://api.rutify.cl/search?q=";

    @Override
    public ParticitanteEntity obtenerParticipante(String rut) {
        ParticitanteEntity[] responseApiArray;
        RestTemplate restTemplate = new RestTemplate();
        responseApiArray = restTemplate.getForObject(getUrlSearch(rut), ParticitanteEntity[].class);
        return getParticipanteEntity(responseApiArray);


       /* ParticitanteEntity participanteUno = new ParticitanteEntity();
        participanteUno.setNombre("Nombre Completo");
        return participanteUno; */
    }

    private ParticitanteEntity getParticipanteEntity(ParticitanteEntity[] responseApiArray) {
        List<ParticitanteEntity> listParticipanteEntity = Arrays.asList(responseApiArray);
        if (listParticipanteEntity.isEmpty()){
            return new ParticitanteEntity();
        }
        return listParticipanteEntity.get(0);
    }

    private String  getUrlSearch(String rut) { return HTTPS_API_RUTIFY_SEARCH + rut; }
}
