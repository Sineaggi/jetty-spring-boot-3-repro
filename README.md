# To reproduce

Run the app
```shell
gradle bootRun
```
or run the tests
```shell
gradle test
```

Should see
```text
org.springframework.context.ApplicationContextException: Unable to start web server
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.onRefresh(ServletWebServerApplicationContext.java:164) ~[spring-boot-3.0.0.jar:3.0.0]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:578) ~[spring-context-6.0.2.jar:6.0.2]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.0.0.jar:3.0.0]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:730) ~[spring-boot-3.0.0.jar:3.0.0]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:432) ~[spring-boot-3.0.0.jar:3.0.0]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:308) ~[spring-boot-3.0.0.jar:3.0.0]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1302) ~[spring-boot-3.0.0.jar:3.0.0]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1291) ~[spring-boot-3.0.0.jar:3.0.0]
	at org.example.Main.main(Main.java:9) ~[main/:na]
Caused by: java.lang.NoClassDefFoundError: jakarta/servlet/http/HttpSessionContext
Caused by: java.lang.NoClassDefFoundError: jakarta/servlet/http/HttpSessionContext

	at org.eclipse.jetty.servlet.ServletContextHandler.newSessionHandler(ServletContextHandler.java:339) ~[jetty-servlet-11.0.12.jar:11.0.12]
	at org.eclipse.jetty.servlet.ServletContextHandler.getSessionHandler(ServletContextHandler.java:432) ~[jetty-servlet-11.0.12.jar:11.0.12]
	at org.eclipse.jetty.servlet.ServletContextHandler.relinkHandlers(ServletContextHandler.java:257) ~[jetty-servlet-11.0.12.jar:11.0.12]
	at org.eclipse.jetty.servlet.ServletContextHandler.<init>(ServletContextHandler.java:180) ~[jetty-servlet-11.0.12.jar:11.0.12]
	at org.eclipse.jetty.webapp.WebAppContext.<init>(WebAppContext.java:301) ~[jetty-webapp-11.0.12.jar:11.0.12]
	at org.eclipse.jetty.webapp.WebAppContext.<init>(WebAppContext.java:228) ~[jetty-webapp-11.0.12.jar:11.0.12]
	at org.springframework.boot.web.embedded.jetty.JettyEmbeddedWebAppContext.<init>(JettyEmbeddedWebAppContext.java:28) ~[spring-boot-3.0.0.jar:3.0.0]
	at org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory.getWebServer(JettyServletWebServerFactory.java:158) ~[spring-boot-3.0.0.jar:3.0.0]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.createWebServer(ServletWebServerApplicationContext.java:183) ~[spring-boot-3.0.0.jar:3.0.0]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.onRefresh(ServletWebServerApplicationContext.java:161) ~[spring-boot-3.0.0.jar:3.0.0]
	... 8 common frames omitted
Caused by: java.lang.ClassNotFoundException: jakarta.servlet.http.HttpSessionContext
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641) ~[na:na]
Caused by: java.lang.ClassNotFoundException: jakarta.servlet.http.HttpSessionContext

	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188) ~[na:na]
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:520) ~[na:na]
	... 18 common frames omitted
```

