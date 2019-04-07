Start the application by running the App file. This will print out to file content and properties onto the Terminal

Get the required generated password from the spring output in the terminal window. Text displayed for password is (Using generated security password:xxxxxxxxxxxxxxx)

Using either postman or a simple browser session enter http://localhost:8848/name?fileName='Name of any file in the File directory'. This will display in Json format the 
properties of the file entered - Filename, file mime type, file size, file extension

To get a specific file by mime/extension type using postman or a browser session, enter http://localhost:8848/supported-mime-type?mimeType=csv