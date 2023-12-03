package u7;

import android.util.Log;
import com.google.android.exoplayer2.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: FlacStreamMetadata.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final int f33884a;

    /* renamed from: b  reason: collision with root package name */
    public final int f33885b;

    /* renamed from: c  reason: collision with root package name */
    public final int f33886c;

    /* renamed from: d  reason: collision with root package name */
    public final int f33887d;

    /* renamed from: e  reason: collision with root package name */
    public final int f33888e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f33889g;

    /* renamed from: h  reason: collision with root package name */
    public final int f33890h;

    /* renamed from: i  reason: collision with root package name */
    public final int f33891i;

    /* renamed from: j  reason: collision with root package name */
    public final long f33892j;

    /* renamed from: k  reason: collision with root package name */
    public final a f33893k;

    /* renamed from: l  reason: collision with root package name */
    public final g8.a f33894l;

    /* compiled from: FlacStreamMetadata.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final long[] f33895a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f33896b;

        public a(long[] jArr, long[] jArr2) {
            this.f33895a = jArr;
            this.f33896b = jArr2;
        }
    }

    public o(byte[] bArr, int i6) {
        x xVar = new x(bArr, 1, 0);
        xVar.o(i6 * 8);
        this.f33884a = xVar.i(16);
        this.f33885b = xVar.i(16);
        this.f33886c = xVar.i(24);
        this.f33887d = xVar.i(24);
        int i10 = xVar.i(20);
        this.f33888e = i10;
        this.f = e(i10);
        this.f33889g = xVar.i(3) + 1;
        int i11 = xVar.i(5) + 1;
        this.f33890h = i11;
        this.f33891i = b(i11);
        int i12 = xVar.i(4);
        int i13 = xVar.i(32);
        int i14 = c9.w.f5205a;
        this.f33892j = ((i12 & 4294967295L) << 32) | (i13 & 4294967295L);
        this.f33893k = null;
        this.f33894l = null;
    }

    public static g8.a a(List<String> list, List<j8.a> list2) {
        String str;
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < list.size(); i6++) {
            String str2 = list.get(i6);
            int i10 = c9.w.f5205a;
            String[] split = str2.split("=", 2);
            if (split.length != 2) {
                if (str2.length() != 0) {
                    str = "Failed to parse Vorbis comment: ".concat(str2);
                } else {
                    str = new String("Failed to parse Vorbis comment: ");
                }
                Log.w("FlacStreamMetadata", str);
            } else {
                arrayList.add(new j8.b(split[0], split[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new g8.a(arrayList);
    }

    public static int b(int i6) {
        if (i6 != 8) {
            if (i6 != 12) {
                if (i6 != 16) {
                    if (i6 != 20) {
                        if (i6 != 24) {
                            return -1;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    public static int e(int i6) {
        switch (i6) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long c() {
        long j10 = this.f33892j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / this.f33888e;
    }

    public final com.google.android.exoplayer2.n d(byte[] bArr, g8.a aVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i6 = this.f33887d;
        if (i6 <= 0) {
            i6 = -1;
        }
        g8.a aVar2 = this.f33894l;
        if (aVar2 != null) {
            if (aVar == null) {
                aVar = aVar2;
            } else {
                aVar = aVar2.a(aVar.f16378u);
            }
        }
        n.a aVar3 = new n.a();
        aVar3.f6665k = "audio/flac";
        aVar3.f6666l = i6;
        aVar3.f6677x = this.f33889g;
        aVar3.f6678y = this.f33888e;
        aVar3.f6667m = Collections.singletonList(bArr);
        aVar3.f6663i = aVar;
        return new com.google.android.exoplayer2.n(aVar3);
    }

    public o(int i6, int i10, int i11, int i12, int i13, int i14, int i15, long j10, a aVar, g8.a aVar2) {
        this.f33884a = i6;
        this.f33885b = i10;
        this.f33886c = i11;
        this.f33887d = i12;
        this.f33888e = i13;
        this.f = e(i13);
        this.f33889g = i14;
        this.f33890h = i15;
        this.f33891i = b(i15);
        this.f33892j = j10;
        this.f33893k = aVar;
        this.f33894l = aVar2;
    }
}
