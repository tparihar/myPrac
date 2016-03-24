package com.nt.cxf.sample.impl;

import java.util.List;

import javax.jws.WebService;

import com.nt.cxf.entities.BookVO;
import com.nt.cxf.sample.BookShelfService;
import com.nt.cxf.sample.dao.BookDao;

@WebService(endpointInterface = "com.nt.cxf.sample.BookShelfService", serviceName = "bookShelfService")
public class BookShelfServiceImpl implements BookShelfService {
		  BookDao bookDao=new BookDao();
		  
	    public String insertBook(BookVO bookVO) {
	    	return (bookDao.insertBook(bookVO))? "Book with name : " + bookVO.getBookName() + " is now available on the shelf":"Cannot insert duplicate books" ; //To change body of implemented methods use File | Settings | File Templates.
		    
	        }

	    public BookVO getBook(String title) {

	        return bookDao.getBook(title);  //To change body of implemented methods use File | Settings | File Templates.
	    }

		@Override
		public List<BookVO> getBooksByAuthor(String author) {
			// TODO Auto-generated method stub
			return bookDao.getBooksByAuthor(author);
		}

		@Override
		public List<BookVO> getAllBooks() {
			// TODO Auto-generated method stub
			return bookDao.getAllBooks();
		}
	    
	    
	
}


