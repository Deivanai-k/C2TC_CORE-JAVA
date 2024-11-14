package com.tnsif.day3;
public class Threadprogramme {
	private int n;
    private String msg;
 //Constructor
    public void ChildThread(int n, String msg) {
        this.n = n;
        this.msg = msg;
    }
     public void run() {
        for (int i = 1; i <= n; i++) {
            try {
                Thread.sleep(300); 
            } catch (InterruptedException e) {
                System.err.println("Thread interrupted: " + e.getMessage());
                Thread.currentThread().interrupt(); // Restore interrupted status
            }
            System.out.println(msg + i + " " + Thread.currentThread().getName());
        }
     }


