package com.example.TekarchDataStoreMS.Models;

public enum Status {
    BOOKED("Booked"),
    CANCELLED("Cancelled");
   // IN_PROGRESS("In Progress"),
   // COMPLETED("Completed");

    private final String value;

    Status(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    // Optionally, you can add a static method to convert a String to a Status enum
    public static Status fromValue(String value) {
        for (Status status : Status.values()) {
            if (status.getValue().equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown status: " + value);
    }
}

