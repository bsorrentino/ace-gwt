package ace.client;

import com.google.gwt.user.client.ui.RootPanel;

public class JSEditor {

	private JSEditorToolbar toolbar;
	private JSEditorProxy proxy;


	public JSEditor() {
		super();
		
		RootPanel editor = RootPanel.get("editor");
		editor.setHeight("500px");
		editor.setWidth("100%");
		proxy = JSEditorProxy.create( editor.getElement() );
		toolbar = new JSEditorToolbar( proxy );
		toolbar.setWidth("100%");
		RootPanel.get( "toolbar").add(toolbar);
	}

	public void addHandler( JSEditorHandler h  ) {

		toolbar.addHandler(h);

	}

	public void removeHandler( JSEditorHandler h  ) {

		toolbar.removeHandler(h);

	}

	public final JSEditorToolbar getToolbar() {
		return toolbar;
	}

	public final JSEditorProxy getProxy() {
		return proxy;
	}
	
}
