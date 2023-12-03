package nc;

import java.nio.charset.Charset;
/* compiled from: Charsets.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f25986a = Charset.forName("US-ASCII");

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f25987b = Charset.forName("ISO-8859-1");

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f25988c = Charset.forName("UTF-8");

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f25989d;

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f25990e;

    static {
        Charset.forName("UTF-16BE");
        f25989d = Charset.forName("UTF-16LE");
        f25990e = Charset.forName("UTF-16");
    }
}
