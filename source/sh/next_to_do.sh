#!/bin/bash        

# Requires general.sh
#
# Various scripts (like run scripts) for the next todo project.
#
# Designed to be a set of functions to be imported in the bash startup script (.bash_profile)
# with a command like source ...next_to_do.sh
#
# TODO The following way of invoking Java programs should be generalized. Either a Java 
#      program should be written to do the launching in a simpler way, some third-party tool 
#      like JNLP should be used, or a Java program should generate this script.  

guavaClasspath=$MM_PROJECTS_DIRECTORY/Resources/Guava/guava-18.0.jar               
miscellanyClasspath=$MM_PROJECTS_DIRECTORY/Miscellany/build/jars/miscellany.jar
beanutilsClasspath=$MM_PROJECTS_DIRECTORY/Resources/Commons/BeanUtils/commons-beanutils-1.9.2/commons-beanutils-1.9.2.jar
commonsLoggingClasspath=$MM_PROJECTS_DIRECTORY/Resources/Commons/Logging/commons-logging-1.2/commons-logging-1.2.jar
cliClasspath=$MM_PROJECTS_DIRECTORY/CommandLineInterface/build/jars/commandLineInterface.jar
todoTPClasspath=$guavaClasspath:$commonsLoggingClasspath:$beanutilsClasspath
todoClasspath=$todoTPClasspath:$miscellanyClasspath:$cliClasspath:$MM_PROJECTS_DIRECTORY/NextToDo/build/jars/nextToDo.jar

# A sort alternative
msort() {

  java -classpath $todoClasspath mattmunz.todo.cli.Sorter $1
}

# A special filter for task lists
todoFinalFilter() {

  java -classpath $todoClasspath mattmunz.todo.cli.ListDisplayFilter 
}

# Move tasks from one day/time to another
moveTasks() {

  java -classpath $todoClasspath mattmunz.todo.cli.TaskMover $@ 
}
