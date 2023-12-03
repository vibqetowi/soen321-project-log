package yg;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import com.moengage.core.internal.data.reports.DataSyncJob;
import hh.g;
import java.util.LinkedHashMap;
/* compiled from: SyncHandler.kt */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f38559a = new Object();

    /* compiled from: SyncHandler.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            d0.this.getClass();
            return kotlin.jvm.internal.i.n(" onAppClose() : ", "Core_SyncHandler");
        }
    }

    /* compiled from: SyncHandler.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f38562v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.f38562v = str;
        }

        @Override // ss.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Core_SyncHandler scheduleBackgroundSyncIfRequired() : SyncType: ");
            d0.this.getClass();
            sb2.append(this.f38562v);
            return sb2.toString();
        }
    }

    /* compiled from: SyncHandler.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ com.google.android.gms.internal.p000firebaseauthapi.z f38564v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.google.android.gms.internal.p000firebaseauthapi.z zVar) {
            super(0);
            this.f38564v = zVar;
        }

        @Override // ss.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Core_SyncHandler scheduleDataSendingJob() : Sync Meta ");
            d0.this.getClass();
            sb2.append(this.f38564v);
            return sb2.toString();
        }
    }

    /* compiled from: SyncHandler.kt */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ int f38566v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i6) {
            super(0);
            this.f38566v = i6;
        }

        @Override // ss.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Core_SyncHandler scheduleDataSendingJob() : Schedule Result: ");
            d0.this.getClass();
            sb2.append(this.f38566v);
            return sb2.toString();
        }
    }

    public final void a(Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        synchronized (this.f38559a) {
            hh.a aVar = hh.g.f17610d;
            g.a.b(0, new a(), 3);
            g.a.b(0, new e0(this), 3);
            c(context, new com.google.android.gms.internal.p000firebaseauthapi.z("SYNC_TYPE_APP_BACKGROUND_SYNC", 3L, 90001));
            b(context, "SYNC_TYPE_PERIODIC_BACKGROUND_SYNC");
            hs.k kVar = hs.k.f19476a;
        }
    }

    public final void b(Context context, String str) {
        int i6;
        long j10;
        kotlin.jvm.internal.i.g(context, "context");
        hh.a aVar = hh.g.f17610d;
        g.a.b(0, new b(str), 3);
        LinkedHashMap sdkInstances = qg.g0.f29557b;
        kotlin.jvm.internal.i.g(sdkInstances, "sdkInstances");
        for (ih.p pVar : sdkInstances.values()) {
            pVar.f20103b.f12862i.getClass();
        }
        LinkedHashMap sdkInstances2 = qg.g0.f29557b;
        kotlin.jvm.internal.i.g(sdkInstances2, "sdkInstances");
        kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
        for (ih.p pVar2 : sdkInstances2.values()) {
            long j11 = wVar.f23468u;
            if (kotlin.jvm.internal.i.b(str, "SYNC_TYPE_BACKGROUND_MODE_PERIODIC_SYNC")) {
                j10 = pVar2.f20104c.f33012c.f28436l;
            } else {
                j10 = pVar2.f20104c.f33012c.f28426a;
            }
            wVar.f23468u = Math.max(j11, j10);
        }
        hh.a aVar2 = hh.g.f17610d;
        g.a.b(0, new ug.f(wVar), 3);
        long j12 = wVar.f23468u;
        g.a.b(0, new f0(this, str), 3);
        if (kotlin.jvm.internal.i.b(str, "SYNC_TYPE_BACKGROUND_MODE_PERIODIC_SYNC")) {
            i6 = 90005;
        } else {
            i6 = 90003;
        }
        c(context, new com.google.android.gms.internal.p000firebaseauthapi.z(str, j12, i6));
    }

    public final void c(Context context, com.google.android.gms.internal.p000firebaseauthapi.z zVar) {
        hh.a aVar = hh.g.f17610d;
        g.a.b(0, new c(zVar), 3);
        JobInfo.Builder builder = new JobInfo.Builder(zVar.f8264b, new ComponentName(context, DataSyncJob.class));
        long j10 = 1000;
        builder.setRequiredNetworkType(1).setOverrideDeadline(zVar.f8265c * 2 * j10).setMinimumLatency(zVar.f8265c * j10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("sync_type", (String) zVar.f8266d);
        PersistableBundle persistableBundle2 = (PersistableBundle) zVar.f8267e;
        if (persistableBundle2 != null) {
            persistableBundle.putAll(persistableBundle2);
        }
        builder.setExtras(persistableBundle);
        Object systemService = context.getSystemService("jobscheduler");
        if (systemService != null) {
            g.a.b(0, new d(((JobScheduler) systemService).schedule(builder.build())), 3);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.job.JobScheduler");
    }
}
