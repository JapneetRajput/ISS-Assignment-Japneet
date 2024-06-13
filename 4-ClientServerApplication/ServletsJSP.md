# Servlets, JSP, and Mapping Servlets

## Servlets

### What are Servlets?

Servlets are Java programming language classes that dynamically process requests and construct responses. They are used to create web applications in Java and run on a web server or application server.

### Lifecycle of a Servlet

1. **Loading and Instantiation**: The servlet is loaded into memory and an instance is created.
2. **Initialization (init)**: The servlet's `init` method is called, initializing the servlet.
3. **Request Handling (service)**: The servlet's `service` method is called for each request, determining the request type (GET, POST, etc.) and dispatching to the appropriate method (doGet, doPost, etc.).
4. **Destruction (destroy)**: The servlet's `destroy` method is called before the servlet is removed from memory, allowing for cleanup.

### Example Servlet

```java
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h1>Hello, World!</h1>");
    }
}
```

## JSP (JavaServer Pages)

### What is JSP?

JavaServer Pages (JSP) is a technology that helps software developers create dynamically generated web pages based on HTML, XML, or other document types. JSP allows embedding Java code in HTML pages using special JSP tags.

## JSP Lifecycle

- **Translation**: JSP is translated into a servlet.
- **Compilation**: The generated servlet is compiled.
- **Loading and Instantiation**: The servlet class is loaded and an instance is created.
- **Initialization**: The jspInit method is called.
- **Request Handling**: The \_jspService method is called to handle requests.
- **Destruction**: The jspDestroy method is called before the servlet is destroyed.

### JSP Example

```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Hello JSP</title>
</head>
<body>
    <h1>Hello, World!</h1>
    <p>Current date and time: <%= new java.util.Date() %></p>
</body>
</html>
```

## Mapping Servlets

### Using web.xml

The web.xml file is a deployment descriptor for a web application. It defines mappings between URL patterns and servlets.

### Example web.xml

```xml
<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee
         http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd"
         version="3.1">

    <servlet>
        <servlet-name>HelloWorldServlet</servlet-name>
        <servlet-class>com.example.HelloWorldServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>HelloWorldServlet</servlet-name>
        <url-pattern>/hello</url-pattern>
    </servlet-mapping>

</web-app>
```

## Using Annotations

Annotations can be used to configure servlets without needing to edit the web.xml file.

### Example with Annotations

```java
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h1>Hello, World!</h1>");
    }
}
```
