package hrmsproject.hrms.business.abstracts;

import java.util.List;

import hrmsproject.hrms.entities.concretes.JobTitle;

public interface JobTitleService {
	List<JobTitle> getAll();
}