**Java Text Editor**

This is a simple text editor application built using Java Swing. It provides a basic set of features for creating, opening, saving, and printing text files.

**Features**

**File Module**
- New: Creates a new text file by clearing the current content in the text area.
- Open: Allows the user to select an existing file and opens its content in the text editor. The file contents are read using FileReader and BufferedReader, and displayed in the text area. If the user cancels the operation, a message is displayed.
- Save: Allows the user to save the current text in the editor to a file. The text is written to the file using FileWriter and BufferedWriter. If the user cancels the operation, a message is displayed.
- Print: Prints the current text in the editor.

**Edit Module**
- Cut: Cuts the selected text in the editor.
- Copy: Copies the selected text in the editor.
- Paste: Pastes the copied text in the editor.
- Select All: Selects all the text in the editor.

**Close and Menu Module**
- Close: Closes the text editor.
 All the features are added to the menu bar, which provides a user-friendly interface for accessing the various functionalities.

**Getting Started**
 To use the text editor, follow these steps:

1. Clone the repository to your local machine.
2. Open the project in your favorite Java IDE (e.g., IntelliJ IDEA, Eclipse, or NetBeans).
3. Locate the java_pro.java file and run the main() method.

**Dependencies**

 This project uses the following dependencies:
 
 Java Swing (included in the Java standard library)
