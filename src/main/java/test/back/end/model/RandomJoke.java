package test.back.end.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RandomJoke {
	private String category;
	private String icon_url;
	private String id;
	private String url;
	private String value;
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getIcon_url() {
		return icon_url;
	}
	
	public void setIcon_url(String icon_url) {
		this.icon_url = icon_url;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "RandomJoke [category=" + category + ", icon_url=" + icon_url + ", id=" + id + ", url=" + url
				+ ", value=" + value + "]";
	}	
}
