package uk.gov.ida.saml.core.extensions.eidas.impl;

import org.opensaml.core.xml.XMLObject;
import org.opensaml.saml.common.AbstractSAMLObjectUnmarshaller;
import uk.gov.ida.saml.core.extensions.eidas.CurrentFamilyName;

public class CurrentFamilyNameUnmarshaller extends AbstractSAMLObjectUnmarshaller {

    /** {@inheritDoc} */
    protected void processElementContent(XMLObject samlObject, String elementContent) {
        CurrentFamilyName currentFamilyName = (CurrentFamilyName) samlObject;
        currentFamilyName.setFamilyName(elementContent);
    }
}
