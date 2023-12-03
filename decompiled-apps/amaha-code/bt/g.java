package bt;

import at.t0;
import bt.f;
import gt.j;
import gt.n0;
import gt.u;
import gt.z0;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import wu.b0;
/* compiled from: InlineClassAwareCaller.kt */
/* loaded from: classes2.dex */
public final class g<M extends Member> implements e<M> {

    /* renamed from: a  reason: collision with root package name */
    public final e<M> f4697a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4698b;

    /* renamed from: c  reason: collision with root package name */
    public final a f4699c;

    /* compiled from: InlineClassAwareCaller.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final xs.f f4700a;

        /* renamed from: b  reason: collision with root package name */
        public final Method[] f4701b;

        /* renamed from: c  reason: collision with root package name */
        public final Method f4702c;

        public a(xs.f argumentRange, Method[] methodArr, Method method) {
            kotlin.jvm.internal.i.g(argumentRange, "argumentRange");
            this.f4700a = argumentRange;
            this.f4701b = methodArr;
            this.f4702c = method;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
        if ((r11 instanceof bt.d) != false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0101 A[LOOP:0: B:46:0x00fb->B:48:0x0101, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(e eVar, u descriptor, boolean z10) {
        Method declaredMethod;
        int i6;
        n0 k02;
        b0 b0Var;
        int i10;
        int i11;
        int size;
        a aVar;
        boolean z11;
        Method method;
        Class f02;
        kotlin.jvm.internal.i.g(descriptor, "descriptor");
        this.f4697a = eVar;
        this.f4698b = z10;
        b0 returnType = descriptor.getReturnType();
        kotlin.jvm.internal.i.d(returnType);
        Class f03 = sp.b.f0(returnType);
        if (f03 != null) {
            try {
                declaredMethod = f03.getDeclaredMethod("box-impl", sp.b.G(f03, descriptor).getReturnType());
                kotlin.jvm.internal.i.f(declaredMethod, "{\n        getDeclaredMet…riptor).returnType)\n    }");
            } catch (NoSuchMethodException unused) {
                throw new hs.e("No box method found in inline class: " + f03 + " (calling " + descriptor + ')', 2);
            }
        } else {
            declaredMethod = null;
        }
        if (iu.i.a(descriptor)) {
            aVar = new a(xs.f.f38003x, new Method[0], declaredMethod);
        } else {
            if (!(eVar instanceof f.g.c)) {
                if (!(descriptor instanceof gt.i)) {
                    if (descriptor.f0() != null && !(eVar instanceof d)) {
                        j c10 = descriptor.c();
                        kotlin.jvm.internal.i.f(c10, "descriptor.containingDeclaration");
                        if (!iu.i.b(c10)) {
                            i6 = 1;
                            ArrayList arrayList = new ArrayList();
                            k02 = descriptor.k0();
                            if (k02 != null) {
                                b0Var = k02.a();
                            } else {
                                b0Var = null;
                            }
                            if (b0Var != null) {
                                arrayList.add(b0Var);
                            } else if (descriptor instanceof gt.i) {
                                gt.e A = ((gt.i) descriptor).A();
                                kotlin.jvm.internal.i.f(A, "descriptor.constructedClass");
                                if (A.N()) {
                                    j c11 = A.c();
                                    kotlin.jvm.internal.i.e(c11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                                    arrayList.add(((gt.e) c11).r());
                                }
                            } else {
                                j c12 = descriptor.c();
                                kotlin.jvm.internal.i.f(c12, "descriptor.containingDeclaration");
                                if ((c12 instanceof gt.e) && iu.i.b(c12)) {
                                    arrayList.add(((gt.e) c12).r());
                                }
                            }
                            List<z0> i12 = descriptor.i();
                            kotlin.jvm.internal.i.f(i12, "descriptor.valueParameters");
                            for (z0 z0Var : i12) {
                                arrayList.add(z0Var.a());
                            }
                            if (this.f4698b) {
                                i10 = (((arrayList.size() + 32) - 1) / 32) + 1;
                            } else {
                                i10 = 0;
                            }
                            if (descriptor.isSuspend()) {
                                i11 = 1;
                            } else {
                                i11 = 0;
                            }
                            size = arrayList.size() + i6 + i10 + i11;
                            if (ca.a.b0(this) == size) {
                                xs.f k03 = kotlin.jvm.internal.h.k0(Math.max(i6, 0), arrayList.size() + i6);
                                Method[] methodArr = new Method[size];
                                for (int i13 = 0; i13 < size; i13++) {
                                    int i14 = k03.f37996u;
                                    if (i13 <= k03.f37997v && i14 <= i13) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11 && (f02 = sp.b.f0((b0) arrayList.get(i13 - i6))) != null) {
                                        method = sp.b.G(f02, descriptor);
                                    } else {
                                        method = null;
                                    }
                                    methodArr[i13] = method;
                                }
                                aVar = new a(k03, methodArr, declaredMethod);
                            } else {
                                throw new hs.e("Inconsistent number of parameters in the descriptor and Java reflection object: " + ca.a.b0(this) + " != " + size + "\nCalling: " + descriptor + "\nParameter types: " + a() + ")\nDefault: " + this.f4698b, 2);
                            }
                        }
                    }
                }
                i6 = 0;
                ArrayList arrayList2 = new ArrayList();
                k02 = descriptor.k0();
                if (k02 != null) {
                }
                if (b0Var != null) {
                }
                List<z0> i122 = descriptor.i();
                kotlin.jvm.internal.i.f(i122, "descriptor.valueParameters");
                while (r5.hasNext()) {
                }
                if (this.f4698b) {
                }
                if (descriptor.isSuspend()) {
                }
                size = arrayList2.size() + i6 + i10 + i11;
                if (ca.a.b0(this) == size) {
                }
            }
            i6 = -1;
            ArrayList arrayList22 = new ArrayList();
            k02 = descriptor.k0();
            if (k02 != null) {
            }
            if (b0Var != null) {
            }
            List<z0> i1222 = descriptor.i();
            kotlin.jvm.internal.i.f(i1222, "descriptor.valueParameters");
            while (r5.hasNext()) {
            }
            if (this.f4698b) {
            }
            if (descriptor.isSuspend()) {
            }
            size = arrayList22.size() + i6 + i10 + i11;
            if (ca.a.b0(this) == size) {
            }
        }
        this.f4699c = aVar;
    }

    @Override // bt.e
    public final List<Type> a() {
        return this.f4697a.a();
    }

    @Override // bt.e
    public final M b() {
        return this.f4697a.b();
    }

    @Override // bt.e
    public final Object call(Object[] args) {
        Object invoke;
        kotlin.jvm.internal.i.g(args, "args");
        a aVar = this.f4699c;
        xs.f fVar = aVar.f4700a;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        kotlin.jvm.internal.i.f(copyOf, "copyOf(this, size)");
        int i6 = fVar.f37996u;
        int i10 = fVar.f37997v;
        if (i6 <= i10) {
            while (true) {
                Method method = aVar.f4701b[i6];
                Object obj = args[i6];
                if (method != null) {
                    if (obj != null) {
                        obj = method.invoke(obj, new Object[0]);
                    } else {
                        Class<?> returnType = method.getReturnType();
                        kotlin.jvm.internal.i.f(returnType, "method.returnType");
                        obj = t0.e(returnType);
                    }
                }
                copyOf[i6] = obj;
                if (i6 == i10) {
                    break;
                }
                i6++;
            }
        }
        Object call = this.f4697a.call(copyOf);
        Method method2 = aVar.f4702c;
        if (method2 != null && (invoke = method2.invoke(null, call)) != null) {
            return invoke;
        }
        return call;
    }

    @Override // bt.e
    public final Type getReturnType() {
        return this.f4697a.getReturnType();
    }
}
