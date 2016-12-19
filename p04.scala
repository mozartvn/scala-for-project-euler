/*

Problem 4

Find the largest palindrome made from the product of two 3-digit numbers.

flatMap
toString
toString.reverse
max

*/


val r = (100 to 999).view
  .flatMap(i => (i to 999).map(_ * i))
  .filter(n => n.toString == n.toString.reverse)
  .max

assert(r == 906609) // 102 ms