package uk.gov.ida.saml.core;

public interface IdaConstants {

    String EIDAS_NS = "http://eidas.europa.eu/saml-extensions";
    String EIDAS_PREFIX = "eidas";
    String IDA_NS = "http://www.cabinetoffice.gov.uk/resource-library/ida/attributes";
    String IDA_PREFIX = "ida";
    String IDA_MD_NS = "urn:uk:gov:cabinet-office:tc:saml:metadata:extensions";
    String IDA_MD_PREFIX = "ext";
    String SAML_VERSION_NUMBER = "2.0";
    String DATETIME_FORMAT = "yyyy-MM-dd";
    String IDA_LANGUAGE = "en-GB";

    interface Attributes_1_1 {

        interface IdpFraudEventId {
            String FRIENDLY_NAME = "IDPFraudEventID";
            String NAME = "FECI_IDPFraudEventID";
        }

        interface GPG45Status {
            String FRIENDLY_NAME = "GPG45Status";
            String NAME = "FECI_GPG45Status";
        }

        interface Firstname {
            String FRIENDLY_NAME = "Firstname";
            String NAME = "MDS_firstname";
        }

        interface Middlename {
            String FRIENDLY_NAME = "Middlename(s)";
            String NAME = "MDS_middlename";
        }

        interface Surname {
            String FRIENDLY_NAME = "Surname";
            String NAME = "MDS_surname";
        }

        interface Gender {
            String FRIENDLY_NAME = "Gender";
            String NAME = "MDS_gender";
        }

        interface DateOfBirth {
            String FRIENDLY_NAME = "Date of Birth";
            String NAME = "MDS_dateofbirth";
        }

        interface CurrentAddress {
            String FRIENDLY_NAME = "Current Address";
            String NAME = "MDS_currentaddress";
        }

        interface PreviousAddress {
            String FRIENDLY_NAME = "Previous Address";
            String NAME = "MDS_previousaddress";
        }

        interface IPAddress {
            String FRIENDLY_NAME = "IPAddress";
            String NAME = "TXN_IPaddress";
        }
    }
}
