package com.shivu.transofrm;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;

import javax.xml.bind.JAXBException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.shivu.transofrm.domain.Author;
import com.shivu.transofrm.domain.Book;
import com.shivu.transofrm.domain.Publisher;
import com.shivu.transofrm.json.Config;
import com.shivu.transofrm.json.JsonDemo;
import com.shivu.transofrm.xml.Converter;

@SpringBootApplication
public class FormatTransformDemoApplication {

	public static void demo1(ApplicationContext ctx) throws JAXBException, IOException {
		// ApplicationContext ctx =
		// SpringApplication.run(FormatTransformDemoApplication.class, args);

		Converter converter = ctx.getBean(Converter.class);

		Author author = new Author();
		author.setFirstName("abc");
		author.setLastName("pqr");

		Publisher publisher = new Publisher();
		publisher.setLocation("london");
		publisher.setName("pub");

		Book book = new Book();
		book.setGenre("abc");
		book.setIsbn("6543gfh167245");
		book.setTitle("tuv");
		book.setAuthor(author);
		book.setPublisher(publisher);
		book.setPublishedDate(LocalDate.now());

		try {
			converter.toXml(book);
		} catch (JAXBException e) {
			e.printStackTrace();
		}

		Resource res = new ClassPathResource("book.xml");
		Book bk = converter.toDomain(res.getFile());

		System.out.println(bk);
	}

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = SpringApplication.run(FormatTransformDemoApplication.class, args);
		JsonDemo jd = ctx.getBean(JsonDemo.class);
		Config cfg = jd.toDomain(new ClassPathResource("demo.json").getFile().getAbsolutePath());
		System.out.println(cfg);
	}

}
