package com.example.jobverse.repository;

import com.example.jobverse.entity.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface JobSeekerProfileRepository extends JpaRepository<JobSeekerProfile, Long>
{
    Optional<JobSeekerProfile> findByUserId(Long userId);

    @Query("SELECT p FROM JobSeekerProfile p WHERE " +
            "LOWER(p.headline) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
            "LOWER(p.bio) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    .

    Page<JobSeekerProfile> searchProfiles(@Param("keyword") String keyword, Pageable pageable);
}