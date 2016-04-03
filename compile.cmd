@echo off
title = "Compile"
:again
cls
javac -sourcepath ./src -d ./bin ./src/com/ferondir/HRExample/Main.java
pause
goto :again