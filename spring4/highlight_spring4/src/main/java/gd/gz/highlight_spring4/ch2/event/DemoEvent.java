package gd.gz.highlight_spring4.ch2.event;

import org.springframework.context.ApplicationEvent;

public class DemoEvent extends ApplicationEvent {
	private String msg;
	/**
	 * 
	 */
	private static final long serialVersionUID = 4226988803762878795L;

	public DemoEvent(Object object, String msg) {
		super(object);
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
