/**
 * Find out if a list is a palindrome.
 */

class Problem6 {
  def checkIfPalindrome[A](listOfThings: List[A]): Boolean = {
    if (listOfThings == listOfThings.reverse) true
    else false
  }

}
