# Treesales

The Problem
Several well-known companies use a pyramid sales scheme. Being both an entrepreneur AND a
computer scientist, however, you prefer to model your new business as a tree sales scheme,
where the hierarchical structure of the company can be modeled as a tree.
In particular, the company initiator, or CEO, is the root of the tree structure of the company.
From there, any current member of the company can hire a direct subordinate. So, at the
beginning, it's up to the CEO to hire other employees who will be directly below the CEO in the
tree structure. At any point in time, any employee can make a sale. Total compensation of any
employee is calculated based on the sum of sales of all members of the subtree rooted at that
employee, so it's important at any point in time to be able to calculate the total sales in any
subtree of the company structure.
In order to start your company and allow others to start similarly structured companies, you have
decided to write a computer program that will read in a set of operations from the following set:
1) Add an employee (first add is the CEO, rest are made by current employees)
2) An employee makes a sale
3) Query for the total sales in an employee's subtree at that point in time
and execute the appropriate command, in the order given, producing output for all commands of
type three.

The Input
The first line of input will contain a single integer, T (T ≤ 10), representing the number of
company structures to analyze. The first line of each company structure to analyze will contain a
single positive integer, n (n ≤ 100000), representing the number of operations to execute for that
company. The following n lines will each contain a single command with one of the following
three formats:

>ADD SPONSOR NEWEMPLOYEE

>SALE EMPLOYEE X

>QUERY EMPLOYEE

All employee names will be strings of 1 to 4 uppercase letters. In the first format, SPONSOR
will be the current employee who is hiring a new employee, and the NEWEMPLOYEE will be
the new employee to be added directly below the sponsor. The very first command for each
company will be an add command with the sponsor "ROOT", indicating that NEWEMPLOYEE
is the root of the tree structure for that company. No employee of any company will be named
"ROOT". In the second format, EMPLOYEE will be the employee in question and X will be a
positive integer less than 1000 representing the value of the sale made by the given employee. In
the third format, EMPLOYEE will be the employee in question for which we must find the total 
sales of her subtree in the company. All names given for current employees for all three types of
commands are guaranteed to be valid current employees.
It is guaranteed that all employees added will be identified by distinct strings and that the tree
structure produced will not have a height greater than 100. (Note: The height of a tree with two
nodes is 1.)

The Output
For each company output a single line header of the form

>COMPANY K

where K is the number of the company, starting with 1. For each query (command of type 3 in
the input), output a single line with a positive integer representing the current total sales of the
subtree of the employee queried. Note: Each company will have at least one query.
Sample Input 
>2 

>14 

>ADD ROOT BILL 

>ADD BILL EVELYN 

>ADD BILL SARAH 

>SALE BILL 25 

>SALE EVELYN 75 

>SALE SARAH 10 

>QUERY BILL 

>ADD EVELYN MATT

>ADD MATT ANYA

>SALE ANYA 1000

>QUERY MATT

>QUERY EVELYN

>QUERY BILL

>QUERY SARAH

>11

>ADD ROOT MARILYN

>ADD MARILYN GARY

>ADD MARILYN REMY

>ADD MARILYN BRIANNE

>ADD MARILYN TAJ

>SALE TAJ 10

>SALE REMY 20

>SALE BRIANNE 40

>SALE MARILYN 30

>QUERY GARY

>QUERY MARILYN

Sample Output
>COMPANY 1

>110

>1000

>1075

>1110

>10

>COMPANY 2

>0

>100
