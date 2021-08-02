# String Alignment Utility
Project Assignment to test String Utility. This will convert any entered string from STDIN with max length and alignment will split string and alignment

Implemented at least 3 of the following formatting algorithms:

- left align
- right align
- center
- justify (Can be added by Just one class)
- hard (Can be added by Just one class)


### Assumptions
String split is depend on max character length and it split word in half. if we need more detail like split by word or max character we have to modify current logic


### Minimum Need on terminal
- Java >= 1.8 best works in Java 16
- maven >= 3.6

### How to build a project

```shell
mvn clean install assembly:single
```

### Run executable jar
```shell
java -jar target/formatter.jar
```
