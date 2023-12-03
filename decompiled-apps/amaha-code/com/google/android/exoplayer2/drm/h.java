package com.google.android.exoplayer2.drm;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.text.TextUtils;
import android.util.Log;
import b8.h;
import c9.q;
import c9.w;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.b;
import com.google.android.exoplayer2.drm.g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: FrameworkMediaDrm.java */
/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: d  reason: collision with root package name */
    public static final pl.a f6450d = new pl.a();

    /* renamed from: a  reason: collision with root package name */
    public final UUID f6451a;

    /* renamed from: b  reason: collision with root package name */
    public final MediaDrm f6452b;

    /* renamed from: c  reason: collision with root package name */
    public int f6453c;

    /* compiled from: FrameworkMediaDrm.java */
    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(MediaDrm mediaDrm, String str) {
            boolean requiresSecureDecoder;
            requiresSecureDecoder = mediaDrm.requiresSecureDecoder(str);
            return requiresSecureDecoder;
        }
    }

    public h(UUID uuid) {
        UUID uuid2;
        uuid.getClass();
        sc.b.p("Use C.CLEARKEY_UUID instead", !o7.b.f27181b.equals(uuid));
        this.f6451a = uuid;
        MediaDrm mediaDrm = new MediaDrm((w.f5205a >= 27 || !o7.b.f27182c.equals(uuid)) ? uuid : uuid2);
        this.f6452b = mediaDrm;
        this.f6453c = 1;
        if (o7.b.f27183d.equals(uuid) && "ASUS_Z00AD".equals(w.f5208d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // com.google.android.exoplayer2.drm.g
    public final synchronized void a() {
        int i6 = this.f6453c - 1;
        this.f6453c = i6;
        if (i6 == 0) {
            this.f6452b.release();
        }
    }

    @Override // com.google.android.exoplayer2.drm.g
    public final Map<String, String> b(byte[] bArr) {
        return this.f6452b.queryKeyStatus(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.g
    public final g.d c() {
        MediaDrm.ProvisionRequest provisionRequest = this.f6452b.getProvisionRequest();
        return new g.d(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // com.google.android.exoplayer2.drm.g
    public final r7.b d(byte[] bArr) {
        boolean z10;
        int i6 = w.f5205a;
        UUID uuid = this.f6451a;
        if (i6 < 21 && o7.b.f27183d.equals(uuid) && "L3".equals(this.f6452b.getPropertyString("securityLevel"))) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i6 < 27 && o7.b.f27182c.equals(uuid)) {
            uuid = o7.b.f27181b;
        }
        return new s7.g(uuid, bArr, z10);
    }

    @Override // com.google.android.exoplayer2.drm.g
    public final byte[] e() {
        return this.f6452b.openSession();
    }

    @Override // com.google.android.exoplayer2.drm.g
    public final void f(byte[] bArr, byte[] bArr2) {
        this.f6452b.restoreKeys(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.g
    public final void g(byte[] bArr) {
        this.f6452b.closeSession(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.g
    public final byte[] h(byte[] bArr, byte[] bArr2) {
        String str;
        if (o7.b.f27182c.equals(this.f6451a) && w.f5205a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr2, nc.c.f25988c));
                StringBuilder sb2 = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                    if (i6 != 0) {
                        sb2.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i6);
                    sb2.append("{\"k\":\"");
                    sb2.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kid\":\"");
                    sb2.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kty\":\"");
                    sb2.append(jSONObject2.getString("kty"));
                    sb2.append("\"}");
                }
                sb2.append("]}");
                bArr2 = w.u(sb2.toString());
            } catch (JSONException e10) {
                String str2 = new String(bArr2, nc.c.f25988c);
                if (str2.length() != 0) {
                    str = "Failed to adjust response data: ".concat(str2);
                } else {
                    str = new String("Failed to adjust response data: ");
                }
                ca.a.Q("ClearKeyUtil", str, e10);
            }
        }
        return this.f6452b.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.g
    public final void i(byte[] bArr) {
        this.f6452b.provideProvisionResponse(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.g
    public final void j(final DefaultDrmSessionManager.a aVar) {
        this.f6452b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: s7.h
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i6, int i10, byte[] bArr2) {
                com.google.android.exoplayer2.drm.h hVar = com.google.android.exoplayer2.drm.h.this;
                g.b bVar = aVar;
                hVar.getClass();
                DefaultDrmSessionManager.b bVar2 = DefaultDrmSessionManager.this.f6412x;
                bVar2.getClass();
                bVar2.obtainMessage(i6, bArr).sendToTarget();
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01db, code lost:
        if ("AFTT".equals(r6) == false) goto L37;
     */
    @Override // com.google.android.exoplayer2.drm.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g.a k(byte[] bArr, List<b.C0134b> list, int i6, HashMap<String, String> hashMap) {
        b.C0134b c0134b;
        byte[] bArr2;
        String str;
        int i10;
        boolean z10;
        boolean z11;
        String str2;
        int i11;
        UUID uuid = this.f6451a;
        if (list != null) {
            if (!o7.b.f27183d.equals(uuid)) {
                c0134b = list.get(0);
            } else {
                if (w.f5205a >= 28 && list.size() > 1) {
                    b.C0134b c0134b2 = list.get(0);
                    int i12 = 0;
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        b.C0134b c0134b3 = list.get(i13);
                        byte[] bArr3 = c0134b3.f6437y;
                        bArr3.getClass();
                        if (w.a(c0134b3.f6436x, c0134b2.f6436x) && w.a(c0134b3.f6435w, c0134b2.f6435w)) {
                            if (b8.h.a(bArr3) != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                i12 += bArr3.length;
                            }
                        }
                        z10 = false;
                    }
                    z10 = true;
                    if (z10) {
                        byte[] bArr4 = new byte[i12];
                        int i14 = 0;
                        for (int i15 = 0; i15 < list.size(); i15++) {
                            byte[] bArr5 = list.get(i15).f6437y;
                            bArr5.getClass();
                            int length = bArr5.length;
                            System.arraycopy(bArr5, 0, bArr4, i14, length);
                            i14 += length;
                        }
                        c0134b = new b.C0134b(c0134b2.f6434v, c0134b2.f6435w, c0134b2.f6436x, bArr4);
                    }
                }
                for (int i16 = 0; i16 < list.size(); i16++) {
                    b.C0134b c0134b4 = list.get(i16);
                    byte[] bArr6 = c0134b4.f6437y;
                    bArr6.getClass();
                    h.a a10 = b8.h.a(bArr6);
                    if (a10 == null) {
                        i10 = -1;
                    } else {
                        i10 = a10.f4062b;
                    }
                    int i17 = w.f5205a;
                    if ((i17 < 23 && i10 == 0) || (i17 >= 23 && i10 == 1)) {
                        c0134b = c0134b4;
                        break;
                    }
                }
                c0134b = list.get(0);
            }
            byte[] bArr7 = c0134b.f6437y;
            bArr7.getClass();
            UUID uuid2 = o7.b.f27184e;
            if (uuid2.equals(uuid)) {
                byte[] b10 = b8.h.b(uuid, bArr7);
                if (b10 != null) {
                    bArr7 = b10;
                }
                q qVar = new q(bArr7);
                int e10 = qVar.e();
                short f = qVar.f();
                short f2 = qVar.f();
                if (f == 1 && f2 == 1) {
                    short f10 = qVar.f();
                    Charset charset = nc.c.f25989d;
                    String o10 = qVar.o(f10, charset);
                    if (!o10.contains("<LA_URL>")) {
                        int indexOf = o10.indexOf("</DATA>");
                        if (indexOf == -1) {
                            Log.w("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        String substring = o10.substring(0, indexOf);
                        String substring2 = o10.substring(indexOf);
                        StringBuilder sb2 = new StringBuilder(ri.e.c(substring2, ri.e.c(substring, 26)));
                        sb2.append(substring);
                        sb2.append("<LA_URL>https://x</LA_URL>");
                        sb2.append(substring2);
                        String sb3 = sb2.toString();
                        int i18 = e10 + 52;
                        ByteBuffer allocate = ByteBuffer.allocate(i18);
                        allocate.order(ByteOrder.LITTLE_ENDIAN);
                        allocate.putInt(i18);
                        allocate.putShort(f);
                        allocate.putShort(f2);
                        allocate.putShort((short) (sb3.length() * 2));
                        allocate.put(sb3.getBytes(charset));
                        bArr7 = allocate.array();
                    }
                } else {
                    Log.i("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                }
                if (bArr7 != null) {
                    i11 = bArr7.length;
                } else {
                    i11 = 0;
                }
                int i19 = i11 + 32;
                ByteBuffer allocate2 = ByteBuffer.allocate(i19);
                allocate2.putInt(i19);
                allocate2.putInt(1886614376);
                allocate2.putInt(0);
                allocate2.putLong(uuid2.getMostSignificantBits());
                allocate2.putLong(uuid2.getLeastSignificantBits());
                if (bArr7 != null && bArr7.length != 0) {
                    allocate2.putInt(bArr7.length);
                    allocate2.put(bArr7);
                }
                bArr7 = allocate2.array();
            }
            int i20 = w.f5205a;
            if (i20 >= 23 || !o7.b.f27183d.equals(uuid)) {
                if (uuid2.equals(uuid) && "Amazon".equals(w.f5207c)) {
                    String str3 = w.f5208d;
                    if (!"AFTB".equals(str3)) {
                        if (!"AFTS".equals(str3)) {
                            if (!"AFTM".equals(str3)) {
                            }
                        }
                    }
                }
                str2 = c0134b.f6436x;
                if (i20 < 26 && o7.b.f27182c.equals(uuid) && ("video/mp4".equals(str2) || "audio/mp4".equals(str2))) {
                    str2 = "cenc";
                }
                str = str2;
                bArr2 = bArr7;
            }
            byte[] b11 = b8.h.b(uuid, bArr7);
            if (b11 != null) {
                bArr7 = b11;
            }
            str2 = c0134b.f6436x;
            if (i20 < 26) {
                str2 = "cenc";
            }
            str = str2;
            bArr2 = bArr7;
        } else {
            c0134b = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f6452b.getKeyRequest(bArr, bArr2, str, i6, hashMap);
        byte[] data = keyRequest.getData();
        if (o7.b.f27182c.equals(uuid) && w.f5205a < 27) {
            data = w.u(new String(data, nc.c.f25988c).replace('+', '-').replace('/', '_'));
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && c0134b != null) {
            String str4 = c0134b.f6435w;
            if (!TextUtils.isEmpty(str4)) {
                defaultUrl = str4;
            }
        }
        if (w.f5205a >= 23) {
            keyRequest.getRequestType();
        }
        return new g.a(defaultUrl, data);
    }

    @Override // com.google.android.exoplayer2.drm.g
    public final int l() {
        return 2;
    }

    @Override // com.google.android.exoplayer2.drm.g
    public final boolean m(String str, byte[] bArr) {
        if (w.f5205a >= 31) {
            return a.a(this.f6452b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f6451a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }
}
