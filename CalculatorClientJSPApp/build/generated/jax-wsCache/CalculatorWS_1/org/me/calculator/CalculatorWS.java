
package org.me.calculator;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculatorWS", targetNamespace = "http://calculator.me.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculatorWS {


    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addition", targetNamespace = "http://calculator.me.org/", className = "org.me.calculator.Addition")
    @ResponseWrapper(localName = "additionResponse", targetNamespace = "http://calculator.me.org/", className = "org.me.calculator.AdditionResponse")
    @Action(input = "http://calculator.me.org/CalculatorWS/additionRequest", output = "http://calculator.me.org/CalculatorWS/additionResponse")
    public int addition(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b);

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "multiplication", targetNamespace = "http://calculator.me.org/", className = "org.me.calculator.Multiplication")
    @ResponseWrapper(localName = "multiplicationResponse", targetNamespace = "http://calculator.me.org/", className = "org.me.calculator.MultiplicationResponse")
    @Action(input = "http://calculator.me.org/CalculatorWS/multiplicationRequest", output = "http://calculator.me.org/CalculatorWS/multiplicationResponse")
    public int multiplication(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b);

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modulodivision", targetNamespace = "http://calculator.me.org/", className = "org.me.calculator.Modulodivision")
    @ResponseWrapper(localName = "modulodivisionResponse", targetNamespace = "http://calculator.me.org/", className = "org.me.calculator.ModulodivisionResponse")
    @Action(input = "http://calculator.me.org/CalculatorWS/modulodivisionRequest", output = "http://calculator.me.org/CalculatorWS/modulodivisionResponse")
    public int modulodivision(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b);

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "substraction", targetNamespace = "http://calculator.me.org/", className = "org.me.calculator.Substraction")
    @ResponseWrapper(localName = "substractionResponse", targetNamespace = "http://calculator.me.org/", className = "org.me.calculator.SubstractionResponse")
    @Action(input = "http://calculator.me.org/CalculatorWS/substractionRequest", output = "http://calculator.me.org/CalculatorWS/substractionResponse")
    public int substraction(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b);

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "division", targetNamespace = "http://calculator.me.org/", className = "org.me.calculator.Division")
    @ResponseWrapper(localName = "divisionResponse", targetNamespace = "http://calculator.me.org/", className = "org.me.calculator.DivisionResponse")
    @Action(input = "http://calculator.me.org/CalculatorWS/divisionRequest", output = "http://calculator.me.org/CalculatorWS/divisionResponse")
    public int division(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b);

}