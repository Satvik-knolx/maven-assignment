package com.knoldus;
// This class contains 2 methods to perform actions on strings
public class StringAPI {

    // method to find the length of the string(count of total characters present in the string)
    public int stringLength(String inputFromUser){
        inputFromUser = inputFromUser+'\0';

        char[] characterInArray = inputFromUser.toCharArray();

        int countOfCharacter = 0;

        while(characterInArray[countOfCharacter]!='\0'){
            countOfCharacter += 1;
        }

        return countOfCharacter;
    }

    //method to reverse the string provided by the user
    public String reverseString(String inputFromUser){
        int stringLength = stringLength(inputFromUser);

        String reversedString = "";

        for(int index= stringLength-1; index>=0; index--){
            Character currentCharacter = inputFromUser.charAt(index);
            reversedString = reversedString + currentCharacter;
        }

        return reversedString;
    }
}