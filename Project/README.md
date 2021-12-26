# COMPUTER APPLICATIONS PROJECT WORK

### Guide lines for preparing a project
**(Note: To Be Done in an Oxford File)**

+ Make Cover Page
+ Make Index of programs with page no.
+ Write Introduction
+ Write the program along with its comments, variable description & output
+ Write Conclusion & Acknowledgement

----------------------------------------------------------------------------------------------------------------------------
# 1

Amicable numbers are two different numbers so related that the sum of the proper divisors of
each is equal to the other number. <br>

For example, the smallest pair of amicable numbers is (220, 284); for the proper divisors of <br>
220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110, of which the sum is 284; and the proper <br>
divisors of 284 are 1, 2, 4, 71 and 142, of which the sum is 220.

A Happy number is defined by the following process: Starting with any positive integer, <br>
replace the number by the sum of the squares of its digits, and repeat the process until the <br>
number equals 1. 

For example, 19 is happy, as the associated sequence is: <br>
```math
1^2 + 9^2 = 82  
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
```
As we reached to 1, 19 is a Happy Number.

Write a menu driven program using switch-case to send either character „A‟ or „H‟ as
parameter and input the numbers to check if it an Amicable Number or Happy number or
none of these.

Program Here : [Link](https://github.com/Shiv-Learning-Cente/Computer-Applications-X/blob/main/Project/AmbicableHappy.java)

----------------------------------------------------------------------------------------------------------------------------
# 2

n is a perfect number if the sum of the factors of the number including 1 and excluding itself is n.
For example,
```math
6 =1+2+3 and
28=1+2+4+7+14
```

Define a class called **numberProblems** which has the following functions: <br>
+ **int nthPrime(int n)** - method that returns the nth prime number given as parameter. <br>
+ **void perfectNosBelow(int lim)** - which first prints out the nth prime number given as limit and then prints all perfect numbers less than lim.

Each perfect number should be printed on a separate line along with its factors.  <br>
For example, the output from **perfectNosBelow(500)** will be:

```math
500th prime number = 3571
6   = (1,2,3)
28  = (1,2,4,7,14)
496 = ( (1, 2, 4, 8, 16, 31, 62, 124, 248)
```

----------------------------------------------------------------------------------------------------------------------------

# 3

197 is a **Keith Number** because it follows a specific pattern demonstrated hereunder: -
```math
197

Step 1
1+9+7
= 17

Step 2
9+7+17
= 33

Step 3
7+17+33
= 57

Step 4
17+33+57
= 107

Step 5
33+57+107
= 197
```
Write a program to print all **three digit Keith Numbers**

----------------------------------------------------------------------------------------------------------------------------

# 4
Write a program to create a class named **Auxilium** with the following properties: -

Instance variables/data members:
+ **int n** - to store the number using scanner class
+ **int c** - to count the factors of a number
+ **boolean a** - to store true if number is prime
+ **int sum** - to find the sum of the prime numbers

Member methods:
+ **Auxilium()** - default constructor to initialize data members
+ **void input()** - method to input a number using scanner class
+ **boolean prime()** - method that checks if the original number as well as others are prime numbers or not. For e.g. Original number = 41 is a prime number
+ **void check()** - method to print the output – **“Auxilium Number”** if the combination of all the consecutive prime numbers up to the
original number when added gives rise to the same number. 

For e.g. <br>
Original number = 41 <br>
Combination = 2 + 3 + 5 + 7 + 11 + 13 = 41 <br>
Result = Auxilium Number <br>

For any other prime number not producing desired result, the program prints the message– **“Not an Auxilium Number”** and if the user inputs any composite number then the program prints – **“Sorry! Not Possible!”**.

Write a main method to create the object of the class and call the above methods.

----------------------------------------------------------------------------------------------------------------------------

# 5

In a Pascal‟s Triangle the extreme left and right slot is guarded by 1 and the numbers in between are formed by adding the previous two numbers. For e.g.
```math
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
```
Write a program to print the Pascal‟s Triangle in such a way that if the user gives the input 5 then the computer print just the five rows of Pascal‟s Triangle.

