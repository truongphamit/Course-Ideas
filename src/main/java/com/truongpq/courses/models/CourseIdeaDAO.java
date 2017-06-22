package com.truongpq.courses.models;

import java.util.List;

/**
 * Created by truongpq on 22/06/2017.
 */
public interface CourseIdeaDAO {
    boolean add(CourseIdea idea);

    List<CourseIdea> findAll();
}
