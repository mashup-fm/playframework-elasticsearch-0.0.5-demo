package models;

import javax.persistence.Entity;

import play.db.jpa.Model;
import play.modules.elasticsearch.annotations.ElasticSearchable;

@ElasticSearchable
@Entity
public class Contact extends Model {

	public String name;
	
	public String email;
	
	public String phone;
	
	public String address;
	
}
