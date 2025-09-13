package dev.delts.jobaro.repository;

import dev.delts.jobaro.entity.JobApplication;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface JobApplicationRepository extends CrudRepository<JobApplication, UUID> {
}
