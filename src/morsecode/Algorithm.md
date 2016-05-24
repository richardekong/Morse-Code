Decode Morse Algorithm

Algorithm for decode method
   * 1. create variable to hold the morse code value to be translated
   * 2. create variable space, decodedValue and final decoded Value
   * 3. split morse code in to an array of words with the '|' delimetre
   * 4. loop through each word in the array of words
   * 5. within the loop: 
   *                    i.  split each word into an array of characters with the space character delimeter  
   *                    ii. check if character is empty, continue the loop even if it's empty
   *                    iii.loops through the array containing morse code values, and decode every '.' to 'E's and '-' to 'T's
   *                              within the current loop, if the character equals items in array1, concatinate character's english equivalent to decoded value
   * 6. replace all '|' characters within decoded value with a space character
   * 7. loop through the decoded items:
   *            i.if they contain any combination of 'E's and 'T's:
   *                        concatinate representative character equivalent to finalDecodedValue
   *            else:
   *                   concatinate the item within the decoded array to finalDecodedValue
   * 8. print the value of finalDecodedValue


   Algorithm for setToSentenceCase method

  * 1.define method setSentenceCase and set exp1 as method parameter
  * 2.within the method declare variables exp2, dot and space.
  * 3.if exp1 contains a fullstop:
  *     replace them with commas
  *     split exp1 into an array of setences
  *     loop through these sentences:
  *         remove all spaces at both the beginning and trailing portions of the sentence
  *         set the case of the first character of each sentence to uppercase and concatinate the lowercase version of the remaining substring and concatinate the resulting expression to exp2
  *  but if exp1 contains no fullstop, it implies it is not a sentence so:
  *     return back the initial expression