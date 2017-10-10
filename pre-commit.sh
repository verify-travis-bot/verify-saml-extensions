#!/bin/sh

./gradlew --daemon --parallel clean build test

tput setaf 3
printf "\nOnce you publish a new version "
tput bold
printf "PLEASE DON'T FORGET "
tput sgr0
tput setaf 3
printf "to update the following dependent projects:\n"

printf "\n saml-serializers"
printf "\n saml-security"
printf "\n hub-saml"
printf "\n stub-idp-saml"
printf "\n ida-hub"
printf "\n ida-compliance-tool"
printf "\n verify-service-provider"
echo

tput bold
printf "\nThank you! :)\n\n"
tput sgr0
