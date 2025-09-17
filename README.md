Agent
Implements both Person and Employee interfaces to provide personal identity and employment features for real estate agents.

Stores name, employee ID, salary, and license number.

Methods allow setting and retrieving these agent attributes in a type-safe manner.

Interfaces: Person & Employee
Person: Methods to set and get an individual’s name.

Employee: Methods to set and get an employee ID and salary.

Allow flexible role definitions. Classes can implement one or both, supporting multiple-inheritance of type in Java.

Property (Base Class)
Abstracts core property features: address, area, price, year built.

Allows for tax calculation by accepting property price and tax rate.

Provides a displayProperty method for formatted output.

ResidentialProperty & Villa (Inheritance)
ResidentialProperty extends Property, adding features like number of bedrooms, bathrooms, garage presence, and floor level.

Includes logic for monthly mortgage calculations.

Villa further extends ResidentialProperty and introduces garden-related features and tax calculation for gardens.

Commercial (Extends Property)
Models commercial real estate like shops or office spaces.

Adds business-specific fields: business type, parking spaces.

Supports lease duration and rate calculations, displaying property and lease details.

Main Program Flow
The Main class acts as the entry point, guiding the user through property management tasks using a menu-driven system.

Operations include displaying property details, tax calculations, mortgage estimates, agent info, garden and lease calculations, and more.

Uses Java’s Scanner to interactively accept user input.

OOP and Java Concepts Demonstrated
Multiple Interfaces: The Agent class implements both Person and Employee to showcase multiple-inheritance of type, a common, flexible Java design.

Class Inheritance: Property extensions (ResidentialProperty, Villa, Commercial) promote code reuse and specialization.

Encapsulation: Private fields and public getters/setters protect data integrity throughout.

Menu-Driven Console Application: Demonstrates practical use of classes and objects with user-driven actions.

How to Use
Compile all Java files in the repository and run the Main class.

Follow the menu prompts to perform different real estate operations, such as property tax calculations, agent lookups, or lease/mortgage computations.

