package com.examen.demo.infrastructure.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.demo.application.services.TcClientesService;
import com.examen.demo.application.services.TrSolicitudesService;
import com.examen.demo.infrastructure.dto.AltaSolicitud;
import com.examen.demo.infrastructure.dto.Respuesta;

import io.micrometer.common.util.StringUtils;

@RestController
public class AltaController {
     
    @Autowired
    TcClientesService tcClientesService;

    @Autowired
    TrSolicitudesService trSolicitudesService;

    @PostMapping("/altaSolicitud")
    public ResponseEntity<Respuesta> crearSolicitud(@RequestBody AltaSolicitud altaSolicitud){
        ResponseEntity regresar = null;
        if(StringUtils.isBlank(altaSolicitud.getEmpresa()) || StringUtils.isBlank(altaSolicitud.getPromotor())){
            regresar = new ResponseEntity(new Respuesta( String.valueOf(HttpStatus.BAD_REQUEST.value()),"No se encontro la empresa , favor de validar..."),HttpStatus.BAD_REQUEST);
        }
        if(StringUtils.isBlank(altaSolicitud.getCliente().getApellidoPaterno()) || StringUtils.isBlank(altaSolicitud.getCliente().getNombre())){
            regresar = new ResponseEntity(new Respuesta( String.valueOf(HttpStatus.BAD_REQUEST.value()),"Revisar los datos del cliente, no se encontro nombre y/o primer apellido, favor de validar..."),HttpStatus.BAD_REQUEST);
        }
        altaSolicitud.getCliente().setIdPromotor(1L); // este fijo por lo que seria necesario buscar el promortor
        tcClientesService.saveTcClientes(altaSolicitud.getCliente());
        altaSolicitud.getSolicitud().setIdCliente(altaSolicitud.getCliente().getIdCliente());
        trSolicitudesService.saveTrSolicitudes(altaSolicitud.getSolicitud());        
        regresar= new ResponseEntity(new Respuesta( String.valueOf(HttpStatus.OK.value()),"Solicitud registrada con  exitó"),HttpStatus.OK);
        return regresar;
    }
    

    @RequestMapping("/")
    public String home(){
        return "El servicio está activo.";
    }


}
