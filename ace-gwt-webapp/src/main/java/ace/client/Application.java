package ace.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Application implements EntryPoint
{

  /**
   * This is the entry point method.
   */
  public void onModuleLoad()
  {
	  
	  
	  final JSEditor editor = new JSEditor();

	 editor.addHandler( new JSEditorHandler() {

		public void onSave(JSEditorEvent<?> event) {
			Window.alert( "save ");
		}
		 
	 });
	  
	  editor.getProxy().setTheme("ace/theme/twilight");
	 
	  editor.getProxy().printTo("info");
  }
}
