package cm;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: FirestoreCustomGoalsFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcm/l;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class l extends Fragment {
    public static final /* synthetic */ int B = 0;
    public final LinkedHashMap A = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f5355u = LogHelper.INSTANCE.makeLogTag("FirestoreCustomGoalsFragment");

    /* renamed from: v  reason: collision with root package name */
    public yp.d f5356v;

    /* renamed from: w  reason: collision with root package name */
    public fm.a f5357w;

    /* renamed from: x  reason: collision with root package name */
    public bm.b f5358x;

    /* renamed from: y  reason: collision with root package name */
    public FirestoreGoal f5359y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f5360z;

    public l() {
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new am.w(18, this));
        kotlin.jvm.internal.i.f(registerForActivityResult, "registerForActivityResul…        }\n        }\n    }");
        this.f5360z = registerForActivityResult;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        View inflate = getLayoutInflater().inflate(R.layout.fragment_v3_goals_custom, (ViewGroup) null, false);
        int i6 = R.id.addGoalsButtonMain;
        RobertoButton robertoButton = (RobertoButton) hc.d.w(R.id.addGoalsButtonMain, inflate);
        if (robertoButton != null) {
            i6 = R.id.goalRecyclerView;
            RecyclerView recyclerView = (RecyclerView) hc.d.w(R.id.goalRecyclerView, inflate);
            if (recyclerView != null) {
                i6 = R.id.ivEmptyState;
                AppCompatImageView appCompatImageView = (AppCompatImageView) hc.d.w(R.id.ivEmptyState, inflate);
                if (appCompatImageView != null) {
                    i6 = R.id.tvEmptyState;
                    RobertoTextView robertoTextView = (RobertoTextView) hc.d.w(R.id.tvEmptyState, inflate);
                    if (robertoTextView != null) {
                        i6 = R.id.tvEmptyStateTitle;
                        RobertoTextView robertoTextView2 = (RobertoTextView) hc.d.w(R.id.tvEmptyStateTitle, inflate);
                        if (robertoTextView2 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                            this.f5356v = new yp.d(constraintLayout, robertoButton, recyclerView, appCompatImageView, robertoTextView, robertoTextView2);
                            return constraintLayout;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.A.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        boolean z10;
        super.onResume();
        bm.b bVar = this.f5358x;
        if (bVar != null) {
            fm.a aVar = this.f5357w;
            if (aVar != null) {
                if (bVar.f() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                aVar.t(Boolean.valueOf(z10), null, null);
            }
            fm.a aVar2 = this.f5357w;
            if (aVar2 != null) {
                aVar2.A(bVar.A);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        RobertoButton robertoButton;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.p requireActivity = requireActivity();
        kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
        fm.a aVar = (fm.a) new o0(requireActivity).a(fm.a.class);
        aVar.p();
        aVar.G.e(getViewLifecycleOwner(), new tl.m(16, new j(this)));
        ((androidx.lifecycle.w) aVar.N.getValue()).e(getViewLifecycleOwner(), new tl.m(17, new k(this, aVar)));
        this.f5357w = aVar;
        yp.d dVar = this.f5356v;
        if (dVar != null && (robertoButton = (RobertoButton) dVar.f38760e) != null) {
            robertoButton.setOnClickListener(new ol.k(14, this));
        }
    }
}
