module org.openjfx.lp1_18_04_23 {
    requires transitive javafx.controls;
    requires transitive javafx.fxml;
    requires transitive java.sql;

    opens org.openjfx.lp1_18_04_23 to javafx.fxml;
    exports org.openjfx.lp1_18_04_23;
}
