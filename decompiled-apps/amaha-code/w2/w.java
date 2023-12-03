package w2;

import androidx.work.impl.WorkDatabase;
/* compiled from: WorkForegroundUpdater.java */
/* loaded from: classes.dex */
public final class w implements androidx.work.h {

    /* renamed from: a  reason: collision with root package name */
    public final y2.a f36338a;

    /* renamed from: b  reason: collision with root package name */
    public final u2.a f36339b;

    /* renamed from: c  reason: collision with root package name */
    public final v2.t f36340c;

    static {
        androidx.work.q.f("WMFgUpdater");
    }

    public w(WorkDatabase workDatabase, u2.a aVar, y2.a aVar2) {
        this.f36339b = aVar;
        this.f36338a = aVar2;
        this.f36340c = workDatabase.u();
    }
}
