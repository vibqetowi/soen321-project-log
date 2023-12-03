package zv;

import java.io.Closeable;
import java.io.Flushable;
/* compiled from: Sink.kt */
/* loaded from: classes2.dex */
public interface x extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    a0 d();

    void flush();

    void n(e eVar, long j10);
}
