package oq;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionHopeIntroductionFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loq/g;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class g extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f27730w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f27732v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f27731u = LogHelper.INSTANCE.makeLogTag(g.class);

    public final void J() {
        ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setVisibility(8);
        ((RobertoButton) _$_findCachedViewById(R.id.startCTA)).setVisibility(0);
        ((RobertoButton) _$_findCachedViewById(R.id.startCTA)).setText(getString(R.string.depressionHopeIntro3CTA));
        ((RobertoButton) _$_findCachedViewById(R.id.startCTA)).setAlpha(0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((RobertoButton) _$_findCachedViewById(R.id.startCTA), "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setStartDelay(1000L);
        ofFloat.addListener(new f(this));
        ofFloat.start();
        ((ConstraintLayout) _$_findCachedViewById(R.id.a1parent)).setOnClickListener(null);
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f27732v;
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
        return inflater.inflate(R.layout.fragment_screen_a1, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f27732v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            RobertoTextView header = (RobertoTextView) _$_findCachedViewById(R.id.header);
            kotlin.jvm.internal.i.f(header, "header");
            insetsUtils.addStatusBarHeight(header);
            ((ConstraintLayout) _$_findCachedViewById(R.id.a1parent)).setBackgroundColor(g0.a.b(requireContext(), R.color.hopeInroBackground));
            int i6 = requireArguments().getInt("Intro");
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3) {
                        J();
                        ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionHopeIntro3Head));
                        ((RobertoTextView) _$_findCachedViewById(R.id.subheader)).setText(getString(R.string.depressionHopeIntro3SubHead));
                        ((AppCompatImageView) _$_findCachedViewById(R.id.bottomImage)).setImageResource(R.drawable.ir_hope_candle3);
                    }
                } else {
                    ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setText(getString(R.string.depressionHopeTap));
                    ((RobertoButton) _$_findCachedViewById(R.id.startCTA)).setVisibility(8);
                    ((ConstraintLayout) _$_findCachedViewById(R.id.a1parent)).setOnClickListener(new e(this, 1));
                    ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionHopeIntro2Head));
                    ((RobertoTextView) _$_findCachedViewById(R.id.subheader)).setText(getString(R.string.depressionHopeIntro2SubHead));
                    ((AppCompatImageView) _$_findCachedViewById(R.id.bottomImage)).setImageResource(R.drawable.ir_hope_candle2);
                }
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setVisibility(0);
                ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setText(getString(R.string.depressionHopeTap));
                ((RobertoButton) _$_findCachedViewById(R.id.startCTA)).setVisibility(8);
                ((ConstraintLayout) _$_findCachedViewById(R.id.a1parent)).setOnClickListener(new e(this, 0));
                ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionHopeIntro1Head));
                ((RobertoTextView) _$_findCachedViewById(R.id.subheader)).setText(getString(R.string.depressionHopeIntro1SubHead));
                ((AppCompatImageView) _$_findCachedViewById(R.id.bottomImage)).setImageResource(R.drawable.ir_hope_candle1);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f27731u, e10);
        }
    }
}
