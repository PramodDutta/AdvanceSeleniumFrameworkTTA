package com.tta.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public class PropertyReaderOptimized {

    PropertyReaderOptimized() {

    }

    static FileInputStream fileInputStream = null;
    static Properties p = null;
    static Map<String, String> PROP_KEYS = new HashMap<>();

    static {
        try {
            fileInputStream = new FileInputStream(new File(System.getProperty("user.dir") + "/src/main/resources/data.properties"));
            p = new Properties();
            p.load(fileInputStream);
            for (Object key : p.keySet()) {
                PROP_KEYS.put(String.valueOf(key), p.getProperty(String.valueOf(key)));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (Objects.nonNull(fileInputStream)) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static String readKeyO(String key) throws Exception {
        if (key == null && p.getProperty(key) == null) {
            throw new Exception(p.getProperty(key) + " not found!!");
        } else {
            return PROP_KEYS.get(key);
        }
    }

    public static String readKey(String key) throws Exception {
        if (p.getProperty(key) == null) {
            throw new Exception(p.getProperty(key) + " not found!!");
        } else {
            return p.getProperty(key);
        }

    }

}
