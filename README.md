# Selenium-SpringBoot-TestNG
    @Configuration - used to mark a class as a source of the bean definitions. Beans are the components of the system that you want to wire together. A method marked with the @Bean annotation is a bean producer. Spring will handle the life cycle of the beans for you, and it will use these methods to create the beans.
    @ComponentScan -use to make sure that Spring knows about your configuration classes and can initialize the beans correctly. It makes Spring scan the packages configured with it for the @Configuration classes.
    @Import -  If you need even more precise control of the configuration classes, you can always use @import  to load additional configuration. This one works even when you specify the beans in an XML file like it's 1999.
    @Component - Another way to declare a bean is to mark a class with a @Component annotation. Doing this turns the class into a Spring bean at the auto-scan time.
    @Service - Mark a specialization of a @Component. It tells Spring that it's safe to manage them with more freedom than regular components. Remember, services have no encapsulated state.
    @Autowired - To wire the application parts together, use the @Autowired on the fields, constructors, or methods in a component. Spring's dependency injection mechanism wires appropriate beans into the class members marked with @Autowired.
    @Bean - A method-level annotation to specify a returned bean to be managed by Spring context. The returned bean has the same name as the factory method.
    @Lookup - tells Spring to return an instance of the method's return type when we invoke it.
    @Primary - gives higher preference to a bean when there are multiple beans of the same type.
    @Required - shows that the setter method must be configured to be dependency-injected with a value at configuration time. Use @Required on setter methods to mark dependencies populated through XML. Otherwise, a BeanInitializationException is thrown.
    @Value - used to assign values into fields in Spring-managed beans. It's compatible with the constructor, setter, and field injection.
    @DependsOn - makes Spring initialize other beans before the annotated one. Usually, this behavior is automatic, based on the explicit dependencies between beans. The @DependsOn annotation may be used on any class directly or indirectly annotated with @Component or on methods annotated with @Bean.
    @Lazy - makes beans to initialize lazily. @Lazy annotation may be used on any class directly or indirectly annotated with @Component or on methods annotated with @Bean.
    @Scope - used to define the scope of a @Component class or a @Bean definition and can be either singleton, prototype, request, session, globalSession, or custom scope.
    @Profile - adds beans to the application only when that profile is active.
