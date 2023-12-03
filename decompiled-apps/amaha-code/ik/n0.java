package ik;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.libPackage.circularProgressBar.CircularProgressBar;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: InitialAssessmentBuildingFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lik/n0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class n0 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f20251w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f20253v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f20252u = LogHelper.INSTANCE.makeLogTag(n0.class);

    /* compiled from: InitialAssessmentBuildingFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements lr.b {
        public a() {
        }

        @Override // lr.b
        public final void a(float f) {
            n0 n0Var = n0.this;
            if (f >= 100.0f) {
                int i6 = n0.f20251w;
                n0Var.getClass();
                try {
                    ((RobertoTextView) n0Var._$_findCachedViewById(R.id.tvProgress)).setVisibility(8);
                    ((AppCompatImageView) n0Var._$_findCachedViewById(R.id.ivTick)).setVisibility(0);
                    Animation loadAnimation = AnimationUtils.loadAnimation(n0Var.requireContext(), R.anim.up_and_down_scale_animation);
                    ((AppCompatImageView) n0Var._$_findCachedViewById(R.id.ivTick)).startAnimation(loadAnimation);
                    loadAnimation.setAnimationListener(new o0(n0Var));
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(n0Var.f20252u, e10);
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) f);
            sb2.append('%');
            ((RobertoTextView) n0Var._$_findCachedViewById(R.id.tvProgress)).setText(sb2.toString());
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f20253v;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(i6)) != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_initial_assessment_building, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f20253v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            ((CircularProgressBar) _$_findCachedViewById(R.id.ringProgress)).setOnProgressChangedListener(new a());
            ((CircularProgressBar) _$_findCachedViewById(R.id.ringProgress)).c(100.0f, 7000);
            ((RobertoTextView) _$_findCachedViewById(R.id.textView)).setText("We are preparing your personalised plan");
            ((RobertoTextView) _$_findCachedViewById(R.id.textView12)).setText("");
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f20252u, e10);
        }
    }
}
