package com.trilogyed.rsvp.repository;

import com.trilogyed.rsvp.model.Rsvp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RsvpRepository extends JpaRepository<Rsvp, Integer> {
}
