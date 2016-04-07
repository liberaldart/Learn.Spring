# Learn.Spring
Learn to use spring framework

Spring is easy to learn and use. Spring boot is easier to use after you have learnt spring framework. 

Spring's @Component, @ComponentScan, @Bean, etc..

Spring's Aspect oriented programming..

Spring's Web:

An example:

Your class that would configure the spring application context for the web and the backend: AbstractAnnotationConfigDispatcherServletInitializer

This class has methods that specify the java configuration class that would declare the beans needed for web application
context and backend application context.

The web application context is : DispatcherServlet
The backend application context is: ContextLoaderListener

DispatcherServlet is the center piece of web development in spring. This servlet receives a client request and looks-up
the Controller to which the request must be forwarded to.
![alt tag](https://github.com/liberaldart/Learn.Spring/raw/master/images/Screen%20Shot%202016-04-07%20at%206.38.57%20PM.png)

Other that DispatcherServlet another server is involved in the process. In one hand we have DispatcherServlet; a spring application context that specifies the java configuration class that would declare all the beans that are related to web
that would be loaded in this context.

On the other the configuration class from which it would load all other beans that are related to databases and backend services.

![alt tag](https://github.com/liberaldart/Learn.Spring/raw/master/images/Screen%20Shot%202016-04-07%20at%206.27.24%20PM.png)

Spring security framework:
