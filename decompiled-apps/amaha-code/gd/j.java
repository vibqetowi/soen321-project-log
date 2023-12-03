package gd;

import com.google.firebase.FirebaseNetworkException;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class j implements ya.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f16421a;

    public j(k kVar) {
        this.f16421a = kVar;
    }

    @Override // ya.e
    public final void onFailure(Exception exc) {
        long j10;
        if (exc instanceof FirebaseNetworkException) {
            y9.a aVar = l.f;
            aVar.e("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            l lVar = (l) this.f16421a.f16424w;
            int i6 = (int) lVar.f16432b;
            if (i6 != 30 && i6 != 60 && i6 != 120 && i6 != 240 && i6 != 480) {
                if (i6 != 960) {
                    j10 = 30;
                } else {
                    j10 = 960;
                }
            } else {
                long j11 = lVar.f16432b;
                j10 = j11 + j11;
            }
            lVar.f16432b = j10;
            lVar.f16431a = (lVar.f16432b * 1000) + System.currentTimeMillis();
            long j12 = lVar.f16431a;
            aVar.e("Scheduling refresh for " + j12, new Object[0]);
            lVar.f16434d.postDelayed(lVar.f16435e, lVar.f16432b * 1000);
        }
    }
}
