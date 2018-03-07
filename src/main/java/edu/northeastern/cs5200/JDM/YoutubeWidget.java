package edu.northeastern.cs5200.JDM;

public class YoutubeWidget extends Widget{
	private int YoutubeWidgetId;
	private String url;
	private boolean shareble;
	private boolean expandable;
	
	public YoutubeWidget() {
		super();
		// TODO Auto-generated constructor stub
	}
	public YoutubeWidget(int id, String name, int width, int height, String cssClass, String cssStyle, String text,
			int order, Page page, String url, boolean shareble, boolean expandable) {
		super(id, name, width, height, cssClass, cssStyle, text, order, page);
		this.url = url;
		this.shareble = shareble;
		this.expandable = expandable;
		// TODO Auto-generated constructor stub
	}
	
	public int getYoutubeWidgetId() {
		return YoutubeWidgetId;
	}
	public void setYoutubeWidgetId(int youtubeWidgetId) {
		YoutubeWidgetId = youtubeWidgetId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public boolean isShareble() {
		return shareble;
	}
	public void setShareble(boolean shareble) {
		this.shareble = shareble;
	}
	public boolean isExpandable() {
		return expandable;
	}
	public void setExpandable(boolean expandable) {
		this.expandable = expandable;
	}
}
