# Notch Contact Automation Project

This project automates the "Contact Us" page on the [Notch website](https://wearenotch.com/contact/) using **Selenium WebDriver** with Java and the **Page Object Model (POM)** pattern. The automation covers handling pop-ups, filling out the contact form, selecting services, uploading files, and verifying the functionality of the "Get in touch" button.

---

## Features

- Popup handling for rejecting cookies.
- Automated form filling (first name, last name, email, phone).
- Automated selection of services (DevOps, Quality Assurance).
- File upload automation using AutoIT.
- Screenshot capturing after each test.

---
## Technologies Used

- **Programming Language**: (Java)
- **Testing Framework**: (TestNG)
- **Web Automation**: (Selenium)
- **Build Tool**: ( Maven)
- **Version Control**: (Git)

---

## Installation

### Prerequisites

- **Java JDK 8+**
- **Maven** (for managing dependencies)
- **Selenium WebDriver**
- **TestNG** (for running tests)
- **ChromeDriver** (for testing on Chrome browser)
- **AutoIT** (for file upload automation)

### Steps to Install

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/notch-contact-automation.git

2. Navigate to the project directory:
    bash
    cd notch-contact-automation
    
3. Install dependencies:
    Ensure that Maven is installed on your machine, then run:
    bash
    mvn install

   ## Usage

1. Download the correct version of ChromeDriver for your version of Chrome from the official [ChromeDriver](https://sites.google.com/chromium.org/driver/) website.
   
2. Update the chromedriver path in the Testpage.java file:
    java
    System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
    
3. Run the tests using TestNG:
    bash
    mvn test

### Dependencies
Selenium WebDriver for browser automation.
TestNG for test framework.
ChromeDriver to interact with Chrome browser.
Apache Commons IO for file handling.
All dependencies are listed in the pom.xml file and managed via Maven.

### Configuration
Browser Configuration: The project is currently configured to use ChromeDriver. You can configure it to use other browsers by changing the WebDriver initialization in Testpage.java.
Timeouts: Page load and element waits are configured for 10 seconds

### Running Tests
To run the tests, ensure that the ChromeDriver is in the correct path and all dependencies are installed. Use the following command:
mvn test

### Troubleshooting
ChromeDriver version issues: Ensure that your ChromeDriver version matches your installed Chrome browser version.
File upload failure: Verify the correct path of the executable for file upload and ensure proper permissions.
Timeouts: If elements are not found, increase the wait time in WebDriverWait.

Contributor
Roshni Nikale 









