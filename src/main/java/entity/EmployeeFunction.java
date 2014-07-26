
package entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeFunction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmployeeFunction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Dispatcher"/>
 *     &lt;enumeration value="Forwarder"/>
 *     &lt;enumeration value="Driver"/>
 *     &lt;enumeration value="Loader"/>
 *     &lt;enumeration value="Cook"/>
 *     &lt;enumeration value="Jurist"/>
 *     &lt;enumeration value="Accountant"/>
 *     &lt;enumeration value="Manager"/>
 *     &lt;enumeration value="Director"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmployeeFunction", namespace = "corporation")
@XmlEnum
public enum EmployeeFunction {

    @XmlEnumValue("Dispatcher")
    DISPATCHER("Dispatcher"),
    @XmlEnumValue("Forwarder")
    FORWARDER("Forwarder"),
    @XmlEnumValue("Driver")
    DRIVER("Driver"),
    @XmlEnumValue("Loader")
    LOADER("Loader"),
    @XmlEnumValue("Cook")
    COOK("Cook"),
    @XmlEnumValue("Jurist")
    JURIST("Jurist"),
    @XmlEnumValue("Accountant")
    ACCOUNTANT("Accountant"),
    @XmlEnumValue("Manager")
    MANAGER("Manager"),
    @XmlEnumValue("Director")
    DIRECTOR("Director");
    private final String value;

    EmployeeFunction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmployeeFunction fromValue(String v) {
        for (EmployeeFunction c: EmployeeFunction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
