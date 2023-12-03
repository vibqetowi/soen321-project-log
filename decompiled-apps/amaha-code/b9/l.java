package b9;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import b9.f;
import b9.n;
import c9.w;
import com.google.android.exoplayer2.upstream.AssetDataSource;
import com.google.android.exoplayer2.upstream.ContentDataSource;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;
import com.google.android.exoplayer2.upstream.UdpDataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: DefaultDataSource.java */
/* loaded from: classes.dex */
public final class l implements f {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4167a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f4168b;

    /* renamed from: c  reason: collision with root package name */
    public final f f4169c;

    /* renamed from: d  reason: collision with root package name */
    public FileDataSource f4170d;

    /* renamed from: e  reason: collision with root package name */
    public AssetDataSource f4171e;
    public ContentDataSource f;

    /* renamed from: g  reason: collision with root package name */
    public f f4172g;

    /* renamed from: h  reason: collision with root package name */
    public UdpDataSource f4173h;

    /* renamed from: i  reason: collision with root package name */
    public e f4174i;

    /* renamed from: j  reason: collision with root package name */
    public RawResourceDataSource f4175j;

    /* renamed from: k  reason: collision with root package name */
    public f f4176k;

    /* compiled from: DefaultDataSource.java */
    /* loaded from: classes.dex */
    public static final class a implements f.a {

        /* renamed from: a  reason: collision with root package name */
        public final Context f4177a;

        /* renamed from: b  reason: collision with root package name */
        public final f.a f4178b;

        public a(Context context) {
            n.a aVar = new n.a();
            this.f4177a = context.getApplicationContext();
            this.f4178b = aVar;
        }

        @Override // b9.f.a
        public final f a() {
            return new l(this.f4177a, this.f4178b.a());
        }
    }

    public l(Context context, f fVar) {
        this.f4167a = context.getApplicationContext();
        fVar.getClass();
        this.f4169c = fVar;
        this.f4168b = new ArrayList();
    }

    public static void o(f fVar, u uVar) {
        if (fVar != null) {
            fVar.c(uVar);
        }
    }

    @Override // b9.f
    public final void c(u uVar) {
        uVar.getClass();
        this.f4169c.c(uVar);
        this.f4168b.add(uVar);
        o(this.f4170d, uVar);
        o(this.f4171e, uVar);
        o(this.f, uVar);
        o(this.f4172g, uVar);
        o(this.f4173h, uVar);
        o(this.f4174i, uVar);
        o(this.f4175j, uVar);
    }

    @Override // b9.f
    public final void close() {
        f fVar = this.f4176k;
        if (fVar != null) {
            try {
                fVar.close();
            } finally {
                this.f4176k = null;
            }
        }
    }

    @Override // b9.f
    public final Uri getUri() {
        f fVar = this.f4176k;
        if (fVar == null) {
            return null;
        }
        return fVar.getUri();
    }

    @Override // b9.f
    public final long h(h hVar) {
        boolean z10;
        boolean z11 = true;
        if (this.f4176k == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.C(z10);
        String scheme = hVar.f4128a.getScheme();
        int i6 = w.f5205a;
        Uri uri = hVar.f4128a;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !"file".equals(scheme2)) {
            z11 = false;
        }
        Context context = this.f4167a;
        if (z11) {
            String path = uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.f4171e == null) {
                    AssetDataSource assetDataSource = new AssetDataSource(context);
                    this.f4171e = assetDataSource;
                    n(assetDataSource);
                }
                this.f4176k = this.f4171e;
            } else {
                if (this.f4170d == null) {
                    FileDataSource fileDataSource = new FileDataSource();
                    this.f4170d = fileDataSource;
                    n(fileDataSource);
                }
                this.f4176k = this.f4170d;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f4171e == null) {
                AssetDataSource assetDataSource2 = new AssetDataSource(context);
                this.f4171e = assetDataSource2;
                n(assetDataSource2);
            }
            this.f4176k = this.f4171e;
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                ContentDataSource contentDataSource = new ContentDataSource(context);
                this.f = contentDataSource;
                n(contentDataSource);
            }
            this.f4176k = this.f;
        } else {
            boolean equals = "rtmp".equals(scheme);
            f fVar = this.f4169c;
            if (equals) {
                if (this.f4172g == null) {
                    try {
                        f fVar2 = (f) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                        this.f4172g = fVar2;
                        n(fVar2);
                    } catch (ClassNotFoundException unused) {
                        Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e10) {
                        throw new RuntimeException("Error instantiating RTMP extension", e10);
                    }
                    if (this.f4172g == null) {
                        this.f4172g = fVar;
                    }
                }
                this.f4176k = this.f4172g;
            } else if ("udp".equals(scheme)) {
                if (this.f4173h == null) {
                    UdpDataSource udpDataSource = new UdpDataSource();
                    this.f4173h = udpDataSource;
                    n(udpDataSource);
                }
                this.f4176k = this.f4173h;
            } else if ("data".equals(scheme)) {
                if (this.f4174i == null) {
                    e eVar = new e();
                    this.f4174i = eVar;
                    n(eVar);
                }
                this.f4176k = this.f4174i;
            } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                this.f4176k = fVar;
            } else {
                if (this.f4175j == null) {
                    RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(context);
                    this.f4175j = rawResourceDataSource;
                    n(rawResourceDataSource);
                }
                this.f4176k = this.f4175j;
            }
        }
        return this.f4176k.h(hVar);
    }

    @Override // b9.f
    public final Map<String, List<String>> j() {
        f fVar = this.f4176k;
        if (fVar == null) {
            return Collections.emptyMap();
        }
        return fVar.j();
    }

    public final void n(f fVar) {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f4168b;
            if (i6 < arrayList.size()) {
                fVar.c((u) arrayList.get(i6));
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // b9.d
    public final int read(byte[] bArr, int i6, int i10) {
        f fVar = this.f4176k;
        fVar.getClass();
        return fVar.read(bArr, i6, i10);
    }
}
