package wd;

import android.net.Uri;
import android.os.Bundle;
import nd.z;
/* compiled from: PendingDynamicLinkData.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final z f36684a;

    /* renamed from: b  reason: collision with root package name */
    public final xd.a f36685b;

    public b(xd.a aVar) {
        if (aVar.f37734x == 0) {
            aVar.f37734x = System.currentTimeMillis();
        }
        this.f36685b = aVar;
        this.f36684a = new z(aVar);
    }

    public final Uri a() {
        String str;
        xd.a aVar = this.f36685b;
        if (aVar == null || (str = aVar.f37732v) == null) {
            return null;
        }
        return Uri.parse(str);
    }

    public final Bundle b() {
        z zVar = this.f36684a;
        if (zVar == null) {
            return new Bundle();
        }
        zVar.getClass();
        return new Bundle((Bundle) zVar.f26149c);
    }
}
