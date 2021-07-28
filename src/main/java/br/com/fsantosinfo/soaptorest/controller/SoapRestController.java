package br.com.fsantosinfo.soaptorest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fsantosinfo.dto.AddRequestDTO;
import br.com.fsantosinfo.soaptorest.service.impl.SoapRestServiceImpl;
import br.com.fsantosinfo.soaptorest.wsdl.generated.AddResponse;

@RestController
@RequestMapping("api/v1/converters")
public class SoapRestController {

    @Autowired
    private SoapRestServiceImpl service;

    @PostMapping("")
    public ResponseEntity<AddResponse> getValue(@RequestBody AddRequestDTO requestDTO) {
        return ResponseEntity.ok().body(this.service.getValue(requestDTO));
    }

}
