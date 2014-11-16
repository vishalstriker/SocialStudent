/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.techdhoom.socialstudent.common.database;

import java.io.Serializable;
import java.util.List;
import org.hibernate.criterion.Criterion;

/**
 * Basic CRUD operations are defined in GenericDao interface.
 * @author ncontractor
 * @since 18/8/2012
 */
public interface GenericDao<T, ID extends Serializable> {

    public T retrieveById(ID id);

    public ID create(T entity);

    public void createOrUpdate(T entity);

    public void update(T entity);

    public void delete(T entity);

    public void deleteById(ID id);

    public List<T> retrieveAll();

    public List<T> findAll(String orderBy);

    public List<T> findFiltered(String property, Object filter);

    public List<T> findFiltered(String property, Object filter, String orderBy);

    public List<T> findLikeFiltered(String property, Object filter);

    public List<T> findLikeFiltered(String property, Object filter, String orderBy);

    public T findUniqueFiltered(String property, Object filter);

    public T findUniqueFiltered(String property, Object filter, String orderBy);

    public List<T> findByCriteria(Criterion... criterion);

    public List<T> findByCriteriaList(List<Criterion> criterions);

    public List<T> findByCriteriaList(List<Criterion> criterions, Boolean isSearch);

    public List<T> findByExample(T entity);
}
