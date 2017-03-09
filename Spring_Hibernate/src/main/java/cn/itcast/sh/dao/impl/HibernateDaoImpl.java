package cn.itcast.sh.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import cn.itcast.sh.dao.HibernateDao;

/**
 * HibernateDaoImpl 基础Dao接口实现类
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2016-2-22 下午5:05:02
 * @version 1.0
 */
public class HibernateDaoImpl extends HibernateDaoSupport implements HibernateDao {

	/**
	 * 保存方法
	 * @param entity 持久化对象
	 */
	public <T> void save(T entity){
		this.getHibernateTemplate().save(entity);
	}
	/**
	 * 根据主键获取实体  (因为基本上所有的数据类型类都实现Serializable接口)
	 * @param entity 持久化对象
	 */
	public <T> T get(Class<T> clazz, Serializable id){
		return this.getHibernateTemplate().get(clazz, id);
	}
	/**
	 * 修改方法
	 * @param entity 持久化对象
	 */
	public <T> void update(T entity){
		this.getHibernateTemplate().update(entity);
	}
	/**
	 * 删除方法
	 * @param entity 持久化对象
	 */
	public <T> void delete(T entity){
		this.getHibernateTemplate().delete(entity);
	}
	/**
	 * 删除方法(主键)
	 * @param entity 持久化对象
	 */
	public <T> void delete(Class<T> clazz, Serializable id){
		this.getHibernateTemplate().delete(get(clazz, id));
	}
	/**
	 * 查询所有的记录
	 * @param hql 查询语句
	 * @return 集合
	 */
	@SuppressWarnings("unchecked")
	public <T> List<T> find(String hql){
		return (List<T>)this.getHibernateTemplate().find(hql);
	}
	
	/**
	 * 查询所有的记录
	 * @param hql 查询语句
	 * @return 集合
	 */
	public <T> List<T> find(Class<T> clazz){
		String hql = "from " + clazz.getSimpleName();
		return find(hql);
	}

}
