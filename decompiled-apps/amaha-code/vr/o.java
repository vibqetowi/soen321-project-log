package vr;

import java.util.ArrayDeque;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import tr.t;
/* compiled from: ChannelTracer.java */
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: d  reason: collision with root package name */
    public static final Logger f35798d = Logger.getLogger(tr.b.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final Object f35799a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final tr.w f35800b;

    /* renamed from: c  reason: collision with root package name */
    public final a f35801c;

    /* compiled from: ChannelTracer.java */
    /* loaded from: classes2.dex */
    public class a extends ArrayDeque<tr.t> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ int f35802u;

        public a(int i6) {
            this.f35802u = i6;
        }

        @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
        public final boolean add(Object obj) {
            tr.t tVar = (tr.t) obj;
            if (size() == this.f35802u) {
                removeFirst();
            }
            o.this.getClass();
            return super.add(tVar);
        }
    }

    public o(tr.w wVar, int i6, long j10, String str) {
        sc.b.w(str, "description");
        this.f35800b = wVar;
        if (i6 > 0) {
            this.f35801c = new a(i6);
        } else {
            this.f35801c = null;
        }
        String concat = str.concat(" created");
        t.a aVar = t.a.CT_INFO;
        Long valueOf = Long.valueOf(j10);
        sc.b.w(concat, "description");
        sc.b.w(valueOf, "timestampNanos");
        b(new tr.t(concat, aVar, valueOf.longValue(), null));
    }

    public static void a(tr.w wVar, Level level, String str) {
        Logger logger = f35798d;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + wVar + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    public final void b(tr.t tVar) {
        Level level;
        int ordinal = tVar.f33573b.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                level = Level.FINEST;
            } else {
                level = Level.FINE;
            }
        } else {
            level = Level.FINER;
        }
        synchronized (this.f35799a) {
            a aVar = this.f35801c;
            if (aVar != null) {
                aVar.add(tVar);
            }
        }
        a(this.f35800b, level, tVar.f33572a);
    }

    public final void c(tr.t tVar) {
        synchronized (this.f35799a) {
            a aVar = this.f35801c;
            if (aVar != null) {
                aVar.add(tVar);
            }
        }
    }
}
