package hrmsproject.hrms.business.abstracts;

import java.util.List;

import hrmsproject.hrms.entities.concretes.User;

public interface UserService {
	List<User> getAll();
}
