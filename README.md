# Rule Engine example Spring Boot
Using Java 21
### Curl irish employee
````
curl --location 'http://localhost:8080/api/v1/dni/renew' \
--header 'Content-Type: application/json' \
--data '{
        "name": "Sara",
        "department": "Zara Home",
        "market": "EU",
        "country": "Ireland",
        "responsibilities": "Employee"
    }'
````

### Curl spanish employee
````
curl --location 'http://localhost:8080/api/v1/dni/renew' \
--header 'Content-Type: application/json' \
--data '{
        "name": "Sara",
        "department": "Zara Home",
        "market": "EU",
        "country": "Spain",
        "responsibilities": "Employee"
    }'
````
