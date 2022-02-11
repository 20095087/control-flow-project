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
    when(variable){
        is Int -> println("The inferred type of the variable is Int");
        is Long -> println("The inferred type of the variable is Long");
        is Double -> println("The inferred type of the variable is Double");
        is Float -> println("The inferred type of the variable is Float");
        is Boolean -> println("The inferred type of the variable is Boolean");
        else -> {
            println("The inferred data type is something else");
        }
    }
}

fun stringContains(str : String){
    when{
        str.contains("a") -> println("The string contains a letter A");
        str.contains("b") -> println("The string contains a letter B");
        str.contains("c") -> println("The string contains a letter C");
        str.isEmpty() -> println("The string is empty!");
        else ->{
            println("The string: $str does not contain A, B, or C");
        }
    }
}
