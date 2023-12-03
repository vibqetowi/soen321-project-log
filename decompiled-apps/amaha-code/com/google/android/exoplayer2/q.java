package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import com.google.common.collect.l0;
import com.google.common.collect.m0;
import com.google.common.collect.s;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
/* compiled from: MediaItem.java */
/* loaded from: classes.dex */
public final class q implements com.google.android.exoplayer2.f {

    /* renamed from: z  reason: collision with root package name */
    public static final com.google.firebase.messaging.j f6683z;

    /* renamed from: u  reason: collision with root package name */
    public final String f6684u;

    /* renamed from: v  reason: collision with root package name */
    public final g f6685v;

    /* renamed from: w  reason: collision with root package name */
    public final e f6686w;

    /* renamed from: x  reason: collision with root package name */
    public final r f6687x;

    /* renamed from: y  reason: collision with root package name */
    public final c f6688y;

    /* compiled from: MediaItem.java */
    /* loaded from: classes.dex */
    public static class b implements com.google.android.exoplayer2.f {

        /* renamed from: z  reason: collision with root package name */
        public static final com.google.firebase.messaging.j f6699z;

        /* renamed from: u  reason: collision with root package name */
        public final long f6700u;

        /* renamed from: v  reason: collision with root package name */
        public final long f6701v;

        /* renamed from: w  reason: collision with root package name */
        public final boolean f6702w;

        /* renamed from: x  reason: collision with root package name */
        public final boolean f6703x;

        /* renamed from: y  reason: collision with root package name */
        public final boolean f6704y;

        static {
            new c(new a());
            f6699z = new com.google.firebase.messaging.j(5);
        }

        public b(a aVar) {
            this.f6700u = aVar.f6705a;
            this.f6701v = aVar.f6706b;
            this.f6702w = aVar.f6707c;
            this.f6703x = aVar.f6708d;
            this.f6704y = aVar.f6709e;
        }

        public static String b(int i6) {
            return Integer.toString(i6, 36);
        }

        @Override // com.google.android.exoplayer2.f
        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putLong(b(0), this.f6700u);
            bundle.putLong(b(1), this.f6701v);
            bundle.putBoolean(b(2), this.f6702w);
            bundle.putBoolean(b(3), this.f6703x);
            bundle.putBoolean(b(4), this.f6704y);
            return bundle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f6700u == bVar.f6700u && this.f6701v == bVar.f6701v && this.f6702w == bVar.f6702w && this.f6703x == bVar.f6703x && this.f6704y == bVar.f6704y) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            long j10 = this.f6700u;
            long j11 = this.f6701v;
            return (((((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f6702w ? 1 : 0)) * 31) + (this.f6703x ? 1 : 0)) * 31) + (this.f6704y ? 1 : 0);
        }

        /* compiled from: MediaItem.java */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            public long f6705a;

            /* renamed from: b  reason: collision with root package name */
            public long f6706b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f6707c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f6708d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f6709e;

            public a() {
                this.f6706b = Long.MIN_VALUE;
            }

            public a(c cVar) {
                this.f6705a = cVar.f6700u;
                this.f6706b = cVar.f6701v;
                this.f6707c = cVar.f6702w;
                this.f6708d = cVar.f6703x;
                this.f6709e = cVar.f6704y;
            }
        }
    }

    /* compiled from: MediaItem.java */
    @Deprecated
    /* loaded from: classes.dex */
    public static final class c extends b {
        public static final c A = new c(new b.a());

        public c(b.a aVar) {
            super(aVar);
        }
    }

    /* compiled from: MediaItem.java */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f6735a;

        /* renamed from: b  reason: collision with root package name */
        public final String f6736b;

        /* renamed from: c  reason: collision with root package name */
        public final d f6737c;

        /* renamed from: d  reason: collision with root package name */
        public final List<Object> f6738d;

        /* renamed from: e  reason: collision with root package name */
        public final String f6739e;
        public final com.google.common.collect.s<i> f;

        /* renamed from: g  reason: collision with root package name */
        public final Object f6740g;

        public f() {
            throw null;
        }

        public f(Uri uri, String str, d dVar, List list, String str2, com.google.common.collect.s sVar, Object obj) {
            this.f6735a = uri;
            this.f6736b = str;
            this.f6737c = dVar;
            this.f6738d = list;
            this.f6739e = str2;
            this.f = sVar;
            s.b bVar = com.google.common.collect.s.f9446v;
            s.a aVar = new s.a();
            for (int i6 = 0; i6 < sVar.size(); i6++) {
                i iVar = (i) sVar.get(i6);
                iVar.getClass();
                aVar.b(new h(new i.a(iVar)));
            }
            aVar.c();
            this.f6740g = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (this.f6735a.equals(fVar.f6735a) && c9.w.a(this.f6736b, fVar.f6736b) && c9.w.a(this.f6737c, fVar.f6737c) && c9.w.a(null, null) && this.f6738d.equals(fVar.f6738d) && c9.w.a(this.f6739e, fVar.f6739e) && this.f.equals(fVar.f) && c9.w.a(this.f6740g, fVar.f6740g)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4 = this.f6735a.hashCode() * 31;
            int i6 = 0;
            String str = this.f6736b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i10 = (hashCode4 + hashCode) * 31;
            d dVar = this.f6737c;
            if (dVar == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = dVar.hashCode();
            }
            int hashCode5 = (this.f6738d.hashCode() + ((((i10 + hashCode2) * 31) + 0) * 31)) * 31;
            String str2 = this.f6739e;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int hashCode6 = (this.f.hashCode() + ((hashCode5 + hashCode3) * 31)) * 31;
            Object obj = this.f6740g;
            if (obj != null) {
                i6 = obj.hashCode();
            }
            return hashCode6 + i6;
        }
    }

    /* compiled from: MediaItem.java */
    @Deprecated
    /* loaded from: classes.dex */
    public static final class g extends f {
        public g(Uri uri, String str, d dVar, List list, String str2, com.google.common.collect.s sVar, Object obj) {
            super(uri, str, dVar, list, str2, sVar, obj);
        }
    }

    /* compiled from: MediaItem.java */
    @Deprecated
    /* loaded from: classes.dex */
    public static final class h extends i {
        public h(i.a aVar) {
            super(aVar);
        }
    }

    /* compiled from: MediaItem.java */
    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f6741a;

        /* renamed from: b  reason: collision with root package name */
        public final String f6742b;

        /* renamed from: c  reason: collision with root package name */
        public final String f6743c;

        /* renamed from: d  reason: collision with root package name */
        public final int f6744d;

        /* renamed from: e  reason: collision with root package name */
        public final int f6745e;
        public final String f;

        /* compiled from: MediaItem.java */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            public final Uri f6746a;

            /* renamed from: b  reason: collision with root package name */
            public final String f6747b;

            /* renamed from: c  reason: collision with root package name */
            public final String f6748c;

            /* renamed from: d  reason: collision with root package name */
            public final int f6749d;

            /* renamed from: e  reason: collision with root package name */
            public final int f6750e;
            public final String f;

            public a(i iVar) {
                this.f6746a = iVar.f6741a;
                this.f6747b = iVar.f6742b;
                this.f6748c = iVar.f6743c;
                this.f6749d = iVar.f6744d;
                this.f6750e = iVar.f6745e;
                this.f = iVar.f;
            }
        }

        public i(a aVar) {
            this.f6741a = aVar.f6746a;
            this.f6742b = aVar.f6747b;
            this.f6743c = aVar.f6748c;
            this.f6744d = aVar.f6749d;
            this.f6745e = aVar.f6750e;
            this.f = aVar.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (this.f6741a.equals(iVar.f6741a) && c9.w.a(this.f6742b, iVar.f6742b) && c9.w.a(this.f6743c, iVar.f6743c) && this.f6744d == iVar.f6744d && this.f6745e == iVar.f6745e && c9.w.a(this.f, iVar.f)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3 = this.f6741a.hashCode() * 31;
            int i6 = 0;
            String str = this.f6742b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i10 = (hashCode3 + hashCode) * 31;
            String str2 = this.f6743c;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i11 = (((((i10 + hashCode2) * 31) + this.f6744d) * 31) + this.f6745e) * 31;
            String str3 = this.f;
            if (str3 != null) {
                i6 = str3.hashCode();
            }
            return i11 + i6;
        }
    }

    static {
        new a().a();
        f6683z = new com.google.firebase.messaging.j(4);
    }

    public q(String str, c cVar, g gVar, e eVar, r rVar) {
        this.f6684u = str;
        this.f6685v = gVar;
        this.f6686w = eVar;
        this.f6687x = rVar;
        this.f6688y = cVar;
    }

    public static q b(Uri uri) {
        a aVar = new a();
        aVar.f6690b = uri;
        return aVar.a();
    }

    public static String c(int i6) {
        return Integer.toString(i6, 36);
    }

    @Override // com.google.android.exoplayer2.f
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString(c(0), this.f6684u);
        bundle.putBundle(c(1), this.f6686w.a());
        bundle.putBundle(c(2), this.f6687x.a());
        bundle.putBundle(c(3), this.f6688y.a());
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (c9.w.a(this.f6684u, qVar.f6684u) && this.f6688y.equals(qVar.f6688y) && c9.w.a(this.f6685v, qVar.f6685v) && c9.w.a(this.f6686w, qVar.f6686w) && c9.w.a(this.f6687x, qVar.f6687x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int hashCode = this.f6684u.hashCode() * 31;
        g gVar = this.f6685v;
        if (gVar != null) {
            i6 = gVar.hashCode();
        } else {
            i6 = 0;
        }
        int hashCode2 = this.f6686w.hashCode();
        int hashCode3 = this.f6688y.hashCode();
        return this.f6687x.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + i6) * 31)) * 31)) * 31);
    }

    /* compiled from: MediaItem.java */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final UUID f6710a;

        /* renamed from: b  reason: collision with root package name */
        public final Uri f6711b;

        /* renamed from: c  reason: collision with root package name */
        public final com.google.common.collect.t<String, String> f6712c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f6713d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f6714e;
        public final boolean f;

        /* renamed from: g  reason: collision with root package name */
        public final com.google.common.collect.s<Integer> f6715g;

        /* renamed from: h  reason: collision with root package name */
        public final byte[] f6716h;

        public d(a aVar) {
            boolean z10;
            byte[] bArr;
            boolean z11 = aVar.f;
            Uri uri = aVar.f6718b;
            if (z11 && uri == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            sc.b.C(z10);
            UUID uuid = aVar.f6717a;
            uuid.getClass();
            this.f6710a = uuid;
            this.f6711b = uri;
            this.f6712c = aVar.f6719c;
            this.f6713d = aVar.f6720d;
            this.f = z11;
            this.f6714e = aVar.f6721e;
            this.f6715g = aVar.f6722g;
            byte[] bArr2 = aVar.f6723h;
            if (bArr2 != null) {
                bArr = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                bArr = null;
            }
            this.f6716h = bArr;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f6710a.equals(dVar.f6710a) && c9.w.a(this.f6711b, dVar.f6711b) && c9.w.a(this.f6712c, dVar.f6712c) && this.f6713d == dVar.f6713d && this.f == dVar.f && this.f6714e == dVar.f6714e && this.f6715g.equals(dVar.f6715g) && Arrays.equals(this.f6716h, dVar.f6716h)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i6;
            int hashCode = this.f6710a.hashCode() * 31;
            Uri uri = this.f6711b;
            if (uri != null) {
                i6 = uri.hashCode();
            } else {
                i6 = 0;
            }
            int hashCode2 = this.f6712c.hashCode();
            int hashCode3 = this.f6715g.hashCode();
            return Arrays.hashCode(this.f6716h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i6) * 31)) * 31) + (this.f6713d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.f6714e ? 1 : 0)) * 31)) * 31);
        }

        /* compiled from: MediaItem.java */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            public final UUID f6717a;

            /* renamed from: b  reason: collision with root package name */
            public final Uri f6718b;

            /* renamed from: c  reason: collision with root package name */
            public final com.google.common.collect.t<String, String> f6719c;

            /* renamed from: d  reason: collision with root package name */
            public final boolean f6720d;

            /* renamed from: e  reason: collision with root package name */
            public final boolean f6721e;
            public final boolean f;

            /* renamed from: g  reason: collision with root package name */
            public final com.google.common.collect.s<Integer> f6722g;

            /* renamed from: h  reason: collision with root package name */
            public final byte[] f6723h;

            public a() {
                this.f6719c = m0.A;
                s.b bVar = com.google.common.collect.s.f9446v;
                this.f6722g = l0.f9412y;
            }

            public a(d dVar) {
                this.f6717a = dVar.f6710a;
                this.f6718b = dVar.f6711b;
                this.f6719c = dVar.f6712c;
                this.f6720d = dVar.f6713d;
                this.f6721e = dVar.f6714e;
                this.f = dVar.f;
                this.f6722g = dVar.f6715g;
                this.f6723h = dVar.f6716h;
            }
        }
    }

    /* compiled from: MediaItem.java */
    /* loaded from: classes.dex */
    public static final class e implements com.google.android.exoplayer2.f {

        /* renamed from: u  reason: collision with root package name */
        public final long f6725u;

        /* renamed from: v  reason: collision with root package name */
        public final long f6726v;

        /* renamed from: w  reason: collision with root package name */
        public final long f6727w;

        /* renamed from: x  reason: collision with root package name */
        public final float f6728x;

        /* renamed from: y  reason: collision with root package name */
        public final float f6729y;

        /* renamed from: z  reason: collision with root package name */
        public static final e f6724z = new e(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);
        public static final com.google.firebase.messaging.j A = new com.google.firebase.messaging.j(6);

        @Deprecated
        public e(long j10, long j11, long j12, float f, float f2) {
            this.f6725u = j10;
            this.f6726v = j11;
            this.f6727w = j12;
            this.f6728x = f;
            this.f6729y = f2;
        }

        public static String b(int i6) {
            return Integer.toString(i6, 36);
        }

        @Override // com.google.android.exoplayer2.f
        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putLong(b(0), this.f6725u);
            bundle.putLong(b(1), this.f6726v);
            bundle.putLong(b(2), this.f6727w);
            bundle.putFloat(b(3), this.f6728x);
            bundle.putFloat(b(4), this.f6729y);
            return bundle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f6725u == eVar.f6725u && this.f6726v == eVar.f6726v && this.f6727w == eVar.f6727w && this.f6728x == eVar.f6728x && this.f6729y == eVar.f6729y) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i6;
            long j10 = this.f6725u;
            long j11 = this.f6726v;
            long j12 = this.f6727w;
            int i10 = ((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            int i11 = 0;
            float f = this.f6728x;
            if (f != 0.0f) {
                i6 = Float.floatToIntBits(f);
            } else {
                i6 = 0;
            }
            int i12 = (i10 + i6) * 31;
            float f2 = this.f6729y;
            if (f2 != 0.0f) {
                i11 = Float.floatToIntBits(f2);
            }
            return i12 + i11;
        }

        /* compiled from: MediaItem.java */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            public long f6730a;

            /* renamed from: b  reason: collision with root package name */
            public long f6731b;

            /* renamed from: c  reason: collision with root package name */
            public long f6732c;

            /* renamed from: d  reason: collision with root package name */
            public float f6733d;

            /* renamed from: e  reason: collision with root package name */
            public float f6734e;

            public a() {
                this.f6730a = -9223372036854775807L;
                this.f6731b = -9223372036854775807L;
                this.f6732c = -9223372036854775807L;
                this.f6733d = -3.4028235E38f;
                this.f6734e = -3.4028235E38f;
            }

            public a(e eVar) {
                this.f6730a = eVar.f6725u;
                this.f6731b = eVar.f6726v;
                this.f6732c = eVar.f6727w;
                this.f6733d = eVar.f6728x;
                this.f6734e = eVar.f6729y;
            }
        }
    }

    /* compiled from: MediaItem.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f6689a;

        /* renamed from: b  reason: collision with root package name */
        public Uri f6690b;

        /* renamed from: c  reason: collision with root package name */
        public String f6691c;

        /* renamed from: d  reason: collision with root package name */
        public final b.a f6692d;

        /* renamed from: e  reason: collision with root package name */
        public d.a f6693e;
        public final List<Object> f;

        /* renamed from: g  reason: collision with root package name */
        public String f6694g;

        /* renamed from: h  reason: collision with root package name */
        public com.google.common.collect.s<i> f6695h;

        /* renamed from: i  reason: collision with root package name */
        public Object f6696i;

        /* renamed from: j  reason: collision with root package name */
        public r f6697j;

        /* renamed from: k  reason: collision with root package name */
        public e.a f6698k;

        public a() {
            this.f6692d = new b.a();
            this.f6693e = new d.a();
            this.f = Collections.emptyList();
            this.f6695h = l0.f9412y;
            this.f6698k = new e.a();
        }

        public final q a() {
            boolean z10;
            g gVar;
            d.a aVar = this.f6693e;
            if (aVar.f6718b != null && aVar.f6717a == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            sc.b.C(z10);
            Uri uri = this.f6690b;
            d dVar = null;
            if (uri != null) {
                String str = this.f6691c;
                d.a aVar2 = this.f6693e;
                if (aVar2.f6717a != null) {
                    dVar = new d(aVar2);
                }
                gVar = new g(uri, str, dVar, this.f, this.f6694g, this.f6695h, this.f6696i);
            } else {
                gVar = null;
            }
            String str2 = this.f6689a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            b.a aVar3 = this.f6692d;
            aVar3.getClass();
            c cVar = new c(aVar3);
            e.a aVar4 = this.f6698k;
            e eVar = new e(aVar4.f6730a, aVar4.f6731b, aVar4.f6732c, aVar4.f6733d, aVar4.f6734e);
            r rVar = this.f6697j;
            if (rVar == null) {
                rVar = r.f6751a0;
            }
            return new q(str3, cVar, gVar, eVar, rVar);
        }

        public a(q qVar) {
            this();
            d.a aVar;
            c cVar = qVar.f6688y;
            cVar.getClass();
            this.f6692d = new b.a(cVar);
            this.f6689a = qVar.f6684u;
            this.f6697j = qVar.f6687x;
            e eVar = qVar.f6686w;
            eVar.getClass();
            this.f6698k = new e.a(eVar);
            g gVar = qVar.f6685v;
            if (gVar != null) {
                this.f6694g = gVar.f6739e;
                this.f6691c = gVar.f6736b;
                this.f6690b = gVar.f6735a;
                this.f = gVar.f6738d;
                this.f6695h = gVar.f;
                this.f6696i = gVar.f6740g;
                d dVar = gVar.f6737c;
                if (dVar != null) {
                    aVar = new d.a(dVar);
                } else {
                    aVar = new d.a();
                }
                this.f6693e = aVar;
            }
        }
    }
}
