English

Movie Finder OMDb

Application operation

- Enter the title of the movie you are interested in in the search box on the main page of the application (/index);
- You get the search result from the OMDb server on the application page (/result);
- You can add any searched movie to your favorites database (/add);
- Also you can display a list of your favorite movies (/favorite);

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
Polish

Movie Finder OMDb

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


