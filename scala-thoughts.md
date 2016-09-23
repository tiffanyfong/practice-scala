### What's easy to do in Scala? What's not?

Although Scala users can choose between imperative and functional programming, I 
find it much easier to use functional programming because the code is much more 
concise. Moreover, Scala provides a lot of support for functional methods like 
filter, partition, map, etc. 

Imperative programming is possible, but that's not Scala's intention. 
Particularly, for the palindrome function, I know there is a better (more time-
efficient) solution using imperative programming, but it's just so much easier 
to filter out non-alphabetic characters and compare with the reversed string. So 
Scala might not be best language to use if you're trying to implement clever, 
tricky algorithms. But it is good for clear, unambiguous code.


### What is/are your favorite language design choice(s) that the designers of Scala made? Why?

I like how Scala implemented Options. Options makes my code simpler by avoiding 
having a separate null case in my function. In other languages like Java, if I 
have a null value, I would throw a NullPointerException (or crash), but in 
Scala, I can just return None. I know Swift (for iOS) has optional types too (I 
think Swift may have taken inspiration from Scala, among many other programming 
languages), but Swift's syntax for optional types is less intuitive. 

I also appreciate how Scala lets users type '_' for things they don't 
necessarily need or want to specify. It makes the code more concise, and using 
underscores prevents useless variable names that distract from the real 
intent of the code.


### What is/are your least favorite language design choice(s)? Why? And why do you think the designers made that / those choice(s)?

I've been using Scala for a while, so I have trouble coming up with things I 
don't like about it (on the other hand, I can easily rant about Java). But in my 
experience, I had trouble understanding the difference between the 
fold/foldLeft/foldRight list methods. They look the same in the built-in source 
code for traversables. Fold simply uses the foldLeft method, it just has a 
different type declaration. But I think the designers separated these methods 
because sometimes people want to fold a list and output a different type; thus 
you can't use fold. But if people don't care which direction the fold goes (i.e. 
sums), then there is no need to specify left or right.


### What Scala features would you like to learn more about?

When I learned Scala during my internship, I was only focusing on Scala as 
another programming language and may have taken DSLs for granted. Now I'm 
curious how Scala created all these useful methods and tools. For example, I 
know that Scala's for-yield statements are essentially flatmaps, but how was the 
for-yield pattern designed to trigger the flatmap methods?

