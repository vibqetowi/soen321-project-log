package p9;

import android.os.Parcel;
import com.google.android.gms.common.api.a;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements com.google.android.gms.common.api.internal.n {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f28047u;

    /* renamed from: v  reason: collision with root package name */
    public final String[] f28048v;

    public /* synthetic */ p(s sVar, String[] strArr, int i6) {
        this.f28047u = i6;
        this.f28048v = strArr;
    }

    @Override // com.google.android.gms.common.api.internal.n
    public final void p(a.e eVar, Object obj) {
        int i6 = this.f28047u;
        String[] strArr = this.f28048v;
        switch (i6) {
            case 0:
                r rVar = new r((ya.i) obj, 0);
                h hVar = (h) ((t) eVar).y();
                Parcel z10 = hVar.z();
                com.google.android.gms.internal.cast.d.c(z10, rVar);
                z10.writeStringArray(strArr);
                hVar.S1(z10, 5);
                return;
            case 1:
                r rVar2 = new r((ya.i) obj, 1);
                h hVar2 = (h) ((t) eVar).y();
                Parcel z11 = hVar2.z();
                com.google.android.gms.internal.cast.d.c(z11, rVar2);
                z11.writeStringArray(strArr);
                hVar2.S1(z11, 6);
                return;
            default:
                r rVar3 = new r((ya.i) obj, 2);
                h hVar3 = (h) ((t) eVar).y();
                Parcel z12 = hVar3.z();
                com.google.android.gms.internal.cast.d.c(z12, rVar3);
                z12.writeStringArray(strArr);
                hVar3.S1(z12, 7);
                return;
        }
    }
}
