# TEST-JAVA-BETWEEN

<!-- TABLE OF HEADER -->
[![Java][skill-java-shield]][skill-java-url]
[![Spring][skill-spring-shield]][skill-spring-url]
[![Lombok][skill-lombok-shield]][skill-lombok-url]
[![Maven][skill-maven-shield]][skill-maven-url]
[![DDD][documentation-DDD-shield]][documentation-DDD-url]

<!-- ABOUT THE PROJECT -->

## About The Project

`TEST-JAVA-BETWEEN` Get the right price by product built with a hexagonal architecture.

### Prerequisites

* [Java 17](https://www.oracle.com/java/technologies/downloads/#jdk17-linux)
* [IntelliJ IDEA](https://www.jetbrains.com/idea/download/#section=linux) ``Recomended``
* [Maven](https://maven.apache.org/install.html)

### Installation

#### Build artifact

**Using Java 17 as default JDK:**

**Now, you can**

#### Start Application

```shell
execute TestJavaBetweenApplication.java class
```

#### Run unit tests

*Integration Test*
```shell
execute GetPriceRestControllerTest.java class
```

<!-- USAGE EXAMPLES -->

## Usage

#### REST APIs

**rest get Example:**

```http://localhost:8080/api/v1/brands/1/products?applicationDate=2020-06-16T21:00:00&productId=35455```

*Use class for http test*
```test_java_between-endpoints.http```

*Swagger for test*
```http://localhost:8080/swagger-ui/index.html```

*bd h2 for test*
```http://localhost:8080/h2-console/```

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://shields.io/ -->

[skill-java-shield]: https://img.shields.io/badge/JAVA-17-blue

[skill-java-url]: https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html

[skill-spring-shield]: https://img.shields.io/badge/Spring%20Boot-3.0.3-blue

[skill-spring-url]: https://spring.io/guides/gs/spring-boot/

[skill-lombok-shield]: https://img.shields.io/badge/lombok-1.18.24-blue

[skill-lombok-url]: https://projectlombok.org/

[skill-maven-shield]: https://img.shields.io/badge/maven-3.8.6-blue

[skill-maven-url]: https://maven.apache.org/install.html

[documentation-DDD-shield]: https://img.shields.io/badge/DDD-clean%20architecture-orange

[documentation-DDD-url]: https://github.com/ddd-crew
