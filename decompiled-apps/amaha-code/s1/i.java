package s1;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.j;
import androidx.lifecycle.q0;
import fv.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import s1.f;
import s1.r;
import s1.u;
/* compiled from: NavController.kt */
/* loaded from: classes.dex */
public class i {
    public final ArrayList A;
    public final hs.i B;
    public final kotlinx.coroutines.flow.t C;

    /* renamed from: a  reason: collision with root package name */
    public final Context f31136a;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f31137b;

    /* renamed from: c  reason: collision with root package name */
    public w f31138c;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f31139d;

    /* renamed from: e  reason: collision with root package name */
    public Parcelable[] f31140e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final is.g<s1.f> f31141g;

    /* renamed from: h  reason: collision with root package name */
    public final kotlinx.coroutines.flow.x f31142h;

    /* renamed from: i  reason: collision with root package name */
    public final LinkedHashMap f31143i;

    /* renamed from: j  reason: collision with root package name */
    public final LinkedHashMap f31144j;

    /* renamed from: k  reason: collision with root package name */
    public final LinkedHashMap f31145k;

    /* renamed from: l  reason: collision with root package name */
    public final LinkedHashMap f31146l;

    /* renamed from: m  reason: collision with root package name */
    public androidx.lifecycle.p f31147m;

    /* renamed from: n  reason: collision with root package name */
    public OnBackPressedDispatcher f31148n;

    /* renamed from: o  reason: collision with root package name */
    public p f31149o;

    /* renamed from: p  reason: collision with root package name */
    public final CopyOnWriteArrayList<b> f31150p;

    /* renamed from: q  reason: collision with root package name */
    public j.c f31151q;
    public final s1.h r;

    /* renamed from: s  reason: collision with root package name */
    public final e f31152s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f31153t;

    /* renamed from: u  reason: collision with root package name */
    public final i0 f31154u;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f31155v;

    /* renamed from: w  reason: collision with root package name */
    public ss.l<? super s1.f, hs.k> f31156w;

    /* renamed from: x  reason: collision with root package name */
    public ss.l<? super s1.f, hs.k> f31157x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f31158y;

    /* renamed from: z  reason: collision with root package name */
    public int f31159z;

    /* compiled from: NavController.kt */
    /* loaded from: classes.dex */
    public final class a extends j0 {

        /* renamed from: g  reason: collision with root package name */
        public final g0<? extends u> f31160g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ i f31161h;

        /* compiled from: NavController.kt */
        /* renamed from: s1.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0529a extends kotlin.jvm.internal.k implements ss.a<hs.k> {

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ s1.f f31163v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ boolean f31164w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0529a(s1.f fVar, boolean z10) {
                super(0);
                this.f31163v = fVar;
                this.f31164w = z10;
            }

            @Override // ss.a
            public final hs.k invoke() {
                a.super.c(this.f31163v, this.f31164w);
                return hs.k.f19476a;
            }
        }

        public a(i iVar, g0<? extends u> navigator) {
            kotlin.jvm.internal.i.g(navigator, "navigator");
            this.f31161h = iVar;
            this.f31160g = navigator;
        }

        @Override // s1.j0
        public final s1.f a(u uVar, Bundle bundle) {
            i iVar = this.f31161h;
            return f.a.a(iVar.f31136a, uVar, bundle, iVar.i(), iVar.f31149o);
        }

        @Override // s1.j0
        public final void c(s1.f popUpTo, boolean z10) {
            kotlin.jvm.internal.i.g(popUpTo, "popUpTo");
            i iVar = this.f31161h;
            g0 b10 = iVar.f31154u.b(popUpTo.f31115v.f31228u);
            if (kotlin.jvm.internal.i.b(b10, this.f31160g)) {
                ss.l<? super s1.f, hs.k> lVar = iVar.f31157x;
                if (lVar != null) {
                    lVar.invoke(popUpTo);
                    super.c(popUpTo, z10);
                    return;
                }
                C0529a c0529a = new C0529a(popUpTo, z10);
                is.g<s1.f> gVar = iVar.f31141g;
                int indexOf = gVar.indexOf(popUpTo);
                if (indexOf < 0) {
                    Log.i("NavController", "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
                    return;
                }
                int i6 = indexOf + 1;
                if (i6 != gVar.f20655w) {
                    iVar.p(gVar.get(i6).f31115v.B, true, false);
                }
                i.r(iVar, popUpTo);
                c0529a.invoke();
                iVar.x();
                iVar.b();
                return;
            }
            Object obj = iVar.f31155v.get(b10);
            kotlin.jvm.internal.i.d(obj);
            ((a) obj).c(popUpTo, z10);
        }

        @Override // s1.j0
        public final void d(s1.f backStackEntry) {
            kotlin.jvm.internal.i.g(backStackEntry, "backStackEntry");
            i iVar = this.f31161h;
            g0 b10 = iVar.f31154u.b(backStackEntry.f31115v.f31228u);
            if (kotlin.jvm.internal.i.b(b10, this.f31160g)) {
                ss.l<? super s1.f, hs.k> lVar = iVar.f31156w;
                if (lVar != null) {
                    lVar.invoke(backStackEntry);
                    super.d(backStackEntry);
                    return;
                }
                Log.i("NavController", "Ignoring add of destination " + backStackEntry.f31115v + " outside of the call to navigate(). ");
                return;
            }
            Object obj = iVar.f31155v.get(b10);
            if (obj != null) {
                ((a) obj).d(backStackEntry);
                return;
            }
            throw new IllegalStateException(r1.b0.b(new StringBuilder("NavigatorBackStack for "), backStackEntry.f31115v.f31228u, " should already be created").toString());
        }

        public final void f(s1.f fVar) {
            super.d(fVar);
        }
    }

    /* compiled from: NavController.kt */
    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* compiled from: NavController.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<Context, Context> {

        /* renamed from: u  reason: collision with root package name */
        public static final c f31165u = new c();

        public c() {
            super(1);
        }

        @Override // ss.l
        public final Context invoke(Context context) {
            Context it = context;
            kotlin.jvm.internal.i.g(it, "it");
            if (it instanceof ContextWrapper) {
                return ((ContextWrapper) it).getBaseContext();
            }
            return null;
        }
    }

    /* compiled from: NavController.kt */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<z> {
        public d() {
            super(0);
        }

        @Override // ss.a
        public final z invoke() {
            i iVar = i.this;
            iVar.getClass();
            return new z(iVar.f31136a, iVar.f31154u);
        }
    }

    /* compiled from: NavController.kt */
    /* loaded from: classes.dex */
    public static final class e extends androidx.activity.h {
        public e() {
            super(false);
        }

        @Override // androidx.activity.h
        public final void a() {
            i.this.o();
        }
    }

    /* compiled from: NavController.kt */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.l<s1.f, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.u f31168u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.u f31169v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ i f31170w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f31171x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ is.g<s1.g> f31172y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(kotlin.jvm.internal.u uVar, kotlin.jvm.internal.u uVar2, i iVar, boolean z10, is.g<s1.g> gVar) {
            super(1);
            this.f31168u = uVar;
            this.f31169v = uVar2;
            this.f31170w = iVar;
            this.f31171x = z10;
            this.f31172y = gVar;
        }

        @Override // ss.l
        public final hs.k invoke(s1.f fVar) {
            s1.f entry = fVar;
            kotlin.jvm.internal.i.g(entry, "entry");
            this.f31168u.f23466u = true;
            this.f31169v.f23466u = true;
            this.f31170w.q(entry, this.f31171x, this.f31172y);
            return hs.k.f19476a;
        }
    }

    /* compiled from: NavController.kt */
    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.l<u, u> {

        /* renamed from: u  reason: collision with root package name */
        public static final g f31173u = new g();

        public g() {
            super(1);
        }

        @Override // ss.l
        public final u invoke(u uVar) {
            boolean z10;
            u destination = uVar;
            kotlin.jvm.internal.i.g(destination, "destination");
            w wVar = destination.f31229v;
            if (wVar != null && wVar.F == destination.B) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return null;
            }
            return wVar;
        }
    }

    /* compiled from: NavController.kt */
    /* loaded from: classes.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.l<u, Boolean> {
        public h() {
            super(1);
        }

        @Override // ss.l
        public final Boolean invoke(u uVar) {
            u destination = uVar;
            kotlin.jvm.internal.i.g(destination, "destination");
            return Boolean.valueOf(!i.this.f31145k.containsKey(Integer.valueOf(destination.B)));
        }
    }

    /* compiled from: NavController.kt */
    /* renamed from: s1.i$i  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0530i extends kotlin.jvm.internal.k implements ss.l<u, u> {

        /* renamed from: u  reason: collision with root package name */
        public static final C0530i f31175u = new C0530i();

        public C0530i() {
            super(1);
        }

        @Override // ss.l
        public final u invoke(u uVar) {
            boolean z10;
            u destination = uVar;
            kotlin.jvm.internal.i.g(destination, "destination");
            w wVar = destination.f31229v;
            if (wVar != null && wVar.F == destination.B) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return null;
            }
            return wVar;
        }
    }

    /* compiled from: NavController.kt */
    /* loaded from: classes.dex */
    public static final class j extends kotlin.jvm.internal.k implements ss.l<u, Boolean> {
        public j() {
            super(1);
        }

        @Override // ss.l
        public final Boolean invoke(u uVar) {
            u destination = uVar;
            kotlin.jvm.internal.i.g(destination, "destination");
            return Boolean.valueOf(!i.this.f31145k.containsKey(Integer.valueOf(destination.B)));
        }
    }

    public i(Context context) {
        Object obj;
        this.f31136a = context;
        Iterator it = fv.k.x0(c.f31165u, context).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.f31137b = (Activity) obj;
        this.f31141g = new is.g<>();
        kotlinx.coroutines.flow.x f2 = tr.r.f(is.w.f20676u);
        this.f31142h = f2;
        new kotlinx.coroutines.flow.q(f2);
        this.f31143i = new LinkedHashMap();
        this.f31144j = new LinkedHashMap();
        this.f31145k = new LinkedHashMap();
        this.f31146l = new LinkedHashMap();
        this.f31150p = new CopyOnWriteArrayList<>();
        this.f31151q = j.c.INITIALIZED;
        this.r = new s1.h(0, this);
        this.f31152s = new e();
        this.f31153t = true;
        i0 i0Var = new i0();
        this.f31154u = i0Var;
        this.f31155v = new LinkedHashMap();
        this.f31158y = new LinkedHashMap();
        i0Var.a(new x(i0Var));
        i0Var.a(new s1.a(this.f31136a));
        this.A = new ArrayList();
        this.B = sp.b.O(new d());
        this.C = new kotlinx.coroutines.flow.t(1, 1, iv.e.DROP_OLDEST);
    }

    public static u d(u uVar, int i6) {
        w wVar;
        if (uVar.B == i6) {
            return uVar;
        }
        if (uVar instanceof w) {
            wVar = (w) uVar;
        } else {
            wVar = uVar.f31229v;
            kotlin.jvm.internal.i.d(wVar);
        }
        return wVar.z(i6, true);
    }

    public static /* synthetic */ void r(i iVar, s1.f fVar) {
        iVar.q(fVar, false, new is.g<>());
    }

    public final void a(u uVar, Bundle bundle, s1.f fVar, List<s1.f> list) {
        u uVar2;
        Object obj;
        u uVar3;
        Object obj2;
        s1.f fVar2;
        s1.f fVar3;
        u uVar4 = fVar.f31115v;
        boolean z10 = uVar4 instanceof s1.c;
        is.g<s1.f> gVar = this.f31141g;
        if (!z10) {
            while (!gVar.isEmpty() && (gVar.last().f31115v instanceof s1.c) && p(gVar.last().f31115v.B, true, false)) {
            }
        }
        is.g gVar2 = new is.g();
        boolean z11 = uVar instanceof w;
        Context context = this.f31136a;
        s1.f fVar4 = null;
        if (z11) {
            u uVar5 = uVar4;
            do {
                kotlin.jvm.internal.i.d(uVar5);
                uVar5 = uVar5.f31229v;
                if (uVar5 != null) {
                    ListIterator<s1.f> listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            fVar3 = listIterator.previous();
                            if (kotlin.jvm.internal.i.b(fVar3.f31115v, uVar5)) {
                                break;
                            }
                        } else {
                            fVar3 = null;
                            break;
                        }
                    }
                    s1.f fVar5 = fVar3;
                    if (fVar5 == null) {
                        fVar5 = f.a.a(context, uVar5, bundle, i(), this.f31149o);
                    }
                    gVar2.addFirst(fVar5);
                    if ((!gVar.isEmpty()) && gVar.last().f31115v == uVar5) {
                        r(this, gVar.last());
                    }
                }
                if (uVar5 == null) {
                    break;
                }
            } while (uVar5 != uVar);
        }
        if (gVar2.isEmpty()) {
            uVar2 = uVar4;
        } else {
            uVar2 = ((s1.f) gVar2.first()).f31115v;
        }
        while (uVar2 != null && c(uVar2.B) == null) {
            uVar2 = uVar2.f31229v;
            if (uVar2 != null) {
                ListIterator<s1.f> listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        fVar2 = listIterator2.previous();
                        if (kotlin.jvm.internal.i.b(fVar2.f31115v, uVar2)) {
                            break;
                        }
                    } else {
                        fVar2 = null;
                        break;
                    }
                }
                s1.f fVar6 = fVar2;
                if (fVar6 == null) {
                    fVar6 = f.a.a(context, uVar2, uVar2.m(bundle), i(), this.f31149o);
                }
                gVar2.addFirst(fVar6);
            }
        }
        if (!gVar2.isEmpty()) {
            uVar4 = ((s1.f) gVar2.first()).f31115v;
        }
        while (!gVar.isEmpty() && (gVar.last().f31115v instanceof w) && ((w) gVar.last().f31115v).z(uVar4.B, false) == null) {
            r(this, gVar.last());
        }
        if (gVar.isEmpty()) {
            obj = null;
        } else {
            obj = gVar.f20654v[gVar.f20653u];
        }
        s1.f fVar7 = (s1.f) obj;
        if (fVar7 == null) {
            if (gVar2.isEmpty()) {
                obj2 = null;
            } else {
                obj2 = gVar2.f20654v[gVar2.f20653u];
            }
            fVar7 = (s1.f) obj2;
        }
        if (fVar7 != null) {
            uVar3 = fVar7.f31115v;
        } else {
            uVar3 = null;
        }
        if (!kotlin.jvm.internal.i.b(uVar3, this.f31138c)) {
            ListIterator<s1.f> listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                s1.f previous = listIterator3.previous();
                u uVar6 = previous.f31115v;
                w wVar = this.f31138c;
                kotlin.jvm.internal.i.d(wVar);
                if (kotlin.jvm.internal.i.b(uVar6, wVar)) {
                    fVar4 = previous;
                    break;
                }
            }
            s1.f fVar8 = fVar4;
            if (fVar8 == null) {
                w wVar2 = this.f31138c;
                kotlin.jvm.internal.i.d(wVar2);
                w wVar3 = this.f31138c;
                kotlin.jvm.internal.i.d(wVar3);
                fVar8 = f.a.a(context, wVar2, wVar3.m(bundle), i(), this.f31149o);
            }
            gVar2.addFirst(fVar8);
        }
        Iterator<E> it = gVar2.iterator();
        while (it.hasNext()) {
            s1.f fVar9 = (s1.f) it.next();
            Object obj3 = this.f31155v.get(this.f31154u.b(fVar9.f31115v.f31228u));
            if (obj3 != null) {
                ((a) obj3).f(fVar9);
            } else {
                throw new IllegalStateException(r1.b0.b(new StringBuilder("NavigatorBackStack for "), uVar.f31228u, " should already be created").toString());
            }
        }
        gVar.addAll(gVar2);
        gVar.addLast(fVar);
        Iterator it2 = is.u.v2(fVar, gVar2).iterator();
        while (it2.hasNext()) {
            s1.f fVar10 = (s1.f) it2.next();
            w wVar4 = fVar10.f31115v.f31229v;
            if (wVar4 != null) {
                k(fVar10, e(wVar4.B));
            }
        }
    }

    public final boolean b() {
        is.g<s1.f> gVar;
        while (true) {
            gVar = this.f31141g;
            if (gVar.isEmpty() || !(gVar.last().f31115v instanceof w)) {
                break;
            }
            r(this, gVar.last());
        }
        s1.f s10 = gVar.s();
        ArrayList arrayList = this.A;
        if (s10 != null) {
            arrayList.add(s10);
        }
        this.f31159z++;
        w();
        int i6 = this.f31159z - 1;
        this.f31159z = i6;
        if (i6 == 0) {
            ArrayList J2 = is.u.J2(arrayList);
            arrayList.clear();
            Iterator it = J2.iterator();
            while (it.hasNext()) {
                s1.f fVar = (s1.f) it.next();
                Iterator<b> it2 = this.f31150p.iterator();
                while (it2.hasNext()) {
                    u uVar = fVar.f31115v;
                    it2.next().a();
                }
                this.C.o(fVar);
            }
            this.f31142h.setValue(s());
        }
        if (s10 != null) {
            return true;
        }
        return false;
    }

    public final u c(int i6) {
        u uVar;
        w wVar = this.f31138c;
        if (wVar == null) {
            return null;
        }
        if (wVar.B == i6) {
            return wVar;
        }
        s1.f s10 = this.f31141g.s();
        if (s10 == null || (uVar = s10.f31115v) == null) {
            uVar = this.f31138c;
            kotlin.jvm.internal.i.d(uVar);
        }
        return d(uVar, i6);
    }

    public final s1.f e(int i6) {
        s1.f fVar;
        boolean z10;
        is.g<s1.f> gVar = this.f31141g;
        ListIterator<s1.f> listIterator = gVar.listIterator(gVar.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                fVar = listIterator.previous();
                if (fVar.f31115v.B == i6) {
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
                fVar = null;
                break;
            }
        }
        s1.f fVar2 = fVar;
        if (fVar2 != null) {
            return fVar2;
        }
        StringBuilder u10 = defpackage.c.u("No destination with ID ", i6, " is on the NavController's back stack. The current destination is ");
        u10.append(f());
        throw new IllegalArgumentException(u10.toString().toString());
    }

    public final u f() {
        s1.f s10 = this.f31141g.s();
        if (s10 != null) {
            return s10.f31115v;
        }
        return null;
    }

    public final int g() {
        is.g<s1.f> gVar = this.f31141g;
        int i6 = 0;
        if (!(gVar instanceof Collection) || !gVar.isEmpty()) {
            for (s1.f fVar : gVar) {
                if ((!(fVar.f31115v instanceof w)) && (i6 = i6 + 1) < 0) {
                    ca.a.s1();
                    throw null;
                }
            }
        }
        return i6;
    }

    public final w h() {
        w wVar = this.f31138c;
        if (wVar != null) {
            if (wVar != null) {
                return wVar;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavGraph");
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
    }

    public final j.c i() {
        if (this.f31147m == null) {
            return j.c.CREATED;
        }
        return this.f31151q;
    }

    public final s1.f j() {
        Object obj;
        Iterator it = is.u.w2(this.f31141g).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = fv.k.u0(it).iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                if (!(((s1.f) obj).f31115v instanceof w)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (s1.f) obj;
    }

    public final void k(s1.f fVar, s1.f fVar2) {
        this.f31143i.put(fVar, fVar2);
        LinkedHashMap linkedHashMap = this.f31144j;
        if (linkedHashMap.get(fVar2) == null) {
            linkedHashMap.put(fVar2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(fVar2);
        kotlin.jvm.internal.i.d(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i6, Bundle bundle, a0 a0Var) {
        u uVar;
        int i10;
        Bundle bundle2;
        boolean z10;
        int i11;
        is.g<s1.f> gVar = this.f31141g;
        if (gVar.isEmpty()) {
            uVar = this.f31138c;
        } else {
            uVar = gVar.last().f31115v;
        }
        if (uVar != null) {
            s1.d q10 = uVar.q(i6);
            if (q10 != null) {
                if (a0Var == null) {
                    a0Var = q10.f31107b;
                }
                Bundle bundle3 = q10.f31108c;
                i10 = q10.f31106a;
                if (bundle3 != null) {
                    bundle2 = new Bundle();
                    bundle2.putAll(bundle3);
                    if (bundle != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putAll(bundle);
                    }
                    boolean z11 = false;
                    if (i10 != 0 && a0Var != null && (i11 = a0Var.f31072c) != -1) {
                        if (p(i11, a0Var.f31073d, false)) {
                            b();
                            return;
                        }
                        return;
                    }
                    if (i10 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        u c10 = c(i10);
                        if (c10 == null) {
                            int i12 = u.D;
                            Context context = this.f31136a;
                            String a10 = u.a.a(i10, context);
                            if (q10 == null) {
                                z11 = true;
                            }
                            if (!z11) {
                                StringBuilder g5 = defpackage.d.g("Navigation destination ", a10, " referenced from action ");
                                g5.append(u.a.a(i6, context));
                                g5.append(" cannot be found from the current destination ");
                                g5.append(uVar);
                                throw new IllegalArgumentException(g5.toString().toString());
                            }
                            throw new IllegalArgumentException("Navigation action/destination " + a10 + " cannot be found from the current destination " + uVar);
                        }
                        m(c10, bundle2, a0Var);
                        return;
                    }
                    throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo".toString());
                }
            } else {
                i10 = i6;
            }
            bundle2 = null;
            if (bundle != null) {
            }
            boolean z112 = false;
            if (i10 != 0) {
            }
            if (i10 == 0) {
            }
            if (!z10) {
            }
        } else {
            throw new IllegalStateException("no current navigation node");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0109 A[LOOP:1: B:44:0x0103->B:46:0x0109, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(u uVar, Bundle bundle, a0 a0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        u uVar2;
        int i6;
        LinkedHashMap linkedHashMap = this.f31155v;
        for (a aVar : linkedHashMap.values()) {
            aVar.f31183d = true;
        }
        kotlin.jvm.internal.u uVar3 = new kotlin.jvm.internal.u();
        if (a0Var != null && (i6 = a0Var.f31072c) != -1) {
            z10 = p(i6, a0Var.f31073d, a0Var.f31074e);
        } else {
            z10 = false;
        }
        Bundle m10 = uVar.m(bundle);
        if (a0Var != null && a0Var.f31071b) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && this.f31145k.containsKey(Integer.valueOf(uVar.B))) {
            uVar3.f23466u = t(uVar.B, m10, a0Var);
            z13 = z10;
        } else {
            is.g<s1.f> gVar = this.f31141g;
            s1.f entry = gVar.s();
            g0 b10 = this.f31154u.b(uVar.f31228u);
            if (a0Var != null && a0Var.f31070a) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                if (entry != null && (uVar2 = entry.f31115v) != null && uVar.B == uVar2.B) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14) {
                    v(gVar.removeLast());
                    kotlin.jvm.internal.i.g(entry, "entry");
                    z13 = z10;
                    s1.f fVar = new s1.f(entry.f31114u, entry.f31115v, m10, entry.f31117x, entry.f31118y, entry.f31119z, entry.A);
                    fVar.f31117x = entry.f31117x;
                    fVar.a(entry.F);
                    gVar.addLast(fVar);
                    w wVar = fVar.f31115v.f31229v;
                    if (wVar != null) {
                        k(fVar, e(wVar.B));
                    }
                    b10.f(fVar);
                    z15 = true;
                    x();
                    for (a aVar2 : linkedHashMap.values()) {
                        aVar2.f31183d = false;
                    }
                    if (z13 && !uVar3.f23466u && !z15) {
                        w();
                        return;
                    }
                    b();
                }
            }
            z13 = z10;
            List O0 = ca.a.O0(f.a.a(this.f31136a, uVar, m10, i(), this.f31149o));
            this.f31156w = new m(uVar3, this, uVar, m10);
            b10.d(O0, a0Var);
            this.f31156w = null;
        }
        z15 = false;
        x();
        while (r1.hasNext()) {
        }
        if (z13) {
        }
        b();
    }

    public final boolean n() {
        Bundle bundle;
        int[] iArr;
        boolean z10;
        Bundle bundle2;
        Intent intent;
        if (g() == 1) {
            Activity activity = this.f31137b;
            if (activity != null && (intent = activity.getIntent()) != null) {
                bundle = intent.getExtras();
            } else {
                bundle = null;
            }
            if (bundle != null) {
                iArr = bundle.getIntArray("android-support-nav:controller:deepLinkIds");
            } else {
                iArr = null;
            }
            int i6 = 0;
            if (iArr != null) {
                if (this.f) {
                    kotlin.jvm.internal.i.d(activity);
                    Intent intent2 = activity.getIntent();
                    Bundle extras = intent2.getExtras();
                    kotlin.jvm.internal.i.d(extras);
                    int[] intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                    kotlin.jvm.internal.i.d(intArray);
                    ArrayList arrayList = new ArrayList(intArray.length);
                    for (int i10 : intArray) {
                        arrayList.add(Integer.valueOf(i10));
                    }
                    ArrayList parcelableArrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
                    int intValue = ((Number) is.q.V1(arrayList)).intValue();
                    if (parcelableArrayList != null) {
                        Bundle bundle3 = (Bundle) is.q.V1(parcelableArrayList);
                    }
                    if (!arrayList.isEmpty()) {
                        u d10 = d(h(), intValue);
                        if (d10 instanceof w) {
                            int i11 = w.I;
                            w wVar = (w) d10;
                            kotlin.jvm.internal.i.g(wVar, "<this>");
                            intValue = ((u) fv.t.F0(fv.k.x0(v.f31239u, wVar.z(wVar.F, true)))).B;
                        }
                        u f2 = f();
                        if (f2 != null && intValue == f2.B) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            r rVar = new r(this);
                            Bundle s10 = ca.a.s(new hs.f("android-support-nav:controller:deepLinkIntent", intent2));
                            Bundle bundle4 = extras.getBundle("android-support-nav:controller:deepLinkExtras");
                            if (bundle4 != null) {
                                s10.putAll(bundle4);
                            }
                            rVar.f31218b.putExtra("android-support-nav:controller:deepLinkExtras", s10);
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                int i12 = i6 + 1;
                                if (i6 >= 0) {
                                    int intValue2 = ((Number) next).intValue();
                                    if (parcelableArrayList != null) {
                                        bundle2 = (Bundle) parcelableArrayList.get(i6);
                                    } else {
                                        bundle2 = null;
                                    }
                                    rVar.f31220d.add(new r.a(intValue2, bundle2));
                                    if (rVar.f31219c != null) {
                                        rVar.c();
                                    }
                                    i6 = i12;
                                } else {
                                    ca.a.t1();
                                    throw null;
                                }
                            }
                            rVar.a().m();
                            activity.finish();
                            return true;
                        }
                    }
                }
                return false;
            }
            u f10 = f();
            kotlin.jvm.internal.i.d(f10);
            int i13 = f10.B;
            for (w wVar2 = f10.f31229v; wVar2 != null; wVar2 = wVar2.f31229v) {
                if (wVar2.F != i13) {
                    Bundle bundle5 = new Bundle();
                    if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
                        bundle5.putParcelable("android-support-nav:controller:deepLinkIntent", activity.getIntent());
                        w wVar3 = this.f31138c;
                        kotlin.jvm.internal.i.d(wVar3);
                        Intent intent3 = activity.getIntent();
                        kotlin.jvm.internal.i.f(intent3, "activity!!.intent");
                        u.b s11 = wVar3.s(new s(intent3));
                        if (s11 != null) {
                            bundle5.putAll(s11.f31234u.m(s11.f31235v));
                        }
                    }
                    r rVar2 = new r(this);
                    int i14 = wVar2.B;
                    ArrayList arrayList2 = rVar2.f31220d;
                    arrayList2.clear();
                    arrayList2.add(new r.a(i14, null));
                    if (rVar2.f31219c != null) {
                        rVar2.c();
                    }
                    rVar2.f31218b.putExtra("android-support-nav:controller:deepLinkExtras", bundle5);
                    rVar2.a().m();
                    if (activity == null) {
                        return true;
                    }
                    activity.finish();
                    return true;
                }
                i13 = wVar2.B;
            }
            return false;
        }
        return o();
    }

    public final boolean o() {
        if (this.f31141g.isEmpty()) {
            return false;
        }
        u f2 = f();
        kotlin.jvm.internal.i.d(f2);
        if (!p(f2.B, true, false) || !b()) {
            return false;
        }
        return true;
    }

    public final boolean p(int i6, boolean z10, boolean z11) {
        u uVar;
        String str;
        String str2;
        String str3;
        String str4;
        is.g<s1.f> gVar = this.f31141g;
        if (gVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = is.u.w2(gVar).iterator();
        while (true) {
            if (it.hasNext()) {
                u uVar2 = ((s1.f) it.next()).f31115v;
                g0 b10 = this.f31154u.b(uVar2.f31228u);
                if (z10 || uVar2.B != i6) {
                    arrayList.add(b10);
                }
                if (uVar2.B == i6) {
                    uVar = uVar2;
                    break;
                }
            } else {
                uVar = null;
                break;
            }
        }
        if (uVar == null) {
            int i10 = u.D;
            String a10 = u.a.a(i6, this.f31136a);
            Log.i("NavController", "Ignoring popBackStack to destination " + a10 + " as it was not found on the current back stack");
            return false;
        }
        kotlin.jvm.internal.u uVar3 = new kotlin.jvm.internal.u();
        is.g gVar2 = new is.g();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                kotlin.jvm.internal.u uVar4 = new kotlin.jvm.internal.u();
                is.g<s1.f> gVar3 = gVar;
                this.f31157x = new f(uVar4, uVar3, this, z11, gVar2);
                ((g0) it2.next()).i(gVar.last(), z11);
                str = null;
                this.f31157x = null;
                if (!uVar4.f23466u) {
                    break;
                }
                gVar = gVar3;
            } else {
                str = null;
                break;
            }
        }
        if (z11) {
            LinkedHashMap linkedHashMap = this.f31145k;
            if (!z10) {
                u.a aVar = new u.a(new fv.u(fv.k.x0(g.f31173u, uVar), new h()));
                while (aVar.hasNext()) {
                    Integer valueOf = Integer.valueOf(((u) aVar.next()).B);
                    if (gVar2.isEmpty()) {
                        str3 = str;
                    } else {
                        str3 = gVar2.f20654v[gVar2.f20653u];
                    }
                    s1.g gVar4 = (s1.g) str3;
                    if (gVar4 != null) {
                        str4 = gVar4.f31124u;
                    } else {
                        str4 = str;
                    }
                    linkedHashMap.put(valueOf, str4);
                }
            }
            if (!gVar2.isEmpty()) {
                s1.g gVar5 = (s1.g) gVar2.first();
                u.a aVar2 = new u.a(new fv.u(fv.k.x0(C0530i.f31175u, c(gVar5.f31125v)), new j()));
                while (true) {
                    boolean hasNext = aVar2.hasNext();
                    str2 = gVar5.f31124u;
                    if (!hasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((u) aVar2.next()).B), str2);
                }
                this.f31146l.put(str2, gVar2);
            }
        }
        x();
        return uVar3.f23466u;
    }

    public final void q(s1.f fVar, boolean z10, is.g<s1.g> gVar) {
        boolean z11;
        p pVar;
        kotlinx.coroutines.flow.q qVar;
        Set set;
        is.g<s1.f> gVar2 = this.f31141g;
        s1.f last = gVar2.last();
        if (kotlin.jvm.internal.i.b(last, fVar)) {
            gVar2.removeLast();
            a aVar = (a) this.f31155v.get(this.f31154u.b(last.f31115v.f31228u));
            boolean z12 = false;
            if (aVar != null && (qVar = aVar.f) != null && (set = (Set) qVar.getValue()) != null && set.contains(last)) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = (z11 || this.f31144j.containsKey(last)) ? true : true;
            j.c cVar = last.B.f2454c;
            j.c cVar2 = j.c.CREATED;
            if (cVar.d(cVar2)) {
                if (z10) {
                    last.a(cVar2);
                    gVar.addFirst(new s1.g(last));
                }
                if (!z12) {
                    last.a(j.c.DESTROYED);
                    v(last);
                } else {
                    last.a(cVar2);
                }
            }
            if (!z10 && !z12 && (pVar = this.f31149o) != null) {
                String backStackEntryId = last.f31119z;
                kotlin.jvm.internal.i.g(backStackEntryId, "backStackEntryId");
                q0 q0Var = (q0) pVar.f31200x.remove(backStackEntryId);
                if (q0Var != null) {
                    q0Var.a();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException(("Attempted to pop " + fVar.f31115v + ", which is not the top of the back stack (" + last.f31115v + ')').toString());
    }

    public final ArrayList s() {
        j.c cVar;
        boolean z10;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f31155v.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            cVar = j.c.STARTED;
            if (!hasNext) {
                break;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : (Iterable) ((a) it.next()).f.getValue()) {
                s1.f fVar = (s1.f) obj;
                if (!arrayList.contains(fVar) && !fVar.F.d(cVar)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    arrayList2.add(obj);
                }
            }
            is.q.R1(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<s1.f> it2 = this.f31141g.iterator();
        while (it2.hasNext()) {
            s1.f next = it2.next();
            s1.f fVar2 = next;
            if (!arrayList.contains(fVar2) && fVar2.F.d(cVar)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                arrayList3.add(next);
            }
        }
        is.q.R1(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!(((s1.f) next2).f31115v instanceof w)) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }

    public final boolean t(int i6, Bundle bundle, a0 a0Var) {
        u h10;
        s1.f fVar;
        u uVar;
        LinkedHashMap linkedHashMap = this.f31145k;
        if (!linkedHashMap.containsKey(Integer.valueOf(i6))) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i6));
        Collection values = linkedHashMap.values();
        n nVar = new n(str);
        kotlin.jvm.internal.i.g(values, "<this>");
        is.q.T1(values, nVar);
        is.g gVar = (is.g) kotlin.jvm.internal.c0.c(this.f31146l).remove(str);
        ArrayList arrayList = new ArrayList();
        s1.f s10 = this.f31141g.s();
        if (s10 == null || (h10 = s10.f31115v) == null) {
            h10 = h();
        }
        if (gVar != null) {
            Iterator<E> it = gVar.iterator();
            while (it.hasNext()) {
                s1.g gVar2 = (s1.g) it.next();
                u d10 = d(h10, gVar2.f31125v);
                Context context = this.f31136a;
                if (d10 != null) {
                    arrayList.add(gVar2.a(context, d10, i(), this.f31149o));
                    h10 = d10;
                } else {
                    int i10 = u.D;
                    String a10 = u.a.a(gVar2.f31125v, context);
                    throw new IllegalStateException(("Restore State failed: destination " + a10 + " cannot be found from the current destination " + h10).toString());
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!(((s1.f) next).f31115v instanceof w)) {
                arrayList3.add(next);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (true) {
            String str2 = null;
            if (!it3.hasNext()) {
                break;
            }
            s1.f fVar2 = (s1.f) it3.next();
            List list = (List) is.u.p2(arrayList2);
            if (list != null && (fVar = (s1.f) is.u.o2(list)) != null && (uVar = fVar.f31115v) != null) {
                str2 = uVar.f31228u;
            }
            if (kotlin.jvm.internal.i.b(str2, fVar2.f31115v.f31228u)) {
                list.add(fVar2);
            } else {
                arrayList2.add(ca.a.Y0(fVar2));
            }
        }
        kotlin.jvm.internal.u uVar2 = new kotlin.jvm.internal.u();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            List list2 = (List) it4.next();
            g0 b10 = this.f31154u.b(((s1.f) is.u.g2(list2)).f31115v.f31228u);
            this.f31156w = new o(uVar2, arrayList, new kotlin.jvm.internal.v(), this, bundle);
            b10.d(list2, a0Var);
            this.f31156w = null;
        }
        return uVar2.f23466u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x0370, code lost:
        if (r1 == false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b9, code lost:
        if (r6 != false) goto L209;
     */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(w wVar, Bundle bundle) {
        boolean z10;
        Activity activity;
        boolean z11;
        int[] iArr;
        ArrayList arrayList;
        Bundle bundle2;
        boolean z12;
        String str;
        u z13;
        w wVar2;
        Bundle bundle3;
        u z14;
        w wVar3;
        boolean z15;
        ArrayList<String> stringArrayList;
        boolean b10 = kotlin.jvm.internal.i.b(this.f31138c, wVar);
        is.g<s1.f> gVar = this.f31141g;
        boolean z16 = true;
        if (!b10) {
            w wVar4 = this.f31138c;
            LinkedHashMap linkedHashMap = this.f31155v;
            ArrayList arrayList2 = null;
            if (wVar4 != null) {
                Iterator it = new ArrayList(this.f31145k.keySet()).iterator();
                while (it.hasNext()) {
                    Integer id2 = (Integer) it.next();
                    kotlin.jvm.internal.i.f(id2, "id");
                    int intValue = id2.intValue();
                    for (a aVar : linkedHashMap.values()) {
                        aVar.f31183d = true;
                    }
                    boolean t3 = t(intValue, null, null);
                    for (a aVar2 : linkedHashMap.values()) {
                        aVar2.f31183d = false;
                    }
                    if (t3) {
                        p(intValue, true, false);
                    }
                }
                p(wVar4.B, true, false);
            }
            this.f31138c = wVar;
            Bundle bundle4 = this.f31139d;
            i0 i0Var = this.f31154u;
            if (bundle4 != null && (stringArrayList = bundle4.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
                Iterator<String> it2 = stringArrayList.iterator();
                while (it2.hasNext()) {
                    String name = it2.next();
                    kotlin.jvm.internal.i.f(name, "name");
                    g0 b11 = i0Var.b(name);
                    Bundle bundle5 = bundle4.getBundle(name);
                    if (bundle5 != null) {
                        b11.g(bundle5);
                    }
                }
            }
            Parcelable[] parcelableArr = this.f31140e;
            Context context = this.f31136a;
            if (parcelableArr != null) {
                for (Parcelable parcelable : parcelableArr) {
                    s1.g gVar2 = (s1.g) parcelable;
                    u c10 = c(gVar2.f31125v);
                    if (c10 != null) {
                        s1.f a10 = gVar2.a(context, c10, i(), this.f31149o);
                        g0 b12 = i0Var.b(c10.f31228u);
                        Object obj = linkedHashMap.get(b12);
                        if (obj == null) {
                            obj = new a(this, b12);
                            linkedHashMap.put(b12, obj);
                        }
                        gVar.addLast(a10);
                        ((a) obj).f(a10);
                        w wVar5 = a10.f31115v.f31229v;
                        if (wVar5 != null) {
                            k(a10, e(wVar5.B));
                        }
                    } else {
                        int i6 = u.D;
                        StringBuilder g5 = defpackage.d.g("Restoring the Navigation back stack failed: destination ", u.a.a(gVar2.f31125v, context), " cannot be found from the current destination ");
                        g5.append(f());
                        throw new IllegalStateException(g5.toString());
                    }
                }
                x();
                this.f31140e = null;
            }
            Collection values = is.e0.x0(i0Var.f31178a).values();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : values) {
                if (!((g0) obj2).f31129b) {
                    arrayList3.add(obj2);
                }
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                g0 g0Var = (g0) it3.next();
                Object obj3 = linkedHashMap.get(g0Var);
                if (obj3 == null) {
                    obj3 = new a(this, g0Var);
                    linkedHashMap.put(g0Var, obj3);
                }
                g0Var.e((a) obj3);
            }
            if (this.f31138c != null && gVar.isEmpty()) {
                if (!this.f && (activity = this.f31137b) != null) {
                    Intent intent = activity.getIntent();
                    if (intent != null) {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            iArr = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                        } else {
                            iArr = null;
                        }
                        if (extras != null) {
                            arrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
                        } else {
                            arrayList = null;
                        }
                        Bundle bundle6 = new Bundle();
                        if (extras != null) {
                            bundle2 = extras.getBundle("android-support-nav:controller:deepLinkExtras");
                        } else {
                            bundle2 = null;
                        }
                        if (bundle2 != null) {
                            bundle6.putAll(bundle2);
                        }
                        if (iArr != null) {
                            if (iArr.length == 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                        }
                        w wVar6 = this.f31138c;
                        kotlin.jvm.internal.i.d(wVar6);
                        u.b s10 = wVar6.s(new s(intent));
                        if (s10 != null) {
                            u uVar = s10.f31234u;
                            int[] o10 = uVar.o(null);
                            Bundle m10 = uVar.m(s10.f31235v);
                            if (m10 != null) {
                                bundle6.putAll(m10);
                            }
                            iArr = o10;
                            if (iArr != null) {
                                if (iArr.length == 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (!z12) {
                                    w wVar7 = this.f31138c;
                                    int length = iArr.length;
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 < length) {
                                            int i11 = iArr[i10];
                                            if (i10 == 0) {
                                                w wVar8 = this.f31138c;
                                                kotlin.jvm.internal.i.d(wVar8);
                                                if (wVar8.B == i11) {
                                                    z14 = this.f31138c;
                                                } else {
                                                    z14 = null;
                                                }
                                            } else {
                                                kotlin.jvm.internal.i.d(wVar7);
                                                z14 = wVar7.z(i11, true);
                                            }
                                            if (z14 == null) {
                                                int i12 = u.D;
                                                str = u.a.a(i11, context);
                                                break;
                                            }
                                            if (i10 != iArr.length - 1 && (z14 instanceof w)) {
                                                while (true) {
                                                    wVar3 = (w) z14;
                                                    kotlin.jvm.internal.i.d(wVar3);
                                                    if (!(wVar3.z(wVar3.F, true) instanceof w)) {
                                                        break;
                                                    }
                                                    z14 = wVar3.z(wVar3.F, true);
                                                }
                                                wVar7 = wVar3;
                                            }
                                            i10++;
                                        } else {
                                            str = null;
                                            break;
                                        }
                                    }
                                    if (str != null) {
                                        Log.i("NavController", "Could not find destination " + str + " in the navigation graph, ignoring the deep link from " + intent);
                                    } else {
                                        bundle6.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                        int length2 = iArr.length;
                                        Bundle[] bundleArr = new Bundle[length2];
                                        for (int i13 = 0; i13 < length2; i13++) {
                                            Bundle bundle7 = new Bundle();
                                            bundle7.putAll(bundle6);
                                            if (arrayList2 != null && (bundle3 = (Bundle) arrayList2.get(i13)) != null) {
                                                bundle7.putAll(bundle3);
                                            }
                                            bundleArr[i13] = bundle7;
                                        }
                                        int flags = intent.getFlags();
                                        int i14 = 268435456 & flags;
                                        if (i14 != 0 && (flags & 32768) == 0) {
                                            intent.addFlags(32768);
                                            f0.f0 f0Var = new f0.f0(context);
                                            f0Var.e(intent);
                                            f0Var.m();
                                            activity.finish();
                                            activity.overridePendingTransition(0, 0);
                                        } else if (i14 != 0) {
                                            if (!gVar.isEmpty()) {
                                                w wVar9 = this.f31138c;
                                                kotlin.jvm.internal.i.d(wVar9);
                                                p(wVar9.B, true, false);
                                            }
                                            int i15 = 0;
                                            while (i15 < iArr.length) {
                                                int i16 = iArr[i15];
                                                int i17 = i15 + 1;
                                                Bundle bundle8 = bundleArr[i15];
                                                u c11 = c(i16);
                                                if (c11 != null) {
                                                    m(c11, bundle8, kc.f.P(new l(c11, this)));
                                                    i15 = i17;
                                                } else {
                                                    int i18 = u.D;
                                                    StringBuilder g10 = defpackage.d.g("Deep Linking failed: destination ", u.a.a(i16, context), " cannot be found from the current destination ");
                                                    g10.append(f());
                                                    throw new IllegalStateException(g10.toString());
                                                }
                                            }
                                        } else {
                                            w wVar10 = this.f31138c;
                                            int length3 = iArr.length;
                                            for (int i19 = 0; i19 < length3; i19++) {
                                                int i20 = iArr[i19];
                                                Bundle bundle9 = bundleArr[i19];
                                                if (i19 == 0) {
                                                    z13 = this.f31138c;
                                                } else {
                                                    kotlin.jvm.internal.i.d(wVar10);
                                                    z13 = wVar10.z(i20, true);
                                                }
                                                if (z13 != null) {
                                                    if (i19 != iArr.length - 1) {
                                                        if (z13 instanceof w) {
                                                            while (true) {
                                                                wVar2 = (w) z13;
                                                                kotlin.jvm.internal.i.d(wVar2);
                                                                if (!(wVar2.z(wVar2.F, true) instanceof w)) {
                                                                    break;
                                                                }
                                                                z13 = wVar2.z(wVar2.F, true);
                                                            }
                                                            wVar10 = wVar2;
                                                        }
                                                    } else {
                                                        w wVar11 = this.f31138c;
                                                        kotlin.jvm.internal.i.d(wVar11);
                                                        m(z13, bundle9, new a0(false, false, wVar11.B, true, false, 0, 0, -1, -1));
                                                    }
                                                } else {
                                                    int i21 = u.D;
                                                    throw new IllegalStateException("Deep Linking failed: destination " + u.a.a(i20, context) + " cannot be found in graph " + wVar10);
                                                }
                                            }
                                            this.f = true;
                                        }
                                        z11 = true;
                                    }
                                }
                            }
                        }
                        arrayList2 = arrayList;
                        if (iArr != null) {
                        }
                    }
                    z11 = false;
                }
                z16 = false;
                if (!z16) {
                    u uVar2 = this.f31138c;
                    kotlin.jvm.internal.i.d(uVar2);
                    m(uVar2, bundle, null);
                    return;
                }
                return;
            }
            b();
            return;
        }
        t.i<u> iVar = wVar.E;
        int f2 = iVar.f();
        for (int i22 = 0; i22 < f2; i22++) {
            u newDestination = iVar.h(i22);
            w wVar12 = this.f31138c;
            kotlin.jvm.internal.i.d(wVar12);
            t.i<u> iVar2 = wVar12.E;
            if (iVar2.f32262u) {
                iVar2.c();
            }
            int j10 = tr.r.j(iVar2.f32265x, i22, iVar2.f32263v);
            if (j10 >= 0) {
                Object[] objArr = iVar2.f32264w;
                Object obj4 = objArr[j10];
                objArr[j10] = newDestination;
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator<s1.f> it4 = gVar.iterator();
            while (it4.hasNext()) {
                s1.f next = it4.next();
                s1.f fVar = next;
                if (newDestination != null && fVar.f31115v.B == newDestination.B) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    arrayList4.add(next);
                }
            }
            Iterator it5 = arrayList4.iterator();
            while (it5.hasNext()) {
                s1.f fVar2 = (s1.f) it5.next();
                kotlin.jvm.internal.i.f(newDestination, "newDestination");
                fVar2.getClass();
                fVar2.f31115v = newDestination;
            }
        }
    }

    public final void v(s1.f child) {
        Integer num;
        boolean z10;
        p pVar;
        kotlin.jvm.internal.i.g(child, "child");
        s1.f fVar = (s1.f) this.f31143i.remove(child);
        if (fVar == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f31144j;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(fVar);
        if (atomicInteger != null) {
            num = Integer.valueOf(atomicInteger.decrementAndGet());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            a aVar = (a) this.f31155v.get(this.f31154u.b(fVar.f31115v.f31228u));
            if (aVar != null) {
                i iVar = aVar.f31161h;
                boolean b10 = kotlin.jvm.internal.i.b(iVar.f31158y.get(fVar), Boolean.TRUE);
                kotlinx.coroutines.flow.x xVar = aVar.f31182c;
                xVar.setValue(is.h0.G1((Set) xVar.getValue(), fVar));
                iVar.f31158y.remove(fVar);
                is.g<s1.f> gVar = iVar.f31141g;
                boolean contains = gVar.contains(fVar);
                kotlinx.coroutines.flow.x xVar2 = iVar.f31142h;
                if (!contains) {
                    iVar.v(fVar);
                    if (fVar.B.f2454c.d(j.c.CREATED)) {
                        fVar.a(j.c.DESTROYED);
                    }
                    boolean isEmpty = gVar.isEmpty();
                    String backStackEntryId = fVar.f31119z;
                    if (!isEmpty) {
                        Iterator<s1.f> it = gVar.iterator();
                        while (it.hasNext()) {
                            if (kotlin.jvm.internal.i.b(it.next().f31119z, backStackEntryId)) {
                                z10 = false;
                                break;
                            }
                        }
                    }
                    z10 = true;
                    if (z10 && !b10 && (pVar = iVar.f31149o) != null) {
                        kotlin.jvm.internal.i.g(backStackEntryId, "backStackEntryId");
                        q0 q0Var = (q0) pVar.f31200x.remove(backStackEntryId);
                        if (q0Var != null) {
                            q0Var.a();
                        }
                    }
                    iVar.w();
                    xVar2.setValue(iVar.s());
                } else if (!aVar.f31183d) {
                    iVar.w();
                    xVar2.setValue(iVar.s());
                }
            }
            linkedHashMap.remove(fVar);
        }
    }

    public final void w() {
        u uVar;
        Boolean bool;
        boolean z10;
        kotlinx.coroutines.flow.q qVar;
        Set set;
        ArrayList J2 = is.u.J2(this.f31141g);
        if (J2.isEmpty()) {
            return;
        }
        u uVar2 = ((s1.f) is.u.o2(J2)).f31115v;
        if (uVar2 instanceof s1.c) {
            for (s1.f fVar : is.u.w2(J2)) {
                uVar = fVar.f31115v;
                if (!(uVar instanceof w) && !(uVar instanceof s1.c)) {
                    break;
                }
            }
        }
        uVar = null;
        HashMap hashMap = new HashMap();
        for (s1.f fVar2 : is.u.w2(J2)) {
            j.c cVar = fVar2.F;
            u uVar3 = fVar2.f31115v;
            j.c cVar2 = j.c.RESUMED;
            j.c cVar3 = j.c.STARTED;
            if (uVar2 != null && uVar3.B == uVar2.B) {
                if (cVar != cVar2) {
                    a aVar = (a) this.f31155v.get(this.f31154u.b(uVar3.f31228u));
                    if (aVar != null && (qVar = aVar.f) != null && (set = (Set) qVar.getValue()) != null) {
                        bool = Boolean.valueOf(set.contains(fVar2));
                    } else {
                        bool = null;
                    }
                    if (!kotlin.jvm.internal.i.b(bool, Boolean.TRUE)) {
                        AtomicInteger atomicInteger = (AtomicInteger) this.f31144j.get(fVar2);
                        if (atomicInteger != null && atomicInteger.get() == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            hashMap.put(fVar2, cVar2);
                        }
                    }
                    hashMap.put(fVar2, cVar3);
                }
                uVar2 = uVar2.f31229v;
            } else if (uVar != null && uVar3.B == uVar.B) {
                if (cVar == cVar2) {
                    fVar2.a(cVar3);
                } else if (cVar != cVar3) {
                    hashMap.put(fVar2, cVar3);
                }
                uVar = uVar.f31229v;
            } else {
                fVar2.a(j.c.CREATED);
            }
        }
        Iterator it = J2.iterator();
        while (it.hasNext()) {
            s1.f fVar3 = (s1.f) it.next();
            j.c cVar4 = (j.c) hashMap.get(fVar3);
            if (cVar4 != null) {
                fVar3.a(cVar4);
            } else {
                fVar3.b();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0009, code lost:
        if (g() > 1) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x() {
        boolean z10;
        if (this.f31153t) {
            z10 = true;
        }
        z10 = false;
        e eVar = this.f31152s;
        eVar.f967a = z10;
        s0.a<Boolean> aVar = eVar.f969c;
        if (aVar != null) {
            aVar.accept(Boolean.valueOf(z10));
        }
    }
}
