package eu;

import du.a;
import gv.n;
import is.a0;
import is.b0;
import is.i;
import is.u;
import is.z;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
/* compiled from: JvmNameResolverBase.kt */
/* loaded from: classes2.dex */
public class g implements cu.c {

    /* renamed from: d  reason: collision with root package name */
    public static final List<String> f14564d;

    /* renamed from: a  reason: collision with root package name */
    public final String[] f14565a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Integer> f14566b;

    /* renamed from: c  reason: collision with root package name */
    public final List<a.d.c> f14567c;

    static {
        String m22 = u.m2(ca.a.P0('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        int i6 = 16;
        List<String> P0 = ca.a.P0(m22.concat("/Any"), m22.concat("/Nothing"), m22.concat("/Unit"), m22.concat("/Throwable"), m22.concat("/Number"), m22.concat("/Byte"), m22.concat("/Double"), m22.concat("/Float"), m22.concat("/Int"), m22.concat("/Long"), m22.concat("/Short"), m22.concat("/Boolean"), m22.concat("/Char"), m22.concat("/CharSequence"), m22.concat("/String"), m22.concat("/Comparable"), m22.concat("/Enum"), m22.concat("/Array"), m22.concat("/ByteArray"), m22.concat("/DoubleArray"), m22.concat("/FloatArray"), m22.concat("/IntArray"), m22.concat("/LongArray"), m22.concat("/ShortArray"), m22.concat("/BooleanArray"), m22.concat("/CharArray"), m22.concat("/Cloneable"), m22.concat("/Annotation"), m22.concat("/collections/Iterable"), m22.concat("/collections/MutableIterable"), m22.concat("/collections/Collection"), m22.concat("/collections/MutableCollection"), m22.concat("/collections/List"), m22.concat("/collections/MutableList"), m22.concat("/collections/Set"), m22.concat("/collections/MutableSet"), m22.concat("/collections/Map"), m22.concat("/collections/MutableMap"), m22.concat("/collections/Map.Entry"), m22.concat("/collections/MutableMap.MutableEntry"), m22.concat("/collections/Iterator"), m22.concat("/collections/MutableIterator"), m22.concat("/collections/ListIterator"), m22.concat("/collections/MutableListIterator"));
        f14564d = P0;
        a0 N2 = u.N2(P0);
        int P = sp.b.P(i.H1(N2, 10));
        if (P >= 16) {
            i6 = P;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i6);
        Iterator it = N2.iterator();
        while (true) {
            b0 b0Var = (b0) it;
            if (b0Var.hasNext()) {
                z zVar = (z) b0Var.next();
                linkedHashMap.put((String) zVar.f20680b, Integer.valueOf(zVar.f20679a));
            } else {
                return;
            }
        }
    }

    public g(String[] strArr, Set set, ArrayList arrayList) {
        this.f14565a = strArr;
        this.f14566b = set;
        this.f14567c = arrayList;
    }

    @Override // cu.c
    public final String a(int i6) {
        return getString(i6);
    }

    @Override // cu.c
    public final boolean b(int i6) {
        return this.f14566b.contains(Integer.valueOf(i6));
    }

    @Override // cu.c
    public final String getString(int i6) {
        boolean z10;
        boolean z11;
        String string;
        boolean z12;
        a.d.c cVar = this.f14567c.get(i6);
        int i10 = cVar.f13488v;
        if ((i10 & 4) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Object obj = cVar.f13491y;
            if (obj instanceof String) {
                string = (String) obj;
            } else {
                gu.c cVar2 = (gu.c) obj;
                cVar2.getClass();
                try {
                    String J = cVar2.J();
                    if (cVar2.s()) {
                        cVar.f13491y = J;
                    }
                    string = J;
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException("UTF-8 not supported?", e10);
                }
            }
        } else {
            if ((i10 & 2) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                List<String> list = f14564d;
                int size = list.size();
                int i11 = cVar.f13490x;
                if (i11 >= 0 && i11 < size) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    string = list.get(i11);
                }
            }
            string = this.f14565a[i6];
        }
        if (cVar.A.size() >= 2) {
            List<Integer> substringIndexList = cVar.A;
            kotlin.jvm.internal.i.f(substringIndexList, "substringIndexList");
            Integer begin = substringIndexList.get(0);
            Integer end = substringIndexList.get(1);
            kotlin.jvm.internal.i.f(begin, "begin");
            if (begin.intValue() >= 0) {
                int intValue = begin.intValue();
                kotlin.jvm.internal.i.f(end, "end");
                if (intValue <= end.intValue() && end.intValue() <= string.length()) {
                    string = string.substring(begin.intValue(), end.intValue());
                    kotlin.jvm.internal.i.f(string, "this as java.lang.String…ing(startIndex, endIndex)");
                }
            }
        }
        if (cVar.C.size() >= 2) {
            List<Integer> replaceCharList = cVar.C;
            kotlin.jvm.internal.i.f(replaceCharList, "replaceCharList");
            kotlin.jvm.internal.i.f(string, "string");
            string = n.E0(string, (char) replaceCharList.get(0).intValue(), (char) replaceCharList.get(1).intValue());
        }
        a.d.c.EnumC0205c enumC0205c = cVar.f13492z;
        if (enumC0205c == null) {
            enumC0205c = a.d.c.EnumC0205c.NONE;
        }
        int ordinal = enumC0205c.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                if (string.length() >= 2) {
                    string = string.substring(1, string.length() - 1);
                    kotlin.jvm.internal.i.f(string, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                string = n.E0(string, '$', '.');
            }
        } else {
            kotlin.jvm.internal.i.f(string, "string");
            string = n.E0(string, '$', '.');
        }
        kotlin.jvm.internal.i.f(string, "string");
        return string;
    }
}
