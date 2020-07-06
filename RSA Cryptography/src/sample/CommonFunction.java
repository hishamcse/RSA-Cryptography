package sample;

import java.math.BigInteger;

public class CommonFunction {
    public static CommonFunction commonFunction=new CommonFunction();

    private CommonFunction(){

    }

    public static CommonFunction getInstance() {
        return commonFunction;
    }

    public static BigInteger ConvertoBigInt(String s){
        BigInteger res=new BigInteger("0");
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            res=res.multiply(BigInteger.valueOf(256)).add(BigInteger.valueOf((int)c));
        }
        return res;
    }

    public static String ConverttoString(BigInteger p){
        String res = "",rev="";

        while(p.compareTo(new BigInteger("0"))>0) {
            res+= (char)p.mod(new BigInteger("256")).intValue();
            p=p.divide(new BigInteger("256"));
        }

        for(int i=res.length()-1;i>=0;i--){
            rev+=res.charAt(i);
        }
        return rev;
    }

    public static BigInteger powmod(BigInteger a,BigInteger n,BigInteger modu){

        if(n.equals(new BigInteger("0"))){
            return new BigInteger("1").mod(modu);
        }
        else if(n.equals(new BigInteger("1"))){
            return a.mod(modu);
        }
        else{
            BigInteger b=powmod(a,n.divide(new BigInteger("2")),modu);
            b=(b.multiply(b)).mod(modu);
            if(n.mod(new BigInteger("2")).equals(new BigInteger("0"))){
                return b;
            }
            else {
                return (b.multiply(a)).mod(modu);
            }
        }
    }

    private static BigInteger[] ExtendedEuclid(BigInteger a,BigInteger b){
        BigInteger[] all=new BigInteger[2];
        if(b.equals(new BigInteger("0"))){
            all[0]=new BigInteger("1");
            all[1]=new BigInteger("0");
            return all;
        }
        BigInteger[] another;
        another=ExtendedEuclid(b,a.mod(b));
        BigInteger k=a.divide(b);
        BigInteger[] result=new BigInteger[2];
        result[0]=another[1];
        result[1]=another[0].subtract(k.multiply(another[1]));
        return result;
    }

    public static BigInteger InvertModulo(BigInteger a,BigInteger n){
        BigInteger[] all;
        all=ExtendedEuclid(a,n);
        if(all[0].compareTo(new BigInteger("0"))<0){
            all[0]=((all[0].mod(n)).add(n)).mod(n);
        }
        return all[0];
    }

    public static BigInteger encrypt(String message,BigInteger modulo,BigInteger exponent){
        return powmod(ConvertoBigInt(message),exponent,modulo);
    }

    public static String decrypt(BigInteger ciphertext,BigInteger p,BigInteger q,BigInteger exponent){
        BigInteger d=InvertModulo(exponent,(p.subtract(new BigInteger("1"))).multiply(q.subtract(new BigInteger("1"))));
        return ConverttoString(powmod(ciphertext,d,p.multiply(q)));
    }

    public static String deciphersimple(BigInteger ciphertext,BigInteger modulo,BigInteger exponent,String[] potentialmssages){
        for (String potentialmssage : potentialmssages) {
            if (ciphertext.equals(encrypt(potentialmssage, modulo, exponent))) {
                return potentialmssage;
            }
        }
        return null;
    }

    public static String deciphersmallprime(BigInteger ciphertext,BigInteger modulo,BigInteger exponent){
        BigInteger smallprime,bigprime;
        for(BigInteger i=new BigInteger("3");i.compareTo(new BigInteger("1000000"))<0;i=i.add(new BigInteger("1"))){
            if(modulo.mod(i).equals(new BigInteger("0"))){
                smallprime=i;
                bigprime=modulo.divide(i);
                return decrypt(ciphertext,smallprime,bigprime,exponent);
            }
        }
        return null;
    }

    private static BigInteger getSqrt(BigInteger n){
        BigInteger low=new BigInteger("1");
        BigInteger high=n;
        BigInteger iterations=new BigInteger("0");

        while (low.compareTo(high)<0 && iterations.compareTo(new BigInteger("5000"))<0){
            iterations=iterations.add(new BigInteger("1"));
            BigInteger mid=(low.add(high).add(new BigInteger("1"))).divide(new BigInteger("2"));
            if(mid.multiply(mid).compareTo(n)<=0){
                low=mid;
            }else{
                high=mid.subtract(new BigInteger("1"));
            }
        }
        return low;
    }

    public static String deciphersmalldiff(BigInteger ciphertext,BigInteger modulo,BigInteger exponent){

        BigInteger small=new BigInteger("0"),big=new BigInteger("0");
        for(BigInteger i=getSqrt(modulo).subtract(new BigInteger("5000"));
            i.compareTo(getSqrt(modulo).add(new BigInteger("1")))<0;i=i.add(new BigInteger("1"))){
            if(modulo.mod(i).equals(new BigInteger("0"))){
                small=i;
                big=modulo.divide(i);
                break;
            }
        }
        return decrypt(ciphertext,small,big,exponent);
    }

    private static BigInteger GCD(BigInteger a,BigInteger b){
        if(b.equals(new BigInteger("0"))){
            return a;
        }
        return GCD(b,a.mod(b));
    }

    public static String[] decipherCommonDivisor(BigInteger firstciphertext,BigInteger firstmodulo,BigInteger firstexponent,BigInteger secondciphertext,
                                                 BigInteger secondmodulo,BigInteger secondexponent){
        BigInteger commonprime=GCD(firstmodulo,secondmodulo);
        BigInteger q1=firstmodulo.divide(commonprime);
        BigInteger q2=secondmodulo.divide(commonprime);
        String[] all=new String[2];
        all[0]=decrypt(firstciphertext,commonprime,q1,firstexponent);
        all[1]=decrypt(secondciphertext,commonprime,q2,secondexponent);
        return all;
    }

    private static BigInteger chineseRemainder(BigInteger n1,BigInteger r1,BigInteger n2,BigInteger r2){
        BigInteger[] all=ExtendedEuclid(n1,n2);
        BigInteger res1=(r2.multiply(all[0]).multiply(n1).add(r1.multiply(all[1]).multiply(n2))).mod(n1.multiply(n2)).add(n1.multiply(n2));
        return res1.mod(n1.multiply(n2));
    }

    public static String decipherHastad(BigInteger firstcipher,BigInteger firstmodulo,BigInteger secondcipher,BigInteger secondmodulo){
        BigInteger r=chineseRemainder(firstmodulo,firstcipher,secondmodulo,secondcipher);
        return ConverttoString(getSqrt(r));
    }

}
