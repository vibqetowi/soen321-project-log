package androidx.navigation.fragment;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.a;
import androidx.lifecycle.j;
import androidx.lifecycle.o0;
import androidx.lifecycle.p;
import androidx.lifecycle.q0;
import com.theinnerhour.b2b.R;
import fv.k;
import fv.t;
import is.b0;
import is.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import s1.e0;
import s1.f;
import s1.f0;
import s1.g0;
import s1.h;
import s1.i;
import s1.i0;
import s1.p;
import s1.y;
import s1.z;
import u1.b;
import u1.c;
/* compiled from: NavHostFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Landroidx/fragment/app/Fragment;", "", "<init>", "()V", "navigation-fragment_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public class NavHostFragment extends Fragment {

    /* renamed from: u  reason: collision with root package name */
    public y f2672u;

    /* renamed from: v  reason: collision with root package name */
    public Boolean f2673v;

    /* renamed from: w  reason: collision with root package name */
    public View f2674w;

    /* renamed from: x  reason: collision with root package name */
    public int f2675x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f2676y;

    public final y F() {
        y yVar = this.f2672u;
        if (yVar != null) {
            return yVar;
        }
        throw new IllegalStateException("NavController is not available before onCreate()".toString());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        i.g(context, "context");
        super.onAttach(context);
        if (this.f2676y) {
            androidx.fragment.app.y parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            a aVar = new a(parentFragmentManager);
            aVar.q(this);
            aVar.j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z10;
        Bundle bundle2;
        j lifecycle;
        Context requireContext = requireContext();
        i.f(requireContext, "requireContext()");
        y yVar = new y(requireContext);
        this.f2672u = yVar;
        if (!i.b(this, yVar.f31147m)) {
            p pVar = yVar.f31147m;
            h hVar = yVar.r;
            if (pVar != null && (lifecycle = pVar.getLifecycle()) != null) {
                lifecycle.c(hVar);
            }
            yVar.f31147m = this;
            getLifecycle().a(hVar);
        }
        while (true) {
            if (!(requireContext instanceof ContextWrapper)) {
                break;
            } else if (requireContext instanceof androidx.activity.j) {
                y yVar2 = this.f2672u;
                i.d(yVar2);
                OnBackPressedDispatcher onBackPressedDispatcher = ((androidx.activity.j) requireContext).getOnBackPressedDispatcher();
                i.f(onBackPressedDispatcher, "context as OnBackPressed…).onBackPressedDispatcher");
                if (!i.b(onBackPressedDispatcher, yVar2.f31148n)) {
                    p pVar2 = yVar2.f31147m;
                    if (pVar2 != null) {
                        i.e eVar = yVar2.f31152s;
                        Iterator<androidx.activity.a> it = eVar.f968b.iterator();
                        while (it.hasNext()) {
                            it.next().cancel();
                        }
                        yVar2.f31148n = onBackPressedDispatcher;
                        onBackPressedDispatcher.a(pVar2, eVar);
                        j lifecycle2 = pVar2.getLifecycle();
                        h hVar2 = yVar2.r;
                        lifecycle2.c(hVar2);
                        lifecycle2.a(hVar2);
                    } else {
                        throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()".toString());
                    }
                }
            } else {
                requireContext = ((ContextWrapper) requireContext).getBaseContext();
                kotlin.jvm.internal.i.f(requireContext, "context.baseContext");
            }
        }
        y yVar3 = this.f2672u;
        kotlin.jvm.internal.i.d(yVar3);
        Boolean bool = this.f2673v;
        int i6 = 0;
        if (bool != null && bool.booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        yVar3.f31153t = z10;
        yVar3.x();
        Bundle bundle3 = null;
        this.f2673v = null;
        y yVar4 = this.f2672u;
        kotlin.jvm.internal.i.d(yVar4);
        q0 viewModelStore = getViewModelStore();
        kotlin.jvm.internal.i.f(viewModelStore, "viewModelStore");
        s1.p pVar3 = yVar4.f31149o;
        p.a aVar = s1.p.f31199y;
        if (!kotlin.jvm.internal.i.b(pVar3, (s1.p) new o0(viewModelStore, aVar, 0).a(s1.p.class))) {
            if (yVar4.f31141g.isEmpty()) {
                yVar4.f31149o = (s1.p) new o0(viewModelStore, aVar, 0).a(s1.p.class);
            } else {
                throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
            }
        }
        y yVar5 = this.f2672u;
        kotlin.jvm.internal.i.d(yVar5);
        Context requireContext2 = requireContext();
        kotlin.jvm.internal.i.f(requireContext2, "requireContext()");
        androidx.fragment.app.y childFragmentManager = getChildFragmentManager();
        kotlin.jvm.internal.i.f(childFragmentManager, "childFragmentManager");
        b bVar = new b(requireContext2, childFragmentManager);
        i0 i0Var = yVar5.f31154u;
        i0Var.a(bVar);
        Context requireContext3 = requireContext();
        kotlin.jvm.internal.i.f(requireContext3, "requireContext()");
        androidx.fragment.app.y childFragmentManager2 = getChildFragmentManager();
        kotlin.jvm.internal.i.f(childFragmentManager2, "childFragmentManager");
        int id2 = getId();
        if (id2 == 0 || id2 == -1) {
            id2 = R.id.nav_host_fragment_container;
        }
        i0Var.a(new c(requireContext3, childFragmentManager2, id2));
        if (bundle != null) {
            bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
            if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                this.f2676y = true;
                androidx.fragment.app.y parentFragmentManager = getParentFragmentManager();
                parentFragmentManager.getClass();
                a aVar2 = new a(parentFragmentManager);
                aVar2.q(this);
                aVar2.j();
            }
            this.f2675x = bundle.getInt("android-support-nav:fragment:graphId");
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            y yVar6 = this.f2672u;
            kotlin.jvm.internal.i.d(yVar6);
            bundle2.setClassLoader(yVar6.f31136a.getClassLoader());
            yVar6.f31139d = bundle2.getBundle("android-support-nav:controller:navigatorState");
            yVar6.f31140e = bundle2.getParcelableArray("android-support-nav:controller:backStack");
            LinkedHashMap linkedHashMap = yVar6.f31146l;
            linkedHashMap.clear();
            int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
            if (intArray != null && stringArrayList != null) {
                int length = intArray.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    yVar6.f31145k.put(Integer.valueOf(intArray[i10]), stringArrayList.get(i11));
                    i10++;
                    i11++;
                }
            }
            ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
            if (stringArrayList2 != null) {
                for (String id3 : stringArrayList2) {
                    Parcelable[] parcelableArray = bundle2.getParcelableArray("android-support-nav:controller:backStackStates:" + id3);
                    if (parcelableArray != null) {
                        kotlin.jvm.internal.i.f(id3, "id");
                        g gVar = new g(parcelableArray.length);
                        b0 N = kotlin.jvm.internal.h.N(parcelableArray);
                        while (N.hasNext()) {
                            Parcelable parcelable = (Parcelable) N.next();
                            if (parcelable != null) {
                                gVar.addLast((s1.g) parcelable);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                            }
                        }
                        linkedHashMap.put(id3, gVar);
                    }
                }
            }
            yVar6.f = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled");
        }
        if (this.f2675x != 0) {
            y yVar7 = this.f2672u;
            kotlin.jvm.internal.i.d(yVar7);
            yVar7.u(((z) yVar7.B.getValue()).b(this.f2675x), null);
        } else {
            Bundle arguments = getArguments();
            if (arguments != null) {
                i6 = arguments.getInt("android-support-nav:fragment:graphId");
            }
            if (arguments != null) {
                bundle3 = arguments.getBundle("android-support-nav:fragment:startDestinationArgs");
            }
            if (i6 != 0) {
                y yVar8 = this.f2672u;
                kotlin.jvm.internal.i.d(yVar8);
                yVar8.u(((z) yVar8.B.getValue()).b(i6), bundle3);
            }
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        Context context = inflater.getContext();
        kotlin.jvm.internal.i.f(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int id2 = getId();
        if (id2 == 0 || id2 == -1) {
            id2 = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(id2);
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        View view = this.f2674w;
        if (view != null) {
            s1.i iVar = (s1.i) t.D0(t.H0(k.x0(e0.f31113u, view), f0.f31123u));
            if (iVar != null) {
                if (iVar == this.f2672u) {
                    view.setTag(R.id.nav_controller_view_tag, null);
                }
            } else {
                throw new IllegalStateException("View " + view + " does not have a NavController set");
            }
        }
        this.f2674w = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onInflate(Context context, AttributeSet attrs, Bundle bundle) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(attrs, "attrs");
        super.onInflate(context, attrs, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, sp.b.f31857d);
        kotlin.jvm.internal.i.f(obtainStyledAttributes, "context.obtainStyledAttr…yleable.NavHost\n        )");
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f2675x = resourceId;
        }
        hs.k kVar = hs.k.f19476a;
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attrs, kotlin.jvm.internal.b0.f23448d0);
        kotlin.jvm.internal.i.f(obtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (obtainStyledAttributes2.getBoolean(0, false)) {
            this.f2676y = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPrimaryNavigationFragmentChanged(boolean z10) {
        y yVar = this.f2672u;
        if (yVar != null) {
            yVar.f31153t = z10;
            yVar.x();
            return;
        }
        this.f2673v = Boolean.valueOf(z10);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Bundle bundle;
        kotlin.jvm.internal.i.g(outState, "outState");
        super.onSaveInstanceState(outState);
        y yVar = this.f2672u;
        kotlin.jvm.internal.i.d(yVar);
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : is.e0.x0(yVar.f31154u.f31178a).entrySet()) {
            String str = (String) entry.getKey();
            Bundle h10 = ((g0) entry.getValue()).h();
            if (h10 != null) {
                arrayList.add(str);
                bundle2.putBundle(str, h10);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        } else {
            bundle = null;
        }
        g<f> gVar = yVar.f31141g;
        if (!gVar.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[gVar.f20655w];
            Iterator<f> it = gVar.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                parcelableArr[i6] = new s1.g(it.next());
                i6++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        LinkedHashMap linkedHashMap = yVar.f31145k;
        if (!linkedHashMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[linkedHashMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i10 = 0;
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                iArr[i10] = ((Number) entry2.getKey()).intValue();
                arrayList2.add((String) entry2.getValue());
                i10++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        LinkedHashMap linkedHashMap2 = yVar.f31146l;
        if (!linkedHashMap2.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                String str2 = (String) entry3.getKey();
                g gVar2 = (g) entry3.getValue();
                arrayList3.add(str2);
                Parcelable[] parcelableArr2 = new Parcelable[gVar2.f20655w];
                Iterator<E> it2 = gVar2.iterator();
                int i11 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i12 = i11 + 1;
                    if (i11 >= 0) {
                        parcelableArr2[i11] = (s1.g) next;
                        i11 = i12;
                    } else {
                        ca.a.t1();
                        throw null;
                    }
                }
                bundle.putParcelableArray(c.r("android-support-nav:controller:backStackStates:", str2), parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (yVar.f) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", yVar.f);
        }
        if (bundle != null) {
            outState.putBundle("android-support-nav:fragment:navControllerState", bundle);
        }
        if (this.f2676y) {
            outState.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i13 = this.f2675x;
        if (i13 != 0) {
            outState.putInt("android-support-nav:fragment:graphId", i13);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        if (view instanceof ViewGroup) {
            view.setTag(R.id.nav_controller_view_tag, this.f2672u);
            if (view.getParent() != null) {
                ViewParent parent = view.getParent();
                if (parent != null) {
                    View view2 = (View) parent;
                    this.f2674w = view2;
                    if (view2.getId() == getId()) {
                        View view3 = this.f2674w;
                        kotlin.jvm.internal.i.d(view3);
                        view3.setTag(R.id.nav_controller_view_tag, this.f2672u);
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            return;
        }
        throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
    }
}
