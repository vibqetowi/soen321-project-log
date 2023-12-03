package p002if;

import kf.i;
import lf.e;
/* compiled from: R8$$SyntheticClass */
/* renamed from: if.a  reason: invalid package */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f20004u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ b f20005v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ i f20006w;

    public /* synthetic */ a(b bVar, i iVar, int i6) {
        this.f20004u = i6;
        this.f20005v = bVar;
        this.f20006w = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f20004u;
        i iVar = this.f20006w;
        b bVar = this.f20005v;
        switch (i6) {
            case 0:
                e b10 = bVar.b(iVar);
                if (b10 != null) {
                    bVar.f20009a.add(b10);
                    return;
                }
                return;
            default:
                e b11 = bVar.b(iVar);
                if (b11 != null) {
                    bVar.f20009a.add(b11);
                    return;
                }
                return;
        }
    }
}
