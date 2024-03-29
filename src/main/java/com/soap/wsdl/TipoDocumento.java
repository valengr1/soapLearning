//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v2.3.7 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.02.06 a las 01:19:34 AM ART 
//


package com.soap.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TipoDocumento.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="TipoDocumento"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Cuit"/&gt;
 *     &lt;enumeration value="Cuil"/&gt;
 *     &lt;enumeration value="Dni"/&gt;
 *     &lt;enumeration value="ConsumidorFinal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TipoDocumento", namespace = "http://schemas.datacontract.org/2004/07/SGE.Fwk.Domain.Core")
@XmlEnum
public enum TipoDocumento {

    @XmlEnumValue("Cuit")
    CUIT("Cuit"),
    @XmlEnumValue("Cuil")
    CUIL("Cuil"),
    @XmlEnumValue("Dni")
    DNI("Dni"),
    @XmlEnumValue("ConsumidorFinal")
    CONSUMIDOR_FINAL("ConsumidorFinal");
    private final String value;

    TipoDocumento(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoDocumento fromValue(String v) {
        for (TipoDocumento c: TipoDocumento.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
