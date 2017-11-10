FROM ubuntu:14.04

RUN locale-gen en_GB.UTF-8
ENV LC_ALL     en_GB.UTF-8
RUN sudo apt-get update
RUN sudo apt-get install -q -y python-software-properties software-properties-common
RUN add-apt-repository ppa:webupd8team/java
RUN apt-get update
RUN echo "debconf shared/accepted-oracle-license-v1-1 select true" | sudo debconf-set-selections
RUN DEBIAN_FRONTEND=noninteractive apt-get install -y --force-yes --no-install-recommends oracle-java8-installer gradle
ENV JAVA_HOME /usr/lib/jvm/java-8-oracle
ADD . /
