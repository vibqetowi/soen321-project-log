package s1;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import s1.i0;
import s1.q;
/* compiled from: NavDestination.kt */
/* loaded from: classes.dex */
public class u {
    public static final /* synthetic */ int D = 0;
    public final LinkedHashMap A;
    public int B;
    public String C;

    /* renamed from: u  reason: collision with root package name */
    public final String f31228u;

    /* renamed from: v  reason: collision with root package name */
    public w f31229v;

    /* renamed from: w  reason: collision with root package name */
    public String f31230w;

    /* renamed from: x  reason: collision with root package name */
    public CharSequence f31231x;

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList f31232y;

    /* renamed from: z  reason: collision with root package name */
    public final t.i<d> f31233z;

    /* compiled from: NavDestination.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static String a(int i6, Context context) {
            String valueOf;
            kotlin.jvm.internal.i.g(context, "context");
            if (i6 <= 16777215) {
                return String.valueOf(i6);
            }
            try {
                valueOf = context.getResources().getResourceName(i6);
            } catch (Resources.NotFoundException unused) {
                valueOf = String.valueOf(i6);
            }
            kotlin.jvm.internal.i.f(valueOf, "try {\n                co….toString()\n            }");
            return valueOf;
        }
    }

    /* compiled from: NavDestination.kt */
    /* loaded from: classes.dex */
    public static final class b implements Comparable<b> {

        /* renamed from: u  reason: collision with root package name */
        public final u f31234u;

        /* renamed from: v  reason: collision with root package name */
        public final Bundle f31235v;

        /* renamed from: w  reason: collision with root package name */
        public final boolean f31236w;

        /* renamed from: x  reason: collision with root package name */
        public final boolean f31237x;

        /* renamed from: y  reason: collision with root package name */
        public final int f31238y;

        public b(u destination, Bundle bundle, boolean z10, boolean z11, int i6) {
            kotlin.jvm.internal.i.g(destination, "destination");
            this.f31234u = destination;
            this.f31235v = bundle;
            this.f31236w = z10;
            this.f31237x = z11;
            this.f31238y = i6;
        }

        @Override // java.lang.Comparable
        /* renamed from: d */
        public final int compareTo(b other) {
            kotlin.jvm.internal.i.g(other, "other");
            boolean z10 = other.f31236w;
            boolean z11 = this.f31236w;
            if (z11 && !z10) {
                return 1;
            }
            if (!z11 && z10) {
                return -1;
            }
            Bundle bundle = other.f31235v;
            Bundle bundle2 = this.f31235v;
            if (bundle2 != null && bundle == null) {
                return 1;
            }
            if (bundle2 == null && bundle != null) {
                return -1;
            }
            if (bundle2 != null) {
                int size = bundle2.size();
                kotlin.jvm.internal.i.d(bundle);
                int size2 = size - bundle.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z12 = other.f31237x;
            boolean z13 = this.f31237x;
            if (z13 && !z12) {
                return 1;
            }
            if (!z13 && z12) {
                return -1;
            }
            return this.f31238y - other.f31238y;
        }
    }

    static {
        new LinkedHashMap();
    }

    public u(g0<? extends u> navigator) {
        kotlin.jvm.internal.i.g(navigator, "navigator");
        LinkedHashMap linkedHashMap = i0.f31177b;
        this.f31228u = i0.a.a(navigator.getClass());
        this.f31232y = new ArrayList();
        this.f31233z = new t.i<>();
        this.A = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:117:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        if (obj == null || !(obj instanceof u)) {
            return false;
        }
        ArrayList arrayList = this.f31232y;
        u uVar = (u) obj;
        ArrayList other = uVar.f31232y;
        kotlin.jvm.internal.i.g(arrayList, "<this>");
        kotlin.jvm.internal.i.g(other, "other");
        Set L2 = is.u.L2(arrayList);
        Collection<?> H = ca.a.H(other, L2);
        kotlin.jvm.internal.c0.a(L2);
        L2.retainAll(H);
        if (L2.size() == arrayList.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        t.i<d> iVar = this.f31233z;
        int f = iVar.f();
        t.i<d> iVar2 = uVar.f31233z;
        if (f == iVar2.f()) {
            Iterator it = fv.k.u0(kotlin.jvm.internal.h.l0(iVar)).iterator();
            while (true) {
                if (it.hasNext()) {
                    d dVar = (d) it.next();
                    if (iVar2.f32262u) {
                        iVar2.c();
                    }
                    int i6 = 0;
                    while (true) {
                        if (i6 < iVar2.f32265x) {
                            if (iVar2.f32264w[i6] == dVar) {
                                break;
                            }
                            i6++;
                        } else {
                            i6 = -1;
                            break;
                        }
                    }
                    if (i6 >= 0) {
                        z20 = true;
                        continue;
                    } else {
                        z20 = false;
                        continue;
                    }
                    if (!z20) {
                        z17 = false;
                        break;
                    }
                } else {
                    z17 = true;
                    break;
                }
            }
            if (z17) {
                Iterator it2 = fv.k.u0(kotlin.jvm.internal.h.l0(iVar2)).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        d dVar2 = (d) it2.next();
                        if (iVar.f32262u) {
                            iVar.c();
                        }
                        int i10 = 0;
                        while (true) {
                            if (i10 < iVar.f32265x) {
                                if (iVar.f32264w[i10] == dVar2) {
                                    break;
                                }
                                i10++;
                            } else {
                                i10 = -1;
                                break;
                            }
                        }
                        if (i10 >= 0) {
                            z19 = true;
                            continue;
                        } else {
                            z19 = false;
                            continue;
                        }
                        if (!z19) {
                            z18 = false;
                            break;
                        }
                    } else {
                        z18 = true;
                        break;
                    }
                }
                if (z18) {
                    z11 = true;
                    if (r().size() == uVar.r().size()) {
                        Iterator<Object> it3 = is.u.X1(r().entrySet()).iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                Map.Entry entry = (Map.Entry) it3.next();
                                if (uVar.r().containsKey(entry.getKey()) && kotlin.jvm.internal.i.b(uVar.r().get(entry.getKey()), entry.getValue())) {
                                    z16 = true;
                                    continue;
                                } else {
                                    z16 = false;
                                    continue;
                                }
                                if (!z16) {
                                    z13 = false;
                                    break;
                                }
                            } else {
                                z13 = true;
                                break;
                            }
                        }
                        if (z13) {
                            Iterator<Object> it4 = is.u.X1(uVar.r().entrySet()).iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    Map.Entry entry2 = (Map.Entry) it4.next();
                                    if (r().containsKey(entry2.getKey()) && kotlin.jvm.internal.i.b(r().get(entry2.getKey()), entry2.getValue())) {
                                        z15 = true;
                                        continue;
                                    } else {
                                        z15 = false;
                                        continue;
                                    }
                                    if (!z15) {
                                        z14 = false;
                                        break;
                                    }
                                } else {
                                    z14 = true;
                                    break;
                                }
                            }
                            if (z14) {
                                z12 = true;
                                if (this.B != uVar.B || !kotlin.jvm.internal.i.b(this.C, uVar.C) || !z10 || !z11 || !z12) {
                                    return false;
                                }
                                return true;
                            }
                        }
                    }
                    z12 = false;
                    return this.B != uVar.B ? false : false;
                }
            }
        }
        z11 = false;
        if (r().size() == uVar.r().size()) {
        }
        z12 = false;
        if (this.B != uVar.B) {
        }
    }

    public final void g(q qVar) {
        Map<String, e> r = r();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, e>> it = r.entrySet().iterator();
        while (true) {
            boolean z10 = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, e> next = it.next();
            e value = next.getValue();
            if ((value.f31110b || value.f31111c) ? false : false) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            String str = (String) obj;
            ArrayList arrayList2 = qVar.f31205d;
            Collection<q.a> values = qVar.f31206e.values();
            ArrayList arrayList3 = new ArrayList();
            for (q.a aVar : values) {
                is.q.R1(aVar.f31214b, arrayList3);
            }
            if (!is.u.u2(arrayList3, arrayList2).contains(str)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            this.f31232y.add(qVar);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + qVar.f31202a + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + arrayList).toString());
    }

    public int hashCode() {
        int i6;
        int i10;
        int i11;
        Set<String> keySet;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = this.B * 31;
        String str = this.C;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i17 = i16 + i6;
        Iterator it = this.f31232y.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            int i18 = i17 * 31;
            String str2 = qVar.f31202a;
            if (str2 != null) {
                i13 = str2.hashCode();
            } else {
                i13 = 0;
            }
            int i19 = (i18 + i13) * 31;
            String str3 = qVar.f31203b;
            if (str3 != null) {
                i14 = str3.hashCode();
            } else {
                i14 = 0;
            }
            int i20 = (i19 + i14) * 31;
            String str4 = qVar.f31204c;
            if (str4 != null) {
                i15 = str4.hashCode();
            } else {
                i15 = 0;
            }
            i17 = i20 + i15;
        }
        t.j l02 = kotlin.jvm.internal.h.l0(this.f31233z);
        while (l02.hasNext()) {
            d dVar = (d) l02.next();
            int i21 = ((i17 * 31) + dVar.f31106a) * 31;
            a0 a0Var = dVar.f31107b;
            if (a0Var != null) {
                i11 = a0Var.hashCode();
            } else {
                i11 = 0;
            }
            i17 = i21 + i11;
            Bundle bundle = dVar.f31108c;
            if (bundle != null && (keySet = bundle.keySet()) != null) {
                for (String str5 : keySet) {
                    int i22 = i17 * 31;
                    Bundle bundle2 = dVar.f31108c;
                    kotlin.jvm.internal.i.d(bundle2);
                    Object obj = bundle2.get(str5);
                    if (obj != null) {
                        i12 = obj.hashCode();
                    } else {
                        i12 = 0;
                    }
                    i17 = i22 + i12;
                }
            }
        }
        for (String str6 : r().keySet()) {
            int c10 = pl.a.c(str6, i17 * 31, 31);
            e eVar = r().get(str6);
            if (eVar != null) {
                i10 = eVar.hashCode();
            } else {
                i10 = 0;
            }
            i17 = c10 + i10;
        }
        return i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0094 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle m(Bundle bundle) {
        boolean z10;
        boolean z11;
        LinkedHashMap linkedHashMap = this.A;
        if (bundle == null) {
            if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                return null;
            }
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String name = (String) entry.getKey();
            e eVar = (e) entry.getValue();
            eVar.getClass();
            kotlin.jvm.internal.i.g(name, "name");
            if (eVar.f31111c) {
                eVar.f31109a.d(bundle2, name, eVar.f31112d);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String name2 = (String) entry2.getKey();
                e eVar2 = (e) entry2.getValue();
                eVar2.getClass();
                kotlin.jvm.internal.i.g(name2, "name");
                boolean z12 = eVar2.f31110b;
                c0<Object> c0Var = eVar2.f31109a;
                if (z12 || !bundle2.containsKey(name2) || bundle2.get(name2) != null) {
                    try {
                        c0Var.a(bundle2, name2);
                        z10 = true;
                        continue;
                    } catch (ClassCastException unused) {
                    }
                    if (!z10) {
                        StringBuilder g5 = defpackage.d.g("Wrong argument type for '", name2, "' in argument bundle. ");
                        g5.append(c0Var.b());
                        g5.append(" expected.");
                        throw new IllegalArgumentException(g5.toString().toString());
                    }
                }
                z10 = false;
                continue;
                if (!z10) {
                }
            }
        }
        return bundle2;
    }

    public final int[] o(u uVar) {
        w wVar;
        is.g gVar = new is.g();
        w wVar2 = this;
        while (true) {
            w wVar3 = wVar2.f31229v;
            if (uVar != null) {
                wVar = uVar.f31229v;
            } else {
                wVar = null;
            }
            if (wVar != null) {
                w wVar4 = uVar.f31229v;
                kotlin.jvm.internal.i.d(wVar4);
                if (wVar4.z(wVar2.B, true) == wVar2) {
                    gVar.addFirst(wVar2);
                    break;
                }
            }
            if (wVar3 == null || wVar3.F != wVar2.B) {
                gVar.addFirst(wVar2);
            }
            if (kotlin.jvm.internal.i.b(wVar3, uVar) || wVar3 == null) {
                break;
            }
            wVar2 = wVar3;
        }
        List<u> I2 = is.u.I2(gVar);
        ArrayList arrayList = new ArrayList(is.i.H1(I2, 10));
        for (u uVar2 : I2) {
            arrayList.add(Integer.valueOf(uVar2.B));
        }
        return is.u.H2(arrayList);
    }

    public final d q(int i6) {
        boolean z10;
        d dVar;
        t.i<d> iVar = this.f31233z;
        if (iVar.f() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            dVar = null;
        } else {
            dVar = (d) iVar.d(i6, null);
        }
        if (dVar == null) {
            w wVar = this.f31229v;
            if (wVar == null) {
                return null;
            }
            return wVar.q(i6);
        }
        return dVar;
    }

    public final Map<String, e> r() {
        return is.e0.x0(this.A);
    }

    public b s(s sVar) {
        Bundle bundle;
        boolean z10;
        int i6;
        int i10;
        int i11;
        List list;
        int i12;
        boolean z11;
        boolean z12;
        Matcher matcher;
        Bundle bundle2;
        boolean z13;
        Matcher matcher2;
        Uri uri;
        LinkedHashMap linkedHashMap;
        Iterator it;
        String str;
        String str2;
        Matcher matcher3;
        ArrayList arrayList = this.f31232y;
        Matcher matcher4 = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it2 = arrayList.iterator();
        b bVar = null;
        while (it2.hasNext()) {
            q qVar = (q) it2.next();
            Uri uri2 = (Uri) sVar.f31224v;
            if (uri2 != null) {
                Map<String, e> r = r();
                qVar.getClass();
                Pattern pattern = (Pattern) qVar.f31207g.getValue();
                if (pattern != null) {
                    matcher = pattern.matcher(uri2.toString());
                } else {
                    matcher = matcher4;
                }
                if (matcher == null || !matcher.matches()) {
                    bundle2 = matcher4;
                } else {
                    bundle2 = new Bundle();
                    ArrayList arrayList2 = qVar.f31205d;
                    int size = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size) {
                        String str3 = (String) arrayList2.get(i13);
                        i13++;
                        String value = Uri.decode(matcher.group(i13));
                        e eVar = r.get(str3);
                        try {
                            kotlin.jvm.internal.i.f(value, "value");
                            q.b(bundle2, str3, value, eVar);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    if (qVar.f31208h) {
                        LinkedHashMap linkedHashMap2 = qVar.f31206e;
                        Iterator it3 = linkedHashMap2.keySet().iterator();
                        while (it3.hasNext()) {
                            String str4 = (String) it3.next();
                            q.a aVar = (q.a) linkedHashMap2.get(str4);
                            String queryParameter = uri2.getQueryParameter(str4);
                            if (qVar.f31209i) {
                                String uri3 = uri2.toString();
                                kotlin.jvm.internal.i.f(uri3, "deepLink.toString()");
                                String d12 = gv.r.d1(uri3, '?');
                                if (!kotlin.jvm.internal.i.b(d12, uri3)) {
                                    queryParameter = d12;
                                }
                            }
                            if (queryParameter != null) {
                                kotlin.jvm.internal.i.d(aVar);
                                matcher2 = Pattern.compile(aVar.f31213a, 32).matcher(queryParameter);
                                if (!matcher2.matches()) {
                                    break;
                                }
                            } else {
                                matcher2 = null;
                            }
                            Bundle bundle3 = new Bundle();
                            try {
                                kotlin.jvm.internal.i.d(aVar);
                                ArrayList arrayList3 = aVar.f31214b;
                                int size2 = arrayList3.size();
                                int i14 = 0;
                                while (i14 < size2) {
                                    if (matcher2 != null) {
                                        try {
                                            str = matcher2.group(i14 + 1);
                                            if (str == null) {
                                                str = "";
                                            }
                                        } catch (IllegalArgumentException unused2) {
                                            uri = uri2;
                                            linkedHashMap = linkedHashMap2;
                                            it = it3;
                                        }
                                    } else {
                                        str = null;
                                    }
                                    uri = uri2;
                                    try {
                                        str2 = (String) arrayList3.get(i14);
                                        linkedHashMap = linkedHashMap2;
                                    } catch (IllegalArgumentException unused3) {
                                        linkedHashMap = linkedHashMap2;
                                        it = it3;
                                        it3 = it;
                                        uri2 = uri;
                                        linkedHashMap2 = linkedHashMap;
                                    }
                                    try {
                                        e eVar2 = r.get(str2);
                                        if (str != null) {
                                            it = it3;
                                            try {
                                                StringBuilder sb2 = new StringBuilder();
                                                matcher3 = matcher2;
                                                sb2.append('{');
                                                sb2.append(str2);
                                                sb2.append('}');
                                                if (!kotlin.jvm.internal.i.b(str, sb2.toString())) {
                                                    q.b(bundle3, str2, str, eVar2);
                                                }
                                            } catch (IllegalArgumentException unused4) {
                                                it3 = it;
                                                uri2 = uri;
                                                linkedHashMap2 = linkedHashMap;
                                            }
                                        } else {
                                            it = it3;
                                            matcher3 = matcher2;
                                        }
                                        i14++;
                                        it3 = it;
                                        uri2 = uri;
                                        linkedHashMap2 = linkedHashMap;
                                        matcher2 = matcher3;
                                    } catch (IllegalArgumentException unused5) {
                                        it = it3;
                                        it3 = it;
                                        uri2 = uri;
                                        linkedHashMap2 = linkedHashMap;
                                    }
                                }
                                uri = uri2;
                                linkedHashMap = linkedHashMap2;
                                it = it3;
                                bundle2.putAll(bundle3);
                            } catch (IllegalArgumentException unused6) {
                                uri = uri2;
                            }
                            it3 = it;
                            uri2 = uri;
                            linkedHashMap2 = linkedHashMap;
                        }
                    }
                    for (Map.Entry<String, e> entry : r.entrySet()) {
                        String key = entry.getKey();
                        e value2 = entry.getValue();
                        if (value2 != null && !value2.f31110b && !value2.f31111c) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13 && !bundle2.containsKey(key)) {
                            bundle2 = null;
                        }
                    }
                }
                bundle = bundle2;
            } else {
                bundle = null;
            }
            String str5 = (String) sVar.f31225w;
            if (str5 != null && kotlin.jvm.internal.i.b(str5, qVar.f31203b)) {
                z10 = true;
            } else {
                z10 = false;
            }
            String str6 = (String) sVar.f31226x;
            if (str6 != null) {
                qVar.getClass();
                String str7 = qVar.f31204c;
                if (str7 != null) {
                    Pattern pattern2 = (Pattern) qVar.f31211k.getValue();
                    kotlin.jvm.internal.i.d(pattern2);
                    if (pattern2.matcher(str6).matches()) {
                        List c10 = new gv.e("/").c(str7);
                        boolean isEmpty = c10.isEmpty();
                        List list2 = is.w.f20676u;
                        if (!isEmpty) {
                            ListIterator listIterator = c10.listIterator(c10.size());
                            while (listIterator.hasPrevious()) {
                                if (((String) listIterator.previous()).length() == 0) {
                                    z12 = true;
                                    continue;
                                } else {
                                    z12 = false;
                                    continue;
                                }
                                if (!z12) {
                                    i11 = 1;
                                    list = is.u.E2(c10, listIterator.nextIndex() + 1);
                                    break;
                                }
                            }
                        }
                        i11 = 1;
                        list = list2;
                        String str8 = (String) list.get(0);
                        String str9 = (String) list.get(i11);
                        List c11 = new gv.e("/").c(str6);
                        if (!c11.isEmpty()) {
                            ListIterator listIterator2 = c11.listIterator(c11.size());
                            while (listIterator2.hasPrevious()) {
                                if (((String) listIterator2.previous()).length() == 0) {
                                    z11 = true;
                                    continue;
                                } else {
                                    z11 = false;
                                    continue;
                                }
                                if (!z11) {
                                    i12 = 1;
                                    list2 = is.u.E2(c11, listIterator2.nextIndex() + 1);
                                    break;
                                }
                            }
                        }
                        i12 = 1;
                        i10 = 0;
                        String str10 = (String) list2.get(i12);
                        if (kotlin.jvm.internal.i.b(str8, (String) list2.get(0))) {
                            i10 = 2;
                        }
                        if (kotlin.jvm.internal.i.b(str9, str10)) {
                            i10++;
                        }
                        i6 = i10;
                    }
                }
                i10 = -1;
                i6 = i10;
            } else {
                i6 = -1;
            }
            if (bundle != null || z10 || i6 > -1) {
                b bVar2 = new b(this, bundle, qVar.f31212l, z10, i6);
                if (bVar == null || bVar2.compareTo(bVar) > 0) {
                    bVar = bVar2;
                }
            }
            matcher4 = null;
        }
        return bVar;
    }

    public void t(Context context, AttributeSet attributeSet) {
        Object obj;
        String str;
        kotlin.jvm.internal.i.g(context, "context");
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, kc.f.f23223m0);
        kotlin.jvm.internal.i.f(obtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        String string = obtainAttributes.getString(2);
        if (string == null) {
            this.B = 0;
            this.f31230w = null;
        } else if (!gv.n.B0(string)) {
            String concat = "android-app://androidx.navigation/".concat(string);
            this.B = concat.hashCode();
            this.f31230w = null;
            g(new q(concat, null, null));
        } else {
            throw new IllegalArgumentException("Cannot have an empty route".toString());
        }
        ArrayList arrayList = this.f31232y;
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                String str2 = ((q) obj).f31202a;
                String str3 = this.C;
                if (str3 != null) {
                    str = "android-app://androidx.navigation/".concat(str3);
                } else {
                    str = "";
                }
                if (kotlin.jvm.internal.i.b(str2, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        kotlin.jvm.internal.c0.a(arrayList);
        arrayList.remove(obj);
        this.C = string;
        if (obtainAttributes.hasValue(1)) {
            int resourceId = obtainAttributes.getResourceId(1, 0);
            this.B = resourceId;
            this.f31230w = null;
            this.f31230w = a.a(resourceId, context);
        }
        this.f31231x = obtainAttributes.getText(0);
        hs.k kVar = hs.k.f19476a;
        obtainAttributes.recycle();
    }

    public String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(");
        String str = this.f31230w;
        if (str == null) {
            sb2.append("0x");
            sb2.append(Integer.toHexString(this.B));
        } else {
            sb2.append(str);
        }
        sb2.append(")");
        String str2 = this.C;
        if (str2 != null && !gv.n.B0(str2)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            sb2.append(" route=");
            sb2.append(this.C);
        }
        if (this.f31231x != null) {
            sb2.append(" label=");
            sb2.append(this.f31231x);
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.f(sb3, "sb.toString()");
        return sb3;
    }
}
