# 🌐 Live Demo
You can access a live demo of the project here :- https://electoralbondsapplication.azurewebsites.net/swagger-ui/index.html#

# Electoral Bonds Application
The Electoral Bonds Application is a Java-based project built using Spring Boot and MySQL. It aims to manage electoral bonds and provide various functionalities related to political parties, denominations, and date-based analysis.
![](https://github.com/yogeshrathee/Electoral-Bonds-Application/blob/fc548220033810a39900a78afd96558d133b0f5a/images/Screenshot%20(47).png)
## Project Structure
The project includes several key components:


    electoral-bonds-application/
    │
    ├── src/
    │   ├── main/
    │   │   ├── java/
    │   │   │   ├── org.yogesh.electoral.bonds.electoralbondsapplication/
    │   │   │   │   ├── ComparatorDenomination/
    │   │   │   │   │   └── TotalDenominationComparator.java
    │   │   │   │   │
    │   │   │   │   ├── Converter/
    │   │   │   │   │   └── AmountConverter.java
    │   │   │   │   │
    │   │   │   │   ├── ElectoralBondsControllers/
    │   │   │   │   │   └── PoliticalPartyBondControllers.java
    │   │   │   │   │
    │   │   │   │   ├── Models/
    │   │   │   │   │   └── PoliticalParty.java
    │   │   │   │   │
    │   │   │   │   ├── Repository/
    │   │   │   │   │   └── PoliticalPartyRepo.java
    │   │   │   │   │
    │   │   │   │   ├── Services/
    │   │   │   │   │   ├── ServicesImpl/
    │   │   │   │   │   │   └── PoliticalPartyImpl.java
    │   │   │   │   │   │
    │   │   │   │   │   └── PoliticalPartyService.java
    │   │   │   │   │
    │   │   │   │   └── ElectoralBondsApplication.java
    │   │   │   │
    │   │   │   └── resources/
    │   │   │       └── application.properties
    │   │   │
    │   │   └── resources/
    │   │       └── static/
    │   │           └── (HTML, CSS, JavaScript files for frontend)
    │   │
    │   └── test/
    │       ├── java/
    │       │   └── org.yogesh.electoral.bonds.electoralbondsapplication/
    │       │       └── (Test classes)
    │       │
    │       └── resources/
    │           └── (Test resources)
    │
    ├── pom.xml
    │
    └── README.md



- `TotalDenominationComparator`: A comparator class to sort political parties based on their total denomination.
- `AmountConverter`: A utility class to convert denomination amounts to crores.
- `PoliticalPartyBondControllers`: REST controllers to handle HTTP requests related to political parties and bonds.
- `PoliticalParty`: Entity class representing details of political parties and bonds.
- `PoliticalPartyRepo`: Repository interface for database operations on political parties.
- `PoliticalPartyImpl`: Implementation class of the service layer for political party operations.
- `PoliticalPartyService`: Service interface defining operations for managing political parties.
- `ElectoralBondsApplication`: Main class to run the Spring Boot application.

## Dependencies
The project uses several dependencies managed via Maven, including Spring Boot Starter Web, Spring Data JPA, Springfox Swagger UI, and Oracle JDBC driver for database connectivity.

## Running the Application
To run the application:
1. Ensure you have Java and Maven installed.
2. Set up a  Oracle database and configure the connection in `application.properties`.
3. Build the project using `mvn clean install`.
4. Run the application using `java -jar target/Electoral-Bonds-Application-0.0.1-SNAPSHOT.jar`.

## Endpoints
The application exposes several REST endpoints for managing political parties and bonds:
- `GET /Electoral-Bond/Political-Party/Fetch The All Records of the Political-Party`: Get all political party records.


      [
        {
            "name_OF_THE_POLITICAL_PARTY": "ALL INDIA ANNA DRAVIDA MUNNETRA KAZHAGAM",
            "denominations": 10000000,
            "date_OF_ENCASHMENT": "12-Apr-19",
            "sr_NO": 1,
            "prefix": "OC",
            "account_NO_OF_POLITICAL_PARTY": "*******5199",
            "pay_TELLER": 2770121,
            "pay_BRANCH_CODE": 800,
            "bond_NUMBER": 775
        },
        {
            "name_OF_THE_POLITICAL_PARTY": "ALL INDIA ANNA DRAVIDA MUNNETRA KAZHAGAM",
            "denominations": 10000000,
            "date_OF_ENCASHMENT": "12-Apr-19",
            "sr_NO": 2,
            "prefix": "OC",
            "account_NO_OF_POLITICAL_PARTY": "*******5199",
            "pay_TELLER": 2770121,
            "pay_BRANCH_CODE": 800,
            "bond_NUMBER": 3975
        },
        {
            "name_OF_THE_POLITICAL_PARTY": "ALL INDIA ANNA DRAVIDA MUNNETRA KAZHAGAM",
            "denominations": 10000000,
            "date_OF_ENCASHMENT": "12-Apr-19",
            "sr_NO": 3,
            "prefix": "OC",
            "account_NO_OF_POLITICAL_PARTY": "*******5199",
            "pay_TELLER": 2770121,
            "pay_BRANCH_CODE": 800,
            "bond_NUMBER": 3967
        },
        {
            "name_OF_THE_POLITICAL_PARTY": "ALL INDIA ANNA DRAVIDA MUNNETRA KAZHAGAM",
            "denominations": 1000000,
            "date_OF_ENCASHMENT": "12-Apr-19",
            "sr_NO": 4,
            "prefix": "TL",
            "account_NO_OF_POLITICAL_PARTY": "*******5199",
            "pay_TELLER": 2770121,
            "pay_BRANCH_CODE": 800,
            "bond_NUMBER": 10418
        },
  ![](https://github.com/yogeshrathee/Electoral-Bonds-Application/blob/fc548220033810a39900a78afd96558d133b0f5a/images/Screenshot%20(48).png)

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

- `GET /Electoral-Bond/Political-Party/Fetch The Record by the BOND-NUMBER/{BOND_NUMBER}`: Get a political party record by bond number.

        {
          "pay_BRANCH_CODE": 800,
          "bond_NUMBER": 775,
          "denominations": 10000000,
          "pay_TELLER": 2770121,
          "name_OF_THE_POLITICAL_PARTY": "ALL INDIA ANNA DRAVIDA MUNNETRA KAZHAGAM",
          "account_NO_OF_POLITICAL_PARTY": "*******5199",
          "sr_NO": 1,
          "prefix": "OC",
          "date_OF_ENCASHMENT": "12-Apr-19"
        }

  ![](https://github.com/yogeshrathee/Electoral-Bonds-Application/blob/fc548220033810a39900a78afd96558d133b0f5a/images/Screenshot%20(49).png)

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

- `GET /Electoral-Bond/Political-Party/Fetch The Record by the Party-Name/{NAME_OF_THE_POLITICAL_PARTY}`: Get political party records by party name.


      [
      {
        "pay_BRANCH_CODE": 1,
        "bond_NUMBER": 1015,
        "denominations": 10000000,
        "pay_TELLER": 3476510,
        "name_OF_THE_POLITICAL_PARTY": "ALL INDIA TRINAMOOL CONGRESS",
        "account_NO_OF_POLITICAL_PARTY": "*******0688",
        "sr_NO": 766,
        "prefix": "OC",
        "date_OF_ENCASHMENT": "16-Apr-19"
      },
      {
        "pay_BRANCH_CODE": 1,
        "bond_NUMBER": 1017,
        "denominations": 10000000,
        "pay_TELLER": 3476510,
        "name_OF_THE_POLITICAL_PARTY": "ALL INDIA TRINAMOOL CONGRESS",
        "account_NO_OF_POLITICAL_PARTY": "*******0688",
        "sr_NO": 767,
        "prefix": "OC",
        "date_OF_ENCASHMENT": "16-Apr-19"
      },
      {
        "pay_BRANCH_CODE": 1,
        "bond_NUMBER": 1016,
        "denominations": 10000000,
        "pay_TELLER": 3476510,
        "name_OF_THE_POLITICAL_PARTY": "ALL INDIA TRINAMOOL CONGRESS",
        "account_NO_OF_POLITICAL_PARTY": "*******0688",
        "sr_NO": 768,
        "prefix": "OC",
        "date_OF_ENCASHMENT": "16-Apr-19"
      },

  ![](https://github.com/yogeshrathee/Electoral-Bonds-Application/blob/fc548220033810a39900a78afd96558d133b0f5a/images/Screenshot%20(50).png)

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


- `GET /Electoral-Bond/Political-Party/Fetch The Record by the DATE-OF-ENCASHMENT/{DATE_OF_ENCASHMENT}`: Get political party records by date of encashment.

        [
          {
            "pay_BRANCH_CODE": 800,
            "bond_NUMBER": 775,
            "denominations": 10000000,
            "pay_TELLER": 2770121,
            "name_OF_THE_POLITICAL_PARTY": "ALL INDIA ANNA DRAVIDA MUNNETRA KAZHAGAM",
            "account_NO_OF_POLITICAL_PARTY": "*******5199",
            "sr_NO": 1,
            "prefix": "OC",
            "date_OF_ENCASHMENT": "12-Apr-19"
          },
          {
            "pay_BRANCH_CODE": 800,
            "bond_NUMBER": 3975,
            "denominations": 10000000,
            "pay_TELLER": 2770121,
            "name_OF_THE_POLITICAL_PARTY": "ALL INDIA ANNA DRAVIDA MUNNETRA KAZHAGAM",
            "account_NO_OF_POLITICAL_PARTY": "*******5199",
            "sr_NO": 2,
            "prefix": "OC",
            "date_OF_ENCASHMENT": "12-Apr-19"
          },
          {
            "pay_BRANCH_CODE": 800,
            "bond_NUMBER": 3967,
            "denominations": 10000000,
            "pay_TELLER": 2770121,
            "name_OF_THE_POLITICAL_PARTY": "ALL INDIA ANNA DRAVIDA MUNNETRA KAZHAGAM",
            "account_NO_OF_POLITICAL_PARTY": "*******5199",
            "sr_NO": 3,
            "prefix": "OC",
            "date_OF_ENCASHMENT": "12-Apr-19"
          },

   ![](https://github.com/yogeshrathee/Electoral-Bonds-Application/blob/fc548220033810a39900a78afd96558d133b0f5a/images/Screenshot%20(51).png)

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
          
- `GET /Electoral-Bond/Political-Party/denomination/{NAME_OF_THE_POLITICAL_PARTY}`: Get total denomination by party name.

        Party Name: ALL INDIA TRINAMOOL CONGRESS
        Total Amount: 1315.7154 Crores (Approximately)
        Received By the party Successfully!!!!

  
   ![](https://github.com/yogeshrathee/Electoral-Bonds-Application/blob/fc548220033810a39900a78afd96558d133b0f5a/images/Screenshot%20(52).png)

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
          
- `GET /Electoral-Bond/Political-Party/total-denomination`: Get total denomination for all parties.
    
        Total Denomination for All Parties: 10434.843 Crores (Approximately)
    
        Party-wise Details:
        BHARATIYA JANATA PARTY: 4900.5192 Crores (Approximately)
        ALL INDIA TRINAMOOL CONGRESS: 1315.7154 Crores (Approximately)
        PRESIDENT, ALL INDIA CONGRESS COMMITTEE: 1249.3605 Crores (Approximately)
        BHARAT RASHTRA SAMITHI: 887.9219 Crores (Approximately)
        BIJU JANATA DAL: 682.3 Crores (Approximately)
        DRAVIDA MUNNETRA KAZHAGAM (DMK): 583.7 Crores (Approximately)
        YSR  CONGRESS PARTY  (YUVAJANA SRAMIKA RYTHU CONGRESS PARTY): 264.8 Crores (Approximately)
        TELUGU DESAM PARTY: 185.78 Crores (Approximately)
        SHIVSENA: 168.796 Crores (Approximately)
        AAM AADMI PARTY: 38.38 Crores (Approximately)
        RASHTRIYA JANTA DAL: 30.9 Crores (Approximately)
        NATIONALIST CONGRESS PARTY MAHARASHTRA PRADESH: 26.65 Crores (Approximately)
        ADYAKSHA SAMAJVADI PARTY: 24.11 Crores (Approximately)
        JANASENA PARTY: 17.7 Crores (Approximately)
        SIKKIM KRANTIKARI MORCHA: 17.5 Crores (Approximately)
        BIHAR PRADESH JANTA DAL(UNITED): 14.0 Crores (Approximately)
        ALL INDIA ANNA DRAVIDA MUNNETRA KAZHAGAM: 7.85 Crores (Approximately)
        SHIROMANI AKALI DAL: 7.26 Crores (Approximately)
        JANATA DAL ( SECULAR ): 5.0 Crores (Approximately)
        JHARKHAND MUKTI MORCHA: 4.5 Crores (Approximately)
        JAMMU AND KASHMIR NATIONAL CONFERENCE: 1.0 Crores (Approximately)
        MAHARASHTRAWADI GOMNTAK PARTY: 0.75 Crores (Approximately)
        GOA FORWARD PARTY: 0.35 Crores (Approximately)

  ![](https://github.com/yogeshrathee/Electoral-Bonds-Application/blob/fc548220033810a39900a78afd96558d133b0f5a/images/Screenshot%20(53).png)

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

- `GET /Electoral-Bond/Political-Party/denomination/{DATE}/{PARTY_NAME}`: Get denomination by date and party name.

        Total Denomination Encashment by the ( BHARATIYA JANATA PARTY ) !!!
        
        DATE_OF_ENCASHMENT :: 12-Apr-19
        Party Name :: BHARATIYA JANATA PARTY
        total Denomination In Crores ::  246.3 Crores (Approximately)

  ![](https://github.com/yogeshrathee/Electoral-Bonds-Application/blob/fc548220033810a39900a78afd96558d133b0f5a/images/Screenshot%20(54).png)

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## Future Enhancements
Potential future enhancements for this project include:
- Implementing additional CRUD operations for political parties and bonds.
- Enhancing security with authentication and authorization mechanisms.
- Adding validation and error handling for input data.
- Improving performance through database optimizations and caching strategies.

Feel free to contribute or provide feedback to further improve this Electoral Bonds Application.
