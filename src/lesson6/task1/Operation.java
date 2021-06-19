package lesson6.task1;

import jdk.jshell.spi.ExecutionControlProvider;

import java.util.concurrent.ExecutionException;

public class Operation extends Thread{
    private String operationName;
    private int operationTime;

    public Operation(String operationName, int operationTime) {
        this.operationName = operationName;
        this.operationTime = operationTime;
    }


    @Override
    public void run() {
        System.out.println("Started");
        try{
        for(int i = 1; i < operationTime - 1; i++){
            Thread.sleep(1000);
            System.out.println("Operation " + operationName + " " + i + " second");
        }

        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Finished");
    }
}
