package mq;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionExerciseActivity;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionExerciseInfoFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmq/g;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class g extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f25685w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f25687v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f25686u = LogHelper.INSTANCE.makeLogTag(g.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f25687v;
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
        return inflater.inflate(R.layout.fragment_screen_a31, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f25687v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            RobertoTextView a31Title = (RobertoTextView) _$_findCachedViewById(R.id.a31Title);
            kotlin.jvm.internal.i.f(a31Title, "a31Title");
            insetsUtils.addStatusBarHeight(a31Title);
            ((RobertoTextView) _$_findCachedViewById(R.id.a31Title)).setText(getString(R.string.depressionExercisesExerciseInfoHead));
            ((RobertoTextView) _$_findCachedViewById(R.id.a31Subtitle)).setText(getString(R.string.depressionExercisesExerciseInfoSubHead));
            ((AppCompatImageView) _$_findCachedViewById(R.id.a31Image1)).setImageResource(R.drawable.ic_exercise_warm_up);
            ((AppCompatImageView) _$_findCachedViewById(R.id.a31Image2)).setImageResource(R.drawable.ic_exercise_moderate);
            ((AppCompatImageView) _$_findCachedViewById(R.id.a31Image3)).setImageResource(R.drawable.ic_exercise_cool_down);
            ((RobertoTextView) _$_findCachedViewById(R.id.a31Text1)).setText(getString(R.string.depressionExercisesExerciseInfoOption1));
            ((RobertoTextView) _$_findCachedViewById(R.id.a31Text2)).setText(getString(R.string.depressionExercisesExerciseInfoOption2));
            ((RobertoTextView) _$_findCachedViewById(R.id.a31Text3)).setText(getString(R.string.depressionExercisesExerciseInfoOption3));
            ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setPaintFlags(((RobertoTextView) _$_findCachedViewById(R.id.prompt)).getPaintFlags() | 8);
            ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setText(getString(R.string.depressionExercisesExerciseInfoPopUp));
            ((RobertoButton) _$_findCachedViewById(R.id.a31ButtonCTA)).setText(getString(R.string.depressionExercisesExerciseInfoCTA));
            ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setOnClickListener(new View.OnClickListener(this) { // from class: mq.f

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ g f25684v;

                {
                    this.f25684v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    g this$0 = this.f25684v;
                    switch (i6) {
                        case 0:
                            int i10 = g.f25685w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.popup_screen_p1, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                            Window window = styledDialog.getWindow();
                            if (window != null) {
                                window.setLayout(-1, -1);
                            }
                            ((RobertoTextView) styledDialog.findViewById(R.id.header)).setText(this$0.getString(R.string.depressionExercisesExerciseInfoPopUpHead));
                            ((RobertoTextView) styledDialog.findViewById(R.id.body)).setText(this$0.getString(R.string.depressionExercisesExerciseInfoPopUpBody));
                            ((AppCompatImageView) styledDialog.findViewById(R.id.btnBack)).setOnClickListener(new lm.f(styledDialog, 28));
                            styledDialog.show();
                            return;
                        default:
                            int i11 = g.f25685w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                            ((DepressionExerciseActivity) activity).t0();
                            return;
                    }
                }
            });
            ((RobertoButton) _$_findCachedViewById(R.id.a31ButtonCTA)).setOnClickListener(new View.OnClickListener(this) { // from class: mq.f

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ g f25684v;

                {
                    this.f25684v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    g this$0 = this.f25684v;
                    switch (i6) {
                        case 0:
                            int i10 = g.f25685w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.popup_screen_p1, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                            Window window = styledDialog.getWindow();
                            if (window != null) {
                                window.setLayout(-1, -1);
                            }
                            ((RobertoTextView) styledDialog.findViewById(R.id.header)).setText(this$0.getString(R.string.depressionExercisesExerciseInfoPopUpHead));
                            ((RobertoTextView) styledDialog.findViewById(R.id.body)).setText(this$0.getString(R.string.depressionExercisesExerciseInfoPopUpBody));
                            ((AppCompatImageView) styledDialog.findViewById(R.id.btnBack)).setOnClickListener(new lm.f(styledDialog, 28));
                            styledDialog.show();
                            return;
                        default:
                            int i11 = g.f25685w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                            ((DepressionExerciseActivity) activity).t0();
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f25686u, e10);
        }
    }
}
