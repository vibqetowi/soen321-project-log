package x1;

import java.io.File;
/* compiled from: SQLiteCopyOpenHelper.kt */
/* loaded from: classes.dex */
public final class t implements b2.c, c {

    /* renamed from: u  reason: collision with root package name */
    public b f37568u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f37569v;

    @Override // b2.c
    public final b2.b U() {
        if (!this.f37569v) {
            g(true);
            this.f37569v = true;
        }
        throw null;
    }

    @Override // x1.c
    public final b2.c a() {
        return null;
    }

    @Override // b2.c, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        throw null;
    }

    public final void e(File file) {
        throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
    }

    public final void g(boolean z10) {
        if (getDatabaseName() != null) {
            throw null;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // b2.c
    public final String getDatabaseName() {
        throw null;
    }

    @Override // b2.c
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        throw null;
    }
}
