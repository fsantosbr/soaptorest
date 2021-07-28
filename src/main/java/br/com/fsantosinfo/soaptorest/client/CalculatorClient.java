package br.com.fsantosinfo.soaptorest.client;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import br.com.fsantosinfo.soaptorest.wsdl.generated.Add;
import br.com.fsantosinfo.soaptorest.wsdl.generated.AddResponse;

public class CalculatorClient extends WebServiceGatewaySupport {

    public AddResponse getCalc(Add request, String soapAction) {

        AddResponse addRes = (AddResponse) getWebServiceTemplate().marshalSendAndReceive(request,
                new SoapActionCallback(soapAction));
        // ResultDTO resultDto = new ResultDTO();
        // resultDto.setAddResult(addRes.getAddResult());
        // return resultDto;
        return addRes;
    }
}
