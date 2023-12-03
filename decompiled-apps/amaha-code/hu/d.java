package hu;

import com.appsflyer.R;
import dt.n;
import gt.a0;
import gt.a1;
import gt.b;
import gt.c0;
import gt.d0;
import gt.h0;
import gt.j0;
import gt.k0;
import gt.l0;
import gt.m0;
import gt.n0;
import gt.u0;
import gt.v0;
import gt.w0;
import gt.z;
import gt.z0;
import hu.c;
import hu.r;
import is.u;
import is.w;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.y;
import ku.q;
import ta.v;
import wu.b0;
import wu.d1;
import wu.i0;
import wu.k1;
import wu.m1;
import wu.o1;
import wu.p0;
import wu.x0;
/* compiled from: DescriptorRendererImpl.kt */
/* loaded from: classes2.dex */
public final class d extends hu.c implements j {

    /* renamed from: c  reason: collision with root package name */
    public final k f19541c;

    /* renamed from: d  reason: collision with root package name */
    public final hs.i f19542d = sp.b.O(new b());

    /* compiled from: DescriptorRendererImpl.kt */
    /* loaded from: classes2.dex */
    public final class a implements gt.l<hs.k, StringBuilder> {
        public a() {
        }

        @Override // gt.l
        public final hs.k a(d0 descriptor, StringBuilder sb2) {
            StringBuilder builder = sb2;
            kotlin.jvm.internal.i.g(descriptor, "descriptor");
            kotlin.jvm.internal.i.g(builder, "builder");
            d dVar = d.this;
            dVar.getClass();
            dVar.Y(descriptor.e(), "package-fragment", builder);
            if (dVar.m()) {
                builder.append(" in ");
                dVar.U(descriptor.c(), builder, false);
            }
            return hs.k.f19476a;
        }

        @Override // gt.l
        public final hs.k b(n0 descriptor, StringBuilder sb2) {
            StringBuilder builder = sb2;
            kotlin.jvm.internal.i.g(descriptor, "descriptor");
            kotlin.jvm.internal.i.g(builder, "builder");
            builder.append(descriptor.getName());
            return hs.k.f19476a;
        }

        @Override // gt.l
        public final hs.k c(gt.e descriptor, StringBuilder sb2) {
            boolean z10;
            gt.d R;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            String str;
            StringBuilder builder = sb2;
            kotlin.jvm.internal.i.g(descriptor, "descriptor");
            kotlin.jvm.internal.i.g(builder, "builder");
            d dVar = d.this;
            dVar.getClass();
            if (descriptor.j() == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!dVar.B()) {
                dVar.H(builder, descriptor, null);
                List<n0> J0 = descriptor.J0();
                kotlin.jvm.internal.i.f(J0, "klass.contextReceivers");
                dVar.K(builder, J0);
                if (!z10) {
                    gt.q visibility = descriptor.getVisibility();
                    kotlin.jvm.internal.i.f(visibility, "klass.visibility");
                    dVar.l0(visibility, builder);
                }
                if ((descriptor.j() != 2 || descriptor.m() != z.ABSTRACT) && (!defpackage.e.b(descriptor.j()) || descriptor.m() != z.FINAL)) {
                    z m10 = descriptor.m();
                    kotlin.jvm.internal.i.f(m10, "klass.modality");
                    dVar.R(m10, builder, d.F(descriptor));
                }
                dVar.Q(descriptor, builder);
                if (dVar.A().contains(i.INNER) && descriptor.N()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                dVar.T(builder, z11, "inner");
                if (dVar.A().contains(i.DATA) && descriptor.K0()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                dVar.T(builder, z12, "data");
                if (dVar.A().contains(i.INLINE) && descriptor.isInline()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                dVar.T(builder, z13, "inline");
                if (dVar.A().contains(i.VALUE) && descriptor.L()) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                dVar.T(builder, z14, "value");
                if (dVar.A().contains(i.FUN) && descriptor.B()) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                dVar.T(builder, z15, "fun");
                if (descriptor instanceof u0) {
                    str = "typealias";
                } else if (descriptor.w()) {
                    str = "companion object";
                } else {
                    int d10 = v.h.d(descriptor.j());
                    if (d10 != 0) {
                        if (d10 != 1) {
                            if (d10 != 2) {
                                if (d10 != 3) {
                                    if (d10 != 4) {
                                        if (d10 == 5) {
                                            str = "object";
                                        } else {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    } else {
                                        str = "annotation class";
                                    }
                                } else {
                                    str = "enum entry";
                                }
                            } else {
                                str = "enum class";
                            }
                        } else {
                            str = "interface";
                        }
                    } else {
                        str = "class";
                    }
                }
                builder.append(dVar.O(str));
            }
            boolean l2 = iu.g.l(descriptor);
            k kVar = dVar.f19541c;
            if (!l2) {
                if (!dVar.B()) {
                    d.c0(builder);
                }
                dVar.U(descriptor, builder, true);
            } else {
                if (((Boolean) kVar.F.b(k.W[30])).booleanValue()) {
                    if (dVar.B()) {
                        builder.append("companion object");
                    }
                    d.c0(builder);
                    gt.j c10 = descriptor.c();
                    if (c10 != null) {
                        builder.append("of ");
                        fu.e name = c10.getName();
                        kotlin.jvm.internal.i.f(name, "containingDeclaration.name");
                        builder.append(dVar.t(name, false));
                    }
                }
                if (dVar.E() || !kotlin.jvm.internal.i.b(descriptor.getName(), fu.g.f15934b)) {
                    if (!dVar.B()) {
                        d.c0(builder);
                    }
                    fu.e name2 = descriptor.getName();
                    kotlin.jvm.internal.i.f(name2, "descriptor.name");
                    builder.append(dVar.t(name2, true));
                }
            }
            if (!z10) {
                List<v0> t3 = descriptor.t();
                kotlin.jvm.internal.i.f(t3, "klass.declaredTypeParameters");
                dVar.h0(t3, builder, false);
                dVar.I(descriptor, builder);
                if (!defpackage.e.b(descriptor.j()) && ((Boolean) kVar.f19564i.b(k.W[7])).booleanValue() && (R = descriptor.R()) != null) {
                    builder.append(" ");
                    dVar.H(builder, R, null);
                    gt.q visibility2 = R.getVisibility();
                    kotlin.jvm.internal.i.f(visibility2, "primaryConstructor.visibility");
                    dVar.l0(visibility2, builder);
                    builder.append(dVar.O("constructor"));
                    List<z0> i6 = R.i();
                    kotlin.jvm.internal.i.f(i6, "primaryConstructor.valueParameters");
                    dVar.k0(i6, R.E(), builder);
                }
                if (!((Boolean) kVar.f19577w.b(k.W[21])).booleanValue() && !dt.j.F(descriptor.r())) {
                    Collection<b0> c11 = descriptor.l().c();
                    kotlin.jvm.internal.i.f(c11, "klass.typeConstructor.supertypes");
                    if (!c11.isEmpty() && (c11.size() != 1 || !dt.j.y(c11.iterator().next()))) {
                        d.c0(builder);
                        builder.append(": ");
                        u.l2(c11, builder, ", ", null, null, new h(dVar), 60);
                    }
                }
                dVar.m0(builder, t3);
            }
            return hs.k.f19476a;
        }

        @Override // gt.l
        public final hs.k d(z0 descriptor, StringBuilder sb2) {
            StringBuilder builder = sb2;
            kotlin.jvm.internal.i.g(descriptor, "descriptor");
            kotlin.jvm.internal.i.g(builder, "builder");
            d.this.j0(descriptor, true, builder, true);
            return hs.k.f19476a;
        }

        @Override // gt.l
        public final hs.k e(m0 descriptor, StringBuilder sb2) {
            StringBuilder builder = sb2;
            kotlin.jvm.internal.i.g(descriptor, "descriptor");
            kotlin.jvm.internal.i.g(builder, "builder");
            o(descriptor, builder, "setter");
            return hs.k.f19476a;
        }

        @Override // gt.l
        public final hs.k f(v0 descriptor, StringBuilder sb2) {
            StringBuilder builder = sb2;
            kotlin.jvm.internal.i.g(descriptor, "descriptor");
            kotlin.jvm.internal.i.g(builder, "builder");
            d.this.f0(descriptor, builder, true);
            return hs.k.f19476a;
        }

        @Override // gt.l
        public final /* bridge */ /* synthetic */ hs.k g(gt.u uVar, StringBuilder sb2) {
            n(uVar, sb2);
            return hs.k.f19476a;
        }

        @Override // gt.l
        public final hs.k h(l0 descriptor, StringBuilder sb2) {
            StringBuilder builder = sb2;
            kotlin.jvm.internal.i.g(descriptor, "descriptor");
            kotlin.jvm.internal.i.g(builder, "builder");
            o(descriptor, builder, "getter");
            return hs.k.f19476a;
        }

        @Override // gt.l
        public final hs.k i(h0 descriptor, StringBuilder sb2) {
            StringBuilder builder = sb2;
            kotlin.jvm.internal.i.g(descriptor, "descriptor");
            kotlin.jvm.internal.i.g(builder, "builder");
            d dVar = d.this;
            dVar.getClass();
            dVar.Y(descriptor.e(), "package", builder);
            if (dVar.m()) {
                builder.append(" in context of ");
                dVar.U(descriptor.w0(), builder, false);
            }
            return hs.k.f19476a;
        }

        @Override // gt.l
        public final hs.k j(k0 descriptor, StringBuilder sb2) {
            StringBuilder builder = sb2;
            kotlin.jvm.internal.i.g(descriptor, "descriptor");
            kotlin.jvm.internal.i.g(builder, "builder");
            d.w(d.this, descriptor, builder);
            return hs.k.f19476a;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00fa  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x014e  */
        @Override // gt.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final hs.k k(gt.i constructorDescriptor, StringBuilder sb2) {
            boolean z10;
            boolean z11;
            gt.d R;
            ArrayList arrayList;
            boolean z12;
            StringBuilder builder = sb2;
            kotlin.jvm.internal.i.g(constructorDescriptor, "constructorDescriptor");
            kotlin.jvm.internal.i.g(builder, "builder");
            d dVar = d.this;
            dVar.H(builder, constructorDescriptor, null);
            k kVar = dVar.f19541c;
            kVar.getClass();
            ys.m<Object>[] mVarArr = k.W;
            if (((Boolean) kVar.f19570o.b(mVarArr[13])).booleanValue() || constructorDescriptor.A().m() != z.SEALED) {
                gt.q visibility = constructorDescriptor.getVisibility();
                kotlin.jvm.internal.i.f(visibility, "constructor.visibility");
                if (dVar.l0(visibility, builder)) {
                    z10 = true;
                    dVar.P(constructorDescriptor, builder);
                    if (((Boolean) kVar.O.b(mVarArr[39])).booleanValue() && constructorDescriptor.z() && !z10) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        builder.append(dVar.O("constructor"));
                    }
                    gt.h c10 = constructorDescriptor.c();
                    kotlin.jvm.internal.i.f(c10, "constructor.containingDeclaration");
                    if (((Boolean) kVar.f19580z.b(mVarArr[24])).booleanValue()) {
                        if (z11) {
                            builder.append(" ");
                        }
                        dVar.U(c10, builder, true);
                        List<v0> typeParameters = constructorDescriptor.getTypeParameters();
                        kotlin.jvm.internal.i.f(typeParameters, "constructor.typeParameters");
                        dVar.h0(typeParameters, builder, false);
                    }
                    List<z0> i6 = constructorDescriptor.i();
                    kotlin.jvm.internal.i.f(i6, "constructor.valueParameters");
                    dVar.k0(i6, constructorDescriptor.E(), builder);
                    if (((Boolean) kVar.f19572q.b(mVarArr[15])).booleanValue() && !constructorDescriptor.z() && (c10 instanceof gt.e) && (R = ((gt.e) c10).R()) != null) {
                        List<z0> i10 = R.i();
                        kotlin.jvm.internal.i.f(i10, "primaryConstructor.valueParameters");
                        arrayList = new ArrayList();
                        for (Object obj : i10) {
                            z0 z0Var = (z0) obj;
                            if (!z0Var.v0() && z0Var.j0() == null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                arrayList.add(obj);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            builder.append(" : ");
                            builder.append(dVar.O("this"));
                            builder.append(u.m2(arrayList, ", ", "(", ")", g.f19549u, 24));
                        }
                    }
                    if (((Boolean) kVar.f19580z.b(k.W[24])).booleanValue()) {
                        List<v0> typeParameters2 = constructorDescriptor.getTypeParameters();
                        kotlin.jvm.internal.i.f(typeParameters2, "constructor.typeParameters");
                        dVar.m0(builder, typeParameters2);
                    }
                    return hs.k.f19476a;
                }
            }
            z10 = false;
            dVar.P(constructorDescriptor, builder);
            if (((Boolean) kVar.O.b(mVarArr[39])).booleanValue()) {
            }
            z11 = true;
            if (z11) {
            }
            gt.h c102 = constructorDescriptor.c();
            kotlin.jvm.internal.i.f(c102, "constructor.containingDeclaration");
            if (((Boolean) kVar.f19580z.b(mVarArr[24])).booleanValue()) {
            }
            List<z0> i62 = constructorDescriptor.i();
            kotlin.jvm.internal.i.f(i62, "constructor.valueParameters");
            dVar.k0(i62, constructorDescriptor.E(), builder);
            if (((Boolean) kVar.f19572q.b(mVarArr[15])).booleanValue()) {
                List<z0> i102 = R.i();
                kotlin.jvm.internal.i.f(i102, "primaryConstructor.valueParameters");
                arrayList = new ArrayList();
                while (r5.hasNext()) {
                }
                if (!arrayList.isEmpty()) {
                }
            }
            if (((Boolean) kVar.f19580z.b(k.W[24])).booleanValue()) {
            }
            return hs.k.f19476a;
        }

        @Override // gt.l
        public final hs.k l(a0 descriptor, StringBuilder sb2) {
            StringBuilder builder = sb2;
            kotlin.jvm.internal.i.g(descriptor, "descriptor");
            kotlin.jvm.internal.i.g(builder, "builder");
            d.this.U(descriptor, builder, true);
            return hs.k.f19476a;
        }

        @Override // gt.l
        public final hs.k m(u0 descriptor, StringBuilder sb2) {
            StringBuilder builder = sb2;
            kotlin.jvm.internal.i.g(descriptor, "descriptor");
            kotlin.jvm.internal.i.g(builder, "builder");
            d dVar = d.this;
            dVar.H(builder, descriptor, null);
            gt.q visibility = descriptor.getVisibility();
            kotlin.jvm.internal.i.f(visibility, "typeAlias.visibility");
            dVar.l0(visibility, builder);
            dVar.Q(descriptor, builder);
            builder.append(dVar.O("typealias"));
            builder.append(" ");
            dVar.U(descriptor, builder, true);
            List<v0> t3 = descriptor.t();
            kotlin.jvm.internal.i.f(t3, "typeAlias.declaredTypeParameters");
            dVar.h0(t3, builder, false);
            dVar.I(descriptor, builder);
            builder.append(" = ");
            builder.append(dVar.u(descriptor.g0()));
            return hs.k.f19476a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:61:0x01ad, code lost:
            if (dt.j.E(r1, dt.n.a.f13400d) == false) goto L63;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00c2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void n(gt.u descriptor, StringBuilder builder) {
            String u10;
            boolean z10;
            boolean z11;
            boolean z12;
            kotlin.jvm.internal.i.g(descriptor, "descriptor");
            kotlin.jvm.internal.i.g(builder, "builder");
            d dVar = d.this;
            boolean B = dVar.B();
            k kVar = dVar.f19541c;
            if (!B) {
                l lVar = kVar.f19562g;
                ys.m<Object>[] mVarArr = k.W;
                if (!((Boolean) lVar.b(mVarArr[5])).booleanValue()) {
                    dVar.H(builder, descriptor, null);
                    List<n0> r02 = descriptor.r0();
                    kotlin.jvm.internal.i.f(r02, "function.contextReceiverParameters");
                    dVar.K(builder, r02);
                    gt.q visibility = descriptor.getVisibility();
                    kotlin.jvm.internal.i.f(visibility, "function.visibility");
                    dVar.l0(visibility, builder);
                    dVar.S(descriptor, builder);
                    if (((Boolean) kVar.R.b(mVarArr[42])).booleanValue()) {
                        dVar.Q(descriptor, builder);
                    }
                    dVar.X(descriptor, builder);
                    if (((Boolean) kVar.R.b(mVarArr[42])).booleanValue()) {
                        boolean z13 = false;
                        if (descriptor.isOperator()) {
                            Collection<? extends gt.u> f = descriptor.f();
                            kotlin.jvm.internal.i.f(f, "functionDescriptor.overriddenDescriptors");
                            if (!f.isEmpty()) {
                                for (gt.u uVar : f) {
                                    if (uVar.isOperator()) {
                                        z12 = false;
                                        break;
                                    }
                                }
                            }
                            z12 = true;
                            if (z12 || ((Boolean) kVar.N.b(k.W[38])).booleanValue()) {
                                z10 = true;
                                if (descriptor.isInfix()) {
                                    Collection<? extends gt.u> f2 = descriptor.f();
                                    kotlin.jvm.internal.i.f(f2, "functionDescriptor.overriddenDescriptors");
                                    if (!f2.isEmpty()) {
                                        for (gt.u uVar2 : f2) {
                                            if (uVar2.isInfix()) {
                                                z11 = false;
                                                break;
                                            }
                                        }
                                    }
                                    z11 = true;
                                    if (z11 || ((Boolean) kVar.N.b(k.W[38])).booleanValue()) {
                                        z13 = true;
                                    }
                                }
                                dVar.T(builder, descriptor.Q(), "tailrec");
                                dVar.T(builder, descriptor.isSuspend(), "suspend");
                                dVar.T(builder, descriptor.isInline(), "inline");
                                dVar.T(builder, z13, "infix");
                                dVar.T(builder, z10, "operator");
                            }
                        }
                        z10 = false;
                        if (descriptor.isInfix()) {
                        }
                        dVar.T(builder, descriptor.Q(), "tailrec");
                        dVar.T(builder, descriptor.isSuspend(), "suspend");
                        dVar.T(builder, descriptor.isInline(), "inline");
                        dVar.T(builder, z13, "infix");
                        dVar.T(builder, z10, "operator");
                    } else {
                        dVar.T(builder, descriptor.isSuspend(), "suspend");
                    }
                    dVar.P(descriptor, builder);
                    if (dVar.E()) {
                        if (descriptor.x0()) {
                            builder.append("/*isHiddenToOvercomeSignatureClash*/ ");
                        }
                        if (descriptor.F0()) {
                            builder.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                        }
                    }
                }
                builder.append(dVar.O("fun"));
                builder.append(" ");
                List<v0> typeParameters = descriptor.getTypeParameters();
                kotlin.jvm.internal.i.f(typeParameters, "function.typeParameters");
                dVar.h0(typeParameters, builder, true);
                dVar.a0(builder, descriptor);
            }
            dVar.U(descriptor, builder, true);
            List<z0> i6 = descriptor.i();
            kotlin.jvm.internal.i.f(i6, "function.valueParameters");
            dVar.k0(i6, descriptor.E(), builder);
            dVar.b0(builder, descriptor);
            b0 returnType = descriptor.getReturnType();
            l lVar2 = kVar.f19567l;
            ys.m<Object>[] mVarArr2 = k.W;
            if (!((Boolean) lVar2.b(mVarArr2[10])).booleanValue()) {
                if (!((Boolean) kVar.f19566k.b(mVarArr2[9])).booleanValue() && returnType != null) {
                    fu.e eVar = dt.j.f13360e;
                }
                builder.append(": ");
                if (returnType == null) {
                    u10 = "[NULL]";
                } else {
                    u10 = dVar.u(returnType);
                }
                builder.append(u10);
            }
            List<v0> typeParameters2 = descriptor.getTypeParameters();
            kotlin.jvm.internal.i.f(typeParameters2, "function.typeParameters");
            dVar.m0(builder, typeParameters2);
        }

        public final void o(j0 j0Var, StringBuilder sb2, String str) {
            d dVar = d.this;
            int ordinal = ((q) dVar.f19541c.G.b(k.W[31])).ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    n(j0Var, sb2);
                    return;
                }
                return;
            }
            dVar.Q(j0Var, sb2);
            sb2.append(str.concat(" for "));
            k0 E0 = j0Var.E0();
            kotlin.jvm.internal.i.f(E0, "descriptor.correspondingProperty");
            d.w(dVar, E0, sb2);
        }
    }

    /* compiled from: DescriptorRendererImpl.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<d> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final d invoke() {
            us.a aVar;
            boolean z10;
            f changeOptions = f.f19548u;
            d dVar = d.this;
            dVar.getClass();
            kotlin.jvm.internal.i.g(changeOptions, "changeOptions");
            k kVar = dVar.f19541c;
            kVar.getClass();
            k kVar2 = new k();
            Field[] declaredFields = k.class.getDeclaredFields();
            kotlin.jvm.internal.i.f(declaredFields, "this::class.java.declaredFields");
            int length = declaredFields.length;
            int i6 = 0;
            int i10 = 0;
            while (i10 < length) {
                Field field = declaredFields[i10];
                if ((field.getModifiers() & 8) == 0) {
                    field.setAccessible(true);
                    Object obj = field.get(kVar);
                    if (obj instanceof us.a) {
                        aVar = (us.a) obj;
                    } else {
                        aVar = null;
                    }
                    if (aVar != null) {
                        String name = field.getName();
                        kotlin.jvm.internal.i.f(name, "field.name");
                        gv.n.H0(name, "is");
                        ys.d a10 = y.a(k.class);
                        String name2 = field.getName();
                        StringBuilder sb2 = new StringBuilder("get");
                        String name3 = field.getName();
                        kotlin.jvm.internal.i.f(name3, "field.name");
                        if (name3.length() > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            char upperCase = Character.toUpperCase(name3.charAt(i6));
                            String substring = name3.substring(1);
                            kotlin.jvm.internal.i.f(substring, "this as java.lang.String).substring(startIndex)");
                            name3 = upperCase + substring;
                        }
                        sb2.append(name3);
                        new s(a10, name2, sb2.toString());
                        field.set(kVar2, new l(aVar.f34506a, kVar2));
                    }
                }
                i10++;
                i6 = 0;
            }
            changeOptions.invoke(kVar2);
            kVar2.f19557a = true;
            return new d(kVar2);
        }
    }

    /* compiled from: DescriptorRendererImpl.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<ku.g<?>, CharSequence> {
        public c() {
            super(1);
        }

        @Override // ss.l
        public final CharSequence invoke(ku.g<?> gVar) {
            ku.g<?> it = gVar;
            kotlin.jvm.internal.i.g(it, "it");
            return d.this.J(it);
        }
    }

    /* compiled from: DescriptorRendererImpl.kt */
    /* renamed from: hu.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0296d extends kotlin.jvm.internal.k implements ss.l<b0, Object> {

        /* renamed from: u  reason: collision with root package name */
        public static final C0296d f19546u = new C0296d();

        public C0296d() {
            super(1);
        }

        @Override // ss.l
        public final Object invoke(b0 b0Var) {
            b0 it = b0Var;
            kotlin.jvm.internal.i.g(it, "it");
            if (it instanceof p0) {
                return ((p0) it).f37210v;
            }
            return it;
        }
    }

    public d(k kVar) {
        this.f19541c = kVar;
    }

    public static z F(gt.y yVar) {
        gt.e eVar;
        boolean z10 = yVar instanceof gt.e;
        z zVar = z.ABSTRACT;
        z zVar2 = z.FINAL;
        if (z10) {
            if (((gt.e) yVar).j() != 2) {
                return zVar2;
            }
            return zVar;
        }
        gt.j c10 = yVar.c();
        if (c10 instanceof gt.e) {
            eVar = (gt.e) c10;
        } else {
            eVar = null;
        }
        if (eVar == null) {
            return zVar2;
        }
        if (!(yVar instanceof gt.b)) {
            return zVar2;
        }
        gt.b bVar = (gt.b) yVar;
        Collection<? extends gt.b> f = bVar.f();
        kotlin.jvm.internal.i.f(f, "this.overriddenDescriptors");
        boolean z11 = !f.isEmpty();
        z zVar3 = z.OPEN;
        if (z11 && eVar.m() != zVar2) {
            return zVar3;
        }
        if (eVar.j() == 2 && !kotlin.jvm.internal.i.b(bVar.getVisibility(), gt.p.f16800a)) {
            if (bVar.m() != zVar) {
                return zVar3;
            }
            return zVar;
        }
        return zVar2;
    }

    public static void c0(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0 || sb2.charAt(length - 1) != ' ') {
            sb2.append(' ');
        }
    }

    public static String n0(String str, String str2, String str3, String str4, String str5) {
        if (gv.n.H0(str, str2) && gv.n.H0(str3, str4)) {
            String substring = str.substring(str2.length());
            kotlin.jvm.internal.i.f(substring, "this as java.lang.String).substring(startIndex)");
            String substring2 = str3.substring(str4.length());
            kotlin.jvm.internal.i.f(substring2, "this as java.lang.String).substring(startIndex)");
            String f = pl.a.f(str5, substring);
            if (kotlin.jvm.internal.i.b(substring, substring2)) {
                return f;
            }
            if (x(substring, substring2)) {
                return f + '!';
            }
            return null;
        }
        return null;
    }

    public static boolean o0(b0 b0Var) {
        boolean z10;
        if (!ca.a.H0(b0Var)) {
            return false;
        }
        List<d1> M0 = b0Var.M0();
        if (!(M0 instanceof Collection) || !M0.isEmpty()) {
            for (d1 d1Var : M0) {
                if (d1Var.d()) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        if (!z10) {
            return false;
        }
        return true;
    }

    public static final void w(d dVar, k0 k0Var, StringBuilder sb2) {
        boolean z10;
        boolean z11;
        if (!dVar.B()) {
            k kVar = dVar.f19541c;
            l lVar = kVar.f19562g;
            ys.m<Object>[] mVarArr = k.W;
            if (!((Boolean) lVar.b(mVarArr[5])).booleanValue()) {
                if (dVar.A().contains(i.ANNOTATIONS)) {
                    dVar.H(sb2, k0Var, null);
                    gt.s q02 = k0Var.q0();
                    if (q02 != null) {
                        dVar.H(sb2, q02, ht.e.FIELD);
                    }
                    gt.s l02 = k0Var.l0();
                    if (l02 != null) {
                        dVar.H(sb2, l02, ht.e.PROPERTY_DELEGATE_FIELD);
                    }
                    if (((q) kVar.G.b(mVarArr[31])) == q.NONE) {
                        kt.m0 n10 = k0Var.n();
                        if (n10 != null) {
                            dVar.H(sb2, n10, ht.e.PROPERTY_GETTER);
                        }
                        m0 h10 = k0Var.h();
                        if (h10 != null) {
                            dVar.H(sb2, h10, ht.e.PROPERTY_SETTER);
                            List<z0> i6 = h10.i();
                            kotlin.jvm.internal.i.f(i6, "setter.valueParameters");
                            z0 it = (z0) u.y2(i6);
                            kotlin.jvm.internal.i.f(it, "it");
                            dVar.H(sb2, it, ht.e.SETTER_PARAMETER);
                        }
                    }
                }
                List<n0> r02 = k0Var.r0();
                kotlin.jvm.internal.i.f(r02, "property.contextReceiverParameters");
                dVar.K(sb2, r02);
                gt.q visibility = k0Var.getVisibility();
                kotlin.jvm.internal.i.f(visibility, "property.visibility");
                dVar.l0(visibility, sb2);
                if (dVar.A().contains(i.CONST) && k0Var.x()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dVar.T(sb2, z10, "const");
                dVar.Q(k0Var, sb2);
                dVar.S(k0Var, sb2);
                dVar.X(k0Var, sb2);
                if (dVar.A().contains(i.LATEINIT) && k0Var.t0()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                dVar.T(sb2, z11, "lateinit");
                dVar.P(k0Var, sb2);
            }
            dVar.i0(k0Var, sb2, false);
            List<v0> typeParameters = k0Var.getTypeParameters();
            kotlin.jvm.internal.i.f(typeParameters, "property.typeParameters");
            dVar.h0(typeParameters, sb2, true);
            dVar.a0(sb2, k0Var);
        }
        dVar.U(k0Var, sb2, true);
        sb2.append(": ");
        b0 a10 = k0Var.a();
        kotlin.jvm.internal.i.f(a10, "property.type");
        sb2.append(dVar.u(a10));
        dVar.b0(sb2, k0Var);
        dVar.N(k0Var, sb2);
        List<v0> typeParameters2 = k0Var.getTypeParameters();
        kotlin.jvm.internal.i.f(typeParameters2, "property.typeParameters");
        dVar.m0(sb2, typeParameters2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
        if (kotlin.jvm.internal.i.b(r2 + '?', r3) == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean x(String str, String str2) {
        if (!kotlin.jvm.internal.i.b(str, gv.n.F0(str2, "?", ""))) {
            if (gv.n.z0(str2, "?")) {
            }
            if (!kotlin.jvm.internal.i.b("(" + str + ")?", str2)) {
                return false;
            }
        }
        return true;
    }

    public final Set<i> A() {
        return (Set) this.f19541c.f19561e.b(k.W[3]);
    }

    public final boolean B() {
        return ((Boolean) this.f19541c.f.b(k.W[4])).booleanValue();
    }

    public final r C() {
        return (r) this.f19541c.C.b(k.W[27]);
    }

    public final c.l D() {
        return (c.l) this.f19541c.B.b(k.W[26]);
    }

    public final boolean E() {
        return ((Boolean) this.f19541c.f19565j.b(k.W[8])).booleanValue();
    }

    public final String G(gt.j declarationDescriptor) {
        gt.j c10;
        String str;
        String s10;
        kotlin.jvm.internal.i.g(declarationDescriptor, "declarationDescriptor");
        StringBuilder sb2 = new StringBuilder();
        declarationDescriptor.F(new a(), sb2);
        k kVar = this.f19541c;
        l lVar = kVar.f19559c;
        ys.m<Object>[] mVarArr = k.W;
        if (((Boolean) lVar.b(mVarArr[1])).booleanValue() && !(declarationDescriptor instanceof d0) && !(declarationDescriptor instanceof h0) && (c10 = declarationDescriptor.c()) != null && !(c10 instanceof a0)) {
            sb2.append(" ");
            int ordinal = C().ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    str = "<i>defined in</i>";
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                str = "defined in";
            }
            sb2.append(str);
            sb2.append(" ");
            fu.d g5 = iu.g.g(c10);
            kotlin.jvm.internal.i.f(g5, "getFqName(containingDeclaration)");
            if (g5.d()) {
                s10 = "root package";
            } else {
                s10 = s(g5);
            }
            sb2.append(s10);
            if (((Boolean) kVar.f19560d.b(mVarArr[2])).booleanValue() && (c10 instanceof d0) && (declarationDescriptor instanceof gt.m)) {
                ((gt.m) declarationDescriptor).g().a();
            }
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final void H(StringBuilder sb2, ht.a aVar, ht.e eVar) {
        Set<fu.c> set;
        if (!A().contains(i.ANNOTATIONS)) {
            return;
        }
        boolean z10 = aVar instanceof b0;
        k kVar = this.f19541c;
        if (z10) {
            set = l();
        } else {
            set = (Set) kVar.J.b(k.W[34]);
        }
        ss.l lVar = (ss.l) kVar.L.b(k.W[36]);
        for (ht.c cVar : aVar.getAnnotations()) {
            if (!u.Z1(set, cVar.e()) && !kotlin.jvm.internal.i.b(cVar.e(), n.a.r) && (lVar == null || ((Boolean) lVar.invoke(cVar)).booleanValue())) {
                sb2.append(p(cVar, eVar));
                if (((Boolean) kVar.I.b(k.W[33])).booleanValue()) {
                    sb2.append('\n');
                } else {
                    sb2.append(" ");
                }
            }
        }
    }

    public final void I(gt.h hVar, StringBuilder sb2) {
        List<v0> t3 = hVar.t();
        kotlin.jvm.internal.i.f(t3, "classifier.declaredTypeParameters");
        List<v0> parameters = hVar.l().getParameters();
        kotlin.jvm.internal.i.f(parameters, "classifier.typeConstructor.parameters");
        if (E() && hVar.N() && parameters.size() > t3.size()) {
            sb2.append(" /*captured type parameters: ");
            g0(sb2, parameters.subList(t3.size(), parameters.size()));
            sb2.append("*/");
        }
    }

    public final String J(ku.g<?> gVar) {
        String p10;
        if (gVar instanceof ku.b) {
            return u.m2((Iterable) ((ku.b) gVar).f23941a, ", ", "{", "}", new c(), 24);
        }
        if (gVar instanceof ku.a) {
            p10 = p((ht.c) ((ku.a) gVar).f23941a, null);
            return gv.r.V0("@", p10);
        } else if (gVar instanceof ku.q) {
            q.a aVar = (q.a) ((ku.q) gVar).f23941a;
            if (aVar instanceof q.a.C0371a) {
                return ((q.a.C0371a) aVar).f23954a + "::class";
            } else if (aVar instanceof q.a.b) {
                q.a.b bVar = (q.a.b) aVar;
                String b10 = bVar.f23955a.f23939a.b().b();
                for (int i6 = 0; i6 < bVar.f23955a.f23940b; i6++) {
                    b10 = "kotlin.Array<" + b10 + '>';
                }
                return pl.a.f(b10, "::class");
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            return gVar.toString();
        }
    }

    public final void K(StringBuilder sb2, List list) {
        if (!list.isEmpty()) {
            sb2.append("context(");
            Iterator it = list.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                int i10 = i6 + 1;
                n0 n0Var = (n0) it.next();
                H(sb2, n0Var, ht.e.RECEIVER);
                b0 a10 = n0Var.a();
                kotlin.jvm.internal.i.f(a10, "contextReceiver.type");
                sb2.append(M(a10));
                if (i6 == ca.a.l0(list)) {
                    sb2.append(") ");
                } else {
                    sb2.append(", ");
                }
                i6 = i10;
            }
        }
    }

    public final void L(StringBuilder sb2, i0 i0Var) {
        wu.o oVar;
        i0 i0Var2;
        gt.h hVar = null;
        H(sb2, i0Var, null);
        if (i0Var instanceof wu.o) {
            oVar = (wu.o) i0Var;
        } else {
            oVar = null;
        }
        if (oVar != null) {
            i0Var2 = oVar.f37280v;
        } else {
            i0Var2 = null;
        }
        boolean z10 = false;
        if (v.E(i0Var)) {
            boolean z11 = i0Var instanceof yu.f;
            if (z11 && ((yu.f) i0Var).f39078x.f39089v) {
                z10 = true;
            }
            k kVar = this.f19541c;
            if (z10 && ((Boolean) kVar.T.b(k.W[45])).booleanValue()) {
                sb2.append(((yu.f) i0Var).B);
            } else if (z11 && !((Boolean) kVar.V.b(k.W[47])).booleanValue()) {
                sb2.append(((yu.f) i0Var).B);
            } else {
                sb2.append(i0Var.O0().toString());
            }
            sb2.append(d0(i0Var.M0()));
        } else if (i0Var instanceof p0) {
            sb2.append(((p0) i0Var).f37210v.toString());
        } else if (i0Var2 instanceof p0) {
            sb2.append(((p0) i0Var2).f37210v.toString());
        } else {
            x0 O0 = i0Var.O0();
            gt.g a10 = i0Var.O0().a();
            if (a10 instanceof gt.h) {
                hVar = (gt.h) a10;
            }
            s1.s a11 = w0.a(i0Var, hVar, 0);
            if (a11 == null) {
                sb2.append(e0(O0));
                sb2.append(d0(i0Var.M0()));
            } else {
                Z(sb2, a11);
            }
        }
        if (i0Var.P0()) {
            sb2.append("?");
        }
        if (i0Var instanceof wu.o) {
            sb2.append(" & Any");
        }
    }

    public final String M(b0 b0Var) {
        String u10 = u(b0Var);
        if (o0(b0Var) && !k1.g(b0Var)) {
            return "(" + u10 + ')';
        }
        return u10;
    }

    public final void N(a1 a1Var, StringBuilder sb2) {
        ku.g<?> X;
        if (((Boolean) this.f19541c.f19575u.b(k.W[19])).booleanValue() && (X = a1Var.X()) != null) {
            sb2.append(" = ");
            sb2.append(y(J(X)));
        }
    }

    public final String O(String str) {
        int ordinal = C().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (!((Boolean) this.f19541c.U.b(k.W[46])).booleanValue()) {
                    return defpackage.b.m("<b>", str, "</b>");
                }
                return str;
            }
            throw new NoWhenBranchMatchedException();
        }
        return str;
    }

    public final void P(gt.b bVar, StringBuilder sb2) {
        if (A().contains(i.MEMBER_KIND) && E() && bVar.m0() != b.a.DECLARATION) {
            sb2.append("/*");
            sb2.append(v.R(bVar.m0().name()));
            sb2.append("*/ ");
        }
    }

    public final void Q(gt.y yVar, StringBuilder sb2) {
        boolean z10;
        T(sb2, yVar.isExternal(), "external");
        boolean z11 = true;
        if (A().contains(i.EXPECT) && yVar.M()) {
            z10 = true;
        } else {
            z10 = false;
        }
        T(sb2, z10, "expect");
        T(sb2, (A().contains(i.ACTUAL) && yVar.H0()) ? false : false, "actual");
    }

    public final void R(z zVar, StringBuilder sb2, z zVar2) {
        if (!((Boolean) this.f19541c.f19571p.b(k.W[14])).booleanValue() && zVar == zVar2) {
            return;
        }
        T(sb2, A().contains(i.MODALITY), v.R(zVar.name()));
    }

    public final void S(gt.b bVar, StringBuilder sb2) {
        if (!iu.g.t(bVar) || bVar.m() != z.FINAL) {
            if (((o) this.f19541c.A.b(k.W[25])) == o.RENDER_OVERRIDE && bVar.m() == z.OPEN && (!bVar.f().isEmpty())) {
                return;
            }
            z m10 = bVar.m();
            kotlin.jvm.internal.i.f(m10, "callable.modality");
            R(m10, sb2, F(bVar));
        }
    }

    public final void T(StringBuilder sb2, boolean z10, String str) {
        if (z10) {
            sb2.append(O(str));
            sb2.append(" ");
        }
    }

    public final void U(gt.j jVar, StringBuilder sb2, boolean z10) {
        fu.e name = jVar.getName();
        kotlin.jvm.internal.i.f(name, "descriptor.name");
        sb2.append(t(name, z10));
    }

    public final void V(StringBuilder sb2, b0 b0Var) {
        wu.a aVar;
        m1 R0 = b0Var.R0();
        if (R0 instanceof wu.a) {
            aVar = (wu.a) R0;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            k kVar = this.f19541c;
            l lVar = kVar.Q;
            ys.m<Object>[] mVarArr = k.W;
            boolean booleanValue = ((Boolean) lVar.b(mVarArr[41])).booleanValue();
            i0 i0Var = aVar.f37199v;
            if (booleanValue) {
                W(sb2, i0Var);
                return;
            }
            W(sb2, aVar.f37200w);
            if (((Boolean) kVar.P.b(mVarArr[40])).booleanValue()) {
                r C = C();
                r.a aVar2 = r.f19597v;
                if (C == aVar2) {
                    sb2.append("<font color=\"808080\"><i>");
                }
                sb2.append(" /* = ");
                W(sb2, i0Var);
                sb2.append(" */");
                if (C() == aVar2) {
                    sb2.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        W(sb2, b0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(StringBuilder sb2, b0 b0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        fu.e eVar;
        int ordinal;
        String y10;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        if ((b0Var instanceof o1) && m() && !((o1) b0Var).T0()) {
            sb2.append("<Not computed yet>");
            return;
        }
        m1 R0 = b0Var.R0();
        if (R0 instanceof wu.v) {
            sb2.append(((wu.v) R0).W0(this, this));
        } else if (R0 instanceof i0) {
            i0 i0Var = (i0) R0;
            if (!kotlin.jvm.internal.i.b(i0Var, k1.f37262b)) {
                if (i0Var != null && i0Var.O0() == k1.f37261a.f39076v) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if (i0Var != null) {
                        x0 O0 = i0Var.O0();
                        if ((O0 instanceof yu.g) && ((yu.g) O0).f39081a == yu.h.D) {
                            z11 = true;
                            k kVar = this.f19541c;
                            if (!z11) {
                                if (((Boolean) kVar.f19574t.b(k.W[18])).booleanValue()) {
                                    x0 O02 = i0Var.O0();
                                    kotlin.jvm.internal.i.e(O02, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                                    String str = ((yu.g) O02).f39082b[0];
                                    int ordinal2 = C().ordinal();
                                    if (ordinal2 != 0) {
                                        if (ordinal2 == 1) {
                                            str = defpackage.b.m("<font color=red><b>", str, "</b></font>");
                                        } else {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                    sb2.append(str);
                                    return;
                                }
                                sb2.append("???");
                                return;
                            } else if (v.E(i0Var)) {
                                L(sb2, i0Var);
                                return;
                            } else if (o0(i0Var)) {
                                int length = sb2.length();
                                ((d) this.f19542d.getValue()).H(sb2, i0Var, null);
                                if (sb2.length() != length) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                b0 o02 = ca.a.o0(i0Var);
                                List e0 = ca.a.e0(i0Var);
                                if (!e0.isEmpty()) {
                                    sb2.append("context(");
                                    for (b0 b0Var2 : e0.subList(0, ca.a.l0(e0))) {
                                        V(sb2, b0Var2);
                                        sb2.append(", ");
                                    }
                                    V(sb2, (b0) u.o2(e0));
                                    sb2.append(") ");
                                }
                                boolean M0 = ca.a.M0(i0Var);
                                boolean P0 = i0Var.P0();
                                if (!P0 && (!z12 || o02 == null)) {
                                    z13 = false;
                                } else {
                                    z13 = true;
                                }
                                if (z13) {
                                    if (M0) {
                                        sb2.insert(length, '(');
                                    } else {
                                        if (z12) {
                                            if (sb2.length() == 0) {
                                                z18 = true;
                                            } else {
                                                z18 = false;
                                            }
                                            if (!z18) {
                                                ca.a.N0(sb2.charAt(gv.r.K0(sb2)));
                                                if (sb2.charAt(gv.r.K0(sb2) - 1) != ')') {
                                                    sb2.insert(gv.r.K0(sb2), "()");
                                                }
                                            } else {
                                                throw new NoSuchElementException("Char sequence is empty.");
                                            }
                                        }
                                        sb2.append("(");
                                    }
                                }
                                T(sb2, M0, "suspend");
                                if (o02 != null) {
                                    if (!o0(o02) || o02.P0()) {
                                        if (!ca.a.M0(o02) && o02.getAnnotations().isEmpty()) {
                                            z16 = false;
                                        } else {
                                            z16 = true;
                                        }
                                        if (!z16) {
                                            z17 = false;
                                            if (z17) {
                                                sb2.append("(");
                                            }
                                            V(sb2, o02);
                                            if (z17) {
                                                sb2.append(")");
                                            }
                                            sb2.append(".");
                                        }
                                    }
                                    z17 = true;
                                    if (z17) {
                                    }
                                    V(sb2, o02);
                                    if (z17) {
                                    }
                                    sb2.append(".");
                                }
                                sb2.append("(");
                                if (ca.a.H0(i0Var)) {
                                    if (i0Var.getAnnotations().l(n.a.f13411p) != null) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    if (z15) {
                                        z14 = true;
                                        if (!z14 && i0Var.M0().size() <= 1) {
                                            sb2.append("???");
                                        } else {
                                            int i6 = 0;
                                            for (d1 d1Var : ca.a.t0(i0Var)) {
                                                int i10 = i6 + 1;
                                                if (i6 > 0) {
                                                    sb2.append(", ");
                                                }
                                                if (((Boolean) kVar.S.b(k.W[43])).booleanValue()) {
                                                    b0 a10 = d1Var.a();
                                                    kotlin.jvm.internal.i.f(a10, "typeProjection.type");
                                                    eVar = ca.a.T(a10);
                                                } else {
                                                    eVar = null;
                                                }
                                                if (eVar != null) {
                                                    sb2.append(t(eVar, false));
                                                    sb2.append(": ");
                                                }
                                                sb2.append(v(d1Var));
                                                i6 = i10;
                                            }
                                        }
                                        sb2.append(") ");
                                        ordinal = C().ordinal();
                                        if (ordinal == 0) {
                                            if (ordinal == 1) {
                                                y10 = "&rarr;";
                                            } else {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                        } else {
                                            y10 = y("->");
                                        }
                                        sb2.append(y10);
                                        sb2.append(" ");
                                        ca.a.H0(i0Var);
                                        b0 a11 = ((d1) u.o2(i0Var.M0())).a();
                                        kotlin.jvm.internal.i.f(a11, "arguments.last().type");
                                        V(sb2, a11);
                                        if (z13) {
                                            sb2.append(")");
                                        }
                                        if (!P0) {
                                            sb2.append("?");
                                            return;
                                        }
                                        return;
                                    }
                                }
                                z14 = false;
                                if (!z14) {
                                }
                                int i62 = 0;
                                while (r4.hasNext()) {
                                }
                                sb2.append(") ");
                                ordinal = C().ordinal();
                                if (ordinal == 0) {
                                }
                                sb2.append(y10);
                                sb2.append(" ");
                                ca.a.H0(i0Var);
                                b0 a112 = ((d1) u.o2(i0Var.M0())).a();
                                kotlin.jvm.internal.i.f(a112, "arguments.last().type");
                                V(sb2, a112);
                                if (z13) {
                                }
                                if (!P0) {
                                }
                            } else {
                                L(sb2, i0Var);
                                return;
                            }
                        }
                    }
                    z11 = false;
                    k kVar2 = this.f19541c;
                    if (!z11) {
                    }
                }
            }
            sb2.append("???");
        }
    }

    public final void X(gt.b bVar, StringBuilder sb2) {
        if (A().contains(i.OVERRIDE) && (!bVar.f().isEmpty()) && ((o) this.f19541c.A.b(k.W[25])) != o.RENDER_OPEN) {
            T(sb2, true, "override");
            if (E()) {
                sb2.append("/*");
                sb2.append(bVar.f().size());
                sb2.append("*/ ");
            }
        }
    }

    public final void Y(fu.c cVar, String str, StringBuilder sb2) {
        boolean z10;
        sb2.append(O(str));
        fu.d i6 = cVar.i();
        kotlin.jvm.internal.i.f(i6, "fqName.toUnsafe()");
        String s10 = s(i6);
        if (s10.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            sb2.append(" ");
            sb2.append(s10);
        }
    }

    public final void Z(StringBuilder sb2, s1.s sVar) {
        s1.s sVar2 = (s1.s) sVar.f31226x;
        if (sVar2 != null) {
            Z(sb2, sVar2);
            sb2.append('.');
            fu.e name = ((gt.h) sVar.f31224v).getName();
            kotlin.jvm.internal.i.f(name, "possiblyInnerType.classifierDescriptor.name");
            sb2.append(t(name, false));
        } else {
            x0 l2 = ((gt.h) sVar.f31224v).l();
            kotlin.jvm.internal.i.f(l2, "possiblyInnerType.classi…escriptor.typeConstructor");
            sb2.append(e0(l2));
        }
        sb2.append(d0((List) sVar.f31225w));
    }

    @Override // hu.j
    public final void a() {
        this.f19541c.a();
    }

    public final void a0(StringBuilder sb2, gt.a aVar) {
        n0 k02 = aVar.k0();
        if (k02 != null) {
            H(sb2, k02, ht.e.RECEIVER);
            b0 a10 = k02.a();
            kotlin.jvm.internal.i.f(a10, "receiver.type");
            sb2.append(M(a10));
            sb2.append(".");
        }
    }

    @Override // hu.j
    public final void b() {
        this.f19541c.b();
    }

    public final void b0(StringBuilder sb2, gt.a aVar) {
        n0 k02;
        if (((Boolean) this.f19541c.E.b(k.W[29])).booleanValue() && (k02 = aVar.k0()) != null) {
            sb2.append(" on ");
            b0 a10 = k02.a();
            kotlin.jvm.internal.i.f(a10, "receiver.type");
            sb2.append(u(a10));
        }
    }

    @Override // hu.j
    public final void c() {
        this.f19541c.c();
    }

    @Override // hu.j
    public final void d(Set<? extends i> set) {
        kotlin.jvm.internal.i.g(set, "<set-?>");
        this.f19541c.d(set);
    }

    public final String d0(List<? extends d1> typeArguments) {
        kotlin.jvm.internal.i.g(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(y("<"));
        u.l2(typeArguments, sb2, ", ", null, null, new e(this), 60);
        sb2.append(y(">"));
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    @Override // hu.j
    public final boolean e() {
        return this.f19541c.e();
    }

    public final String e0(x0 typeConstructor) {
        boolean z10;
        kotlin.jvm.internal.i.g(typeConstructor, "typeConstructor");
        gt.g klass = typeConstructor.a();
        boolean z11 = true;
        if (klass instanceof v0) {
            z10 = true;
        } else {
            z10 = klass instanceof gt.e;
        }
        if (!z10) {
            z11 = klass instanceof u0;
        }
        if (z11) {
            kotlin.jvm.internal.i.g(klass, "klass");
            if (yu.i.f(klass)) {
                return klass.l().toString();
            }
            return z().a(klass, this);
        } else if (klass == null) {
            if (typeConstructor instanceof wu.z) {
                return ((wu.z) typeConstructor).g(C0296d.f19546u);
            }
            return typeConstructor.toString();
        } else {
            throw new IllegalStateException(("Unexpected classifier: " + klass.getClass()).toString());
        }
    }

    @Override // hu.j
    public final void f(LinkedHashSet linkedHashSet) {
        this.f19541c.f(linkedHashSet);
    }

    public final void f0(v0 v0Var, StringBuilder sb2, boolean z10) {
        boolean z11;
        boolean z12;
        if (z10) {
            sb2.append(y("<"));
        }
        if (E()) {
            sb2.append("/*");
            sb2.append(v0Var.getIndex());
            sb2.append("*/ ");
        }
        T(sb2, v0Var.D(), "reified");
        String str = v0Var.O().f37278u;
        boolean z13 = false;
        if (str.length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        T(sb2, z11, str);
        H(sb2, v0Var, null);
        U(v0Var, sb2, z10);
        int size = v0Var.getUpperBounds().size();
        if ((size > 1 && !z10) || size == 1) {
            b0 next = v0Var.getUpperBounds().iterator().next();
            if (next != null) {
                if (dt.j.y(next) && next.P0()) {
                    z13 = true;
                }
                if (!z13) {
                    sb2.append(" : ");
                    sb2.append(u(next));
                }
            } else {
                dt.j.a(141);
                throw null;
            }
        } else if (z10) {
            boolean z14 = true;
            for (b0 b0Var : v0Var.getUpperBounds()) {
                if (b0Var != null) {
                    if (dt.j.y(b0Var) && b0Var.P0()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        if (z14) {
                            sb2.append(" : ");
                        } else {
                            sb2.append(" & ");
                        }
                        sb2.append(u(b0Var));
                        z14 = false;
                    }
                } else {
                    dt.j.a(141);
                    throw null;
                }
            }
        }
        if (z10) {
            sb2.append(y(">"));
        }
    }

    @Override // hu.j
    public final void g() {
        this.f19541c.g();
    }

    public final void g0(StringBuilder sb2, List<? extends v0> list) {
        Iterator<? extends v0> it = list.iterator();
        while (it.hasNext()) {
            f0(it.next(), sb2, false);
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
    }

    @Override // hu.j
    public final void h(hu.b bVar) {
        this.f19541c.h(bVar);
    }

    public final void h0(List<? extends v0> list, StringBuilder sb2, boolean z10) {
        if (!((Boolean) this.f19541c.f19576v.b(k.W[20])).booleanValue() && (!list.isEmpty())) {
            sb2.append(y("<"));
            g0(sb2, list);
            sb2.append(y(">"));
            if (z10) {
                sb2.append(" ");
            }
        }
    }

    @Override // hu.j
    public final void i(p pVar) {
        this.f19541c.i(pVar);
    }

    public final void i0(a1 a1Var, StringBuilder sb2, boolean z10) {
        String str;
        if (z10 || !(a1Var instanceof z0)) {
            if (a1Var.i0()) {
                str = "var";
            } else {
                str = "val";
            }
            sb2.append(O(str));
            sb2.append(" ");
        }
    }

    @Override // hu.j
    public final void j() {
        this.f19541c.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j0(z0 z0Var, boolean z10, StringBuilder sb2, boolean z11) {
        boolean z12;
        b0 a10;
        b0 j02;
        b0 b0Var;
        boolean z13;
        boolean a11;
        boolean z14;
        if (z11) {
            sb2.append(O("value-parameter"));
            sb2.append(" ");
        }
        if (E()) {
            sb2.append("/*");
            sb2.append(z0Var.getIndex());
            sb2.append("*/ ");
        }
        gt.d dVar = null;
        H(sb2, z0Var, null);
        T(sb2, z0Var.b0(), "crossinline");
        T(sb2, z0Var.Y(), "noinline");
        k kVar = this.f19541c;
        l lVar = kVar.r;
        ys.m<Object>[] mVarArr = k.W;
        boolean z15 = false;
        if (((Boolean) lVar.b(mVarArr[16])).booleanValue()) {
            gt.a c10 = z0Var.c();
            if (c10 instanceof gt.d) {
                dVar = (gt.d) c10;
            }
            if (dVar != null && dVar.z()) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                z12 = true;
                if (z12) {
                    T(sb2, ((Boolean) kVar.f19573s.b(mVarArr[17])).booleanValue(), "actual");
                }
                a10 = z0Var.a();
                kotlin.jvm.internal.i.f(a10, "variable.type");
                j02 = z0Var.j0();
                if (j02 != null) {
                    b0Var = a10;
                } else {
                    b0Var = j02;
                }
                if (j02 == null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                T(sb2, z13, "vararg");
                if (!z12 || (z11 && !B())) {
                    i0(z0Var, sb2, z12);
                }
                if (z10) {
                    U(z0Var, sb2, z11);
                    sb2.append(": ");
                }
                sb2.append(u(b0Var));
                N(z0Var, sb2);
                if (E() && j02 != null) {
                    sb2.append(" /*");
                    sb2.append(u(a10));
                    sb2.append("*/");
                }
                if (((ss.l) kVar.f19579y.b(mVarArr[23])) != null) {
                    if (m()) {
                        a11 = z0Var.v0();
                    } else {
                        a11 = mu.a.a(z0Var);
                    }
                    if (a11) {
                        z15 = true;
                    }
                }
                if (!z15) {
                    StringBuilder sb3 = new StringBuilder(" = ");
                    ss.l lVar2 = (ss.l) kVar.f19579y.b(mVarArr[23]);
                    kotlin.jvm.internal.i.d(lVar2);
                    sb3.append((String) lVar2.invoke(z0Var));
                    sb2.append(sb3.toString());
                    return;
                }
                return;
            }
        }
        z12 = false;
        if (z12) {
        }
        a10 = z0Var.a();
        kotlin.jvm.internal.i.f(a10, "variable.type");
        j02 = z0Var.j0();
        if (j02 != null) {
        }
        if (j02 == null) {
        }
        T(sb2, z13, "vararg");
        if (!z12) {
        }
        i0(z0Var, sb2, z12);
        if (z10) {
        }
        sb2.append(u(b0Var));
        N(z0Var, sb2);
        if (E()) {
            sb2.append(" /*");
            sb2.append(u(a10));
            sb2.append("*/");
        }
        if (((ss.l) kVar.f19579y.b(mVarArr[23])) != null) {
        }
        if (!z15) {
        }
    }

    @Override // hu.j
    public final void k() {
        this.f19541c.k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r8 == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k0(List list, boolean z10, StringBuilder sb2) {
        int ordinal = ((p) this.f19541c.D.b(k.W[28])).ordinal();
        boolean z11 = true;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            z11 = false;
        }
        int size = list.size();
        D().b(sb2);
        Iterator it = list.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            z0 z0Var = (z0) it.next();
            D().d(z0Var, sb2);
            j0(z0Var, z11, sb2, false);
            D().a(z0Var, i6, size, sb2);
            i6++;
        }
        D().c(sb2);
    }

    @Override // hu.j
    public final Set<fu.c> l() {
        return this.f19541c.l();
    }

    public final boolean l0(gt.q qVar, StringBuilder sb2) {
        if (!A().contains(i.VISIBILITY)) {
            return false;
        }
        k kVar = this.f19541c;
        l lVar = kVar.f19569n;
        ys.m<Object>[] mVarArr = k.W;
        if (((Boolean) lVar.b(mVarArr[12])).booleanValue()) {
            qVar = qVar.d();
        }
        if (!((Boolean) kVar.f19570o.b(mVarArr[13])).booleanValue() && kotlin.jvm.internal.i.b(qVar, gt.p.f16809k)) {
            return false;
        }
        sb2.append(O(qVar.b()));
        sb2.append(" ");
        return true;
    }

    @Override // hu.j
    public final boolean m() {
        return this.f19541c.m();
    }

    public final void m0(StringBuilder sb2, List list) {
        if (((Boolean) this.f19541c.f19576v.b(k.W[20])).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            v0 v0Var = (v0) it.next();
            List<b0> upperBounds = v0Var.getUpperBounds();
            kotlin.jvm.internal.i.f(upperBounds, "typeParameter.upperBounds");
            for (b0 it2 : u.b2(upperBounds, 1)) {
                StringBuilder sb3 = new StringBuilder();
                fu.e name = v0Var.getName();
                kotlin.jvm.internal.i.f(name, "typeParameter.name");
                sb3.append(t(name, false));
                sb3.append(" : ");
                kotlin.jvm.internal.i.f(it2, "it");
                sb3.append(u(it2));
                arrayList.add(sb3.toString());
            }
        }
        if (!arrayList.isEmpty()) {
            sb2.append(" ");
            sb2.append(O("where"));
            sb2.append(" ");
            u.l2(arrayList, sb2, ", ", null, null, null, R.styleable.AppCompatTheme_windowMinWidthMajor);
        }
    }

    @Override // hu.j
    public final void n() {
        this.f19541c.n();
    }

    @Override // hu.j
    public final void o() {
        this.f19541c.o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hu.c
    public final String p(ht.c annotation, ht.e eVar) {
        gt.e eVar2;
        String str;
        gt.d R;
        List<z0> i6;
        kotlin.jvm.internal.i.g(annotation, "annotation");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        if (eVar != null) {
            sb2.append(eVar.f19488u + ':');
        }
        b0 a10 = annotation.a();
        sb2.append(u(a10));
        k kVar = this.f19541c;
        if (kVar.p().f19523u) {
            Map<fu.e, ku.g<?>> b10 = annotation.b();
            w wVar = null;
            if (((Boolean) kVar.H.b(k.W[32])).booleanValue()) {
                eVar2 = mu.a.d(annotation);
            } else {
                eVar2 = null;
            }
            if (eVar2 != null && (R = eVar2.R()) != null && (i6 = R.i()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : i6) {
                    if (((z0) obj).v0()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(is.i.H1(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((z0) it.next()).getName());
                }
                wVar = arrayList2;
            }
            if (wVar == null) {
                wVar = w.f20676u;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : wVar) {
                fu.e it2 = (fu.e) obj2;
                kotlin.jvm.internal.i.f(it2, "it");
                if (!b10.containsKey(it2)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(is.i.H1(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((fu.e) it3.next()).f() + " = ...");
            }
            Set<Map.Entry<fu.e, ku.g<?>>> entrySet = b10.entrySet();
            ArrayList arrayList5 = new ArrayList(is.i.H1(entrySet, 10));
            Iterator<T> it4 = entrySet.iterator();
            while (it4.hasNext()) {
                Map.Entry entry = (Map.Entry) it4.next();
                fu.e eVar3 = (fu.e) entry.getKey();
                ku.g<?> gVar = (ku.g) entry.getValue();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(eVar3.f());
                sb3.append(" = ");
                if (!wVar.contains(eVar3)) {
                    str = J(gVar);
                } else {
                    str = "...";
                }
                sb3.append(str);
                arrayList5.add(sb3.toString());
            }
            List C2 = u.C2(u.u2(arrayList5, arrayList4));
            if (kVar.p().f19524v || (!C2.isEmpty())) {
                u.l2(C2, sb2, ", ", "(", ")", null, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            }
        }
        if (E() && (v.E(a10) || (a10.O0().a() instanceof c0.b))) {
            sb2.append(" /* annotation class not found */");
        }
        String sb4 = sb2.toString();
        kotlin.jvm.internal.i.f(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }

    @Override // hu.c
    public final String r(String lowerRendered, String upperRendered, dt.j jVar) {
        kotlin.jvm.internal.i.g(lowerRendered, "lowerRendered");
        kotlin.jvm.internal.i.g(upperRendered, "upperRendered");
        if (x(lowerRendered, upperRendered)) {
            if (gv.n.H0(upperRendered, "(")) {
                return defpackage.b.m("(", lowerRendered, ")!");
            }
            return lowerRendered.concat("!");
        }
        String a10 = z().a(jVar.j(n.a.B), this);
        String f12 = gv.r.f1(a10, "Collection", a10);
        String n02 = n0(lowerRendered, f12.concat("Mutable"), upperRendered, f12, f12.concat("(Mutable)"));
        if (n02 != null) {
            return n02;
        }
        String n03 = n0(lowerRendered, f12.concat("MutableMap.MutableEntry"), upperRendered, f12.concat("Map.Entry"), f12.concat("(Mutable)Map.(Mutable)Entry"));
        if (n03 != null) {
            return n03;
        }
        hu.b z10 = z();
        gt.e k10 = jVar.k("Array");
        kotlin.jvm.internal.i.f(k10, "builtIns.array");
        String a11 = z10.a(k10, this);
        String f13 = gv.r.f1(a11, "Array", a11);
        StringBuilder c10 = v.h.c(f13);
        c10.append(y("Array<"));
        String sb2 = c10.toString();
        StringBuilder c11 = v.h.c(f13);
        c11.append(y("Array<out "));
        String sb3 = c11.toString();
        StringBuilder c12 = v.h.c(f13);
        c12.append(y("Array<(out) "));
        String n04 = n0(lowerRendered, sb2, upperRendered, sb3, c12.toString());
        if (n04 != null) {
            return n04;
        }
        return "(" + lowerRendered + ".." + upperRendered + ')';
    }

    @Override // hu.c
    public final String s(fu.d dVar) {
        return y(kotlin.jvm.internal.h.a0(dVar.f()));
    }

    @Override // hu.c
    public final String t(fu.e eVar, boolean z10) {
        String y10 = y(kotlin.jvm.internal.h.Z(eVar));
        if (((Boolean) this.f19541c.U.b(k.W[46])).booleanValue() && C() == r.f19597v && z10) {
            return defpackage.b.m("<b>", y10, "</b>");
        }
        return y10;
    }

    @Override // hu.c
    public final String u(b0 type) {
        kotlin.jvm.internal.i.g(type, "type");
        StringBuilder sb2 = new StringBuilder();
        V(sb2, (b0) ((ss.l) this.f19541c.f19578x.b(k.W[22])).invoke(type));
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    @Override // hu.c
    public final String v(d1 typeProjection) {
        kotlin.jvm.internal.i.g(typeProjection, "typeProjection");
        StringBuilder sb2 = new StringBuilder();
        u.l2(ca.a.O0(typeProjection), sb2, ", ", null, null, new e(this), 60);
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final String y(String str) {
        return C().d(str);
    }

    public final hu.b z() {
        return (hu.b) this.f19541c.f19558b.b(k.W[0]);
    }
}
