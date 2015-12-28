package pl.prz.projekt.service;

import java.util.List;

import pl.prz.projekt.model.Reminder;

public interface ReminderService {
	
	public void addReminder(Reminder r);
	public List<Reminder> listReminder();
	public void deleteReminder (Reminder r);
	public Reminder updateReminder (Reminder r);

}
