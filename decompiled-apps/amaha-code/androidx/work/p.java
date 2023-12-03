package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
/* compiled from: ListenableWorker.java */
/* loaded from: classes.dex */
public abstract class p {
    private Context mAppContext;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    /* compiled from: ListenableWorker.java */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* compiled from: ListenableWorker.java */
        /* renamed from: androidx.work.p$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0043a extends a {

            /* renamed from: a  reason: collision with root package name */
            public final d f3331a = d.f3235c;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && C0043a.class == obj.getClass()) {
                    return this.f3331a.equals(((C0043a) obj).f3331a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f3331a.hashCode() + (C0043a.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Failure {mOutputData=" + this.f3331a + '}';
            }
        }

        /* compiled from: ListenableWorker.java */
        /* loaded from: classes.dex */
        public static final class b extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && b.class == obj.getClass()) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return b.class.getName().hashCode();
            }

            public final String toString() {
                return "Retry";
            }
        }

        /* compiled from: ListenableWorker.java */
        /* loaded from: classes.dex */
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            public final d f3332a;

            public c() {
                this(d.f3235c);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && c.class == obj.getClass()) {
                    return this.f3332a.equals(((c) obj).f3332a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f3332a.hashCode() + (c.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Success {mOutputData=" + this.f3332a + '}';
            }

            public c(d dVar) {
                this.f3332a = dVar;
            }
        }
    }

    public p(Context context, WorkerParameters workerParameters) {
        if (context != null) {
            if (workerParameters != null) {
                this.mAppContext = context;
                this.mWorkerParams = workerParameters;
                return;
            }
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        throw new IllegalArgumentException("Application Context is null");
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f;
    }

    public rc.b<g> getForegroundInfoAsync() {
        x2.c cVar = new x2.c();
        cVar.j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return cVar;
    }

    public final UUID getId() {
        return this.mWorkerParams.f3200a;
    }

    public final d getInputData() {
        return this.mWorkerParams.f3201b;
    }

    public final Network getNetwork() {
        return this.mWorkerParams.f3203d.f3211c;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.f3204e;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.f3202c;
    }

    public y2.a getTaskExecutor() {
        return this.mWorkerParams.f3205g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.f3203d.f3209a;
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.f3203d.f3210b;
    }

    public y getWorkerFactory() {
        return this.mWorkerParams.f3206h;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public final rc.b<Void> setForegroundAsync(g gVar) {
        h hVar = this.mWorkerParams.f3208j;
        Context applicationContext = getApplicationContext();
        UUID id2 = getId();
        w2.w wVar = (w2.w) hVar;
        wVar.getClass();
        x2.c cVar = new x2.c();
        ((y2.b) wVar.f36338a).a(new w2.v(wVar, cVar, id2, gVar, applicationContext));
        return cVar;
    }

    public rc.b<Void> setProgressAsync(d dVar) {
        t tVar = this.mWorkerParams.f3207i;
        getApplicationContext();
        UUID id2 = getId();
        w2.y yVar = (w2.y) tVar;
        yVar.getClass();
        x2.c cVar = new x2.c();
        ((y2.b) yVar.f36347b).a(new w2.x(yVar, id2, dVar, cVar));
        return cVar;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract rc.b<a> startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }

    public void onStopped() {
    }
}
