package cn.itcast.sh.dao;

import java.io.Serializable;
import java.util.List;

/**
 * HibernateDao 基础Dao接口
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2016-2-22 下午4:54:38
 * @version 1.0
 */
public interface HibernateDao {
	/**
	 * 保存方法
	 * @param entity 持久化对象
	 */
	<T> void save(T entity);
	/**
	 * 根据主键获取实体  (因为基本上所有的数据类型类都实现Serializable接口)
	 * @param entity 持久化对象
	 */
	<T> T get(Class<T> clazz, Serializable id);
	/**
	 * 修改方法
	 * @param entity 持久化对象
	 */
	<T> void update(T entity);
	/**
	 * 删除方法
	 * @param entity 持久化对象
	 */
	<T> void delete(T entity);
	/**
	 * 删除方法(主键)
	 * @param entity 持久化对象
	 */
	<T> void delete(Class<T> clazz, Serializable id);
	/**
	 * 查询所有的记录
	 * @param hql 查询语句
	 * @return 集合
	 */
	<T> List<T> find(String hql);
	
	/**
	 * 查询所有的记录
	 * @param hql 查询语句
	 * @return 集合
	 */
	<T> List<T> find(Class<T> clazz);
	
	
}
