package r9;

import android.os.Bundle;
import com.google.android.gms.cloudmessaging.zzq;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
public final class m extends n {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f30633e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i6, Bundle bundle, int i10) {
        super(i6, 2, bundle);
        this.f30633e = i10;
        if (i10 != 1) {
        } else {
            super(i6, 1, bundle);
        }
    }

    @Override // r9.n
    public final void a(Bundle bundle) {
        switch (this.f30633e) {
            case 0:
                if (bundle.getBoolean("ack", false)) {
                    d(null);
                    return;
                } else {
                    c(new zzq("Invalid response to one way request", null));
                    return;
                }
            default:
                Bundle bundle2 = bundle.getBundle("data");
                if (bundle2 == null) {
                    bundle2 = Bundle.EMPTY;
                }
                d(bundle2);
                return;
        }
    }

    @Override // r9.n
    public final boolean b() {
        switch (this.f30633e) {
            case 0:
                return true;
            default:
                return false;
        }
    }
}
