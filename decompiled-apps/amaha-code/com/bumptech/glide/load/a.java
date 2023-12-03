package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.util.List;
import l4.b;
import r4.p;
/* compiled from: ImageHeaderParserUtils.java */
/* loaded from: classes.dex */
public final class a {
    public static int a(b bVar, InputStream inputStream, List list) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new p(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            try {
                int c10 = ((ImageHeaderParser) list.get(i6)).c(inputStream, bVar);
                if (c10 != -1) {
                    return c10;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType b(b bVar, InputStream inputStream, List list) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new p(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            try {
                ImageHeaderParser.ImageType b10 = ((ImageHeaderParser) list.get(i6)).b(inputStream);
                inputStream.reset();
                if (b10 != ImageHeaderParser.ImageType.UNKNOWN) {
                    return b10;
                }
            } catch (Throwable th2) {
                inputStream.reset();
                throw th2;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
