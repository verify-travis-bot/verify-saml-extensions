
# SAML Extensions
hi
Libraries containing implementations of the SAML extensions defined in the [IDA Saml Profile]("https://www.gov.uk/government/publications/identity-assurance-hub-servi\
ce-saml-20-profile"). Additionally it provides:

* Bootstrapping of extensions into SAML environment
* Test utilities for SAML extension classes

### Building the project

`./gradlew clean build`

### Editing .travis.yml

If you plan to edit this file please enable the pre-commit check which lints it, preventing mistakes.
To do so, first install [pre-commit](http://pre-commit.com) and then run `pre-commit install`.
On an OSX system this amounts to:

```bash
brew install pre-commit
pre-commit install
```

## Licence

[MIT Licence](LICENCE)

This code is provided for informational purposes only and is not yet intended for use outside GOV.UK Verify
