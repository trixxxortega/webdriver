# 🚀 Enterprise UI Automation Framework | Java & Selenium

Professional-grade UI Automation Framework built with **Java**, designed for scalability and seamless **CI/CD** integration.

## 🏛️ Architecture & Design Patterns

The framework follows a decoupled architecture to maximize reusability:

* **Page Object Model (POM):** Separation of test logic from UI interactions.
* **Test Lifecycle:** Centralized control via **TestNG Annotations**.
* **Resilient Waits:** Fluent waits to eliminate test flakiness.
* **Parallel Execution:** Optimized for high-speed feedback cycles.

## 🛠️ Tech Stack

* **Language:** Java 21 (LTS)
* **Build Tool:** Maven
* **UI Engine:** Selenium WebDriver
* **Test Runner:** TestNG
* **CI/CD:** GitHub Actions

## 📁 Project Structure



[Image of page object model architecture diagram]


```text
src/
└── test/java/com/ti/automation/
    ├── pages/  # POM Selectors & Actions
    ├── tests/  # Functional test cases
    └── base/   # Driver & Base Config
```

## 🎯 Scope of Testing: Financial Operations (ParaBank)

Automating high-integrity banking workflows to demonstrate business-value validation.

### Key Automated Scenarios:

1. Financial Integrity: Validating "Transfer Funds" and balance updates.

2. Bill Pay Management: Verifying utility payments and consolidation.

3. Auditing: Checking historical ledgers and transaction IDs.

4. Negative Testing: Resilience checks on insufficient funds/invalid data.

## 📊 Strategic QA Governance

### Managed via testng.xml for targeted validation:

1. Smoke Suite: Critical Happy Paths for PR feedback.

2. Regression Suite: Comprehensive coverage for stability.

3. Parallel: Multi-threaded execution for faster CI/CD.

## ▶️ Execution Guide

### Prerequisites: Java 21 & Maven installed.

### Clone & Run:

```Bash
git clone
cd webdriver
mvn clean test
```

### Run Specific Suite:

```Bash
mvn test -DsuiteXmlFile=testng_smoke.xml
```

## 👤 Author

**Eleonora Ortega** - Senior / Lead QA Engineer LinkedIn | Buenos Aires, Argentina
