package com.axis.funcinfunc;

public class ImageUploader {
    public void select(CompletionCallBack cb) {
        new Thread(() -> {
            simulateProcessingTime(5);
            // System.out.println("✅ Image Selection Completed ");
            cb.complete("selection");
        }).start();

    }

    public void compress(CompletionCallBack cb) {
        new Thread(() -> {
            simulateProcessingTime(6);
            cb.complete("Image compression completed");
        }).start();
        ;

    }

    public void upload(CompletionCallBack cb) {
        new Thread(() -> {
            simulateProcessingTime(5);
            cb.complete("upload completed");
        }).start();
        ;

    }

    public void simulateProcessingTime(long sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {

            System.out.println(e.getMessage());
        }
    }
}
