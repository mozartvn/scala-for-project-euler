/*
Problem 3

Find the largest prime factor of a composite number.

filter : find all elements which match predicate function
find : find the first element that matches predicate function
*/

def factors(n: Long): List[Long] = (2 to math.sqrt(n).toInt)
  .find(n % _ == 0).fold(List(n))(i => i.toLong :: factors(n / i))

val r = factors(600851475143L).last

assert(r == 6857) // 1 ms
