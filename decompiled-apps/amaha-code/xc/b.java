package xc;

import android.os.Bundle;
import java.util.HashSet;
import kc.f;
import kotlin.jvm.internal.h;
import sa.a;
/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
/* loaded from: classes.dex */
public final class b implements a.InterfaceC0534a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f37726a;

    public b(c cVar) {
        this.f37726a = cVar;
    }

    @Override // ta.g4
    public final void a(long j10, Bundle bundle, String str, String str2) {
        c cVar = this.f37726a;
        if (!cVar.f37727a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        HashSet hashSet = a.f37721a;
        String r02 = h.r0(str2, f.f23227q0, f.f23225o0);
        if (r02 != null) {
            str2 = r02;
        }
        bundle2.putString("events", str2);
        ((jd.c) cVar.f37728b).a(2, bundle2);
    }
}
