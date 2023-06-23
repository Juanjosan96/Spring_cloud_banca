package eureka.item.models.service;

import java.util.List;

import eureka.item.models.Item;

public interface ItemService {

	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);
}
