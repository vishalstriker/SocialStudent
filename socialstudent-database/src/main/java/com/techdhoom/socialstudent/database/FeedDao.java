/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database;

import com.techdhoom.socialstudent.common.database.GenericDao;
import com.techdhoom.socialstudent.model.Feed;

/**
 *
 * @author tapan
 */
public interface FeedDao extends GenericDao<Feed, Long>{
     public Long createFeed(Feed feed);
      public Long updateFeed(Feed feed);
       public Long deleteFeed(Feed feed);
        public Long retrievebyidFeed(Feed feed);
         public Long retrieveallFeed(Feed feed);
    
}
