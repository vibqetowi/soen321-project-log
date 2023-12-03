package oq;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionHopePart1Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loq/j;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class j extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f27736x = 0;

    /* renamed from: u  reason: collision with root package name */
    public int f27737u;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f27739w = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f27738v = LogHelper.INSTANCE.makeLogTag(j.class);

    public final void J() {
        ((RobertoTextView) _$_findCachedViewById(R.id.a4BottomCTA)).setVisibility(8);
        ((RobertoButton) _$_findCachedViewById(R.id.a4ButtonCTA)).setVisibility(0);
        ((RobertoButton) _$_findCachedViewById(R.id.a4ButtonCTA)).setText(getString(R.string.depressionHopePart1CTA));
        ((RobertoButton) _$_findCachedViewById(R.id.a4ButtonCTA)).setAlpha(0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((RobertoButton) _$_findCachedViewById(R.id.a4ButtonCTA), "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setStartDelay(1000L);
        ofFloat.addListener(new i(this));
        ofFloat.start();
        ((ConstraintLayout) _$_findCachedViewById(R.id.a4Parent)).setOnClickListener(null);
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f27739w;
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
        this.f27739w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            Bundle arguments = getArguments();
            kotlin.jvm.internal.i.d(arguments);
            this.f27737u = arguments.getInt("Part1");
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            AppCompatImageView a4Image = (AppCompatImageView) _$_findCachedViewById(R.id.a4Image);
            kotlin.jvm.internal.i.f(a4Image, "a4Image");
            insetsUtils.addStatusBarHeight(a4Image);
            int i6 = this.f27737u;
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 == 4) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.a4Title)).setText(getString(R.string.depressionHopePart1Head4));
                            ((RobertoTextView) _$_findCachedViewById(R.id.a4description)).setText(getString(R.string.depressionHopePart1SubHead4));
                            ((AppCompatImageView) _$_findCachedViewById(R.id.a4Image)).setImageResource(R.drawable.ic_onboarding_positive_qualities_icon);
                            ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
                            ((RobertoTextView) _$_findCachedViewById(R.id.a4BottomCTA)).setText(getString(R.string.depressionHopeTap));
                            J();
                        }
                    } else {
                        ((RobertoTextView) _$_findCachedViewById(R.id.a4BottomCTA)).setVisibility(0);
                        ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
                        ((RobertoTextView) _$_findCachedViewById(R.id.a4BottomCTA)).setText(getString(R.string.depressionHopeTap));
                        ((RobertoTextView) _$_findCachedViewById(R.id.a4Title)).setText(getString(R.string.depressionHopePart1Head3));
                        ((RobertoTextView) _$_findCachedViewById(R.id.a4description)).setText(getString(R.string.depressionHopePart1SubHead3));
                        ((AppCompatImageView) _$_findCachedViewById(R.id.a4Image)).setImageResource(R.drawable.ic_a14_mastery_star);
                        ((ConstraintLayout) _$_findCachedViewById(R.id.a4Parent)).setOnClickListener(new h(this, 2));
                    }
                } else {
                    ((RobertoTextView) _$_findCachedViewById(R.id.a4BottomCTA)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.a4BottomCTA)).setText(getString(R.string.depressionHopeTap));
                    ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
                    ((RobertoTextView) _$_findCachedViewById(R.id.a4Title)).setText(getString(R.string.depressionHopePart1Head2, FirebasePersistence.getInstance().getUser().getFirstName()));
                    ((RobertoTextView) _$_findCachedViewById(R.id.a4description)).setText(getString(R.string.depressionHopePart1SubHead2));
                    ((AppCompatImageView) _$_findCachedViewById(R.id.a4Image)).setImageResource(R.drawable.ic_a14_mastery_star);
                    ((ConstraintLayout) _$_findCachedViewById(R.id.a4Parent)).setOnClickListener(new h(this, 1));
                }
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.a4BottomCTA)).setVisibility(0);
                ((RobertoTextView) _$_findCachedViewById(R.id.a4BottomCTA)).setText(getString(R.string.depressionHopeTap));
                ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
                ((RobertoTextView) _$_findCachedViewById(R.id.a4Title)).setText(getString(R.string.depressionHopePart1Head1));
                ((RobertoTextView) _$_findCachedViewById(R.id.a4description)).setText(getString(R.string.depressionHopePart1SubHead1));
                ((AppCompatImageView) _$_findCachedViewById(R.id.a4Image)).setImageResource(R.drawable.ic_hope_pathways);
                ((ConstraintLayout) _$_findCachedViewById(R.id.a4Parent)).setOnClickListener(new h(this, 0));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f27738v, e10);
        }
    }
}
