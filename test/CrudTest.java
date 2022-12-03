import ChibuzorSnacks.CRUD.Create;
import ChibuzorSnacks.CRUD.Read;
import Diary.Happenings;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CrudTest {
    Read newCreate;
    @BeforeEach
    public void startUp(){
        newCreate = new Read();
    }

    @Test
    public void setUp(){
        assertNotNull(newCreate);
    }
    @Test
    public  void addNewObjectTest(){
        Read read = new Read();
        read.addNewRecord("mimi","09015439696","feodfiugudbsiyu","54978ewrhgkdjsb");
        read.addNewRecord("mimi","09015439696","feodfiugudbsiyu","54978ewrhgkdjsb");
        assertEquals(2,read.numberOfItems());
    }
    @Test
    public void findItemByIndex(){
        newCreate.addNewRecord("mimi","09015439696","feodfiugudbsiyu","54978ewrhgkdjsb");
        assertEquals(1,newCreate.numberOfItems());

   Create create = newCreate.findRecord(1);
   assertEquals("mimi",create.getName());
   assertEquals("09015439696",create.getPhoneNumber());
   assertEquals("feodfiugudbsiyu",create.getAddress());
   assertEquals("54978ewrhgkdjsb",create.getEmail());
    }

    @Test
    public void recordsCanBeUpdated()  {

        newCreate.addNewRecord("simi","09015439696","feodfiugudbsiyu","54978ewrhgkdjsb");
        assertEquals(1,newCreate.numberOfItems());

        Create create = newCreate.updateEntry(1,"simi","09015439696","feodfiugudbsiyu","54978ewrhgkdjsb");
        assertEquals("simi",create.getName());
        assertEquals("09015439696",create.getPhoneNumber());
        assertEquals("feodfiugudbsiyu",create.getAddress());
        assertEquals("54978ewrhgkdjsb",create.getEmail());
    }


}
