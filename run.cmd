@echo off
title = RUN
:again
cls
java -classpath ./bin com.ferondir.HRExample.Main
pause
goto :again