package com.google.android.exoplayer2.drm;

import android.net.Uri;
import android.text.TextUtils;
import b9.n;
import b9.o;
import b9.t;
import c9.w;
import com.google.android.exoplayer2.drm.g;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.common.collect.m0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
/* compiled from: HttpMediaDrmCallback.java */
/* loaded from: classes.dex */
public final class i implements j {

    /* renamed from: a  reason: collision with root package name */
    public final o f6454a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6455b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f6456c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f6457d;

    public i(String str, boolean z10, o oVar) {
        boolean z11;
        if (z10 && TextUtils.isEmpty(str)) {
            z11 = false;
        } else {
            z11 = true;
        }
        sc.b.q(z11);
        this.f6454a = oVar;
        this.f6455b = str;
        this.f6456c = z10;
        this.f6457d = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0099 A[Catch: all -> 0x0059, TRY_LEAVE, TryCatch #5 {Exception -> 0x00e4, blocks: (B:3:0x003e, B:13:0x0062, B:14:0x0064, B:36:0x00d1, B:37:0x00d3, B:4:0x0043, B:5:0x004e, B:7:0x0055, B:12:0x005e, B:16:0x0068, B:35:0x0099, B:39:0x00dd, B:26:0x007b, B:28:0x007f, B:30:0x0089, B:32:0x008f), top: B:55:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] b(o oVar, String str, byte[] bArr, Map<String, String> map) {
        boolean z10;
        Map<String, List<String>> map2;
        List<String> list;
        String str2;
        n.a aVar = (n.a) oVar;
        t tVar = new t(new n(aVar.f4194b, aVar.f4195c, aVar.f4196d, aVar.f4193a));
        Collections.emptyMap();
        Uri parse = Uri.parse(str);
        sc.b.F(parse, "The uri must be set.");
        b9.h hVar = new b9.h(parse, 0L, 2, bArr, map, 0L, -1L, null, 1, null);
        int i6 = 0;
        b9.h hVar2 = hVar;
        int i10 = 0;
        while (true) {
            try {
                b9.g gVar = new b9.g(tVar, hVar2);
                try {
                    int i11 = w.f5205a;
                    byte[] bArr2 = new byte[4096];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int read = gVar.read(bArr2);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, i6, read);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    int i12 = w.f5205a;
                    try {
                        gVar.close();
                    } catch (IOException unused) {
                    }
                    return byteArray;
                } catch (HttpDataSource$InvalidResponseCodeException e10) {
                    int i13 = e10.f7157w;
                    if ((i13 == 307 || i13 == 308) && i10 < 5) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && (map2 = e10.f7158x) != null && (list = map2.get("Location")) != null && !list.isEmpty()) {
                        str2 = list.get(i6);
                        if (str2 == null) {
                            int i14 = i10 + 1;
                            long j10 = hVar2.f4129b;
                            int i15 = hVar2.f4130c;
                            byte[] bArr3 = hVar2.f4131d;
                            Map<String, String> map3 = hVar2.f4132e;
                            long j11 = hVar2.f;
                            long j12 = hVar2.f4133g;
                            String str3 = hVar2.f4134h;
                            int i16 = hVar2.f4135i;
                            Object obj = hVar2.f4136j;
                            Uri parse2 = Uri.parse(str2);
                            sc.b.F(parse2, "The uri must be set.");
                            b9.h hVar3 = new b9.h(parse2, j10, i15, bArr3, map3, j11, j12, str3, i16, obj);
                            int i17 = w.f5205a;
                            try {
                                gVar.close();
                            } catch (IOException unused2) {
                            }
                            i10 = i14;
                            hVar2 = hVar3;
                            i6 = 0;
                        } else {
                            throw e10;
                        }
                    }
                    str2 = null;
                    if (str2 == null) {
                    }
                }
            } catch (Exception e11) {
                Uri uri = tVar.f4214c;
                uri.getClass();
                throw new MediaDrmCallbackException(hVar, uri, tVar.j(), tVar.f4213b, e11);
            }
        }
    }

    public final byte[] a(UUID uuid, g.a aVar) {
        String str;
        String str2 = aVar.f6447b;
        if (this.f6456c || TextUtils.isEmpty(str2)) {
            str2 = this.f6455b;
        }
        if (!TextUtils.isEmpty(str2)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = o7.b.f27184e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else if (o7.b.f27182c.equals(uuid)) {
                str = "application/json";
            } else {
                str = "application/octet-stream";
            }
            hashMap.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.f6457d) {
                hashMap.putAll(this.f6457d);
            }
            return b(this.f6454a, str2, aVar.f6446a, hashMap);
        }
        Map emptyMap = Collections.emptyMap();
        Uri uri = Uri.EMPTY;
        sc.b.F(uri, "The uri must be set.");
        throw new MediaDrmCallbackException(new b9.h(uri, 0L, 1, null, emptyMap, 0L, -1L, null, 0, null), Uri.EMPTY, m0.A, 0L, new IllegalStateException("No license URL"));
    }

    public final byte[] c(g.d dVar) {
        String str = dVar.f6449b;
        int i6 = w.f5205a;
        String str2 = new String(dVar.f6448a, nc.c.f25988c);
        StringBuilder sb2 = new StringBuilder(str2.length() + ri.e.c(str, 15));
        sb2.append(str);
        sb2.append("&signedRequest=");
        sb2.append(str2);
        return b(this.f6454a, sb2.toString(), null, Collections.emptyMap());
    }
}
