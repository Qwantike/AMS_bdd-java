/**
 * 
 */
/**
 * 
 */
module main {
	requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    requires transitive java.sql;
    requires org.postgresql.jdbc;
    exports main;
    exports database;
}