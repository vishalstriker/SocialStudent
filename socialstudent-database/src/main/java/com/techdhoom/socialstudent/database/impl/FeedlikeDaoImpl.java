/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database.impl;

import com.techdhoom.socialstudent.common.database.impl.BaseAbstractGenericDao;
import com.techdhoom.socialstudent.database.FeedlikeDao;
import com.techdhoom.socialstudent.model.Feedlike;
import java.io.Serializable;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tapan
 */
@Repository
public class FeedlikeDaoImpl extends BaseAbstractGenericDao<Feedlike, Long> implements FeedlikeDao{

    @Override
    public Long createFeedlike(Feedlike feedlike) {
         return super.create(feedlike);
    }

    @Override
    public Long updateFeedlike(Feedlike feedlike) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long deleteFeedlike(Feedlike feedlike) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long retrievebyidFeedlike(Feedlike feedlike) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long retrieveallFeedlike(Feedlike feedlike) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
