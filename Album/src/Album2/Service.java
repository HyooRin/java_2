package Album2;

public class Service {
	
	private DAO dao;
	
	public Service() {
		dao = new DAO();
	}
	
	public String save(DTO[] dto) {
		
		int resultRow = 0;
		resultRow = dao.insert(dto);
		
		return resultRow +"";
	}

}
