//This program asks for a password, and if it is shorter than 5 characters, it asks again until it receives a password of 5 or longer.
//We need to decompose the program to the functions validatePassword() and main(). You already have the main() function.
//Your task is to write a password length check in the validatePassword() function.
// If the password is less than 5 characters, print "Your password should be longer than five characters, please write a new password" and return false as the result of the function.
//If the password is 5 characters or longer, print "Good password" and return true
fun validatePassword(password: String): Boolean {
    // write your code here
    val n = password.length>4
    if(!n)
    {
        println("Your password should be longer than five characters, please write a new password")
    }
    else {
        println("Good password")
    }
    return n

}

// do not change the code below
fun main() {
    var validationResult = false
    while (!validationResult) {
        val password = readln()
        validationResult = validatePassword(password)
    }
}
