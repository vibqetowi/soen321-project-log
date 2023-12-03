package b8;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.recyclerview.widget.LinearLayoutManager;
import b8.a;
import b8.h;
import c9.q;
import c9.w;
import com.appsflyer.R;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.b;
import com.google.android.exoplayer2.n;
import com.theinnerhour.b2b.utils.Constants;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import u7.p;
import u7.s;
import u7.t;
import u7.v;
/* compiled from: FragmentedMp4Extractor.java */
/* loaded from: classes.dex */
public final class e implements u7.h {
    public static final byte[] F = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final n G;
    public boolean A;
    public u7.j B;
    public v[] C;
    public v[] D;
    public boolean E;

    /* renamed from: a  reason: collision with root package name */
    public final int f3996a;

    /* renamed from: b  reason: collision with root package name */
    public final List<n> f3997b;

    /* renamed from: c  reason: collision with root package name */
    public final SparseArray<b> f3998c;

    /* renamed from: d  reason: collision with root package name */
    public final q f3999d;

    /* renamed from: e  reason: collision with root package name */
    public final q f4000e;
    public final q f;

    /* renamed from: g  reason: collision with root package name */
    public final byte[] f4001g;

    /* renamed from: h  reason: collision with root package name */
    public final q f4002h;

    /* renamed from: i  reason: collision with root package name */
    public final androidx.appcompat.widget.l f4003i;

    /* renamed from: j  reason: collision with root package name */
    public final q f4004j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayDeque<a.C0077a> f4005k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayDeque<a> f4006l;

    /* renamed from: m  reason: collision with root package name */
    public int f4007m;

    /* renamed from: n  reason: collision with root package name */
    public int f4008n;

    /* renamed from: o  reason: collision with root package name */
    public long f4009o;

    /* renamed from: p  reason: collision with root package name */
    public int f4010p;

    /* renamed from: q  reason: collision with root package name */
    public q f4011q;
    public long r;

    /* renamed from: s  reason: collision with root package name */
    public int f4012s;

    /* renamed from: t  reason: collision with root package name */
    public long f4013t;

    /* renamed from: u  reason: collision with root package name */
    public long f4014u;

    /* renamed from: v  reason: collision with root package name */
    public long f4015v;

    /* renamed from: w  reason: collision with root package name */
    public b f4016w;

    /* renamed from: x  reason: collision with root package name */
    public int f4017x;

    /* renamed from: y  reason: collision with root package name */
    public int f4018y;

    /* renamed from: z  reason: collision with root package name */
    public int f4019z;

    /* compiled from: FragmentedMp4Extractor.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f4020a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4021b;

        public a(int i6, long j10) {
            this.f4020a = j10;
            this.f4021b = i6;
        }
    }

    /* compiled from: FragmentedMp4Extractor.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final v f4022a;

        /* renamed from: d  reason: collision with root package name */
        public m f4025d;

        /* renamed from: e  reason: collision with root package name */
        public c f4026e;
        public int f;

        /* renamed from: g  reason: collision with root package name */
        public int f4027g;

        /* renamed from: h  reason: collision with root package name */
        public int f4028h;

        /* renamed from: i  reason: collision with root package name */
        public int f4029i;

        /* renamed from: l  reason: collision with root package name */
        public boolean f4032l;

        /* renamed from: b  reason: collision with root package name */
        public final l f4023b = new l();

        /* renamed from: c  reason: collision with root package name */
        public final q f4024c = new q();

        /* renamed from: j  reason: collision with root package name */
        public final q f4030j = new q(1);

        /* renamed from: k  reason: collision with root package name */
        public final q f4031k = new q();

        public b(v vVar, m mVar, c cVar) {
            this.f4022a = vVar;
            this.f4025d = mVar;
            this.f4026e = cVar;
            this.f4025d = mVar;
            this.f4026e = cVar;
            vVar.e(mVar.f4102a.f);
            d();
        }

        public final k a() {
            if (!this.f4032l) {
                return null;
            }
            l lVar = this.f4023b;
            c cVar = lVar.f4086a;
            int i6 = w.f5205a;
            int i10 = cVar.f3991a;
            k kVar = lVar.f4097m;
            if (kVar == null) {
                k[] kVarArr = this.f4025d.f4102a.f4080k;
                if (kVarArr == null) {
                    kVar = null;
                } else {
                    kVar = kVarArr[i10];
                }
            }
            if (kVar == null || !kVar.f4081a) {
                return null;
            }
            return kVar;
        }

        public final boolean b() {
            this.f++;
            if (!this.f4032l) {
                return false;
            }
            int i6 = this.f4027g + 1;
            this.f4027g = i6;
            int[] iArr = this.f4023b.f4091g;
            int i10 = this.f4028h;
            if (i6 != iArr[i10]) {
                return true;
            }
            this.f4028h = i10 + 1;
            this.f4027g = 0;
            return false;
        }

        public final int c(int i6, int i10) {
            q qVar;
            boolean z10;
            boolean z11;
            int i11;
            k a10 = a();
            if (a10 == null) {
                return 0;
            }
            l lVar = this.f4023b;
            int i12 = a10.f4084d;
            if (i12 != 0) {
                qVar = lVar.f4098n;
            } else {
                int i13 = w.f5205a;
                byte[] bArr = a10.f4085e;
                int length = bArr.length;
                q qVar2 = this.f4031k;
                qVar2.y(bArr, length);
                i12 = bArr.length;
                qVar = qVar2;
            }
            int i14 = this.f;
            if (lVar.f4095k && lVar.f4096l[i14]) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && i10 == 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            q qVar3 = this.f4030j;
            byte[] bArr2 = qVar3.f5186a;
            if (z11) {
                i11 = 128;
            } else {
                i11 = 0;
            }
            bArr2[0] = (byte) (i11 | i12);
            qVar3.A(0);
            v vVar = this.f4022a;
            vVar.b(qVar3, 1);
            vVar.b(qVar, i12);
            if (!z11) {
                return i12 + 1;
            }
            q qVar4 = this.f4024c;
            if (!z10) {
                qVar4.x(8);
                byte[] bArr3 = qVar4.f5186a;
                bArr3[0] = 0;
                bArr3[1] = 1;
                bArr3[2] = (byte) ((i10 >> 8) & 255);
                bArr3[3] = (byte) (i10 & 255);
                bArr3[4] = (byte) ((i6 >> 24) & 255);
                bArr3[5] = (byte) ((i6 >> 16) & 255);
                bArr3[6] = (byte) ((i6 >> 8) & 255);
                bArr3[7] = (byte) (i6 & 255);
                vVar.b(qVar4, 8);
                return i12 + 1 + 8;
            }
            q qVar5 = lVar.f4098n;
            int v10 = qVar5.v();
            qVar5.B(-2);
            int i15 = (v10 * 6) + 2;
            if (i10 != 0) {
                qVar4.x(i15);
                byte[] bArr4 = qVar4.f5186a;
                qVar5.b(0, bArr4, i15);
                int i16 = (((bArr4[2] & 255) << 8) | (bArr4[3] & 255)) + i10;
                bArr4[2] = (byte) ((i16 >> 8) & 255);
                bArr4[3] = (byte) (i16 & 255);
            } else {
                qVar4 = qVar5;
            }
            vVar.b(qVar4, i15);
            return i12 + 1 + i15;
        }

        public final void d() {
            l lVar = this.f4023b;
            lVar.f4089d = 0;
            lVar.f4100p = 0L;
            lVar.f4101q = false;
            lVar.f4095k = false;
            lVar.f4099o = false;
            lVar.f4097m = null;
            this.f = 0;
            this.f4028h = 0;
            this.f4027g = 0;
            this.f4029i = 0;
            this.f4032l = false;
        }
    }

    static {
        n.a aVar = new n.a();
        aVar.f6665k = "application/x-emsg";
        G = aVar.a();
    }

    public e() {
        List emptyList = Collections.emptyList();
        this.f3996a = 0;
        this.f3997b = Collections.unmodifiableList(emptyList);
        this.f4003i = new androidx.appcompat.widget.l(13);
        this.f4004j = new q(16);
        this.f3999d = new q(c9.m.f5155a);
        this.f4000e = new q(5);
        this.f = new q();
        byte[] bArr = new byte[16];
        this.f4001g = bArr;
        this.f4002h = new q(bArr);
        this.f4005k = new ArrayDeque<>();
        this.f4006l = new ArrayDeque<>();
        this.f3998c = new SparseArray<>();
        this.f4014u = -9223372036854775807L;
        this.f4013t = -9223372036854775807L;
        this.f4015v = -9223372036854775807L;
        this.B = u7.j.f33880t;
        this.C = new v[0];
        this.D = new v[0];
    }

    public static com.google.android.exoplayer2.drm.b c(ArrayList arrayList) {
        UUID uuid;
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i6 = 0; i6 < size; i6++) {
            a.b bVar = (a.b) arrayList.get(i6);
            if (bVar.f3965a == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = bVar.f3969b.f5186a;
                h.a a10 = h.a(bArr);
                if (a10 == null) {
                    uuid = null;
                } else {
                    uuid = a10.f4061a;
                }
                if (uuid == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new b.C0134b(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new com.google.android.exoplayer2.drm.b(null, false, (b.C0134b[]) arrayList2.toArray(new b.C0134b[0]));
    }

    public static void d(q qVar, int i6, l lVar) {
        boolean z10;
        qVar.A(i6 + 8);
        int c10 = qVar.c() & 16777215;
        if ((c10 & 1) == 0) {
            if ((c10 & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int t3 = qVar.t();
            if (t3 == 0) {
                Arrays.fill(lVar.f4096l, 0, lVar.f4090e, false);
                return;
            }
            int i10 = lVar.f4090e;
            if (t3 == i10) {
                Arrays.fill(lVar.f4096l, 0, t3, z10);
                int i11 = qVar.f5188c - qVar.f5187b;
                q qVar2 = lVar.f4098n;
                qVar2.x(i11);
                lVar.f4095k = true;
                lVar.f4099o = true;
                qVar.b(0, qVar2.f5186a, qVar2.f5188c);
                qVar2.A(0);
                lVar.f4099o = false;
                return;
            }
            StringBuilder sb2 = new StringBuilder(80);
            sb2.append("Senc sample count ");
            sb2.append(t3);
            sb2.append(" is different from fragment sample count");
            sb2.append(i10);
            throw ParserException.a(sb2.toString(), null);
        }
        throw ParserException.b("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    @Override // u7.h
    public final boolean b(u7.i iVar) {
        return kotlin.jvm.internal.h.g0(iVar, true, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:333:0x07ab, code lost:
        r6 = r0;
        r6.f4007m = 0;
        r6.f4010p = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x07b1, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0697  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(long j10) {
        e eVar;
        k kVar;
        String str;
        e eVar2;
        ArrayList arrayList;
        int i6;
        int i10;
        ArrayList arrayList2;
        SparseArray<b> sparseArray;
        e eVar3;
        int i11;
        int i12;
        int i13;
        int i14;
        k kVar2;
        String str2;
        int size;
        int i15;
        boolean z10;
        long u10;
        boolean z11;
        boolean z12;
        int i16;
        boolean z13;
        int i17;
        int i18;
        int i19;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i20;
        a.C0077a c0077a;
        SparseArray<b> sparseArray2;
        b bVar;
        l lVar;
        int i21;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i22;
        boolean z19;
        int i23;
        int i24;
        int i25;
        boolean z20;
        boolean z21;
        boolean z22;
        int i26;
        c cVar;
        long j11;
        b bVar2;
        boolean z23;
        long r;
        boolean z24;
        boolean z25;
        c cVar2;
        c cVar3;
        ArrayList arrayList5;
        e eVar4 = this;
        final e eVar5 = eVar4;
        while (true) {
            ArrayDeque<a.C0077a> arrayDeque = eVar5.f4005k;
            if (arrayDeque.isEmpty() || arrayDeque.peek().f3966b != j10) {
                break;
            }
            a.C0077a pop = arrayDeque.pop();
            int i27 = pop.f3965a;
            SparseArray<b> sparseArray3 = eVar5.f3998c;
            ArrayList arrayList6 = pop.f3967c;
            int i28 = 12;
            if (i27 == 1836019574) {
                com.google.android.exoplayer2.drm.b c10 = c(arrayList6);
                a.C0077a b10 = pop.b(1836475768);
                b10.getClass();
                SparseArray sparseArray4 = new SparseArray();
                ArrayList arrayList7 = b10.f3967c;
                int size2 = arrayList7.size();
                long j12 = -9223372036854775807L;
                int i29 = 0;
                while (i29 < size2) {
                    a.b bVar3 = (a.b) arrayList7.get(i29);
                    int i30 = bVar3.f3965a;
                    q qVar = bVar3.f3969b;
                    if (i30 == 1953654136) {
                        qVar.A(i28);
                        arrayList5 = arrayList7;
                        Pair create = Pair.create(Integer.valueOf(qVar.c()), new c(qVar.c() - 1, qVar.c(), qVar.c(), qVar.c()));
                        sparseArray4.put(((Integer) create.first).intValue(), (c) create.second);
                    } else {
                        arrayList5 = arrayList7;
                        if (i30 == 1835362404) {
                            qVar.A(8);
                            if (((qVar.c() >> 24) & 255) == 0) {
                                j12 = qVar.r();
                            } else {
                                j12 = qVar.u();
                            }
                        }
                    }
                    i29++;
                    arrayList7 = arrayList5;
                    i28 = 12;
                }
                p pVar = new p();
                if ((eVar5.f3996a & 16) != 0) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                ArrayList e10 = b8.b.e(pop, pVar, j12, c10, z24, false, new nc.e() { // from class: b8.d
                    @Override // nc.e
                    public final Object apply(Object obj) {
                        j jVar = (j) obj;
                        e.this.getClass();
                        return jVar;
                    }
                });
                int size3 = e10.size();
                if (sparseArray3.size() == 0) {
                    for (int i31 = 0; i31 < size3; i31++) {
                        m mVar = (m) e10.get(i31);
                        j jVar = mVar.f4102a;
                        v n10 = eVar5.B.n(i31, jVar.f4072b);
                        int size4 = sparseArray4.size();
                        int i32 = jVar.f4071a;
                        if (size4 == 1) {
                            cVar3 = (c) sparseArray4.valueAt(0);
                        } else {
                            cVar3 = (c) sparseArray4.get(i32);
                            cVar3.getClass();
                        }
                        sparseArray3.put(i32, new b(n10, mVar, cVar3));
                        eVar5.f4014u = Math.max(eVar5.f4014u, jVar.f4075e);
                    }
                    eVar5.B.e();
                } else {
                    if (sparseArray3.size() == size3) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    sc.b.C(z25);
                    for (int i33 = 0; i33 < size3; i33++) {
                        m mVar2 = (m) e10.get(i33);
                        j jVar2 = mVar2.f4102a;
                        b bVar4 = sparseArray3.get(jVar2.f4071a);
                        if (sparseArray4.size() == 1) {
                            cVar2 = (c) sparseArray4.valueAt(0);
                        } else {
                            cVar2 = (c) sparseArray4.get(jVar2.f4071a);
                            cVar2.getClass();
                        }
                        bVar4.f4025d = mVar2;
                        bVar4.f4026e = cVar2;
                        bVar4.f4022a.e(mVar2.f4102a.f);
                        bVar4.d();
                    }
                }
                eVar = eVar4;
            } else if (i27 == 1836019558) {
                ArrayList arrayList8 = pop.f3968d;
                int size5 = arrayList8.size();
                e eVar6 = eVar5;
                int i34 = 0;
                while (i34 < size5) {
                    a.C0077a c0077a2 = (a.C0077a) arrayList8.get(i34);
                    if (c0077a2.f3965a == 1953653094) {
                        a.b c11 = c0077a2.c(1952868452);
                        c11.getClass();
                        q qVar2 = c11.f3969b;
                        qVar2.A(8);
                        int c12 = qVar2.c() & 16777215;
                        b bVar5 = sparseArray3.get(qVar2.c());
                        if (bVar5 == null) {
                            eVar2 = eVar5;
                            bVar5 = null;
                        } else {
                            int i35 = c12 & 1;
                            l lVar2 = bVar5.f4023b;
                            if (i35 != 0) {
                                long u11 = qVar2.u();
                                lVar2.f4087b = u11;
                                lVar2.f4088c = u11;
                                bVar5 = bVar5;
                            }
                            c cVar4 = bVar5.f4026e;
                            int c13 = (c12 & 2) != 0 ? qVar2.c() - 1 : cVar4.f3991a;
                            if ((c12 & 8) != 0) {
                                i11 = qVar2.c();
                            } else {
                                i11 = cVar4.f3992b;
                            }
                            if ((c12 & 16) != 0) {
                                eVar2 = eVar5;
                                i12 = qVar2.c();
                            } else {
                                eVar2 = eVar5;
                                i12 = cVar4.f3993c;
                            }
                            if ((c12 & 32) != 0) {
                                i13 = qVar2.c();
                            } else {
                                i13 = cVar4.f3994d;
                            }
                            lVar2.f4086a = new c(c13, i11, i12, i13);
                        }
                        if (bVar5 != null) {
                            l lVar3 = bVar5.f4023b;
                            long j13 = lVar3.f4100p;
                            boolean z26 = lVar3.f4101q;
                            bVar5.d();
                            bVar5.f4032l = true;
                            a.b c14 = c0077a2.c(1952867444);
                            int i36 = eVar6.f3996a;
                            if (c14 != null && (i36 & 2) == 0) {
                                q qVar3 = c14.f3969b;
                                qVar3.A(8);
                                if (((qVar3.c() >> 24) & 255) == 1) {
                                    r = qVar3.u();
                                } else {
                                    r = qVar3.r();
                                }
                                lVar3.f4100p = r;
                                lVar3.f4101q = true;
                            } else {
                                lVar3.f4100p = j13;
                                lVar3.f4101q = z26;
                            }
                            ArrayList arrayList9 = c0077a2.f3967c;
                            int size6 = arrayList9.size();
                            int i37 = 0;
                            int i38 = 0;
                            int i39 = 0;
                            while (true) {
                                i14 = 1953658222;
                                if (i37 >= size6) {
                                    break;
                                }
                                ArrayList arrayList10 = arrayList8;
                                a.b bVar6 = (a.b) arrayList9.get(i37);
                                int i40 = size5;
                                if (bVar6.f3965a == 1953658222) {
                                    q qVar4 = bVar6.f3969b;
                                    qVar4.A(12);
                                    int t3 = qVar4.t();
                                    if (t3 > 0) {
                                        i39 += t3;
                                        i38++;
                                    }
                                }
                                i37++;
                                arrayList8 = arrayList10;
                                size5 = i40;
                            }
                            arrayList = arrayList8;
                            i6 = size5;
                            bVar5.f4028h = 0;
                            bVar5.f4027g = 0;
                            bVar5.f = 0;
                            lVar3.f4089d = i38;
                            lVar3.f4090e = i39;
                            if (lVar3.f4091g.length < i38) {
                                lVar3.f = new long[i38];
                                lVar3.f4091g = new int[i38];
                            }
                            if (lVar3.f4092h.length < i39) {
                                int i41 = (i39 * R.styleable.AppCompatTheme_windowMinWidthMinor) / 100;
                                lVar3.f4092h = new int[i41];
                                lVar3.f4093i = new long[i41];
                                lVar3.f4094j = new boolean[i41];
                                lVar3.f4096l = new boolean[i41];
                            }
                            int i42 = 0;
                            int i43 = 0;
                            int i44 = 0;
                            while (true) {
                                long j14 = 0;
                                if (i42 < size6) {
                                    a.b bVar7 = (a.b) arrayList9.get(i42);
                                    if (bVar7.f3965a == i14) {
                                        int i45 = i44 + 1;
                                        q qVar5 = bVar7.f3969b;
                                        qVar5.A(8);
                                        int c15 = qVar5.c() & 16777215;
                                        j jVar3 = bVar5.f4025d.f4102a;
                                        i20 = size6;
                                        c cVar5 = lVar3.f4086a;
                                        int i46 = w.f5205a;
                                        lVar3.f4091g[i44] = qVar5.t();
                                        long[] jArr = lVar3.f;
                                        i19 = i34;
                                        arrayList3 = arrayList6;
                                        long j15 = lVar3.f4087b;
                                        jArr[i44] = j15;
                                        if ((c15 & 1) != 0) {
                                            sparseArray2 = sparseArray3;
                                            i17 = i42;
                                            i21 = i43;
                                            jArr[i44] = j15 + qVar5.c();
                                        } else {
                                            i17 = i42;
                                            i21 = i43;
                                            sparseArray2 = sparseArray3;
                                        }
                                        if ((c15 & 4) != 0) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        int i47 = cVar5.f3994d;
                                        if (z14) {
                                            i47 = qVar5.c();
                                        }
                                        if ((c15 & 256) != 0) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        if ((c15 & 512) != 0) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        if ((c15 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                        if ((c15 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                        long[] jArr2 = jVar3.f4077h;
                                        if (jArr2 != null) {
                                            i22 = i47;
                                            if (jArr2.length == 1 && jArr2[0] == 0) {
                                                j14 = jVar3.f4078i[0];
                                            }
                                        } else {
                                            i22 = i47;
                                        }
                                        int[] iArr = lVar3.f4092h;
                                        long[] jArr3 = lVar3.f4093i;
                                        boolean[] zArr = lVar3.f4094j;
                                        arrayList4 = arrayList9;
                                        c0077a = c0077a2;
                                        if (jVar3.f4072b == 2 && (i36 & 1) != 0) {
                                            z19 = true;
                                        } else {
                                            z19 = false;
                                        }
                                        int i48 = lVar3.f4091g[i44] + i21;
                                        b bVar8 = bVar5;
                                        long j16 = jVar3.f4073c;
                                        int i49 = i36;
                                        l lVar4 = lVar3;
                                        long j17 = lVar3.f4100p;
                                        int i50 = i21;
                                        while (i50 < i48) {
                                            if (z15) {
                                                i23 = qVar5.c();
                                            } else {
                                                i23 = cVar5.f3992b;
                                            }
                                            boolean z27 = z15;
                                            int i51 = i49;
                                            if (i23 >= 0) {
                                                if (z16) {
                                                    i24 = qVar5.c();
                                                } else {
                                                    i24 = cVar5.f3993c;
                                                }
                                                if (i24 >= 0) {
                                                    if (z17) {
                                                        i25 = qVar5.c();
                                                    } else if (i50 == 0 && z14) {
                                                        i25 = i22;
                                                    } else {
                                                        i25 = cVar5.f3994d;
                                                    }
                                                    if (z18) {
                                                        z20 = z14;
                                                        z21 = z17;
                                                        z22 = z18;
                                                        i26 = qVar5.c();
                                                    } else {
                                                        z20 = z14;
                                                        z21 = z17;
                                                        z22 = z18;
                                                        i26 = 0;
                                                    }
                                                    long C = w.C((i26 + j17) - j14, 1000000L, j16);
                                                    jArr3[i50] = C;
                                                    boolean z28 = z16;
                                                    l lVar5 = lVar4;
                                                    if (!lVar5.f4101q) {
                                                        cVar = cVar5;
                                                        bVar2 = bVar8;
                                                        j11 = j16;
                                                        jArr3[i50] = C + bVar2.f4025d.f4108h;
                                                    } else {
                                                        cVar = cVar5;
                                                        j11 = j16;
                                                        bVar2 = bVar8;
                                                    }
                                                    iArr[i50] = i24;
                                                    if (((i25 >> 16) & 1) == 0 && (!z19 || i50 == 0)) {
                                                        z23 = true;
                                                    } else {
                                                        z23 = false;
                                                    }
                                                    zArr[i50] = z23;
                                                    j17 += i23;
                                                    i50++;
                                                    lVar4 = lVar5;
                                                    bVar8 = bVar2;
                                                    z16 = z28;
                                                    cVar5 = cVar;
                                                    j16 = j11;
                                                    z15 = z27;
                                                    i49 = i51;
                                                    z14 = z20;
                                                    z17 = z21;
                                                    z18 = z22;
                                                } else {
                                                    StringBuilder sb2 = new StringBuilder(38);
                                                    sb2.append("Unexpected negative value: ");
                                                    sb2.append(i24);
                                                    throw ParserException.a(sb2.toString(), null);
                                                }
                                            } else {
                                                StringBuilder sb3 = new StringBuilder(38);
                                                sb3.append("Unexpected negative value: ");
                                                sb3.append(i23);
                                                throw ParserException.a(sb3.toString(), null);
                                            }
                                        }
                                        i18 = i49;
                                        bVar = bVar8;
                                        lVar = lVar4;
                                        lVar.f4100p = j17;
                                        i43 = i48;
                                        i44 = i45;
                                    } else {
                                        i17 = i42;
                                        i18 = i36;
                                        i19 = i34;
                                        arrayList3 = arrayList6;
                                        arrayList4 = arrayList9;
                                        i20 = size6;
                                        c0077a = c0077a2;
                                        sparseArray2 = sparseArray3;
                                        bVar = bVar5;
                                        lVar = lVar3;
                                    }
                                    lVar3 = lVar;
                                    bVar5 = bVar;
                                    size6 = i20;
                                    arrayList6 = arrayList3;
                                    i34 = i19;
                                    sparseArray3 = sparseArray2;
                                    arrayList9 = arrayList4;
                                    c0077a2 = c0077a;
                                    i36 = i18;
                                    i14 = 1953658222;
                                    i42 = i17 + 1;
                                } else {
                                    l lVar6 = lVar3;
                                    i10 = i34;
                                    arrayList2 = arrayList6;
                                    ArrayList arrayList11 = arrayList9;
                                    a.C0077a c0077a3 = c0077a2;
                                    sparseArray = sparseArray3;
                                    j jVar4 = bVar5.f4025d.f4102a;
                                    c cVar6 = lVar6.f4086a;
                                    cVar6.getClass();
                                    k[] kVarArr = jVar4.f4080k;
                                    if (kVarArr == null) {
                                        kVar2 = null;
                                    } else {
                                        kVar2 = kVarArr[cVar6.f3991a];
                                    }
                                    a.b c16 = c0077a3.c(1935763834);
                                    if (c16 != null) {
                                        kVar2.getClass();
                                        q qVar6 = c16.f3969b;
                                        qVar6.A(8);
                                        if ((qVar6.c() & 16777215 & 1) == 1) {
                                            qVar6.B(8);
                                        }
                                        int q10 = qVar6.q();
                                        int t10 = qVar6.t();
                                        int i52 = lVar6.f4090e;
                                        if (t10 <= i52) {
                                            int i53 = kVar2.f4084d;
                                            if (q10 == 0) {
                                                boolean[] zArr2 = lVar6.f4096l;
                                                i16 = 0;
                                                for (int i54 = 0; i54 < t10; i54++) {
                                                    int q11 = qVar6.q();
                                                    i16 += q11;
                                                    if (q11 > i53) {
                                                        z13 = true;
                                                    } else {
                                                        z13 = false;
                                                    }
                                                    zArr2[i54] = z13;
                                                }
                                                z12 = false;
                                            } else {
                                                if (q10 > i53) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                z12 = false;
                                                i16 = (q10 * t10) + 0;
                                                Arrays.fill(lVar6.f4096l, 0, t10, z11);
                                            }
                                            Arrays.fill(lVar6.f4096l, t10, lVar6.f4090e, z12);
                                            if (i16 > 0) {
                                                lVar6.f4098n.x(i16);
                                                lVar6.f4095k = true;
                                                lVar6.f4099o = true;
                                            }
                                        } else {
                                            StringBuilder sb4 = new StringBuilder(78);
                                            sb4.append("Saiz sample count ");
                                            sb4.append(t10);
                                            sb4.append(" is greater than fragment sample count");
                                            sb4.append(i52);
                                            throw ParserException.a(sb4.toString(), null);
                                        }
                                    }
                                    a.b c17 = c0077a3.c(1935763823);
                                    if (c17 != null) {
                                        q qVar7 = c17.f3969b;
                                        qVar7.A(8);
                                        int c18 = qVar7.c();
                                        if ((16777215 & c18 & 1) == 1) {
                                            qVar7.B(8);
                                        }
                                        int t11 = qVar7.t();
                                        if (t11 == 1) {
                                            int i55 = (c18 >> 24) & 255;
                                            long j18 = lVar6.f4088c;
                                            if (i55 == 0) {
                                                u10 = qVar7.r();
                                            } else {
                                                u10 = qVar7.u();
                                            }
                                            lVar6.f4088c = j18 + u10;
                                        } else {
                                            StringBuilder sb5 = new StringBuilder(40);
                                            sb5.append("Unexpected saio entry count: ");
                                            sb5.append(t11);
                                            throw ParserException.a(sb5.toString(), null);
                                        }
                                    }
                                    byte[] bArr = null;
                                    a.b c19 = c0077a3.c(1936027235);
                                    if (c19 != null) {
                                        d(c19.f3969b, 0, lVar6);
                                    }
                                    if (kVar2 != null) {
                                        str2 = kVar2.f4082b;
                                    } else {
                                        str2 = null;
                                    }
                                    q qVar8 = null;
                                    q qVar9 = null;
                                    int i56 = 0;
                                    while (i56 < arrayList11.size()) {
                                        ArrayList arrayList12 = arrayList11;
                                        a.b bVar9 = (a.b) arrayList12.get(i56);
                                        q qVar10 = bVar9.f3969b;
                                        int i57 = bVar9.f3965a;
                                        if (i57 == 1935828848) {
                                            qVar10.A(12);
                                            if (qVar10.c() == 1936025959) {
                                                qVar8 = qVar10;
                                            }
                                        } else if (i57 == 1936158820) {
                                            qVar10.A(12);
                                            if (qVar10.c() == 1936025959) {
                                                qVar9 = qVar10;
                                            }
                                        }
                                        i56++;
                                        arrayList11 = arrayList12;
                                    }
                                    ArrayList arrayList13 = arrayList11;
                                    if (qVar8 != null && qVar9 != null) {
                                        qVar8.A(8);
                                        int c20 = (qVar8.c() >> 24) & 255;
                                        qVar8.B(4);
                                        if (c20 == 1) {
                                            qVar8.B(4);
                                        }
                                        if (qVar8.c() == 1) {
                                            qVar9.A(8);
                                            int c21 = (qVar9.c() >> 24) & 255;
                                            qVar9.B(4);
                                            if (c21 == 1) {
                                                if (qVar9.r() == 0) {
                                                    throw ParserException.b("Variable length description in sgpd found (unsupported)");
                                                }
                                            } else if (c21 >= 2) {
                                                qVar9.B(4);
                                            }
                                            if (qVar9.r() == 1) {
                                                qVar9.B(1);
                                                int q12 = qVar9.q();
                                                int i58 = (q12 & 240) >> 4;
                                                int i59 = q12 & 15;
                                                if (qVar9.q() == 1) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (z10) {
                                                    int q13 = qVar9.q();
                                                    byte[] bArr2 = new byte[16];
                                                    qVar9.b(0, bArr2, 16);
                                                    if (q13 == 0) {
                                                        int q14 = qVar9.q();
                                                        bArr = new byte[q14];
                                                        qVar9.b(0, bArr, q14);
                                                    }
                                                    lVar6.f4095k = true;
                                                    lVar6.f4097m = new k(z10, str2, q13, bArr2, i58, i59, bArr);
                                                    size = arrayList13.size();
                                                    for (i15 = 0; i15 < size; i15++) {
                                                        a.b bVar10 = (a.b) arrayList13.get(i15);
                                                        if (bVar10.f3965a == 1970628964) {
                                                            q qVar11 = bVar10.f3969b;
                                                            qVar11.A(8);
                                                            byte[] bArr3 = this.f4001g;
                                                            qVar11.b(0, bArr3, 16);
                                                            if (Arrays.equals(bArr3, F)) {
                                                                d(qVar11, 16, lVar6);
                                                            }
                                                        }
                                                    }
                                                    eVar3 = this;
                                                    eVar5 = eVar3;
                                                    eVar6 = eVar5;
                                                }
                                            } else {
                                                throw ParserException.b("Entry count in sgpd != 1 (unsupported).");
                                            }
                                        } else {
                                            throw ParserException.b("Entry count in sbgp != 1 (unsupported).");
                                        }
                                    }
                                    size = arrayList13.size();
                                    while (i15 < size) {
                                    }
                                    eVar3 = this;
                                    eVar5 = eVar3;
                                    eVar6 = eVar5;
                                }
                            }
                            i34 = i10 + 1;
                            eVar4 = eVar3;
                            arrayList8 = arrayList;
                            size5 = i6;
                            arrayList6 = arrayList2;
                            sparseArray3 = sparseArray;
                        }
                    } else {
                        eVar2 = eVar5;
                    }
                    arrayList = arrayList8;
                    i6 = size5;
                    i10 = i34;
                    arrayList2 = arrayList6;
                    sparseArray = sparseArray3;
                    eVar3 = eVar4;
                    eVar5 = eVar2;
                    i34 = i10 + 1;
                    eVar4 = eVar3;
                    arrayList8 = arrayList;
                    size5 = i6;
                    arrayList6 = arrayList2;
                    sparseArray3 = sparseArray;
                }
                e eVar7 = eVar5;
                ArrayList arrayList14 = arrayList6;
                SparseArray<b> sparseArray5 = sparseArray3;
                eVar = eVar4;
                com.google.android.exoplayer2.drm.b c22 = c(arrayList14);
                if (c22 != null) {
                    int size7 = sparseArray5.size();
                    int i60 = 0;
                    while (i60 < size7) {
                        SparseArray<b> sparseArray6 = sparseArray5;
                        b valueAt = sparseArray6.valueAt(i60);
                        j jVar5 = valueAt.f4025d.f4102a;
                        c cVar7 = valueAt.f4023b.f4086a;
                        int i61 = w.f5205a;
                        int i62 = cVar7.f3991a;
                        k[] kVarArr2 = jVar5.f4080k;
                        if (kVarArr2 == null) {
                            kVar = null;
                        } else {
                            kVar = kVarArr2[i62];
                        }
                        if (kVar != null) {
                            str = kVar.f4082b;
                        } else {
                            str = null;
                        }
                        com.google.android.exoplayer2.drm.b a10 = c22.a(str);
                        n nVar = valueAt.f4025d.f4102a.f;
                        nVar.getClass();
                        n.a aVar = new n.a(nVar);
                        aVar.f6668n = a10;
                        valueAt.f4022a.e(new n(aVar));
                        i60++;
                        sparseArray5 = sparseArray6;
                    }
                }
                SparseArray<b> sparseArray7 = sparseArray5;
                if (eVar6.f4013t != -9223372036854775807L) {
                    int size8 = sparseArray7.size();
                    for (int i63 = 0; i63 < size8; i63++) {
                        b valueAt2 = sparseArray7.valueAt(i63);
                        long j19 = eVar6.f4013t;
                        int i64 = valueAt2.f;
                        while (true) {
                            l lVar7 = valueAt2.f4023b;
                            if (i64 < lVar7.f4090e && lVar7.f4093i[i64] < j19) {
                                if (lVar7.f4094j[i64]) {
                                    valueAt2.f4029i = i64;
                                }
                                i64++;
                            }
                        }
                    }
                    eVar6.f4013t = -9223372036854775807L;
                }
                eVar5 = eVar7;
            } else {
                eVar = eVar4;
                if (!arrayDeque.isEmpty()) {
                    arrayDeque.peek().f3968d.add(pop);
                }
            }
            eVar4 = eVar;
        }
    }

    @Override // u7.h
    public final void f(u7.j jVar) {
        int i6;
        this.B = jVar;
        int i10 = 0;
        this.f4007m = 0;
        this.f4010p = 0;
        v[] vVarArr = new v[2];
        this.C = vVarArr;
        int i11 = 100;
        if ((this.f3996a & 4) != 0) {
            vVarArr[0] = jVar.n(100, 5);
            i6 = 1;
            i11 = R.styleable.AppCompatTheme_switchStyle;
        } else {
            i6 = 0;
        }
        v[] vVarArr2 = (v[]) w.A(i6, this.C);
        this.C = vVarArr2;
        for (v vVar : vVarArr2) {
            vVar.e(G);
        }
        List<n> list = this.f3997b;
        this.D = new v[list.size()];
        while (i10 < this.D.length) {
            v n10 = this.B.n(i11, 3);
            n10.e(list.get(i10));
            this.D[i10] = n10;
            i10++;
            i11++;
        }
    }

    @Override // u7.h
    public final void g(long j10, long j11) {
        SparseArray<b> sparseArray = this.f3998c;
        int size = sparseArray.size();
        for (int i6 = 0; i6 < size; i6++) {
            sparseArray.valueAt(i6).d();
        }
        this.f4006l.clear();
        this.f4012s = 0;
        this.f4013t = j11;
        this.f4005k.clear();
        this.f4007m = 0;
        this.f4010p = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d4, code lost:
        if ((r5 & 31) != 6) goto L112;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x02ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x076c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x076e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x076e A[SYNTHETIC] */
    @Override // u7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(u7.i iVar, s sVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        String k10;
        String k11;
        long C;
        long r;
        long j10;
        v[] vVarArr;
        long u10;
        long u11;
        int[] iArr;
        long j11;
        int i6;
        v.a aVar;
        j jVar;
        q qVar;
        int i10;
        int c10;
        boolean z13;
        boolean z14;
        boolean z15;
        int i11;
        int i12;
        boolean z16;
        long j12;
        long j13;
        u7.i iVar2 = iVar;
        e eVar = this;
        while (true) {
            int i13 = eVar.f4007m;
            ArrayDeque<a.C0077a> arrayDeque = eVar.f4005k;
            SparseArray<b> sparseArray = eVar.f3998c;
            if (i13 != 0) {
                ArrayDeque<a> arrayDeque2 = eVar.f4006l;
                if (i13 != 1) {
                    long j14 = Long.MAX_VALUE;
                    if (i13 != 2) {
                        b bVar = eVar.f4016w;
                        if (bVar == null) {
                            int size = sparseArray.size();
                            b bVar2 = null;
                            for (int i14 = 0; i14 < size; i14++) {
                                b valueAt = sparseArray.valueAt(i14);
                                boolean z17 = valueAt.f4032l;
                                if (z17 || valueAt.f != valueAt.f4025d.f4103b) {
                                    l lVar = valueAt.f4023b;
                                    if (!z17 || valueAt.f4028h != lVar.f4089d) {
                                        if (!z17) {
                                            j13 = valueAt.f4025d.f4104c[valueAt.f];
                                        } else {
                                            j13 = lVar.f[valueAt.f4028h];
                                        }
                                        if (j13 < j14) {
                                            bVar2 = valueAt;
                                            j14 = j13;
                                        }
                                    }
                                }
                            }
                            if (bVar2 == null) {
                                int position = (int) (eVar.r - iVar.getPosition());
                                if (position >= 0) {
                                    iVar2.l(position);
                                    eVar.f4007m = 0;
                                    eVar.f4010p = 0;
                                    z15 = false;
                                    if (z15) {
                                        return 0;
                                    }
                                } else {
                                    throw ParserException.a("Offset to end of mdat was negative.", null);
                                }
                            } else {
                                if (!bVar2.f4032l) {
                                    j12 = bVar2.f4025d.f4104c[bVar2.f];
                                } else {
                                    j12 = bVar2.f4023b.f[bVar2.f4028h];
                                }
                                int position2 = (int) (j12 - iVar.getPosition());
                                if (position2 < 0) {
                                    Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                    position2 = 0;
                                }
                                iVar2.l(position2);
                                eVar.f4016w = bVar2;
                                bVar = bVar2;
                            }
                        }
                        if (eVar.f4007m == 3) {
                            boolean z18 = bVar.f4032l;
                            l lVar2 = bVar.f4023b;
                            if (!z18) {
                                i11 = bVar.f4025d.f4105d[bVar.f];
                            } else {
                                i11 = lVar2.f4092h[bVar.f];
                            }
                            eVar.f4017x = i11;
                            if (bVar.f < bVar.f4029i) {
                                iVar2.l(i11);
                                k a10 = bVar.a();
                                if (a10 != null) {
                                    q qVar2 = lVar2.f4098n;
                                    int i15 = a10.f4084d;
                                    if (i15 != 0) {
                                        qVar2.B(i15);
                                    }
                                    int i16 = bVar.f;
                                    if (lVar2.f4095k && lVar2.f4096l[i16]) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    if (z16) {
                                        qVar2.B(qVar2.v() * 6);
                                    }
                                }
                                if (!bVar.b()) {
                                    eVar.f4016w = null;
                                }
                                eVar.f4007m = 3;
                                z15 = true;
                                if (z15) {
                                }
                            } else {
                                if (bVar.f4025d.f4102a.f4076g == 1) {
                                    eVar.f4017x = i11 - 8;
                                    iVar2.l(8);
                                }
                                if ("audio/ac4".equals(bVar.f4025d.f4102a.f.F)) {
                                    eVar.f4018y = bVar.c(eVar.f4017x, 7);
                                    int i17 = eVar.f4017x;
                                    q qVar3 = eVar.f4002h;
                                    q7.c.a(i17, qVar3);
                                    bVar.f4022a.a(7, qVar3);
                                    eVar.f4018y += 7;
                                    i12 = 0;
                                } else {
                                    i12 = 0;
                                    eVar.f4018y = bVar.c(eVar.f4017x, 0);
                                }
                                eVar.f4017x += eVar.f4018y;
                                eVar.f4007m = 4;
                                eVar.f4019z = i12;
                            }
                        }
                        m mVar = bVar.f4025d;
                        j jVar2 = mVar.f4102a;
                        v vVar = bVar.f4022a;
                        boolean z19 = bVar.f4032l;
                        l lVar3 = bVar.f4023b;
                        if (!z19) {
                            j11 = mVar.f[bVar.f];
                        } else {
                            j11 = lVar3.f4093i[bVar.f];
                        }
                        int i18 = jVar2.f4079j;
                        if (i18 == 0) {
                            while (true) {
                                int i19 = eVar.f4018y;
                                int i20 = eVar.f4017x;
                                if (i19 >= i20) {
                                    break;
                                }
                                eVar.f4018y += vVar.c(iVar2, i20 - i19, false);
                            }
                        } else {
                            q qVar4 = eVar.f4000e;
                            byte[] bArr = qVar4.f5186a;
                            bArr[0] = 0;
                            bArr[1] = 0;
                            bArr[2] = 0;
                            int i21 = i18 + 1;
                            int i22 = 4 - i18;
                            while (eVar.f4018y < eVar.f4017x) {
                                int i23 = eVar.f4019z;
                                n nVar = jVar2.f;
                                if (i23 == 0) {
                                    iVar2.readFully(bArr, i22, i21);
                                    qVar4.A(0);
                                    int c11 = qVar4.c();
                                    jVar = jVar2;
                                    if (c11 >= 1) {
                                        eVar.f4019z = c11 - 1;
                                        q qVar5 = eVar.f3999d;
                                        qVar5.A(0);
                                        vVar.a(4, qVar5);
                                        vVar.a(1, qVar4);
                                        if (eVar.D.length > 0) {
                                            String str = nVar.F;
                                            byte b10 = bArr[4];
                                            byte[] bArr2 = c9.m.f5155a;
                                            if ("video/avc".equals(str)) {
                                                qVar = qVar4;
                                            } else {
                                                qVar = qVar4;
                                            }
                                            if (!"video/hevc".equals(str) || ((b10 & 126) >> 1) != 39) {
                                                z14 = false;
                                                if (z14) {
                                                    z13 = true;
                                                    eVar.A = z13;
                                                    eVar.f4018y += 5;
                                                    eVar.f4017x += i22;
                                                    i10 = i22;
                                                }
                                            }
                                            z14 = true;
                                            if (z14) {
                                            }
                                        } else {
                                            qVar = qVar4;
                                        }
                                        z13 = false;
                                        eVar.A = z13;
                                        eVar.f4018y += 5;
                                        eVar.f4017x += i22;
                                        i10 = i22;
                                    } else {
                                        throw ParserException.a("Invalid NAL length", null);
                                    }
                                } else {
                                    jVar = jVar2;
                                    qVar = qVar4;
                                    if (eVar.A) {
                                        q qVar6 = eVar.f;
                                        qVar6.x(i23);
                                        i10 = i22;
                                        iVar2.readFully(qVar6.f5186a, 0, eVar.f4019z);
                                        vVar.a(eVar.f4019z, qVar6);
                                        c10 = eVar.f4019z;
                                        int e10 = c9.m.e(qVar6.f5186a, qVar6.f5188c);
                                        qVar6.A("video/hevc".equals(nVar.F) ? 1 : 0);
                                        qVar6.z(e10);
                                        u7.b.a(j11, qVar6, eVar.D);
                                    } else {
                                        i10 = i22;
                                        c10 = vVar.c(iVar2, i23, false);
                                    }
                                    eVar.f4018y += c10;
                                    eVar.f4019z -= c10;
                                }
                                i22 = i10;
                                jVar2 = jVar;
                                qVar4 = qVar;
                            }
                        }
                        if (!bVar.f4032l) {
                            i6 = bVar.f4025d.f4107g[bVar.f];
                        } else if (lVar3.f4094j[bVar.f]) {
                            i6 = 1;
                        } else {
                            i6 = 0;
                        }
                        if (bVar.a() != null) {
                            i6 |= 1073741824;
                        }
                        int i24 = i6;
                        k a11 = bVar.a();
                        if (a11 != null) {
                            aVar = a11.f4083c;
                        } else {
                            aVar = null;
                        }
                        vVar.d(j11, i24, eVar.f4017x, 0, aVar);
                        while (!arrayDeque2.isEmpty()) {
                            a removeFirst = arrayDeque2.removeFirst();
                            eVar.f4012s -= removeFirst.f4021b;
                            long j15 = removeFirst.f4020a + j11;
                            for (v vVar2 : eVar.C) {
                                vVar2.d(j15, 1, removeFirst.f4021b, eVar.f4012s, null);
                            }
                        }
                        if (!bVar.b()) {
                            eVar.f4016w = null;
                        }
                        eVar.f4007m = 3;
                        z15 = true;
                        if (z15) {
                        }
                    } else {
                        int size2 = sparseArray.size();
                        b bVar3 = null;
                        for (int i25 = 0; i25 < size2; i25++) {
                            l lVar4 = sparseArray.valueAt(i25).f4023b;
                            if (lVar4.f4099o) {
                                long j16 = lVar4.f4088c;
                                if (j16 < j14) {
                                    bVar3 = sparseArray.valueAt(i25);
                                    j14 = j16;
                                }
                            }
                        }
                        if (bVar3 == null) {
                            eVar.f4007m = 3;
                        } else {
                            int position3 = (int) (j14 - iVar.getPosition());
                            if (position3 >= 0) {
                                iVar2.l(position3);
                                l lVar5 = bVar3.f4023b;
                                q qVar7 = lVar5.f4098n;
                                iVar2.readFully(qVar7.f5186a, 0, qVar7.f5188c);
                                qVar7.A(0);
                                lVar5.f4099o = false;
                            } else {
                                throw ParserException.a("Offset to encryption data was negative.", null);
                            }
                        }
                    }
                } else {
                    int i26 = ((int) eVar.f4009o) - eVar.f4010p;
                    q qVar8 = eVar.f4011q;
                    if (qVar8 != null) {
                        iVar2.readFully(qVar8.f5186a, 8, i26);
                        int i27 = eVar.f4008n;
                        a.b bVar4 = new a.b(i27, qVar8);
                        long position4 = iVar.getPosition();
                        if (!arrayDeque.isEmpty()) {
                            arrayDeque.peek().f3967c.add(bVar4);
                        } else {
                            if (i27 == 1936286840) {
                                qVar8.A(8);
                                int c12 = (qVar8.c() >> 24) & 255;
                                qVar8.B(4);
                                long r10 = qVar8.r();
                                if (c12 == 0) {
                                    u10 = qVar8.r();
                                    u11 = qVar8.r();
                                } else {
                                    u10 = qVar8.u();
                                    u11 = qVar8.u();
                                }
                                long j17 = position4 + u11;
                                long C2 = w.C(u10, 1000000L, r10);
                                qVar8.B(2);
                                int v10 = qVar8.v();
                                int[] iArr2 = new int[v10];
                                long[] jArr = new long[v10];
                                long[] jArr2 = new long[v10];
                                long[] jArr3 = new long[v10];
                                int i28 = 0;
                                long j18 = C2;
                                while (i28 < v10) {
                                    int c13 = qVar8.c();
                                    if ((c13 & LinearLayoutManager.INVALID_OFFSET) == 0) {
                                        long r11 = qVar8.r();
                                        iArr2[i28] = c13 & SubsamplingScaleImageView.TILE_SIZE_AUTO;
                                        jArr[i28] = j17;
                                        jArr3[i28] = j18;
                                        long j19 = u10 + r11;
                                        int i29 = i28;
                                        int i30 = v10;
                                        long[] jArr4 = jArr2;
                                        long[] jArr5 = jArr3;
                                        j18 = w.C(j19, 1000000L, r10);
                                        jArr4[i29] = j18 - jArr5[i29];
                                        qVar8.B(4);
                                        j17 += iArr[i29];
                                        i28 = i29 + 1;
                                        jArr2 = jArr4;
                                        jArr3 = jArr5;
                                        iArr2 = iArr2;
                                        u10 = j19;
                                        jArr = jArr;
                                        v10 = i30;
                                    } else {
                                        throw ParserException.a("Unhandled indirect reference", null);
                                    }
                                }
                                Pair create = Pair.create(Long.valueOf(C2), new u7.c(iArr2, jArr, jArr2, jArr3));
                                this.f4015v = ((Long) create.first).longValue();
                                this.B.i((t) create.second);
                                this.E = true;
                                eVar = this;
                            } else if (i27 == 1701671783 && eVar.C.length != 0) {
                                qVar8.A(8);
                                int c14 = (qVar8.c() >> 24) & 255;
                                long j20 = -9223372036854775807L;
                                if (c14 != 0) {
                                    if (c14 != 1) {
                                        defpackage.d.k(46, "Skipping unsupported emsg version: ", c14, "FragmentedMp4Extractor");
                                    } else {
                                        long r12 = qVar8.r();
                                        j10 = w.C(qVar8.u(), 1000000L, r12);
                                        C = w.C(qVar8.r(), 1000L, r12);
                                        r = qVar8.r();
                                        k10 = qVar8.k();
                                        k10.getClass();
                                        k11 = qVar8.k();
                                        k11.getClass();
                                    }
                                } else {
                                    k10 = qVar8.k();
                                    k10.getClass();
                                    k11 = qVar8.k();
                                    k11.getClass();
                                    long r13 = qVar8.r();
                                    long C3 = w.C(qVar8.r(), 1000000L, r13);
                                    long j21 = eVar.f4015v;
                                    if (j21 != -9223372036854775807L) {
                                        j20 = j21 + C3;
                                    }
                                    C = w.C(qVar8.r(), 1000L, r13);
                                    r = qVar8.r();
                                    long j22 = j20;
                                    j20 = C3;
                                    j10 = j22;
                                }
                                int i31 = qVar8.f5188c - qVar8.f5187b;
                                byte[] bArr3 = new byte[i31];
                                qVar8.b(0, bArr3, i31);
                                androidx.appcompat.widget.l lVar6 = eVar.f4003i;
                                ((ByteArrayOutputStream) lVar6.f1471v).reset();
                                try {
                                    DataOutputStream dataOutputStream = (DataOutputStream) lVar6.f1472w;
                                    dataOutputStream.writeBytes(k10);
                                    dataOutputStream.writeByte(0);
                                    DataOutputStream dataOutputStream2 = (DataOutputStream) lVar6.f1472w;
                                    dataOutputStream2.writeBytes(k11);
                                    dataOutputStream2.writeByte(0);
                                    ((DataOutputStream) lVar6.f1472w).writeLong(C);
                                    ((DataOutputStream) lVar6.f1472w).writeLong(r);
                                    ((DataOutputStream) lVar6.f1472w).write(bArr3);
                                    ((DataOutputStream) lVar6.f1472w).flush();
                                    q qVar9 = new q(((ByteArrayOutputStream) lVar6.f1471v).toByteArray());
                                    int i32 = qVar9.f5188c - qVar9.f5187b;
                                    for (v vVar3 : eVar.C) {
                                        qVar9.A(0);
                                        vVar3.a(i32, qVar9);
                                    }
                                    if (j10 == -9223372036854775807L) {
                                        arrayDeque2.addLast(new a(i32, j20));
                                        eVar.f4012s += i32;
                                    } else {
                                        for (v vVar4 : eVar.C) {
                                            vVar4.d(j10, 1, i32, 0, null);
                                        }
                                    }
                                } catch (IOException e11) {
                                    throw new RuntimeException(e11);
                                }
                            }
                            iVar2 = iVar;
                        }
                    } else {
                        iVar2.l(i26);
                    }
                    eVar.e(iVar.getPosition());
                }
            } else {
                int i33 = eVar.f4010p;
                q qVar10 = eVar.f4004j;
                if (i33 == 0) {
                    z12 = false;
                    if (iVar2.a(qVar10.f5186a, 0, 8, true)) {
                        eVar.f4010p = 8;
                        qVar10.A(0);
                        eVar.f4009o = qVar10.r();
                        eVar.f4008n = qVar10.c();
                    }
                    if (z12) {
                        return -1;
                    }
                }
                long j23 = eVar.f4009o;
                if (j23 == 1) {
                    iVar2.readFully(qVar10.f5186a, 8, 8);
                    eVar.f4010p += 8;
                    eVar.f4009o = qVar10.u();
                } else if (j23 == 0) {
                    long length = iVar.getLength();
                    if (length == -1 && !arrayDeque.isEmpty()) {
                        length = arrayDeque.peek().f3966b;
                    }
                    if (length != -1) {
                        eVar.f4009o = (length - iVar.getPosition()) + eVar.f4010p;
                    }
                }
                if (eVar.f4009o >= eVar.f4010p) {
                    long position5 = iVar.getPosition() - eVar.f4010p;
                    int i34 = eVar.f4008n;
                    if ((i34 == 1836019558 || i34 == 1835295092) && !eVar.E) {
                        eVar.B.i(new t.b(eVar.f4014u, position5));
                        eVar.E = true;
                    }
                    if (eVar.f4008n == 1836019558) {
                        int size3 = sparseArray.size();
                        for (int i35 = 0; i35 < size3; i35++) {
                            l lVar7 = sparseArray.valueAt(i35).f4023b;
                            lVar7.getClass();
                            lVar7.f4088c = position5;
                            lVar7.f4087b = position5;
                        }
                    }
                    int i36 = eVar.f4008n;
                    if (i36 == 1835295092) {
                        eVar.f4016w = null;
                        eVar.r = position5 + eVar.f4009o;
                        eVar.f4007m = 2;
                    } else {
                        if (i36 != 1836019574 && i36 != 1953653099 && i36 != 1835297121 && i36 != 1835626086 && i36 != 1937007212 && i36 != 1836019558 && i36 != 1953653094 && i36 != 1836475768 && i36 != 1701082227) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            long position6 = (iVar.getPosition() + eVar.f4009o) - 8;
                            arrayDeque.push(new a.C0077a(eVar.f4008n, position6));
                            if (eVar.f4009o == eVar.f4010p) {
                                eVar.e(position6);
                            } else {
                                eVar.f4007m = 0;
                                eVar.f4010p = 0;
                            }
                        } else {
                            if (i36 != 1751411826 && i36 != 1835296868 && i36 != 1836476516 && i36 != 1936286840 && i36 != 1937011556 && i36 != 1937011827 && i36 != 1668576371 && i36 != 1937011555 && i36 != 1937011578 && i36 != 1937013298 && i36 != 1937007471 && i36 != 1668232756 && i36 != 1937011571 && i36 != 1952867444 && i36 != 1952868452 && i36 != 1953196132 && i36 != 1953654136 && i36 != 1953658222 && i36 != 1886614376 && i36 != 1935763834 && i36 != 1935763823 && i36 != 1936027235 && i36 != 1970628964 && i36 != 1935828848 && i36 != 1936158820 && i36 != 1701606260 && i36 != 1835362404 && i36 != 1701671783) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (z11) {
                                if (eVar.f4010p == 8) {
                                    long j24 = eVar.f4009o;
                                    if (j24 <= 2147483647L) {
                                        q qVar11 = new q((int) j24);
                                        System.arraycopy(qVar10.f5186a, 0, qVar11.f5186a, 0, 8);
                                        eVar.f4011q = qVar11;
                                        eVar.f4007m = 1;
                                    } else {
                                        throw ParserException.b("Leaf atom with length > 2147483647 (unsupported).");
                                    }
                                } else {
                                    throw ParserException.b("Leaf atom defines extended atom size (unsupported).");
                                }
                            } else if (eVar.f4009o <= 2147483647L) {
                                eVar.f4011q = null;
                                eVar.f4007m = 1;
                            } else {
                                throw ParserException.b("Skipping atom with length > 2147483647 (unsupported).");
                            }
                        }
                    }
                    z12 = true;
                    if (z12) {
                    }
                } else {
                    throw ParserException.b("Atom size less than header length (unsupported).");
                }
            }
        }
    }

    @Override // u7.h
    public final void a() {
    }
}
