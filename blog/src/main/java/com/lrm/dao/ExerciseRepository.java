package com.lrm.dao;

import com.lrm.po.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository  extends JpaRepository<Exercise,Integer> {
}
