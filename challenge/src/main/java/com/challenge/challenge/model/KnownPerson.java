package com.challenge.challenge.model;

import java.util.Objects;

public class KnownPerson {
    private Person guest;
    private Person candidate;

    public KnownPerson(Person guest, Person candidate) {
        this.candidate = candidate;
        this.guest = guest;
    }

    public Person getGuest() {
        return guest;
    }

    public void setGuest(Person guest) {
        this.guest = guest;
    }

    public Person getCandidate() {
        return candidate;
    }

    public void setCandidate(Person candidate) {
        this.candidate = candidate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KnownPerson that = (KnownPerson) o;
        return Objects.equals(guest, that.guest) &&
                Objects.equals(candidate, that.candidate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guest, candidate);
    }
}
