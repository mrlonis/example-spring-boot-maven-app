# example-spring-boot-maven-app

<!-- TOC -->
* [example-spring-boot-maven-app](#example-spring-boot-maven-app)
  * [Maven Plugins](#maven-plugins)
    * [spotless-maven-plugin](#spotless-maven-plugin)
    * [git-build-hook-maven-plugin](#git-build-hook-maven-plugin)
    * [maven-compiler-plugin](#maven-compiler-plugin)
    * [maven-enforcer-plugin](#maven-enforcer-plugin)
    * [maven-surefire-plugin](#maven-surefire-plugin)

<!-- TOC -->

## Maven Plugins

### spotless-maven-plugin

- GitHub: [https://github.com/diffplug/spotless/tree/main/plugin-maven](https://github.com/diffplug/spotless/tree/main/plugin-maven)
- Maven: [https://mvnrepository.com/artifact/com.diffplug.spotless/spotless-maven-plugin](https://mvnrepository.com/artifact/com.diffplug.spotless/spotless-maven-plugin)

### git-build-hook-maven-plugin

- GitHub: [https://github.com/rudikershaw/git-build-hook](https://github.com/rudikershaw/git-build-hook)
- Maven: [https://mvnrepository.com/artifact/com.rudikershaw.gitbuildhook/git-build-hook-maven-plugin](https://mvnrepository.com/artifact/com.rudikershaw.gitbuildhook/git-build-hook-maven-plugin)

### maven-compiler-plugin

```xml
<plugin>
  <groupId>org.apache.maven.plugins</groupId>
  <artifactId>maven-compiler-plugin</artifactId>
  <configuration>
    <compilerArgs>
      <arg>-Xlint:unchecked</arg>
      <!-- Only needed for Java 21+ -->
      <arg>-proc:full</arg>
    </compilerArgs>
    <showDeprecation>true</showDeprecation>
    <showWarnings>true</showWarnings>
  </configuration>
</plugin>
```

### maven-enforcer-plugin

This is only needed to perform the `mvn versions:display-plugin-updates` command with relevant Maven version information.

```xml
<plugin>
  <groupId>org.apache.maven.plugins</groupId>
  <artifactId>maven-enforcer-plugin</artifactId>
  <executions>
    <execution>
      <id>enforce-maven</id>
      <goals>
        <goal>enforce</goal>
      </goals>
      <configuration>
        <rules>
          <requireMavenVersion>
            <version>3.9</version>
          </requireMavenVersion>
        </rules>
      </configuration>
    </execution>
  </executions>
</plugin>
```

### maven-surefire-plugin

This is only needed for Java 21.

```xml
<plugin>
  <groupId>org.apache.maven.plugins</groupId>
  <artifactId>maven-surefire-plugin</artifactId>
  <configuration>
    <argLine>-XX:+EnableDynamicAgentLoading</argLine>
  </configuration>
</plugin>
```
