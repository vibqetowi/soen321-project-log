package ew;

import dw.f;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import lv.a0;
import lv.c0;
import lv.v;
import sf.i;
import zv.e;
/* compiled from: GsonRequestBodyConverter.java */
/* loaded from: classes2.dex */
public final class b<T> implements f<T, c0> {

    /* renamed from: c  reason: collision with root package name */
    public static final v f14587c;

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f14588d;

    /* renamed from: a  reason: collision with root package name */
    public final i f14589a;

    /* renamed from: b  reason: collision with root package name */
    public final sf.v<T> f14590b;

    static {
        Pattern pattern = v.f24702d;
        f14587c = v.a.a("application/json; charset=UTF-8");
        f14588d = Charset.forName("UTF-8");
    }

    public b(i iVar, sf.v<T> vVar) {
        this.f14589a = iVar;
        this.f14590b = vVar;
    }

    @Override // dw.f
    public final c0 a(Object obj) {
        e eVar = new e();
        yf.b f = this.f14589a.f(new OutputStreamWriter(new zv.f(eVar), f14588d));
        this.f14590b.b(f, obj);
        f.close();
        zv.i content = eVar.e0();
        kotlin.jvm.internal.i.g(content, "content");
        return new a0(f14587c, content);
    }
}
