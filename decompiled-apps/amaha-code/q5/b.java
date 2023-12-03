package q5;

import android.content.Context;
import android.view.Surface;
import c9.w;
import d9.o;
import w5.o;
import w5.p;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f29133u = 0;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ long f29134v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f29135w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f29136x;

    public /* synthetic */ b(long j10, Context context, String str) {
        this.f29134v = j10;
        this.f29135w = str;
        this.f29136x = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Long l2;
        int i6;
        j jVar;
        switch (this.f29133u) {
            case 0:
                long j10 = this.f29134v;
                String activityName = (String) this.f29135w;
                Context appContext = (Context) this.f29136x;
                kotlin.jvm.internal.i.g(activityName, "$activityName");
                j jVar2 = c.f29142g;
                if (jVar2 == null) {
                    l2 = null;
                } else {
                    l2 = jVar2.f29170b;
                }
                if (c.f29142g == null) {
                    c.f29142g = new j(Long.valueOf(j10), null);
                    k kVar = k.f29174a;
                    String str = c.f29144i;
                    kotlin.jvm.internal.i.f(appContext, "appContext");
                    k.b(activityName, str, appContext);
                } else if (l2 != null) {
                    long longValue = j10 - l2.longValue();
                    c.f29137a.getClass();
                    p pVar = p.f36526a;
                    o b10 = p.b(h5.p.b());
                    if (b10 == null) {
                        i6 = 60;
                    } else {
                        i6 = b10.f36513b;
                    }
                    if (longValue > i6 * 1000) {
                        k kVar2 = k.f29174a;
                        k.c(activityName, c.f29142g, c.f29144i);
                        String str2 = c.f29144i;
                        kotlin.jvm.internal.i.f(appContext, "appContext");
                        k.b(activityName, str2, appContext);
                        c.f29142g = new j(Long.valueOf(j10), null);
                    } else if (longValue > 1000 && (jVar = c.f29142g) != null) {
                        jVar.f29172d++;
                    }
                }
                j jVar3 = c.f29142g;
                if (jVar3 != null) {
                    jVar3.f29170b = Long.valueOf(j10);
                }
                j jVar4 = c.f29142g;
                if (jVar4 != null) {
                    jVar4.a();
                    return;
                }
                return;
            default:
                o.a aVar = (o.a) this.f29135w;
                aVar.getClass();
                int i10 = w.f5205a;
                aVar.f12710b.b0(this.f29134v, this.f29136x);
                return;
        }
    }

    public /* synthetic */ b(o.a aVar, Surface surface, long j10) {
        this.f29135w = aVar;
        this.f29136x = surface;
        this.f29134v = j10;
    }
}
