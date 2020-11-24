package uy.gub.agesic.pdi.services.apigateway.util;

import uy.gub.agesic.pdi.common.message.canonical.Canonical;
import uy.gub.agesic.pdi.common.message.soap.SoapPayload;
import uy.gub.agesic.pdi.common.soap.DataUtil;

public class CanonicalProcessor {

    public static Canonical<SoapPayload> createSoapCanonical(byte[] data) {

        Canonical<SoapPayload> canonical = new Canonical<>();
        SoapPayload soapPayload = new SoapPayload();
        String dataEncoded = DataUtil.encode(data);
        soapPayload.setBase64Data(dataEncoded);
        canonical.setPayload(soapPayload);
        canonical.getHeaders().put("type", "soap");
        return canonical;
    }

    public static byte[] getData(Canonical<SoapPayload> canonical) {
        SoapPayload soapPayload = canonical.getPayload();

        String dataEncoded = soapPayload.getBase64Data();
        if (dataEncoded != null) {
            return DataUtil.decode(dataEncoded);
        }
        return null;
    }
}
