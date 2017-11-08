package allen.service;

/**
 * This service preload the embedded database with some data for testing
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import allen.dao.ItemRepository;
import allen.model.Item;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	ItemRepository itemRepository;

	Item item1 = new Item();
	Item item2 = new Item();
	Item item3 = new Item();
	Item item4 = new Item();

	public void addItems() {

		item1.setTitle("Rubiks Cube");
		item1.setDescription("Rubiks Cube 3x3, used");
		item1.setCurrentPrice(10);
		itemRepository.save(item1);

		item2.setTitle("iPhone");
		item2.setDescription("iPhone4, 32 GB, Black");
		item2.setCurrentPrice(100);
		itemRepository.save(item2);

		item3.setTitle("Canon EOS");
		item3.setDescription("Canon EOS 6D Camera body used, black");
		item3.setCurrentPrice(1000);
		itemRepository.save(item3);

		item4.setTitle("iPad");
		item4.setDescription("iPad 2, 64 GB, with a black cover");
		item4.setCurrentPrice(200);
		itemRepository.save(item4);

		System.out.println("Items have been added : " + itemRepository.findAll());

	}
}
