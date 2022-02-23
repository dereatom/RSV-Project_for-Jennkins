package com.trilogyed.rsvp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "rsvp")
public class Rsvp implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rsvpId;
    private String guestName;
    private Integer totalAttending;

    public Rsvp() {
    }

    public Rsvp(Integer rsvpId, String guestName, Integer totalAttending) {
        this.rsvpId = rsvpId;
        this.guestName = guestName;
        this.totalAttending = totalAttending;
    }

    public Integer getId() {
        return rsvpId;
    }

    public void setId(Integer rsvpId) {
        this.rsvpId = rsvpId;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setName(String guestName) {
        this.guestName = guestName;
    }

    public Integer getTotalAttending() {
        return totalAttending;
    }

    public void setTotalAttending(Integer totalAttending) {
        this.totalAttending = totalAttending;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rsvp rsvp = (Rsvp) o;
        return rsvpId == rsvp.rsvpId &&
                totalAttending == rsvp.totalAttending &&
                Objects.equals(guestName, rsvp.guestName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rsvpId, guestName, totalAttending);
    }

    @Override
    public String toString() {
        return "Rsvp{" +
                "id=" + rsvpId +
                ", guestName='" + guestName + '\'' +
                ", totalAttending=" + totalAttending +
                '}';
    }
}
