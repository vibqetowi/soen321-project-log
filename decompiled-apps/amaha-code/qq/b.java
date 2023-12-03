package qq;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionPleasurableActivity;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionPleasurableActintroFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqq/b;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f30012w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f30014v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f30013u = LogHelper.INSTANCE.makeLogTag(b.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f30014v;
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
        return inflater.inflate(R.layout.fragment_screen_a16, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f30014v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            ScrollView onboardingIntroFragmentScrollView = (ScrollView) _$_findCachedViewById(R.id.onboardingIntroFragmentScrollView);
            kotlin.jvm.internal.i.f(onboardingIntroFragmentScrollView, "onboardingIntroFragmentScrollView");
            insetsUtils.addStatusBarHeight(onboardingIntroFragmentScrollView);
            ((RobertoTextView) _$_findCachedViewById(R.id.whyDo)).setPaintFlags(((RobertoTextView) _$_findCachedViewById(R.id.whyDo)).getPaintFlags() | 8);
            ((RobertoTextView) _$_findCachedViewById(R.id.whyDo)).setText(getString(R.string.depressionPleasurableWhydo));
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setText(getString(R.string.initial_assessment_activity_btn));
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
            if (((DepressionPleasurableActivity) activity).F) {
                ((RobertoTextView) _$_findCachedViewById(R.id.onboardingIntroTitle)).setText(getString(R.string.depressionPleasurableAudioIntroPre));
                ((RobertoTextView) _$_findCachedViewById(R.id.onboardingActivityTitle)).setText(getString(R.string.depressionPleasurableAudioIntroHeader));
                ((RobertoTextView) _$_findCachedViewById(R.id.onboardingActivityDesc)).setText(getString(R.string.depressionPleasurableAudioIntroText));
                ((RobertoTextView) _$_findCachedViewById(R.id.onboardingActivityTip)).setText(getString(R.string.depressionPleasurableAudioIntroTip));
                ((AppCompatImageView) _$_findCachedViewById(R.id.onboardingActivityImage)).setImageResource(R.drawable.ir_pleasurable_breathingscenery);
                ((AppCompatImageView) _$_findCachedViewById(R.id.circleImage)).setImageResource(R.drawable.ic_headphone_tip);
                ((RobertoTextView) _$_findCachedViewById(R.id.whyDo)).setOnClickListener(new View.OnClickListener(this) { // from class: qq.a

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ b f30008v;

                    {
                        this.f30008v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i6 = r2;
                        b this$0 = this.f30008v;
                        switch (i6) {
                            case 0:
                                int i10 = b.f30012w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_onboarding_intro_popup, this$0.getActivity(), R.style.Theme_Dialog);
                                Window window = styledDialog.getWindow();
                                kotlin.jvm.internal.i.d(window);
                                window.getAttributes().windowAnimations = R.style.DialogGrowInAndShrinkOut;
                                ((AppCompatImageView) styledDialog.findViewById(R.id.dialogImage)).setImageResource(R.drawable.ir_pleasurable_breathingscenery);
                                ((RobertoTextView) styledDialog.findViewById(R.id.onboardingPopupTitle)).setText(this$0.getString(R.string.depressionPleasurableWhydoAudioHeader));
                                ((RobertoTextView) styledDialog.findViewById(R.id.onboardingPopupSubTitle)).setText(this$0.getString(R.string.depressionPleasurableWhydoAudioText));
                                ((RobertoTextView) styledDialog.findViewById(R.id.popupCTA)).setText(this$0.getString(R.string.introActivitySleepPopupCTA));
                                styledDialog.show();
                                ((RobertoTextView) styledDialog.findViewById(R.id.popupCTA)).setOnClickListener(new nq.n(styledDialog, 8));
                                return;
                            case 1:
                                int i11 = b.f30012w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Dialog styledDialog2 = UiUtils.Companion.getStyledDialog(R.layout.dialog_onboarding_intro_popup, this$0.getActivity(), R.style.Theme_Dialog);
                                Window window2 = styledDialog2.getWindow();
                                kotlin.jvm.internal.i.d(window2);
                                window2.getAttributes().windowAnimations = R.style.DialogGrowInAndShrinkOut;
                                ((AppCompatImageView) styledDialog2.findViewById(R.id.dialogImage)).setImageResource(R.drawable.ir_pleasurable_letter);
                                ((RobertoTextView) styledDialog2.findViewById(R.id.onboardingPopupTitle)).setText(this$0.getString(R.string.depressionPleasurableWhydoLetterHeader));
                                ((RobertoTextView) styledDialog2.findViewById(R.id.onboardingPopupSubTitle)).setText(this$0.getString(R.string.depressionPleasurableWhydoLetterText));
                                ((RobertoTextView) styledDialog2.findViewById(R.id.popupCTA)).setText(this$0.getString(R.string.introActivitySleepPopupCTA));
                                styledDialog2.show();
                                ((RobertoTextView) styledDialog2.findViewById(R.id.popupCTA)).setOnClickListener(new nq.n(styledDialog2, 7));
                                return;
                            default:
                                int i12 = b.f30012w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.fragment.app.p activity2 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                                ((DepressionPleasurableActivity) activity2).t0();
                                return;
                        }
                    }
                });
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.onboardingIntroTitle)).setText(getString(R.string.depressionPleasurableLetterIntroPre));
                ((RobertoTextView) _$_findCachedViewById(R.id.onboardingActivityTitle)).setText(getString(R.string.depressionPleasurableLetterIntroHeader));
                ((RobertoTextView) _$_findCachedViewById(R.id.onboardingActivityDesc)).setText(getString(R.string.depressionPleasurableLetterIntroText));
                ((RobertoTextView) _$_findCachedViewById(R.id.onboardingActivityTip)).setText(getString(R.string.depressionPleasurableLetterIntroTip));
                ((AppCompatImageView) _$_findCachedViewById(R.id.circleImage)).setImageResource(R.drawable.ic_pleasurable_letter);
                ((AppCompatImageView) _$_findCachedViewById(R.id.onboardingActivityImage)).setImageResource(R.drawable.ir_pleasurable_letter);
                ((RobertoTextView) _$_findCachedViewById(R.id.whyDo)).setOnClickListener(new View.OnClickListener(this) { // from class: qq.a

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ b f30008v;

                    {
                        this.f30008v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i6 = r2;
                        b this$0 = this.f30008v;
                        switch (i6) {
                            case 0:
                                int i10 = b.f30012w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_onboarding_intro_popup, this$0.getActivity(), R.style.Theme_Dialog);
                                Window window = styledDialog.getWindow();
                                kotlin.jvm.internal.i.d(window);
                                window.getAttributes().windowAnimations = R.style.DialogGrowInAndShrinkOut;
                                ((AppCompatImageView) styledDialog.findViewById(R.id.dialogImage)).setImageResource(R.drawable.ir_pleasurable_breathingscenery);
                                ((RobertoTextView) styledDialog.findViewById(R.id.onboardingPopupTitle)).setText(this$0.getString(R.string.depressionPleasurableWhydoAudioHeader));
                                ((RobertoTextView) styledDialog.findViewById(R.id.onboardingPopupSubTitle)).setText(this$0.getString(R.string.depressionPleasurableWhydoAudioText));
                                ((RobertoTextView) styledDialog.findViewById(R.id.popupCTA)).setText(this$0.getString(R.string.introActivitySleepPopupCTA));
                                styledDialog.show();
                                ((RobertoTextView) styledDialog.findViewById(R.id.popupCTA)).setOnClickListener(new nq.n(styledDialog, 8));
                                return;
                            case 1:
                                int i11 = b.f30012w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Dialog styledDialog2 = UiUtils.Companion.getStyledDialog(R.layout.dialog_onboarding_intro_popup, this$0.getActivity(), R.style.Theme_Dialog);
                                Window window2 = styledDialog2.getWindow();
                                kotlin.jvm.internal.i.d(window2);
                                window2.getAttributes().windowAnimations = R.style.DialogGrowInAndShrinkOut;
                                ((AppCompatImageView) styledDialog2.findViewById(R.id.dialogImage)).setImageResource(R.drawable.ir_pleasurable_letter);
                                ((RobertoTextView) styledDialog2.findViewById(R.id.onboardingPopupTitle)).setText(this$0.getString(R.string.depressionPleasurableWhydoLetterHeader));
                                ((RobertoTextView) styledDialog2.findViewById(R.id.onboardingPopupSubTitle)).setText(this$0.getString(R.string.depressionPleasurableWhydoLetterText));
                                ((RobertoTextView) styledDialog2.findViewById(R.id.popupCTA)).setText(this$0.getString(R.string.introActivitySleepPopupCTA));
                                styledDialog2.show();
                                ((RobertoTextView) styledDialog2.findViewById(R.id.popupCTA)).setOnClickListener(new nq.n(styledDialog2, 7));
                                return;
                            default:
                                int i12 = b.f30012w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.fragment.app.p activity2 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                                ((DepressionPleasurableActivity) activity2).t0();
                                return;
                        }
                    }
                });
            }
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setOnClickListener(new View.OnClickListener(this) { // from class: qq.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ b f30008v;

                {
                    this.f30008v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    b this$0 = this.f30008v;
                    switch (i6) {
                        case 0:
                            int i10 = b.f30012w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_onboarding_intro_popup, this$0.getActivity(), R.style.Theme_Dialog);
                            Window window = styledDialog.getWindow();
                            kotlin.jvm.internal.i.d(window);
                            window.getAttributes().windowAnimations = R.style.DialogGrowInAndShrinkOut;
                            ((AppCompatImageView) styledDialog.findViewById(R.id.dialogImage)).setImageResource(R.drawable.ir_pleasurable_breathingscenery);
                            ((RobertoTextView) styledDialog.findViewById(R.id.onboardingPopupTitle)).setText(this$0.getString(R.string.depressionPleasurableWhydoAudioHeader));
                            ((RobertoTextView) styledDialog.findViewById(R.id.onboardingPopupSubTitle)).setText(this$0.getString(R.string.depressionPleasurableWhydoAudioText));
                            ((RobertoTextView) styledDialog.findViewById(R.id.popupCTA)).setText(this$0.getString(R.string.introActivitySleepPopupCTA));
                            styledDialog.show();
                            ((RobertoTextView) styledDialog.findViewById(R.id.popupCTA)).setOnClickListener(new nq.n(styledDialog, 8));
                            return;
                        case 1:
                            int i11 = b.f30012w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Dialog styledDialog2 = UiUtils.Companion.getStyledDialog(R.layout.dialog_onboarding_intro_popup, this$0.getActivity(), R.style.Theme_Dialog);
                            Window window2 = styledDialog2.getWindow();
                            kotlin.jvm.internal.i.d(window2);
                            window2.getAttributes().windowAnimations = R.style.DialogGrowInAndShrinkOut;
                            ((AppCompatImageView) styledDialog2.findViewById(R.id.dialogImage)).setImageResource(R.drawable.ir_pleasurable_letter);
                            ((RobertoTextView) styledDialog2.findViewById(R.id.onboardingPopupTitle)).setText(this$0.getString(R.string.depressionPleasurableWhydoLetterHeader));
                            ((RobertoTextView) styledDialog2.findViewById(R.id.onboardingPopupSubTitle)).setText(this$0.getString(R.string.depressionPleasurableWhydoLetterText));
                            ((RobertoTextView) styledDialog2.findViewById(R.id.popupCTA)).setText(this$0.getString(R.string.introActivitySleepPopupCTA));
                            styledDialog2.show();
                            ((RobertoTextView) styledDialog2.findViewById(R.id.popupCTA)).setOnClickListener(new nq.n(styledDialog2, 7));
                            return;
                        default:
                            int i12 = b.f30012w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                            ((DepressionPleasurableActivity) activity2).t0();
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30013u, e10);
        }
    }
}
