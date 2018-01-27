# Spring Boot lightning talk

This repository hosts several spring-boot projects and resources for a lightning talk on spring-boot and how spring-boot's starters and autoconfigure works under the hoood.

# Table of Contents
* [Resources](#resources)
* [Introduction](#intro)
* [Tiny sample Project](#tiny_sample)

## <a name="resources"></a>Resources

[Spring Boot Reference Guide][0]

[Create a Custom Auto-Configuration with Spring Boot][1]

[Spring Initializr][2]

[GitHub repository containing a custom starter][4]

## <a name="intro"></a>Introduction

From https://projects.spring.io/spring-boot/:

> Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run". We take an opinionated view of the Spring platform and third-party libraries so you can get started with minimum fuss. Most Spring Boot applications need very little Spring configuration.

> Features

> Create stand-alone Spring applications

> Embed Tomcat, Jetty or Undertow directly (no need to deploy WAR files)

> Provide opinionated 'starter' POMs to simplify your Maven configuration

> Automatically configure Spring whenever possible

> Provide production-ready features such as metrics, health checks and externalized configuration

> Absolutely no code generation and no requirement for XML configuration

## <a name="tiny_sample"></a>Tiny sample project

The code for this project is [here](../master/spring-boot-lightning_1).

Note the following things:
* the easiest way to get the maven references is to have spring-boot-starter-parent as parent pom
* our only dependency is spring-boot-starter-web (ignore the test)
* there a main class annotated with @SpringBootApplication
* there is a small rest controller
* the controller's end point can be accessed at http://localhost:8080/helloworld

Questions:
* Where does the tomcat come from?
* Where does the tomcat's port come from?
* How come there is a working DispatcherServlet?
* How come there is a WebApplicationContext?

[Take a look][3] at the pains you usually have to go through to configure and understand Spring web MVC.

Here's the source of spring-boot's 1.5.9 [WebMvcAutoConfiguration.java][5].

That configuration does the heavy lifting to configure most of what you need to integrate web-mvc into your project. Spring does this via condition annotations ([documentation][6]).


[0]: https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle
[1]: http://www.baeldung.com/spring-boot-custom-auto-configuration
[2]: https://start.spring.io/
[3]: https://docs.spring.io/spring/docs/3.2.x/spring-framework-reference/html/mvc.html#mvc-servlet
[4]: https://github.com/martinfoersterling/spring-boot-autoremote
[5]: https://github.com/spring-projects/spring-boot/blob/v1.5.9.RELEASE/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/web/WebMvcAutoConfiguration.java
[6]: https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-developing-auto-configuration.html#boot-features-condition-annotations
