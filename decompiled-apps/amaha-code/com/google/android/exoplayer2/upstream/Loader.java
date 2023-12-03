package com.google.android.exoplayer2.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import c9.w;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.source.m;
import com.google.android.exoplayer2.source.p;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import s1.s;
import u7.h;
/* loaded from: classes.dex */
public final class Loader {

    /* renamed from: d  reason: collision with root package name */
    public static final b f7159d = new b(2, -9223372036854775807L);

    /* renamed from: e  reason: collision with root package name */
    public static final b f7160e = new b(3, -9223372036854775807L);

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f7161a;

    /* renamed from: b  reason: collision with root package name */
    public c<? extends d> f7162b;

    /* renamed from: c  reason: collision with root package name */
    public IOException f7163c;

    /* loaded from: classes.dex */
    public static final class UnexpectedLoaderException extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public UnexpectedLoaderException(Throwable th2) {
            super(r3.toString(), th2);
            String simpleName = th2.getClass().getSimpleName();
            String message = th2.getMessage();
            StringBuilder sb2 = new StringBuilder(ri.e.c(message, simpleName.length() + 13));
            sb2.append("Unexpected ");
            sb2.append(simpleName);
            sb2.append(": ");
            sb2.append(message);
        }
    }

    /* loaded from: classes.dex */
    public interface a<T extends d> {
        void a(T t3, long j10, long j11, boolean z10);

        void b(T t3, long j10, long j11);

        b j(T t3, long j10, long j11, IOException iOException, int i6);
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f7164a;

        /* renamed from: b  reason: collision with root package name */
        public final long f7165b;

        public b(int i6, long j10) {
            this.f7164a = i6;
            this.f7165b = j10;
        }
    }

    /* loaded from: classes.dex */
    public final class c<T extends d> extends Handler implements Runnable {
        public Thread A;
        public boolean B;
        public volatile boolean C;

        /* renamed from: u  reason: collision with root package name */
        public final int f7166u;

        /* renamed from: v  reason: collision with root package name */
        public final T f7167v;

        /* renamed from: w  reason: collision with root package name */
        public final long f7168w;

        /* renamed from: x  reason: collision with root package name */
        public a<T> f7169x;

        /* renamed from: y  reason: collision with root package name */
        public IOException f7170y;

        /* renamed from: z  reason: collision with root package name */
        public int f7171z;

        public c(Looper looper, T t3, a<T> aVar, int i6, long j10) {
            super(looper);
            this.f7167v = t3;
            this.f7169x = aVar;
            this.f7166u = i6;
            this.f7168w = j10;
        }

        public final void a(boolean z10) {
            this.C = z10;
            this.f7170y = null;
            if (hasMessages(0)) {
                this.B = true;
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.B = true;
                    this.f7167v.b();
                    Thread thread = this.A;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z10) {
                Loader.this.f7162b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                a<T> aVar = this.f7169x;
                aVar.getClass();
                aVar.a(this.f7167v, elapsedRealtime, elapsedRealtime - this.f7168w, true);
                this.f7169x = null;
            }
        }

        public final void b(long j10) {
            boolean z10;
            Loader loader = Loader.this;
            if (loader.f7162b == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            sc.b.C(z10);
            loader.f7162b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
                return;
            }
            this.f7170y = null;
            ExecutorService executorService = loader.f7161a;
            c<? extends d> cVar = loader.f7162b;
            cVar.getClass();
            executorService.execute(cVar);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.C) {
                return;
            }
            int i6 = message.what;
            if (i6 == 0) {
                this.f7170y = null;
                Loader loader = Loader.this;
                ExecutorService executorService = loader.f7161a;
                c<? extends d> cVar = loader.f7162b;
                cVar.getClass();
                executorService.execute(cVar);
            } else if (i6 != 3) {
                Loader.this.f7162b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.f7168w;
                a<T> aVar = this.f7169x;
                aVar.getClass();
                if (this.B) {
                    aVar.a(this.f7167v, elapsedRealtime, j10, false);
                    return;
                }
                int i10 = message.what;
                if (i10 != 1) {
                    if (i10 == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.f7170y = iOException;
                        int i11 = this.f7171z + 1;
                        this.f7171z = i11;
                        b j11 = aVar.j(this.f7167v, elapsedRealtime, j10, iOException, i11);
                        int i12 = j11.f7164a;
                        if (i12 == 3) {
                            Loader.this.f7163c = this.f7170y;
                            return;
                        } else if (i12 != 2) {
                            if (i12 == 1) {
                                this.f7171z = 1;
                            }
                            long j12 = j11.f7165b;
                            if (j12 == -9223372036854775807L) {
                                j12 = Math.min((this.f7171z - 1) * 1000, 5000);
                            }
                            b(j12);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                try {
                    aVar.b(this.f7167v, elapsedRealtime, j10);
                } catch (RuntimeException e10) {
                    ca.a.Q("LoadTask", "Unexpected exception handling load completed", e10);
                    Loader.this.f7163c = new UnexpectedLoaderException(e10);
                }
            } else {
                throw ((Error) message.obj);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            String str;
            try {
                synchronized (this) {
                    if (!this.B) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.A = Thread.currentThread();
                }
                if (z10) {
                    String simpleName = this.f7167v.getClass().getSimpleName();
                    if (simpleName.length() != 0) {
                        str = "load:".concat(simpleName);
                    } else {
                        str = new String("load:");
                    }
                    kc.f.j(str);
                    try {
                        this.f7167v.a();
                        kc.f.B();
                    } catch (Throwable th2) {
                        kc.f.B();
                        throw th2;
                    }
                }
                synchronized (this) {
                    this.A = null;
                    Thread.interrupted();
                }
                if (!this.C) {
                    sendEmptyMessage(1);
                }
            } catch (IOException e10) {
                if (!this.C) {
                    obtainMessage(2, e10).sendToTarget();
                }
            } catch (Error e11) {
                if (!this.C) {
                    ca.a.Q("LoadTask", "Unexpected error loading stream", e11);
                    obtainMessage(3, e11).sendToTarget();
                }
                throw e11;
            } catch (Exception e12) {
                if (!this.C) {
                    ca.a.Q("LoadTask", "Unexpected exception loading stream", e12);
                    obtainMessage(2, new UnexpectedLoaderException(e12)).sendToTarget();
                }
            } catch (OutOfMemoryError e13) {
                if (!this.C) {
                    ca.a.Q("LoadTask", "OutOfMemory error loading stream", e13);
                    obtainMessage(2, new UnexpectedLoaderException(e13)).sendToTarget();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();

        void b();
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    /* loaded from: classes.dex */
    public static final class f implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final e f7172u;

        public f(e eVar) {
            this.f7172u = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            p[] pVarArr;
            m mVar = (m) this.f7172u;
            for (p pVar : mVar.M) {
                pVar.p(true);
                DrmSession drmSession = pVar.f6981i;
                if (drmSession != null) {
                    drmSession.b(pVar.f6978e);
                    pVar.f6981i = null;
                    pVar.f6980h = null;
                }
            }
            s sVar = (s) mVar.F;
            h hVar = (h) sVar.f31225w;
            if (hVar != null) {
                hVar.a();
                sVar.f31225w = null;
            }
            sVar.f31226x = null;
        }
    }

    public Loader(String str) {
        String str2;
        if (str.length() != 0) {
            str2 = "ExoPlayer:Loader:".concat(str);
        } else {
            str2 = new String("ExoPlayer:Loader:");
        }
        int i6 = w.f5205a;
        this.f7161a = Executors.newSingleThreadExecutor(new androidx.emoji2.text.a(str2, 1));
    }

    public final boolean a() {
        if (this.f7162b != null) {
            return true;
        }
        return false;
    }

    public final <T extends d> long b(T t3, a<T> aVar, int i6) {
        Looper myLooper = Looper.myLooper();
        sc.b.E(myLooper);
        this.f7163c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new c(myLooper, t3, aVar, i6, elapsedRealtime).b(0L);
        return elapsedRealtime;
    }
}
