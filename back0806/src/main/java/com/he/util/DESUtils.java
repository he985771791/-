package com.he.util;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;

import com.thoughtworks.xstream.core.util.Base64Encoder;
/**
 * 
 * @类名：DESUtils
 * @描述：base64加密程序
 * @作者：张赫赫
 * @日期：2018年8月13日 上午8:32:07
 */
public class DESUtils {
	public static Key KEY=null;
	public static String KEY_STRING="abc";
	static{//静态代码块儿只执行一次
		try {
			KeyGenerator generator = KeyGenerator.getInstance("DES");
			SecureRandom random=SecureRandom.getInstance("SHA1PRNG");
			random.setSeed(KEY_STRING.getBytes());
			generator.init(random);
			KEY=generator.generateKey();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String encode(String in){//加密
		Base64Encoder encoder=new Base64Encoder();
		String out=null;
		try {
			Cipher cipher=Cipher.getInstance("DES");
			cipher.init(Cipher.ENCRYPT_MODE, KEY);
			out= encoder.encode(cipher.doFinal(in.getBytes()));
			
		} catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return out;
	}
	public static String decode(String in){//解密
		Base64Encoder encoder=new Base64Encoder();
		String out=null;
		try {
			Cipher cipher=Cipher.getInstance("DES");
			cipher.init(Cipher.DECRYPT_MODE, KEY);
			out=new String(cipher.doFinal(encoder.decode(in)));
			
		} catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return out;
	}
	public static void main(String[] args) {
		String username="root";
		System.out.println(encode(username));
		System.out.println(decode("bJFTW4dSt8w="));
		System.out.println(encode("123456"));
		System.out.println(decode("67pD7puy6t8="));
	}
}
