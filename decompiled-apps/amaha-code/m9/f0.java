package m9;

import com.google.android.gms.common.api.Status;
import m9.g;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements t9.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24982a;

    /* renamed from: b  reason: collision with root package name */
    public final d f24983b;

    public /* synthetic */ f0(d dVar, int i6) {
        this.f24982a = i6;
        this.f24983b = dVar;
    }

    @Override // t9.d
    public final void a(t9.c cVar) {
        int i6 = this.f24982a;
        d dVar = this.f24983b;
        switch (i6) {
            case 0:
                dVar.getClass();
                Status X = ((g.c) cVar).X();
                int i10 = X.f7298v;
                if (i10 != 0) {
                    dVar.f24952a.e(String.format("Error fetching queue item ids, statusCode=%s, statusMessage=%s", Integer.valueOf(i10), X.f7299w), new Object[0]);
                }
                dVar.f24962l = null;
                if (!dVar.f24958h.isEmpty()) {
                    com.google.android.gms.internal.cast.f fVar = dVar.f24959i;
                    g0 g0Var = dVar.f24960j;
                    fVar.removeCallbacks(g0Var);
                    fVar.postDelayed(g0Var, 500L);
                    return;
                }
                return;
            default:
                dVar.getClass();
                Status X2 = ((g.c) cVar).X();
                int i11 = X2.f7298v;
                if (i11 != 0) {
                    dVar.f24952a.e(String.format("Error fetching queue items, statusCode=%s, statusMessage=%s", Integer.valueOf(i11), X2.f7299w), new Object[0]);
                }
                dVar.f24961k = null;
                if (!dVar.f24958h.isEmpty()) {
                    com.google.android.gms.internal.cast.f fVar2 = dVar.f24959i;
                    g0 g0Var2 = dVar.f24960j;
                    fVar2.removeCallbacks(g0Var2);
                    fVar2.postDelayed(g0Var2, 500L);
                    return;
                }
                return;
        }
    }
}
