package org.essoft.generic;

import java.util.List;

public interface GenericRepository<T, TId> {
    T getById(TId id);
    List<T> getAll();
    void add(T t);
    void update(T t);
    void delete(T t);
}
