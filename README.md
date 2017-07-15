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
   Example: Animal is a super class, and if we want to add a fly() method in the class. We should careful about it.
   Because some animal can fly (Bird) and some can't (Dog)
