# config-client
### Dependency

- spring-boot-starter-actuator : to refresh
- spring-boot-starter-web // to test visa REST aPI
- spring-cloud-starter-config


### configuration
* bootstrap.properties
 - spring.application.name=config-client // name of the app
 - spring.cloud.config.uri=http://localhost:8091 // seerver url
 - management.security.enabled=false // 
