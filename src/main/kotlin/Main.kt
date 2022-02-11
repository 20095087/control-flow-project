//TODO INSTRUCTIONS:
//  1. Now that you have the code in IntelliJ on your computer, use VCS to "Share this project to your GitHub repo
//     that is attached to your student email.  MAKE SURE YOU HAVE THIS REPO SET TO PRIVATE.
//  2. Run the app and familiarise yourself with the output and where each part of the output came from in the code.
//  3. There are multiple TO DO comments - follow this workflow when addressing EACH one:
//       a. Locate a single TO DO item that you want to work on
//       b. Add the required code to address it.
//       c. Commit the change to your local repository, making sure your commit message explains (briefly) what you did.
//       d. Push the change to your remote repository
//  4. REMEMBER TO USE THIS GITHUB WORKFLOW FOR EACH CHANGE - failure to use GitHub in this way will result in
//     a lower grade for the assignment as it is a software development tooling module.
// Hint: the week 2 syntax labs are a good support for completing this project

fun main(args: Array<String>) {
    minimumOf(9,7)
    rangeOf(4)
    inferredTypeOf(0.0F)
    stringContains("wordle")
}

var msg1 : String = "the first number is smaller than the number2!";
var msg2 : String = "the first number is greater than or equal to number2";
fun minimumOf(number1: Long, number2: Long) = if(number1 <= number2)println(msg1); else println(msg2);

fun rangeOf(number: Int){
    when(number){
        in Int.MIN_VALUE..0 -> println("the number $number is below 0 or is 0");
        in 1..5 -> println("the number $number is between 1 and 5");
        in 6..10 -> println("the number $number is between 6 and 10");
        in 11..20 -> println("the number $number is between 11 and 20");
        in 21..Int.MAX_VALUE -> println("the number $number is 21 or greater");
    }
}

fun inferredTypeOf(variable: Any){
    //TODO This function examines the inferred type of the variable passed as a parameter.
    // When the type is Int, print out that the data type of the variable is Int.
    //    Adopt the same approach for the following types: Long, Double, Float or Boolean.
    // When the data type is not Int, Long, Double, Float or Boolean, print that the data type is something else.
}

fun stringContains(str : String){
    //TODO If the string, passed as a parameter:
    //    - contains the letter A, print the string and say it contains A.
    //    - contains the letter B, print the string and say it contains B.
    //    - contains the letter C, print the string and say it contains C.
    //    - is empty, inform the user that it is empty.
    //    - otherwise print the string and say it doesn't contain A, B or C.
}
