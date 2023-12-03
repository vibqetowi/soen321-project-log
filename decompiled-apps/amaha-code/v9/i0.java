package v9;

import android.app.PendingIntent;
import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public abstract class i0 extends r0 {

    /* renamed from: d  reason: collision with root package name */
    public final int f34910d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f34911e;
    public final /* synthetic */ b f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(b bVar, int i6, Bundle bundle) {
        super(bVar, Boolean.TRUE);
        this.f = bVar;
        this.f34910d = i6;
        this.f34911e = bundle;
    }

    @Override // v9.r0
    public final /* bridge */ /* synthetic */ void a() {
        b bVar = this.f;
        PendingIntent pendingIntent = null;
        int i6 = this.f34910d;
        if (i6 == 0) {
            if (!f()) {
                bVar.H(1, null);
                e(new s9.b(8, null));
                return;
            }
            return;
        }
        bVar.H(1, null);
        Bundle bundle = this.f34911e;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        }
        e(new s9.b(i6, pendingIntent));
    }

    public abstract void e(s9.b bVar);

    public abstract boolean f();

    @Override // v9.r0
    public final void b() {
    }
}
