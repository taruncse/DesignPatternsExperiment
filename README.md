# DesignPatternsExperiment
This repository is for design patterns with Android examples.

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


