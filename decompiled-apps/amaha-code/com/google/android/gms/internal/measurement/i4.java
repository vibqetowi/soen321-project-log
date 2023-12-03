package com.google.android.gms.internal.measurement;

import android.os.Build;
import android.os.StrictMode;
import android.os.UserManager;
import java.util.Iterator;
import t.g;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class i4 implements t3 {

    /* renamed from: a  reason: collision with root package name */
    public static final t.b f8423a = new t.b();

    public static i4 a() {
        boolean z10;
        i4 i4Var;
        UserManager userManager = n3.f8482a;
        if (Build.VERSION.SDK_INT >= 24) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            synchronized (i4.class) {
                i4Var = (i4) f8423a.getOrDefault(null, null);
                if (i4Var == null) {
                    StrictMode.allowThreadDiskReads();
                    throw null;
                }
            }
            return i4Var;
        }
        throw null;
    }

    public static synchronized void b() {
        synchronized (i4.class) {
            t.b bVar = f8423a;
            Iterator it = ((g.e) bVar.values()).iterator();
            if (!it.hasNext()) {
                bVar.clear();
            } else {
                ((i4) it.next()).getClass();
                throw null;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.t3
    public final Object f(String str) {
        throw null;
    }
}
