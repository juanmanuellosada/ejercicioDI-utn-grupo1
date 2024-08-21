package ejercicioDI;

public class EmailNotificationService implements NotificationService {

	@Override
	public void sendNotification(String message) {
		System.out.println("Bienvenida " + message + "!!!!!!1!!!");
	}

}
