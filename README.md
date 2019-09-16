## Make Change Project

### First week homework for Skill Distillery

### Overview

This program simulates a cash transaction interface.

### How to run
1. Step 1 Installation
2. Step 2 Using the app
#### Installation
1. Copy code and save it to a .java file
2. Open command prompt or terminal and goto the location where you saved file
3. Compile the .java to .class using javac command, you may need to install JDK8.
   ex. my filename for this app is MakeChangeApp
   so I type in terminal: javac MakeChangeApp.javac
4. Now execute the file using java command
   ex. java MakeChangeApp
#### Using the app
1. You are first greeted by the welcome screen and then immediately goto the main menu
2. You have 2 options at main menu, 1. Register 2. Quit
3. In the register this is where you make change, in the menu the user is prompted to input the amount of the item price
4. The menu reminds the user of the price they inputed
5. The register then goes immediately into the payment, prompting the user to input how much they are going to pay
6. Then after payment three scenarios are possible
    1. End user overpaid and notified the amount of change they will receive
    2. End user paid exact change and the system thanks the customer
    3. End user did not pay enough, and message appears showing an error message and insufficient funds
7. User then goes back to the main menu and goes through steps 2 to 6 again.
8. Press 2 at main menu to stop the program.

### Technologies/topics used
In this program I took advantage of
1. while loops - To keep end user in the main menu, allowing them to quit when they want to quit or keep going if they have more things to input.
2. scanner - To allow the user to interact with the interface
3. switch - To give the users options of what they want to do next
4. if/else statements - To ensure integrity of the system and pricing conventions
5. methods - To help with not having to write code over and over again
6. booleans - To help with integrity and an escape from the switch by allowing a way to quit the interface
7. decimal format - To prevent doubles not going past 2 decimal places to the right

### Lessons learned
1. I feel like there is a lot of other things I could have done, but am not familiar with and have decided not to try them because there is still a lot of room for additional things I could do to make this app even more useful.
2. Methods is very useful, its nice to see my main just being one method.
3. I kept going after meeting the requirements that was asked of me because its good way to learn code is to just keep going on and adding as many things as I can think of and trying to make it less code as possible.
4. If I'm in a switch, and get into another switch via if/else. Then within the second switch goto the method of the 1st switch, which is the same method of the 2nd switch. then I quit via boolean false via the first switch, it will bring me back to the second switch and if I want to quit I have to quit via the 2nd switch.
So just because either same method or the switch has a method, if I want to exit, I have to break the statement, ex. boolean false. So basically the deepest switch is how I exit. Very complicated to think about and write about.
5. Continue payment was deleted due to being bugged and its complicated to fix. Can be seen in earlier commits.
6. While making additional changes, I missed that the program was not working correctly, as in not giving enough pennies, this was caused by me going away from Double to Int and using the decimal format, the decimal format is only useful to a certain extent. I need something that makes the entire program #.00. Because the decimal format was not working as I wanted it too, maybe too many methods? It can be seen in earlier commits.
7. Closing the Scanner in methods other than the main causes stoppage in the program, so I'm going to avoid closing the Scanner. It's not friendly with multiple methods.
