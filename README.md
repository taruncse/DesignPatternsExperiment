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

Discussion:

Where to use: 
   1. You would use the factory pattern, whenever you would want a method to return one of several possible 
      classes that share a common superclass.
   2. When you don't know ahead of time what class objects you might need. 
   3. You would aslo use a factory pattern to centralise class selection code, when you don't want the user to have to know       every single potential subclass.

Merits:
   1. We want the capability to have classes chosen at runtime and that's what the factory pattern provides for us.
   2. Encapsulate object creation.
   
Demerits:
   1. You're going to have an increased number of object and class if you use the strategy pattern.
   

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

Merits:

 1. One of the toughest issues to debug is the one created by the multiple instances of a class which manages the state of a single resource. It is highly desirable if we can use some Design Pattern to control the access to that shared resource. The Singleton pattern fits the bill perfectly to solve this scenario; by wrapping a singleton class around this problem ensures that there will be only one instance of the class at any given time. A most common and clichéd example for a singleton class is the one used for logging purposes where the whole application needs only one logger instance at anytime.

Demerits:

 1. They are generally used as a global instance, why is that so bad? Because you hide the dependencies of your application in your code, instead of exposing them through the interfaces. Making something global to avoid passing it around is a code smell.
 2. They inherently cause code to be tightly coupled. This makes faking them out under test rather difficult in many cases.

