package cn.itcast.sh.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import cn.itcast.sh.dao.HibernateDao;

public class HibernateDaoImpl extends HibernateDaoSupport implements HibernateDao {
	public <T> void save(T entity){
		this.getHibernateTemplate().save(entity);
	}

	public <T> T get(Class<T> clazz, Serializable id){
		return this.getHibernateTemplate().get(clazz, id);
	}

	public <T> void update(T entity){
		this.getHibernateTemplate().update(entity);
	}

	public <T> void delete(T entity){
		this.getHibernateTemplate().delete(entity);
	}

	public <T> void delete(Class<T> clazz, Serializable id){
		this.getHibernateTemplate().delete(get(clazz, id));
	}

	@SuppressWarnings("unchecked")
	public <T> List<T> find(String hql){
		return (List<T>) this.getHibernateTemplate().find(hql);
	}
	
	public <T> List<T> find(Class<T> clazz){
		String hql = "from " + clazz.getSimpleName();
		return find(hql);
	}
}
