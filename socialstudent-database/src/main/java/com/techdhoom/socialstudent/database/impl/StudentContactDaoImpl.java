/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database.impl;

import com.techdhoom.socialstudent.common.database.impl.BaseAbstractGenericDao;
import com.techdhoom.socialstudent.database.StudentContactDao;
import com.techdhoom.socialstudent.model.StudentContact;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ME
 */
@Repository
public class StudentContactDaoImpl extends BaseAbstractGenericDao<StudentContact,Long> implements StudentContactDao {

    @Override
    public Long createStudentContact(StudentContact studentContact) {
        return super.create(studentContact);
    }
       @Override
    public Long updateStudentContact(StudentContact studentContact) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long deleteStudentContact(StudentContact studentContact) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long retrievebyidStudentContact(StudentContact studentContact) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long retrieveallStudentContact(StudentContact studentContact) {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    
}
