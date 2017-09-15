package uk.gov.ida.saml.core.extensions.eidas;

import org.opensaml.saml.common.xml.SAMLConstants;
import org.opensaml.saml.saml2.core.AttributeValue;
import uk.gov.ida.saml.core.IdaConstants;

import javax.xml.namespace.QName;

public interface PersonIdentifier extends AttributeValue {

    /** Element local name. */
    String DEFAULT_ELEMENT_LOCAL_NAME = "AttributeValue";

    /** Default element name. */
    QName DEFAULT_ELEMENT_NAME = new QName(SAMLConstants.SAML20_NS, DEFAULT_ELEMENT_LOCAL_NAME, SAMLConstants.SAML20_PREFIX);

    /**  Local name of the XSI type. */
    String TYPE_LOCAL_NAME = "PersonIdentifierType";

    /** QName of the XSI type. */
    QName TYPE_NAME = new QName(null, TYPE_LOCAL_NAME, IdaConstants.EIDAS_NATURUAL_PREFIX);

    /**
     * Return the person identifier.
     *
     * @return the person identifier
     */
    public String getPersonIdentifier();

    /**
     * Set the person identifier.
     *
     * @param personIdentifier the person identifier
     */
    public void setPersonIdentifier(String personIdentifier);
}
