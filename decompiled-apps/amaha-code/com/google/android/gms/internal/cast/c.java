package com.google.android.gms.internal.cast;

import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import java.util.HashMap;
import java.util.Set;
import r1.l;
import r1.x;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class c extends b5 {

    /* renamed from: b  reason: collision with root package name */
    public final r1.l f7489b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f7490c = new HashMap();

    public c(r1.l lVar, l9.b bVar) {
        boolean z10;
        this.f7489b = lVar;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            boolean z11 = bVar.D;
            x.a aVar = new x.a();
            if (i6 >= 30) {
                aVar.f30371a = z11;
            }
            boolean z12 = bVar.E;
            if (i6 >= 30) {
                aVar.f30372b = z12;
            }
            r1.x xVar = new r1.x(aVar);
            r1.l.b();
            l.d dVar = r1.l.f30291d;
            r1.x xVar2 = dVar.f30310n;
            dVar.f30310n = xVar;
            if (dVar.f30299b) {
                if ((xVar2 != null ? xVar2.f30370b : false) != xVar.f30370b) {
                    r1.f fVar = dVar.f30318w;
                    r1.d dVar2 = dVar.f30300c;
                    dVar2.f30262y = fVar;
                    if (!dVar2.f30263z) {
                        dVar2.f30263z = true;
                        dVar2.f30260w.sendEmptyMessage(2);
                    }
                }
            }
            if (z11) {
                v0.a(d0.CAST_OUTPUT_SWITCHER_ENABLED);
            }
            if (z12) {
                v0.a(d0.CAST_TRANSFER_TO_LOCAL_ENABLED);
            }
        }
    }

    public final void X1(MediaSessionCompat mediaSessionCompat) {
        l.d.C0516d c0516d;
        this.f7489b.getClass();
        if (r1.l.f30290c) {
            Log.d("MediaRouter", "addMediaSessionCompat: " + mediaSessionCompat);
        }
        l.d dVar = r1.l.f30291d;
        dVar.A = mediaSessionCompat;
        if (mediaSessionCompat != null) {
            c0516d = new l.d.C0516d(mediaSessionCompat);
        } else {
            c0516d = null;
        }
        l.d.C0516d c0516d2 = dVar.f30321z;
        if (c0516d2 != null) {
            c0516d2.a();
        }
        dVar.f30321z = c0516d;
        if (c0516d != null) {
            dVar.m();
        }
    }

    public final void Y1(r1.k kVar, int i6) {
        for (l.a aVar : (Set) this.f7490c.get(kVar)) {
            this.f7489b.a(kVar, aVar, i6);
        }
    }

    public final void Z1(r1.k kVar) {
        for (l.a aVar : (Set) this.f7490c.get(kVar)) {
            this.f7489b.g(aVar);
        }
    }
}
