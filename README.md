#### English

# **Movie Finder OMDb**

Application operation:
- Enter the title of the movie you are interested in in the search box on the main page of the application (/index);
- You get the search result from the OMDb server on the application page (/result);
- You can add any searched movie to your favorites database (/add);
- Also you can display a list of your favorite movies (/favorite);

![MovieFinder_1](https://user-images.githubusercontent.com/83776302/209475294-571cea75-805f-4339-ba9f-27a029b78763.png)
![MovieFinder2](https://user-images.githubusercontent.com/83776302/209475299-9f728fd9-2c81-41f8-943c-15436acee8b9.png)
![MovieFinder_3](https://user-images.githubusercontent.com/83776302/209475303-be7b0a0d-023b-4343-a272-cffe6b80dead.png)
![MovieFinder_4](https://user-images.githubusercontent.com/83776302/209475305-a7e2ed99-9ae0-4e07-9a60-29b31c1041da.png)
![MovieFinder_5](https://user-images.githubusercontent.com/83776302/209475310-671235b0-f00c-4756-8359-6b75af7fcb5c.png)

The technology stack used to write this application:

- Spring Boot
- Thymeleaf
- PostgreSQL
- Lombok
- IntelliJ IDEA

Launching the application:

Requirements:

- Java 16/19
- Maven

Generate the OMDB API key from the page: https://www.omdbapi.com/apikey.aspx

- Enter the obtained key into application.properties
    - Run the following commands in Maven
        - mvn clean install
        - mvn spring-boot:run

Navigate to the following URI in any browser: http://localhost:8080


---------------------------------------------------------------------------------------------------------------------------------------
#### Polish

# **Movie Finder OMDb**

Obsługa aplikacji

- W polu wyszukiwania na stronie głównej aplikacji (/index) wpisz tytuł interesującego Cię filmu;
- Wynik wyszukiwania otrzymujesz z serwera OMDb na stronie aplikacji (/result);
- Każdy wyszukany film możesz dodać do bazy ulubionych (/add);
- Możesz również wyświetlić listę swoich ulubionych filmów (/favorite);

Technologie użyte do napisania aplikacji:

- Spring Boot
- Thymeleaf
- PostgreSQL
- Lombok
- Intelii IDE

Uruchamianie aplikacji:

Lokalny Setup

Wymagania:

- Java 16/19
- Maven

Wygeneruj klucz API OMDB ze strony: https://www.omdbapi.com/apikey.aspx

- Wprowadź uzyskany klucz do application.properties
- Wykonaj następujące polecenia w Maven
    - mvn clean install
    - mvn spring-boot:run

Przejdź do następującego URI w dowolnej przeglądarce
http://localhost:8080


