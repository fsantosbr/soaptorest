package br.com.fsantosinfo.soaptorest.service;

import br.com.fsantosinfo.dto.AddRequestDTO;
import br.com.fsantosinfo.soaptorest.wsdl.generated.AddResponse;

public interface SoapRestService {
    
    AddResponse getValue(AddRequestDTO request);
}
