This plugin is a fork of [`org.codehaus.mojo:exec-maven-plugin`](http://mojo.codehaus.org/exec-maven-plugin/) version 1.3.  The main differences are:

* It does not have the `exec:java` goal
* It flushes stdout, stderr, and output file whenever it seeds a newline character to make this plugin useful for the execution of interactive applications.

Please do not mix this plugin with the original one; they have the same plugin prefix. (`exec:*`)

To use this plugin, add the following `<plugin/>` section to your `pom.xml`'s `<build/>` section:

```xml
<project>
  <build>
    <plugins>
      <plugin>
        <groupId>kr.motd.maven</groupId>
        <artifactId>exec-maven-plugin</artifactId>
        <version>1.0.0.Final</version>
        ...
      </plugin>
      ...
    </plugins>
  </build>
</project>
```

