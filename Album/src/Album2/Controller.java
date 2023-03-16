package Album2;

public class Controller {
	
	private Controller controller;
	private Service service;
	
	public Controller() {
		service = new Service();
	}
	
	public String requestSave(DTO []  dto) {
		
		 String response = service.save(dto);
			
			
		return response;
	}

}
