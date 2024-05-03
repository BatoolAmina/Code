//Introduction to Java Beans and EJB program. 

//JavaBeans and Enterprise JavaBeans (EJB) are both Java technologies used for developing enterprise-level applications. 
//While JavaBeans are reusable components for building Java applications, EJBs are specifically designed for building distributed, transactional, and scalable enterprise applications.
/*Introduction to JavaBeans:
1. What are JavaBeans?:
JavaBeans are reusable software components written in Java.
They are designed to be easily manipulated in visual development environments, such as IDEs and GUI builders.
JavaBeans follow a set of conventions defined by Sun Microsystems to ensure interoperability and reusability.
2. Characteristics of JavaBeans:
JavaBeans are Java classes that adhere to certain conventions, such as having a public default constructor, providing getter and setter methods for properties, and supporting serialization.
They are typically used to encapsulate data and behavior related to a specific entity or component in an application.
JavaBeans are serializable, which means they can be saved to a persistent storage or transmitted over a network.
3. Example of JavaBean: */

public class Person implements java.io.Serializable {
    private String name;
    private int age;
    public Person() {}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

/*Introduction to Enterprise JavaBeans (EJB):
1. What are EJBs?:
Enterprise JavaBeans (EJB) is a server-side component model for building distributed enterprise applications in Java.
EJBs provide services such as transaction management, security, concurrency control, and remote access, making it easier to develop scalable and robust enterprise applications.
2. Types of EJBs:
Session Beans: Used to encapsulate business logic and are often used to implement the core functionality of an application.
Entity Beans: Represent persistent data stored in a database and are used to manage database records.
Message-Driven Beans: Used for asynchronous message processing in a distributed application.
3. Features of EJBs:
Transaction Management: EJBs support declarative transaction management, allowing developers to specify transaction boundaries and attributes using annotations or deployment descriptors.
Security: EJBs support role-based access control and provide mechanisms for securing sensitive resources and operations.
Scalability: EJB containers manage the lifecycle and pooling of EJB instances, making it easier to build scalable and high-performance applications.
4. Example of EJB (Session Bean):*/

import javax.ejb.Stateless;
@Stateless
public class CalculatorBean {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
}
