package ejercicioDI;

public class UserService {

	public NotificationService notificationService;
	
	public UserService(NotificationService notificationService) {
		this.notificationService = notificationService;
	}
	
	public void registerUser(String username) {
		notificationService.sendNotification(username);
	}
	
}
