# DesignPatternsExperiment
This repository is for design patterns with Android examples.

## Table of Content:
 [Creational](#OBSERVER DESIGN PATTERN)
 
### STRATEGY DESIGN PATTERN :

Source of learning : https://www.youtube.com/watch?v=-NCgRD9-C6o

Discussion:

Tips: 
1. Developer should not add any methods to a superclass if they do not pertain to any subclasses.
2. We need to seperate what is difference between subclasses and their superclass
3. Why interface is important here? Interface is implemented by many other different subclasses and it 
   allow us to create many different types of behavior effecting any of the classes.
4. Java composion: Instead of inheriting an ability through inheritance the class is composed with objects with the right ability building. Another great thing about composition is it allows developer to change the capabilities of objects at runtime.

Where to use: 

   a) when we want to define a class that will have one behavior, that is similar to all the other behaviors in a list.

      Example: Animal is a super class, and if we want to add a fly() method in it, then we should be careful.
      Because some animal can fly (like Bird) and some can't (like Dog)

      If we create some hebaviour like  a) Not flying  b) flying with wings  c) flying super fast.
      Then it will be helpful in future, if you want a sub class then it will be able to choose a behavior 
      from any of the behaviours. You can be able to dynamically create whole new different types of flying 
      types Animal.
   
   b) When you need to use one of several behaviors dynamically (Discussed above)

   c) If we see any code has long lists of conditionals to use some strategies

Merits: 

1. It Avoid duplicate code.
2. keeps class change from forcing other class changes.
3. Also allows to hide complicated or secret code from the user.

Demerits:

1. There is only one negative you're going to have an increased number of object and class if you use the strategy pattern.



### OBSERVER DESIGN PATTERN :

Source of learning : https://www.youtube.com/watch?v=wiQdrH2YpT4

Discussion:

Where to use: 
1. When we need many other object to recive update when another object changes.
      Example: Let's say we have a subject of publisher object , that is going to represent thousands of individual 
      stocks in stock market if you need to sent updates to multiple observers or subscribers you would use observer 
      pattern to do that.
      
Merits:
   1. Loose coupling.
   2. The subject and the publisher does not need to know anything about the observers or subscribers.
   
Demerits: 
   1. Subject or publisher may send updates that don't matter to observers that are subscribed.


### FACTORY/SIMPLE FACTORY DESIGN PATTERN :

Source of learning: https://www.youtube.com/watch?v=ub0DXaeV6hA&t=104s
https://www.tutorialspoint.com/design_pattern/factory_pattern.htm

Discussion:

Where to use: 
   1. You would use the factory pattern, whenever you would want a method to return one of several possible 
      classes that share a common superclass.
   2. When you don't know ahead of time what class objects you might need. 
   3. You would aslo use a factory pattern to centralise class selection code, when you don't want the user to have to know       every single potential subclass.
   4. When the implementation of an interface or an abstract class is expected to change frequently
   5. When the current implementation cannot comfortably accommodate new change
   6. When the initialization process is relatively simple, and the constructor only requires a handful of parameters

Merits:
   1. We want the capability to have classes chosen at runtime and that's what the factory pattern provides for us.
   2. Encapsulate object creation.
   
Demerits:
   1. You're going to have an increased number of object and class if you use the strategy pattern.
   
Example: 

```
public interface Shape {
   void draw();
}

public class Rectangle implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}

public class Square implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}

public class ShapeFactory {
	
   //use getShape method to get object of type shape 
   public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }		
      if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
         
      } else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }
      
      return null;
   }
}


public class FactoryPatternDemo {

   public static void main(String[] args) {
      ShapeFactory shapeFactory = new ShapeFactory();
      
      //get an object of Rectangle and call its draw method.
      Shape shape2 = shapeFactory.getShape("RECTANGLE");

      //call draw method of Rectangle
      shape2.draw();
   }
}

```

### ABSTRACT FACTORY DESIGN PATTERN :

Source of learning: https://www.youtube.com/watch?v=xbjAsdAK4xQ&t=104s#t=1.283876

Discussion:

    It is like a factory but everything is encapsulated, the method that orders the object the factories that build 
    the object the final objects and the final objects contain objects that use the strategy pattern.
    
Where to use: 

   1. You want to use them whenever you want to have many objects that can be added or changed dynamically 
     during the runtime.

Merits:
   1. It allows you to create families related objects without specifying a concrete class.
   2. It provide in ton of flexibility.
   3. With an abstract Factory model anything you can imagine and have those objects easily 
      interact with numerous other objects through common interfaces.

Demerits:
   1. The only bad thing about an abstract factory is it can get very complicated.

   
  ### SINGLETON DESIGN PATTERN :    
   
Source of learning: https://stackoverflow.com/questions/137975/what-is-so-bad-about-singletons
                    https://www.codeproject.com/Articles/307233/Singleton-Pattern-Positive-and-Negative-Aspects

Discussion:

Where to use: 

1. It is used when you want to elemenate the option of instantiating more than one object.
2. "Synchronized" helps us to build a proper control on shared object , when it accessed by Thread.

Merits:

 1. One of the toughest issues to debug is the one created by the multiple instances of a class which manages the state of a single resource. It is highly desirable if we can use some Design Pattern to control the access to that shared resource. The Singleton pattern fits the bill perfectly to solve this scenario; by wrapping a singleton class around this problem ensures that there will be only one instance of the class at any given time. A most common and clichéd example for a singleton class is the one used for logging purposes where the whole application needs only one logger instance at anytime.

Demerits:

 1. They are generally used as a global instance, why is that so bad? Because you hide the dependencies of your application in your code, instead of exposing them through the interfaces. Making something global to avoid passing it around is a code smell.
 2. They inherently cause code to be tightly coupled. This makes faking them out under test rather difficult in many cases.

### BUILDER DESIGN PATTERN :
Source of learning: 
https://medium.com/@ajinkyabadve/builder-design-patterns-in-java-1ffb12648850

Discussion:

Builder pattern is a creational design pattern it means its solves problem related to object creation.Best example would be an AlertDialog class from AOSP, StringBuilder, DocumentBuilder best to see how the compex object can be created.

Example : 
```
public static class Builder {
        private String firstName;
        private String middleName;
        private String lastName;
        private int age;
        private String fathersName;
        private String mothersName;
        private double height;
        private double weight;
        public Builder(){}
        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        ...

        public Person build() {
            return new Person(firstName, middleName, lastName, age, fathersName, mothersName, height, weight);
        }
    }
    ............................................................................................
    Build a Person object using Person builder.
    
    Person person = new Person.Builder()
        .setAge(5)
        .setFirstName("Bob")
        .setHeight(6)
        .setAge(19)
        .build();
        
        
```

Where to use: 


Merits: 
1) Code is more maintainable if number of fields required to create object is more than 4 or 5.
2) You can force immutability to the object once its created.

Demerits:
1) Builder pattern is verbose and requires code duplication as Builder needs to copy all fields from Original or Item class.

### PROTOTYPE DESIGN PATTERN :
Source of learning: 1. https://www.tutorialspoint.com/design_pattern/prototype_pattern.htm
                    2. https://docs.google.com/presentation/d/1GoqkYqGLSatO2QKrhHegoHv_Sh25wnV4UY-j9PxMVV4/edit#slide=id.gcb949f06f_0_2

Discussion:  
 
 Prototype pattern refers to creating duplicate object of an exting object and store a seperate place in memory. 
 It's a better way of creating object by cloning existing one.
     
Where to use: 

1. This pattern is used when creation of object directly is costly. For example, an object is to be created 
   after a costly  database operation. We can cache the object, returns its clone on next request and update 
   the database as and when needed thus reducing database calls.

Merits: 

1. It's a good solution of creating a object while keeping performance in mind. 

Demerits:

1. Hides concrete product classes from the client
2. Similar consequences as Abstract Factory and Builder

### JAVA REFLECTION :
Source of learning: 


Discussion:

Where to use: 


Merits: 

Demerits:

### DECORATOR DESIGN PATTERN :
Source of learning: 
  1. https://goo.gl/VWJrY3
  2. https://www.tutorialspoint.com/design_pattern/decorator_pattern.htm
  
Discussion:
  Decorator pattern allows a user to add new functionality to an existing object without altering its structure.

Where to use: 
 
  1. When we need to add some behavior without recompiling source code.
  2. you can wrap a stream with a stream to get added functionality.
Merits: 

  1. This pattern creates a decorator class which wraps the original class and provides additional 
     functionality keeping class methods signature intact.
  2. Provides a more flexible way to add responsibilities to a class than by using inheritance, since 
     it can add these responsibilities to selected instances of the class.
  3. Allows to customize a class without creating subclasses high in the inheritance hierarchy. 
  
Demerits:

  1. A Decorator and its enclosed component are not identical. Thus, tests for object types will fail. 
  2. Decorators can lead to a system with “lots of little objects” that all look alike to the programmer 
     trying to maintain the code

### FLYWEIGHT PATTERN:
Source of learning: 
https://www.tutorialspoint.com/design_pattern/flyweight_pattern.htm
https://www.youtube.com/watch?v=0vV-R2926ss&index=19&list=PLF206E906175C7E07

Discussion:

Where to use: 


Merits: 

Demerits:

### INTERPRETER PATTERN:
Source of learning: 
http://www.journaldev.com/1635/interpreter-design-pattern-in-java-example-tutorial
https://dzone.com/articles/design-patterns-uncovered-14

Discussion:

Where to use: 


Merits: 

Demerits:

### MONOSTATE PATTERN:
Source of learning: 
https://stackoverflow.com/questions/887317/monostate-vs-singleton

Discussion:

monostate and singleton are two faces of the same medal (global state):

monostate forces a behaviour (only one value along all class instances)
singleton forces a structural constraint (only one instance)
singleton usage is not transparent

```
Singleton singleton = Singleton.getInstance();
monostate usage is transparent

MonoState m1 = new MonoState();
MonoState m2 = new MonoState(); // same state of m1 

```
Where to use: 


Merits: 

Demerits:

### FLUENT INTERFACE:
Source of learning: 

Discussion:
A Fluent Interface is an object oriented API that provides "more readable" code.
A fluent interface allows you to chain method calls, which results in less typed characters when applying multiple operations on the same object.
Where to use: 


Merits: 

Demerits:

### ADAPTER PATTERN:
Source of learning: 
https://dzone.com/articles/adapter-design-pattern-in-java

Discussion:
The adapter design pattern is a structural design pattern that allows two unrelated/uncommon interfaces to work together. In other words, the adapter pattern makes two incompatible interfaces compatible without changing their existing code.

Interfaces may be incompatible, but the inner functionality should match the requirement.

The adapter pattern is often used to make existing classes work with others without modifying their source code.

Adapter patterns use a single class (the adapter class) to join functionalities of independent or incompatible interfaces/classes.

The adapter pattern also is known as the wrapper, an alternative naming shared with the decorator design pattern.

This pattern converts the (incompatible) interface of a class (the adaptee) into another interface (the target) that clients require.

The adapter pattern also lets classes work together, which, otherwise, couldn't have worked, because of the incompatible interfaces.

Where to use: 


Merits: 

Demerits:

### DECERATOR PATTERN:
Source of learning: 
https://www.tutorialspoint.com/design_pattern/decorator_pattern.htm

Discussion:
Decorator pattern allows a user to add new functionality to an existing object without altering its structure. This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.

Where to use: 


Merits: 

Demerits:

### FACADE PATTERN:
Source of learning: 
https://www.tutorialspoint.com/design_pattern/facade_pattern.htm
Discussion:

Facade pattern hides the complexities of the system and provides an interface to the client using which the client can access the system. This type of design pattern comes under structural pattern as this pattern adds an interface to existing system to hide its complexities.

Where to use: 


Merits: 

Demerits:

### ITERATOR PATTERN:
Source of learning: 
https://www.tutorialspoint.com/design_pattern/iterator_pattern.htm

Discussion:
Defines an interface for accessing and traversing elements.
According to GoF, iterator design pattern intent is:

Provides a way to access the elements of an aggregate object without exposing its underlying represenation.

Iterator pattern is not only about traversing through a collection, we can provide different kind of iterators based on our requirements.

Iterator design pattern hides the actual implementation of traversal through the collection and client programs just use iterator methods.

Where to use: 
Iterator design pattern in one of the behavioral pattern. Iterator pattern is used to provide a standard way to traverse through a group of Objects. Iterator pattern is widely used in Java Collection Framework. Iterator interface provides methods for traversing through a collection.

Merits: 

Demerits:

### STRATEGY PATTERN:
Source of learning: 
https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm
Discussion:
In Strategy pattern, a class behavior or its algorithm can be changed at run time. This type of design pattern comes under behavior pattern.

In Strategy pattern, we create objects which represent various strategies and a context object whose behavior varies as per its strategy object. The strategy object changes the executing algorithm of the context object.

Where to use: 


Merits: 

Demerits:

### FLUENT INTERFACE:
Source of learning: 

Discussion:
Where to use: 


Merits: 

Demerits:

### FLUENT INTERFACE:
Source of learning: 

Discussion:
Where to use: 


Merits: 

Demerits:

### FLUENT INTERFACE:
Source of learning: 

Discussion:
Where to use: 


Merits: 

Demerits:

### FLUENT INTERFACE:
Source of learning: 

Discussion:
Where to use: 


Merits: 

Demerits:
