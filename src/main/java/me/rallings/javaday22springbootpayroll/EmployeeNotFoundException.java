package me.rallings.javaday22springbootpayroll;

class EmployeeNotFoundException extends RuntimeException {

    EmployeeNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
