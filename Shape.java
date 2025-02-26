/* 2. Two common access modifiers are public and private. 
 * when a member is declared as public means it can be 
accessed from anywhere from the program and when it is declared as private it can only be accessed 
with in the same class.


3.Benefits of Inheritance:
 Inheritance promotes code reuse and establishes a hierarchy between classes.
 For example, an Analyst class inheriting from an Employee class allows shared attributes like name and salary to be defined once in Employee. 
 This minimizes redundancy and simplifies maintenance.




*/
package homework;

public class Shape {
    private int numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public int getSides() {
        return numSides;
    }

    public void setSides(int numSides) {
        this.numSides = numSides;
    
    
    }
  
}

