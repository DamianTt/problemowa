package pl.prz.projekt.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.prz.projekt.dao.ReminderDAO;
import pl.prz.projekt.model.Reminder;

@Service
@ManagedBean(name="ReminderService")
@SessionScoped
public class ReminderServiceImpl implements ReminderService {

	@Autowired
	private ReminderDAO reminderDAO;
	
	
	public void setReminderDAO(ReminderDAO reminderDAO) {
		this.reminderDAO = reminderDAO;
	}

	@Override
	@Transactional
	public void addReminder(Reminder r) {
		
		this.reminderDAO.addReminder(r);
		
	}

	@Override
	@Transactional
	public List<Reminder> listReminder() {

		return this.reminderDAO.listReminder();
	}

	@Override
	@Transactional
	public void deleteReminder(Reminder r) {
		
		this.reminderDAO.deleteReminder(r);
	}

	@Override
	@Transactional
	public Reminder updateReminder(Reminder r) {

		return this.reminderDAO.updateReminder(r);
	}

}
