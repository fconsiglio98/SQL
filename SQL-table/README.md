# Exercise - SQL-table
* before doing this exercise, you have to complete `0-SQL-installation-and-user-permissions`
* add JDBC to IntelliJ following [this tutorial](https://www.youtube.com/watch?v=e8g9eNnFpHQ), till minute 3.35
* [here](https://dev.mysql.com/downloads/connector/j/) you can find the connector mentioned in the tutorial to download
* create a class where you:
  * create a connection to the `newdb` database:
    * using the `DriverManager`
    * following [this tutorial](https://www.mysqltutorial.org/connecting-to-mysql-using-jdbc-driver/)
    * using the following parameters:
      * `DB_URL`: `jdbc:mysql://localhost:3306/newdb` database
      * `USER`: the MySQL `developer` user
      * `PASSWORD`: the password you use for the MySQL `developer` user
  * create a table `students` if not already existing with
    * the following columns:
      * `student_id` as integer (10 digits) that is `NOT NULL AUTO_INCREMENT`
      * `last_name` as string (max 30 characters)
      * `first_name` as string (max 30 characters)
    * the constraint that `students_pk` is the `PRIMARY KEY` using only the column `student_id`
  * populate the table with 4 random students
    * remember that you need only to insert `last_name` and `first_name` because the primary key is auto-incremented
