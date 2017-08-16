# ida-saml-extensions

`ida-saml-extensions` contains the OpenSaml implementations of extensions, typically attributes, defined in the [IDA Saml Profile]("https://www.gov.uk/government/publications/identity-assurance-hub-service-saml-20-profile").

In addition, it also contains IdaSamlBootstrap class that provides the bootstrapping of these extensions into the SAML environment.

##

There is a `ida-saml-extensions-test` library which provides builders for using the extensions in tests and JUnit runners using the bootstrapper.

## Version

Versioning follows the following pattern:
```
uk.gov.ida:ida-saml-extensions:$OPENSAML_MAJOR-$PROFILE_VERSION-$BUILD_NUMBER
```
