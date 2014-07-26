
package entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporationList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorporationList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="employees" type="{corporation}EmployeeList"/>
 *         &lt;element name="clients" type="{corporation}ClientsList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporationList", namespace = "corporation", propOrder = {
    "employees",
    "clients"
})
public class CorporationList {

    @XmlElement(required = true)
    protected EmployeeList employees;
    @XmlElement(required = true)
    protected ClientsList clients;

    /**
     * Gets the value of the employees property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeList }
     *     
     */
    public EmployeeList getEmployees() {
        return employees;
    }

    /**
     * Sets the value of the employees property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeList }
     *     
     */
    public void setEmployees(EmployeeList value) {
        this.employees = value;
    }

    /**
     * Gets the value of the clients property.
     * 
     * @return
     *     possible object is
     *     {@link ClientsList }
     *     
     */
    public ClientsList getClients() {
        return clients;
    }

    /**
     * Sets the value of the clients property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientsList }
     *     
     */
    public void setClients(ClientsList value) {
        this.clients = value;
    }

}
