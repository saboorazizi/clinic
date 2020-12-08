package optic.framework.clinic.services;

import java.util.Set;
// refactoring all findAll(), findById(), Save()
// They have our interface to inhered from common interface
// So we create the CrudService<T, ID>
public interface CrudService<T, ID> {
    Set<T> findAll();

    T findById(ID id);
    T save(T object);

    void delete(T object);
    void deleteById(ID id);
}
