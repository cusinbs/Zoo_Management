# Zoo Management [Java]

## Project Description

>Problem
>----------
>Create a console based application in any language for a zoo manager to manually place new animals into different exhibits. The following requirements are relatively simple, but the application should be designed so that it could be used as the basis for a more complete implementation. In other words, use sound design patterns and coding practices. Creativity within the scenario will be appreciated but isn't required.
>
>Requirements
>----------
>- The console applications starts with a prompt to place a randomized animal into an exhibit (see options below)
>- The user must choose an exhibit to place the animal in and will receive an appropriate error if the animal can't be placed in the exhibit
>- Only 2 exhibits exist for each exhibit type
>- Display the status of each exhibit before each sorting selection
>- Exhibit rules:
>   - Only 1 type of animal can exist in an exhibit
>   - A max of 4 animals per exhibit
>   - Animals must match their environment
>- Animals include:
>   - Elephant (savanna only)
>   - Lion (savanna only)
>   - Polar Bear (arctic only)
>   - Penguin (arctic only)
>   - Whale (ocean only)
>   - Dolphin (ocean only)
>- Exhibits include:
>   - Savanna
>   - Arctic
>   - Ocean

## Approach
- This program is desgined by following the SOLID principles. However, since I am still a beginner, there might be some unoptimized places in the code. Please feel free to improve upon and send me a pull request. I would really appreciate your feedbacks.
- I chose ArrayList to be the ADT for this project. There is no specific reason why I choose ArrayList, any other ADT such as: LinkedList, Stack, Queue, etc would work just fine.

-----------
Exhibits:
- All the exhibits would share these same attributes: capacity, ArrayList to hold the animals, and the type of the exhibit (Savanna, Ocean, or Arctic)
- All the exhibits would share these same methods: getter and setter for exhibit type, validate animal, add animal, get size, check if empty, and get the current type of animal in the exhibit.
- As a result, I created an abstract class called Exhibit which has all the attributes and methods as I mentioned above.
- Then I created Savanna, Ocean, and Arctic to extends from that abstract class for code reusability
-----------
Animals:
- For this program, all animals would have only two attributes, the animal's name and the animal's suitable environment.
- Therefore, similarly, I created an abstract class Animal which has those 2 attributes and getters, setters.
- Then I created the animal classes (Lion, Penguin, etc) and extended from that abstract class for code reusability also.
-----------
Main Class:
- In the Main class, I create a method to generate a random animal from 6 animals.
- Then keep user in a loop of adding animal to an exhibit until they type "exit".
- If the user couldn't place the animal correctly, they will get another prompt to place that same animal until they place them correctly.
- However, the original problem doesn't state what would happen when an animal appear and there is no space left for that animal in both exhibits. Therefore, I would advise user to type "exit". 

## Summary on how my solution works
  - Generate a random animal
  - Getinput from user to choose which exhibit to place them
  - Validate if that exhibit is suitable for them then print out message accordingly
          
