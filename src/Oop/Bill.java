package Oop;

import chap9.Address;

public class Bill {
   protected String receiverPhoneNumber;
   private String recieverName;
   private Address deliveryAddress;
   private CreditCardInformation CardInformation;

   protected void    setReceiverPhoneNumber(String num){
      receiverPhoneNumber = num;
   }

   public String getReceiverPhoneNumber() {
      return receiverPhoneNumber;
   }
}