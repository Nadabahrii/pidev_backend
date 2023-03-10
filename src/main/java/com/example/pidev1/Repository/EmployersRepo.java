package com.example.pidev1.Repository;

import com.example.pidev1.Entity.Employers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployersRepo extends JpaRepository<Employers,Long> {
    @Query("SELECT e FROM Employers e WHERE e.isDispo=true")
    List<Employers> retrieveEmployersByDispo();
}
