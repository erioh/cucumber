package tester.patterns;

import tester.ClassA;

import java.sql.CallableStatement;
import java.sql.SQLException;

public class ClassB extends ClassA {
    @Override
    public String get() {
        return (String) super.get();
    }

    public void callProcedure() throws SQLException {
        CallableStatement statement = session
    }
}
