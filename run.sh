# set class path for external libraries
cmd="javac -cp .:lib/* -d bin src/kr/pwner/calculator/Application.java"
echo $cmd
$cmd

# class path for binary files and external libraries
cmd="java -cp bin:lib/* src.kr.pwner.calculator.Application"
echo $cmd
$cmd
