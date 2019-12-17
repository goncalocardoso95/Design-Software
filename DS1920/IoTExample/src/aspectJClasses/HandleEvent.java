package aspectJClasses;

import com.bezirk.middleware.addressing.ZirkEndPoint;
import com.bezirk.middleware.messages.Event;
import com.bezirk.middleware.messages.EventSet.EventReceiver;

import i18n.I18N;
import i18n.Messages;
import sensors.BotaoEvento;
import sensors.LuzEvento;

public class HandleEvent implements EventReceiver {

	@Override
	public void receiveEvent(Event arg0, ZirkEndPoint arg1) {
		if (arg0 instanceof BotaoEvento) {
			System.out.println(I18N.getString(Messages.BUTTON_RECEIVED_EVENT));
		}
		if (arg0 instanceof LuzEvento) {
			System.err.println("RGB(0, 0, 255) --> Butao acionado");
		}
	}
}