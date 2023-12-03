package qq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionPleasurableActivity;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionPleasurableSeparatorFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqq/a0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a0 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f30009w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f30011v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f30010u = LogHelper.INSTANCE.makeLogTag(a0.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f30011v;
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
        return inflater.inflate(R.layout.fragment_screen_a2, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f30011v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            RobertoTextView a2header = (RobertoTextView) _$_findCachedViewById(R.id.a2header);
            kotlin.jvm.internal.i.f(a2header, "a2header");
            insetsUtils.addStatusBarHeight(a2header);
            ((ConstraintLayout) _$_findCachedViewById(R.id.a2parent)).setOnClickListener(new n(this, 4));
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
            int i6 = ((DepressionPleasurableActivity) activity).f10376w;
            if (i6 != 3) {
                if (i6 != 12) {
                    if (i6 == 15) {
                        androidx.fragment.app.p activity2 = getActivity();
                        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                        if (((DepressionPleasurableActivity) activity2).F) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setVisibility(0);
                            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setVisibility(8);
                            ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
                            ((RobertoTextView) _$_findCachedViewById(R.id.a2header)).setText(getString(R.string.depressionPleasurableAudioCompletion));
                            androidx.fragment.app.p activity3 = getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                            String string = getString(R.string.depressionPleasurableAudioIntroHeader);
                            kotlin.jvm.internal.i.f(string, "getString(R.string.depre…asurableAudioIntroHeader)");
                            ((DepressionPleasurableActivity) activity3).C = string;
                        } else {
                            ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setVisibility(0);
                            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setVisibility(8);
                            ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
                            ((RobertoTextView) _$_findCachedViewById(R.id.a2header)).setText(getString(R.string.depressionPleasurableLetterCompletion));
                            androidx.fragment.app.p activity4 = getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                            String string2 = getString(R.string.depressionPleasurableLetterHeader);
                            kotlin.jvm.internal.i.f(string2, "getString(R.string.depre…nPleasurableLetterHeader)");
                            ((DepressionPleasurableActivity) activity4).C = string2;
                        }
                        androidx.fragment.app.p activity5 = getActivity();
                        kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                        ((DepressionPleasurableActivity) activity5).E = true;
                        androidx.fragment.app.p activity6 = getActivity();
                        kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                        DepressionPleasurableActivity depressionPleasurableActivity = (DepressionPleasurableActivity) activity6;
                        depressionPleasurableActivity.f10376w -= 2;
                        return;
                    }
                    return;
                }
                ((RobertoTextView) _$_findCachedViewById(R.id.a2header)).setText(getString(R.string.depressionPleasurableAffirmationHeader3));
                ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setVisibility(0);
                ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setVisibility(8);
                ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
                androidx.fragment.app.p activity7 = getActivity();
                kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                if (((DepressionPleasurableActivity) activity7).B.size() == 1) {
                    androidx.fragment.app.p activity8 = getActivity();
                    kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                    ((DepressionPleasurableActivity) activity8).f10376w++;
                    androidx.fragment.app.p activity9 = getActivity();
                    kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                    androidx.fragment.app.p activity10 = getActivity();
                    kotlin.jvm.internal.i.e(activity10, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                    String str = ((DepressionPleasurableActivity) activity10).B.get(0);
                    kotlin.jvm.internal.i.f(str, "(activity as DepressionP…Activity).userSchedule[0]");
                    ((DepressionPleasurableActivity) activity9).C = str;
                    return;
                }
                return;
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.a2header)).setText(getString(R.string.depressionPleasurableBegin));
            ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setVisibility(0);
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30010u, e10);
        }
    }
}
