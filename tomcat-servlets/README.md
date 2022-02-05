# Java Servlets

## Description

This repository contains a simple Apache Tomcat Servlet Example

## Usage
### Installing

 - Apache Tomcat 10.0.16 [Download Apache Tomcat](https://tomcat.apache.org/download-10.cgi)
 - Intellij IDEA

### Folder structure

```
tomcat-servlets/    # Root directory.
|- src/             # Servlets Directory
|-  |- FirstServlet.java
|- web/             # Webapps Directory
|   |- WEB-INF/
|      |- web.xml
|   |- index.html
```

### Configuring IntelliJ IDEA 
###### Add Tomcat Server
![img_3.png](docs/img_3.png)
###### Add servlet jar files
- File > Project Structure ...

![img_4.png](docs/img_4.png)

### Tomcat Localhost Log (IntelliJ IDEA)
![img_2.png](docs/img_2.png)
### Output
http://localhost:8080/tomcat_servlets/

![img_1.png](docs/img_1.png)

http://localhost:8080/tomcat_servlets/servlet

![img.png](docs/img.png)