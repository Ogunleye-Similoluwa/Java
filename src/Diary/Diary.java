package Diary;

import java.util.ArrayList;

public class Diary {
    private boolean isLocked = true;
    private String password;
    private ArrayList<Happenings> numberOfHappenings = new ArrayList<>();


    public Diary(String ownersName, String password) {
        this.password = password;
    }

    public boolean isLocked() {

        return isLocked;
    }

    public void unlockWith(String password) {
        boolean checkPassword = password.equals(this.password);
        if (checkPassword) {
            isLocked = false;
        }
    }

    public void lock() {
        isLocked = true;
    }

    public void write(String title, String words) {
        if (isLocked)throw new IllegalArgumentException("cannot write into a locked diary");

            writeIntoDiary(title, words);
    }

    private void writeIntoDiary(String title, String words) {
        int id = getNumberOfHappenings() + 1;
        Happenings happenings = new Happenings(id, title, words);
        numberOfHappenings.add(happenings);
    }

    public int getNumberOfHappenings() {
        return numberOfHappenings.size();
    }


    public Happenings findEntryWithId(int id) {
        for (Happenings happenings : numberOfHappenings) {
            if (happenings.getId() == id) {
                return happenings;
            }
        }
        return null;
    }

    public Happenings updateEntry(int id, String title, String body) {
        for (Happenings happenings : numberOfHappenings) {
            if (happenings.getId() == id) {
                happenings.setTitle(title);
                happenings.setWords(body);
                happenings = new Happenings(id, title, body);
                return happenings;
            }
        }
        return null;
    }

    public void deleteEntry(int id) {
        for (Happenings happenings : numberOfHappenings) {
             id = getNumberOfHappenings();
            if (happenings.getId() == id) {
                numberOfHappenings.remove(happenings);
                break;
            }

        }

    }

    public Happenings getAllEntries() {
        for (Happenings happenings : numberOfHappenings) {
            return happenings;
        }
        return null;
    }


}
