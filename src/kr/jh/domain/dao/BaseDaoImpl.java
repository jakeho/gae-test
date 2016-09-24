package kr.jh.domain.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Query;

/**
 * <pre>
 * 
 * Created on 2012. 5. 24.
 * Copyright Jaeho J
 * </pre>
 * 
 * @author <a href="http://goo.gl/ZhMb8">Jaeho J</a>
 */
@Repository("baseDao")
public class BaseDaoImpl implements BaseDao {

    @Override
    public void add(Entity entity) {
        DatastoreService ds = DatastoreServiceFactory.getDatastoreService();        
        ds.put(entity);
    }

    @Override
    public void mod(Entity entity) {
        DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
        ds.put(entity);
    }

    @Override
    public List<Entity> list() {
        DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
        Query query = new Query("Test").addSort("name", Query.SortDirection.ASCENDING);
        List<Entity> members = null;
        members = ds.prepare(query).asList(FetchOptions.Builder.withLimit(5).offset(0));
        return members;
    }

}
