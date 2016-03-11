package com.mehmetakiftutuncu.eshotroid.models;

import android.support.annotation.NonNull;

public class Bus implements Comparable {
    public final int id;
    public final String departure;
    public final String arrival;

    public Bus(int id, String departure, String arrival) {
        this.id        = id;
        this.departure = departure;
        this.arrival   = arrival;
    }

    @Override public String toString() {
        return String.format(
            "{\"id\":%d,\"departure\":\"%s\",\"arrival\":\"%s\"}",
            id,
            departure,
            arrival
        );
    }

    @Override public int compareTo(@NonNull Object other) {
        if (other instanceof Bus) {
            Bus otherBus = (Bus) other;

            return (id > otherBus.id) ? 1 : ((id < otherBus.id) ? -1 : 0);
        }

        return 1;
    }
}