module cameronbeeler.exploring.data {
    requires java.sql;
    requires sqlite.jdbc;
    requires transitive cameronbeeler.exploring.common;
    exports cameronbeeler.exploring.data;
}