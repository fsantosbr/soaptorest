package br.com.fsantosinfo.soaptorest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fsantosinfo.dto.AddRequestDTO;
import br.com.fsantosinfo.soaptorest.client.CalculatorClient;
import br.com.fsantosinfo.soaptorest.service.SoapRestService;
import br.com.fsantosinfo.soaptorest.wsdl.generated.Add;
import br.com.fsantosinfo.soaptorest.wsdl.generated.AddResponse;

@Service
public class SoapRestServiceImpl implements SoapRestService {

    private static final String SOAP_ACTION = "http://tempuri.org/Add";

    @Autowired
    private CalculatorClient client;

    @Override
    public AddResponse getValue(AddRequestDTO request) {
        Add adicao = new Add();
        adicao.setIntA(request.getIntA());
        adicao.setIntB(request.getIntB());

        return client.getCalc(adicao, SOAP_ACTION);
    }

}
