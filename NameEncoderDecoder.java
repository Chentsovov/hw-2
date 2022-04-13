public class NameEncoderDecoder {
  //кодирование и декодирование строки
   public String encode(String name){
      name= name.replace("e","1").
                 replace("u","2").
                 replace("i","3").
                 replace("o","4").
                 replace("a","5");
      name= "NOTFORYOU" + name + "YESNOTFORYOU";
      return name;
   }
   // String sss1 = "qwer, tyuio";
    //    sss1 = sss1.replace("qwer", "asdf").replace("tyuio","ghjkl");
    //    System.out.println("sss1 = " + sss1);


  public String decode(String name){
     name= name.replace("1","e").
                 replace("2","u").
                 replace("3","i").
                 replace("4","o").
                 replace("5","a");
     name= name.replace("YESNOTFORYOU","");
     name= name.replace("NOTFORYOU","");
    return name;}

    public static void main(String[] args) {

}}
