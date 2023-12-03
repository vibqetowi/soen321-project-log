package m9;

import android.util.Log;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class q implements p9.m {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ s f25003u;

    public q(s sVar) {
        this.f25003u = sVar;
    }

    @Override // p9.m
    public final void d(long j10) {
        try {
            this.f25003u.a(new r(new Status(2103, null)));
        } catch (IllegalStateException e10) {
            Log.e("RemoteMediaClient", "Result already set when calling onRequestReplaced", e10);
        }
    }

    @Override // p9.m
    public final void e(int i6, long j10, p9.k kVar) {
        if (true != (kVar instanceof p9.k)) {
        }
        try {
            this.f25003u.a(new t(new Status(i6, null)));
        } catch (IllegalStateException e10) {
            Log.e("RemoteMediaClient", "Result already set when calling onRequestCompleted", e10);
        }
    }
}
