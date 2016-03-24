package com.nt.cxf.sample;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.nt.cxf.entities.BookVO;


@WebService
public interface BookShelfService {

	@WebMethod
	public String insertBook(BookVO bookVO);

	@WebMethod
	public BookVO getBook(String title);
	
	@WebMethod
	public List<BookVO>  getBooksByAuthor(String author);
	
	@WebMethod
	public List<BookVO> getAllBooks();

}
