# ooptraining
Mindloops Training voor Object Oriented Programming

Lab 1 - Basic OOP concepts
Objectives
Primary objectives:

Understand the difference between a class and an object

Understand how to create a simple class

Understand how to construct objects for a simple class

Context
For this course we decided to directly start creating simple Java classes and Objects with IntelliJ, because: . then just one IDE needs to be installed and configured which will also be used during the Java language course . the student starts to get familiar with basic Java language constructs and creation of Java classes and objects

A potential risk in the chosen approach is that the student can loose focus on the big picture of Object Orientation. Therefore, we ask the student in several excercises to draw a diagram (pen and paper) of the classes and objects that were created. Please consult the trainer if this diagram is a correct representation of the objects created in the unit test. Besides that, in the provided code we did not use a lot of Java language features which would normally be used, which is also done to keep focus on object orientation in Java.

Each lab excercise starts with one or more unit test that fails and it is up to the student to write the code which makes this test succeed.

Note that the unit tests are commented out so that your project compiles and you are able to implement the excercises one by one. Uncommenting code can be done automatically by IntelliJ by selecting the commented lines and choosing menu option code → comment with Line comment.

Prerequisites
Make sure you have the latest Java Development Kit (JDK) installed on your machine: http://www.oracle.com/technetwork/java/javase/downloads/jdk9-downloads-3848520.html Make sure you have the latest IntelliJ community Edition (free) installed: https://www.jetbrains.com/idea/download/

Import the provided Java project in IntelliJ. This can be done by choosing open and then following the wizard.

Excercise 1 - Create the Engine class with state
The Engine class must be created in the package io.mindloops.ooptraining.labone The Engine class has just one attribute named horsepower.

First create the package by selecting the package io.mindloops.ooptraining.labone, right-click and choose New → Java Class and then the name Engine.

The class Excercise1Test under the folder test → java → io.mindloops.ooptraining.labone contains the unit tests. These can be run by right clicking in the class and choose Run.

When the tests succeeds try to explain for yourself why these succeed. What is tested? Create a diagram for the second test in which is shown how many objects are created in this test and why does the expression engine == otherEngine evaluate to false?

Excercise 2 - Create the Car class with state
The Car class must be created in the package io.mindloops.ooptraining.labone The Car class contains the attributes: serialNumber, yearOfManufacture, color and an engine.

The class Excercise2Test contains the unit tests that can be run by right clicking in the class and choose Run.

Again create a diagram for yourself in which an overview of the objects can be seen for each test and provide an answer to: . What is the difference between the first and second test? . Why is the serialnumber in the third test changed for car as well? . How many object instances are created in the third test?

Excercise 3 - Expand the Engine and Car class with Getters and Setters methods
Up until now the classes only contained state in the form of attributes. In this excercise the student will add the necessary methods to set and get each attribute in the class.

The class Excercise3Test contains the unit tests that can be run by right clicking the class and choose Run.

Again create a diagram for yourself in which an overview of the objects can be seen for each test and provide an answer to: . Why does car.engine equal null?

Lab 2 - Basic OOP concepts
Objectives
Primary objectives:

Understand encapsulation

Understand inheritance

Understand overridden vs overloading methods

Understand abstract classes and the difference with interfaces

Understand static and the difference with non-static attributes and methods

Prerequisites
Correct implementation of lab1, because these excercises will use the Car and Engine class as its basis.

Excercise 1 - Apply encapsulation to all the fields of Engine and Car
The class Excercise1Test under the folder main → java → io.mindloops.ooptraining.labtwo contains the unit tests.

After lab1 there is an Engine and Car class which has getter and setter methods for the contained fields. However the fields are still accessible from other classes. For instance, the Car class can directly manipulate the horsepower of an engine.

The implementation in the method determineIfFieldsOfClassArePrivate can be ignored. For now it suffices that it checks if all the fields are encapsulated.

With the API of the Car class one can now ask for the engine. However, most classes that use the Car class want to get information about the car and do not need to know about the Engine class. Therefore add a method to the Car class with which one can receive the horsepower instead of car.getEngine().getHorsepower().

Try to explain for yourself why and how encapsulation is beneficial and/or discuss this with fellow students and trainers.

Excercise 2 - Create a second engine
Besides the Engine already created, create a second Engine class called ElectricEngine which will also have an attribute called horsepower and batteryPower. Next create a third Engine class called DieselEngine which will only have the attribute horsepower.

The class Excercise2Test contains the unit tests that can be run by right clicking in the class and choose Run.

Note the comments in the first. In this case we have three objects that have the same property called horsepower. Because we now modeled these classes as three completely seperate classes, we cannot simply add these to a list and iterate over this list and ask for the horsepower. Instead, for each element we get from the list we first need to verify which class this is and then cast to it, before we can ask for the horsepower. For now it is sufficient to understand that this code contains a lot of clutter and duplication even for such a small example. And creating a fourth Engine will also lead to changing the test code again.

Now let’s change this code by applying inheritance. The ElectricEngine and DieselEngine can both inherit from Engine. The second test in Excercise2Test should now succeed. The first test will still run succesfully, but will the instanceof DieselEngine and instanceof ElectricEngine be executed?

Excercise 3 - Overridden and overloading
The horsePower of only the DieselEngine can be calculated by a multiply factor because of very weird requirements…​ Make the first test work in the class Excercise3Test. Is this an example of overloading or overriding?

Another new requirement is that the horsePower of an ElectricEngine will always be multiplied with five. Make the second test work. Is this an example of overloading or overriding?

Note the third test which is the same test as in the previous excercise but now validates if the horsepower is 150 or 450.

Excercise 4 - Interfaces and abstract classes
Create an interface named TaxFreeEngine by right clicking on the package io.mindloops.ooptraining.labtwo and selecting New -→ Java Class in the dialogbox add the name and select interface from the dropdown list.

In this example the ElectricEngine will implement this interface and thereby declaring that it is a TaxFreeEngine.

Next we will define an interface named OperateEngine which defines one method named startEngine which returns true if the engine starts succesfully or false otherwise. The parent Engine class will implement this interface in order for the second test to succeed.

Note that now each subclass of Engine also implements this interface.

Bonus - abstract classes
Create a class Bike and an abstract class Vehicle which contains state and behaviour applicable to all Vehicles. Let Car extend this abstract Vehicle class. It is up to the student to define which state and behaviour.

Try to recap for yourself what the primary differences are between an interface and an abstract class and discuss your findings with another student and/or the trainers.
