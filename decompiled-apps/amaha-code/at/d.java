package at;

import at.c;
import du.a;
import eu.d;
import gu.g;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: RuntimeTypeMapper.kt */
/* loaded from: classes2.dex */
public abstract class d {

    /* compiled from: RuntimeTypeMapper.kt */
    /* loaded from: classes2.dex */
    public static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        public final Field f3483a;

        public a(Field field) {
            kotlin.jvm.internal.i.g(field, "field");
            this.f3483a = field;
        }

        @Override // at.d
        public final String a() {
            StringBuilder sb2 = new StringBuilder();
            Field field = this.f3483a;
            String name = field.getName();
            kotlin.jvm.internal.i.f(name, "field.name");
            sb2.append(pt.c0.a(name));
            sb2.append("()");
            Class<?> type = field.getType();
            kotlin.jvm.internal.i.f(type, "field.type");
            sb2.append(nt.d.b(type));
            return sb2.toString();
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    /* loaded from: classes2.dex */
    public static final class b extends d {

        /* renamed from: a  reason: collision with root package name */
        public final Method f3484a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f3485b;

        public b(Method getterMethod, Method method) {
            kotlin.jvm.internal.i.g(getterMethod, "getterMethod");
            this.f3484a = getterMethod;
            this.f3485b = method;
        }

        @Override // at.d
        public final String a() {
            return sp.b.c(this.f3484a);
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    /* loaded from: classes2.dex */
    public static final class c extends d {

        /* renamed from: a  reason: collision with root package name */
        public final gt.k0 f3486a;

        /* renamed from: b  reason: collision with root package name */
        public final au.m f3487b;

        /* renamed from: c  reason: collision with root package name */
        public final a.c f3488c;

        /* renamed from: d  reason: collision with root package name */
        public final cu.c f3489d;

        /* renamed from: e  reason: collision with root package name */
        public final cu.e f3490e;
        public final String f;

        public c(gt.k0 k0Var, au.m proto, a.c cVar, cu.c nameResolver, cu.e typeTable) {
            boolean z10;
            String str;
            String sb2;
            kotlin.jvm.internal.i.g(proto, "proto");
            kotlin.jvm.internal.i.g(nameResolver, "nameResolver");
            kotlin.jvm.internal.i.g(typeTable, "typeTable");
            this.f3486a = k0Var;
            this.f3487b = proto;
            this.f3488c = cVar;
            this.f3489d = nameResolver;
            this.f3490e = typeTable;
            if ((cVar.f13468v & 4) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                sb2 = nameResolver.getString(cVar.f13471y.f13460w) + nameResolver.getString(cVar.f13471y.f13461x);
            } else {
                d.a b10 = eu.h.b(proto, nameResolver, typeTable, true);
                if (b10 != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(pt.c0.a(b10.f14559a));
                    gt.j c10 = k0Var.c();
                    kotlin.jvm.internal.i.f(c10, "descriptor.containingDeclaration");
                    if (kotlin.jvm.internal.i.b(k0Var.getVisibility(), gt.p.f16803d) && (c10 instanceof uu.d)) {
                        g.e<au.b, Integer> classModuleName = du.a.f13443i;
                        kotlin.jvm.internal.i.f(classModuleName, "classModuleName");
                        Integer num = (Integer) kotlin.jvm.internal.h.w(((uu.d) c10).f34533y, classModuleName);
                        String replaceAll = fu.f.f15932a.f16945u.matcher((num == null || (r4 = nameResolver.getString(num.intValue())) == null) ? "main" : "main").replaceAll("_");
                        kotlin.jvm.internal.i.f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                        str = "$".concat(replaceAll);
                    } else {
                        if (kotlin.jvm.internal.i.b(k0Var.getVisibility(), gt.p.f16800a) && (c10 instanceof gt.d0)) {
                            uu.g gVar = ((uu.k) k0Var).Z;
                            if (gVar instanceof yt.l) {
                                yt.l lVar = (yt.l) gVar;
                                if (lVar.f39041c != null) {
                                    StringBuilder sb4 = new StringBuilder("$");
                                    String e10 = lVar.f39040b.e();
                                    kotlin.jvm.internal.i.f(e10, "className.internalName");
                                    sb4.append(fu.e.j(gv.r.e1(e10, '/')).f());
                                    str = sb4.toString();
                                }
                            }
                        }
                        str = "";
                    }
                    sb3.append(str);
                    sb3.append("()");
                    sb3.append(b10.f14560b);
                    sb2 = sb3.toString();
                } else {
                    throw new hs.e("No field signature for property: " + k0Var, 2);
                }
            }
            this.f = sb2;
        }

        @Override // at.d
        public final String a() {
            return this.f;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    /* renamed from: at.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0055d extends d {

        /* renamed from: a  reason: collision with root package name */
        public final c.e f3491a;

        /* renamed from: b  reason: collision with root package name */
        public final c.e f3492b;

        public C0055d(c.e eVar, c.e eVar2) {
            this.f3491a = eVar;
            this.f3492b = eVar2;
        }

        @Override // at.d
        public final String a() {
            return this.f3491a.f3480b;
        }
    }

    public abstract String a();
}
