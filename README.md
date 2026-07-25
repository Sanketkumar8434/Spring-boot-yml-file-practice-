# Spring Boot YAML File Practice

A small Spring Boot project demonstrating how to bind external configuration from a `application.yaml` file into a Java object using `@ConfigurationProperties`, covering simple values, arrays, collections (`List`, `Set`, `Map`), and nested POJOs.

## Overview

This project defines an `Employee` bean whose fields are populated directly from `application.yaml` at startup — no manual parsing required. On launch, the bound `Employee` object is fetched from the Spring context and printed to the console, showing how each YAML structure maps to its corresponding Java type.

## Tech Stack

- **Java 17**
- **Spring Boot** (`spring-boot-starter`)
- **Lombok**
- **Maven**

## What It Demonstrates

`Employee.java` is annotated with `@ConfigurationProperties(prefix = "emp.details")` and binds the following kinds of properties from YAML:

| Property Type | Field | YAML Structure |
|---|---|---|
| Simple property | `eno`, `eName`, `eAddress` | Plain key-value |
| Array property | `favColor` | YAML list → `String[]` |
| Collection property | `nickName` | YAML list → `List<String>` |
| Collection property | `phoneNumber` | YAML list → `Set<Long>` |
| Collection property | `IdDetails` | YAML map → `Map<String, Long>` |
| Nested object (HAS-A) | `project` | Nested YAML block → `Project` POJO |

`Project.java` is a plain nested POJO (`Id`, `name`, `addrs`, `size`) bound automatically as part of the `project` block under `emp.details`.

## Project Structure

```
SpringBootYmlFilePractice
├── src
│   ├── main
│   │   ├── java/com/sanket
│   │   │   ├── Employee.java
│   │   │   ├── Project.java
│   │   │   └── SpringBootYmlFilePracticeApplication.java
│   │   └── resources
│   │       └── application.yaml
│   └── test
│       └── java/com/sanket
│           └── SpringBootYmlFilePracticeApplicationTests.java
├── pom.xml
├── mvnw
└── mvnw.cmd
```

## Prerequisites

- JDK 17+
- Maven (or use the included `mvnw` wrapper)

## Running the Application

Using the Maven wrapper:

```bash
./mvnw spring-boot:run
```

Or with a local Maven install:

```bash
mvn spring-boot:run
```

On startup, the app prints the fully bound `Employee` object (via Lombok's `@Data`-generated `toString()`), showing all simple, array, collection, and nested values pulled from `application.yaml`.

## Running Tests

```bash
./mvnw test
```

## Note on `application.yaml`

The sample `emp.details.IdDetails` and `emp.details.phoneNumber` entries in this repo contain placeholder-looking government ID and phone number values used purely to demonstrate `Map`/`Set` binding. If you're using this repo as a portfolio/practice reference, consider swapping these for clearly fake sample data (e.g. `123-456-789`) so nothing that looks like real personal identifiers sits in a public repo.

## Author

**Sanket Kumar**
GitHub: [@Sanketkumar8434](https://github.com/Sanketkumar8434)
