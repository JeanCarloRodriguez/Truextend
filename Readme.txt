Run the project commands:
mvn clean
mvn compile
mvn install
mvn test

to run a specific feature use:
mvn test -Dcucumber.filter.tags="@Discount"