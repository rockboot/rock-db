package tools;

import java.util.UUID;

public class UUIDGenerator {

    public static String genUUIDWithPrefix(String prefix) {
        return prefix + genUUID();
    }

    public static String genUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
