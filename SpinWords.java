/*
    Write a function that takes in a string of one or more words,
    and returns the same string,
    but with all words that have five or more letters reversed (Just like the name of this Kata).

    Strings passed in will consist of only letters and spaces.

    Spaces will be included only when more than one word is present.


    Exemples:
    "Hey fellow warriors"  --> "Hey wollef sroirraw"
    "This is a test        --> "This is a test"
    "This is another test" --> "This is rehtona test"
 */

public class SpinWords {

    public String spinWords(String sentence) {
        String[] arrSentence = sentence.split(" ");
        StringBuilder finalSentence = new StringBuilder("");

        for(int i = 0; i < arrSentence.length; i++) {
            if (arrSentence[i].length() >= 5) {
                finalSentence.append(new StringBuilder(arrSentence[i]).reverse());
            } else {
                finalSentence.append(arrSentence[i]);
            }
            finalSentence.append(" ");

        }
        return new String(finalSentence).stripTrailing();
    }
}
