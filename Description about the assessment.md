#	This folder contains the assessment files and a video tutorial on how to create a sub module project in maven using terminal

#Step-1	First run "mvn archetype:generate" which will generate an architecture of maven project

#Step-2	Then you will be provided with a number of choices of maven architecture versions => type 2007 and hit ENTER

#Step-3	Then it will ask for the version of POM to be selected from a list => I chose option "8" which was '1.4'

#Step-4	Now it will ask for the groupID which basically means the name of your group  or organisation under which you are working the project => com.knoldus was provided 			by me in this project

#Step-5	now we need to provide artifactID which is basically the name of the module which we need to create like I gave "stringmanipulation"

#Step-6 now it will ask for the SNAPSHOT version which is basically the version of the project which we are working on

#Step-7 Now we will be needed to give the package name in which asks for the packaging method

<--Steps for creating sub modules-->

#Step-8 Now change directory using cd command and navigate to the parent directory 

#Step-9 Now again repeat the steps from Step-1 to Step-7 to create a sub module in the parent module

#Step-10 you will get an error to resolve it go to parents POM file and add <packaging>pom<packaging> and then repeat the Steps again it will work now

//you will be needed to repeat the Step-10 once each time you create a first sub module under any module

# Once you have created all the modules and submodules required for the project open the parent directory in intellij IDE and do the required development of project


