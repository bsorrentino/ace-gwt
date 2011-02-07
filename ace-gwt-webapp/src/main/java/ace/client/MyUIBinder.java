/**
 * 
 */
package ace.client;

import ace.client.service.MyServiceAsync;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author softphone
 *
 */
public class MyUIBinder extends Composite {

	private static MyUIBinderUiBinder uiBinder = GWT.create(MyUIBinderUiBinder.class);

	interface MyUIBinderUiBinder extends UiBinder<Widget, MyUIBinder> {
	}

	@UiField
	Button button;

	public MyUIBinder() {
		initWidget(uiBinder.createAndBindUi(this));

		// Can access @UiField after calling createAndBindUi
		button.setText("RPC echo service test");
	}

	@UiHandler("button")
	void onClick(ClickEvent e) {
		
		MyServiceAsync.Util.getInstance().echo("Hello world!", new AsyncCallback<String>() {
			
			public void onSuccess(String result) {
				Window.alert(result);
			}
			
			public void onFailure(Throwable error) {
				Window.alert("error\n" + error );
				
			}
		});
	}

}
