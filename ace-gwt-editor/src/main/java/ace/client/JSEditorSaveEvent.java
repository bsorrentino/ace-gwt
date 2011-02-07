package ace.client;

import com.google.gwt.event.shared.GwtEvent;

public class JSEditorSaveEvent extends JSEditorEvent<JSEditorHandler>{
	  
	private static final GwtEvent.Type<JSEditorHandler> TYPE = new GwtEvent.Type<JSEditorHandler>();

	
	public JSEditorSaveEvent(JSEditorProxy source) {
		super(source);
	}

	public static GwtEvent.Type<JSEditorHandler> getType(){ return TYPE;	}

	@Override
	public GwtEvent.Type<JSEditorHandler> getAssociatedType(){ return TYPE; }
	
	@Override
	protected void dispatch(JSEditorHandler handler){
		handler.onSave(this);
	}
	
	
}