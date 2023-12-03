package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.p;
import androidx.work.q;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import n2.a0;
import v2.j;
import v2.n;
import v2.t;
import v2.x;
import z2.b;
/* compiled from: DiagnosticsWorker.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        i.g(context, "context");
        i.g(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    public final p.a doWork() {
        a0 e10 = a0.e(getApplicationContext());
        i.f(e10, "getInstance(applicationContext)");
        WorkDatabase workDatabase = e10.f25794c;
        i.f(workDatabase, "workManager.workDatabase");
        t u10 = workDatabase.u();
        n s10 = workDatabase.s();
        x v10 = workDatabase.v();
        j r = workDatabase.r();
        ArrayList f = u10.f(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        ArrayList l2 = u10.l();
        ArrayList b10 = u10.b();
        if (!f.isEmpty()) {
            q d10 = q.d();
            String str = b.f39138a;
            d10.e(str, "Recently completed work:\n\n");
            q.d().e(str, b.a(s10, v10, r, f));
        }
        if (!l2.isEmpty()) {
            q d11 = q.d();
            String str2 = b.f39138a;
            d11.e(str2, "Running work:\n\n");
            q.d().e(str2, b.a(s10, v10, r, l2));
        }
        if (!b10.isEmpty()) {
            q d12 = q.d();
            String str3 = b.f39138a;
            d12.e(str3, "Enqueued work:\n\n");
            q.d().e(str3, b.a(s10, v10, r, b10));
        }
        return new p.a.c();
    }
}
