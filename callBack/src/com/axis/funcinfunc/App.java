package com.axis.funcinfunc;

public class App {
    public static void demo1() {
        ImageUploader img = new ImageUploader();
        img.select(imageTask -> {
            System.out.println("imageuploaded successfully");
        });
        img.select(compressTask -> {
            System.out.println("Image compression succesfully completed");
        });
        img.select(Uploadtask -> {
            System.out.println("Image uploaded successfully completed");
        });

    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
