## DBConfig-SetterBasedInjection
Create a class called DBconfig  with the below attributes <br />
![Readme1](resources/readme1.JPG) <br />

Include getters and setters for all the above mentioned attributes.

DBConfig class should be registered as a bean with the spring container via XML file

The  attributes inside the DBConfig should be configured in the xml with the below values
<br />
![Readme2](resources/readme2.JPG) <br />
The values for these attributes should be injected via setter based injection.

Create class called EmployeeDAO that has below attribute
<br />
![Readme3](resources/readme3.JPG) <br />
Include getter/setter for the above attribute

EmployeeDAO should be registered as a bean with the spring container via XML file and DBConfig should be injected using setter based injection into the EmployeeDAO class

Create a class called Driver with the main method. Retrieve the EmployeeDAO object and display the details as shown in the sample input/output.

Assumption:

#### Design Constraints:

DBConfig class should be present in com.spring.app package

EmployeeDAO class should be present in com.spring.app package

Main class should be present in com.app.driver package

DBConfig and EmployeeDAO class should have the necessary getters and setters.

The className/Attribute Name/PackageName should be same as specified in the problem statement. Do not create any new packages.

The XML configuration should be done in the file beans.xml. This XML should be available under the resources folder of the created maven project.

#### Sample Input/Output:

oracle.jdbc.driver.OracleDriver

jdbc:oracle:thin:@localhost:1521:oracle

john

john@123
