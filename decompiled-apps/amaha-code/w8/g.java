package w8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import c9.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p8.a;
/* compiled from: TtmlSubtitle.java */
/* loaded from: classes.dex */
public final class g implements p8.f {

    /* renamed from: u  reason: collision with root package name */
    public final d f36650u;

    /* renamed from: v  reason: collision with root package name */
    public final long[] f36651v;

    /* renamed from: w  reason: collision with root package name */
    public final Map<String, f> f36652w;

    /* renamed from: x  reason: collision with root package name */
    public final Map<String, e> f36653x;

    /* renamed from: y  reason: collision with root package name */
    public final Map<String, String> f36654y;

    public g(d dVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f36650u = dVar;
        this.f36653x = hashMap2;
        this.f36654y = hashMap3;
        this.f36652w = Collections.unmodifiableMap(hashMap);
        TreeSet<Long> treeSet = new TreeSet<>();
        int i6 = 0;
        dVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i6] = it.next().longValue();
            i6++;
        }
        this.f36651v = jArr;
    }

    @Override // p8.f
    public final int d(long j10) {
        long[] jArr = this.f36651v;
        int b10 = w.b(jArr, j10, false);
        if (b10 >= jArr.length) {
            return -1;
        }
        return b10;
    }

    @Override // p8.f
    public final long f(int i6) {
        return this.f36651v[i6];
    }

    @Override // p8.f
    public final List<p8.a> h(long j10) {
        a[] aVarArr;
        Map<String, f> map = this.f36652w;
        Map<String, e> map2 = this.f36653x;
        d dVar = this.f36650u;
        dVar.getClass();
        ArrayList arrayList = new ArrayList();
        dVar.g(j10, dVar.f36618h, arrayList);
        TreeMap treeMap = new TreeMap();
        dVar.i(j10, false, dVar.f36618h, treeMap);
        dVar.h(j10, map, map2, dVar.f36618h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = this.f36654y.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                e eVar = map2.get(pair.first);
                eVar.getClass();
                a.C0467a c0467a = new a.C0467a();
                c0467a.f27990b = decodeByteArray;
                c0467a.f27995h = eVar.f36625b;
                c0467a.f27996i = 0;
                c0467a.f27993e = eVar.f36626c;
                c0467a.f = 0;
                c0467a.f27994g = eVar.f36628e;
                c0467a.f27999l = eVar.f;
                c0467a.f28000m = eVar.f36629g;
                c0467a.f28003p = eVar.f36632j;
                arrayList2.add(c0467a.a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = map2.get(entry.getKey());
            eVar2.getClass();
            a.C0467a c0467a2 = (a.C0467a) entry.getValue();
            CharSequence charSequence = c0467a2.f27989a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), (CharSequence) "");
            }
            for (int i6 = 0; i6 < spannableStringBuilder.length(); i6++) {
                if (spannableStringBuilder.charAt(i6) == ' ') {
                    int i10 = i6 + 1;
                    int i11 = i10;
                    while (i11 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i11) == ' ') {
                        i11++;
                    }
                    int i12 = i11 - i10;
                    if (i12 > 0) {
                        spannableStringBuilder.delete(i6, i12 + i6);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i13 = 0; i13 < spannableStringBuilder.length() - 1; i13++) {
                if (spannableStringBuilder.charAt(i13) == '\n') {
                    int i14 = i13 + 1;
                    if (spannableStringBuilder.charAt(i14) == ' ') {
                        spannableStringBuilder.delete(i14, i13 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i15 = 0; i15 < spannableStringBuilder.length() - 1; i15++) {
                if (spannableStringBuilder.charAt(i15) == ' ') {
                    int i16 = i15 + 1;
                    if (spannableStringBuilder.charAt(i16) == '\n') {
                        spannableStringBuilder.delete(i15, i16);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            c0467a2.f27993e = eVar2.f36626c;
            c0467a2.f = eVar2.f36627d;
            c0467a2.f27994g = eVar2.f36628e;
            c0467a2.f27995h = eVar2.f36625b;
            c0467a2.f27999l = eVar2.f;
            c0467a2.f27998k = eVar2.f36631i;
            c0467a2.f27997j = eVar2.f36630h;
            c0467a2.f28003p = eVar2.f36632j;
            arrayList2.add(c0467a2.a());
        }
        return arrayList2;
    }

    @Override // p8.f
    public final int i() {
        return this.f36651v.length;
    }
}
