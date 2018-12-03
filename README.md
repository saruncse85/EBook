## Please follow the steps to run the code.
### Pre-Requisits
    Maven software should be installed and configured.
    JRE/JDK 1.8 should be installed.

#### Step 1: Click "Clone or Download" button then click "Download Zip".

#### Step 2: Extract the zip file in your local machine.

#### Step 3: Go to extracted folder using command line.

#### Step 4: Build the application using below Maven Command.
        Example: C:\EBook> mvn clean compile package <enter>
        
#### Step 5: Copy the generated war file from target/EBook-0.0.1-SNAPSHOT.war to tomcat webapps directory

#### Step 6: Start the tomcat server.

#### Step 7: Use the following URL's to see the webservice response.

      1. http://localhost:8080/eb/topic/257  ---- Returns specific topic 
      2. http://localhost:8080/eb/topic/25798767 ----- Returns unknown topic
      3. http://localhost:8080/eb/class/sports ----- Returns specific class
      4. http://localhost:8080/eb/all/topic -------- Returns all topics
      5. http://localhost:8080/eb/anyurl ----------- Returns http 404 response

Assumptions
===========
	1. Input file will be xml file with list of publish urls
		
Future Changes
==============
	1. We can fetch the publish urls from database.
	2. All the database configuration can be made by writing a configuration class.
	3. File can be uploaded from UI, file/file path can be passed to Controller.
