import java.util.Base64;
public class Hello
  {
   public static void main(String args[])
    {
    System.out.println("Hello Amit Singh");
    System.out.println("I have just started using Github");
    System.out.println("It feels good.");
     //response
     String encodedMessage="R2xhZCB0byBoYXZlIHlvdSBoZXJlISBJIHdhcyBzdGFydGluZyB0byBmZWVsIHZlcnkgbG9uZWx5LiBMb29raW5nIGZvcndhcmQgdG8gcG9zc2libGUgY29sbGFib3JhdGlvbnMu";
     System.out.println(decodeMessage(encodedMessage));
    }
    private static String decodeMessage(String encMess) {
      Base64.Decoder decoder = Base64.getMimeDecoder();
      String decoMess =  new String(decoder.decode(encMess));
      return decoMess;
    }
  }
