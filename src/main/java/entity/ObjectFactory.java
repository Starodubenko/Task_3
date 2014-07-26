
package entity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the entity package. 
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

    private final static QName _Clients_QNAME = new QName("corporation", "clients");
    private final static QName _Corporation_QNAME = new QName("corporation", "Corporation");
    private final static QName _Employees_QNAME = new QName("corporation", "employees");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: entity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CorporationList }
     * 
     */
    public CorporationList createCorporationList() {
        return new CorporationList();
    }

    /**
     * Create an instance of {@link ClientsList }
     * 
     */
    public ClientsList createClientsList() {
        return new ClientsList();
    }

    /**
     * Create an instance of {@link EmployeeList }
     * 
     */
    public EmployeeList createEmployeeList() {
        return new EmployeeList();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link FullName }
     * 
     */
    public FullName createFullName() {
        return new FullName();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientsList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "corporation", name = "clients")
    public JAXBElement<ClientsList> createClients(ClientsList value) {
        return new JAXBElement<ClientsList>(_Clients_QNAME, ClientsList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorporationList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "corporation", name = "Corporation")
    public JAXBElement<CorporationList> createCorporation(CorporationList value) {
        return new JAXBElement<CorporationList>(_Corporation_QNAME, CorporationList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "corporation", name = "employees")
    public JAXBElement<EmployeeList> createEmployees(EmployeeList value) {
        return new JAXBElement<EmployeeList>(_Employees_QNAME, EmployeeList.class, null, value);
    }

}
