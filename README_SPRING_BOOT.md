# Spring Boot Annotations

Spring Boot provides a wide range of annotations to simplify application development. These annotations help configure, integrate, and define application behavior without requiring extensive XML configuration. This README outlines the default and commonly used annotations categorized by functionality, such as web, data, and security.

---

## Table of Contents

1. [Introduction](#introduction)
2. [Default Provided Annotations](#default-provided-annotations)
3. [Commonly Used Annotations](#commonly-used-annotations)
    - [Core Annotations](#core-annotations)
    - [Web](#web)
    - [Data](#data)
    - [Security](#security)
    - [Testing](#testing)

---

## Introduction

Spring Boot annotations simplify application development by reducing boilerplate code and leveraging Spring’s powerful dependency injection mechanism. With these annotations, developers can configure and manage components, define REST endpoints, secure applications, and interact with databases seamlessly. This guide categorizes and explains the most widely used annotations in Spring Boot.

---

## Default Provided Annotations

### @SpringBootApplication
- Marks the main class of a Spring Boot application.
- Combines three annotations: `@Configuration`, `@EnableAutoConfiguration`, and `@ComponentScan`.

```java
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
```

### @Configuration
- Indicates that the class has `@Bean` definition methods.
- Used for Java-based configuration.

### @Bean
- Marks a method as a bean producer.
- Beans are managed by the Spring container.

### @ComponentScan
- Automatically detects and registers beans from specified packages.
- Default scan is the package where the application resides.

### @EnableAutoConfiguration
- Enables Spring Boot’s auto-configuration feature.
- Automatically configures beans based on classpath dependencies.

---

## Commonly Used Annotations

### Core Annotations

- **@Component**: Marks a class as a Spring-managed component.
- **@Service**: Specialization of `@Component` for service-layer classes.
- **@Repository**: Specialization of `@Component` for DAO or repository classes.
- **@Autowired**: Performs dependency injection.
- **@Value**: Injects values from properties or environment variables.
- **@Scope**: Defines the bean’s lifecycle scope (e.g., singleton, prototype).

### Web

- **@RestController**: Combines `@Controller` and `@ResponseBody` for RESTful services.
- **@RequestMapping**: Maps HTTP requests to handler methods or classes.
    - Can be specialized using:
        - `@GetMapping`
        - `@PostMapping`
        - `@PutMapping`
        - `@DeleteMapping`
        - `@PatchMapping`

```java
@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}
```

- **@PathVariable**: Binds URI path variables to method parameters.
- **@RequestParam**: Binds query parameters to method parameters.
- **@RequestBody**: Maps the request body to a method parameter.
- **@ResponseStatus**: Specifies the HTTP status for a method.
- **@CrossOrigin**: Enables CORS for cross-origin requests.

### Data

- **@Entity**: Marks a class as a JPA entity.
- **@Id**: Specifies the primary key for a JPA entity.
- **@GeneratedValue**: Specifies the primary key generation strategy.
- **@Table**: Maps the entity to a database table.
- **@Column**: Maps a field to a table column.
- **@OneToOne**, **@OneToMany**, **@ManyToOne**, **@ManyToMany**: Define entity relationships.
- **@Repository**: Indicates that the class interacts with the database.
- **@EnableJpaRepositories**: Enables JPA repository support.
- **@Transactional**: Marks methods or classes for transaction management.

```java
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    // Getters and Setters
}
```

### Security

- **@EnableWebSecurity**: Enables Spring Security configuration.
- **@PreAuthorize**: Restricts access to methods based on roles or permissions.
- **@Secured**: Restricts access using roles.
- **@WithMockUser**: Simulates an authenticated user in tests.
- **@AuthenticationPrincipal**: Access the currently authenticated user.

```java
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .antMatchers("/admin/**").hasRole("ADMIN")
            .antMatchers("/public/**").permitAll()
            .and()
            .formLogin();
    }
}
```

### Testing

- **@SpringBootTest**: Provides an application context for tests.
- **@MockBean**: Creates mock beans for testing.
- **@WebMvcTest**: Tests Spring MVC controllers.
- **@DataJpaTest**: Tests JPA repositories.
- **@BeforeEach** / **@AfterEach**: Run setup/teardown code before/after each test.

```java
@SpringBootTest
public class ApplicationTests {

    @Test
    void contextLoads() {
        assertTrue(true);
    }
}
```

---

## Conclusion

Spring Boot annotations significantly enhance development efficiency by reducing boilerplate code and improving readability. This README highlights key annotations organized by functionality, providing a strong foundation for building robust Spring Boot applications. For more details, refer to the [Spring Boot Documentation](https://spring.io/projects/spring-boot).

