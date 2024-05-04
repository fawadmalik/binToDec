# binToDec 

# How to run multiple java files from the commandline

1. **Compile Java Files:**
   ```
   javac -d output\classes src\*.java
   ```
   - `cd c:\binToDec` : this is the root of the java project and all file references are relative to this directory.
   - `javac`: This is the Java compiler command. It is used to compile Java source files into bytecode (.class files).
   - `-d output\classes`: This option specifies the destination directory for compiled class files. In this case, it's `output\classes`.
   - src\*.java specifies all java files under the src directory that are `src\BinToDecApp.java and src\BinToDec.java`: These are the Java source files to be compiled.

   Putting it all together, the command `javac -d output\classes src\*.java` tells the Java compiler to compile `BinToDecApp.java` and `BinToDec.java` files and put the compiled `.class` files into the `output\classes` directory.

2. **Create JAR File:**
   - `jar`: This command is used to create a Java Archive (JAR) file, which is a compressed file format that bundles Java class files, resources, and metadata.
   - `cvf`: These are options for the `jar` command:
     - `c`: Create a new JAR file.
     - `v`: Verbose output (display the filenames as they are added to the JAR).
     - `f`: Specifies the filename of the JAR file to be created.
   - `output\BinToDec.jar`: This is the filename and path of the JAR file to be created.
   - `-C output\classes .`: This option specifies the directory where the compiled `.class` files are located. The dot `.` represents the current directory, indicating that all files in the specified directory should be included in the JAR file.

   So, the command `jar cvf output\BinToDec.jar -C output\classes .` creates a JAR file named `BinToDec.jar`, including all compiled `.class` files from the `output\classes` directory.

3. **Run Project:**
   ```
   c:\binToDec
   
   java -cp output\classes BinToDecApp
   ```
   - `java`: This command is used to execute Java programs.
   - `-cp output\classes`: This option specifies the classpath, i.e., the directories or JAR files containing the compiled classes.
   - `BinToDecApp`: This is the name of the main class to run.

   Therefore, the command `java -cp output\classes BinToDecApp` runs the Java program using the compiled classes in the `output\classes` directory, with `BinToDecApp` as the main class.

4. **Run JAR File:**
   - `java`: Same as before, used to execute Java programs.
   - `-jar output\BinToDec.jar`: This option specifies that the JAR file to execute is `BinToDec.jar`.

   Hence, the command `java -jar output\BinToDec.jar` runs the Java program contained in the JAR file `BinToDec.jar`.

These commands together allow you to compile, package, and run the Java project from the command line.
