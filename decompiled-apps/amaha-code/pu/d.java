package pu;

import is.u;
import is.w;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: MemberScope.kt */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: c  reason: collision with root package name */
    public static final a f28976c = new a();

    /* renamed from: d  reason: collision with root package name */
    public static int f28977d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final int f28978e;
    public static final int f;

    /* renamed from: g  reason: collision with root package name */
    public static final int f28979g;

    /* renamed from: h  reason: collision with root package name */
    public static final int f28980h;

    /* renamed from: i  reason: collision with root package name */
    public static final int f28981i;

    /* renamed from: j  reason: collision with root package name */
    public static final int f28982j;

    /* renamed from: k  reason: collision with root package name */
    public static final int f28983k;

    /* renamed from: l  reason: collision with root package name */
    public static final int f28984l;

    /* renamed from: m  reason: collision with root package name */
    public static final d f28985m;

    /* renamed from: n  reason: collision with root package name */
    public static final d f28986n;

    /* renamed from: o  reason: collision with root package name */
    public static final d f28987o;

    /* renamed from: p  reason: collision with root package name */
    public static final d f28988p;

    /* renamed from: q  reason: collision with root package name */
    public static final d f28989q;
    public static final ArrayList r;

    /* renamed from: s  reason: collision with root package name */
    public static final ArrayList f28990s;

    /* renamed from: a  reason: collision with root package name */
    public final List<c> f28991a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28992b;

    /* compiled from: MemberScope.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* compiled from: MemberScope.kt */
        /* renamed from: pu.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0489a {

            /* renamed from: a  reason: collision with root package name */
            public final int f28993a;

            /* renamed from: b  reason: collision with root package name */
            public final String f28994b;

            public C0489a(int i6, String str) {
                this.f28993a = i6;
                this.f28994b = str;
            }
        }
    }

    static {
        boolean z10;
        a.C0489a c0489a;
        d dVar;
        int i6 = f28977d;
        int i10 = i6 << 1;
        f28978e = i6;
        int i11 = i10 << 1;
        f = i10;
        int i12 = i11 << 1;
        f28979g = i11;
        int i13 = i12 << 1;
        f28980h = i12;
        int i14 = i13 << 1;
        f28981i = i13;
        int i15 = i14 << 1;
        f28982j = i14;
        f28977d = i15 << 1;
        int i16 = i15 - 1;
        f28983k = i16;
        int i17 = i6 | i10 | i11;
        f28984l = i17;
        f28985m = new d(i16);
        f28986n = new d(i13 | i14);
        new d(i6);
        new d(i10);
        new d(i11);
        f28987o = new d(i17);
        new d(i12);
        f28988p = new d(i13);
        f28989q = new d(i14);
        new d(i10 | i13 | i14);
        Field[] fields = d.class.getFields();
        kotlin.jvm.internal.i.f(fields, "T::class.java.fields");
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            a.C0489a c0489a2 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            if (obj instanceof d) {
                dVar = (d) obj;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                String name = field2.getName();
                kotlin.jvm.internal.i.f(name, "field.name");
                c0489a2 = new a.C0489a(dVar.f28992b, name);
            }
            if (c0489a2 != null) {
                arrayList2.add(c0489a2);
            }
        }
        r = arrayList2;
        Field[] fields2 = d.class.getFields();
        kotlin.jvm.internal.i.f(fields2, "T::class.java.fields");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (kotlin.jvm.internal.i.b(((Field) next).getType(), Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Field field4 = (Field) it3.next();
            Object obj2 = field4.get(null);
            kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj2).intValue();
            if (intValue == ((-intValue) & intValue)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                String name2 = field4.getName();
                kotlin.jvm.internal.i.f(name2, "field.name");
                c0489a = new a.C0489a(intValue, name2);
            } else {
                c0489a = null;
            }
            if (c0489a != null) {
                arrayList5.add(c0489a);
            }
        }
        f28990s = arrayList5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(int i6, List<? extends c> excludes) {
        kotlin.jvm.internal.i.g(excludes, "excludes");
        this.f28991a = excludes;
        for (c cVar : excludes) {
            i6 &= ~cVar.a();
        }
        this.f28992b = i6;
    }

    public final boolean a(int i6) {
        if ((i6 & this.f28992b) != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!kotlin.jvm.internal.i.b(d.class, cls)) {
            return false;
        }
        kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        d dVar = (d) obj;
        if (kotlin.jvm.internal.i.b(this.f28991a, dVar.f28991a) && this.f28992b == dVar.f28992b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f28991a.hashCode() * 31) + this.f28992b;
    }

    public final String toString() {
        Object obj;
        String str;
        String str2;
        boolean z10;
        Iterator it = r.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((a.C0489a) obj).f28993a == this.f28992b) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        a.C0489a c0489a = (a.C0489a) obj;
        if (c0489a != null) {
            str = c0489a.f28994b;
        } else {
            str = null;
        }
        if (str == null) {
            ArrayList arrayList = f28990s;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                a.C0489a c0489a2 = (a.C0489a) it2.next();
                if (a(c0489a2.f28993a)) {
                    str2 = c0489a2.f28994b;
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    arrayList2.add(str2);
                }
            }
            str = u.m2(arrayList2, " | ", null, null, null, 62);
        }
        StringBuilder g5 = defpackage.d.g("DescriptorKindFilter(", str, ", ");
        g5.append(this.f28991a);
        g5.append(')');
        return g5.toString();
    }

    public /* synthetic */ d(int i6) {
        this(i6, w.f20676u);
    }
}
