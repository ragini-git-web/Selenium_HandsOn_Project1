Selenium Hands-On: Automating Naaptol's Beauty & Wellness Category

Objective
To build a Selenium script that automates the following process in the given URL.


 URL= https://www.naaptol.com/
 
* The selenium project was designed to automate the "Beauty & Wellness" category on the Naaptol website. This project demonstrates best practices for Selenium automation,

 including:

1) Page Object Model (POM):
>Enhances code organization and maintainability.

2) TestNG Annotations: 
>Provides a structured framework for test execution.

3) Property File Configuration:
>Stores sensitive data like URLs and credentials separately.

4) Explicit Waits:
> Ensures script stability by waiting for elements to load.

5) Assertions:
> Validates expected outcomes and identifies potential issues.

6) Screenshots:
> Captures visual evidence of test execution for debugging.

7) Extent Reports:
> Generates comprehensive reports for test results.

8) Maven Project:
> Utilizes Maven for dependency management and project build


*Project Setup

1) Pre-requisites
-Java Development Kit (JDK)
-Maven
-Spring Tool Suite (STS)
-Selenium WebDriver (for Chrome or Firefox)
-TestNG
-Extent Reports

2)Clone the Repository:
-repo:ragini-git-web/Selenium_HandsOn_Project1 clone file

3)Import into IDE
-Open  STS.
-Import the project as an existing Maven project.

4)Configure Dependencies:
Ensure all necessary dependencies are included in the pom.xml file.
-maven-surefire-plugin
-maven-compiler-plugin
-maven-compiler-plugin
-testng
-webdrivermanager
-poi
-poi-ooxm
-extentreports
-commons-io

5)Running Tests
-Build the Project:mvn clean install  
-Execute Tests:mvn test

6)Project Structure
BeautyWellnessAutomation/

├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── 
│   │   │       └── Beauty
│   │   |       └── Helthcare
│   │   │       └── Health Suppliments
│   |           └──  Pain Relivres
|   |           └──  Women's Care
│   └── test/
│       ├── java/
│       │   ├── testscasess
│       │   │   ├── tests
│      
|__Screenshots
|
|__reports.html
|
|└── testng.xml
|
└── pom.xml


*Test Cases
This project includes a comprehensive set of test cases covering various functionalities within the "Beauty & Wellness" category, including:

-Navigating to the category page
-Searching for specific products
-clicking on checkboxes present on that page 
-Adding products to the cart
-Verifying product details
-Proceeding to checkout
-Handling the windows






































