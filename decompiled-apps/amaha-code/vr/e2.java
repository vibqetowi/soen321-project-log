package vr;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
/* compiled from: ManagedChannelOrphanWrapper.java */
/* loaded from: classes2.dex */
public final class e2 extends r0 {

    /* renamed from: d  reason: collision with root package name */
    public static final ReferenceQueue<e2> f35548d = new ReferenceQueue<>();

    /* renamed from: e  reason: collision with root package name */
    public static final ConcurrentHashMap f35549e = new ConcurrentHashMap();
    public static final Logger f = Logger.getLogger(e2.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public final a f35550c;

    /* compiled from: ManagedChannelOrphanWrapper.java */
    /* loaded from: classes2.dex */
    public static final class a extends WeakReference<e2> {
        public static final boolean f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));

        /* renamed from: g  reason: collision with root package name */
        public static final RuntimeException f35551g;

        /* renamed from: a  reason: collision with root package name */
        public final ReferenceQueue<e2> f35552a;

        /* renamed from: b  reason: collision with root package name */
        public final ConcurrentMap<a, a> f35553b;

        /* renamed from: c  reason: collision with root package name */
        public final String f35554c;

        /* renamed from: d  reason: collision with root package name */
        public final SoftReference f35555d;

        /* renamed from: e  reason: collision with root package name */
        public final AtomicBoolean f35556e;

        static {
            RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
            runtimeException.setStackTrace(new StackTraceElement[0]);
            f35551g = runtimeException;
        }

        public a(e2 e2Var, q1 q1Var, ReferenceQueue referenceQueue, ConcurrentHashMap concurrentHashMap) {
            super(e2Var, referenceQueue);
            RuntimeException runtimeException;
            this.f35556e = new AtomicBoolean();
            if (f) {
                runtimeException = new RuntimeException("ManagedChannel allocation site");
            } else {
                runtimeException = f35551g;
            }
            this.f35555d = new SoftReference(runtimeException);
            this.f35554c = q1Var.toString();
            this.f35552a = referenceQueue;
            this.f35553b = concurrentHashMap;
            concurrentHashMap.put(this, this);
            a(referenceQueue);
        }

        public static void a(ReferenceQueue referenceQueue) {
            while (true) {
                a aVar = (a) referenceQueue.poll();
                if (aVar != null) {
                    SoftReference softReference = aVar.f35555d;
                    RuntimeException runtimeException = (RuntimeException) softReference.get();
                    super.clear();
                    aVar.f35553b.remove(aVar);
                    softReference.clear();
                    if (!aVar.f35556e.get()) {
                        Level level = Level.SEVERE;
                        Logger logger = e2.f;
                        if (logger.isLoggable(level)) {
                            LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was not shutdown properly!!! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow() and wait until awaitTermination() returns true.");
                            logRecord.setLoggerName(logger.getName());
                            logRecord.setParameters(new Object[]{aVar.f35554c});
                            logRecord.setThrown(runtimeException);
                            logger.log(logRecord);
                        }
                    }
                } else {
                    return;
                }
            }
        }

        @Override // java.lang.ref.Reference
        public final void clear() {
            super.clear();
            this.f35553b.remove(this);
            this.f35555d.clear();
            a(this.f35552a);
        }
    }

    public e2() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(q1 q1Var) {
        super(q1Var);
        ReferenceQueue<e2> referenceQueue = f35548d;
        ConcurrentHashMap concurrentHashMap = f35549e;
        this.f35550c = new a(this, q1Var, referenceQueue, concurrentHashMap);
    }

    @Override // tr.b0
    public final tr.b0 G() {
        a aVar = this.f35550c;
        if (!aVar.f35556e.getAndSet(true)) {
            aVar.clear();
        }
        return this.f35944b.G();
    }
}
