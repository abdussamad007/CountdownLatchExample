package com.java.practice.concurrent;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapNullExample {
public static void main(String[] args) {
	HashMap<String, String> map = new HashMap<String, String>();
	Hashtable<String, String> table = new Hashtable<String, String>();
	map.put(null, null); //allowed/
	table.put(null, null);// thrown exception.Hence not allowed
	table.put(null, "val"); //throw exception.Hence not allowed
	table.put("key", null); //throw exception.Hence not allowed
}
}
