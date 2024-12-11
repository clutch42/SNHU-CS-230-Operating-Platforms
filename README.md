# CS-230-J7600-Operating-Platforms

## Course Description
Students will develop a deeper understanding of operating platforms and architectures through 
the analysis and evaluation of the characteristics, advantages, and weaknesses of each. 
Students will learn the value of utilizing software design templates as well as how to utilize 
them to solve problems.
## Course Competencies
This course covers the following competencies, which represent the knowledge and skills 
relevant to your field:
- CS-30406: Utilize software design templates and patterns to efficiently solve a problem
- CS-30407: Analyze the characteristics of and techniques specific to various systems 
architectures
- CS-30408: Evaluate the characteristics, advantages, and weaknesses of various 
platforms
## Project
The Gaming Room wants to develop a web-based game that serves multiple platforms based on their current game, Draw It or Lose It, which is currently available in an Android app only. Draw It or Lose It is loosely similar to the 1980s television game Win, Lose or Draw, where teams compete to guess what is being drawn. Rather than a player drawing images on an easel to help team members guess the puzzle (a phrase, title, or thing), the application will render images from a large library of stock drawings as clues. A game consists of four rounds of play lasting one minute each. Drawings are rendered at a steady rate and are fully complete at the 30-second mark. If the team does not guess the puzzle before time expires, the remaining teams have an opportunity to offer one guess each to solve the puzzle with a 15-second time limit. We will have to make it so the program can run on multiple other platforms.

I feel that the part of the documentation that I did particularly well was in the domain model and translating from the UML diagram, showing inheritence of classes, and relationships between classes.

I also feel that the domain model definitely helped me with developing the actual code for the application.

The part I would revise would be the developement requirements. I think I did a faily good job on it initially, but I have a much better understanding of it now and know that there are a few things I would change, and quite a few additions as well.

In the application, I interpreted the users needs by creating classes that inherited from each other, and made sure that there was only one instance of the gameservice, with unlimited number of games in it, with unlimited number of teams in each game, and umlimited number of players in each team. I added a function in each of these classes to print out with a tab inward so I could test it easily and have it be easily readable like so:

- game 1
  - team 1
    - player 1
    - player 2
  - team 2
    - player 1
- game 2
  - team 1
    - player 1

For designing the software, most of the time was used on researching what operating system would fulfill the users requirements, how to manage the memory, how to deal with the storage, and how to implement the application on multiple operating systems. I would probably use the same technique of dividing the project up into these seperate components for the next application I design, and probably use Google sooner rather than later.
