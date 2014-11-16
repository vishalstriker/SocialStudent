/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database.impl;

import com.techdhoom.socialstudent.common.database.impl.BaseAbstractGenericDao;
import com.techdhoom.socialstudent.database.FeedunlikeDao;
import com.techdhoom.socialstudent.model.Feedunlike;
import java.io.Serializable;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tapan
 */
@Repository
public class FeedunlikeDaoImpl extends BaseAbstractGenericDao<Feedunlike, Long> implements FeedunlikeDao{

    @Override
    public Long createFeedunlike(Feedunlike feedunlike) {        
        return super.create(feedunlike);
    }

    @Override
    public Long updateFeedunlike(Feedunlike feedunlike) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long deleteFeedunlike(Feedunlike feedunlike) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long retrievebyidFeedunlike(Feedunlike feedunlike) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long retrieveallFeedunlike(Feedunlike feedunlike) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
