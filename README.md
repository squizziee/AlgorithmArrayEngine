# Classes
```java
   io.github.squizziee.IterableProcessor
   ```
  * ### Fields
    No fiels here so far
  * ### Methods
    * `public`
       * **`randomFill()`** - fills a container with pseudorandom numbers
       * **`bubbleSort()`** - sorts numbers in container using Bubble Sort algorithm
       * **`quickSort()`** - sorts numbers using Quick Sort algorithm
       * **`selectionSort()`** - sorts numbers in container using Selection Sort algorithm
       * **`insertionSort()`** - sorts numbers in container using Insertion Sort algorithm 
       * **`compare()`** - compares two numbers and returns or biggest number or some `Object`
       * **`reverse()`** - reverses the order of the elements in container
       * **`getMostRepeatable()`** - returns an element with the biggest frequency in container
       * **`getMostRare()`** - returns an element with the smallest frequency in container
       * **`contains()`** - returns true if element exists in container, otherwise false
    * `private` and `protected`
       * **`partition()`** - "separates" elements in quickSort algorithm implementation
       * **`doQuickSort()`** - handles the behaviour of the `partition()` method
    
```java
   io.github.squizziee.StringProcessor
   ```
  * ### Fields
     * ```java
       static final char[] CONSONANTS // all English consonants
       ```
     * ```java
       static final char[] VOWELS // all English vowels
       ```
  * ### Methods
    * **`reverse()`** - returns a `String` with inverted sequence of chars of the `String` argument
    * **`isPalindrome()`** - returns `true` if the `String` argument is palindrome, otherwise false
    * **`generateRandomWord()`** - generates pseudorandom char sequence and converts it into `String`
    * **`getCharSubSequence()`** - returns a char sequence in range between arguments
