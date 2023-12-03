package p7;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.Layout;
import c9.j;
import c9.w;
import com.google.android.exoplayer2.f;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.source.ads.a;
import com.google.android.exoplayer2.source.p;
import com.google.common.collect.l0;
import com.google.common.collect.s;
import com.google.common.collect.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import l8.g;
import p7.o;
import p8.a;
import qc.a;
import z8.c;
import z8.i;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements j.a, u7.k, g.a, MediaCodecUtil.e, c9.e, f.a, nc.h {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f27953u;

    public /* synthetic */ e(int i6) {
        this.f27953u = i6;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.e
    public int a(Object obj) {
        switch (this.f27953u) {
            case 13:
                Pattern pattern = MediaCodecUtil.f6618a;
                String str = ((com.google.android.exoplayer2.mediacodec.d) obj).f6638a;
                if (!str.startsWith("OMX.google") && !str.startsWith("c2.android")) {
                    if (w.f5205a < 26 && str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        return -1;
                    }
                    return 0;
                }
                return 1;
            default:
                Pattern pattern2 = MediaCodecUtil.f6618a;
                return ((com.google.android.exoplayer2.mediacodec.d) obj).f6638a.startsWith("OMX.google") ? 1 : 0;
        }
    }

    @Override // c9.e
    public void accept(Object obj) {
        ((p.b) obj).f7002b.a();
    }

    @Override // nc.h
    public boolean apply(Object obj) {
        return !(obj instanceof t8.b);
    }

    public u7.h[] b() {
        return new u7.h[]{new e8.a()};
    }

    @Override // com.google.android.exoplayer2.f.a
    public com.google.android.exoplayer2.f c(Bundle bundle) {
        a.C0138a[] c0138aArr;
        Uri[] uriArr;
        long[] jArr;
        List c0498a;
        e eVar = o8.o.f27301x;
        boolean z10 = true;
        int i6 = 0;
        switch (this.f27953u) {
            case 17:
                com.google.firebase.messaging.j jVar = com.google.android.exoplayer2.n.f6649b0;
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
                s.b bVar = s.f9446v;
                l0 l0Var = l0.f9412y;
                if (parcelableArrayList != null) {
                    l0Var = c9.a.a(jVar, parcelableArrayList);
                }
                return new o8.o((com.google.android.exoplayer2.n[]) l0Var.toArray(new com.google.android.exoplayer2.n[0]));
            case 18:
                o8.p pVar = o8.p.f27305x;
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(Integer.toString(0, 36));
                s.b bVar2 = s.f9446v;
                l0 l0Var2 = l0.f9412y;
                if (parcelableArrayList2 != null) {
                    l0Var2 = c9.a.a(eVar, parcelableArrayList2);
                }
                return new o8.p((o8.o[]) l0Var2.toArray(new o8.o[0]));
            case 19:
                ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(com.google.android.exoplayer2.source.ads.a.c(1));
                if (parcelableArrayList3 == null) {
                    c0138aArr = new a.C0138a[0];
                } else {
                    a.C0138a[] c0138aArr2 = new a.C0138a[parcelableArrayList3.size()];
                    while (i6 < parcelableArrayList3.size()) {
                        c0138aArr2[i6] = (a.C0138a) a.C0138a.B.c((Bundle) parcelableArrayList3.get(i6));
                        i6++;
                    }
                    c0138aArr = c0138aArr2;
                }
                return new com.google.android.exoplayer2.source.ads.a(null, c0138aArr, bundle.getLong(com.google.android.exoplayer2.source.ads.a.c(2), 0L), bundle.getLong(com.google.android.exoplayer2.source.ads.a.c(3), -9223372036854775807L), bundle.getInt(com.google.android.exoplayer2.source.ads.a.c(4)));
            case 20:
                long j10 = bundle.getLong(a.C0138a.c(0));
                int i10 = bundle.getInt(a.C0138a.c(1), -1);
                ArrayList parcelableArrayList4 = bundle.getParcelableArrayList(a.C0138a.c(2));
                int[] intArray = bundle.getIntArray(a.C0138a.c(3));
                long[] longArray = bundle.getLongArray(a.C0138a.c(4));
                long j11 = bundle.getLong(a.C0138a.c(5));
                boolean z11 = bundle.getBoolean(a.C0138a.c(6));
                if (intArray == null) {
                    intArray = new int[0];
                }
                int[] iArr = intArray;
                if (parcelableArrayList4 == null) {
                    uriArr = new Uri[0];
                } else {
                    uriArr = (Uri[]) parcelableArrayList4.toArray(new Uri[0]);
                }
                Uri[] uriArr2 = uriArr;
                if (longArray == null) {
                    jArr = new long[0];
                } else {
                    jArr = longArray;
                }
                return new a.C0138a(j10, i10, iArr, uriArr2, jArr, j11, z11);
            case 21:
                p8.a aVar = p8.a.L;
                a.C0467a c0467a = new a.C0467a();
                CharSequence charSequence = bundle.getCharSequence(p8.a.b(0));
                if (charSequence != null) {
                    c0467a.f27989a = charSequence;
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(p8.a.b(1));
                if (alignment != null) {
                    c0467a.f27991c = alignment;
                }
                Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(p8.a.b(2));
                if (alignment2 != null) {
                    c0467a.f27992d = alignment2;
                }
                Bitmap bitmap = (Bitmap) bundle.getParcelable(p8.a.b(3));
                if (bitmap != null) {
                    c0467a.f27990b = bitmap;
                }
                if (bundle.containsKey(p8.a.b(4)) && bundle.containsKey(p8.a.b(5))) {
                    float f = bundle.getFloat(p8.a.b(4));
                    int i11 = bundle.getInt(p8.a.b(5));
                    c0467a.f27993e = f;
                    c0467a.f = i11;
                }
                if (bundle.containsKey(p8.a.b(6))) {
                    c0467a.f27994g = bundle.getInt(p8.a.b(6));
                }
                if (bundle.containsKey(p8.a.b(7))) {
                    c0467a.f27995h = bundle.getFloat(p8.a.b(7));
                }
                if (bundle.containsKey(p8.a.b(8))) {
                    c0467a.f27996i = bundle.getInt(p8.a.b(8));
                }
                if (bundle.containsKey(p8.a.b(10)) && bundle.containsKey(p8.a.b(9))) {
                    float f2 = bundle.getFloat(p8.a.b(10));
                    int i12 = bundle.getInt(p8.a.b(9));
                    c0467a.f27998k = f2;
                    c0467a.f27997j = i12;
                }
                if (bundle.containsKey(p8.a.b(11))) {
                    c0467a.f27999l = bundle.getFloat(p8.a.b(11));
                }
                if (bundle.containsKey(p8.a.b(12))) {
                    c0467a.f28000m = bundle.getFloat(p8.a.b(12));
                }
                if (bundle.containsKey(p8.a.b(13))) {
                    c0467a.f28002o = bundle.getInt(p8.a.b(13));
                    c0467a.f28001n = true;
                }
                if (!bundle.getBoolean(p8.a.b(14), false)) {
                    c0467a.f28001n = false;
                }
                if (bundle.containsKey(p8.a.b(15))) {
                    c0467a.f28003p = bundle.getInt(p8.a.b(15));
                }
                if (bundle.containsKey(p8.a.b(16))) {
                    c0467a.f28004q = bundle.getFloat(p8.a.b(16));
                }
                return c0467a.a();
            case 22:
            default:
                return new d9.b(bundle.getInt(d9.b.b(0), -1), bundle.getInt(d9.b.b(1), -1), bundle.getInt(d9.b.b(2), -1), bundle.getByteArray(d9.b.b(3)));
            case 23:
                int i13 = bundle.getInt(c.e.b(0), -1);
                int[] intArray2 = bundle.getIntArray(c.e.b(1));
                int i14 = bundle.getInt(c.e.b(2), -1);
                sc.b.q((i13 < 0 || i14 < 0) ? false : false);
                intArray2.getClass();
                return new c.e(i13, i14, intArray2);
            case 24:
                e eVar2 = i.a.f39322w;
                z8.i iVar = z8.i.f39320v;
                ArrayList parcelableArrayList5 = bundle.getParcelableArrayList(Integer.toString(0, 36));
                s.b bVar3 = s.f9446v;
                l0 l0Var3 = l0.f9412y;
                if (parcelableArrayList5 != null) {
                    l0Var3 = c9.a.a(eVar2, parcelableArrayList5);
                }
                t.a aVar2 = new t.a(4);
                while (i6 < l0Var3.f9414x) {
                    i.a aVar3 = (i.a) l0Var3.get(i6);
                    aVar2.b(aVar3.f39323u, aVar3);
                    i6++;
                }
                return new z8.i(aVar2.a());
            case 25:
                Bundle bundle2 = bundle.getBundle(Integer.toString(0, 36));
                bundle2.getClass();
                o8.o oVar = (o8.o) eVar.c(bundle2);
                int[] intArray3 = bundle.getIntArray(Integer.toString(1, 36));
                if (intArray3 == null) {
                    return new i.a(oVar);
                }
                if (intArray3.length == 0) {
                    c0498a = Collections.emptyList();
                } else {
                    c0498a = new a.C0498a(0, intArray3.length, intArray3);
                }
                return new i.a(oVar, c0498a);
        }
    }

    @Override // u7.k
    public u7.h[] d(Uri uri, Map map) {
        return b();
    }

    @Override // c9.j.a
    public void invoke(Object obj) {
        switch (this.f27953u) {
            case 0:
                ((o) obj).l0();
                return;
            case 1:
                ((o) obj).I();
                return;
            case 2:
                ((o) obj).b();
                return;
            case 3:
                ((o) obj).k0();
                return;
            case 4:
                ((o) obj).b0();
                return;
            case 5:
                ((o) obj).E();
                return;
            default:
                ((o) obj).w();
                return;
        }
    }

    public /* synthetic */ e(o.a aVar, int i6) {
        this.f27953u = i6;
    }
}
