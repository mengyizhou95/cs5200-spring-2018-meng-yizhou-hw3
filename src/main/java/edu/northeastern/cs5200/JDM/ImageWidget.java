package edu.northeastern.cs5200.JDM;

public class ImageWidget extends Widget{
	private int ImageWidgetId;
	private String src;
	
	public ImageWidget() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ImageWidget(int id, String name, int width, int height, String cssClass, String cssStyle, String text,
			int order, Page page, String src) {
		super(id, name, width, height, cssClass, cssStyle, text, order, page);
		this.src = src;
		// TODO Auto-generated constructor stub
	}
	
	public int getImageWidgetId() {
		return ImageWidgetId;
	}
	public void setImageWidgetId(int imageWidgetId) {
		ImageWidgetId = imageWidgetId;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
}
