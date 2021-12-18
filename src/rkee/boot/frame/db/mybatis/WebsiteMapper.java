package rkee.boot.frame.db.mybatis;

import java.util.List;

public interface WebsiteMapper {
	
	public List<Website> selectAllWebsite(Website website);	
	public void addWebsite(Website website);
	
}
