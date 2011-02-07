package ace.client;

import com.google.gwt.event.shared.EventHandler;

public interface JSEditorHandler extends EventHandler {

	void onSave( JSEditorEvent<?> event );
}
