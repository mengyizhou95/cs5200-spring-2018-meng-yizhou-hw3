package edu.northeastern.cs5200.JDM;

public class HtmlWidget extends Widget{
	private int HtmlWidgetId;
	private String html;
	
	public HtmlWidget() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HtmlWidget(int id, String name, int width, int height, String cssClass, String cssStyle, String text,
			int order, Page page, String html) {
		super(id, name, width, height, cssClass, cssStyle, text, order, page);
		this.html = html;
		// TODO Auto-generated constructor stub
	}
	
	public int getHtmlWidgetId() {
		return HtmlWidgetId;
	}
	public void setHtmlWidgetId(int htmlWidgetId) {
		HtmlWidgetId = htmlWidgetId;
	}
	public String getHtml() {
		return html;
	}
	public void setHtml(String html) {
		this.html = html;
	}
	
	
}
