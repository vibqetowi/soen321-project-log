package xc;

import android.os.Bundle;
import com.theinnerhour.b2b.utils.SessionManager;
import sa.a;
/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
/* loaded from: classes.dex */
public final class d implements a.InterfaceC0534a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f37729a;

    public d(e eVar) {
        this.f37729a = eVar;
    }

    @Override // ta.g4
    public final void a(long j10, Bundle bundle, String str, String str2) {
        if (str != null && (!a.f37721a.contains(str2))) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(SessionManager.KEY_NAME, str2);
            bundle2.putLong("timestampInMillis", j10);
            bundle2.putBundle("params", bundle);
            ((jd.c) this.f37729a.f37730a).a(3, bundle2);
        }
    }
}
