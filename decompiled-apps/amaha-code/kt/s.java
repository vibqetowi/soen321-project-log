package kt;

import com.theinnerhour.b2b.utils.SessionManager;
import gt.p;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import pu.i;
import vu.c;
/* compiled from: EnumEntrySyntheticClassDescriptor.java */
/* loaded from: classes2.dex */
public final class s extends m {
    public final wu.k B;
    public final a C;
    public final vu.i<Set<fu.e>> D;
    public final ht.h E;

    /* compiled from: EnumEntrySyntheticClassDescriptor.java */
    /* loaded from: classes2.dex */
    public class a extends pu.j {

        /* renamed from: b  reason: collision with root package name */
        public final vu.g<fu.e, Collection<? extends gt.p0>> f23883b;

        /* renamed from: c  reason: collision with root package name */
        public final vu.g<fu.e, Collection<? extends gt.k0>> f23884c;

        /* renamed from: d  reason: collision with root package name */
        public final vu.i<Collection<gt.j>> f23885d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ s f23886e;

        /* compiled from: EnumEntrySyntheticClassDescriptor.java */
        /* renamed from: kt.s$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0370a implements ss.l<fu.e, Collection<? extends gt.p0>> {
            public C0370a() {
            }

            @Override // ss.l
            public final Collection<? extends gt.p0> invoke(fu.e eVar) {
                fu.e eVar2 = eVar;
                a aVar = a.this;
                if (eVar2 != null) {
                    return aVar.j(aVar.i().a(eVar2, ot.c.FOR_NON_TRACKED_SCOPE), eVar2);
                }
                aVar.getClass();
                a.h(8);
                throw null;
            }
        }

        /* compiled from: EnumEntrySyntheticClassDescriptor.java */
        /* loaded from: classes2.dex */
        public class b implements ss.l<fu.e, Collection<? extends gt.k0>> {
            public b() {
            }

            @Override // ss.l
            public final Collection<? extends gt.k0> invoke(fu.e eVar) {
                fu.e eVar2 = eVar;
                a aVar = a.this;
                if (eVar2 != null) {
                    return aVar.j(aVar.i().c(eVar2, ot.c.FOR_NON_TRACKED_SCOPE), eVar2);
                }
                aVar.getClass();
                a.h(4);
                throw null;
            }
        }

        /* compiled from: EnumEntrySyntheticClassDescriptor.java */
        /* loaded from: classes2.dex */
        public class c implements ss.a<Collection<gt.j>> {
            public c() {
            }

            @Override // ss.a
            public final Collection<gt.j> invoke() {
                a aVar = a.this;
                aVar.getClass();
                HashSet hashSet = new HashSet();
                for (fu.e eVar : aVar.f23886e.D.invoke()) {
                    if (eVar != null) {
                        Collection collection = (Collection) ((c.k) aVar.f23883b).invoke(eVar);
                        if (collection != null) {
                            hashSet.addAll(collection);
                            Collection collection2 = (Collection) ((c.k) aVar.f23884c).invoke(eVar);
                            if (collection2 != null) {
                                hashSet.addAll(collection2);
                            } else {
                                a.h(3);
                                throw null;
                            }
                        } else {
                            a.h(7);
                            throw null;
                        }
                    } else {
                        a.h(5);
                        throw null;
                    }
                }
                return hashSet;
            }
        }

        public a(s sVar, vu.l lVar) {
            if (lVar != null) {
                this.f23886e = sVar;
                this.f23883b = lVar.h(new C0370a());
                this.f23884c = lVar.h(new b());
                this.f23885d = lVar.e(new c());
                return;
            }
            h(0);
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00b5 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00be  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static /* synthetic */ void h(int i6) {
            String str;
            int i10;
            if (i6 != 3 && i6 != 7 && i6 != 9 && i6 != 12) {
                switch (i6) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
                if (i6 != 3 && i6 != 7 && i6 != 9 && i6 != 12) {
                    switch (i6) {
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                            break;
                        default:
                            i10 = 3;
                            break;
                    }
                    Object[] objArr = new Object[i10];
                    switch (i6) {
                        case 1:
                        case 4:
                        case 5:
                        case 8:
                        case 10:
                            objArr[0] = SessionManager.KEY_NAME;
                            break;
                        case 2:
                        case 6:
                            objArr[0] = "location";
                            break;
                        case 3:
                        case 7:
                        case 9:
                        case 12:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                            break;
                        case 11:
                            objArr[0] = "fromSupertypes";
                            break;
                        case 13:
                            objArr[0] = "kindFilter";
                            break;
                        case 14:
                            objArr[0] = "nameFilter";
                            break;
                        case 20:
                            objArr[0] = "p";
                            break;
                        default:
                            objArr[0] = "storageManager";
                            break;
                    }
                    if (i6 == 3) {
                        if (i6 != 7) {
                            if (i6 != 9) {
                                if (i6 != 12) {
                                    switch (i6) {
                                        case 15:
                                            objArr[1] = "getContributedDescriptors";
                                            break;
                                        case 16:
                                            objArr[1] = "computeAllDeclarations";
                                            break;
                                        case 17:
                                            objArr[1] = "getFunctionNames";
                                            break;
                                        case 18:
                                            objArr[1] = "getClassifierNames";
                                            break;
                                        case 19:
                                            objArr[1] = "getVariableNames";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                                            break;
                                    }
                                } else {
                                    objArr[1] = "resolveFakeOverrides";
                                }
                            } else {
                                objArr[1] = "getSupertypeScope";
                            }
                        } else {
                            objArr[1] = "getContributedFunctions";
                        }
                    } else {
                        objArr[1] = "getContributedVariables";
                    }
                    switch (i6) {
                        case 1:
                        case 2:
                            objArr[2] = "getContributedVariables";
                            break;
                        case 3:
                        case 7:
                        case 9:
                        case 12:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                            break;
                        case 4:
                            objArr[2] = "computeProperties";
                            break;
                        case 5:
                        case 6:
                            objArr[2] = "getContributedFunctions";
                            break;
                        case 8:
                            objArr[2] = "computeFunctions";
                            break;
                        case 10:
                        case 11:
                            objArr[2] = "resolveFakeOverrides";
                            break;
                        case 13:
                        case 14:
                            objArr[2] = "getContributedDescriptors";
                            break;
                        case 20:
                            objArr[2] = "printScopeStructure";
                            break;
                        default:
                            objArr[2] = "<init>";
                            break;
                    }
                    String format = String.format(str, objArr);
                    if (i6 != 3 && i6 != 7 && i6 != 9 && i6 != 12) {
                        switch (i6) {
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                                break;
                            default:
                                throw new IllegalArgumentException(format);
                        }
                    }
                    throw new IllegalStateException(format);
                }
                i10 = 2;
                Object[] objArr2 = new Object[i10];
                switch (i6) {
                }
                if (i6 == 3) {
                }
                switch (i6) {
                }
                String format2 = String.format(str, objArr2);
                if (i6 != 3) {
                    switch (i6) {
                    }
                }
                throw new IllegalStateException(format2);
            }
            str = "@NotNull method %s.%s must not return null";
            if (i6 != 3) {
                switch (i6) {
                }
                Object[] objArr22 = new Object[i10];
                switch (i6) {
                }
                if (i6 == 3) {
                }
                switch (i6) {
                }
                String format22 = String.format(str, objArr22);
                if (i6 != 3) {
                }
                throw new IllegalStateException(format22);
            }
            i10 = 2;
            Object[] objArr222 = new Object[i10];
            switch (i6) {
            }
            if (i6 == 3) {
            }
            switch (i6) {
            }
            String format222 = String.format(str, objArr222);
            if (i6 != 3) {
            }
            throw new IllegalStateException(format222);
        }

        @Override // pu.j, pu.i
        public final Collection a(fu.e eVar, ot.c cVar) {
            if (eVar != null) {
                Collection collection = (Collection) ((c.k) this.f23883b).invoke(eVar);
                if (collection != null) {
                    return collection;
                }
                h(7);
                throw null;
            }
            h(5);
            throw null;
        }

        @Override // pu.j, pu.i
        public final Set<fu.e> b() {
            Set<fu.e> invoke = this.f23886e.D.invoke();
            if (invoke != null) {
                return invoke;
            }
            h(17);
            throw null;
        }

        @Override // pu.j, pu.i
        public final Collection c(fu.e eVar, ot.c cVar) {
            if (eVar != null) {
                Collection collection = (Collection) ((c.k) this.f23884c).invoke(eVar);
                if (collection != null) {
                    return collection;
                }
                h(3);
                throw null;
            }
            h(1);
            throw null;
        }

        @Override // pu.j, pu.i
        public final Set<fu.e> d() {
            Set<fu.e> invoke = this.f23886e.D.invoke();
            if (invoke != null) {
                return invoke;
            }
            h(19);
            throw null;
        }

        @Override // pu.j, pu.i
        public final Set<fu.e> e() {
            Set<fu.e> emptySet = Collections.emptySet();
            if (emptySet != null) {
                return emptySet;
            }
            h(18);
            throw null;
        }

        @Override // pu.j, pu.k
        public final Collection<gt.j> f(pu.d dVar, ss.l<? super fu.e, Boolean> lVar) {
            if (dVar != null) {
                if (lVar != null) {
                    Collection<gt.j> invoke = this.f23885d.invoke();
                    if (invoke != null) {
                        return invoke;
                    }
                    h(15);
                    throw null;
                }
                h(14);
                throw null;
            }
            h(13);
            throw null;
        }

        public final pu.i i() {
            pu.i p10 = ((wu.f) this.f23886e.l()).c().iterator().next().p();
            if (p10 != null) {
                return p10;
            }
            h(9);
            throw null;
        }

        public final LinkedHashSet j(Collection collection, fu.e eVar) {
            if (eVar != null) {
                if (collection != null) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    iu.l.f.h(eVar, collection, Collections.emptySet(), this.f23886e, new t(linkedHashSet));
                    return linkedHashSet;
                }
                h(11);
                throw null;
            }
            h(10);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(vu.l lVar, gt.e eVar, wu.i0 i0Var, fu.e eVar2, vu.i iVar, ht.h hVar, gt.q0 q0Var) {
        super(lVar, eVar, eVar2, q0Var);
        if (lVar != null) {
            if (eVar != null) {
                if (i0Var != null) {
                    if (eVar2 != null) {
                        if (iVar != null) {
                            if (q0Var != null) {
                                this.E = hVar;
                                this.B = new wu.k(this, Collections.emptyList(), Collections.singleton(i0Var), lVar);
                                this.C = new a(this, lVar);
                                this.D = iVar;
                                return;
                            }
                            D0(12);
                            throw null;
                        }
                        D0(10);
                        throw null;
                    }
                    D0(9);
                    throw null;
                }
                D0(8);
                throw null;
            }
            D0(7);
            throw null;
        }
        D0(6);
        throw null;
    }

    public static /* synthetic */ void D0(int i6) {
        String str;
        int i10;
        switch (i6) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i6) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i10 = 2;
                break;
            default:
                i10 = 3;
                break;
        }
        Object[] objArr = new Object[i10];
        switch (i6) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = SessionManager.KEY_NAME;
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i6) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i6) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        switch (i6) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static s M0(vu.l lVar, gt.e eVar, fu.e eVar2, vu.i<Set<fu.e>> iVar, ht.h hVar, gt.q0 q0Var) {
        if (lVar != null) {
            if (eVar != null) {
                if (eVar2 != null) {
                    if (iVar != null) {
                        if (q0Var != null) {
                            return new s(lVar, eVar, eVar.r(), eVar2, iVar, hVar, q0Var);
                        }
                        D0(5);
                        throw null;
                    }
                    D0(3);
                    throw null;
                }
                D0(2);
                throw null;
            }
            D0(1);
            throw null;
        }
        D0(0);
        throw null;
    }

    @Override // gt.e
    public final boolean B() {
        return false;
    }

    @Override // gt.e
    public final gt.x0<wu.i0> B0() {
        return null;
    }

    @Override // kt.b0
    public final pu.i C0(xu.e eVar) {
        if (eVar != null) {
            a aVar = this.C;
            if (aVar != null) {
                return aVar;
            }
            D0(14);
            throw null;
        }
        D0(13);
        throw null;
    }

    @Override // gt.y
    public final boolean H0() {
        return false;
    }

    @Override // gt.e
    public final Collection<gt.e> K() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        D0(23);
        throw null;
    }

    @Override // gt.e
    public final boolean K0() {
        return false;
    }

    @Override // gt.e
    public final boolean L() {
        return false;
    }

    @Override // gt.y
    public final boolean M() {
        return false;
    }

    @Override // gt.h
    public final boolean N() {
        return false;
    }

    @Override // gt.e
    public final gt.d R() {
        return null;
    }

    @Override // gt.e
    public final pu.i S() {
        i.b bVar = i.b.f29008b;
        if (bVar != null) {
            return bVar;
        }
        D0(15);
        throw null;
    }

    @Override // gt.e
    public final gt.e U() {
        return null;
    }

    @Override // ht.a
    public final ht.h getAnnotations() {
        ht.h hVar = this.E;
        if (hVar != null) {
            return hVar;
        }
        D0(21);
        throw null;
    }

    @Override // gt.e, gt.n, gt.y
    public final gt.q getVisibility() {
        p.h hVar = gt.p.f16804e;
        if (hVar != null) {
            return hVar;
        }
        D0(20);
        throw null;
    }

    @Override // gt.e
    public final boolean isInline() {
        return false;
    }

    @Override // gt.e
    public final int j() {
        return 4;
    }

    @Override // gt.g
    public final wu.x0 l() {
        wu.k kVar = this.B;
        if (kVar != null) {
            return kVar;
        }
        D0(17);
        throw null;
    }

    @Override // gt.e, gt.y
    public final gt.z m() {
        return gt.z.FINAL;
    }

    @Override // gt.e, gt.h
    public final List<gt.v0> t() {
        List<gt.v0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        D0(22);
        throw null;
    }

    public final String toString() {
        return "enum entry " + getName();
    }

    @Override // gt.e
    public final boolean w() {
        return false;
    }

    @Override // gt.e
    public final Collection<gt.d> y() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        D0(16);
        throw null;
    }
}
