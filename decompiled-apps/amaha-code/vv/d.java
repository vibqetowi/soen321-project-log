package vv;

import android.util.Log;
import gv.r;
import gv.s;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
/* compiled from: AndroidLog.kt */
/* loaded from: classes2.dex */
public final class d extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public static final d f36167a = new d();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord record) {
        int i6;
        int min;
        kotlin.jvm.internal.i.g(record, "record");
        CopyOnWriteArraySet<Logger> copyOnWriteArraySet = c.f36165a;
        String loggerName = record.getLoggerName();
        kotlin.jvm.internal.i.f(loggerName, "record.loggerName");
        if (record.getLevel().intValue() > Level.INFO.intValue()) {
            i6 = 5;
        } else if (record.getLevel().intValue() == Level.INFO.intValue()) {
            i6 = 4;
        } else {
            i6 = 3;
        }
        String message = record.getMessage();
        kotlin.jvm.internal.i.f(message, "record.message");
        Throwable thrown = record.getThrown();
        String str = c.f36166b.get(loggerName);
        if (str == null) {
            str = s.k1(23, loggerName);
        }
        if (Log.isLoggable(str, i6)) {
            if (thrown != null) {
                message = message + '\n' + ((Object) Log.getStackTraceString(thrown));
            }
            int length = message.length();
            int i10 = 0;
            while (i10 < length) {
                int N0 = r.N0(message, '\n', i10, false, 4);
                if (N0 == -1) {
                    N0 = length;
                }
                while (true) {
                    min = Math.min(N0, i10 + 4000);
                    String substring = message.substring(i10, min);
                    kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i6, str, substring);
                    if (min >= N0) {
                        break;
                    }
                    i10 = min;
                }
                i10 = min + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
