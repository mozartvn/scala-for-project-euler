/*

Problem 5

What is the smallest number divisible by each of the numbers 1 to 20?

Range
Int.MaxValue
forall
	http://stackoverflow.com/questions/12547235/scala-forall-example
	http://www.scala-lang.org/api/current/scala/collection/immutable/List.html

*/


val r = Range(20, Int.MaxValue)
  .find(n => Range(2, 21).forall(n % _ == 0)).get

assert(r == 232792560) // 23 s