package com.bugsnag.android;

import java.io.Closeable;
import java.io.File;
import java.io.Reader;
import java.io.Writer;
/* loaded from: classes.dex */
class IOUtils {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int EOF = -1;

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static int copy(Reader reader, Writer writer) {
        char[] cArr = new char[DEFAULT_BUFFER_SIZE];
        long j10 = 0;
        while (true) {
            int read = reader.read(cArr);
            if (-1 == read) {
                break;
            }
            writer.write(cArr, 0, read);
            j10 += read;
        }
        if (j10 > 2147483647L) {
            return -1;
        }
        return (int) j10;
    }

    public static void deleteFile(File file, Logger logger) {
        try {
            if (!file.delete()) {
                file.deleteOnExit();
            }
        } catch (Exception e10) {
            logger.w("Failed to delete file", e10);
        }
    }
}
