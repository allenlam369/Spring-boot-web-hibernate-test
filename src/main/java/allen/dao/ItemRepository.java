package allen.dao;

import org.springframework.data.repository.CrudRepository;

import allen.model.Item;

public interface ItemRepository extends CrudRepository<Item,Long> {

}
