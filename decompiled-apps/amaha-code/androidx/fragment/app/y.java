package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h0;
import androidx.lifecycle.j;
import com.theinnerhour.b2b.R;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: FragmentManager.java */
/* loaded from: classes.dex */
public abstract class y {
    public androidx.activity.result.e B;
    public androidx.activity.result.e C;
    public androidx.activity.result.e D;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public ArrayList<androidx.fragment.app.a> K;
    public ArrayList<Boolean> L;
    public ArrayList<Fragment> M;
    public b0 N;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2306b;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<androidx.fragment.app.a> f2308d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<Fragment> f2309e;

    /* renamed from: g  reason: collision with root package name */
    public OnBackPressedDispatcher f2310g;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<m> f2316m;

    /* renamed from: v  reason: collision with root package name */
    public u<?> f2324v;

    /* renamed from: w  reason: collision with root package name */
    public r f2325w;

    /* renamed from: x  reason: collision with root package name */
    public Fragment f2326x;

    /* renamed from: y  reason: collision with root package name */
    public Fragment f2327y;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<n> f2305a = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final g0 f2307c = new g0();
    public final v f = new v(this);

    /* renamed from: h  reason: collision with root package name */
    public final b f2311h = new b();

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f2312i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, androidx.fragment.app.c> f2313j = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, Bundle> f2314k = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: l  reason: collision with root package name */
    public final Map<String, Object> f2315l = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: n  reason: collision with root package name */
    public final w f2317n = new w(this);

    /* renamed from: o  reason: collision with root package name */
    public final CopyOnWriteArrayList<c0> f2318o = new CopyOnWriteArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    public final x f2319p = new s0.a(this) { // from class: androidx.fragment.app.x

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ y f2304b;

        {
            this.f2304b = this;
        }

        @Override // s0.a
        public final void accept(Object obj) {
            int i6 = r2;
            y yVar = this.f2304b;
            switch (i6) {
                case 0:
                    Configuration configuration = (Configuration) obj;
                    if (yVar.R()) {
                        yVar.i(false, configuration);
                        return;
                    }
                    return;
                case 1:
                    Integer num = (Integer) obj;
                    if (yVar.R() && num.intValue() == 80) {
                        yVar.m(false);
                        return;
                    }
                    return;
                case 2:
                    f0.m mVar = (f0.m) obj;
                    if (yVar.R()) {
                        yVar.n(mVar.f14643a, false);
                        return;
                    }
                    return;
                default:
                    f0.c0 c0Var = (f0.c0) obj;
                    if (yVar.R()) {
                        yVar.s(c0Var.f14615a, false);
                        return;
                    }
                    return;
            }
        }
    };

    /* renamed from: q  reason: collision with root package name */
    public final x f2320q = new s0.a(this) { // from class: androidx.fragment.app.x

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ y f2304b;

        {
            this.f2304b = this;
        }

        @Override // s0.a
        public final void accept(Object obj) {
            int i6 = r2;
            y yVar = this.f2304b;
            switch (i6) {
                case 0:
                    Configuration configuration = (Configuration) obj;
                    if (yVar.R()) {
                        yVar.i(false, configuration);
                        return;
                    }
                    return;
                case 1:
                    Integer num = (Integer) obj;
                    if (yVar.R() && num.intValue() == 80) {
                        yVar.m(false);
                        return;
                    }
                    return;
                case 2:
                    f0.m mVar = (f0.m) obj;
                    if (yVar.R()) {
                        yVar.n(mVar.f14643a, false);
                        return;
                    }
                    return;
                default:
                    f0.c0 c0Var = (f0.c0) obj;
                    if (yVar.R()) {
                        yVar.s(c0Var.f14615a, false);
                        return;
                    }
                    return;
            }
        }
    };
    public final x r = new s0.a(this) { // from class: androidx.fragment.app.x

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ y f2304b;

        {
            this.f2304b = this;
        }

        @Override // s0.a
        public final void accept(Object obj) {
            int i6 = r2;
            y yVar = this.f2304b;
            switch (i6) {
                case 0:
                    Configuration configuration = (Configuration) obj;
                    if (yVar.R()) {
                        yVar.i(false, configuration);
                        return;
                    }
                    return;
                case 1:
                    Integer num = (Integer) obj;
                    if (yVar.R() && num.intValue() == 80) {
                        yVar.m(false);
                        return;
                    }
                    return;
                case 2:
                    f0.m mVar = (f0.m) obj;
                    if (yVar.R()) {
                        yVar.n(mVar.f14643a, false);
                        return;
                    }
                    return;
                default:
                    f0.c0 c0Var = (f0.c0) obj;
                    if (yVar.R()) {
                        yVar.s(c0Var.f14615a, false);
                        return;
                    }
                    return;
            }
        }
    };

    /* renamed from: s  reason: collision with root package name */
    public final x f2321s = new s0.a(this) { // from class: androidx.fragment.app.x

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ y f2304b;

        {
            this.f2304b = this;
        }

        @Override // s0.a
        public final void accept(Object obj) {
            int i6 = r2;
            y yVar = this.f2304b;
            switch (i6) {
                case 0:
                    Configuration configuration = (Configuration) obj;
                    if (yVar.R()) {
                        yVar.i(false, configuration);
                        return;
                    }
                    return;
                case 1:
                    Integer num = (Integer) obj;
                    if (yVar.R() && num.intValue() == 80) {
                        yVar.m(false);
                        return;
                    }
                    return;
                case 2:
                    f0.m mVar = (f0.m) obj;
                    if (yVar.R()) {
                        yVar.n(mVar.f14643a, false);
                        return;
                    }
                    return;
                default:
                    f0.c0 c0Var = (f0.c0) obj;
                    if (yVar.R()) {
                        yVar.s(c0Var.f14615a, false);
                        return;
                    }
                    return;
            }
        }
    };

    /* renamed from: t  reason: collision with root package name */
    public final c f2322t = new c();

    /* renamed from: u  reason: collision with root package name */
    public int f2323u = -1;

    /* renamed from: z  reason: collision with root package name */
    public final d f2328z = new d();
    public final e A = new e();
    public ArrayDeque<l> E = new ArrayDeque<>();
    public final f O = new f();

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public class a implements androidx.activity.result.b<Map<String, Boolean>> {
        public a() {
        }

        @Override // androidx.activity.result.b
        public final void b(Map<String, Boolean> map) {
            int i6;
            Map<String, Boolean> map2 = map;
            String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((Boolean) arrayList.get(i10)).booleanValue()) {
                    i6 = 0;
                } else {
                    i6 = -1;
                }
                iArr[i10] = i6;
            }
            y yVar = y.this;
            l pollFirst = yVar.E.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            g0 g0Var = yVar.f2307c;
            String str = pollFirst.f2337u;
            Fragment c10 = g0Var.c(str);
            if (c10 == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            c10.onRequestPermissionsResult(pollFirst.f2338v, strArr, iArr);
        }
    }

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public class b extends androidx.activity.h {
        public b() {
            super(false);
        }

        @Override // androidx.activity.h
        public final void a() {
            y yVar = y.this;
            yVar.y(true);
            if (yVar.f2311h.f967a) {
                yVar.Y();
            } else {
                yVar.f2310g.b();
            }
        }
    }

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public class c implements t0.n {
        public c() {
        }

        @Override // t0.n
        public final boolean a(MenuItem menuItem) {
            return y.this.p(menuItem);
        }

        @Override // t0.n
        public final void b(Menu menu) {
            y.this.q(menu);
        }

        @Override // t0.n
        public final void c(Menu menu, MenuInflater menuInflater) {
            y.this.k(menu, menuInflater);
        }

        @Override // t0.n
        public final void d(Menu menu) {
            y.this.t(menu);
        }
    }

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public class d extends t {
        public d() {
        }

        @Override // androidx.fragment.app.t
        public final Fragment a(String str) {
            return Fragment.instantiate(y.this.f2324v.f2292v, str, null);
        }
    }

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public class e implements v0 {
    }

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            y.this.y(true);
        }
    }

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public class g implements c0 {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f2334u;

        public g(Fragment fragment) {
            this.f2334u = fragment;
        }

        @Override // androidx.fragment.app.c0
        public final void a(y yVar, Fragment fragment) {
            this.f2334u.onAttachFragment(fragment);
        }
    }

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public class h implements androidx.activity.result.b<androidx.activity.result.a> {
        public h() {
        }

        @Override // androidx.activity.result.b
        public final void b(androidx.activity.result.a aVar) {
            androidx.activity.result.a aVar2 = aVar;
            y yVar = y.this;
            l pollFirst = yVar.E.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            g0 g0Var = yVar.f2307c;
            String str = pollFirst.f2337u;
            Fragment c10 = g0Var.c(str);
            if (c10 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            c10.onActivityResult(pollFirst.f2338v, aVar2.f976u, aVar2.f977v);
        }
    }

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public class i implements androidx.activity.result.b<androidx.activity.result.a> {
        public i() {
        }

        @Override // androidx.activity.result.b
        public final void b(androidx.activity.result.a aVar) {
            androidx.activity.result.a aVar2 = aVar;
            y yVar = y.this;
            l pollFirst = yVar.E.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            g0 g0Var = yVar.f2307c;
            String str = pollFirst.f2337u;
            Fragment c10 = g0Var.c(str);
            if (c10 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            c10.onActivityResult(pollFirst.f2338v, aVar2.f976u, aVar2.f977v);
        }
    }

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public static class j extends e.a<androidx.activity.result.h, androidx.activity.result.a> {
        @Override // e.a
        public final Intent a(ComponentActivity componentActivity, Object obj) {
            Bundle bundleExtra;
            androidx.activity.result.h hVar = (androidx.activity.result.h) obj;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = hVar.f996v;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    hVar = new androidx.activity.result.h(hVar.f995u, null, hVar.f997w, hVar.f998x);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", hVar);
            if (y.P(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // e.a
        public final Object c(Intent intent, int i6) {
            return new androidx.activity.result.a(intent, i6);
        }
    }

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public interface m {
        void onBackStackChanged();
    }

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public interface n {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public class o implements n {

        /* renamed from: a  reason: collision with root package name */
        public final String f2339a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2340b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2341c;

        public o(String str, int i6, int i10) {
            this.f2339a = str;
            this.f2340b = i6;
            this.f2341c = i10;
        }

        @Override // androidx.fragment.app.y.n
        public final boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = y.this.f2327y;
            if (fragment != null && this.f2340b < 0 && this.f2339a == null && fragment.getChildFragmentManager().Y()) {
                return false;
            }
            return y.this.a0(arrayList, arrayList2, this.f2339a, this.f2340b, this.f2341c);
        }
    }

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public class p implements n {

        /* renamed from: a  reason: collision with root package name */
        public final String f2343a;

        public p(String str) {
            this.f2343a = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00fa, code lost:
            r3.add(r6);
         */
        @Override // androidx.fragment.app.y.n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            y yVar = y.this;
            androidx.fragment.app.c remove = yVar.f2313j.remove(this.f2343a);
            boolean z10 = false;
            if (remove != null) {
                HashMap hashMap = new HashMap();
                Iterator<androidx.fragment.app.a> it = arrayList.iterator();
                while (it.hasNext()) {
                    androidx.fragment.app.a next = it.next();
                    if (next.f2132t) {
                        Iterator<h0.a> it2 = next.f2191a.iterator();
                        while (it2.hasNext()) {
                            Fragment fragment = it2.next().f2207b;
                            if (fragment != null) {
                                hashMap.put(fragment.mWho, fragment);
                            }
                        }
                    }
                }
                List<String> list = remove.f2148u;
                HashMap hashMap2 = new HashMap(list.size());
                for (String str : list) {
                    Fragment fragment2 = (Fragment) hashMap.get(str);
                    if (fragment2 != null) {
                        hashMap2.put(fragment2.mWho, fragment2);
                    } else {
                        d0 i6 = yVar.f2307c.i(str, null);
                        if (i6 != null) {
                            Fragment a10 = i6.a(yVar.K(), yVar.f2324v.f2292v.getClassLoader());
                            hashMap2.put(a10.mWho, a10);
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (androidx.fragment.app.b bVar : remove.f2149v) {
                    bVar.getClass();
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
                    bVar.a(aVar);
                    int i10 = 0;
                    while (true) {
                        ArrayList<String> arrayList4 = bVar.f2140v;
                        if (i10 < arrayList4.size()) {
                            String str2 = arrayList4.get(i10);
                            if (str2 != null) {
                                Fragment fragment3 = (Fragment) hashMap2.get(str2);
                                if (fragment3 != null) {
                                    aVar.f2191a.get(i10).f2207b = fragment3;
                                } else {
                                    throw new IllegalStateException("Restoring FragmentTransaction " + bVar.f2144z + " failed due to missing saved state for Fragment (" + str2 + ")");
                                }
                            }
                            i10++;
                        }
                    }
                }
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    ((androidx.fragment.app.a) it3.next()).a(arrayList, arrayList2);
                    z10 = true;
                }
            }
            return z10;
        }
    }

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public class q implements n {

        /* renamed from: a  reason: collision with root package name */
        public final String f2345a;

        public q(String str) {
            this.f2345a = str;
        }

        @Override // androidx.fragment.app.y.n
        public final boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            String str;
            String str2;
            int i6;
            y yVar = y.this;
            String str3 = this.f2345a;
            int D = yVar.D(str3, -1, true);
            if (D < 0) {
                return false;
            }
            for (int i10 = D; i10 < yVar.f2308d.size(); i10++) {
                androidx.fragment.app.a aVar = yVar.f2308d.get(i10);
                if (!aVar.f2205p) {
                    yVar.o0(new IllegalArgumentException("saveBackStack(\"" + str3 + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + aVar + " that did not use setReorderingAllowed(true)."));
                    throw null;
                }
            }
            HashSet hashSet = new HashSet();
            int i11 = D;
            while (true) {
                int i12 = 2;
                if (i11 < yVar.f2308d.size()) {
                    androidx.fragment.app.a aVar2 = yVar.f2308d.get(i11);
                    HashSet hashSet2 = new HashSet();
                    HashSet hashSet3 = new HashSet();
                    Iterator<h0.a> it = aVar2.f2191a.iterator();
                    while (it.hasNext()) {
                        h0.a next = it.next();
                        Fragment fragment = next.f2207b;
                        if (fragment != null) {
                            if (!next.f2208c || (i6 = next.f2206a) == 1 || i6 == i12 || i6 == 8) {
                                hashSet.add(fragment);
                                hashSet2.add(fragment);
                            }
                            int i13 = next.f2206a;
                            if (i13 == 1 || i13 == 2) {
                                hashSet3.add(fragment);
                            }
                            i12 = 2;
                        }
                    }
                    hashSet2.removeAll(hashSet3);
                    if (!hashSet2.isEmpty()) {
                        StringBuilder g5 = defpackage.d.g("saveBackStack(\"", str3, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                        if (hashSet2.size() == 1) {
                            str2 = " " + hashSet2.iterator().next();
                        } else {
                            str2 = "s " + hashSet2;
                        }
                        g5.append(str2);
                        g5.append(" in ");
                        g5.append(aVar2);
                        g5.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                        yVar.o0(new IllegalArgumentException(g5.toString()));
                        throw null;
                    }
                    i11++;
                } else {
                    ArrayDeque arrayDeque = new ArrayDeque(hashSet);
                    while (!arrayDeque.isEmpty()) {
                        Fragment fragment2 = (Fragment) arrayDeque.removeFirst();
                        if (fragment2.mRetainInstance) {
                            StringBuilder g10 = defpackage.d.g("saveBackStack(\"", str3, "\") must not contain retained fragments. Found ");
                            if (hashSet.contains(fragment2)) {
                                str = "direct reference to retained ";
                            } else {
                                str = "retained child ";
                            }
                            g10.append(str);
                            g10.append("fragment ");
                            g10.append(fragment2);
                            yVar.o0(new IllegalArgumentException(g10.toString()));
                            throw null;
                        }
                        Iterator it2 = fragment2.mChildFragmentManager.f2307c.e().iterator();
                        while (it2.hasNext()) {
                            Fragment fragment3 = (Fragment) it2.next();
                            if (fragment3 != null) {
                                arrayDeque.addLast(fragment3);
                            }
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = hashSet.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((Fragment) it3.next()).mWho);
                    }
                    ArrayList arrayList4 = new ArrayList(yVar.f2308d.size() - D);
                    for (int i14 = D; i14 < yVar.f2308d.size(); i14++) {
                        arrayList4.add(null);
                    }
                    androidx.fragment.app.c cVar = new androidx.fragment.app.c(arrayList3, arrayList4);
                    for (int size = yVar.f2308d.size() - 1; size >= D; size--) {
                        androidx.fragment.app.a remove = yVar.f2308d.remove(size);
                        androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(remove);
                        ArrayList<h0.a> arrayList5 = aVar3.f2191a;
                        int size2 = arrayList5.size();
                        while (true) {
                            size2--;
                            if (size2 >= 0) {
                                h0.a aVar4 = arrayList5.get(size2);
                                if (aVar4.f2208c) {
                                    if (aVar4.f2206a == 8) {
                                        aVar4.f2208c = false;
                                        size2--;
                                        arrayList5.remove(size2);
                                    } else {
                                        int i15 = aVar4.f2207b.mContainerId;
                                        aVar4.f2206a = 2;
                                        aVar4.f2208c = false;
                                        for (int i16 = size2 - 1; i16 >= 0; i16--) {
                                            h0.a aVar5 = arrayList5.get(i16);
                                            if (aVar5.f2208c && aVar5.f2207b.mContainerId == i15) {
                                                arrayList5.remove(i16);
                                                size2--;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        arrayList4.set(size - D, new androidx.fragment.app.b(aVar3));
                        remove.f2132t = true;
                        arrayList.add(remove);
                        arrayList2.add(Boolean.TRUE);
                    }
                    yVar.f2313j.put(str3, cVar);
                    return true;
                }
            }
        }
    }

    public static boolean P(int i6) {
        if (Log.isLoggable("FragmentManager", i6)) {
            return true;
        }
        return false;
    }

    public static boolean Q(Fragment fragment) {
        boolean z10;
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        Iterator it = fragment.mChildFragmentManager.f2307c.e().iterator();
        boolean z11 = false;
        while (true) {
            if (it.hasNext()) {
                Fragment fragment2 = (Fragment) it.next();
                if (fragment2 != null) {
                    z11 = Q(fragment2);
                    continue;
                }
                if (z11) {
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            return true;
        }
        return false;
    }

    public static boolean S(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        y yVar = fragment.mFragmentManager;
        if (fragment.equals(yVar.f2327y) && S(yVar.f2326x)) {
            return true;
        }
        return false;
    }

    public static void m0(Fragment fragment) {
        if (P(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public final void A(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i6, int i10) {
        ViewGroup viewGroup;
        androidx.fragment.app.a aVar;
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        int i11;
        ArrayList<androidx.fragment.app.a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        boolean z10 = arrayList3.get(i6).f2205p;
        ArrayList<Fragment> arrayList5 = this.M;
        if (arrayList5 == null) {
            this.M = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        ArrayList<Fragment> arrayList6 = this.M;
        g0 g0Var4 = this.f2307c;
        arrayList6.addAll(g0Var4.f());
        Fragment fragment = this.f2327y;
        int i12 = i6;
        boolean z11 = false;
        while (true) {
            int i13 = 1;
            if (i12 < i10) {
                androidx.fragment.app.a aVar2 = arrayList3.get(i12);
                if (!arrayList4.get(i12).booleanValue()) {
                    ArrayList<Fragment> arrayList7 = this.M;
                    int i14 = 0;
                    while (true) {
                        ArrayList<h0.a> arrayList8 = aVar2.f2191a;
                        if (i14 < arrayList8.size()) {
                            h0.a aVar3 = arrayList8.get(i14);
                            int i15 = aVar3.f2206a;
                            if (i15 != i13) {
                                if (i15 != 2) {
                                    if (i15 != 3 && i15 != 6) {
                                        if (i15 != 7) {
                                            if (i15 == 8) {
                                                arrayList8.add(i14, new h0.a(9, fragment));
                                                aVar3.f2208c = true;
                                                i14++;
                                                fragment = aVar3.f2207b;
                                            }
                                        }
                                    } else {
                                        arrayList7.remove(aVar3.f2207b);
                                        Fragment fragment2 = aVar3.f2207b;
                                        if (fragment2 == fragment) {
                                            arrayList8.add(i14, new h0.a(fragment2, 9));
                                            i14++;
                                            g0Var3 = g0Var4;
                                            i11 = 1;
                                            fragment = null;
                                        }
                                    }
                                    g0Var3 = g0Var4;
                                    i11 = 1;
                                } else {
                                    Fragment fragment3 = aVar3.f2207b;
                                    int i16 = fragment3.mContainerId;
                                    int size = arrayList7.size() - 1;
                                    boolean z12 = false;
                                    while (size >= 0) {
                                        g0 g0Var5 = g0Var4;
                                        Fragment fragment4 = arrayList7.get(size);
                                        if (fragment4.mContainerId == i16) {
                                            if (fragment4 == fragment3) {
                                                z12 = true;
                                            } else {
                                                if (fragment4 == fragment) {
                                                    arrayList8.add(i14, new h0.a(9, fragment4));
                                                    i14++;
                                                    fragment = null;
                                                }
                                                h0.a aVar4 = new h0.a(3, fragment4);
                                                aVar4.f2209d = aVar3.f2209d;
                                                aVar4.f = aVar3.f;
                                                aVar4.f2210e = aVar3.f2210e;
                                                aVar4.f2211g = aVar3.f2211g;
                                                arrayList8.add(i14, aVar4);
                                                arrayList7.remove(fragment4);
                                                i14++;
                                                fragment = fragment;
                                            }
                                        }
                                        size--;
                                        g0Var4 = g0Var5;
                                    }
                                    g0Var3 = g0Var4;
                                    i11 = 1;
                                    if (z12) {
                                        arrayList8.remove(i14);
                                        i14--;
                                    } else {
                                        aVar3.f2206a = 1;
                                        aVar3.f2208c = true;
                                        arrayList7.add(fragment3);
                                    }
                                }
                                i14 += i11;
                                g0Var4 = g0Var3;
                                i13 = 1;
                            }
                            g0Var3 = g0Var4;
                            i11 = 1;
                            arrayList7.add(aVar3.f2207b);
                            i14 += i11;
                            g0Var4 = g0Var3;
                            i13 = 1;
                        } else {
                            g0Var2 = g0Var4;
                        }
                    }
                } else {
                    g0Var2 = g0Var4;
                    int i17 = 1;
                    ArrayList<Fragment> arrayList9 = this.M;
                    ArrayList<h0.a> arrayList10 = aVar2.f2191a;
                    int size2 = arrayList10.size() - 1;
                    while (size2 >= 0) {
                        h0.a aVar5 = arrayList10.get(size2);
                        int i18 = aVar5.f2206a;
                        if (i18 != i17) {
                            if (i18 != 3) {
                                switch (i18) {
                                    case 8:
                                        fragment = null;
                                        break;
                                    case 9:
                                        fragment = aVar5.f2207b;
                                        break;
                                    case 10:
                                        aVar5.f2213i = aVar5.f2212h;
                                        break;
                                }
                                size2--;
                                i17 = 1;
                            }
                            arrayList9.add(aVar5.f2207b);
                            size2--;
                            i17 = 1;
                        }
                        arrayList9.remove(aVar5.f2207b);
                        size2--;
                        i17 = 1;
                    }
                }
                if (!z11 && !aVar2.f2196g) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                i12++;
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                g0Var4 = g0Var2;
            } else {
                g0 g0Var6 = g0Var4;
                this.M.clear();
                if (!z10 && this.f2323u >= 1) {
                    for (int i19 = i6; i19 < i10; i19++) {
                        Iterator<h0.a> it = arrayList.get(i19).f2191a.iterator();
                        while (it.hasNext()) {
                            Fragment fragment5 = it.next().f2207b;
                            if (fragment5 != null && fragment5.mFragmentManager != null) {
                                g0Var = g0Var6;
                                g0Var.g(g(fragment5));
                            } else {
                                g0Var = g0Var6;
                            }
                            g0Var6 = g0Var;
                        }
                    }
                }
                for (int i20 = i6; i20 < i10; i20++) {
                    androidx.fragment.app.a aVar6 = arrayList.get(i20);
                    if (arrayList2.get(i20).booleanValue()) {
                        aVar6.i(-1);
                        ArrayList<h0.a> arrayList11 = aVar6.f2191a;
                        boolean z13 = true;
                        int size3 = arrayList11.size() - 1;
                        while (size3 >= 0) {
                            h0.a aVar7 = arrayList11.get(size3);
                            Fragment fragment6 = aVar7.f2207b;
                            if (fragment6 != null) {
                                fragment6.mBeingSaved = aVar6.f2132t;
                                fragment6.setPopDirection(z13);
                                int i21 = aVar6.f;
                                int i22 = 8194;
                                if (i21 != 4097) {
                                    if (i21 != 8194) {
                                        i22 = 4100;
                                        if (i21 != 8197) {
                                            if (i21 != 4099) {
                                                if (i21 != 4100) {
                                                    i22 = 0;
                                                } else {
                                                    i22 = 8197;
                                                }
                                            } else {
                                                i22 = 4099;
                                            }
                                        }
                                    } else {
                                        i22 = 4097;
                                    }
                                }
                                fragment6.setNextTransition(i22);
                                fragment6.setSharedElementNames(aVar6.f2204o, aVar6.f2203n);
                            }
                            int i23 = aVar7.f2206a;
                            y yVar = aVar6.f2130q;
                            switch (i23) {
                                case 1:
                                    fragment6.setAnimations(aVar7.f2209d, aVar7.f2210e, aVar7.f, aVar7.f2211g);
                                    yVar.i0(fragment6, true);
                                    yVar.c0(fragment6);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + aVar7.f2206a);
                                case 3:
                                    fragment6.setAnimations(aVar7.f2209d, aVar7.f2210e, aVar7.f, aVar7.f2211g);
                                    yVar.a(fragment6);
                                    break;
                                case 4:
                                    fragment6.setAnimations(aVar7.f2209d, aVar7.f2210e, aVar7.f, aVar7.f2211g);
                                    yVar.getClass();
                                    m0(fragment6);
                                    break;
                                case 5:
                                    fragment6.setAnimations(aVar7.f2209d, aVar7.f2210e, aVar7.f, aVar7.f2211g);
                                    yVar.i0(fragment6, true);
                                    yVar.N(fragment6);
                                    break;
                                case 6:
                                    fragment6.setAnimations(aVar7.f2209d, aVar7.f2210e, aVar7.f, aVar7.f2211g);
                                    yVar.c(fragment6);
                                    break;
                                case 7:
                                    fragment6.setAnimations(aVar7.f2209d, aVar7.f2210e, aVar7.f, aVar7.f2211g);
                                    yVar.i0(fragment6, true);
                                    yVar.h(fragment6);
                                    break;
                                case 8:
                                    yVar.k0(null);
                                    break;
                                case 9:
                                    yVar.k0(fragment6);
                                    break;
                                case 10:
                                    yVar.j0(fragment6, aVar7.f2212h);
                                    break;
                            }
                            size3--;
                            z13 = true;
                        }
                        continue;
                    } else {
                        aVar6.i(1);
                        ArrayList<h0.a> arrayList12 = aVar6.f2191a;
                        int size4 = arrayList12.size();
                        int i24 = 0;
                        while (i24 < size4) {
                            h0.a aVar8 = arrayList12.get(i24);
                            Fragment fragment7 = aVar8.f2207b;
                            if (fragment7 != null) {
                                fragment7.mBeingSaved = aVar6.f2132t;
                                fragment7.setPopDirection(false);
                                fragment7.setNextTransition(aVar6.f);
                                fragment7.setSharedElementNames(aVar6.f2203n, aVar6.f2204o);
                            }
                            int i25 = aVar8.f2206a;
                            y yVar2 = aVar6.f2130q;
                            switch (i25) {
                                case 1:
                                    aVar = aVar6;
                                    fragment7.setAnimations(aVar8.f2209d, aVar8.f2210e, aVar8.f, aVar8.f2211g);
                                    yVar2.i0(fragment7, false);
                                    yVar2.a(fragment7);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + aVar8.f2206a);
                                case 3:
                                    aVar = aVar6;
                                    fragment7.setAnimations(aVar8.f2209d, aVar8.f2210e, aVar8.f, aVar8.f2211g);
                                    yVar2.c0(fragment7);
                                    break;
                                case 4:
                                    aVar = aVar6;
                                    fragment7.setAnimations(aVar8.f2209d, aVar8.f2210e, aVar8.f, aVar8.f2211g);
                                    yVar2.N(fragment7);
                                    break;
                                case 5:
                                    aVar = aVar6;
                                    fragment7.setAnimations(aVar8.f2209d, aVar8.f2210e, aVar8.f, aVar8.f2211g);
                                    yVar2.i0(fragment7, false);
                                    m0(fragment7);
                                    break;
                                case 6:
                                    aVar = aVar6;
                                    fragment7.setAnimations(aVar8.f2209d, aVar8.f2210e, aVar8.f, aVar8.f2211g);
                                    yVar2.h(fragment7);
                                    break;
                                case 7:
                                    aVar = aVar6;
                                    fragment7.setAnimations(aVar8.f2209d, aVar8.f2210e, aVar8.f, aVar8.f2211g);
                                    yVar2.i0(fragment7, false);
                                    yVar2.c(fragment7);
                                    break;
                                case 8:
                                    yVar2.k0(fragment7);
                                    aVar = aVar6;
                                    break;
                                case 9:
                                    yVar2.k0(null);
                                    aVar = aVar6;
                                    break;
                                case 10:
                                    yVar2.j0(fragment7, aVar8.f2213i);
                                    aVar = aVar6;
                                    break;
                            }
                            i24++;
                            aVar6 = aVar;
                        }
                        continue;
                    }
                }
                boolean booleanValue = arrayList2.get(i10 - 1).booleanValue();
                for (int i26 = i6; i26 < i10; i26++) {
                    androidx.fragment.app.a aVar9 = arrayList.get(i26);
                    if (booleanValue) {
                        for (int size5 = aVar9.f2191a.size() - 1; size5 >= 0; size5--) {
                            Fragment fragment8 = aVar9.f2191a.get(size5).f2207b;
                            if (fragment8 != null) {
                                g(fragment8).j();
                            }
                        }
                    } else {
                        Iterator<h0.a> it2 = aVar9.f2191a.iterator();
                        while (it2.hasNext()) {
                            Fragment fragment9 = it2.next().f2207b;
                            if (fragment9 != null) {
                                g(fragment9).j();
                            }
                        }
                    }
                }
                U(this.f2323u, true);
                HashSet hashSet = new HashSet();
                for (int i27 = i6; i27 < i10; i27++) {
                    Iterator<h0.a> it3 = arrayList.get(i27).f2191a.iterator();
                    while (it3.hasNext()) {
                        Fragment fragment10 = it3.next().f2207b;
                        if (fragment10 != null && (viewGroup = fragment10.mContainer) != null) {
                            hashSet.add(t0.g(viewGroup, M()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    t0 t0Var = (t0) it4.next();
                    t0Var.f2282d = booleanValue;
                    t0Var.h();
                    t0Var.c();
                }
                for (int i28 = i6; i28 < i10; i28++) {
                    androidx.fragment.app.a aVar10 = arrayList.get(i28);
                    if (arrayList2.get(i28).booleanValue() && aVar10.f2131s >= 0) {
                        aVar10.f2131s = -1;
                    }
                    aVar10.getClass();
                }
                if (z11 && this.f2316m != null) {
                    for (int i29 = 0; i29 < this.f2316m.size(); i29++) {
                        this.f2316m.get(i29).onBackStackChanged();
                    }
                    return;
                }
                return;
            }
        }
    }

    public final void B() {
        y(true);
        G();
    }

    public final Fragment C(String str) {
        return this.f2307c.b(str);
    }

    public final int D(String str, int i6, boolean z10) {
        ArrayList<androidx.fragment.app.a> arrayList = this.f2308d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i6 < 0) {
            if (z10) {
                return 0;
            }
            return this.f2308d.size() - 1;
        }
        int size = this.f2308d.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.a aVar = this.f2308d.get(size);
            if ((str != null && str.equals(aVar.f2198i)) || (i6 >= 0 && i6 == aVar.f2131s)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (z10) {
            while (size > 0) {
                androidx.fragment.app.a aVar2 = this.f2308d.get(size - 1);
                if ((str != null && str.equals(aVar2.f2198i)) || (i6 >= 0 && i6 == aVar2.f2131s)) {
                    size--;
                } else {
                    return size;
                }
            }
            return size;
        } else if (size == this.f2308d.size() - 1) {
            return -1;
        } else {
            return size + 1;
        }
    }

    public final Fragment E(int i6) {
        g0 g0Var = this.f2307c;
        ArrayList<Fragment> arrayList = g0Var.f2183a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = arrayList.get(size);
                if (fragment != null && fragment.mFragmentId == i6) {
                    return fragment;
                }
            } else {
                for (e0 e0Var : g0Var.f2184b.values()) {
                    if (e0Var != null) {
                        Fragment fragment2 = e0Var.f2166c;
                        if (fragment2.mFragmentId == i6) {
                            return fragment2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final Fragment F(String str) {
        g0 g0Var = this.f2307c;
        if (str != null) {
            ArrayList<Fragment> arrayList = g0Var.f2183a;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                Fragment fragment = arrayList.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (e0 e0Var : g0Var.f2184b.values()) {
                if (e0Var != null) {
                    Fragment fragment2 = e0Var.f2166c;
                    if (str.equals(fragment2.mTag)) {
                        return fragment2;
                    }
                }
            }
        } else {
            g0Var.getClass();
        }
        return null;
    }

    public final void G() {
        Iterator it = f().iterator();
        while (it.hasNext()) {
            t0 t0Var = (t0) it.next();
            if (t0Var.f2283e) {
                if (P(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                t0Var.f2283e = false;
                t0Var.c();
            }
        }
    }

    public final int H() {
        ArrayList<androidx.fragment.app.a> arrayList = this.f2308d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final Fragment I(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment C = C(string);
        if (C != null) {
            return C;
        }
        o0(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        throw null;
    }

    public final ViewGroup J(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f2325w.c()) {
            View b10 = this.f2325w.b(fragment.mContainerId);
            if (b10 instanceof ViewGroup) {
                return (ViewGroup) b10;
            }
        }
        return null;
    }

    public final t K() {
        Fragment fragment = this.f2326x;
        if (fragment != null) {
            return fragment.mFragmentManager.K();
        }
        return this.f2328z;
    }

    public final List<Fragment> L() {
        return this.f2307c.f();
    }

    public final v0 M() {
        Fragment fragment = this.f2326x;
        if (fragment != null) {
            return fragment.mFragmentManager.M();
        }
        return this.A;
    }

    public final void N(Fragment fragment) {
        if (P(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
            l0(fragment);
        }
    }

    public final boolean O() {
        return this.I;
    }

    public final boolean R() {
        Fragment fragment = this.f2326x;
        if (fragment == null) {
            return true;
        }
        if (fragment.isAdded() && this.f2326x.getParentFragmentManager().R()) {
            return true;
        }
        return false;
    }

    public final boolean T() {
        if (!this.G && !this.H) {
            return false;
        }
        return true;
    }

    public final void U(int i6, boolean z10) {
        HashMap<String, e0> hashMap;
        u<?> uVar;
        if (this.f2324v == null && i6 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (!z10 && i6 == this.f2323u) {
            return;
        }
        this.f2323u = i6;
        g0 g0Var = this.f2307c;
        Iterator<Fragment> it = g0Var.f2183a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = g0Var.f2184b;
            if (!hasNext) {
                break;
            }
            e0 e0Var = hashMap.get(it.next().mWho);
            if (e0Var != null) {
                e0Var.j();
            }
        }
        Iterator<e0> it2 = hashMap.values().iterator();
        while (true) {
            boolean z11 = false;
            if (!it2.hasNext()) {
                break;
            }
            e0 next = it2.next();
            if (next != null) {
                next.j();
                Fragment fragment = next.f2166c;
                if (fragment.mRemoving && !fragment.isInBackStack()) {
                    z11 = true;
                }
                if (z11) {
                    if (fragment.mBeingSaved && !g0Var.f2185c.containsKey(fragment.mWho)) {
                        next.n();
                    }
                    g0Var.h(next);
                }
            }
        }
        n0();
        if (this.F && (uVar = this.f2324v) != null && this.f2323u == 7) {
            uVar.h();
            this.F = false;
        }
    }

    public final void V() {
        if (this.f2324v == null) {
            return;
        }
        this.G = false;
        this.H = false;
        this.N.C = false;
        for (Fragment fragment : this.f2307c.f()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final void W() {
        w(new o(null, -1, 0), false);
    }

    public final void X(String str) {
        w(new o(str, -1, 1), false);
    }

    public final boolean Y() {
        return Z(-1, 0);
    }

    public final boolean Z(int i6, int i10) {
        y(false);
        x(true);
        Fragment fragment = this.f2327y;
        if (fragment != null && i6 < 0 && fragment.getChildFragmentManager().Y()) {
            return true;
        }
        boolean a02 = a0(this.K, this.L, null, i6, i10);
        if (a02) {
            this.f2306b = true;
            try {
                d0(this.K, this.L);
            } finally {
                e();
            }
        }
        q0();
        if (this.J) {
            this.J = false;
            n0();
        }
        this.f2307c.f2184b.values().removeAll(Collections.singleton(null));
        return a02;
    }

    public final e0 a(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            h1.a.d(fragment, str);
        }
        if (P(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        e0 g5 = g(fragment);
        fragment.mFragmentManager = this;
        g0 g0Var = this.f2307c;
        g0Var.g(g5);
        if (!fragment.mDetached) {
            g0Var.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (Q(fragment)) {
                this.F = true;
            }
        }
        return g5;
    }

    public final boolean a0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i6, int i10) {
        boolean z10;
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int D = D(str, i6, z10);
        if (D < 0) {
            return false;
        }
        for (int size = this.f2308d.size() - 1; size >= D; size--) {
            arrayList.add(this.f2308d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void b(u<?> uVar, r rVar, Fragment fragment) {
        String str;
        if (this.f2324v == null) {
            this.f2324v = uVar;
            this.f2325w = rVar;
            this.f2326x = fragment;
            CopyOnWriteArrayList<c0> copyOnWriteArrayList = this.f2318o;
            if (fragment != null) {
                copyOnWriteArrayList.add(new g(fragment));
            } else if (uVar instanceof c0) {
                copyOnWriteArrayList.add((c0) uVar);
            }
            if (this.f2326x != null) {
                q0();
            }
            if (uVar instanceof androidx.activity.j) {
                androidx.activity.j jVar = (androidx.activity.j) uVar;
                OnBackPressedDispatcher onBackPressedDispatcher = jVar.getOnBackPressedDispatcher();
                this.f2310g = onBackPressedDispatcher;
                androidx.lifecycle.p pVar = jVar;
                if (fragment != null) {
                    pVar = fragment;
                }
                onBackPressedDispatcher.a(pVar, this.f2311h);
            }
            if (fragment != null) {
                b0 b0Var = fragment.mFragmentManager.N;
                HashMap<String, b0> hashMap = b0Var.f2146y;
                b0 b0Var2 = hashMap.get(fragment.mWho);
                if (b0Var2 == null) {
                    b0Var2 = new b0(b0Var.A);
                    hashMap.put(fragment.mWho, b0Var2);
                }
                this.N = b0Var2;
            } else if (uVar instanceof androidx.lifecycle.r0) {
                this.N = (b0) new androidx.lifecycle.o0(((androidx.lifecycle.r0) uVar).getViewModelStore(), b0.D).a(b0.class);
            } else {
                this.N = new b0(false);
            }
            this.N.C = T();
            this.f2307c.f2186d = this.N;
            u<?> uVar2 = this.f2324v;
            if ((uVar2 instanceof a2.c) && fragment == null) {
                a2.a savedStateRegistry = ((a2.c) uVar2).getSavedStateRegistry();
                savedStateRegistry.c("android:support:fragments", new androidx.activity.c(2, this));
                Bundle a10 = savedStateRegistry.a("android:support:fragments");
                if (a10 != null) {
                    e0(a10);
                }
            }
            u<?> uVar3 = this.f2324v;
            if (uVar3 instanceof androidx.activity.result.g) {
                androidx.activity.result.f activityResultRegistry = ((androidx.activity.result.g) uVar3).getActivityResultRegistry();
                if (fragment != null) {
                    str = r1.b0.b(new StringBuilder(), fragment.mWho, ":");
                } else {
                    str = "";
                }
                String r = defpackage.c.r("FragmentManager:", str);
                this.B = activityResultRegistry.d(pl.a.f(r, "StartActivityForResult"), new e.d(), new h());
                this.C = activityResultRegistry.d(pl.a.f(r, "StartIntentSenderForResult"), new j(), new i());
                this.D = activityResultRegistry.d(pl.a.f(r, "RequestPermissions"), new e.b(), new a());
            }
            u<?> uVar4 = this.f2324v;
            if (uVar4 instanceof g0.b) {
                ((g0.b) uVar4).addOnConfigurationChangedListener(this.f2319p);
            }
            u<?> uVar5 = this.f2324v;
            if (uVar5 instanceof g0.c) {
                ((g0.c) uVar5).addOnTrimMemoryListener(this.f2320q);
            }
            u<?> uVar6 = this.f2324v;
            if (uVar6 instanceof f0.z) {
                ((f0.z) uVar6).addOnMultiWindowModeChangedListener(this.r);
            }
            u<?> uVar7 = this.f2324v;
            if (uVar7 instanceof f0.a0) {
                ((f0.a0) uVar7).addOnPictureInPictureModeChangedListener(this.f2321s);
            }
            u<?> uVar8 = this.f2324v;
            if ((uVar8 instanceof t0.i) && fragment == null) {
                ((t0.i) uVar8).addMenuProvider(this.f2322t);
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public final void b0(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(str, fragment.mWho);
        } else {
            o0(new IllegalStateException(defpackage.b.k("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    public final void c(Fragment fragment) {
        if (P(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.f2307c.a(fragment);
                if (P(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (Q(fragment)) {
                    this.F = true;
                }
            }
        }
    }

    public final void c0(Fragment fragment) {
        if (P(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z10 = !fragment.isInBackStack();
        if (!fragment.mDetached || z10) {
            g0 g0Var = this.f2307c;
            synchronized (g0Var.f2183a) {
                g0Var.f2183a.remove(fragment);
            }
            fragment.mAdded = false;
            if (Q(fragment)) {
                this.F = true;
            }
            fragment.mRemoving = true;
            l0(fragment);
        }
    }

    public final androidx.fragment.app.a d() {
        return new androidx.fragment.app.a(this);
    }

    public final void d0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            int size = arrayList.size();
            int i6 = 0;
            int i10 = 0;
            while (i6 < size) {
                if (!arrayList.get(i6).f2205p) {
                    if (i10 != i6) {
                        A(arrayList, arrayList2, i10, i6);
                    }
                    i10 = i6 + 1;
                    if (arrayList2.get(i6).booleanValue()) {
                        while (i10 < size && arrayList2.get(i10).booleanValue() && !arrayList.get(i10).f2205p) {
                            i10++;
                        }
                    }
                    A(arrayList, arrayList2, i6, i10);
                    i6 = i10 - 1;
                }
                i6++;
            }
            if (i10 != size) {
                A(arrayList, arrayList2, i10, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    public final void e() {
        this.f2306b = false;
        this.L.clear();
        this.K.clear();
    }

    public final void e0(Parcelable parcelable) {
        w wVar;
        int i6;
        e0 e0Var;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f2324v.f2292v.getClassLoader());
                this.f2314k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f2324v.f2292v.getClassLoader());
                arrayList.add((d0) bundle.getParcelable("state"));
            }
        }
        g0 g0Var = this.f2307c;
        HashMap<String, d0> hashMap = g0Var.f2185c;
        hashMap.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d0 d0Var = (d0) it.next();
            hashMap.put(d0Var.f2154v, d0Var);
        }
        a0 a0Var = (a0) bundle3.getParcelable("state");
        if (a0Var == null) {
            return;
        }
        HashMap<String, e0> hashMap2 = g0Var.f2184b;
        hashMap2.clear();
        Iterator<String> it2 = a0Var.f2133u.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            wVar = this.f2317n;
            if (!hasNext) {
                break;
            }
            d0 i10 = g0Var.i(it2.next(), null);
            if (i10 != null) {
                Fragment fragment = this.N.f2145x.get(i10.f2154v);
                if (fragment != null) {
                    if (P(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                    }
                    e0Var = new e0(wVar, g0Var, fragment, i10);
                } else {
                    e0Var = new e0(this.f2317n, this.f2307c, this.f2324v.f2292v.getClassLoader(), K(), i10);
                }
                Fragment fragment2 = e0Var.f2166c;
                fragment2.mFragmentManager = this;
                if (P(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragment2.mWho + "): " + fragment2);
                }
                e0Var.k(this.f2324v.f2292v.getClassLoader());
                g0Var.g(e0Var);
                e0Var.f2168e = this.f2323u;
            }
        }
        b0 b0Var = this.N;
        b0Var.getClass();
        Iterator it3 = new ArrayList(b0Var.f2145x.values()).iterator();
        while (true) {
            i6 = 0;
            if (!it3.hasNext()) {
                break;
            }
            Fragment fragment3 = (Fragment) it3.next();
            if (hashMap2.get(fragment3.mWho) != null) {
                i6 = 1;
            }
            if (i6 == 0) {
                if (P(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + a0Var.f2133u);
                }
                this.N.h(fragment3);
                fragment3.mFragmentManager = this;
                e0 e0Var2 = new e0(wVar, g0Var, fragment3);
                e0Var2.f2168e = 1;
                e0Var2.j();
                fragment3.mRemoving = true;
                e0Var2.j();
            }
        }
        ArrayList<String> arrayList2 = a0Var.f2134v;
        g0Var.f2183a.clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                Fragment b10 = g0Var.b(str3);
                if (b10 != null) {
                    if (P(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + b10);
                    }
                    g0Var.a(b10);
                } else {
                    throw new IllegalStateException(defpackage.b.m("No instantiated fragment for (", str3, ")"));
                }
            }
        }
        if (a0Var.f2135w != null) {
            this.f2308d = new ArrayList<>(a0Var.f2135w.length);
            int i11 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = a0Var.f2135w;
                if (i11 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.b bVar = bVarArr[i11];
                bVar.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(this);
                bVar.a(aVar);
                aVar.f2131s = bVar.A;
                int i12 = 0;
                while (true) {
                    ArrayList<String> arrayList3 = bVar.f2140v;
                    if (i12 >= arrayList3.size()) {
                        break;
                    }
                    String str4 = arrayList3.get(i12);
                    if (str4 != null) {
                        aVar.f2191a.get(i12).f2207b = C(str4);
                    }
                    i12++;
                }
                aVar.i(1);
                if (P(2)) {
                    StringBuilder u10 = defpackage.c.u("restoreAllState: back stack #", i11, " (index ");
                    u10.append(aVar.f2131s);
                    u10.append("): ");
                    u10.append(aVar);
                    Log.v("FragmentManager", u10.toString());
                    PrintWriter printWriter = new PrintWriter(new q0());
                    aVar.n("  ", printWriter, false);
                    printWriter.close();
                }
                this.f2308d.add(aVar);
                i11++;
            }
        } else {
            this.f2308d = null;
        }
        this.f2312i.set(a0Var.f2136x);
        String str5 = a0Var.f2137y;
        if (str5 != null) {
            Fragment C = C(str5);
            this.f2327y = C;
            r(C);
        }
        ArrayList<String> arrayList4 = a0Var.f2138z;
        if (arrayList4 != null) {
            while (i6 < arrayList4.size()) {
                this.f2313j.put(arrayList4.get(i6), a0Var.A.get(i6));
                i6++;
            }
        }
        this.E = new ArrayDeque<>(a0Var.B);
    }

    public final HashSet f() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f2307c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((e0) it.next()).f2166c.mContainer;
            if (viewGroup != null) {
                hashSet.add(t0.g(viewGroup, M()));
            }
        }
        return hashSet;
    }

    public final Bundle f0() {
        androidx.fragment.app.b[] bVarArr;
        ArrayList<String> arrayList;
        int size;
        Bundle bundle = new Bundle();
        G();
        Iterator it = f().iterator();
        while (it.hasNext()) {
            ((t0) it.next()).e();
        }
        y(true);
        this.G = true;
        this.N.C = true;
        g0 g0Var = this.f2307c;
        g0Var.getClass();
        HashMap<String, e0> hashMap = g0Var.f2184b;
        ArrayList<String> arrayList2 = new ArrayList<>(hashMap.size());
        for (e0 e0Var : hashMap.values()) {
            if (e0Var != null) {
                e0Var.n();
                Fragment fragment = e0Var.f2166c;
                arrayList2.add(fragment.mWho);
                if (P(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragment.mSavedFragmentState);
                }
            }
        }
        g0 g0Var2 = this.f2307c;
        g0Var2.getClass();
        ArrayList arrayList3 = new ArrayList(g0Var2.f2185c.values());
        if (arrayList3.isEmpty()) {
            if (P(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
        } else {
            g0 g0Var3 = this.f2307c;
            synchronized (g0Var3.f2183a) {
                bVarArr = null;
                if (g0Var3.f2183a.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(g0Var3.f2183a.size());
                    Iterator<Fragment> it2 = g0Var3.f2183a.iterator();
                    while (it2.hasNext()) {
                        Fragment next = it2.next();
                        arrayList.add(next.mWho);
                        if (P(2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + next.mWho + "): " + next);
                        }
                    }
                }
            }
            ArrayList<androidx.fragment.app.a> arrayList4 = this.f2308d;
            if (arrayList4 != null && (size = arrayList4.size()) > 0) {
                bVarArr = new androidx.fragment.app.b[size];
                for (int i6 = 0; i6 < size; i6++) {
                    bVarArr[i6] = new androidx.fragment.app.b(this.f2308d.get(i6));
                    if (P(2)) {
                        StringBuilder u10 = defpackage.c.u("saveAllState: adding back stack #", i6, ": ");
                        u10.append(this.f2308d.get(i6));
                        Log.v("FragmentManager", u10.toString());
                    }
                }
            }
            a0 a0Var = new a0();
            a0Var.f2133u = arrayList2;
            a0Var.f2134v = arrayList;
            a0Var.f2135w = bVarArr;
            a0Var.f2136x = this.f2312i.get();
            Fragment fragment2 = this.f2327y;
            if (fragment2 != null) {
                a0Var.f2137y = fragment2.mWho;
            }
            a0Var.f2138z.addAll(this.f2313j.keySet());
            a0Var.A.addAll(this.f2313j.values());
            a0Var.B = new ArrayList<>(this.E);
            bundle.putParcelable("state", a0Var);
            for (String str : this.f2314k.keySet()) {
                bundle.putBundle(defpackage.c.r("result_", str), this.f2314k.get(str));
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                d0 d0Var = (d0) it3.next();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", d0Var);
                bundle.putBundle("fragment_" + d0Var.f2154v, bundle2);
            }
        }
        return bundle;
    }

    public final e0 g(Fragment fragment) {
        String str = fragment.mWho;
        g0 g0Var = this.f2307c;
        e0 e0Var = g0Var.f2184b.get(str);
        if (e0Var != null) {
            return e0Var;
        }
        e0 e0Var2 = new e0(this.f2317n, g0Var, fragment);
        e0Var2.k(this.f2324v.f2292v.getClassLoader());
        e0Var2.f2168e = this.f2323u;
        return e0Var2;
    }

    public final Fragment.l g0(Fragment fragment) {
        Bundle m10;
        e0 e0Var = this.f2307c.f2184b.get(fragment.mWho);
        if (e0Var != null) {
            Fragment fragment2 = e0Var.f2166c;
            if (fragment2.equals(fragment)) {
                if (fragment2.mState <= -1 || (m10 = e0Var.m()) == null) {
                    return null;
                }
                return new Fragment.l(m10);
            }
        }
        o0(new IllegalStateException(defpackage.b.k("Fragment ", fragment, " is not currently in the FragmentManager")));
        throw null;
    }

    public final void h(Fragment fragment) {
        if (P(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (P(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                g0 g0Var = this.f2307c;
                synchronized (g0Var.f2183a) {
                    g0Var.f2183a.remove(fragment);
                }
                fragment.mAdded = false;
                if (Q(fragment)) {
                    this.F = true;
                }
                l0(fragment);
            }
        }
    }

    public final void h0() {
        synchronized (this.f2305a) {
            boolean z10 = true;
            if (this.f2305a.size() != 1) {
                z10 = false;
            }
            if (z10) {
                this.f2324v.f2293w.removeCallbacks(this.O);
                this.f2324v.f2293w.post(this.O);
                q0();
            }
        }
    }

    public final void i(boolean z10, Configuration configuration) {
        if (z10 && (this.f2324v instanceof g0.b)) {
            o0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f2307c.f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z10) {
                    fragment.mChildFragmentManager.i(true, configuration);
                }
            }
        }
    }

    public final void i0(Fragment fragment, boolean z10) {
        ViewGroup J = J(fragment);
        if (J != null && (J instanceof FragmentContainerView)) {
            ((FragmentContainerView) J).setDrawDisappearingViewsLast(!z10);
        }
    }

    public final boolean j(MenuItem menuItem) {
        if (this.f2323u < 1) {
            return false;
        }
        for (Fragment fragment : this.f2307c.f()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void j0(Fragment fragment, j.c cVar) {
        if (fragment.equals(C(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = cVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final boolean k(Menu menu, MenuInflater menuInflater) {
        if (this.f2323u < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.f2307c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.f2309e != null) {
            for (int i6 = 0; i6 < this.f2309e.size(); i6++) {
                Fragment fragment2 = this.f2309e.get(i6);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f2309e = arrayList;
        return z10;
    }

    public final void k0(Fragment fragment) {
        if (fragment != null && (!fragment.equals(C(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this))) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment2 = this.f2327y;
        this.f2327y = fragment;
        r(fragment2);
        r(this.f2327y);
    }

    public final void l() {
        boolean z10 = true;
        this.I = true;
        y(true);
        Iterator it = f().iterator();
        while (it.hasNext()) {
            ((t0) it.next()).e();
        }
        u<?> uVar = this.f2324v;
        boolean z11 = uVar instanceof androidx.lifecycle.r0;
        g0 g0Var = this.f2307c;
        if (z11) {
            z10 = g0Var.f2186d.B;
        } else {
            Context context = uVar.f2292v;
            if (context instanceof Activity) {
                z10 = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z10) {
            for (androidx.fragment.app.c cVar : this.f2313j.values()) {
                for (String str : cVar.f2148u) {
                    b0 b0Var = g0Var.f2186d;
                    b0Var.getClass();
                    if (P(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    b0Var.g(str);
                }
            }
        }
        u(-1);
        u<?> uVar2 = this.f2324v;
        if (uVar2 instanceof g0.c) {
            ((g0.c) uVar2).removeOnTrimMemoryListener(this.f2320q);
        }
        u<?> uVar3 = this.f2324v;
        if (uVar3 instanceof g0.b) {
            ((g0.b) uVar3).removeOnConfigurationChangedListener(this.f2319p);
        }
        u<?> uVar4 = this.f2324v;
        if (uVar4 instanceof f0.z) {
            ((f0.z) uVar4).removeOnMultiWindowModeChangedListener(this.r);
        }
        u<?> uVar5 = this.f2324v;
        if (uVar5 instanceof f0.a0) {
            ((f0.a0) uVar5).removeOnPictureInPictureModeChangedListener(this.f2321s);
        }
        u<?> uVar6 = this.f2324v;
        if ((uVar6 instanceof t0.i) && this.f2326x == null) {
            ((t0.i) uVar6).removeMenuProvider(this.f2322t);
        }
        this.f2324v = null;
        this.f2325w = null;
        this.f2326x = null;
        if (this.f2310g != null) {
            Iterator<androidx.activity.a> it2 = this.f2311h.f968b.iterator();
            while (it2.hasNext()) {
                it2.next().cancel();
            }
            this.f2310g = null;
        }
        androidx.activity.result.e eVar = this.B;
        if (eVar != null) {
            eVar.b();
            this.C.b();
            this.D.b();
        }
    }

    public final void l0(Fragment fragment) {
        ViewGroup J = J(fragment);
        if (J != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (J.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    J.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) J.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final void m(boolean z10) {
        if (z10 && (this.f2324v instanceof g0.c)) {
            o0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f2307c.f()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z10) {
                    fragment.mChildFragmentManager.m(true);
                }
            }
        }
    }

    public final void n(boolean z10, boolean z11) {
        if (z11 && (this.f2324v instanceof f0.z)) {
            o0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f2307c.f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.n(z10, true);
                }
            }
        }
    }

    public final void n0() {
        Iterator it = this.f2307c.d().iterator();
        while (it.hasNext()) {
            e0 e0Var = (e0) it.next();
            Fragment fragment = e0Var.f2166c;
            if (fragment.mDeferStart) {
                if (this.f2306b) {
                    this.J = true;
                } else {
                    fragment.mDeferStart = false;
                    e0Var.j();
                }
            }
        }
    }

    public final void o() {
        Iterator it = this.f2307c.e().iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.o();
            }
        }
    }

    public final void o0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new q0());
        u<?> uVar = this.f2324v;
        if (uVar != null) {
            try {
                uVar.d(printWriter, new String[0]);
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
            }
        } else {
            try {
                v("  ", null, printWriter, new String[0]);
            } catch (Exception e11) {
                Log.e("FragmentManager", "Failed dumping state", e11);
            }
        }
        throw runtimeException;
    }

    public final boolean p(MenuItem menuItem) {
        if (this.f2323u < 1) {
            return false;
        }
        for (Fragment fragment : this.f2307c.f()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void p0(k kVar) {
        w wVar = this.f2317n;
        synchronized (wVar.f2299a) {
            int size = wVar.f2299a.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    break;
                } else if (wVar.f2299a.get(i6).f2301a == kVar) {
                    wVar.f2299a.remove(i6);
                    break;
                } else {
                    i6++;
                }
            }
        }
    }

    public final void q(Menu menu) {
        if (this.f2323u < 1) {
            return;
        }
        for (Fragment fragment : this.f2307c.f()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void q0() {
        synchronized (this.f2305a) {
            try {
                boolean z10 = true;
                if (!this.f2305a.isEmpty()) {
                    b bVar = this.f2311h;
                    bVar.f967a = true;
                    s0.a<Boolean> aVar = bVar.f969c;
                    if (aVar != null) {
                        aVar.accept(Boolean.TRUE);
                    }
                    return;
                }
                b bVar2 = this.f2311h;
                z10 = (H() <= 0 || !S(this.f2326x)) ? false : false;
                bVar2.f967a = z10;
                s0.a<Boolean> aVar2 = bVar2.f969c;
                if (aVar2 != null) {
                    aVar2.accept(Boolean.valueOf(z10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void r(Fragment fragment) {
        if (fragment != null && fragment.equals(C(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    public final void s(boolean z10, boolean z11) {
        if (z11 && (this.f2324v instanceof f0.a0)) {
            o0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f2307c.f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.s(z10, true);
                }
            }
        }
    }

    public final boolean t(Menu menu) {
        boolean z10 = false;
        if (this.f2323u < 1) {
            return false;
        }
        for (Fragment fragment : this.f2307c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f2326x;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f2326x)));
            sb2.append("}");
        } else {
            u<?> uVar = this.f2324v;
            if (uVar != null) {
                sb2.append(uVar.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f2324v)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final void u(int i6) {
        try {
            this.f2306b = true;
            for (e0 e0Var : this.f2307c.f2184b.values()) {
                if (e0Var != null) {
                    e0Var.f2168e = i6;
                }
            }
            U(i6, false);
            Iterator it = f().iterator();
            while (it.hasNext()) {
                ((t0) it.next()).e();
            }
            this.f2306b = false;
            y(true);
        } catch (Throwable th2) {
            this.f2306b = false;
            throw th2;
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String f2 = pl.a.f(str, "    ");
        g0 g0Var = this.f2307c;
        g0Var.getClass();
        String str2 = str + "    ";
        HashMap<String, e0> hashMap = g0Var.f2184b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (e0 e0Var : hashMap.values()) {
                printWriter.print(str);
                if (e0Var != null) {
                    Fragment fragment = e0Var.f2166c;
                    printWriter.println(fragment);
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList<Fragment> arrayList = g0Var.f2183a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i6 = 0; i6 < size3; i6++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(arrayList.get(i6).toString());
            }
        }
        ArrayList<Fragment> arrayList2 = this.f2309e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(this.f2309e.get(i10).toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f2308d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                androidx.fragment.app.a aVar = this.f2308d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.n(f2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f2312i.get());
        synchronized (this.f2305a) {
            int size4 = this.f2305a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i12 = 0; i12 < size4; i12++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i12);
                    printWriter.print(": ");
                    printWriter.println((n) this.f2305a.get(i12));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2324v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2325w);
        if (this.f2326x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2326x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2323u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.G);
        printWriter.print(" mStopped=");
        printWriter.print(this.H);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.I);
        if (this.F) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.F);
        }
    }

    public final void w(n nVar, boolean z10) {
        if (!z10) {
            if (this.f2324v == null) {
                if (this.I) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (T()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f2305a) {
            if (this.f2324v == null) {
                if (z10) {
                    return;
                }
                throw new IllegalStateException("Activity has been destroyed");
            }
            this.f2305a.add(nVar);
            h0();
        }
    }

    public final void x(boolean z10) {
        if (!this.f2306b) {
            if (this.f2324v == null) {
                if (this.I) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (Looper.myLooper() == this.f2324v.f2293w.getLooper()) {
                if (!z10 && T()) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
                if (this.K == null) {
                    this.K = new ArrayList<>();
                    this.L = new ArrayList<>();
                    return;
                }
                return;
            } else {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    public final boolean y(boolean z10) {
        boolean z11;
        x(z10);
        boolean z12 = false;
        while (true) {
            ArrayList<androidx.fragment.app.a> arrayList = this.K;
            ArrayList<Boolean> arrayList2 = this.L;
            synchronized (this.f2305a) {
                if (this.f2305a.isEmpty()) {
                    z11 = false;
                } else {
                    int size = this.f2305a.size();
                    z11 = false;
                    for (int i6 = 0; i6 < size; i6++) {
                        z11 |= this.f2305a.get(i6).a(arrayList, arrayList2);
                    }
                    this.f2305a.clear();
                    this.f2324v.f2293w.removeCallbacks(this.O);
                }
            }
            if (!z11) {
                break;
            }
            z12 = true;
            this.f2306b = true;
            try {
                d0(this.K, this.L);
            } finally {
                e();
            }
        }
        q0();
        if (this.J) {
            this.J = false;
            n0();
        }
        this.f2307c.f2184b.values().removeAll(Collections.singleton(null));
        return z12;
    }

    public final void z(n nVar, boolean z10) {
        if (z10 && (this.f2324v == null || this.I)) {
            return;
        }
        x(z10);
        if (nVar.a(this.K, this.L)) {
            this.f2306b = true;
            try {
                d0(this.K, this.L);
            } finally {
                e();
            }
        }
        q0();
        if (this.J) {
            this.J = false;
            n0();
        }
        this.f2307c.f2184b.values().removeAll(Collections.singleton(null));
    }

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public static class l implements Parcelable {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: u  reason: collision with root package name */
        public final String f2337u;

        /* renamed from: v  reason: collision with root package name */
        public final int f2338v;

        /* compiled from: FragmentManager.java */
        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<l> {
            @Override // android.os.Parcelable.Creator
            public final l createFromParcel(Parcel parcel) {
                return new l(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final l[] newArray(int i6) {
                return new l[i6];
            }
        }

        public l(String str, int i6) {
            this.f2337u = str;
            this.f2338v = i6;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeString(this.f2337u);
            parcel.writeInt(this.f2338v);
        }

        public l(Parcel parcel) {
            this.f2337u = parcel.readString();
            this.f2338v = parcel.readInt();
        }
    }

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public static abstract class k {
        public void a(Fragment fragment) {
        }

        public void b(Fragment fragment) {
        }

        public void c(y yVar, Fragment fragment, View view) {
        }
    }
}
