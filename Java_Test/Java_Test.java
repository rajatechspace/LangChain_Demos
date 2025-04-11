package Java_Test;

public class Java_Test {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Class Path: " + System.getProperty("java.class.path")); 
        System.out.println("Sun Boot Class Path: " + System.getProperty("sun.boot.class.path"));
        System.out.println("Java Ext Dirs: " + System.getProperty("java.ext.dirs"));
        System.out.println("Java Library Path: " + System.getProperty("java.library.path"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Version: " + System.getProperty("java.version"));
    }
}

