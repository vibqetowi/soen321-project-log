package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.q;
import androidx.fragment.app.t0;
import com.theinnerhour.b2b.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import t.g;
import t0.d0;
/* compiled from: DefaultSpecialEffectsController.java */
/* loaded from: classes.dex */
public final class m extends t0 {

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public static class a extends b {

        /* renamed from: c  reason: collision with root package name */
        public final boolean f2235c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2236d;

        /* renamed from: e  reason: collision with root package name */
        public q.a f2237e;

        public a(t0.b bVar, o0.d dVar, boolean z10) {
            super(bVar, dVar);
            this.f2236d = false;
            this.f2235c = z10;
        }

        public final q.a c(Context context) {
            boolean z10;
            int exitAnim;
            Animation loadAnimation;
            q.a aVar;
            int a10;
            if (this.f2236d) {
                return this.f2237e;
            }
            t0.b bVar = this.f2238a;
            Fragment fragment = bVar.f2287c;
            boolean z11 = false;
            if (bVar.f2285a == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            int nextTransition = fragment.getNextTransition();
            if (this.f2235c) {
                if (z10) {
                    exitAnim = fragment.getPopEnterAnim();
                } else {
                    exitAnim = fragment.getPopExitAnim();
                }
            } else if (z10) {
                exitAnim = fragment.getEnterAnim();
            } else {
                exitAnim = fragment.getExitAnim();
            }
            fragment.setAnimations(0, 0, 0, 0);
            ViewGroup viewGroup = fragment.mContainer;
            q.a aVar2 = null;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                fragment.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            ViewGroup viewGroup2 = fragment.mContainer;
            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
                Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z10, exitAnim);
                if (onCreateAnimation != null) {
                    aVar2 = new q.a(onCreateAnimation);
                } else {
                    Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z10, exitAnim);
                    if (onCreateAnimator != null) {
                        aVar2 = new q.a(onCreateAnimator);
                    } else {
                        if (exitAnim == 0 && nextTransition != 0) {
                            if (nextTransition != 4097) {
                                if (nextTransition != 8194) {
                                    if (nextTransition != 8197) {
                                        if (nextTransition != 4099) {
                                            if (nextTransition != 4100) {
                                                exitAnim = -1;
                                            } else if (z10) {
                                                a10 = q.a(16842936, context);
                                            } else {
                                                a10 = q.a(16842937, context);
                                            }
                                        } else if (z10) {
                                            exitAnim = R.animator.fragment_fade_enter;
                                        } else {
                                            exitAnim = R.animator.fragment_fade_exit;
                                        }
                                    } else if (z10) {
                                        a10 = q.a(16842938, context);
                                    } else {
                                        a10 = q.a(16842939, context);
                                    }
                                    exitAnim = a10;
                                } else if (z10) {
                                    exitAnim = R.animator.fragment_close_enter;
                                } else {
                                    exitAnim = R.animator.fragment_close_exit;
                                }
                            } else if (z10) {
                                exitAnim = R.animator.fragment_open_enter;
                            } else {
                                exitAnim = R.animator.fragment_open_exit;
                            }
                        }
                        if (exitAnim != 0) {
                            boolean equals = "anim".equals(context.getResources().getResourceTypeName(exitAnim));
                            if (equals) {
                                try {
                                    loadAnimation = AnimationUtils.loadAnimation(context, exitAnim);
                                } catch (Resources.NotFoundException e10) {
                                    throw e10;
                                } catch (RuntimeException unused) {
                                }
                                if (loadAnimation != null) {
                                    aVar = new q.a(loadAnimation);
                                    aVar2 = aVar;
                                } else {
                                    z11 = true;
                                }
                            }
                            if (!z11) {
                                try {
                                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, exitAnim);
                                    if (loadAnimator != null) {
                                        aVar = new q.a(loadAnimator);
                                        aVar2 = aVar;
                                    }
                                } catch (RuntimeException e11) {
                                    if (!equals) {
                                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, exitAnim);
                                        if (loadAnimation2 != null) {
                                            aVar2 = new q.a(loadAnimation2);
                                        }
                                    } else {
                                        throw e11;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.f2237e = aVar2;
            this.f2236d = true;
            return aVar2;
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final t0.b f2238a;

        /* renamed from: b  reason: collision with root package name */
        public final o0.d f2239b;

        public b(t0.b bVar, o0.d dVar) {
            this.f2238a = bVar;
            this.f2239b = dVar;
        }

        public final void a() {
            t0.b bVar = this.f2238a;
            HashSet<o0.d> hashSet = bVar.f2289e;
            if (hashSet.remove(this.f2239b) && hashSet.isEmpty()) {
                bVar.b();
            }
        }

        public final boolean b() {
            t0.b bVar = this.f2238a;
            int c10 = defpackage.c.c(bVar.f2287c.mView);
            int i6 = bVar.f2285a;
            if (c10 != i6 && (c10 == 2 || i6 == 2)) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public static class c extends b {

        /* renamed from: c  reason: collision with root package name */
        public final Object f2240c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f2241d;

        /* renamed from: e  reason: collision with root package name */
        public final Object f2242e;

        public c(t0.b bVar, o0.d dVar, boolean z10, boolean z11) {
            super(bVar, dVar);
            Object exitTransition;
            Object enterTransition;
            boolean allowEnterTransitionOverlap;
            int i6 = bVar.f2285a;
            Fragment fragment = bVar.f2287c;
            if (i6 == 2) {
                if (z10) {
                    enterTransition = fragment.getReenterTransition();
                } else {
                    enterTransition = fragment.getEnterTransition();
                }
                this.f2240c = enterTransition;
                if (z10) {
                    allowEnterTransitionOverlap = fragment.getAllowReturnTransitionOverlap();
                } else {
                    allowEnterTransitionOverlap = fragment.getAllowEnterTransitionOverlap();
                }
                this.f2241d = allowEnterTransitionOverlap;
            } else {
                if (z10) {
                    exitTransition = fragment.getReturnTransition();
                } else {
                    exitTransition = fragment.getExitTransition();
                }
                this.f2240c = exitTransition;
                this.f2241d = true;
            }
            if (z11) {
                if (z10) {
                    this.f2242e = fragment.getSharedElementReturnTransition();
                    return;
                } else {
                    this.f2242e = fragment.getSharedElementEnterTransition();
                    return;
                }
            }
            this.f2242e = null;
        }

        public final o0 c(Object obj) {
            if (obj == null) {
                return null;
            }
            k0 k0Var = i0.f2217a;
            if (k0Var != null && (obj instanceof Transition)) {
                return k0Var;
            }
            o0 o0Var = i0.f2218b;
            if (o0Var != null && o0Var.e(obj)) {
                return o0Var;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f2238a.f2287c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public m(ViewGroup viewGroup) {
        super(viewGroup);
    }

    public static void j(ArrayList arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (t0.g0.b(viewGroup)) {
                if (!arrayList.contains(view)) {
                    arrayList.add(viewGroup);
                    return;
                }
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = viewGroup.getChildAt(i6);
                if (childAt.getVisibility() == 0) {
                    j(arrayList, childAt);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public static void k(t.b bVar, View view) {
        WeakHashMap<View, t0.o0> weakHashMap = t0.d0.f32288a;
        String k10 = d0.i.k(view);
        if (k10 != null) {
            bVar.put(k10, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = viewGroup.getChildAt(i6);
                if (childAt.getVisibility() == 0) {
                    k(bVar, childAt);
                }
            }
        }
    }

    public static void l(t.b bVar, Collection collection) {
        Iterator it = ((g.b) bVar.entrySet()).iterator();
        while (true) {
            g.d dVar = (g.d) it;
            if (dVar.hasNext()) {
                dVar.next();
                WeakHashMap<View, t0.o0> weakHashMap = t0.d0.f32288a;
                if (!collection.contains(d0.i.k((View) dVar.getValue()))) {
                    dVar.remove();
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x0536, code lost:
        if (r11 == r5) goto L322;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0839 A[LOOP:7: B:279:0x0833->B:281:0x0839, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:371:? A[RETURN, SYNTHETIC] */
    @Override // androidx.fragment.app.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ArrayList arrayList, boolean z10) {
        HashMap hashMap;
        t0.b bVar;
        t0.b bVar2;
        String str;
        ArrayList arrayList2;
        t0.b bVar3;
        ArrayList arrayList3;
        View next;
        View next2;
        t0.b bVar4;
        boolean z11;
        String str2;
        boolean z12;
        ArrayList arrayList4;
        t0.b bVar5;
        View view;
        View view2;
        boolean z13;
        String str3;
        ArrayList arrayList5;
        HashMap hashMap2;
        View view3;
        Rect rect;
        int i6;
        boolean z14;
        View view4;
        Iterator it;
        Iterator it2;
        Iterator it3;
        boolean z15;
        ArrayList arrayList6;
        Iterator it4;
        String str4;
        ArrayList arrayList7;
        boolean z16;
        Iterator it5 = arrayList.iterator();
        t0.b bVar6 = null;
        t0.b bVar7 = null;
        while (it5.hasNext()) {
            t0.b bVar8 = (t0.b) it5.next();
            int c10 = defpackage.c.c(bVar8.f2287c.mView);
            int d10 = v.h.d(bVar8.f2285a);
            if (d10 != 0) {
                if (d10 != 1) {
                    if (d10 != 2 && d10 != 3) {
                    }
                } else if (c10 != 2) {
                    bVar7 = bVar8;
                }
            }
            if (c10 == 2 && bVar6 == null) {
                bVar6 = bVar8;
            }
        }
        String str5 = " to ";
        String str6 = "FragmentManager";
        if (y.P(2)) {
            Log.v("FragmentManager", "Executing operations from " + bVar6 + " to " + bVar7);
        }
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList(arrayList);
        Fragment fragment = ((t0.b) arrayList.get(arrayList.size() - 1)).f2287c;
        Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            Fragment.j jVar = ((t0.b) it6.next()).f2287c.mAnimationInfo;
            Fragment.j jVar2 = fragment.mAnimationInfo;
            jVar.f2109b = jVar2.f2109b;
            jVar.f2110c = jVar2.f2110c;
            jVar.f2111d = jVar2.f2111d;
            jVar.f2112e = jVar2.f2112e;
        }
        Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            t0.b bVar9 = (t0.b) it7.next();
            o0.d dVar = new o0.d();
            bVar9.d();
            bVar9.f2289e.add(dVar);
            arrayList8.add(new a(bVar9, dVar, z10));
            o0.d dVar2 = new o0.d();
            bVar9.d();
            bVar9.f2289e.add(dVar2);
            if (!z10 ? bVar9 == bVar7 : bVar9 == bVar6) {
                z16 = true;
            } else {
                z16 = false;
            }
            arrayList9.add(new c(bVar9, dVar2, z10, z16));
            bVar9.f2288d.add(new d(this, arrayList10, bVar9));
        }
        HashMap hashMap3 = new HashMap();
        Iterator it8 = arrayList9.iterator();
        o0 o0Var = null;
        while (it8.hasNext()) {
            c cVar = (c) it8.next();
            if (cVar.b()) {
                arrayList7 = arrayList8;
                it4 = it8;
                str4 = str5;
            } else {
                Object obj = cVar.f2240c;
                o0 c11 = cVar.c(obj);
                Object obj2 = cVar.f2242e;
                it4 = it8;
                o0 c12 = cVar.c(obj2);
                str4 = str5;
                arrayList7 = arrayList8;
                t0.b bVar10 = cVar.f2238a;
                if (c11 != null && c12 != null && c11 != c12) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + bVar10.f2287c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2);
                }
                if (c11 != null) {
                    c12 = c11;
                }
                if (o0Var == null) {
                    o0Var = c12;
                } else if (c12 != null && o0Var != c12) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + bVar10.f2287c + " returned Transition " + obj + " which uses a different Transition  type than other Fragments.");
                }
            }
            it8 = it4;
            str5 = str4;
            arrayList8 = arrayList7;
        }
        ArrayList arrayList11 = arrayList8;
        String str7 = str5;
        ViewGroup viewGroup = this.f2279a;
        if (o0Var == null) {
            Iterator it9 = arrayList9.iterator();
            while (it9.hasNext()) {
                c cVar2 = (c) it9.next();
                hashMap3.put(cVar2.f2238a, Boolean.FALSE);
                cVar2.a();
            }
            hashMap = hashMap3;
            bVar = bVar6;
            bVar2 = bVar7;
            str = "FragmentManager";
        } else {
            View view5 = new View(viewGroup.getContext());
            Rect rect2 = new Rect();
            ArrayList<View> arrayList12 = new ArrayList<>();
            ArrayList<View> arrayList13 = new ArrayList<>();
            t.b bVar11 = new t.b();
            Iterator it10 = arrayList9.iterator();
            t0.b bVar12 = bVar6;
            ArrayList arrayList14 = arrayList10;
            View view6 = null;
            Object obj3 = null;
            boolean z17 = false;
            t0.b bVar13 = bVar7;
            while (it10.hasNext()) {
                Iterator it11 = it10;
                Object obj4 = ((c) it10.next()).f2242e;
                if (obj4 != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13 && bVar12 != null && bVar13 != null) {
                    Object r = o0Var.r(o0Var.f(obj4));
                    Fragment fragment2 = bVar13.f2287c;
                    arrayList5 = arrayList9;
                    ArrayList<String> sharedElementSourceNames = fragment2.getSharedElementSourceNames();
                    Fragment fragment3 = bVar12.f2287c;
                    HashMap hashMap4 = hashMap3;
                    ArrayList<String> sharedElementSourceNames2 = fragment3.getSharedElementSourceNames();
                    View view7 = view5;
                    ArrayList<String> sharedElementTargetNames = fragment3.getSharedElementTargetNames();
                    Rect rect3 = rect2;
                    o0 o0Var2 = o0Var;
                    int i10 = 0;
                    while (i10 < sharedElementTargetNames.size()) {
                        int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i10));
                        ArrayList<String> arrayList15 = sharedElementTargetNames;
                        if (indexOf != -1) {
                            sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i10));
                        }
                        i10++;
                        sharedElementTargetNames = arrayList15;
                    }
                    ArrayList<String> sharedElementTargetNames2 = fragment2.getSharedElementTargetNames();
                    if (!z10) {
                        fragment3.getExitTransitionCallback();
                        fragment2.getEnterTransitionCallback();
                    } else {
                        fragment3.getEnterTransitionCallback();
                        fragment2.getExitTransitionCallback();
                    }
                    int i11 = 0;
                    for (int size = sharedElementSourceNames.size(); i11 < size; size = size) {
                        bVar11.put(sharedElementSourceNames.get(i11), sharedElementTargetNames2.get(i11));
                        i11++;
                    }
                    if (y.P(2)) {
                        Log.v(str6, ">>> entering view names <<<");
                        for (Iterator<String> it12 = sharedElementTargetNames2.iterator(); it12.hasNext(); it12 = it12) {
                            Log.v(str6, "Name: " + it12.next());
                        }
                        Log.v(str6, ">>> exiting view names <<<");
                        for (Iterator<String> it13 = sharedElementSourceNames.iterator(); it13.hasNext(); it13 = it13) {
                            Log.v(str6, "Name: " + it13.next());
                        }
                    }
                    t.b bVar14 = new t.b();
                    k(bVar14, fragment3.mView);
                    t.g.k(bVar14, sharedElementSourceNames);
                    t.g.k(bVar11, bVar14.keySet());
                    t.b bVar15 = new t.b();
                    k(bVar15, fragment2.mView);
                    t.g.k(bVar15, sharedElementTargetNames2);
                    t.g.k(bVar15, bVar11.values());
                    k0 k0Var = i0.f2217a;
                    int i12 = bVar11.f32260w - 1;
                    while (i12 >= 0) {
                        String str8 = str6;
                        if (!bVar15.containsKey((String) bVar11.m(i12))) {
                            bVar11.k(i12);
                        }
                        i12--;
                        str6 = str8;
                    }
                    str3 = str6;
                    l(bVar14, bVar11.keySet());
                    l(bVar15, bVar11.values());
                    if (bVar11.isEmpty()) {
                        arrayList12.clear();
                        arrayList13.clear();
                        bVar12 = bVar6;
                        bVar13 = bVar7;
                        hashMap2 = hashMap4;
                        view3 = view7;
                        rect = rect3;
                        o0Var = o0Var2;
                        obj3 = null;
                    } else {
                        if (z10) {
                            fragment3.getEnterTransitionCallback();
                        } else {
                            fragment2.getEnterTransitionCallback();
                        }
                        t0.w.a(viewGroup, new i(bVar7, bVar6, z10, bVar15));
                        arrayList12.addAll(bVar14.values());
                        if (!sharedElementSourceNames.isEmpty()) {
                            i6 = 0;
                            z14 = false;
                            View view8 = (View) bVar14.getOrDefault(sharedElementSourceNames.get(0), null);
                            o0Var = o0Var2;
                            o0Var.m(view8, r);
                            view6 = view8;
                        } else {
                            o0Var = o0Var2;
                            i6 = 0;
                            z14 = false;
                        }
                        arrayList13.addAll(bVar15.values());
                        if (!sharedElementTargetNames2.isEmpty() && (view4 = (View) bVar15.getOrDefault(sharedElementTargetNames2.get(i6), z14)) != null) {
                            rect = rect3;
                            t0.w.a(viewGroup, new j(o0Var, view4, rect));
                            view3 = view7;
                            z17 = true;
                        } else {
                            rect = rect3;
                            view3 = view7;
                        }
                        o0Var.p(r, view3, arrayList12);
                        o0Var.l(r, null, null, r, arrayList13);
                        Boolean bool = Boolean.TRUE;
                        hashMap2 = hashMap4;
                        hashMap2.put(bVar6, bool);
                        hashMap2.put(bVar7, bool);
                        bVar12 = bVar6;
                        bVar13 = bVar7;
                        obj3 = r;
                    }
                } else {
                    str3 = str6;
                    arrayList5 = arrayList9;
                    Rect rect4 = rect2;
                    hashMap2 = hashMap3;
                    view3 = view5;
                    rect = rect4;
                }
                it10 = it11;
                arrayList9 = arrayList5;
                str6 = str3;
                Rect rect5 = rect;
                view5 = view3;
                hashMap3 = hashMap2;
                rect2 = rect5;
            }
            String str9 = str6;
            ArrayList arrayList16 = arrayList9;
            Rect rect6 = rect2;
            hashMap = hashMap3;
            View view9 = view5;
            ArrayList arrayList17 = new ArrayList();
            Iterator it14 = arrayList16.iterator();
            Object obj5 = null;
            Object obj6 = null;
            while (it14.hasNext()) {
                Iterator it15 = it14;
                c cVar3 = (c) it14.next();
                boolean b10 = cVar3.b();
                t0.b bVar16 = bVar6;
                t0.b bVar17 = cVar3.f2238a;
                if (b10) {
                    hashMap.put(bVar17, Boolean.FALSE);
                    cVar3.a();
                    it14 = it15;
                    bVar6 = bVar16;
                    bVar11 = bVar11;
                } else {
                    t.b bVar18 = bVar11;
                    Object f = o0Var.f(cVar3.f2240c);
                    t0.b bVar19 = bVar7;
                    Object obj7 = obj3;
                    if (obj7 != null && (bVar17 == bVar12 || bVar17 == bVar13)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (f == null) {
                        if (!z12) {
                            hashMap.put(bVar17, Boolean.FALSE);
                            cVar3.a();
                        }
                        bVar5 = bVar12;
                        view = view9;
                        obj3 = obj7;
                        view2 = view6;
                        arrayList4 = arrayList14;
                    } else {
                        obj3 = obj7;
                        ArrayList<View> arrayList18 = new ArrayList<>();
                        Object obj8 = obj6;
                        j(arrayList18, bVar17.f2287c.mView);
                        if (z12) {
                            if (bVar17 == bVar12) {
                                arrayList18.removeAll(arrayList12);
                            } else {
                                arrayList18.removeAll(arrayList13);
                            }
                        }
                        if (arrayList18.isEmpty()) {
                            o0Var.a(view9, f);
                        } else {
                            o0Var.b(f, arrayList18);
                            o0Var.l(f, f, arrayList18, null, null);
                            if (bVar17.f2285a == 3) {
                                arrayList4 = arrayList14;
                                arrayList4.remove(bVar17);
                                ArrayList<View> arrayList19 = new ArrayList<>(arrayList18);
                                bVar5 = bVar12;
                                Fragment fragment4 = bVar17.f2287c;
                                view = view9;
                                arrayList19.remove(fragment4.mView);
                                o0Var.k(f, fragment4.mView, arrayList19);
                                t0.w.a(viewGroup, new k(arrayList18));
                                if (bVar17.f2285a != 2) {
                                    arrayList17.addAll(arrayList18);
                                    if (z17) {
                                        o0Var.n(f, rect6);
                                    }
                                    view2 = view6;
                                } else {
                                    view2 = view6;
                                    o0Var.m(view2, f);
                                }
                                hashMap.put(bVar17, Boolean.TRUE);
                                if (!cVar3.f2241d) {
                                    obj5 = o0Var.j(obj5, f);
                                    obj6 = obj8;
                                } else {
                                    obj6 = o0Var.j(obj8, f);
                                }
                            }
                        }
                        bVar5 = bVar12;
                        view = view9;
                        arrayList4 = arrayList14;
                        if (bVar17.f2285a != 2) {
                        }
                        hashMap.put(bVar17, Boolean.TRUE);
                        if (!cVar3.f2241d) {
                        }
                    }
                    it14 = it15;
                    view6 = view2;
                    arrayList14 = arrayList4;
                    bVar12 = bVar5;
                    view9 = view;
                    bVar6 = bVar16;
                    bVar11 = bVar18;
                    bVar7 = bVar19;
                    bVar13 = bVar7;
                }
            }
            t0.b bVar20 = bVar12;
            bVar = bVar6;
            bVar2 = bVar7;
            t.b bVar21 = bVar11;
            arrayList10 = arrayList14;
            Object obj9 = obj3;
            Object i13 = o0Var.i(obj5, obj6, obj9);
            if (i13 == null) {
                arrayList2 = arrayList10;
                str = str9;
                boolean containsValue = hashMap.containsValue(Boolean.TRUE);
                Context context = viewGroup.getContext();
                ArrayList arrayList20 = new ArrayList();
                it = arrayList11.iterator();
                boolean z18 = false;
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    if (aVar.b()) {
                        aVar.a();
                    } else {
                        q.a c13 = aVar.c(context);
                        if (c13 == null) {
                            aVar.a();
                        } else {
                            Animator animator = c13.f2264b;
                            if (animator == null) {
                                arrayList20.add(aVar);
                            } else {
                                t0.b bVar22 = aVar.f2238a;
                                Fragment fragment5 = bVar22.f2287c;
                                if (Boolean.TRUE.equals(hashMap.get(bVar22))) {
                                    if (y.P(2)) {
                                        Log.v(str, "Ignoring Animator set on " + fragment5 + " as this Fragment was involved in a Transition.");
                                    }
                                    aVar.a();
                                } else {
                                    if (bVar22.f2285a == 3) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    if (z15) {
                                        arrayList6 = arrayList2;
                                        arrayList6.remove(bVar22);
                                    } else {
                                        arrayList6 = arrayList2;
                                    }
                                    View view10 = fragment5.mView;
                                    viewGroup.startViewTransition(view10);
                                    animator.addListener(new e(viewGroup, view10, z15, bVar22, aVar));
                                    animator.setTarget(view10);
                                    animator.start();
                                    if (y.P(2)) {
                                        Log.v(str, "Animator from operation " + bVar22 + " has started.");
                                    }
                                    aVar.f2239b.b(new f(animator, bVar22));
                                    arrayList2 = arrayList6;
                                    z18 = true;
                                }
                            }
                        }
                    }
                }
                ArrayList arrayList21 = arrayList2;
                it2 = arrayList20.iterator();
                while (it2.hasNext()) {
                    a aVar2 = (a) it2.next();
                    t0.b bVar23 = aVar2.f2238a;
                    Fragment fragment6 = bVar23.f2287c;
                    if (containsValue) {
                        if (y.P(2)) {
                            Log.v(str, "Ignoring Animation set on " + fragment6 + " as Animations cannot run alongside Transitions.");
                        }
                        aVar2.a();
                    } else if (z18) {
                        if (y.P(2)) {
                            Log.v(str, "Ignoring Animation set on " + fragment6 + " as Animations cannot run alongside Animators.");
                        }
                        aVar2.a();
                    } else {
                        View view11 = fragment6.mView;
                        q.a c14 = aVar2.c(context);
                        c14.getClass();
                        Animation animation = c14.f2263a;
                        animation.getClass();
                        if (bVar23.f2285a != 1) {
                            view11.startAnimation(animation);
                            aVar2.a();
                        } else {
                            viewGroup.startViewTransition(view11);
                            q.b bVar24 = new q.b(animation, viewGroup, view11);
                            bVar24.setAnimationListener(new g(view11, viewGroup, aVar2, bVar23));
                            view11.startAnimation(bVar24);
                            if (y.P(2)) {
                                Log.v(str, "Animation from operation " + bVar23 + " has started.");
                            }
                        }
                        aVar2.f2239b.b(new h(view11, viewGroup, aVar2, bVar23));
                    }
                }
                it3 = arrayList21.iterator();
                while (it3.hasNext()) {
                    t0.b bVar25 = (t0.b) it3.next();
                    defpackage.c.a(bVar25.f2285a, bVar25.f2287c.mView);
                }
                arrayList21.clear();
                if (y.P(2)) {
                    Log.v(str, "Completed executing operations from " + bVar + str7 + bVar2);
                    return;
                }
                return;
            }
            Iterator it16 = arrayList16.iterator();
            t0.b bVar26 = bVar20;
            while (it16.hasNext()) {
                c cVar4 = (c) it16.next();
                if (!cVar4.b()) {
                    t0.b bVar27 = cVar4.f2238a;
                    if (obj9 != null) {
                        if (bVar27 != bVar26) {
                            bVar4 = bVar2;
                        } else {
                            bVar4 = bVar2;
                        }
                        z11 = true;
                        if (cVar4.f2240c != null && !z11) {
                            str2 = str9;
                        } else {
                            WeakHashMap<View, t0.o0> weakHashMap = t0.d0.f32288a;
                            if (d0.g.c(viewGroup)) {
                                if (y.P(2)) {
                                    str2 = str9;
                                    Log.v(str2, "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + bVar27);
                                } else {
                                    str2 = str9;
                                }
                                cVar4.a();
                            } else {
                                str2 = str9;
                                Fragment fragment7 = bVar27.f2287c;
                                o0Var.o(i13, cVar4.f2239b, new l(cVar4, bVar27));
                            }
                        }
                        bVar2 = bVar4;
                        str9 = str2;
                        bVar26 = bVar;
                    } else {
                        bVar4 = bVar2;
                    }
                    z11 = false;
                    if (cVar4.f2240c != null) {
                    }
                    WeakHashMap<View, t0.o0> weakHashMap2 = t0.d0.f32288a;
                    if (d0.g.c(viewGroup)) {
                    }
                    bVar2 = bVar4;
                    str9 = str2;
                    bVar26 = bVar;
                }
            }
            t0.b bVar28 = bVar2;
            str = str9;
            WeakHashMap<View, t0.o0> weakHashMap3 = t0.d0.f32288a;
            if (!d0.g.c(viewGroup)) {
                bVar2 = bVar28;
            } else {
                i0.a(arrayList17, 4);
                ArrayList arrayList22 = new ArrayList();
                int size2 = arrayList13.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    View view12 = arrayList13.get(i14);
                    WeakHashMap<View, t0.o0> weakHashMap4 = t0.d0.f32288a;
                    arrayList22.add(d0.i.k(view12));
                    d0.i.v(view12, null);
                }
                if (y.P(2)) {
                    Log.v(str, ">>>>> Beginning transition <<<<<");
                    Log.v(str, ">>>>> SharedElementFirstOutViews <<<<<");
                    for (Iterator<View> it17 = arrayList12.iterator(); it17.hasNext(); it17 = it17) {
                        Log.v(str, "View: " + it17.next() + " Name: " + d0.i.k(next2));
                    }
                    Log.v(str, ">>>>> SharedElementLastInViews <<<<<");
                    for (Iterator<View> it18 = arrayList13.iterator(); it18.hasNext(); it18 = it18) {
                        Log.v(str, "View: " + it18.next() + " Name: " + d0.i.k(next));
                    }
                }
                o0Var.c(viewGroup, i13);
                int size3 = arrayList13.size();
                ArrayList arrayList23 = new ArrayList();
                int i15 = 0;
                while (i15 < size3) {
                    View view13 = arrayList12.get(i15);
                    WeakHashMap<View, t0.o0> weakHashMap5 = t0.d0.f32288a;
                    String k10 = d0.i.k(view13);
                    arrayList23.add(k10);
                    if (k10 == null) {
                        bVar3 = bVar28;
                    } else {
                        bVar3 = bVar28;
                        d0.i.v(view13, null);
                        t.b bVar29 = bVar21;
                        String str10 = (String) bVar29.getOrDefault(k10, null);
                        bVar21 = bVar29;
                        int i16 = 0;
                        while (i16 < size3) {
                            arrayList3 = arrayList10;
                            if (str10.equals(arrayList22.get(i16))) {
                                d0.i.v(arrayList13.get(i16), k10);
                                break;
                            } else {
                                i16++;
                                arrayList10 = arrayList3;
                            }
                        }
                    }
                    arrayList3 = arrayList10;
                    i15++;
                    arrayList10 = arrayList3;
                    bVar28 = bVar3;
                }
                bVar2 = bVar28;
                arrayList2 = arrayList10;
                t0.w.a(viewGroup, new n0(size3, arrayList13, arrayList22, arrayList12, arrayList23));
                i0.a(arrayList17, 0);
                o0Var.q(obj9, arrayList12, arrayList13);
                boolean containsValue2 = hashMap.containsValue(Boolean.TRUE);
                Context context2 = viewGroup.getContext();
                ArrayList arrayList202 = new ArrayList();
                it = arrayList11.iterator();
                boolean z182 = false;
                while (it.hasNext()) {
                }
                ArrayList arrayList212 = arrayList2;
                it2 = arrayList202.iterator();
                while (it2.hasNext()) {
                }
                it3 = arrayList212.iterator();
                while (it3.hasNext()) {
                }
                arrayList212.clear();
                if (y.P(2)) {
                }
            }
        }
        arrayList2 = arrayList10;
        boolean containsValue22 = hashMap.containsValue(Boolean.TRUE);
        Context context22 = viewGroup.getContext();
        ArrayList arrayList2022 = new ArrayList();
        it = arrayList11.iterator();
        boolean z1822 = false;
        while (it.hasNext()) {
        }
        ArrayList arrayList2122 = arrayList2;
        it2 = arrayList2022.iterator();
        while (it2.hasNext()) {
        }
        it3 = arrayList2122.iterator();
        while (it3.hasNext()) {
        }
        arrayList2122.clear();
        if (y.P(2)) {
        }
    }
}
