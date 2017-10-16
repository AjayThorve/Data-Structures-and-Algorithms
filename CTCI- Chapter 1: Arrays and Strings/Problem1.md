<b> Implement an algorithm to determine if a string has all unique characters. </b><br>
Ans:<br>
Either use a 128 sized array, or a HashSet. Also, check if character is ASCII, if so, if string greater than 128(256 incase of extended ASCII), it's not unique.

<b> What if you cannot use additional data structures?</b><br>
1) Brute force - time: O(n<sup>2</sup>), space: O(1)
2) Sort and then check for neighbouring elemennts - time: O(n logn), space depends on sorting algorithm
