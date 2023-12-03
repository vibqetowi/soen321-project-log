package oq;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionHopeActivity;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionHopeSayFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loq/q;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class q extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f27761x = 0;

    /* renamed from: v  reason: collision with root package name */
    public int f27763v;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f27764w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f27762u = LogHelper.INSTANCE.makeLogTag(q.class);

    public final void J(String str, String str2, String str3, String str4) {
        ((RobertoTextView) _$_findCachedViewById(R.id.a23Message)).setText(str3);
        ((RobertoTextView) _$_findCachedViewById(R.id.a23Title)).setText(str);
        ((RobertoTextView) _$_findCachedViewById(R.id.a23Subtitle)).setText(str2);
        ((RobertoTextView) _$_findCachedViewById(R.id.a23CTA)).setText(str4);
        ((ConstraintLayout) _$_findCachedViewById(R.id.a23parent)).setOnClickListener(new View.OnClickListener(this) { // from class: oq.p

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ q f27760v;

            {
                this.f27760v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r2;
                q this$0 = this.f27760v;
                switch (i6) {
                    case 0:
                        int i10 = q.f27761x;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.f27763v++;
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.a23CountText)).setText(String.valueOf(this$0.f27763v));
                        RobertoTextView a23CountText = (RobertoTextView) this$0._$_findCachedViewById(R.id.a23CountText);
                        kotlin.jvm.internal.i.f(a23CountText, "a23CountText");
                        try {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(a23CountText, "alpha", 0.5f, 0.0f);
                            ofFloat.setDuration(300L);
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(a23CountText, "alpha", 0.0f, 0.5f);
                            ofFloat2.setDuration(300L);
                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(a23CountText, "scaleX", 0.8f, 1.2f);
                            ofFloat3.setDuration(300L);
                            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(a23CountText, "scaleY", 0.8f, 1.2f);
                            ofFloat4.setDuration(300L);
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(ofFloat).after(ofFloat2);
                            animatorSet.playTogether(ofFloat2, ofFloat3, ofFloat4);
                            animatorSet.start();
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f27762u, "Error in animating counter", e10);
                        }
                        if (this$0.f27763v == 3) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.a23CTA)).setVisibility(8);
                            ((RobertoButton) this$0._$_findCachedViewById(R.id.a23btnNext)).setVisibility(0);
                            ((ConstraintLayout) this$0._$_findCachedViewById(R.id.a23parent)).setOnClickListener(null);
                            return;
                        }
                        return;
                    default:
                        int i11 = q.f27761x;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionHopeActivity");
                        ((DepressionHopeActivity) activity).t0();
                        return;
                }
            }
        });
        ((RobertoButton) _$_findCachedViewById(R.id.a23btnNext)).setOnClickListener(new View.OnClickListener(this) { // from class: oq.p

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ q f27760v;

            {
                this.f27760v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r2;
                q this$0 = this.f27760v;
                switch (i6) {
                    case 0:
                        int i10 = q.f27761x;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.f27763v++;
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.a23CountText)).setText(String.valueOf(this$0.f27763v));
                        RobertoTextView a23CountText = (RobertoTextView) this$0._$_findCachedViewById(R.id.a23CountText);
                        kotlin.jvm.internal.i.f(a23CountText, "a23CountText");
                        try {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(a23CountText, "alpha", 0.5f, 0.0f);
                            ofFloat.setDuration(300L);
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(a23CountText, "alpha", 0.0f, 0.5f);
                            ofFloat2.setDuration(300L);
                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(a23CountText, "scaleX", 0.8f, 1.2f);
                            ofFloat3.setDuration(300L);
                            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(a23CountText, "scaleY", 0.8f, 1.2f);
                            ofFloat4.setDuration(300L);
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(ofFloat).after(ofFloat2);
                            animatorSet.playTogether(ofFloat2, ofFloat3, ofFloat4);
                            animatorSet.start();
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f27762u, "Error in animating counter", e10);
                        }
                        if (this$0.f27763v == 3) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.a23CTA)).setVisibility(8);
                            ((RobertoButton) this$0._$_findCachedViewById(R.id.a23btnNext)).setVisibility(0);
                            ((ConstraintLayout) this$0._$_findCachedViewById(R.id.a23parent)).setOnClickListener(null);
                            return;
                        }
                        return;
                    default:
                        int i11 = q.f27761x;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionHopeActivity");
                        ((DepressionHopeActivity) activity).t0();
                        return;
                }
            }
        });
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f27764w;
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
        return inflater.inflate(R.layout.fragment_screen_a23, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f27764w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            RobertoTextView a23Title = (RobertoTextView) _$_findCachedViewById(R.id.a23Title);
            kotlin.jvm.internal.i.f(a23Title, "a23Title");
            insetsUtils.addStatusBarHeight(a23Title);
            int i6 = requireArguments().getInt("Say");
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3) {
                        String string = getString(R.string.depressionHopeAffirmations3Head);
                        kotlin.jvm.internal.i.f(string, "getString(R.string.depre…ionHopeAffirmations3Head)");
                        String string2 = getString(R.string.depressionHopeAffirmations3SubHead);
                        kotlin.jvm.internal.i.f(string2, "getString(R.string.depre…HopeAffirmations3SubHead)");
                        String string3 = getString(R.string.depressionHopeAffirmations3Message);
                        kotlin.jvm.internal.i.f(string3, "getString(R.string.depre…HopeAffirmations3Message)");
                        String string4 = getString(R.string.depressionHopeAffirmations3SecondaryCTA);
                        kotlin.jvm.internal.i.f(string4, "getString(R.string.depre…ffirmations3SecondaryCTA)");
                        J(string, string2, string3, string4);
                    }
                } else {
                    String string5 = getString(R.string.depressionHopeAffirmations2Head);
                    kotlin.jvm.internal.i.f(string5, "getString(R.string.depre…ionHopeAffirmations2Head)");
                    String string6 = getString(R.string.depressionHopeAffirmations2SubHead);
                    kotlin.jvm.internal.i.f(string6, "getString(R.string.depre…HopeAffirmations2SubHead)");
                    String string7 = getString(R.string.depressionHopeAffirmations2Message);
                    kotlin.jvm.internal.i.f(string7, "getString(R.string.depre…HopeAffirmations2Message)");
                    String string8 = getString(R.string.depressionHopeAffirmations2SecondaryCTA);
                    kotlin.jvm.internal.i.f(string8, "getString(R.string.depre…ffirmations2SecondaryCTA)");
                    J(string5, string6, string7, string8);
                }
            } else {
                String string9 = getString(R.string.depressionHopeAffirmations1Head);
                kotlin.jvm.internal.i.f(string9, "getString(R.string.depre…ionHopeAffirmations1Head)");
                String string10 = getString(R.string.depressionHopeAffirmations1SubHead);
                kotlin.jvm.internal.i.f(string10, "getString(R.string.depre…HopeAffirmations1SubHead)");
                String string11 = getString(R.string.depressionHopeAffirmations1Message);
                kotlin.jvm.internal.i.f(string11, "getString(R.string.depre…HopeAffirmations1Message)");
                String string12 = getString(R.string.depressionHopeAffirmations1SecondaryCTAText);
                kotlin.jvm.internal.i.f(string12, "getString(R.string.depre…mations1SecondaryCTAText)");
                J(string9, string10, string11, string12);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f27762u, e10);
        }
    }
}
