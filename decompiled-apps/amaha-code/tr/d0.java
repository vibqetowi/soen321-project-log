package tr;

import com.google.protobuf.q0;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;
import nc.f;
/* compiled from: MethodDescriptor.java */
/* loaded from: classes2.dex */
public final class d0<ReqT, RespT> {

    /* renamed from: a  reason: collision with root package name */
    public final b f33450a;

    /* renamed from: b  reason: collision with root package name */
    public final String f33451b;

    /* renamed from: c  reason: collision with root package name */
    public final String f33452c;

    /* renamed from: d  reason: collision with root package name */
    public final a<ReqT> f33453d;

    /* renamed from: e  reason: collision with root package name */
    public final a<RespT> f33454e;
    public final Object f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f33455g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f33456h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f33457i;

    /* compiled from: MethodDescriptor.java */
    /* loaded from: classes2.dex */
    public interface a<T> {
        q0 a(InputStream inputStream);

        as.a b(Object obj);
    }

    /* compiled from: MethodDescriptor.java */
    /* loaded from: classes2.dex */
    public enum b {
        UNARY,
        /* JADX INFO: Fake field, exist only in values array */
        CLIENT_STREAMING,
        SERVER_STREAMING,
        BIDI_STREAMING,
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN
    }

    public d0(b bVar, String str, a aVar, a aVar2, boolean z10) {
        String substring;
        new AtomicReferenceArray(2);
        sc.b.w(bVar, "type");
        this.f33450a = bVar;
        sc.b.w(str, "fullMethodName");
        this.f33451b = str;
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf == -1) {
            substring = null;
        } else {
            substring = str.substring(0, lastIndexOf);
        }
        this.f33452c = substring;
        sc.b.w(aVar, "requestMarshaller");
        this.f33453d = aVar;
        sc.b.w(aVar2, "responseMarshaller");
        this.f33454e = aVar2;
        this.f = null;
        this.f33455g = false;
        this.f33456h = false;
        this.f33457i = z10;
    }

    public static String a(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sc.b.w(str, "fullServiceName");
        sb2.append(str);
        sb2.append("/");
        sc.b.w(str2, "methodName");
        sb2.append(str2);
        return sb2.toString();
    }

    public final String toString() {
        f.a c10 = nc.f.c(this);
        c10.c(this.f33451b, "fullMethodName");
        c10.c(this.f33450a, "type");
        c10.d("idempotent", this.f33455g);
        c10.d("safe", this.f33456h);
        c10.d("sampledToLocalTracing", this.f33457i);
        c10.c(this.f33453d, "requestMarshaller");
        c10.c(this.f33454e, "responseMarshaller");
        c10.c(this.f, "schemaDescriptor");
        c10.f25996d = true;
        return c10.toString();
    }
}
