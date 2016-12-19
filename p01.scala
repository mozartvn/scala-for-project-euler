/***

Problem 1
Add all the natural numbers below one thousand that are multiples of 3 or 5.*

***/

val r = (1 until 1000).view.filter(n => n % 3 == 0 || n % 5 == 0).sum

assert(r == 233168) // 7 ms