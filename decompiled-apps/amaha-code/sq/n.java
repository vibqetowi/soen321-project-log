package sq;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionTimeoutActivity;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionTimeoutSeparatorPromptFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsq/n;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class n extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f31900w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f31902v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f31901u = LogHelper.INSTANCE.makeLogTag(n.class);

    public final void J() {
        ((RobertoTextView) _$_findCachedViewById(R.id.a4BottomCTA)).setVisibility(8);
        ((RobertoButton) _$_findCachedViewById(R.id.a4ButtonCTA)).setVisibility(0);
        ((RobertoButton) _$_findCachedViewById(R.id.a4ButtonCTA)).setText(getString(R.string.depressionTimeoutSeperatorPrompt3CTA));
        ((ConstraintLayout) _$_findCachedViewById(R.id.a4Parent)).setOnClickListener(null);
        ((RobertoButton) _$_findCachedViewById(R.id.a4ButtonCTA)).setAlpha(0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((RobertoButton) _$_findCachedViewById(R.id.a4ButtonCTA), "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setStartDelay(500L);
        ofFloat.addListener(new m(this));
        ofFloat.start();
    }

    public final void K() {
        ((RobertoTextView) _$_findCachedViewById(R.id.a4BottomCTA)).setVisibility(0);
        ((RobertoButton) _$_findCachedViewById(R.id.a4ButtonCTA)).setVisibility(8);
        ((ConstraintLayout) _$_findCachedViewById(R.id.a4Parent)).setOnClickListener(new l(this, 2));
        ((RobertoButton) _$_findCachedViewById(R.id.a4ButtonCTA)).setOnClickListener(null);
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f31902v;
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
        return inflater.inflate(R.layout.fragment_screen_a4, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f31902v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            Bundle arguments = getArguments();
            kotlin.jvm.internal.i.d(arguments);
            int i6 = arguments.getInt("prompt");
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3) {
                        J();
                        ((AppCompatImageView) _$_findCachedViewById(R.id.a4Image)).setVisibility(0);
                        ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(0);
                        ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setText(getString(R.string.depressionTimeoutSeperatorPrompt3PromptText));
                        ((AppCompatImageView) _$_findCachedViewById(R.id.a4Image)).setImageResource(R.drawable.ic_a14_mastery_star);
                        ((RobertoTextView) _$_findCachedViewById(R.id.a4Title)).setText(getString(R.string.depressionTimeoutSeperatorPrompt3Head));
                        ((RobertoTextView) _$_findCachedViewById(R.id.a4description)).setText(getString(R.string.depressionTimeoutSeperatorPrompt3SubHead));
                    }
                } else {
                    K();
                    ((AppCompatImageView) _$_findCachedViewById(R.id.a4Image)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
                    ((AppCompatImageView) _$_findCachedViewById(R.id.a4Image)).setImageResource(R.drawable.ic_a14_mastery_star);
                    ((RobertoTextView) _$_findCachedViewById(R.id.a4Title)).setText(getString(R.string.depressionTimeoutSeperatorPrompt2Head));
                    ((RobertoTextView) _$_findCachedViewById(R.id.a4description)).setText(getString(R.string.depressionTimeoutSeperatorPrompt2SubHead));
                }
            } else {
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionTimeoutActivity");
                if (((DepressionTimeoutActivity) activity).A) {
                    K();
                    ((AppCompatImageView) _$_findCachedViewById(R.id.a4Image)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
                    ((AppCompatImageView) _$_findCachedViewById(R.id.a4Image)).setImageResource(R.drawable.ic_a14_mastery_star);
                    ((RobertoTextView) _$_findCachedViewById(R.id.a4Title)).setText(getString(R.string.depressionTimeoutNeutralTitle));
                    ((RobertoTextView) _$_findCachedViewById(R.id.a4description)).setText(getString(R.string.depressionTimeoutNeutralDescription));
                    ((RobertoTextView) _$_findCachedViewById(R.id.a4BottomCTA)).setText(getString(R.string.depressionHopeTapDone2));
                } else {
                    K();
                    ((AppCompatImageView) _$_findCachedViewById(R.id.a4Image)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
                    ((AppCompatImageView) _$_findCachedViewById(R.id.a4Image)).setImageResource(R.drawable.ic_a14_mastery_star);
                    ((RobertoTextView) _$_findCachedViewById(R.id.a4Title)).setText(getString(R.string.depressionTimeoutSeperatorPrompt1Head));
                    ((RobertoTextView) _$_findCachedViewById(R.id.a4description)).setText(getString(R.string.depressionTimeoutSeperatorPrompt1SubHead));
                    ((RobertoTextView) _$_findCachedViewById(R.id.a4BottomCTA)).setText(getString(R.string.depressionHopeTapDone2));
                }
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setPaintFlags(((RobertoTextView) _$_findCachedViewById(R.id.prompt)).getPaintFlags() | 8);
            ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setOnClickListener(new l(this, 0));
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            AppCompatImageView a4Image = (AppCompatImageView) _$_findCachedViewById(R.id.a4Image);
            kotlin.jvm.internal.i.f(a4Image, "a4Image");
            insetsUtils.addStatusBarHeight(a4Image);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f31901u, e10);
        }
    }
}
