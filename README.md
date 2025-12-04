Grocery Store Inventory Management System
Description

The Grocery Store Inventory Management System is a Java-based (or Flask/Python-based) application designed to help store owners efficiently manage inventory. It allows users to add, update, delete products, track stock levels, and receive alerts for low stock or expired items. This system ensures smooth operations and reduces manual errors in managing a grocery store.

Features

Add, update, and delete products

Track inventory in real-time

Low-stock and expiry alerts

Search and filter products

Export inventory data to JSON/CSV

User-friendly interface

Technologies Used

Frontend: HTML, CSS, JavaScript, Bootstrap (if web-based)

Backend: Java (or Python Flask)

Database: MySQL (or SQLite/PostgreSQL)

Tools: Eclipse IDE, Maven (for Java projects), Git & GitHub

Installation / Setup Instructions
Prerequisites

JDK 18+ installed (for Java)

Apache Maven installed

MySQL server running (with username/password setup)

Eclipse IDE or VS Code

Git installed

Steps to Run the Project

Clone the repository

git clone <your-github-repo-url>
cd <project-folder>


Open the project in Eclipse IDE

File → Import → Existing Maven Project → Browse → Select Project Folder

Configure JDK in Eclipse

Window → Preferences → Java → Installed JREs → Add → Select JDK 18

Setup Database

Open MySQL Workbench

Create a database:

CREATE DATABASE grocery_store;
USE grocery_store;


Execute the SQL scripts in the project to create tables and seed data.

Run the Project

Right-click on Main.java → Run As → Java Application

Or, for Flask/Python:

pip install -r requirements.txt
python app.py


Access the Application

Java: The console will display instructions for using the system

Flask: Open browser → http://127.0.0.1:5000/

Usage

Add new products with name, price, quantity, and expiry date

Update existing products as stock changes

Delete discontinued products

Monitor low-stock alerts to reorder inventory



Contributing

Fork the repository

Create a feature branch: git checkout -b feature-name

Commit your changes: git commit -m "Add feature"

Push to the branch: git push origin feature-name

Open a Pull Request

License

This project is licensed under the MIT License – see the LICENSE file for details.

Contact

Kokila Karthikeyan
GitHub: https://github.com/kokila0906

Email: kokilakarthikeyan2@gmail.com
