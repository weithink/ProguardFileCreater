package com.weithink.proguardfile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileUtils {
    public static void appendFile(String file, String conent) {
        BufferedWriter out = null;
        try {
            File fil = new File("app");
            if (!fil.exists()) {
                fil.mkdir();
            }
            out = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(fil.getAbsolutePath()+"/"+file, true)));
            out.write(conent + "\r\n");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
