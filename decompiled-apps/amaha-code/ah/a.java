package ah;

import ah.f;
import ss.l;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f545u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ e f546v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ l f547w;

    public /* synthetic */ a(e eVar, f.e eVar2, int i6) {
        this.f545u = i6;
        this.f546v = eVar;
        this.f547w = eVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f545u;
        l onComplete = this.f547w;
        e job = this.f546v;
        switch (i6) {
            case 0:
                kotlin.jvm.internal.i.g(job, "$job");
                kotlin.jvm.internal.i.g(onComplete, "$onComplete");
                job.f554c.run();
                onComplete.invoke(job);
                return;
            default:
                kotlin.jvm.internal.i.g(job, "$job");
                kotlin.jvm.internal.i.g(onComplete, "$onComplete");
                job.f554c.run();
                onComplete.invoke(job);
                return;
        }
    }
}
