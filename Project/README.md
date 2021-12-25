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
