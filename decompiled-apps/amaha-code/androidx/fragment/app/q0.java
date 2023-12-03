package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;
/* compiled from: LogWriter.java */
/* loaded from: classes.dex */
public final class q0 extends Writer {

    /* renamed from: v  reason: collision with root package name */
    public final StringBuilder f2271v = new StringBuilder(128);

    /* renamed from: u  reason: collision with root package name */
    public final String f2270u = "FragmentManager";

    public final void a() {
        StringBuilder sb2 = this.f2271v;
        if (sb2.length() > 0) {
            Log.d(this.f2270u, sb2.toString());
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i6, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            char c10 = cArr[i6 + i11];
            if (c10 == '\n') {
                a();
            } else {
                this.f2271v.append(c10);
            }
        }
    }
}
