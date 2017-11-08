package allen.controller;

import allen.model.Item;
import allen.service.ItemService;
import allen.service.HibernateSearchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ItemController {

	@Autowired
	private HibernateSearchService searchservice;

	@Autowired
	private ItemService itemService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String search(@RequestParam(value = "search", required = false) String q, Model model) {
		List<Item> searchResults = null;
		try {
			itemService.addItems();
			searchResults = searchservice.fuzzySearch(q);

		} catch (Exception ex) {
			// TODO
		}
		model.addAttribute("search", searchResults);
		// index.html
		return "index";

	}

}
