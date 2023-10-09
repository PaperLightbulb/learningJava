# CheatSheet
## variable creation

Type variableName = Value;

### Type
the data type of the variable, this is sort of like the type of thing this variable is

### variableName
The name you will refer to this variable by

### = 
the assignment operator -> sets the thing on the left to equal the thing on the right

### value
the object you will be setting your variable to be equal to

## instantiating a new object from a data type
- string - put the string value in double quotes
- char - put a single character in single quotes
- int - type in an integer number
- boolean - type **true** or **false**
### instantiating new object from a class

**new** ClassName(arguments)

#### new
the **new** keyword tells the program we want to create an object

#### ClassName
this is the name of the class we want to create an instance of

#### arguments
supplying any arguments needed to the class to construct it

## creating a class

visibility static **class** ClassName { 

body which can include
- attributes
- methods

}

### visibilty

- public - class is available to any code
- private - available to only this class
- protected - can be accessed by this class, classes that inherit from this class, and classes in this package
- no visiblity modifier (called package protected) - can be accessed by this class and classes in this package

### static
optional, makes available directly from class without instantiating as object but will not deal with any non static attributes

### ClassName
the name you will refer to this class by

## making a method within a class

visiblity static returnType methodName(ArgumentTypes arguments){

body

}

### returnType
the kind of object this method "is" or returns

### methodName
what we refer to this method in our code as

### argument types
the types of the objects that we pass into our method

### arguments
the names our method will use for passed objects

## making a constructor method
method with no return type and name equal to its classes name
returns its class and runs the code in its body

## making a main method within a class
public static void main(String[] args) {

code you want to run

}

method that is used as a starting point for running your code

## comments
comments are not run with your code
they start with a double forward slash and end on the next line
or start with /* and end with */

## set package of class
**package** path.to.class.from.java;

import package.package.package.class;