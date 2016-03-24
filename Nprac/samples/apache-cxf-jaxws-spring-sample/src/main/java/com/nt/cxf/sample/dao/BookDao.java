package com.nt.cxf.sample.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nt.cxf.entities.BookVO;
import com.nt.cxf.sample.db.DB;

public class BookDao {
	public boolean insertBook(BookVO book) {
		DB db = new DB();
		db.setConnection();
		String sql = "insert into webservice.books(name,author) values(?,?)";
		
		try {
			int result = db.updateQuery(sql, new Object[] { book.getBookName(), book.getAuthor() });
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("1: "+e.getMessage());
			System.out.println("2: "+e.getErrorCode());
			System.out.println("3: "+e.getSQLState());
			System.out.println("4: "+e.getCause());
		
			//e.printStackTrace();
			return false;
		}finally{
			try {
				db.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}
	
	public BookVO getBook(String bookName){
		BookVO book=null;
		DB db = new DB();
		db.setConnection();
		String sql = "select id,name,author from webservice.books where name=?";
		ResultSet resultSet=null;
		try {
			resultSet = db.selectQuery(sql, new Object[] {bookName});
			if(resultSet.next()){
				book=new BookVO();
				book.setBookId(resultSet.getLong("id"));
				book.setBookName(bookName);
				book.setAuthor(resultSet.getString("author"));
				
			}
			return book;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(resultSet!=null){
					resultSet.close();
				}
				db.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;

	}
	
	
	public List<BookVO> getBooksByAuthor(String author){
		
		List<BookVO> books=new ArrayList<BookVO>();
		DB db = new DB();
		db.setConnection();
		String sql = "select id,name,author from webservice.books where author=?";
		ResultSet resultSet=null;
		try {
			resultSet = db.selectQuery(sql, new Object[] {author});
			while(resultSet.next()){
				BookVO book=new BookVO();
				book.setBookId(resultSet.getLong("id"));
				book.setBookName(resultSet.getString("name"));
				book.setAuthor(resultSet.getString("author"));
				books.add(book);
			}
			return books;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(resultSet!=null){
					resultSet.close();
				}
				db.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;

	}
	
	
	
	public List<BookVO> getAllBooks(){
		
		List<BookVO> books=new ArrayList<BookVO>();
		DB db = new DB();
		db.setConnection();
		String sql = "select id,name,author from webservice.books";
		ResultSet resultSet=null;
		try {
			resultSet = db.selectQuery(sql, new Object[] {});
			while(resultSet.next()){
				BookVO book=new BookVO();
				book.setBookId(resultSet.getLong("id"));
				book.setBookName(resultSet.getString("name"));
				book.setAuthor(resultSet.getString("author"));
				books.add(book);
			}
			return books;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(resultSet!=null){
					resultSet.close();
				}
				db.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;

	}
}
