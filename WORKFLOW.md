# Car Rental System — Workflow

## 1. Project Flow

```text
Start Application
       ↓
Create Rental System
       ↓
Add Cars to System
       ↓
Display Main Menu
       ↓
 ┌───────────────┬────────────────┐
 ↓               ↓                ↓
Rent Car      Return Car         Exit
 ↓               ↓                ↓
Enter Name    Enter Car ID     End Program
 ↓               ↓
Show Cars     Check Rental
 ↓               ↓
Select Car    Return Car
 ↓               ↓
Enter Days    Update Availability
 ↓               ↓
Calculate     Display Customer
Price             ↓
 ↓              Back to Menu
Confirm Rental
 ↓
Update Car Availability
 ↓
Back to Menu
```

---

## 2. Step 1 — Initialize the System

The `main()` method creates a `RentalSystem` object.

```java
RentalSystem rentalSystem = new RentalSystem();
```

The system initializes lists for:

* Cars
* Customers
* Rentals

---

## 3. Step 2 — Add Cars

The application creates several `Car` objects with:

* Car ID
* Brand
* Model
* Base price per day

The cars are then added to the rental system.

```text
Car Object
   ↓
Car ID + Brand + Model + Price
   ↓
RentalSystem
   ↓
Cars List
```

All cars are initially marked as **available**.

---

## 4. Step 3 — Display the Main Menu

The system starts an interactive loop and displays:

```text
===== Car Rental System =====
1. Rent a Car
2. Return a Car
3. Exit
```

The user's choice determines the next operation.

---

# 5. Rent a Car Workflow

## Step 5.1 — Enter Customer Information

The user selects option `1`.

The system asks for the customer's name.

A new `Customer` object is created with an automatically generated customer ID.

```text
Customer Name
      ↓
Generate Customer ID
      ↓
Create Customer Object
      ↓
Add to Customers List
```

---

## Step 5.2 — Display Available Cars

The system checks every car in the cars list.

Only cars where:

```java
car.isAvailable()
```

returns `true` are displayed.

```text
Cars List
   ↓
Check Availability
   ↓
Available Cars
```

---

## Step 5.3 — Select Car

The user enters the ID of the car they want to rent.

The system searches the cars list for a matching car ID that is also available.

```text
Entered Car ID
      ↓
Search Cars
      ↓
ID Match?
   ↙       ↘
 Yes       No
 ↓          ↓
Select     Invalid
 Car       Selection
```

---

## Step 5.4 — Enter Rental Duration

The user enters the number of rental days.

The selected car calculates the rental price:

```text
Total Price
=
Base Price Per Day × Rental Days
```

---

## Step 5.5 — Display Rental Information

The system displays:

* Customer ID
* Customer name
* Car brand and model
* Rental days
* Total price

The user is then asked to confirm the rental.

---

## Step 5.6 — Confirm Rental

### If the user enters `Y`

The system:

```text
Confirm Rental
      ↓
Mark Car as Unavailable
      ↓
Create Rental Object
      ↓
Add Rental to Rentals List
      ↓
Display Success Message
```

### If the user enters `N`

The rental is cancelled.

---

# 6. Return Car Workflow

## Step 6.1 — Enter Car ID

The user selects option `2`.

The system asks for the car ID that needs to be returned.

---

## Step 6.2 — Find the Rented Car

The system searches for a car with:

```text
Matching Car ID
+
Car is NOT Available
```

If both conditions are satisfied, the car is selected for return.

---

## Step 6.3 — Find the Customer

The system searches the active rentals list to identify the customer associated with the selected car.

```text
Rented Car
    ↓
Search Rentals
    ↓
Find Matching Rental
    ↓
Retrieve Customer
```

---

## Step 6.4 — Return the Car

The car's availability is changed back to available.

```text
Rented
  ↓
returnCar()
  ↓
Available
```

The corresponding rental is then removed from the active rentals list.

The system displays the customer who returned the car.

---

# 7. Exit Workflow

If the user selects option `3`:

```text
Exit Selected
      ↓
Display Thank You Message
      ↓
Break Menu Loop
      ↓
Close Scanner
      ↓
End Program
```

---

# 8. Class Relationship

The main objects interact as follows:

```text
RentalSystem
    │
    ├── Cars
    │     └── Car
    │
    ├── Customers
    │     └── Customer
    │
    └── Rentals
          └── Rental
                ├── Car
                └── Customer
```

The `Rental` object connects a particular `Car` with a `Customer` and stores the number of rental days.

---

# 9. Overall System Workflow

```text
              ┌──────────────┐
              │    START     │
              └──────┬───────┘
                     ↓
          ┌─────────────────────┐
          │ Initialize System   │
          └──────────┬──────────┘
                     ↓
          ┌─────────────────────┐
          │ Add Cars            │
          └──────────┬──────────┘
                     ↓
          ┌─────────────────────┐
          │    Main Menu        │
          └──────────┬──────────┘
                     ↓
              ┌──────┴──────┐
              ↓             ↓
          Rent Car       Return Car
              ↓             ↓
        Select Car      Select Car
              ↓             ↓
        Enter Days      Check Rental
              ↓             ↓
        Calculate Price Return Car
              ↓             ↓
        Confirm Rental  Update Status
              ↓             ↓
              └──────┬──────┘
                     ↓
                Main Menu
                     ↓
                   Exit
                     ↓
                  END
```

---

## 10. Core Concepts Demonstrated

The workflow demonstrates:

* Object creation
* Encapsulation
* Class relationships
* Collection management using `ArrayList`
* Conditional logic
* Loops
* Console input
* Rental state management
* Price calculation
* Basic OOP-based application design
