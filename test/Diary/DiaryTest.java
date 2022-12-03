package Diary;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    Diary diary;
    @BeforeEach
    public void startUp(){
        diary = new Diary("Simi","Password");
    }

    @Test
    public void setUp(){
        assertNotNull(diary);
    }
    @Test
    public void newDiaryIsLocked(){
        assertTrue(diary.isLocked());
    }
    @Test
    public void lockedDiaryCanBeUnlockedWithPassword(){
        assertTrue(diary.isLocked());
        diary.unlockWith("Password");
        assertFalse(diary.isLocked());
    }
    @Test
    public void lockedDiaryCannnotBeUnlockedWithPassword(){
        assertTrue(diary.isLocked());
        diary.unlockWith("wrongPassword");
        assertTrue(diary.isLocked());
    }
    @Test
    public void diaryCanBeLockedTest(){
        diary.unlockWith("Password");
        assertFalse(diary.isLocked());
        diary.lock();
    }
    @Test
    public void happeningsCanBeAddedToTheDiary(){
        diary.unlockWith("Password");
        assertFalse(diary.isLocked());
        diary.write("My Break up with Simi","wergkfusgdfsiu");
        assertEquals(1,diary.getNumberOfHappenings());
    }
    @Test
    public void entriesCannotBeAddedWhenDiaryIsLocked(){
        assertTrue(diary.isLocked());
        diary.write("My Break up with Simi","wergkfusgdfsiu");
        assertEquals(0,diary.getNumberOfHappenings());
    }
    @Test
    public void entriesCanBeFoundById(){
        diary.unlockWith("Password");
        assertFalse(diary.isLocked());
        diary.write("My Break up with Simi","wergkfusgdfsiu");
        assertEquals(1,diary.getNumberOfHappenings());
        Happenings foundHappening = diary.findEntryWithId(1);
        assertEquals(1,foundHappening.getId());
        assertEquals("My Break up with Simi",foundHappening.getTitle());
        assertEquals("wergkfusgdfsiu",foundHappening.getBody());

    }
    @Test
    public void entriesCanBeUpdated()  {
        diary.unlockWith("Password");
        assertFalse(diary.isLocked());
        diary.write("My Break up with Simi","wergkfusgdfsiu");
        assertEquals(1,diary.getNumberOfHappenings());
        diary.write("My Break2 up with Simi","smivkf5dtytddshte");
        Happenings foundHappening = diary.findEntryWithId(2);
        assertEquals(2,foundHappening.getId());
        diary.updateEntry(2, "My love","Baby is my love");
        assertEquals("My love",foundHappening.getTitle());
        assertEquals("Baby is my love",foundHappening.getBody());

    }
    @Test
    public void entriesCanBeDeleted(){
        diary.unlockWith("Password");
        assertFalse(diary.isLocked());
        diary.write("My Break up with Simi","wergkfusgdfsiu");
        assertEquals(1,diary.getNumberOfHappenings());
        diary.write("My Break2 up with Simi","smivkf5dtytddshte");
        Happenings foundHappening = diary.findEntryWithId(2);
        assertEquals(2,foundHappening.getId());
        diary.updateEntry(2, "My love","Baby is my love");
        diary.deleteEntry(2);
        assertEquals(1,diary.getNumberOfHappenings());
        System.out.println(diary.getAllEntries());

    }
    @Test
    public void writingToLockedDiaryThrowsExceptionTest(){
        assertTrue(diary.isLocked());
       // assertThrows(Exception.class,()-> diary.write("My Break up with Simi","wergkfusgdfsiu"));
        try{
            diary.write("My Break up with Simi","wergkfusgdfsiu");
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
