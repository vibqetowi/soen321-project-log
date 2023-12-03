package m9;

import com.google.android.gms.cast.internal.zzal;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
import m9.g;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public abstract class s extends BasePendingResult<g.c> {

    /* renamed from: n  reason: collision with root package name */
    public q f25005n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f25006o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ g f25007p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(g gVar, boolean z10) {
        super(null);
        this.f25007p = gVar;
        this.f25006o = z10;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ g.c d(Status status) {
        return new r(status);
    }

    public abstract void m();

    public final p9.m n() {
        if (this.f25005n == null) {
            this.f25005n = new q(this);
        }
        return this.f25005n;
    }

    public final void o() {
        if (!this.f25006o) {
            Iterator it = this.f25007p.f24989g.iterator();
            while (it.hasNext()) {
                ((g.b) it.next()).c();
            }
            Iterator it2 = this.f25007p.f24990h.iterator();
            while (it2.hasNext()) {
                ((g.a) it2.next()).getClass();
            }
        }
        try {
            synchronized (this.f25007p.f24984a) {
                m();
            }
        } catch (zzal unused) {
            a(new r(new Status(2100, null)));
        }
    }
}
