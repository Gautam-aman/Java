package com.cfs.repo;

import com.cfs.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo  extends JpaRepository<Student, Long> {

}
