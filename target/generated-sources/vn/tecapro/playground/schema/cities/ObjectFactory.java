//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.01 at 05:10:36 PM ICT 
//


package vn.tecapro.playground.schema.cities;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the vn.tecapro.playground.schema.cities package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: vn.tecapro.playground.schema.cities
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCityByCodeResponse }
     * 
     */
    public GetCityByCodeResponse createGetCityByCodeResponse() {
        return new GetCityByCodeResponse();
    }

    /**
     * Create an instance of {@link City }
     * 
     */
    public City createCity() {
        return new City();
    }

    /**
     * Create an instance of {@link GetCountryByCityNameRequest }
     * 
     */
    public GetCountryByCityNameRequest createGetCountryByCityNameRequest() {
        return new GetCountryByCityNameRequest();
    }

    /**
     * Create an instance of {@link GetCountryByCityNameResponse }
     * 
     */
    public GetCountryByCityNameResponse createGetCountryByCityNameResponse() {
        return new GetCountryByCityNameResponse();
    }

    /**
     * Create an instance of {@link GetCityByCodeRequest }
     * 
     */
    public GetCityByCodeRequest createGetCityByCodeRequest() {
        return new GetCityByCodeRequest();
    }

}
