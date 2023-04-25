/*
In this example, we define a class called Example that contains variables and methods with different visibility modifiers.

We define a public variable called publicVar, a protected variable called protectedVar, a private variable called privateVar, and a default (package-private) variable called defaultVar.

We also define a public method called publicMethod, a protected method called protectedMethod, a private method called privateMethod, and a default (package-private) method called defaultMethod.

Each of these variables and methods have different levels of access depending on their visibility modifier:

	- The public modifier makes the variable or method accessible from anywhere.
	- The private modifier makes the variable or method accessible only within the same class.
	- The default (package-private) modifier makes the variable or method accessible only within the same package.

When you use these modifiers, it's important to consider how you want to control the access to your variables and methods. For example, you may want to make a variable or method public if you want it to be accessible from anywhere in your program. Conversely, you may want to make a variable or method private if you only want it to be accessible within a specific class.
*/

public class Example {
    // A public variable
    public int publicVar = 1;

    // A private variable
    private int privateVar = 3;

    // A default (package-private) variable
    int defaultVar = 4;

    // A public method
    public void publicMethod() {
        System.out.println("This is a public method");
    }

    // A private method
    private void privateMethod() {
        System.out.println("This is a private method");
    }

    // A default (package-private) method
    void defaultMethod() {
        System.out.println("This is a default method");
    }
}
