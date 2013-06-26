package kr.jh.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import kr.jh.domain.dao.BaseDao;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

/**
 * <pre>
 * 
 * Created on 2012. 5. 24.
 * Copyright Jaeho J
 * </pre>
 * 
 * @author <a href="http://goo.gl/ZhMb8">Jaeho J</a>
 */
@Service("mainService")
public class MainServiceImpl implements MainService {

    private Logger  logger = Logger.getLogger(MainServiceImpl.class);

    @Inject
    @Named("baseDao")
    private BaseDao baseDao;

    @Override
    public void add(HashMap<String, Object> paramMap) {
        String name = (String) paramMap.get("name");
        Date date = new Date();
        Key testKey = KeyFactory.createKey("Test", name);
        Entity test = new Entity("Test", testKey);
        test.setProperty("name", name);
        test.setProperty("createDt", date);

        logger.debug("-=-=- service test : \n" + test.toString());

        baseDao.add(test);
    }

    @Override
    public List<Entity> list() {
        return baseDao.list();
    }

}
