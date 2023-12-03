package com.google.android.exoplayer2.source;

import b9.u;
import c9.w;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.source.k;
import com.google.common.collect.g0;
import com.google.common.collect.h0;
import com.google.common.collect.x;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class MergingMediaSource extends c<Integer> {

    /* renamed from: q  reason: collision with root package name */
    public static final com.google.android.exoplayer2.q f6810q;

    /* renamed from: j  reason: collision with root package name */
    public final i[] f6811j;

    /* renamed from: k  reason: collision with root package name */
    public final e0[] f6812k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList<i> f6813l;

    /* renamed from: m  reason: collision with root package name */
    public final tr.r f6814m;

    /* renamed from: n  reason: collision with root package name */
    public int f6815n;

    /* renamed from: o  reason: collision with root package name */
    public long[][] f6816o;

    /* renamed from: p  reason: collision with root package name */
    public IllegalMergeException f6817p;

    /* loaded from: classes.dex */
    public static final class IllegalMergeException extends IOException {
    }

    static {
        q.a aVar = new q.a();
        aVar.f6689a = "MergingMediaSource";
        f6810q = aVar.a();
    }

    public MergingMediaSource(i... iVarArr) {
        tr.r rVar = new tr.r();
        this.f6811j = iVarArr;
        this.f6814m = rVar;
        this.f6813l = new ArrayList<>(Arrays.asList(iVarArr));
        this.f6815n = -1;
        this.f6812k = new e0[iVarArr.length];
        this.f6816o = new long[0];
        new HashMap();
        x.a(8, "expectedKeys");
        x.a(2, "expectedValuesPerKey");
        new h0(new com.google.common.collect.k(8), new g0(2));
    }

    @Override // com.google.android.exoplayer2.source.i
    public final h a(i.a aVar, b9.i iVar, long j10) {
        i[] iVarArr = this.f6811j;
        int length = iVarArr.length;
        h[] hVarArr = new h[length];
        e0[] e0VarArr = this.f6812k;
        int c10 = e0VarArr[0].c(aVar.f27272a);
        for (int i6 = 0; i6 < length; i6++) {
            hVarArr[i6] = iVarArr[i6].a(aVar.b(e0VarArr[i6].m(c10)), iVar, j10 - this.f6816o[c10][i6]);
        }
        return new k(this.f6814m, this.f6816o[c10], hVarArr);
    }

    @Override // com.google.android.exoplayer2.source.i
    public final com.google.android.exoplayer2.q g() {
        i[] iVarArr = this.f6811j;
        if (iVarArr.length > 0) {
            return iVarArr[0].g();
        }
        return f6810q;
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.i
    public final void j() {
        IllegalMergeException illegalMergeException = this.f6817p;
        if (illegalMergeException == null) {
            super.j();
            return;
        }
        throw illegalMergeException;
    }

    @Override // com.google.android.exoplayer2.source.i
    public final void l(h hVar) {
        k kVar = (k) hVar;
        int i6 = 0;
        while (true) {
            i[] iVarArr = this.f6811j;
            if (i6 < iVarArr.length) {
                i iVar = iVarArr[i6];
                h hVar2 = kVar.f6902u[i6];
                if (hVar2 instanceof k.a) {
                    hVar2 = ((k.a) hVar2).f6908u;
                }
                iVar.l(hVar2);
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    public final void q(u uVar) {
        this.f6847i = uVar;
        this.f6846h = w.j(null);
        int i6 = 0;
        while (true) {
            i[] iVarArr = this.f6811j;
            if (i6 < iVarArr.length) {
                v(Integer.valueOf(i6), iVarArr[i6]);
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    public final void s() {
        super.s();
        Arrays.fill(this.f6812k, (Object) null);
        this.f6815n = -1;
        this.f6817p = null;
        ArrayList<i> arrayList = this.f6813l;
        arrayList.clear();
        Collections.addAll(arrayList, this.f6811j);
    }

    @Override // com.google.android.exoplayer2.source.c
    public final i.a t(Integer num, i.a aVar) {
        if (num.intValue() != 0) {
            return null;
        }
        return aVar;
    }

    @Override // com.google.android.exoplayer2.source.c
    public final void u(Integer num, i iVar, e0 e0Var) {
        Integer num2 = num;
        if (this.f6817p == null) {
            if (this.f6815n == -1) {
                this.f6815n = e0Var.i();
            } else if (e0Var.i() != this.f6815n) {
                this.f6817p = new IllegalMergeException();
                return;
            }
            int length = this.f6816o.length;
            e0[] e0VarArr = this.f6812k;
            if (length == 0) {
                this.f6816o = (long[][]) Array.newInstance(Long.TYPE, this.f6815n, e0VarArr.length);
            }
            ArrayList<i> arrayList = this.f6813l;
            arrayList.remove(iVar);
            e0VarArr[num2.intValue()] = e0Var;
            if (arrayList.isEmpty()) {
                r(e0VarArr[0]);
            }
        }
    }
}
