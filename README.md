# Bibliography
In this project,  I used Bean Development Kit and an existing TickTock bean to implement Bibliography bean. The Bibliography bean receives references that are given in the form of a LaTeX bibfile. Each entry in bibfile is of the form:  
  
@article{malaiya1,  
         author = {Y. K. Malaiya and A. Mayrhauser and P. K. Srimani},  
         title = {``{An} {Examination} of {Fault} {Exposure} {Ratio}''},  
         journal = {IEEE Trans. on Software Engineering},  
         volume = 19,  
         number = 11,  
         pages = {1087--1094},  
         month = {November},  
         year = 1993}.   
  
and generates entries in increasing order based on any one of the following criteria:  

- Last name of first author. If multiple entries are present, generate them in any order.
- Name of the journal. If multiple entries are present, then use the order of the paper titles. If even that is the same(!), choose any order after that.
- Date of publication, takes into account only Year and Month.

Thus, there are three properties, each related to one of the three sort criteria listed above. If one property is true, the others must be false. One property must be true. The user sets the properties. For the output, the entire entry is printed on the GUI. The GUI provides a button called Next. In this set up, the bean prints one entry when we click on the Next button. Every time we click on this button, the next entry is printed after the previous entry so that we can read all the entries. If at any time there are no entries left, the GUI prints a message No entries remaining.
