package com.fpoly.core.DAO;

import java.sql.SQLException;
import java.util.List;

public abstract class AbstractDAO<E, K> {
    abstract public void insert(E entity);

    abstract public void update(E entity);

    abstract public void delete(K key);

    abstract public List<E> selectAll() throws SQLException;

    abstract E selectById(K key);

    abstract protected List<E> selectsql(String sql, Object... args) throws SQLException;
}
