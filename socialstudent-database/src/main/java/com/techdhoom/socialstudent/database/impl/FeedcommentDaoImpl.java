/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database.impl;

import com.techdhoom.socialstudent.common.database.impl.BaseAbstractGenericDao;
import com.techdhoom.socialstudent.database.FeedcommentDao;
import com.techdhoom.socialstudent.model.Feedcomment;
import java.io.Serializable;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tapan
 */
@Repository
public class FeedcommentDaoImpl extends BaseAbstractGenericDao<Feedcomment, Long> implements FeedcommentDao {

    @Override
    public Long createFeedcomment(Feedcomment feedcomment) {
         return super.create(feedcomment);
    }

    @Override
    public Long updateFeedcomment(Feedcomment feedcomment) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long deleteFeedcomment(Feedcomment feedcomment) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long retrievebyidFeedcomment(Feedcomment feedcomment) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long retrieveallFeedcomment(Feedcomment feedcomment) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
