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
- Date of publication, takes into account only year and month.

Thus, there are three properties, each related to one of the three sort criteria listed above. If one property is true, the others must be false. One property must be true. The user sets the properties. For the output, the entire entry is printed on the GUI. The GUI provides a button called Next. In this set up, the bean prints one entry when we click on the Next button. Every time we click on this button, the next entry is printed after the previous entry so that we can read all the entries. If at any time there are no entries left, the GUI prints a message No entries remaining.
  
  
## Contents:
  - **BibliographyProj.tar**: The whole project that was implemented  using netbeans.

  - **srcCode.tar**: The source code of the implemented java bean. It is the src folder of the project (**src/cs518/a2/budgaga**).

  - **Bibliography.jar**:  The deployable Java Bean.

  - **testBibFile.bib**: A simple LaTeX bibfile that can be used to test the The Bibliography bean.
	

## Execution:
You can test the Bibliography bean using BeanBox. 
All you need to do is to add the Bean to BeanBox is to copy the deployable bean (Bibliography.jar) in the  BeanBox's subdirectory named jars. 
The jars directory contains the JAR files for the Beans that are used by BeanBox. You can also load the bean at run-time by using the File menu and selecting LoadJar.
