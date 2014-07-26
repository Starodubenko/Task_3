
package entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Period.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Period">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="till 2:00"/>
 *     &lt;enumeration value="till 6:00"/>
 *     &lt;enumeration value="after 6:00"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Period", namespace = "corporation")
@XmlEnum
public enum Period {

    @XmlEnumValue("till 2:00")
    TILL_2_00("till 2:00"),
    @XmlEnumValue("till 6:00")
    TILL_6_00("till 6:00"),
    @XmlEnumValue("after 6:00")
    AFTER_6_00("after 6:00");
    private final String value;

    Period(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Period fromValue(String v) {
        for (Period c: Period.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
