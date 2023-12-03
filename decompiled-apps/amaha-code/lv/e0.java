package lv;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
/* compiled from: ResponseBody.kt */
/* loaded from: classes2.dex */
public abstract class e0 implements Closeable {

    /* renamed from: u  reason: collision with root package name */
    public a f24601u;

    /* compiled from: ResponseBody.kt */
    /* loaded from: classes2.dex */
    public static final class a extends Reader {

        /* renamed from: u  reason: collision with root package name */
        public final zv.h f24602u;

        /* renamed from: v  reason: collision with root package name */
        public final Charset f24603v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f24604w;

        /* renamed from: x  reason: collision with root package name */
        public InputStreamReader f24605x;

        public a(zv.h source, Charset charset) {
            kotlin.jvm.internal.i.g(source, "source");
            kotlin.jvm.internal.i.g(charset, "charset");
            this.f24602u = source;
            this.f24603v = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            hs.k kVar;
            this.f24604w = true;
            InputStreamReader inputStreamReader = this.f24605x;
            if (inputStreamReader == null) {
                kVar = null;
            } else {
                inputStreamReader.close();
                kVar = hs.k.f19476a;
            }
            if (kVar == null) {
                this.f24602u.close();
            }
        }

        @Override // java.io.Reader
        public final int read(char[] cbuf, int i6, int i10) {
            kotlin.jvm.internal.i.g(cbuf, "cbuf");
            if (!this.f24604w) {
                InputStreamReader inputStreamReader = this.f24605x;
                if (inputStreamReader == null) {
                    zv.h hVar = this.f24602u;
                    inputStreamReader = new InputStreamReader(hVar.J0(), mv.b.s(hVar, this.f24603v));
                    this.f24605x = inputStreamReader;
                }
                return inputStreamReader.read(cbuf, i6, i10);
            }
            throw new IOException("Stream closed");
        }
    }

    public abstract long a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        mv.b.d(g());
    }

    public abstract v e();

    public abstract zv.h g();

    public final String h() {
        Charset a10;
        zv.h g5 = g();
        try {
            v e10 = e();
            if (e10 == null) {
                a10 = null;
            } else {
                a10 = e10.a(gv.a.f16927b);
            }
            if (a10 == null) {
                a10 = gv.a.f16927b;
            }
            String V = g5.V(mv.b.s(g5, a10));
            ca.a.z(g5, null);
            return V;
        } finally {
        }
    }
}
