
# SAML Extensions

Libraries containing implementations of the SAML extensions defined in the [IDA Saml Profile]("https://www.gov.uk/government/publications/identity-assurance-hub-servi\
ce-saml-20-profile"). Additionally it provides:

* Bootstrapping of extensions into SAML environment
* Test utilities for SAML extension classes

### Building the project

Locally:

```bash
./gradlew clean build
```

Or to reproduce exactly what the build server does, with docker:

```bash
docker build verify-saml-extensions
docker run build
```

## Licence

[MIT Licence](LICENCE)

This code is provided for informational purposes only and is not yet intended for use outside GOV.UK Verify
