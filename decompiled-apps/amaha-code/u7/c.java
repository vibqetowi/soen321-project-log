package u7;

import java.util.Arrays;
import r1.b0;
import u7.t;
/* compiled from: ChunkIndex.java */
/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a  reason: collision with root package name */
    public final int f33858a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f33859b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f33860c;

    /* renamed from: d  reason: collision with root package name */
    public final long[] f33861d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f33862e;
    public final long f;

    public c(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f33859b = iArr;
        this.f33860c = jArr;
        this.f33861d = jArr2;
        this.f33862e = jArr3;
        int length = iArr.length;
        this.f33858a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0L;
        }
    }

    @Override // u7.t
    public final boolean d() {
        return true;
    }

    @Override // u7.t
    public final t.a i(long j10) {
        long[] jArr = this.f33862e;
        int f = c9.w.f(jArr, j10, true);
        long j11 = jArr[f];
        long[] jArr2 = this.f33860c;
        u uVar = new u(j11, jArr2[f]);
        if (j11 < j10 && f != this.f33858a - 1) {
            int i6 = f + 1;
            return new t.a(uVar, new u(jArr[i6], jArr2[i6]));
        }
        return new t.a(uVar, uVar);
    }

    @Override // u7.t
    public final long j() {
        return this.f;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f33859b);
        String arrays2 = Arrays.toString(this.f33860c);
        String arrays3 = Arrays.toString(this.f33862e);
        String arrays4 = Arrays.toString(this.f33861d);
        StringBuilder sb2 = new StringBuilder(ri.e.c(arrays4, ri.e.c(arrays3, ri.e.c(arrays2, ri.e.c(arrays, 71)))));
        sb2.append("ChunkIndex(length=");
        sb2.append(this.f33858a);
        sb2.append(", sizes=");
        sb2.append(arrays);
        sb2.append(", offsets=");
        sb2.append(arrays2);
        sb2.append(", timeUs=");
        sb2.append(arrays3);
        sb2.append(", durationsUs=");
        return b0.b(sb2, arrays4, ")");
    }
}
