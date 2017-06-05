# Java Maven-based project analyzed on SonarCloud using Travis

[![Build status](https://travis-ci.org/SonarSource/sq-com_example_java-maven-travis.svg?branch=master)](https://travis-ci.org/SonarSource/sq-com_example_java-maven-travis) [![Quality Gate](https://sonarcloud.io/api/badges/gate?key=com.sonarqube.examples:java-maven-travis-project)](https://sonarcloud.io/dashboard/index/com.sonarqube.examples:java-maven-travis-project)

#### This project is analysed on [SonarCloud](https://sonarcloud.io)!

It is very easy to run an analysis on a Maven-based project and push it to SonarCloud.
You simply have to do 2 things in your `.travis.yml` file:
* Activate the [Travis Add-on](https://docs.travis-ci.com/user/sonarqube/)
* Run `mvn sonar:sonar` at some point of time in the `script` section

You can take a look at the [.travis.yml file](https://github.com/SonarSource/sq-com_example_java-maven-travis/blob/master/.travis.yml)
of this project to see it in practice.
