Java SE 8
--------------------------------------------------------------------------

    Objectives
    --------------------------------------------------------
        Java Introduction
        OOPs
        Java Lang Package
        Exception Handling
        Generics 
        Collections
        Streams API and Lambda Expressions
        JDBC
        Multi-Threading

    Lab Setup
    --------------------------------------------------------
        JDK 1.8 or above
        Eclipse IDE
        MySQL Community Server 8 or above

    Java Introduction
    --------------------------------------------------------

        History and Evolution
            JavaSE
            JavaEE
            JavaME

            JDK - Java Development Kit      = JRE and Java Tools and Java Class Libraries
            JRE - Java Runtime Environment
            
        Features
            Simple                  Syntactically simillar to C,C++; Less Keywords and More Operators
            Robust                  Fault Tolarent; Exception Handling
            Self Docuemtned         Documentation comments
            Secure                  Java does not support direct memory access like using pointers ...etc.,
            Platform Independent    Write Once, Compile Once and Excute any where. JVM - Java Virtual Machine
            Archetecture Neutral    Java can build apps for any type of a computer (from super computers to microcontrollers)
            Multi-Threaded          
            Distributed

        Charecteristics

            1. Java is a high level programming language
            2. Java is strictly and partially object oriented language.
            3. Java is case sensitive.
            4. Java uses (;) as statement terminator, {} are used to define a block of code.
            5. Java does not support pointers and any other direct memory access.

        Tokens

            A token is an indivisible part of a piece of code.

                /*
                We are defining a class to hold our main method here...
                */
                class MyFirstJavaApplication {
                    public static void main(String args[]){
                        System.out.println("Hello World!"); // this prints the given string on the console.
                    }
                }

            We have Five Tokens
                Identifiers
                    is any name given to any resource in the code.

                    Naming Conventions
                        variable name, method name  must be lower in case and if are made up of
                        more than one word, from second word onwards init-capitals are to be used.

                            height
                            boxHeight
                            boxHeightInInches

                            display()
                            displayErrorMessage()

                        class name
                            are expected to initial capitlas all through

                            MyFirstJavaApplication
                            Exception
                            InputException
                            ArrayIndexOutOfBoundsException

                        constant name
                            are expected to be all capitals, joined by a underscore if has more thna one word.

                            PI
                            MIN_LIMIT
                            MAX_LIMIT

                Keywords
                    is a reserved word in a programming language. In java all keywords are in lower case.

                Operators
                    is generally a symbol representing an operation on one or more operands.

                    Binary          have two operands
                        Arithmetic  +    -          *           /    %
                                    sum difference  product     qut reminder

                        Assignment  =   +=  -=  *=  /=  %=

                                    x = 89;
                                    x += 20;  is as smae as  x = x + 20;

                        Relational  ==  <   >   <=  >=  !=

                        Logical     &&  ||  !
                                    and or  not

                    Unary           have only one operand
                        
                        unary minus     x = 90; 
                                        y = -x;
                        
                        increment       ++

                                        a = 5;
                                        a++;    //post increment    a becomes 6
                                        ++a;    //pre increment     a becomes 7

                                        b = ++a;    // a value is 8, b value is also 8
                                        c = a++;    // a value is 9, but c value is 8.

                        decriemnt       --

                    Ternary         has three operands, this operator is also called conditional operator

                                    cond ? expr_in_case_of_true : expr_in_case_of_false ;

                                    int g = a>b?a:b ;
                                    System.out.println( g + " is greater ");

                    BitWise         that operate at binary level on the operands

                                    & | ^ << >>

                    Misc            are those that do not fall into any of the above categories.

                                    .   ,   (   )  [    ]   {   }  ;   ...etc.,

                Comments
                    is a description given to a pice of code, and is always ignored by the compiler.
                    
                    // to write a end of line comment
                    /*
                        to write a block comment.
                    */

                Literals

                    is any hard coded value into the program.

                    double r = 5.7; 
                    
                    String userName = "Vamsy";

                    double c = 2 * Math.PI * r;

                    double                          keyword
                    r,String,userName,c,Math,PI     identifier
                    = ; * .                         operator
                    5.7,"Vamsy",2                   Literal

                    Java supports the following lieterals

                        Integer
                                Decimal Numeric System              10  11  90
                                Hexa Decimal Numeric System         0xA 0xB 0x5A
                                Octal Numeric System                012 013 0132

                        Float   Decimal Numeric System              3.14
                        
                        Character                                   '1'  '@'
                        
                        String                                      "Vamsy" "10"

                        Boolean                                     true    false
                        
                        Reference                                   NULL

        Data Types

            Primitive Data Type
                byte
                short
                integer
                long
                double
                float
                char
                boolean
                void

            User Defined Data Type
                enum
                class
                interfaces
                annotations

        Control Statements

            Selective Control Statements
                if
                    simple if
                        if(cond) {
                            //the statements here are executed only if the given cond evaluates to true.
                        }

                    if..else
                        if(cond) {
                            //the statements here are executed only if the given cond evaluates to true.
                        } else  {
                            //the statements here are executed only if the given cond evaluates to false.
                        }

                    if ladder
                        if(cond1) {
                            //the statements here are executed only if the given cond1 evaluates to true.
                        }else if(cond2) {
                            //the statements here are executed only if the given cond2 evaluates to true.
                        }else if(cond3) {
                            //the statements here are executed only if the given cond3 evaluates to true.
                        }....... else  {
                            //the statements here are executed only if all the given conds evaluate to false.
                        }

                    nested if
                        if(cond1){
                            if(cond2){
                                ....
                            }
                        }

                switch
                    switch(expr){
                        case pssobileValue1 : 
                            //statements here are executed when the expr evalautes to possibleValue1
                            break;
                        case pssobileValue2 : 
                            //statements here are executed when the expr evalautes to possibleValue1
                            break;
                        case pssobileValue3 : 
                            //statements here are executed when the expr evalautes to possibleValue3
                            break;    
                        default : 
                            //statements here are executed when the expr values does not match any of the above.
                    }

            Iterative Control Statements / Loops

                    while

                        while(cond){
                            //statements here are executed repeadtly as long as the cond is true
                        }

                    do while
                        do{
                            //statements here are executed repeadtly as long as the cond is true
                        }while(cond);

                    for

                        for(initialization;condition;incrementation/decrimenttion){
                            //statements here are executed repeadtly as long as the cond is true
                        }

                    enhanced for / for each

                        for( loopingVar : arrayOrACollection ){
                            //statements here are executed once for each ele in the givne array or collection
                        }

            Non Conditional Control Statements

                break
                continue
                return
    
        Object Oriented Programming

            OOP recognizes the significance of data and its representation along wiht the procedure
            the data has to undergo. OOP is defined as five concepts

                Class and Object
                Encapsulation
                Polymorphisim
                Inheretence
                Abstraction

            Class and Object

                A class is a User Defined Data Type, that represents data as fields and behaviours as methods. This
                helps representing domain entities as a unit.

                    class ClassName {
                        //declare the fields
                        //declare and define constructors
                        //declare and define methods
                    }

                    class Student {
                        int admNo;          //is a field variable and is initialized to 0
                        String fullName;    //is an field object  and is initialized to null  
                        double fee;         //is a field variable and is initized to 0.0
                        LocalDate admnDate; //is a field object and is initialized to null

                        //declare and define constructors
                        
                        void computeTaxOnFee(){
                            double tax; //is a local variable and is not allocated until first assignment
                            tax = this.fee * 0.18;
                            return tax;
                        }
                    }

                Objects are variables of class type.

                    ClassName objName;  //declartation
                    objNaem = new ClassName(); // allocation
                    
                    ClassName objNaem = new ClassName(); // initialization

                    Student student1 = new Student();
                
                Objects in Java are reference type. This means that each object reference an allocated memory space
                and a non allocated object holds NULL.

                The fields of a class are by default initialized unlike local variables. the inital values of
                a byte or short or int or long is 0, double or flaot is 0.0, boolean is false and for any object it is null.

                Constructors

                    is a method of a class that gets invoked automatically immidiately after the object allocation.

                    Every cosntructor in java has to have the same name as that of its class and shall not return anything.

                        Student student = new Student();

                    Constructors are mostly used to custom initialize the fields.

                    Types of Constructors,

                        Default Constructor - NoArg Constructor - Constructor that has no arguments
                        Paramatrized Constructor    - Constructor that has atleast one argument
                        Copy Constructor    -   Constructor that has the object of the same class as a argument.

                    A java class - if not defined with any constructor - a default constructor is auto-implemented into it.

            Encapsulation

                is a macahnisim to provide access restrictions to the fields or methods of a class.

                encapuslation allows the developer to control the level of access on a field of a method.

                java provides four access specifiers 
                    Access Specfier     Keyword         Impact
                    -----------------------------------------------------------------------------------------------------
                    Public              public          public fields and methods are accessable anywhere in the application
                    Private             private         private fields and methods are accessable only with in the owner class
                    Protected           protected       protected fields and methods are accessable in owner class and in sub-classes     
                    Default             no-keyword      default fields and methods are accessable in owner class and in classes belonging
                                                        to the same package as that of the owner class

                java also suggests a coding pattern called gettetrs and setters to be used alongside the access specifiers to
                achiove encapsulation.

                    A setter is a public function that does not return any value but accepts a vlue into a field. It is
                    to be named as 'set' followe4d by the field name.
                    
                    A getter is a public function that does not accept any value but returns the value of a field. It is
                    to be named as 'get' followe4d by the field name.

                    class Point2D {

                        private int x;
                        private int y;

                        public int getX(){
                            return this.x;
                        }

                        public void setX(int x){
                            this.x=x;
                        }

                        public int getY(){
                            return this.y;
                        }

                        public void setY(int y){
                            this.y=y;
                        }

                    }

                A combination of access specifiers and getters and setters will allow us to create
                    a Read Write Field                  a private field with both setter and getter / a public field
                        or
                    a Read Only Field                   a private field with only getter, no setter
                        or
                    a Write Only Field                  a private field with only setter, no getter
                        or
                    a Strictly Non Accessable Field     a private field with no getter and no setter

            Polymorphisim

                is the ability of a language to have more than one method with the same name and in the same scope.

                Overloading

                    is to define more than one method ,in the same class or in a super and sub classes, such that
                        1. they have the same name
                        2. but they differ in the arguments count or arguments type.

                        class HumanBeing {

                            Energy eat(Apple apple) {
                                wash(apple);                            
                                
                                Pieces pieces[] = cut(apple);
                                
                                Energy energy = new Energy();

                                for(Piece p : prices){
                                    energy.add(chewAndSwallow(p));
                                }

                                return energy;
                            }

                            Energy eat(IceCream iceCream) {
                                Energy energy = new Energy();

                                while(iceCream.exists()){
                                    energy.add(lickAndSwallow(iceCream));
                                }

                                return energy;
                            }
                        }

                    A class can have any number of constructors as long as they all have different arguments, and this is
                    called constructor overloading.

                        class Point2D {

                            private int x;
                            private int y;

                            //default construcotr - noarg constructor
                            public Point2D(){
                                this.x=5;
                                this.y=5;
                            }

                            //paramatrized constructor
                            public Point2D(int x,int y){
                                this.x=x;
                                this.y=y;
                            }

                            //copy constructor
                            public Point2D(Point p){
                                this.x=p.x;
                                this.y=p.y;
                            }

                           //getters and setters here....

                        }

                Overriding

                   is to define more than one method ,in a super and sub classes, such that
                        1. they have the same name
                        2. and they have the same arguments
                        3. and they have the same return type

                        class Monkey {
                            Energy eat(Apple apple) {                                
                                Energy energy = new Energy();

                                while(apple.exists()){
                                    energy.add(byteAndChewAndSwallow(p));
                                }

                                return energy;
                            }
                        }

                        class HumanBeing extends Monkey {
                            Energy eat(Apple apple) {
                                wash(apple);                            
                                
                                Pieces pieces[] = cut(apple);
                                
                                Energy energy = new Energy();

                                for(Piece p : prices){
                                    energy.add(chewAndSwallow(p));
                                }

                                return energy;
                            }
                        }
                    
            Inheretence

                is to create a new class from an exisitng class. The existing class is called the super class 
                and the new one is called sub class.

                    class Pen { //super class
                        private Nib nib;
                        private Refill refill;
                        private Barrel barrel;

                        public void write(Paper paper,String text){
                            
                        }

                    }

                    class Marker extends Pen { //sub class
                        public void write(Board board,String text){
                            
                        }
                    }

                Simple Inheretence

                    One Super class extends into one Sub class

                    Point2D (x,y) <---------- Point3D (x,y,z)

                Multi-Level Inheretence

                    One Super class extends into a Sub class, and that Sub Class extends into another Sub Class and so on.

                    Employee (empId,name,sal) <---- Manager (empId,name,sal,hra) <--- Director (empId,name,sal,hra,share)

                Hirarchial Inheretence

                    One Super class extends into more than one Sub class.

                                              | <---- Manager (empId,name,sal,hra)   
                    Employee (empId,name,sal) |
                                              | <---- ContractEmployee   (empId,name,sal,contractDuration)   

                Multiple Inheretence

                    More than one Super Type are extended into one sub Type.

                    Java does not support multiple inhertence on classes, to avoid unnatural ambiguity.

                Hybrid Inheretence
                
                    is a combination of multi-level and hirarchial

                                              | <---- Manager (empId,name,sal,hra)  <--- Director (empId,name,sal,hra,share) 
                    Employee (empId,name,sal) |
                                              | <---- ContractEmployee   (empId,name,sal,contractDuration)   

                
                Points to remember

                1. Each time an object for a sub class is allocated, the constructor from the super follwoed by the constructor
                    from the sub class are invoekd.
                
                2. Java does not support multiple inheretence for classes.

                3. A super class reference can refer to a sub class object.

                        Pen p = new Marker();   //Narrowing, because p can access methods defiend in Pen only.

                        Marker m = (Marker) p;  //Broadening 

                        Pen p2 = new Pen();

                        Marker m = (Marker) p2;  //Broadening not possible, trggers an exception called ClassCastException

                4.  Dynamic Polymorphsism / Runttime Binding / Late Binding


                                                          | <---- Manager (++hra, grossPay())  <--- Director (++share , grossPay() ) 
                    Employee (empId,name,sal,grossPay() ) |
                                                          | <---- ContractEmployee   (++contractDuration)   


                        class EmployeeService {
                            
                            public double netPay(Employee emp){
                                double tax = emp.grossPay()*0.10;
                                return emp.grossPay() - tax;
                            }

                            /*
                                emp.grossPay() will be triggered from which class - Employee / Manager / Director / ContractEmplopyee ??

                                we can not say that here...!

                                netPay is accepting an Employee class reference, which means when we invoke
                                netPay method, we can pass an object Emplpoyee or an object of Manage or an Object of Direcotr or
                                an object of ContractEmployee.

                                When netPay(new Employee()) or netPay(new ContractEmployee()) , emp.groswPay() is invoked from Employee
                                When netPay(new Manager()) , emp.grossPay() gets invoked from Manager
                                When netPay(new Director()) , emp.grossPay() gets invoked from Director
                            */

                        }

            Abstraction

                is a machanisim to hide behavioural implementation.

                abstraction is primary achived through abstract functions, an abstract function is a function
                that doesn't hold any implementation.

                abstract functiosn can be held only by an abstract class or an interface.

                abstract class GeometricShape {
                    public abstract double area();
                }

                interface IGeometricShape {
                    double area(); //byDefault methods in interfaces are public and abstract
                }

                an abstract class and an interface both can not have an object allocated.

                both abstract classes and interfaces can have non-abstract methods along with abstract methods.

                both abstract classes and interfaces must be derived into sub-classes, and thoe sub classes
                must override all the abstract functions provided in abstract classes and interfaces.

                GeometricShape s1 = new Rectangle(); //if Rectangle is a class extending the GeometricShape

                IGeometricShape s2 = new Circle(); //if Circle is a sub-class of IGeometricShape

                A sub-class can extend only one abstract class like any other classes. Multiple inheretence
                is forbidden for abstract classes as well.

                A sub-class can implement any number of interfaces. Multiple inheretence froim interfaces to
                classes is possible.

                Interfaces can not have fields unlike abstract classes.

                In a case where we need abstract emthods and fields, we have no chocie but
                to write a abstract class.

                In a case where we need abstract emthod and no fields, then we can chsoose to write an interface 
                rather than an absgttract class to take advantage of multiple inheretence.

                abstract class Animal
                                |<-- class FemaleAnimal ---->    Mother,Sibling
                                |<-- class MaleAnimal   ---->    Father,Sibling

                abstract class Bird
                                |<-- class FemaleBird   ---->    Mother,Sibling
                                |<-- class MaleBird     ---->    Father,Sibling

                interface Father
                    protect()
                    earnFood()

                interface Mother
                    giveBirth()
                    feed()

                interface Sibling
                    share()
                    caring()
                    playing()

            Java Keywords to play along the OOP
                
                class           indicartes that the user defiend type is a class

                interface       indicates that the user defined type is a interface

                extends         used to create sub-classes from super-classes
                                used to create sub-interfaces from super-interface

                implements      used to create a sub-class from one or more super-interfaces

                this            refers to the current object of a method

                                    class Employee{
                                        //....fields

                                        public void getSalary(){
                                            return this.salary;
                                        }
                                    }

                                    emp1.getSalary()    //getSalary method has emp1 as current object    
                                    emp2.getSalary()    //getSalary method has emp2 as current object

                                'this' keyword can also be used to invoke a constructor from another constructor of the same class.

                                    class Point2D {

                                        private int x;
                                        private int y;

                                        //default construcotr - noarg constructor
                                        public Point2D(){
                                        this(5,5);
                                        }

                                        //paramatrized constructor
                                        public Point2D(int x,int y){
                                            this.x=x;
                                            this.y=y;
                                        }

                                        //copy constructor
                                        public Point2D(Point p){
                                            this(p.x,p.y);
                                        }

                                        //getters and setters here....

                                    }
                
                super           is used to invoke a super class constructor from a sub-class constructor                                  
                                is also used to invoke a super class method from a sub-class overriden method.

                                    class Employee{
                                        private int empId;
                                        private String fullName;
                                        private double salary;
                                        private double hra;

                                        public Employee(){
                                            //leaving empty intentionally
                                        }

                                        public Employee(int empId,String fullName,double salary,double hra){
                                            this.empId=empId;
                                            this.fullName=fullName;
                                            this.salary=this.salary;
                                            this.hra=hra;
                                        }

                                        //getters and setters are also defined

                                        public double getGrossPay(){
                                            return this.salary + this.hra;
                                        }
                                    }

                                    class Manager extends Employee {
                                        private double ta;

                                        public Manager(){
                                            //leaving empty intentionally
                                        }

                                        public Manager(int empId,String fullName,double salary,double hra,double ta){
                                            super(empId,fullName,salary,hra);
                                            this.ta=ta;
                                        }

                                        //getters and setters are also defined

                                        public double getGrossPay(){
                                            return super.getGrossPay() + this.ta;
                                        }
                                    }

                abstract        when applied on a method, the method can not have implementation.
                                when applied on a class, the class can not have object allocated.

                final           when applied on a field or on a local variable, the variable turns to be a cosntant.
                                when applied on a method, that method can not be overriden.
                                when applied on a class, that class can not be inhereted.

                static          static field
                                    fields marked as static are called class variables
                                    and non-static fields are called instance variables

                                    class variables are allocated as single copy and shared by all the instacnes of the class
                                    instance variables are allocated each object a sperate copy.

                                    class variables if are also public, can be accessed through class name.

                                static method
                                    a static method is allowed access only other static methods or fields of that class.
                                    a static method can not use 'this' keyword.

                                    static methods if are also public, can be accessed through class name.

                                static class -  Nested class vs Inner Class?

                                    class Outer {

                                        class Inner {
                                            // has access to all memebers of the outer class
                                        }

                                        static class Nested {
                                            // has no access to any memebers of the outer class
                                        }
                                    }

                                static block

                                    class A {
                                    
                                        static {
                                            //all static blocks in a class are treated as one block
                                            //the code written in a static is executed only once, just before the class is accessed.
                                            /* accessing a class means
                                                    1. declaring a reference to a class  ---> A a;
                                                    2. allocating an object to a class  ----> new A();
                                                    3. accessing any static memebr of the class ---> A.staticMember
                                                    4. Doing any of the above on the derived classes of this class.
                                            */

                                        }
                                    
                                        static {
                                            //this block gets merged with the above static block
                                        }
                                    
                                    }

    JavaSE Packages                
    --------------------------------------------------------------

        java.lang                   Classes Related Fundamentals, Wrapper CLasses, String Manipulation, 
                                    Exception Handling, Multi-Threading

        java.time                   Date And Time API

        java.util                   Geenrics, Collections, and a few utility classes like Scanner

        java.util.regex             Regular Expressions

        javq.util.functions         Lambda Expression and Functional Interfaces

        javq.util.streams           Streams API 

        java.io                     Input Output Streams

        java.nio                    Non BlockingInput Output Streams

        java.sql                    JDBC

    java.lang  Classes Related Fundamentals
    ----------------------------------------------------------

        the 'lang' package is an implicit which means that this package is imported into all .java files.

        java.lang.Class     represents all java classes. 
                            Each java class is an object of java.lang.Class

                            class Employee {

                            }

                            class Student {

                            }

                            Employee.class      is an object of java.lang.Class

                            Student.class       is an object of java.lang.Class

        java.lang.Object    represents all object in java. Every class in java is a sub-class of java.lang.Object.

                            class Employee {

                            }

                            class Manager extends Employee {

                            }

                            class Director extends Manager {

                            }

                            Employee class is made to extend java.lang.Object at compile time.

                            java.lang.Object
                                        |<--- Employee
                                                | <--- Manager
                                                        | <-- Director
        
                            Methods from java.lang.Object

                                int hashCode();             //is ment to return a unique numerical value of the magnitude of an object
                                boolean equals(Object);     //is ment to check if two objects are equasl, obj1.equals(obj2)
                                String toString();          //is ment to convert an object into a String

                                It is important that these methods are overriden.

        Wrapper Classes

            Integer
            Short
            Long
            Double
            Float
            Boolean

            ..etc., for each primitive data type we have a matching class called the wrapper class that
            is used to provide object status to a primitive variable when needed.

            For an example, no primitive variable can hold null. Assuming a field called 'commission' for a Employee model
            has to hold null to represent that an employee has no commission. 

                class Employee{

                    private double comm; //we can not store null in it
                }

                class Employee{

                    private Double comm; // this can hold null
                }

            Boxing means assiging a primitive variable to its wrapper class object.
            UnBoxing means assinging a wrapper class obkject to its matching primitive variable.

            Auto-Boxing and Auto-Unboxing is a feature of JDK 1.8, where direct assignemnt will do the task,

                int x = 45;
                Integer iObj = x; //auto-boxing
                int y = iobj; //auto-unboxing
                
        Working with Strings

            java.lang.String

                Every string litral is an object of String.

                    String s = "Hello";
                    String s1 = new String();
                    String s2 = new String("any string");
                    String s3 = new String(byteArray);

                Every string object is an immutable object. An object whose valeu can not be modified / edited.
                Every time a concatination happend on a string, it results in creating a new object.

                The clases StringBuffer and StringBuilder are used to manupulate strings without the cost of
                creating new string object each time.

            java.lang.StringBuffer
            java.lang.StringBuilder

                StringBuffer is thread-safe and is hence lot slower than StringBuilder.

        Exception Handling

            An exception is a senario where the application is tend to break due to 
            improper code construct or an invalid input.

            java.lang.Throwable (i)
                        |
                        -------------
                        |           |
                        Error       Exception
                                        |
                                        RuntimeException

            Any class that extends Exception is called a CHECKED EXCEPTION
            Any class that extends RuntimeException is called a UNCHECKED EXCEPTION

            CHECKED EXCEPTIONS if not handled, are detected by the compiler and is shown as compilation error.
            UNCHECKED EXCEPTIONS if not handled, are not detected by the compiler.

            UNCHECKED EXCEPTIONS must not be handled, but must be avoided using defensive programming.

                ArrayIndexOutOfBoundsException is a sub-class of RuntimeException and hence it is UNCHECKED.

                public String getElementAt(String array[],int index) {
                    String result = null;
                    
                    if(index>=0 && index<array.length){ //we are avoiding ArrayIndexOutOfBoundsException
                        result = array[index];
                    }

                    return result;
                }

            CHECKED EXCEPTIONS must be handled using try..catch, because we can not avoid them.

                try{
                    //statement that are expected to throw a CHECKED EXCEPTION
                }catch(ExceptionType exceptionObj){
                    //exception handling code..
                }

                //try with multiple catch
                try{
                    //statement that are expected to throw a CHECKED EXCEPTION
                }catch(ExceptionType1 exceptionObj){
                    //exception handling code..
                }catch(ExceptionType2 exceptionObj){
                    //exception handling code..
                }catch(ExceptionType3 exceptionObj){
                    //exception handling code..
                }finally {
                    //executes at any cost.
                }
                
                //try with multi-catch
                try{
                    //statement that are expected to throw a CHECKED EXCEPTION
                }catch(ExceptionType1 | ExceptionType2 | ExceptionType3 exceptionObj){
                    //exception handling code..
                }finally {
                    //executes at any cost.
                }

                //try with resources
                try (/*declare closable resources like streams or connections ..etc., */) {
                    //statement that are expected to throw a CHECKED EXCEPTION
                }catch(ExceptionType1 | ExceptionType2 | ExceptionType3 exceptionObj){
                    //exception handling code..
                }

        throw   keyword is used to raise a (user defiend) exception.

        throws  keyword is used to transfer an exception from a method to its caller method.

    java.time
    ---------------------------------------------------

        Date and Time API
                            Factory Methods     
                            ---------------------------------------------------------
        LocalDate           of(year,month,date), now(), parse(String) , parse(String,dateTimeFormatter)  
        LocalTime           of(hour,min,sec), now(), parse(String) , parse(String,dateTimeFormatter) 
        LocalDateTime       of(year,month,date,hour,min,sec), now(), parse(String) , parse(String,dateTimeFormatter) 
        ZonedDateTime       of(year,month,date,hour,min,sec,zoneId), now(zoneId)
        DateTimeFormatter   ofPattern(dateTiemPatternString)
        Duration            between(start,end)
        Period              between(start,end)

        A method that is static and returns the object of the owned class is called a factory method.

                            Instacne Methods     
                            ---------------------------------------------------------
        LocalDate           isBefore(localDate), isAfter(localDate), equsls(localDate), 
                            getDate(), getMonth(), getYear(), format(dateTimeFormatter)
        
        LocalTime           isBefore(localTime), isAfter(localTime), equsls(localTime), 
                            getHours(), getMinutes(), getSeconds(), format(dateTimeFormatter)
        
        LocalDateTime       isBefore(localDateTime), isAfter(localDateTime), equsls(localDateTime), 
                            getHours(), getMinutes(), getSeconds(), getDate(), getMonth(), getYear(), format(dateTimeFormatter)

    java.util utility classes
    ----------------------------------------------------

        Scanner
        Random

    java.util collections API
    ----------------------------------------------------

        collections are java representation of data structures.

        Collection (I)
            |               represents a group of homoginous objects.
            |               add(ele), remove(ele), contains(ele), size(), isEmpty(), stream()               
            |
            |<- List (I)    
            |               represents a Linear data structure.
            |               supports positoning of elements called index, and that support randoem access
            |               anu number of duplicte elements and nulls can be added
            |
            |       |<- ArrayList       is a growable non synchronized array, hence not thread safe but fast in performence
            |       |<- Vector          is a growable synchronized array, hence thread-safe but slow in performence
            |       |<- LinkedList      is an doublly linked list algorithm implementation
            |       
            |<- Set (I)     
            |               represents a Non-Linear data structure.
            |               does not support index or random access
            |               no duplicates can be added and only one null can be added.
            |
            |       |<- HashSet         uses a hash-table internally and its retrival has no predictable order
            |       |<- TreeSet         uses binary search tree, and its elements are retrived in sorted order
            |       |<- LinkedHashSet   uses a lionked list and its elements are retrived in entry order

        Map (I)
        |                       represents a group of key-value pairs
        |                       keys can not be duplicates
        |                       put(key,value),set(key,value),get(key),containsKey(key),keySet(),values(),size(),isEmpty()
        |
        |<- HashMap             its retrival has no predictable order
        |<- TreeMap             its elements are retrived in sorted order
        |<- LinkedHashMap       its elements are retrived in entry order
        