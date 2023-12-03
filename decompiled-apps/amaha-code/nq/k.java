package nq;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionGoodthingsActivity;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionGoodthingsIntroFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnq/k;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class k extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f26737w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f26739v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f26738u = LogHelper.INSTANCE.makeLogTag(k.class);

    public final void J() {
        ((RobertoButton) _$_findCachedViewById(R.id.startCTA)).setVisibility(0);
        ((RobertoButton) _$_findCachedViewById(R.id.startCTA)).setText(getString(R.string.goodthingsIntroCTA));
        ((RobertoButton) _$_findCachedViewById(R.id.startCTA)).setAlpha(0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((RobertoButton) _$_findCachedViewById(R.id.startCTA), "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setStartDelay(1000L);
        ofFloat.addListener(new j(this));
        ofFloat.start();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f26739v;
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
        this.f26739v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.goodthingsTitle));
            ((ConstraintLayout) _$_findCachedViewById(R.id.a1parent)).setBackgroundResource(R.color.pastel_blue);
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
            int i6 = ((DepressionGoodthingsActivity) activity).f10364w;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
                        RobertoTextView header = (RobertoTextView) _$_findCachedViewById(R.id.header);
                        kotlin.jvm.internal.i.f(header, "header");
                        insetsUtils.addStatusBarHeight(header);
                        ((AppCompatImageView) _$_findCachedViewById(R.id.bottomImage)).setImageResource(R.drawable.ir_3goodthings_box3);
                        ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setVisibility(8);
                        J();
                        ((RobertoTextView) _$_findCachedViewById(R.id.subheader)).setText(getString(R.string.goodthingsIntro3));
                    }
                } else {
                    ((RobertoButton) _$_findCachedViewById(R.id.startCTA)).setVisibility(8);
                    ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setVisibility(0);
                    InsetsUtils insetsUtils2 = InsetsUtils.INSTANCE;
                    RobertoTextView header2 = (RobertoTextView) _$_findCachedViewById(R.id.header);
                    kotlin.jvm.internal.i.f(header2, "header");
                    insetsUtils2.addStatusBarHeight(header2);
                    ((AppCompatImageView) _$_findCachedViewById(R.id.bottomImage)).setImageResource(R.drawable.ir_3goodthings_box2);
                    ((ConstraintLayout) _$_findCachedViewById(R.id.a1parent)).setOnClickListener(new i(this, 1));
                    ((RobertoTextView) _$_findCachedViewById(R.id.subheader)).setText(getString(R.string.goodthingsIntro2));
                }
            } else {
                ((RobertoButton) _$_findCachedViewById(R.id.startCTA)).setVisibility(8);
                ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setVisibility(0);
                InsetsUtils insetsUtils3 = InsetsUtils.INSTANCE;
                RobertoTextView header3 = (RobertoTextView) _$_findCachedViewById(R.id.header);
                kotlin.jvm.internal.i.f(header3, "header");
                insetsUtils3.addStatusBarHeight(header3);
                ((AppCompatImageView) _$_findCachedViewById(R.id.bottomImage)).setImageResource(R.drawable.ir_3goodthings_box1);
                ((ConstraintLayout) _$_findCachedViewById(R.id.a1parent)).setOnClickListener(new i(this, 0));
                ((RobertoTextView) _$_findCachedViewById(R.id.subheader)).setText(getString(R.string.goodthingsIntro1));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26738u, e10);
        }
    }
}
