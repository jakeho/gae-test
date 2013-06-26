package kr.jh.domain.dao;

import java.util.List;

import com.google.appengine.api.datastore.Entity;

/**
 * <pre>
 * 
 * Created on 2012. 5. 24.
 * Copyright Jaeho J
 * </pre>
 * 
 * @author <a href="http://goo.gl/ZhMb8">Jaeho J</a>
 */
public interface BaseDao {

    public void add(Entity entity);

    public void mod(Entity entitys);
    
    public List<Entity> list();
}
