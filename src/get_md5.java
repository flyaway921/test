import java.io.*;
import java.util.*;
import java.math.BigInteger;
import java.security.MessageDigest;

class get_md5{
  static final Scanner cin=new Scanner(System.in);

  public static byte[] hash(String type, byte[]... data){
    byte[] result = null;
    try{
      MessageDigest messageDigest = MessageDigest.getInstance(type);
      for(byte[] block : data)
        messageDigest.update(block);
      result = messageDigest.digest();
    }
    catch (Exception e){
      throw new RuntimeException(e);
    }
    return result;
  }

  public static BigInteger hash(String data){
    byte[] result = hash("MD5", data.getBytes());
    BigInteger hash = new BigInteger(result);
    return hash.abs();
  }

  public static void main(String[] args){
    while(cin.hasNext()){
      String str1=cin.next();
      BigInteger a= hash(str1);
      System.out.println(a);
    }
  }
}