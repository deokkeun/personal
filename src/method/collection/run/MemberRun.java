package method.collection.run;

import method.collection.model.service.MemberService;

public class MemberRun {

	public static void main(String[] args) {
		MemberService service = new MemberService();
		service.displayMenu();
	}

}
