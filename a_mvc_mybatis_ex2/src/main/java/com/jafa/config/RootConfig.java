package com.jafa.config;

import java.io.IOException;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.jafa.dao.BoardDao;
import com.jafa.dao.BoardDaoImpl;

@Configuration
@MapperScan("com.jafa.dao")
public class RootConfig {
	
	@Bean
	public DataSource dataSource() {
		DataSource dataSource = new DataSource();
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		dataSource.setUsername("springdb");
		dataSource.setPassword("1234");
		return dataSource;
	}
	
	@Bean
	public SqlSessionFactoryBean sqlSessionFactoryBean() throws IOException {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource());
		// mybatis/mappers/BoardDaoMapper.xml
//		bean.setMapperLocations(
//			new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mappers/**/*Mapper.xml"));
		return bean;
	}
	
	@Bean
	public SqlSessionTemplate sqlSessionTemplate() throws Exception {
		SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactoryBean().getObject());
		return sqlSessionTemplate;
		
	}
	
	@Bean
	public BoardDao boardDao() throws Exception {
		return new BoardDaoImpl(sqlSessionTemplate());
	
	}
	
//	@Bean
//	public MapperFactoryBean<BookRepository> bookRepostiroy() throws Exception {
//		MapperFactoryBean<BookRepository> bean = new MapperFactoryBean<>();
//		bean.setSqlSessionFactory(sqlSessionFactoryBean().getObject());
//		bean.setMapperInterface(BookRepository.class);
//		return bean;
//	}
	
}