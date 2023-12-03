package io.grpc;

import io.grpc.c;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import nc.f;
/* compiled from: CallOptions.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: k  reason: collision with root package name */
    public static final b f20431k;

    /* renamed from: a  reason: collision with root package name */
    public final tr.m f20432a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f20433b;

    /* renamed from: c  reason: collision with root package name */
    public final String f20434c;

    /* renamed from: d  reason: collision with root package name */
    public final tr.a f20435d;

    /* renamed from: e  reason: collision with root package name */
    public final String f20436e;
    public final Object[][] f;

    /* renamed from: g  reason: collision with root package name */
    public final List<c.a> f20437g;

    /* renamed from: h  reason: collision with root package name */
    public final Boolean f20438h;

    /* renamed from: i  reason: collision with root package name */
    public final Integer f20439i;

    /* renamed from: j  reason: collision with root package name */
    public final Integer f20440j;

    /* compiled from: CallOptions.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public tr.m f20441a;

        /* renamed from: b  reason: collision with root package name */
        public Executor f20442b;

        /* renamed from: c  reason: collision with root package name */
        public String f20443c;

        /* renamed from: d  reason: collision with root package name */
        public tr.a f20444d;

        /* renamed from: e  reason: collision with root package name */
        public String f20445e;
        public Object[][] f;

        /* renamed from: g  reason: collision with root package name */
        public List<c.a> f20446g;

        /* renamed from: h  reason: collision with root package name */
        public Boolean f20447h;

        /* renamed from: i  reason: collision with root package name */
        public Integer f20448i;

        /* renamed from: j  reason: collision with root package name */
        public Integer f20449j;
    }

    /* compiled from: CallOptions.java */
    /* renamed from: io.grpc.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0308b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f20450a;

        public C0308b(String str) {
            this.f20450a = str;
        }

        public final String toString() {
            return this.f20450a;
        }
    }

    static {
        a aVar = new a();
        aVar.f = (Object[][]) Array.newInstance(Object.class, 0, 2);
        aVar.f20446g = Collections.emptyList();
        f20431k = new b(aVar);
    }

    public b(a aVar) {
        this.f20432a = aVar.f20441a;
        this.f20433b = aVar.f20442b;
        this.f20434c = aVar.f20443c;
        this.f20435d = aVar.f20444d;
        this.f20436e = aVar.f20445e;
        this.f = aVar.f;
        this.f20437g = aVar.f20446g;
        this.f20438h = aVar.f20447h;
        this.f20439i = aVar.f20448i;
        this.f20440j = aVar.f20449j;
    }

    public static a b(b bVar) {
        a aVar = new a();
        aVar.f20441a = bVar.f20432a;
        aVar.f20442b = bVar.f20433b;
        aVar.f20443c = bVar.f20434c;
        aVar.f20444d = bVar.f20435d;
        aVar.f20445e = bVar.f20436e;
        aVar.f = bVar.f;
        aVar.f20446g = bVar.f20437g;
        aVar.f20447h = bVar.f20438h;
        aVar.f20448i = bVar.f20439i;
        aVar.f20449j = bVar.f20440j;
        return aVar;
    }

    public final <T> T a(C0308b<T> c0308b) {
        sc.b.w(c0308b, "key");
        int i6 = 0;
        while (true) {
            Object[][] objArr = this.f;
            if (i6 < objArr.length) {
                if (c0308b.equals(objArr[i6][0])) {
                    return (T) objArr[i6][1];
                }
                i6++;
            } else {
                return null;
            }
        }
    }

    public final <T> b c(C0308b<T> c0308b, T t3) {
        Object[][] objArr;
        int i6;
        sc.b.w(c0308b, "key");
        a b10 = b(this);
        int i10 = 0;
        while (true) {
            objArr = this.f;
            if (i10 < objArr.length) {
                if (c0308b.equals(objArr[i10][0])) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        int length = objArr.length;
        if (i10 == -1) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance(Object.class, length + i6, 2);
        b10.f = objArr2;
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        if (i10 == -1) {
            Object[][] objArr3 = b10.f;
            int length2 = objArr.length;
            Object[] objArr4 = new Object[2];
            objArr4[0] = c0308b;
            objArr4[1] = t3;
            objArr3[length2] = objArr4;
        } else {
            Object[][] objArr5 = b10.f;
            Object[] objArr6 = new Object[2];
            objArr6[0] = c0308b;
            objArr6[1] = t3;
            objArr5[i10] = objArr6;
        }
        return new b(b10);
    }

    public final String toString() {
        Class<?> cls;
        f.a c10 = nc.f.c(this);
        c10.c(this.f20432a, "deadline");
        c10.c(this.f20434c, "authority");
        c10.c(this.f20435d, "callCredentials");
        Executor executor = this.f20433b;
        if (executor != null) {
            cls = executor.getClass();
        } else {
            cls = null;
        }
        c10.c(cls, "executor");
        c10.c(this.f20436e, "compressorName");
        c10.c(Arrays.deepToString(this.f), "customOptions");
        c10.d("waitForReady", Boolean.TRUE.equals(this.f20438h));
        c10.c(this.f20439i, "maxInboundMessageSize");
        c10.c(this.f20440j, "maxOutboundMessageSize");
        c10.c(this.f20437g, "streamTracerFactories");
        return c10.toString();
    }
}
