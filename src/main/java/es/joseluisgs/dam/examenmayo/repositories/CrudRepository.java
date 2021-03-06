package es.joseluisgs.dam.examenmayo.repositories;

import javafx.collections.ObservableList;

import java.sql.SQLException;
import java.util.Optional;

public interface CrudRepository<T, ID> {
    /**
     * Devuelve una lista de todos los elementos del repositorio
     *
     * @return Lista de elementos
     * @throws SQLException Si hay algún error en la base de datos
     */
    ObservableList<T> findAll() throws SQLException;

    /**
     * Devuelve un Optional del elemento dada una id
     *
     * @param id Id del elemento
     * @return Optional del elemento
     * @throws SQLException Si hay algún error en la base de datos
     */
    Optional<T> findById(ID id) throws SQLException;

    /**
     * Inserta un elemento en el repositorio
     *
     * @param entity Elemento a insertar
     * @return Elemento insertado
     * @throws SQLException Si hay algún error en la base de datos
     */
    Optional<T> save(T entity) throws SQLException;

    /**
     * Actualiza un elemento en el repositorio
     *
     * @param entity Elemento a actualizar
     * @return Elemento actualizado
     * @throws SQLException Si hay algún error en la base de datos
     */
    Optional<T> update(T entity) throws SQLException;

    /**
     * Elimina un elemento del repositorio
     *
     * @param entity elemento a eliminar
     * @return Elemento eliminado
     * @throws SQLException Si hay algún error en la base de datos
     */
    void delete(T entity) throws SQLException;
}
