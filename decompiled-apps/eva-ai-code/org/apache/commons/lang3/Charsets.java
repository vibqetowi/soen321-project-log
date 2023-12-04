package org.apache.commons.lang3;

import java.nio.charset.Charset;
/* loaded from: classes5.dex */
class Charsets {
    Charsets() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Charset toCharset(Charset charset) {
        return charset == null ? Charset.defaultCharset() : charset;
    }

    static Charset toCharset(String str) {
        return str == null ? Charset.defaultCharset() : Charset.forName(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String toCharsetName(String str) {
        return str == null ? Charset.defaultCharset().name() : str;
    }
}
