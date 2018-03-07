package edu.northeastern.cs5200.JDM;

public class HeadingWidget extends Widget{
	private int HeadingWidget;
	private int size;
	
	public HeadingWidget() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HeadingWidget(int id, String name, int width, int height, String cssClass, String cssStyle, String text,
			int order, Page page, int size) {
		super(id, name, width, height, cssClass, cssStyle, text, order, page);
		this.size = size;
		// TODO Auto-generated constructor stub
	}
	
	public int getHeadingWidget() {
		return HeadingWidget;
	}
	public void setHeadingWidget(int headingWidget) {
		HeadingWidget = headingWidget;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
}
