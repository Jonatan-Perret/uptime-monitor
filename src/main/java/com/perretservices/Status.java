package com.perretservices;

import java.time.Instant;
import java.util.StringJoiner;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;

@Entity
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Probe probe;

    @NotNull
    private Boolean up;

    @NotNull
    private Instant timestamp;

    @NotNull
    private Integer duration;

    public Long getId() {
        return id;
    }

    public Probe getProbe() {
        return probe;
    }

    public Boolean getUp() {
        return up;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProbe(Probe probe) {
        this.probe = probe;
    }

    public void setUp(Boolean up) {
        this.up = up;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String toString() {
        return new StringJoiner(", ", Status.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("probe=" + probe)
                .add("timestamp=" + timestamp)
                .add("up=" + up)
                .add("duration=" + duration)
                .toString();
    }
}
