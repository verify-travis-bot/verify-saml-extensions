package uk.gov.ida.saml.core.extensions.eidas;

import org.opensaml.saml.common.xml.SAMLConstants;
import org.opensaml.saml.saml2.core.AttributeValue;
import uk.gov.ida.saml.core.IdaConstants;

import javax.xml.namespace.QName;

import static uk.gov.ida.saml.core.IdaConstants.EIDAS_NATURAL_PERSON_NS;

public interface CurrentFamilyName extends AttributeValue {

    /** Element local name. */
    String DEFAULT_ELEMENT_LOCAL_NAME = "AttributeValue";

    /** Default element name. */
    QName DEFAULT_ELEMENT_NAME = new QName(SAMLConstants.SAML20_NS, DEFAULT_ELEMENT_LOCAL_NAME, SAMLConstants.SAML20_PREFIX);

    /**  Local name of the XSI type. */
    String TYPE_LOCAL_NAME = "CurrentFamilyNameType";

    /** QName of the XSI type. */
    QName TYPE_NAME = new QName(EIDAS_NATURAL_PERSON_NS, TYPE_LOCAL_NAME, IdaConstants.EIDAS_NATURUAL_PREFIX);

    /**
     * Return the family name.
     *
     * @return the family name
     */
    public String getFamilyName();

    /**
     * Set the family name.
     *
     * @param familyName the family name
     */
    public void setFamilyName(String familyName);
}
