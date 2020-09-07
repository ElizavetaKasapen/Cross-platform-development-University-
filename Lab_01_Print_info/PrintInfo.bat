echo off
set path=C:\Program Files\Java\jdk-14.0.2\bin
set include=C:\Program Files\Java\jdk-14.0.2\include
set lib=C:\Program Files\Java\jdk-14.0.2\lib
set link=C:\Program Files\Java\jdk-14.0.2\bin
javac -version PrintInfo.java
java PrintInfo
javap -c PrintInfo > PrintInfo.txt
javadoc PrintInfo.java -d PrintInfo
pause