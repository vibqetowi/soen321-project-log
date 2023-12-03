package gv;

import java.nio.charset.Charset;
/* compiled from: Charsets.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f16926a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f16927b;

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f16928c;

    /* renamed from: d  reason: collision with root package name */
    public static Charset f16929d;

    /* renamed from: e  reason: collision with root package name */
    public static Charset f16930e;

    static {
        Charset forName = Charset.forName("UTF-8");
        kotlin.jvm.internal.i.f(forName, "forName(\"UTF-8\")");
        f16927b = forName;
        kotlin.jvm.internal.i.f(Charset.forName("UTF-16"), "forName(\"UTF-16\")");
        kotlin.jvm.internal.i.f(Charset.forName("UTF-16BE"), "forName(\"UTF-16BE\")");
        kotlin.jvm.internal.i.f(Charset.forName("UTF-16LE"), "forName(\"UTF-16LE\")");
        Charset forName2 = Charset.forName("US-ASCII");
        kotlin.jvm.internal.i.f(forName2, "forName(\"US-ASCII\")");
        f16928c = forName2;
        kotlin.jvm.internal.i.f(Charset.forName("ISO-8859-1"), "forName(\"ISO-8859-1\")");
    }
}
