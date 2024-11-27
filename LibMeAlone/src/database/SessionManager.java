/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Zeus
 */
public class SessionManager {
    public static Map<String, Object> data = new HashMap<>();
    
    public static void set(String s, Object d) {
        data.put(s, d);
    }
    
    public static Object get(String s) {
        return data.get(s);
    }
    public static void remove(String key) {
        data.remove(key);
    }
    
    public static void clear() {
        data.clear();
    }
    
    public static boolean contains(String key) {
        return data.containsKey(key);
    }
    
}
