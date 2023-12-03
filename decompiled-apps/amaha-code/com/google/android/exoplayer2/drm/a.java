package com.google.android.exoplayer2.drm;

import android.net.Uri;
import b9.n;
import b9.o;
import c9.w;
import com.google.android.exoplayer2.q;
import com.google.common.collect.t;
import com.google.common.collect.u;
import com.google.common.collect.v0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
/* compiled from: DefaultDrmSessionManagerProvider.java */
/* loaded from: classes.dex */
public final class a implements s7.c {

    /* renamed from: u  reason: collision with root package name */
    public final Object f6424u = new Object();

    /* renamed from: v  reason: collision with root package name */
    public q.d f6425v;

    /* renamed from: w  reason: collision with root package name */
    public DefaultDrmSessionManager f6426w;

    /* renamed from: x  reason: collision with root package name */
    public o f6427x;

    /* renamed from: y  reason: collision with root package name */
    public String f6428y;

    @Override // s7.c
    public final d a(q qVar) {
        DefaultDrmSessionManager defaultDrmSessionManager;
        qVar.f6685v.getClass();
        q.d dVar = qVar.f6685v.f6737c;
        if (dVar != null && w.f5205a >= 18) {
            synchronized (this.f6424u) {
                if (!w.a(dVar, this.f6425v)) {
                    this.f6425v = dVar;
                    this.f6426w = b(dVar);
                }
                defaultDrmSessionManager = this.f6426w;
                defaultDrmSessionManager.getClass();
            }
            return defaultDrmSessionManager;
        }
        return d.f6443a;
    }

    public final DefaultDrmSessionManager b(q.d dVar) {
        String uri;
        byte[] bArr;
        o oVar = this.f6427x;
        n.a aVar = oVar;
        if (oVar == null) {
            n.a aVar2 = new n.a();
            aVar2.f4194b = this.f6428y;
            aVar = aVar2;
        }
        Uri uri2 = dVar.f6711b;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        i iVar = new i(uri, dVar.f, aVar);
        t<String, String> tVar = dVar.f6712c;
        u uVar = tVar.f9452u;
        if (uVar == null) {
            uVar = tVar.b();
            tVar.f9452u = uVar;
        }
        v0 it = uVar.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (iVar.f6457d) {
                iVar.f6457d.put(str, str2);
            }
        }
        HashMap hashMap = new HashMap();
        UUID uuid = o7.b.f27180a;
        com.google.android.exoplayer2.upstream.a aVar3 = new com.google.android.exoplayer2.upstream.a();
        UUID uuid2 = dVar.f6710a;
        pl.a aVar4 = h.f6450d;
        uuid2.getClass();
        boolean z10 = dVar.f6713d;
        boolean z11 = dVar.f6714e;
        int[] G = qc.a.G(dVar.f6715g);
        for (int i6 : G) {
            boolean z12 = true;
            if (i6 != 2 && i6 != 1) {
                z12 = false;
            }
            sc.b.q(z12);
        }
        DefaultDrmSessionManager defaultDrmSessionManager = new DefaultDrmSessionManager(uuid2, aVar4, iVar, hashMap, z10, (int[]) G.clone(), z11, aVar3, 300000L);
        byte[] bArr2 = dVar.f6716h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        } else {
            bArr = null;
        }
        sc.b.C(defaultDrmSessionManager.f6402m.isEmpty());
        defaultDrmSessionManager.f6410v = 0;
        defaultDrmSessionManager.f6411w = bArr;
        return defaultDrmSessionManager;
    }
}
