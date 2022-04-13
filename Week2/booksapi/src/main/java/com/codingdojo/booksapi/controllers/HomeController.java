package com.codingdojo.booksapi.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.booksapi.models.Book;
import com.codingdojo.booksapi.services.BookService;

// No longer want RestController for RawData
/*@RestController*/
// We want a Controller to render JSP's
@Controller
public class HomeController {

	private final BookService bookService;

	public HomeController(BookService bookService) {

		this.bookService = bookService;

	}

	// What sends the data to the JSP?
	// Model model

	// All @Controller methods have what type of return method?
	// String!! i.e. return "index.jsp";
	// Unless it's a POST then we redirect

	// Method to Find all the Books
	// Want to match up to index method
	@RequestMapping("/api/books")
	public List<Book> book() {
		// return the call to the BookService method called allBooks()
		return bookService.allBooks();
	}

	
	// Index Route to show all Books from db
	@RequestMapping("/")
	public String index(Model model) {
		
		/*
		 * List<Book> allBooks = bookService.allBooks(); model.addAttribute( "allBooks"
		 * , allBooks );
		 */
		
		model.addAttribute("allBooks", bookService.allBooks());
		
		return "index.jsp";
	}
	
	@RequestMapping("/api/books/{id}")
	public Book show(@PathVariable("id") Long id) {
		Book book = bookService.findBook(id);
		return book;
	}
	
	// Return one book to a JSP
	@RequestMapping("/book/{id}")
	public String oneBook(@PathVariable("id") Long id, Model model) {
		
		Book book = bookService.findBook(id);
		model.addAttribute( "book" , book );
		
		model.addAttribute("book", bookService.findBook(id));
		
		return "oneBook.jsp";
	}
	
	
	
	@RequestMapping(value = "/api/books", method = RequestMethod.POST)
	public Book create(@RequestParam(value = "title") String title, @RequestParam(value = "description") String desc,
			@RequestParam(value = "language") String lang, @RequestParam(value = "pages") Integer numOfPages) {
		
		
		Book book = new Book(title, desc, lang, numOfPages);

		return bookService.createBook(book);

	}

	@RequestMapping("/bookForm")
	public String bookForm() {
		
		
		return "newBook.jsp";
	}
	
	
	@RequestMapping(value = "/newbook", method = RequestMethod.POST)
	public String newBook(@RequestParam(value = "title") String title, @RequestParam(value = "description") String desc,
			@RequestParam(value = "language") String lang, @RequestParam(value = "pages") Integer numOfPages) {
		
		
		Book book = new Book(title, desc, lang, numOfPages);

		bookService.createBook(book);
		
		return "redirect:/";

	}

	// other methods removed for brevity

	/*
	 * @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT) public
	 * Book update(
	 * 
	 * @PathVariable("id") Long id,
	 * 
	 * @RequestParam(value="title") String title,
	 * 
	 * @RequestParam(value="description") String desc,
	 * 
	 * @RequestParam(value="language") String lang,
	 * 
	 * @RequestParam(value="pages") Integer numOfPages) {
	 * 
	 * 
	 * Book book = bookService.updateBook(id, title, desc, lang, numOfPages);
	 * 
	 * 
	 * return book; }
	 */

	/*
	 * @RequestMapping(value = "/api/books/{id}", method = RequestMethod.DELETE)
	 * public void destroy(@PathVariable("id") Long id) {
	 * 
	 * bookService.deleteBook(id);
	 * 
	 * }
	 */

}
