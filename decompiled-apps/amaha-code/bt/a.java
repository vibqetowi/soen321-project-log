package bt;

import bt.e;
import is.e0;
import is.u;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.y;
/* compiled from: AnnotationConstructorCaller.kt */
/* loaded from: classes2.dex */
public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f4673a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f4674b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4675c;

    /* renamed from: d  reason: collision with root package name */
    public final List<Method> f4676d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f4677e;
    public final ArrayList f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f4678g;

    public a(Class jClass, ArrayList arrayList, int i6, int i10, List methods) {
        kotlin.jvm.internal.i.g(jClass, "jClass");
        defpackage.d.j(i6, "callMode");
        defpackage.d.j(i10, "origin");
        kotlin.jvm.internal.i.g(methods, "methods");
        this.f4673a = jClass;
        this.f4674b = arrayList;
        this.f4675c = i6;
        this.f4676d = methods;
        ArrayList arrayList2 = new ArrayList(is.i.H1(methods, 10));
        Iterator it = methods.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.f4677e = arrayList2;
        List<Method> list = this.f4676d;
        ArrayList arrayList3 = new ArrayList(is.i.H1(list, 10));
        for (Method method : list) {
            Class<?> it2 = method.getReturnType();
            kotlin.jvm.internal.i.f(it2, "it");
            List<ys.d<? extends Object>> list2 = nt.d.f26795a;
            Class<? extends Object> cls = nt.d.f26797c.get(it2);
            if (cls != null) {
                it2 = cls;
            }
            arrayList3.add(it2);
        }
        this.f = arrayList3;
        List<Method> list3 = this.f4676d;
        ArrayList arrayList4 = new ArrayList(is.i.H1(list3, 10));
        for (Method method2 : list3) {
            arrayList4.add(method2.getDefaultValue());
        }
        this.f4678g = arrayList4;
        if (this.f4675c == 2 && i10 == 1 && (true ^ u.r2(this.f4674b, "value").isEmpty())) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override // bt.e
    public final List<Type> a() {
        return this.f4677e;
    }

    @Override // bt.e
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
        if (r9.isInstance(r6) != false) goto L9;
     */
    @Override // bt.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call(Object[] args) {
        ys.d a10;
        String c10;
        kotlin.jvm.internal.i.g(args, "args");
        e.a.a(this, args);
        ArrayList arrayList = new ArrayList(args.length);
        int length = args.length;
        int i6 = 0;
        int i10 = 0;
        while (true) {
            List<String> list = this.f4674b;
            if (i6 < length) {
                Object obj = args[i6];
                int i11 = i10 + 1;
                ArrayList arrayList2 = this.f;
                if (obj == null && this.f4675c == 1) {
                    obj = this.f4678g.get(i10);
                } else {
                    Class cls = (Class) arrayList2.get(i10);
                    if (!(obj instanceof Class)) {
                        if (obj instanceof ys.d) {
                            obj = sp.b.C((ys.d) obj);
                        } else if (obj instanceof Object[]) {
                            Object[] objArr = (Object[]) obj;
                            if (!(objArr instanceof Class[])) {
                                if (objArr instanceof ys.d[]) {
                                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                                    ys.d[] dVarArr = (ys.d[]) obj;
                                    ArrayList arrayList3 = new ArrayList(dVarArr.length);
                                    for (ys.d dVar : dVarArr) {
                                        arrayList3.add(sp.b.C(dVar));
                                    }
                                    obj = arrayList3.toArray(new Class[0]);
                                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                } else {
                                    obj = objArr;
                                }
                            }
                        }
                    }
                    obj = null;
                }
                if (obj == null) {
                    String str = list.get(i10);
                    Class cls2 = (Class) arrayList2.get(i10);
                    if (kotlin.jvm.internal.i.b(cls2, Class.class)) {
                        a10 = y.a(ys.d.class);
                    } else if (cls2.isArray() && kotlin.jvm.internal.i.b(cls2.getComponentType(), Class.class)) {
                        a10 = y.a(ys.d[].class);
                    } else {
                        a10 = y.a(cls2);
                    }
                    if (kotlin.jvm.internal.i.b(a10.c(), y.a(Object[].class).c())) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(a10.c());
                        sb2.append('<');
                        Class<?> componentType = sp.b.C(a10).getComponentType();
                        kotlin.jvm.internal.i.f(componentType, "kotlinClass.java.componentType");
                        sb2.append(y.a(componentType).c());
                        sb2.append('>');
                        c10 = sb2.toString();
                    } else {
                        c10 = a10.c();
                    }
                    throw new IllegalArgumentException("Argument #" + i10 + ' ' + str + " is not of the required type " + c10);
                }
                arrayList.add(obj);
                i6++;
                i10 = i11;
            } else {
                return b.a(this.f4673a, e0.w0(u.O2(list, arrayList)), this.f4676d);
            }
        }
    }

    @Override // bt.e
    public final Type getReturnType() {
        return this.f4673a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ a(Class cls, ArrayList arrayList, int i6) {
        this(cls, arrayList, i6, 2, r5);
        ArrayList arrayList2 = new ArrayList(is.i.H1(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), new Class[0]));
        }
    }
}
