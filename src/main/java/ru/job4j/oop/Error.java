package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() { }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void errorInfo() {
        System.out.println("Ошибка актуальна: " + active);
        System.out.println("Статус ошибки: " + status);
        System.out.println("Текст ошибки: " + message);
    }

    public static void main(String[] args) {
        Error first = new Error();
        first.errorInfo();
        Error second = new Error(true, 502, "Bad Gateway");
        second.errorInfo();
        Error third = new Error(true, 403, "Forbidden Error");
        third.errorInfo();
        Error forth = new Error(false, 301, "Moved Permanently");
        forth.errorInfo();
    }
}
