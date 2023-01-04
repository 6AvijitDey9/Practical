Var Msg1 = Document.GetElementById("Message1") Var Msg2 = Document.GetElementById("Message2") Var Msg3 = Document.GetElementById("Message3") Var Answer = Math.Floor(Math.Random() * 100) + 1;
Var No_of_guesses = 0;
Var Guesses_num = [];

Function Play() {
    Var User_guess = Document.GetElementById("Guess").Value;
    If (User_guess < 1 || User_guess > 100) {
        Alert("Please Enter A Number Between 1 To 100");
    } Else {
        Guesses_num.Push(User_guess);
        No_of_guesses += 1;
        If (User_guess < Answer) {
            Msg1.TextContent = "Your Guess Is Too Low"
            Msg2.TextContent = "No. Of Guesses : " + No_of_guesses;
            Msg3.TextContent = "Guessed Number Are: " + Guesses_num;
        } Else If (User_guess > Answer) {
            Msg1.TextContent = "Your Guess Is Too High"
            Msg2.TextContent = "No. Of Guesses : " + No_of_guesses;
            Msg3.TextContent = "Guessed Number Are: " + Guesses_num;
        } Else If (User_guess == Answer) {
            Msg1.TextContent = "Yahhhh You Won It!!"
            Msg2.TextContent = "The Number Was " + Answer Msg3.TextContent = " You Guessd It In " + No_of_guesses + "Guesses";
        }
    }
}