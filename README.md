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


    
