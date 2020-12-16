# MultiAPI mono-repo application

## What to test/address?

- [x] Project configuration
  - [x] application-*.yaml
    - [x] All configuration in boostrap module
    - [x] Configuration in every module and use spring/maven profiles to activate both module/dependency and module configuration
- [x] project layout (code split in modules)
- [x] singleton/common beans
  - [x] kafka
  - [x] cassandra
  - [ ] Does this requires per module configuration??? Per module Kafka/Cassandra configuration?
- [ ] Proxying/AOP
  - [ ] for beans in modules
  - [ ] How companion frameworks (M ) are affected
  - [ ] Spring Web Filters
- [x] ConfigurationProperties in modules
- [x] fatjar
- [x] run the application with java -jar 
  ```shell script
    ./mvnw clean install -P<profiles>
    java -Dspring.profiles.active=default,apitwo  -jar ./app/target/app-0.0.1-SNAPSHOT.jar 
  ```
  - [ ] More run configuration here, such as `-pl module_name spring-boot:run` 
  
- [ ] How is maven assembly affected?
- [ ] How is ADO pipeline affected?
- [ ] Testing
  - [ ] Integration tests
      - [ ] on a specific module
          - [ ] IDE
          - [ ] maven command
      - [ ] entire project
          - [ ] IDE
          - [ ] maven command
  - [ ] PerfTest
  - [ ] e2e
 - [ ] Check the support in idea
 - [ ] Check used frameworks (M & V)
 
## API development guideline:

- avoid yaml keys' names clash by using per-api name space. 

  ```yaml
  apione:
    name: ApiOne  
  ``` 
- avoid spring bean collisions. @Qualifier or naming conventions... something else.
