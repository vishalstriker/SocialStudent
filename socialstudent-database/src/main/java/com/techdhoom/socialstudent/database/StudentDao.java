/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database;

import com.techdhoom.socialstudent.common.database.GenericDao;
import com.techdhoom.socialstudent.model.Student;

/**
 *
 * @author ME
 */
public interface StudentDao extends GenericDao<Student, Long> {

    public Long createStudent(Student student);
    public Long updateStudent(Student student);
    public Long deleteStudent(Student student);
    public Long retrievebyidStudent(Student student);
    public Long retrieveallStudent(Student student);
}
