package cn.itcast.sh.dao;

import java.io.Serializable;
import java.util.List;

public interface HibernateDao {
	public <T> void save(T entity);

	public <T> T get(Class<T> clazz, Serializable id);

	public <T> void update(T entity);

	public <T> void delete(T entity);

	public <T> void delete(Class<T> clazz, Serializable id);

	public <T> List<T> find(String hql);

	public <T> List<T> find(Class<T> clazz);
}
