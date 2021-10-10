package com.fobgochod.common;

import org.springframework.cglib.core.DebuggingClassWriter;

import java.lang.reflect.Field;
import java.util.Properties;

/**
 * CGlibUtils.java
 *
 * @author Xiao
 * @date 2021/10/4 17:36
 */
public class CGlibUtils {

    /**
     * 保存代理字节码文件
     *
     * @param dir 保存文件路径
     */
    public static void generatedCGlibProxyFiles(String dir) throws Exception {
        Field field = System.class.getDeclaredField("props");
        field.setAccessible(true);
        Properties props = (Properties) field.get(null);
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, System.getProperty("user.dir") + "/spring/build/proxy/" + dir);
        props.put("net.sf.cglib.core.DebuggingClassWriter.traceEnabled", "true");
    }
}
