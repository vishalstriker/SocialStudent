/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database;

import com.techdhoom.socialstudent.common.database.GenericDao;
import com.techdhoom.socialstudent.model.StudentContact;

/**
 *
 * @author ME
 */

public interface StudentContactDao extends GenericDao<StudentContact,Long> {
    
    public Long createStudentContact(StudentContact studentContact);
    public Long updateStudentContact(StudentContact studentContact);
    public Long deleteStudentContact(StudentContact studentContact);
    public Long retrievebyidStudentContact(StudentContact studentContact);
    public Long retrieveallStudentContact(StudentContact studentContact);

    
}
