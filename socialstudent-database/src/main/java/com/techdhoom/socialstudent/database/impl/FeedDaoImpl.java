/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database.impl;

import com.techdhoom.socialstudent.common.database.impl.BaseAbstractGenericDao;
import com.techdhoom.socialstudent.database.FeedDao;
import com.techdhoom.socialstudent.model.Feed;
import java.io.Serializable;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tapan
 */
@Repository
public class FeedDaoImpl extends BaseAbstractGenericDao<Feed, Long> implements FeedDao{
     @Override
    public Long createFeed(Feed feed) {
        return super.create(feed);
    }

    @Override
    public Long updateFeed(Feed feed) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long deleteFeed(Feed feed) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long retrievebyidFeed(Feed feed) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long retrieveallFeed(Feed feed) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
