package w8;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.util.Pair;
import c9.w;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p8.a;
/* compiled from: TtmlNode.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f36612a;

    /* renamed from: b  reason: collision with root package name */
    public final String f36613b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f36614c;

    /* renamed from: d  reason: collision with root package name */
    public final long f36615d;

    /* renamed from: e  reason: collision with root package name */
    public final long f36616e;
    public final f f;

    /* renamed from: g  reason: collision with root package name */
    public final String[] f36617g;

    /* renamed from: h  reason: collision with root package name */
    public final String f36618h;

    /* renamed from: i  reason: collision with root package name */
    public final String f36619i;

    /* renamed from: j  reason: collision with root package name */
    public final d f36620j;

    /* renamed from: k  reason: collision with root package name */
    public final HashMap<String, Integer> f36621k;

    /* renamed from: l  reason: collision with root package name */
    public final HashMap<String, Integer> f36622l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f36623m;

    public d(String str, String str2, long j10, long j11, f fVar, String[] strArr, String str3, String str4, d dVar) {
        boolean z10;
        this.f36612a = str;
        this.f36613b = str2;
        this.f36619i = str4;
        this.f = fVar;
        this.f36617g = strArr;
        if (str2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f36614c = z10;
        this.f36615d = j10;
        this.f36616e = j11;
        str3.getClass();
        this.f36618h = str3;
        this.f36620j = dVar;
        this.f36621k = new HashMap<>();
        this.f36622l = new HashMap<>();
    }

    public static d a(String str) {
        return new d(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            a.C0467a c0467a = new a.C0467a();
            c0467a.f27989a = new SpannableStringBuilder();
            treeMap.put(str, c0467a);
        }
        CharSequence charSequence = ((a.C0467a) treeMap.get(str)).f27989a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final d b(int i6) {
        ArrayList arrayList = this.f36623m;
        if (arrayList != null) {
            return (d) arrayList.get(i6);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f36623m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet<Long> treeSet, boolean z10) {
        boolean z11;
        String str = this.f36612a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z10 || equals || (equals2 && this.f36619i != null)) {
            long j10 = this.f36615d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f36616e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f36623m == null) {
            return;
        }
        for (int i6 = 0; i6 < this.f36623m.size(); i6++) {
            d dVar = (d) this.f36623m.get(i6);
            if (!z10 && !equals) {
                z11 = false;
            } else {
                z11 = true;
            }
            dVar.d(treeSet, z11);
        }
    }

    public final boolean f(long j10) {
        long j11 = this.f36616e;
        long j12 = this.f36615d;
        if ((j12 == -9223372036854775807L && j11 == -9223372036854775807L) || ((j12 <= j10 && j11 == -9223372036854775807L) || ((j12 == -9223372036854775807L && j10 < j11) || (j12 <= j10 && j10 < j11)))) {
            return true;
        }
        return false;
    }

    public final void g(long j10, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f36618h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j10) && "div".equals(this.f36612a) && (str2 = this.f36619i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i6 = 0; i6 < c(); i6++) {
            b(i6).g(j10, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0023 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(long j10, Map map, Map map2, String str, TreeMap treeMap) {
        String str2;
        int i6;
        char c10;
        char c11;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        d dVar;
        int i12;
        int i13;
        f c0;
        boolean z12;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if (!f(j10)) {
            return;
        }
        String str3 = this.f36618h;
        if ("".equals(str3)) {
            str2 = str;
        } else {
            str2 = str3;
        }
        for (Map.Entry<String, Integer> entry : this.f36622l.entrySet()) {
            String key = entry.getKey();
            HashMap<String, Integer> hashMap = this.f36621k;
            if (hashMap.containsKey(key)) {
                i6 = hashMap.get(key).intValue();
            } else {
                i6 = 0;
            }
            int intValue = entry.getValue().intValue();
            if (i6 != intValue) {
                a.C0467a c0467a = (a.C0467a) treeMap.get(key);
                c0467a.getClass();
                e eVar = (e) map2.get(str2);
                eVar.getClass();
                f c02 = sc.b.c0(this.f, this.f36617g, map);
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c0467a.f27989a;
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder();
                    c0467a.f27989a = spannableStringBuilder;
                }
                if (c02 != null) {
                    int i19 = c02.f36639h;
                    int i20 = -1;
                    int i21 = 1;
                    if (i19 == -1 && c02.f36640i == -1) {
                        i10 = -1;
                    } else {
                        if (i19 == 1) {
                            c10 = 1;
                        } else {
                            c10 = 0;
                        }
                        if (c02.f36640i == 1) {
                            c11 = 2;
                        } else {
                            c11 = 0;
                        }
                        i10 = c10 | c11;
                    }
                    if (i10 != -1) {
                        int i22 = c02.f36639h;
                        if (i22 == -1) {
                            if (c02.f36640i != -1) {
                                i21 = 1;
                            }
                            i11 = 33;
                            spannableStringBuilder.setSpan(new StyleSpan(i20), i6, intValue, 33);
                        }
                        if (i22 == i21) {
                            i17 = 1;
                        } else {
                            i17 = 0;
                        }
                        if (c02.f36640i == i21) {
                            i18 = 2;
                        } else {
                            i18 = 0;
                        }
                        i20 = i18 | i17;
                        i11 = 33;
                        spannableStringBuilder.setSpan(new StyleSpan(i20), i6, intValue, 33);
                    } else {
                        i11 = 33;
                    }
                    if (c02.f == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        spannableStringBuilder.setSpan(new StrikethroughSpan(), i6, intValue, i11);
                    }
                    if (c02.f36638g == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i6, intValue, i11);
                    }
                    if (c02.f36635c) {
                        if (c02.f36635c) {
                            kc.f.g(spannableStringBuilder, new ForegroundColorSpan(c02.f36634b), i6, intValue);
                        } else {
                            throw new IllegalStateException("Font color has not been defined.");
                        }
                    }
                    if (c02.f36637e) {
                        if (c02.f36637e) {
                            kc.f.g(spannableStringBuilder, new BackgroundColorSpan(c02.f36636d), i6, intValue);
                        } else {
                            throw new IllegalStateException("Background color has not been defined.");
                        }
                    }
                    if (c02.f36633a != null) {
                        kc.f.g(spannableStringBuilder, new TypefaceSpan(c02.f36633a), i6, intValue);
                    }
                    b bVar = c02.r;
                    if (bVar != null) {
                        int i23 = bVar.f36594a;
                        if (i23 == -1) {
                            int i24 = eVar.f36632j;
                            if (i24 != 2 && i24 != 1) {
                                i16 = 1;
                            } else {
                                i16 = 3;
                            }
                            i23 = i16;
                            i15 = 1;
                        } else {
                            i15 = bVar.f36595b;
                        }
                        int i25 = bVar.f36596c;
                        if (i25 == -2) {
                            i25 = 1;
                        }
                        kc.f.g(spannableStringBuilder, new t8.d(i23, i15, i25), i6, intValue);
                    }
                    int i26 = c02.f36644m;
                    if (i26 != 2) {
                        if (i26 == 3 || i26 == 4) {
                            spannableStringBuilder.setSpan(new a(), i6, intValue, 33);
                        }
                    } else {
                        d dVar2 = this.f36620j;
                        while (true) {
                            if (dVar2 != null) {
                                f c03 = sc.b.c0(dVar2.f, dVar2.f36617g, map);
                                if (c03 != null && c03.f36644m == 1) {
                                    break;
                                }
                                dVar2 = dVar2.f36620j;
                            } else {
                                dVar2 = null;
                                break;
                            }
                        }
                        if (dVar2 != null) {
                            ArrayDeque arrayDeque = new ArrayDeque();
                            arrayDeque.push(dVar2);
                            while (true) {
                                if (!arrayDeque.isEmpty()) {
                                    d dVar3 = (d) arrayDeque.pop();
                                    f c04 = sc.b.c0(dVar3.f, dVar3.f36617g, map);
                                    if (c04 != null && c04.f36644m == 3) {
                                        dVar = dVar3;
                                        break;
                                    }
                                    for (int c12 = dVar3.c() - 1; c12 >= 0; c12--) {
                                        arrayDeque.push(dVar3.b(c12));
                                    }
                                } else {
                                    dVar = null;
                                    break;
                                }
                            }
                            if (dVar != null) {
                                if (dVar.c() == 1 && dVar.b(0).f36613b != null) {
                                    String str4 = dVar.b(0).f36613b;
                                    int i27 = w.f5205a;
                                    f c05 = sc.b.c0(dVar.f, dVar.f36617g, map);
                                    if (c05 != null) {
                                        i13 = c05.f36645n;
                                        i12 = -1;
                                    } else {
                                        i12 = -1;
                                        i13 = -1;
                                    }
                                    if (i13 == i12 && (c0 = sc.b.c0(dVar2.f, dVar2.f36617g, map)) != null) {
                                        i13 = c0.f36645n;
                                    }
                                    spannableStringBuilder.setSpan(new t8.c(str4, i13), i6, intValue, 33);
                                    if (c02.f36648q == 1) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        kc.f.g(spannableStringBuilder, new t8.a(), i6, intValue);
                                    }
                                    i14 = c02.f36641j;
                                    if (i14 != 1) {
                                        if (i14 != 2) {
                                            if (i14 == 3) {
                                                kc.f.g(spannableStringBuilder, new RelativeSizeSpan(c02.f36642k / 100.0f), i6, intValue);
                                            }
                                        } else {
                                            kc.f.g(spannableStringBuilder, new RelativeSizeSpan(c02.f36642k), i6, intValue);
                                        }
                                    } else {
                                        kc.f.g(spannableStringBuilder, new AbsoluteSizeSpan((int) c02.f36642k, true), i6, intValue);
                                    }
                                    if ("p".equals(this.f36612a)) {
                                        float f = c02.f36649s;
                                        if (f != Float.MAX_VALUE) {
                                            c0467a.f28004q = (f * (-90.0f)) / 100.0f;
                                        }
                                        Layout.Alignment alignment = c02.f36646o;
                                        if (alignment != null) {
                                            c0467a.f27991c = alignment;
                                        }
                                        Layout.Alignment alignment2 = c02.f36647p;
                                        if (alignment2 != null) {
                                            c0467a.f27992d = alignment2;
                                        }
                                    }
                                }
                                Log.i("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                if (c02.f36648q == 1) {
                                }
                                if (z12) {
                                }
                                i14 = c02.f36641j;
                                if (i14 != 1) {
                                }
                                if ("p".equals(this.f36612a)) {
                                }
                            }
                        }
                    }
                    if (c02.f36648q == 1) {
                    }
                    if (z12) {
                    }
                    i14 = c02.f36641j;
                    if (i14 != 1) {
                    }
                    if ("p".equals(this.f36612a)) {
                    }
                } else {
                    continue;
                }
            }
        }
        for (int i28 = 0; i28 < c(); i28++) {
            b(i28).h(j10, map, map2, str2, treeMap);
        }
    }

    public final void i(long j10, boolean z10, String str, TreeMap treeMap) {
        String str2;
        boolean z11;
        HashMap<String, Integer> hashMap = this.f36621k;
        hashMap.clear();
        HashMap<String, Integer> hashMap2 = this.f36622l;
        hashMap2.clear();
        String str3 = this.f36612a;
        if ("metadata".equals(str3)) {
            return;
        }
        String str4 = this.f36618h;
        if ("".equals(str4)) {
            str2 = str;
        } else {
            str2 = str4;
        }
        if (this.f36614c && z10) {
            SpannableStringBuilder e10 = e(str2, treeMap);
            String str5 = this.f36613b;
            str5.getClass();
            e10.append((CharSequence) str5);
        } else if ("br".equals(str3) && z10) {
            e(str2, treeMap).append('\n');
        } else if (f(j10)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                CharSequence charSequence = ((a.C0467a) entry.getValue()).f27989a;
                charSequence.getClass();
                hashMap.put((String) entry.getKey(), Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(str3);
            for (int i6 = 0; i6 < c(); i6++) {
                d b10 = b(i6);
                if (!z10 && !equals) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                b10.i(j10, z11, str2, treeMap);
            }
            if (equals) {
                SpannableStringBuilder e11 = e(str2, treeMap);
                int length = e11.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (e11.charAt(length) == ' ');
                if (length >= 0 && e11.charAt(length) != '\n') {
                    e11.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                CharSequence charSequence2 = ((a.C0467a) entry2.getValue()).f27989a;
                charSequence2.getClass();
                hashMap2.put((String) entry2.getKey(), Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
