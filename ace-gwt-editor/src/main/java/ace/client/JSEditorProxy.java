package ace.client;

import com.google.gwt.core.client.JavaScriptObject;

public class JSEditorProxy {

	final JavaScriptObject _editor;
	
	public static native JSEditorProxy create( Object id ) /*-{ 	
		//$wnd.alert( $wnd.ace );
		var editor = $wnd.ace.edit(id);
		var JavaScriptMode = $wnd.require("ace/mode/javascript").Mode;

    	editor.getSession().setMode(new JavaScriptMode());

		return @ace.client.JSEditorProxy::new(Lcom/google/gwt/core/client/JavaScriptObject;)( editor );
			
	}-*/;

	public native void printTo( String id ) /*-{ 	
		var editor = this.@ace.client.JSEditorProxy::_editor;
		var res = "";
		for( m in editor.getSession() ) res += m + "\n";
    	$wnd.document.getElementById(id).innerText = res;
	}-*/;
	
	public JSEditorProxy(JavaScriptObject _editor) {
		this._editor = _editor;
	}
	
	public native void setTheme( String theme ) /*-{
		var editor = this.@ace.client.JSEditorProxy::_editor;
		editor.setTheme(theme);
	}-*/;

	public native String getText() /*-{
		var editor = this.@ace.client.JSEditorProxy::_editor;
		var session = editor.getSession();
		
		return session.toString();
	}-*/;

}
