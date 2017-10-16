<p>
<h1>Problem 1</h1>
<b> Implement an algorithm to determine if a string has all unique characters. </b><br>
Ans:<br>
Either use a 128 sized array, or a HashSet. Also, check if character is ASCII, if so, if string greater than 128(256 incase of extended ASCII), it's not unique.

<b> What if you cannot use additional data structures?</b><br>
1) Brute force - time: O(n<sup>2</sup>), space: O(1)
2) Sort and then check for neighbouring elemennts - time: O(n logn), space depends on sorting algorithm
</p>

<p>
<h1>Problem 2</h1>
<p><b> Get two Strings and write a method to decide if one is the permutation of the other </b><p>

Solution: Using HashMap or 128-sized charArray. If frequencies match of each character for two strings, return true, else false.<br>
#Assuming characer comparison as case-sensitive

Output:<br>
<br>
AJAYs-MBP:two ajayanilthorve$ javac two.java<br>
jAJAYs-MBP:two ajayanilthorve$ java two<br>
Enter String 1: Ajay<br>
Enter String 2: jAya<br>
Permutation<br>
AJAYs-MBP:two ajayanilthorve$ java two<br>
Enter String 1: Ajay<br>

Enter String 2: jaya<br>
Not a Permutation of each other<br>
AJAYs-MBP:two ajayanilthorve$ java two<br>
Enter String 1: Sri<br>

Enter String 2: irS<br>
Permutation<br>
AJAYs-MBP:two ajayanilthorve$ <br></p>
<p>
<h1>Problem 3</h1>
<p>Write a method to replace all spaces in a string with '%20: You may assume that the string
has sufficient space at the end to hold the additional characters, and that you are given the "true"
length of the string. (Note: If implementing in Java, please use a character array so that you can
perform this operation in place.)<p>
EXAMPLE
<br>
Input: "Mr John Smith ", 13<br>
Output: "Mr%20John%20Smith"<br></p>