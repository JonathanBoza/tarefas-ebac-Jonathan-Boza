# Módulo 33 - JPA Exercise

This project demonstrates the use of JPA (Java Persistence API) to manage relationships between entities in a car database system.

## Author
Jonathan Euzébio Boza

## Project Structure

- `Brand`: Entity representing car brands
- `Car`: Entity representing cars with a many-to-one relationship to Brand

## Database Configuration

The project uses H2 in-memory database. The database is automatically configured with these settings:

- URL: jdbc:h2:mem:testdb
- Username: sa
- Password: (empty)
- Console URL: http://localhost:8080/h2-console

## Running the Project

1. Clone the repository
2. Install dependencies using Maven
3. Run the application using `mvn spring-boot:run`
4. Access H2 console at http://localhost:8080/h2-console (make sure to use the exact URL)

## Entity Relationships

- One Brand can have many Cars (One-to-Many)
- Each Car belongs to one Brand (Many-to-One)

## Technologies Used

- Java 11
- Maven
- JPA/Hibernate
- H2 Database

## Sample Queries

You can test the database relationships using these queries in the H2 console:

```sql
-- List all brands
SELECT * FROM BRANDS;

-- List all cars
SELECT * FROM CARS;

-- List all cars with their brand names
SELECT c.*, b.name as brand_name 
FROM CARS c 
JOIN BRANDS b ON c.brand_id = b.id;
```
