package ChibuzorSnacks.CRUD;

import Diary.Happenings;

import java.util.ArrayList;

public class Read {
    private final ArrayList<ChibuzorSnacks.CRUD.Create> read;
    public Read(){
        read = new ArrayList<>();
    }
    public void addNewRecord(String name, String phoneNumber, String address, String email) {
        ChibuzorSnacks.CRUD.Create create = new ChibuzorSnacks.CRUD.Create( idOfRecord() , name,  phoneNumber,  address, email);
        read.add(create);
    }

    public int numberOfItems(){
        return read.size();
    }
    public int idOfRecord(){
        int id = numberOfItems() + 1;
        return id;
    }

    public ChibuzorSnacks.CRUD.Create getAllEntries() {
        for (ChibuzorSnacks.CRUD.Create record : read) {
            return record;
        }
        return null;
    }


    public ChibuzorSnacks.CRUD.Create findRecord(int id) {
        for (ChibuzorSnacks.CRUD.Create record : read) {
            if (record.getId() == id) {
                return record;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Read read = new Read();
        read.addNewRecord("Chuck", "555-555-5555", "123 Main St", "chuck@example.com");
        read.addNewRecord("Chck", "555-555-5555", "123 Main", "drttfyguh");
        System.out.println(read.numberOfItems());
    }
    public Create updateEntry(int id , String name, String phoneNumber, String address, String email) {
        for (Create record : read) {
            if (record.getId() == id) {
                record.setName(name);
                record.setPhoneNumber(phoneNumber);
                record.setAddress(address);
                record.setEmail(email);
                record = new Create(id,name, phoneNumber, address, email);
                return record;
            }
        }
        return null;
    }
    public void deleteEntry(int id) {
        for (Create record : read) {
            id = numberOfItems();
            if (record.getId() == id) {
                read.remove(record);
                break;
            }

        }

    }

}