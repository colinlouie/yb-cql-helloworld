# Use Scala to build a YugabyteDB application

This was ported from:

https://docs.yugabyte.com/latest/quick-start/build-apps/java/ycql/

based on content as of March 23, 2020.

# Build and run the application

To build the application, just run the following command.

`$ sbt compile`

To run the program, run the following command.

`$ sbt run`

You should see the following as the output.

```
Created keyspace ybdemo
Created table employee
Inserted data:
        INSERT INTO ybdemo.employee
          (id, name, age, language)
        VALUES
          (1, 'John', 35, 'Scala');

Query returned 1 row: name=John, age=35, language=Scala
```
