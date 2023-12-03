package pl;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N14AScreenFragment;
import java.util.List;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class u0 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f28644u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ v0 f28645v;

    public /* synthetic */ u0(v0 v0Var, int i6) {
        this.f28644u = i6;
        this.f28645v = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NewDynamicParentActivity newDynamicParentActivity;
        NavHostFragment navHostFragment;
        androidx.lifecycle.h hVar;
        androidx.fragment.app.y childFragmentManager;
        List<Fragment> L;
        NewDynamicParentActivity newDynamicParentActivity2;
        NavHostFragment navHostFragment2;
        Fragment fragment;
        androidx.fragment.app.y childFragmentManager2;
        List<Fragment> L2;
        int i6 = this.f28644u;
        rr.d dVar = null;
        N14AScreenFragment n14AScreenFragment = null;
        v0 this$0 = this.f28645v;
        switch (i6) {
            case 0:
                int i10 = v0.B;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p requireActivity = this$0.requireActivity();
                if (requireActivity instanceof NewDynamicParentActivity) {
                    newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity;
                } else {
                    newDynamicParentActivity2 = null;
                }
                if (newDynamicParentActivity2 != null) {
                    Fragment E = newDynamicParentActivity2.getSupportFragmentManager().E(R.id.parentFragmentContainer);
                    if (E instanceof NavHostFragment) {
                        navHostFragment2 = (NavHostFragment) E;
                    } else {
                        navHostFragment2 = null;
                    }
                    if (navHostFragment2 != null && (childFragmentManager2 = navHostFragment2.getChildFragmentManager()) != null && (L2 = childFragmentManager2.L()) != null) {
                        fragment = (Fragment) is.u.i2(L2);
                    } else {
                        fragment = null;
                    }
                    if (fragment instanceof N14AScreenFragment) {
                        n14AScreenFragment = (N14AScreenFragment) fragment;
                    }
                    if (n14AScreenFragment != null) {
                        n14AScreenFragment.Y("learn_more");
                        return;
                    }
                    return;
                }
                return;
            default:
                int i11 = v0.B;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                if (requireActivity2 instanceof NewDynamicParentActivity) {
                    newDynamicParentActivity = (NewDynamicParentActivity) requireActivity2;
                } else {
                    newDynamicParentActivity = null;
                }
                if (newDynamicParentActivity != null) {
                    Fragment E2 = newDynamicParentActivity.getSupportFragmentManager().E(R.id.parentFragmentContainer);
                    if (E2 instanceof NavHostFragment) {
                        navHostFragment = (NavHostFragment) E2;
                    } else {
                        navHostFragment = null;
                    }
                    if (navHostFragment != null && (childFragmentManager = navHostFragment.getChildFragmentManager()) != null && (L = childFragmentManager.L()) != null) {
                        hVar = (Fragment) is.u.i2(L);
                    } else {
                        hVar = null;
                    }
                    if (hVar instanceof rr.d) {
                        dVar = (rr.d) hVar;
                    }
                    if (dVar != null) {
                        dVar.J();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
