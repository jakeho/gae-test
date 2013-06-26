package kr.jh.service;

import java.util.HashMap;
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
public interface MainService {

    public void add(HashMap<String, Object> paramMap);

    public List<Entity> list();
}
