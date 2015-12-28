package pl.prz.projekt.dao;

import java.util.List;

import pl.prz.projekt.model.Reminder;

public interface ReminderDAO {

	public void addReminder(Reminder r);
	public List<Reminder> listReminder();
	public void deleteReminder (Reminder r);
	public Reminder updateReminder (Reminder r);
	
}
