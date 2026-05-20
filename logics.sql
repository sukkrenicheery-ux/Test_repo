-- Simple SQL example
CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    HireDate DATE
);

INSERT INTO Employees (EmployeeID, FirstName, LastName, HireDate)
VALUES
    (1, 'Alice', 'Smith', '2024-01-15'),
    (2, 'Bob', 'Jones', '2024-02-20');

SELECT * FROM Employees;
