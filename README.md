# Daily_Learn_Selenium

A complete Selenium + TestNG automation framework covering multiple concepts like locators, alerts, windows, iframes, file uploads, calendar handling, mouse/keyboard actions, screenshot capturing, TestNG features (Assertions, DataProvider, Groups, Parallel execution, Extent Reports, CRUD testing, etc.) with Maven build integration.

# Selenium + TestNG Automation Framework

This repository contains a **complete automation framework** built using **Selenium WebDriver, Java, TestNG, and Maven**.  
It demonstrates hands-on practice of multiple Selenium features and TestNG functionalities with structured modules, test reports, and screenshots.

---

## Project Structure

```

Selenium/
┣ ScreenShot/                 # Saved screenshots
┣ seleniumproject/            # Selenium learning & practice modules
┃ ┣ src/main/java             # Main Java classes
┃ ┣ src/test/java             # Selenium test cases
┃ ┣ testng.xml                # TestNG suite configuration
┃ ┗ pom.xml                   # Maven dependencies
┣ TestNG/demo-testng/         # TestNG-focused examples
┃ ┣ src/test/java             # TestNG practice (Assertions, CRUD, Groups, etc.)
┃ ┣ testng.xml                # TestNG suite config
┃ ┗ pom.xml                   # Maven dependencies

```

---

## Features

- Selenium WebDriver basic to advanced concepts
- Locators, Dropdowns, Checkboxes, Mouse/Keyboard Actions
- Alerts, Windows, Tabs, IFrames, Nested Frames
- File Uploads, Scrolling, Calendar Handling
- Screenshot Capturing & Popup handling
- TestNG features:
  - Assertions (Hard & Soft)
  - DataProvider
  - Dependency Methods
  - Grouping Tests (Smoke, Regression)
  - Parallel Execution
  - Extent Report Integration
  - CRUD Operations Testing
- Maven build integration
- Auto-generated TestNG & Extent HTML Reports

---

## Setup Instructions

### 1️ Clone Repository

```bash
git clone https://github.com/siddhugurubhetti8483/Daily_Learn_Selenium.git
```

### 2️ Import Project

- Open in **IntelliJ IDEA / Eclipse / VS Code**
- Make sure **Maven** is configured

### 3️ Install Dependencies

```bash
mvn clean install
```

### 4️ Run Test Cases

- Using Maven:

```bash
mvn test
```

- Using TestNG Suite:

```bash
Right-click testng.xml → Run as TestNG Suite
```

---

## 📊 Reports & Screenshots

- **Extent Reports**:
  Generated at project root → `ExtentReportExample.html` / `ExtentCRUDReport.html`

- **TestNG Reports**:
  Available under `target/surefire-reports/`

- **Screenshots**:
  Stored under `Screenshots/` or `ScreenShot/` folder

---

## Future Scope

- Add Page Object Model (POM) design
- Integrate with Jenkins for CI/CD
- Add cross-browser testing (Chrome, Firefox, Edge)
- Integrate with Docker & Selenium Grid

---
