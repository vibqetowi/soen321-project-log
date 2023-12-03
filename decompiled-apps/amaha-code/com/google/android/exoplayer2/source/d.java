package com.google.android.exoplayer2.source;

import android.content.Context;
import android.net.Uri;
import b9.f;
import b9.l;
import c9.w;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.source.d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import u7.t;
import u7.v;
/* compiled from: DefaultMediaSourceFactory.java */
/* loaded from: classes.dex */
public final class d implements o8.i {

    /* renamed from: a  reason: collision with root package name */
    public final f.a f6855a;

    /* renamed from: b  reason: collision with root package name */
    public final a f6856b;

    /* renamed from: c  reason: collision with root package name */
    public b9.r f6857c;

    /* renamed from: d  reason: collision with root package name */
    public final long f6858d;

    /* renamed from: e  reason: collision with root package name */
    public final long f6859e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final float f6860g;

    /* renamed from: h  reason: collision with root package name */
    public final float f6861h;

    /* compiled from: DefaultMediaSourceFactory.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final f.a f6862a;

        /* renamed from: b  reason: collision with root package name */
        public final u7.k f6863b;

        /* renamed from: c  reason: collision with root package name */
        public final HashMap f6864c = new HashMap();

        /* renamed from: d  reason: collision with root package name */
        public final HashSet f6865d = new HashSet();

        /* renamed from: e  reason: collision with root package name */
        public final HashMap f6866e = new HashMap();
        public b9.o f;

        /* renamed from: g  reason: collision with root package name */
        public String f6867g;

        /* renamed from: h  reason: collision with root package name */
        public com.google.android.exoplayer2.drm.d f6868h;

        /* renamed from: i  reason: collision with root package name */
        public s7.c f6869i;

        /* renamed from: j  reason: collision with root package name */
        public b9.r f6870j;

        /* renamed from: k  reason: collision with root package name */
        public List<Object> f6871k;

        public a(l.a aVar, u7.f fVar) {
            this.f6862a = aVar;
            this.f6863b = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final nc.m<o8.i> a(int i6) {
            nc.m<o8.i> mVar;
            nc.m<o8.i> mVar2;
            HashMap hashMap = this.f6864c;
            if (hashMap.containsKey(Integer.valueOf(i6))) {
                return (nc.m) hashMap.get(Integer.valueOf(i6));
            }
            try {
            } catch (ClassNotFoundException unused) {
                mVar = null;
            }
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 == 4) {
                                mVar2 = new o7.g(4, this);
                            }
                            mVar = null;
                        } else {
                            mVar = new o7.g(3, Class.forName("com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory").asSubclass(o8.i.class));
                        }
                    } else {
                        final Class<? extends U> asSubclass = Class.forName("com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory").asSubclass(o8.i.class);
                        mVar = new nc.m(this) { // from class: o8.b

                            /* renamed from: v  reason: collision with root package name */
                            public final /* synthetic */ d.a f27261v;

                            {
                                this.f27261v = this;
                            }

                            @Override // nc.m
                            public final Object get() {
                                int i10 = r3;
                                Class cls = asSubclass;
                                d.a aVar = this.f27261v;
                                switch (i10) {
                                    case 0:
                                        return com.google.android.exoplayer2.source.d.h(cls, aVar.f6862a);
                                    case 1:
                                        return com.google.android.exoplayer2.source.d.h(cls, aVar.f6862a);
                                    default:
                                        return com.google.android.exoplayer2.source.d.h(cls, aVar.f6862a);
                                }
                            }
                        };
                    }
                } else {
                    final Class<? extends U> asSubclass2 = Class.forName("com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(o8.i.class);
                    mVar = new nc.m(this) { // from class: o8.b

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ d.a f27261v;

                        {
                            this.f27261v = this;
                        }

                        @Override // nc.m
                        public final Object get() {
                            int i10 = r3;
                            Class cls = asSubclass2;
                            d.a aVar = this.f27261v;
                            switch (i10) {
                                case 0:
                                    return com.google.android.exoplayer2.source.d.h(cls, aVar.f6862a);
                                case 1:
                                    return com.google.android.exoplayer2.source.d.h(cls, aVar.f6862a);
                                default:
                                    return com.google.android.exoplayer2.source.d.h(cls, aVar.f6862a);
                            }
                        }
                    };
                }
                hashMap.put(Integer.valueOf(i6), mVar);
                if (mVar != null) {
                    this.f6865d.add(Integer.valueOf(i6));
                }
                return mVar;
            }
            final Class<? extends U> asSubclass3 = Class.forName("com.google.android.exoplayer2.source.dash.DashMediaSource$Factory").asSubclass(o8.i.class);
            mVar2 = new nc.m(this) { // from class: o8.b

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ d.a f27261v;

                {
                    this.f27261v = this;
                }

                @Override // nc.m
                public final Object get() {
                    int i10 = r3;
                    Class cls = asSubclass3;
                    d.a aVar = this.f27261v;
                    switch (i10) {
                        case 0:
                            return com.google.android.exoplayer2.source.d.h(cls, aVar.f6862a);
                        case 1:
                            return com.google.android.exoplayer2.source.d.h(cls, aVar.f6862a);
                        default:
                            return com.google.android.exoplayer2.source.d.h(cls, aVar.f6862a);
                    }
                }
            };
            mVar = mVar2;
            hashMap.put(Integer.valueOf(i6), mVar);
            if (mVar != null) {
            }
            return mVar;
        }
    }

    public d(Context context, u7.f fVar) {
        l.a aVar = new l.a(context);
        this.f6855a = aVar;
        this.f6856b = new a(aVar, fVar);
        this.f6858d = -9223372036854775807L;
        this.f6859e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.f6860g = -3.4028235E38f;
        this.f6861h = -3.4028235E38f;
    }

    public static o8.i h(Class cls, f.a aVar) {
        try {
            return (o8.i) cls.getConstructor(f.a.class).newInstance(aVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // o8.i
    public final o8.i a(String str) {
        a aVar = this.f6856b;
        aVar.f6867g = str;
        for (o8.i iVar : aVar.f6866e.values()) {
            iVar.a(str);
        }
        return this;
    }

    @Override // o8.i
    @Deprecated
    public final o8.i b(List list) {
        a aVar = this.f6856b;
        aVar.f6871k = list;
        for (o8.i iVar : aVar.f6866e.values()) {
            iVar.b(list);
        }
        return this;
    }

    @Override // o8.i
    public final o8.i c(b9.o oVar) {
        a aVar = this.f6856b;
        aVar.f = oVar;
        for (o8.i iVar : aVar.f6866e.values()) {
            iVar.c(oVar);
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
        if (r2 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0093, code lost:
        if (r2.contains("format=m3u8-aapl") != false) goto L111;
     */
    @Override // o8.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i d(com.google.android.exoplayer2.q qVar) {
        long j10;
        float f;
        float f2;
        long j11;
        long j12;
        boolean z10;
        char c10;
        com.google.android.exoplayer2.q qVar2 = qVar;
        qVar2.f6685v.getClass();
        q.g gVar = qVar2.f6685v;
        Uri uri = gVar.f6735a;
        int i6 = w.f5205a;
        int i10 = 3;
        String str = gVar.f6736b;
        int i11 = 0;
        if (str == null) {
            String scheme = uri.getScheme();
            if (scheme != null) {
                if ("rtsp" != scheme) {
                    if (4 == scheme.length()) {
                        for (int i12 = 0; i12 < 4; i12++) {
                            char charAt = "rtsp".charAt(i12);
                            char charAt2 = scheme.charAt(i12);
                            if (charAt == charAt2 || ((c10 = (char) ((charAt | ' ') - 97)) < 26 && c10 == ((char) ((charAt2 | ' ') - 97)))) {
                            }
                        }
                    }
                    z10 = false;
                    break;
                }
                z10 = true;
            }
            String path = uri.getPath();
            if (path != null) {
                String h02 = sc.b.h0(path);
                if (!h02.endsWith(".mpd")) {
                    if (!h02.endsWith(".m3u8")) {
                        Matcher matcher = w.f5210g.matcher(h02);
                        if (matcher.matches()) {
                            String group = matcher.group(2);
                            if (group != null) {
                                if (!group.contains("format=mpd-time-csf")) {
                                }
                            }
                            i10 = 1;
                        }
                    }
                    i10 = 2;
                }
                i10 = 0;
            }
            i10 = 4;
        } else {
            char c11 = 65535;
            switch (str.hashCode()) {
                case -979127466:
                    if (str.equals("application/x-mpegURL")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -156749520:
                    if (str.equals("application/vnd.ms-sstr+xml")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 64194685:
                    if (str.equals("application/dash+xml")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 1154777587:
                    if (str.equals("application/x-rtsp")) {
                        c11 = 3;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    i10 = 2;
                    break;
                case 1:
                    i10 = 1;
                    break;
                case 2:
                    i10 = 0;
                    break;
                case 3:
                    break;
                default:
                    i10 = 4;
                    break;
            }
        }
        a aVar = this.f6856b;
        HashMap hashMap = aVar.f6866e;
        o8.i iVar = (o8.i) hashMap.get(Integer.valueOf(i10));
        if (iVar == null) {
            nc.m<o8.i> a10 = aVar.a(i10);
            if (a10 == null) {
                iVar = null;
            } else {
                iVar = a10.get();
                b9.o oVar = aVar.f;
                if (oVar != null) {
                    iVar.c(oVar);
                }
                String str2 = aVar.f6867g;
                if (str2 != null) {
                    iVar.a(str2);
                }
                com.google.android.exoplayer2.drm.d dVar = aVar.f6868h;
                if (dVar != null) {
                    iVar.g(dVar);
                }
                s7.c cVar = aVar.f6869i;
                if (cVar != null) {
                    iVar.f(cVar);
                }
                b9.r rVar = aVar.f6870j;
                if (rVar != null) {
                    iVar.e(rVar);
                }
                List<Object> list = aVar.f6871k;
                if (list != null) {
                    iVar.b(list);
                }
                hashMap.put(Integer.valueOf(i10), iVar);
            }
        }
        StringBuilder sb2 = new StringBuilder(68);
        sb2.append("No suitable media source factory found for content type: ");
        sb2.append(i10);
        sc.b.F(iVar, sb2.toString());
        q.e eVar = qVar2.f6686w;
        eVar.getClass();
        if (eVar.f6725u == -9223372036854775807L) {
            j10 = this.f6858d;
        } else {
            j10 = eVar.f6725u;
        }
        long j13 = j10;
        if (eVar.f6728x == -3.4028235E38f) {
            f = this.f6860g;
        } else {
            f = eVar.f6728x;
        }
        float f10 = f;
        if (eVar.f6729y == -3.4028235E38f) {
            f2 = this.f6861h;
        } else {
            f2 = eVar.f6729y;
        }
        float f11 = f2;
        if (eVar.f6726v == -9223372036854775807L) {
            j11 = this.f6859e;
        } else {
            j11 = eVar.f6726v;
        }
        long j14 = j11;
        if (eVar.f6727w == -9223372036854775807L) {
            j12 = this.f;
        } else {
            j12 = eVar.f6727w;
        }
        q.e eVar2 = new q.e(j13, j14, j12, f10, f11);
        if (!eVar2.equals(eVar)) {
            q.a aVar2 = new q.a(qVar2);
            aVar2.f6698k = new q.e.a(eVar2);
            qVar2 = aVar2.a();
        }
        i d10 = iVar.d(qVar2);
        com.google.common.collect.s<q.i> sVar = qVar2.f6685v.f;
        if (!sVar.isEmpty()) {
            i[] iVarArr = new i[sVar.size() + 1];
            iVarArr[0] = d10;
            while (i11 < sVar.size()) {
                f.a aVar3 = this.f6855a;
                aVar3.getClass();
                b9.r rVar2 = this.f6857c;
                if (rVar2 == null) {
                    rVar2 = new com.google.android.exoplayer2.upstream.a();
                }
                int i13 = i11 + 1;
                iVarArr[i13] = new s(sVar.get(i11), aVar3, rVar2);
                i11 = i13;
            }
            d10 = new MergingMediaSource(iVarArr);
        }
        ClippingMediaSource clippingMediaSource = d10;
        q.c cVar2 = qVar2.f6688y;
        long j15 = cVar2.f6700u;
        long j16 = cVar2.f6701v;
        if (j15 != 0 || j16 != Long.MIN_VALUE || cVar2.f6703x) {
            clippingMediaSource = new ClippingMediaSource(clippingMediaSource, w.y(j15), w.y(j16), !cVar2.f6704y, cVar2.f6702w, cVar2.f6703x);
        }
        qVar2.f6685v.getClass();
        return clippingMediaSource;
    }

    @Override // o8.i
    public final o8.i e(b9.r rVar) {
        this.f6857c = rVar;
        a aVar = this.f6856b;
        aVar.f6870j = rVar;
        for (o8.i iVar : aVar.f6866e.values()) {
            iVar.e(rVar);
        }
        return this;
    }

    @Override // o8.i
    public final o8.i f(s7.c cVar) {
        a aVar = this.f6856b;
        aVar.f6869i = cVar;
        for (o8.i iVar : aVar.f6866e.values()) {
            iVar.f(cVar);
        }
        return this;
    }

    @Override // o8.i
    public final o8.i g(com.google.android.exoplayer2.drm.d dVar) {
        a aVar = this.f6856b;
        aVar.f6868h = dVar;
        for (o8.i iVar : aVar.f6866e.values()) {
            iVar.g(dVar);
        }
        return this;
    }

    /* compiled from: DefaultMediaSourceFactory.java */
    /* loaded from: classes.dex */
    public static final class b implements u7.h {

        /* renamed from: a  reason: collision with root package name */
        public final com.google.android.exoplayer2.n f6872a;

        public b(com.google.android.exoplayer2.n nVar) {
            this.f6872a = nVar;
        }

        @Override // u7.h
        public final boolean b(u7.i iVar) {
            return true;
        }

        @Override // u7.h
        public final void f(u7.j jVar) {
            v n10 = jVar.n(0, 3);
            jVar.i(new t.b(-9223372036854775807L));
            jVar.e();
            com.google.android.exoplayer2.n nVar = this.f6872a;
            nVar.getClass();
            n.a aVar = new n.a(nVar);
            aVar.f6665k = "text/x-unknown";
            aVar.f6662h = nVar.F;
            n10.e(new com.google.android.exoplayer2.n(aVar));
        }

        @Override // u7.h
        public final int h(u7.i iVar, u7.s sVar) {
            if (iVar.i(SubsamplingScaleImageView.TILE_SIZE_AUTO) == -1) {
                return -1;
            }
            return 0;
        }

        @Override // u7.h
        public final void a() {
        }

        @Override // u7.h
        public final void g(long j10, long j11) {
        }
    }
}
