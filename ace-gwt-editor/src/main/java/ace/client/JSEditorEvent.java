package ace.client;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;

public abstract class JSEditorEvent<H extends EventHandler> extends GwtEvent<H>{

	final JSEditorProxy source;
	
	public JSEditorEvent( JSEditorProxy source ) {
		super();
		this.source = source;
	}

	@Override
	public Object getSource() {
		return source;
	}

	public JSEditorProxy getEditor() {
		return source;
	}
	
	
}
