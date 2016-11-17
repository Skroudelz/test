package com.company;


public class hundredDoors {
    enum States {
        OPEN,
        CLOSE
    }

    public void program() {

        States[] arr = new States[100];

        // Fyller array med stängda dörrar
        for (int i = 0; i < arr.length; i++) {
            arr[i] = States.CLOSE;
        }

        // Börjar gå förbi.
        for (int i = 1; i < arr.length + 1; i++) {
            passingBy(arr,i);
        }

        // Skriver ut alla öppna dörrar.
        loopAllOpen(arr);

    }


    void passingBy(States[] arr, int i) {
        for (int j = 1; j < arr.length + 1; j++) {
            if (j % i == 0) {
                toggleDoor(arr,j-1);
            }
        }
        arr[arr.length-1] = States.OPEN;
    }

    void toggleDoor(States[] arr, int i) {
        if (arr[i] == States.CLOSE) {
            arr[i] = States.OPEN;
            return;
        }
        arr[i] = States.CLOSE;
    }

    void loopAllOpen(States[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == States.OPEN) {
                System.out.println("Door # " + (i + 1) + " is Open!");
            }
        }
    }

}

// TODO
/*
There are 100 doors in a row that are all initially closed.

You make 100 passes by the doors.

The first time through, visit every door and   toggle   the door   (if the door is closed,   open it;   if it is open,   close it).

The second time, only visit every 2nd door   (door #2, #4, #6, ...),   and toggle it.

The third time, visit every 3rd door   (door #3, #6, #9, ...), etc,   until you only visit the 100th door.


Task
Answer the question:   what state are the doors in after the last pass?   Which are open, which are closed?
 */