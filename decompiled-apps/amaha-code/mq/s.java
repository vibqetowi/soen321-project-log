package mq;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ScrollView;
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
/* compiled from: DepressionExerciseSetFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmq/s;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class s extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f25721w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f25723v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f25722u = LogHelper.INSTANCE.makeLogTag(s.class);

    public final void J(String[] strArr, String[] strArr2) {
        int length = strArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            View inflate = getLayoutInflater().inflate(R.layout.row_screen_a10, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)), false);
            ((RobertoTextView) inflate.findViewById(R.id.rowContent)).setText(strArr[i6]);
            ((RobertoTextView) inflate.findViewById(R.id.rowTime)).setVisibility(0);
            ((RobertoTextView) inflate.findViewById(R.id.rowTime)).setText(strArr2[i6]);
            ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)).addView(inflate);
        }
    }

    public final void K(int i6) {
        Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.popup_screen_p1, getActivity(), R.style.Theme_Dialog_Fullscreen);
        Window window = styledDialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        if (i6 != 1) {
            if (i6 != 3) {
                switch (i6) {
                    case 10:
                        ((RobertoTextView) styledDialog.findViewById(R.id.header)).setText(getString(R.string.depressionExercisesBeginnerPopupTitle));
                        ((RobertoTextView) styledDialog.findViewById(R.id.body)).setText(getString(R.string.depressionExercisesBeginnerPopupBody));
                        break;
                    case 11:
                        ((RobertoTextView) styledDialog.findViewById(R.id.header)).setText(getString(R.string.depressionExercisesModeratePopUpTitle));
                        ((RobertoTextView) styledDialog.findViewById(R.id.body)).setText(getString(R.string.depressionExercisesModeratePopUpBody));
                        break;
                    case 12:
                        ((RobertoTextView) styledDialog.findViewById(R.id.header)).setText(getString(R.string.depressionExercisesAdvancedPopupTitle));
                        ((RobertoTextView) styledDialog.findViewById(R.id.body)).setText(getString(R.string.depressionExercisesAdvancedPopupBody));
                        break;
                }
            } else {
                ((RobertoTextView) styledDialog.findViewById(R.id.header)).setText(getString(R.string.depressionExercisesCoolingDownPopUpHead));
                ((RobertoTextView) styledDialog.findViewById(R.id.body)).setText(getString(R.string.depressionExercisesCoolingDownPopUpBody));
            }
        } else {
            ((RobertoTextView) styledDialog.findViewById(R.id.header)).setText(getString(R.string.depressionExercisesWarmUpPopUpTitle));
            ((RobertoTextView) styledDialog.findViewById(R.id.body)).setText(getString(R.string.depressionExercisesWarmUpPopUpDescription));
        }
        ((AppCompatImageView) styledDialog.findViewById(R.id.btnBack)).setOnClickListener(new lm.f(styledDialog, 29));
        styledDialog.show();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f25723v;
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
        return inflater.inflate(R.layout.fragment_screen_a32, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f25723v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            ScrollView a32ScrollView = (ScrollView) _$_findCachedViewById(R.id.a32ScrollView);
            kotlin.jvm.internal.i.f(a32ScrollView, "a32ScrollView");
            insetsUtils.addStatusBarHeight(a32ScrollView);
            int i6 = requireArguments().getInt("set");
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionExercisesCoolingDownHead));
                        ((RobertoTextView) _$_findCachedViewById(R.id.subheader)).setText(getString(R.string.depressionExercisesCoolingDownSubHead));
                        String[] strArr = {getString(R.string.depressionExercisesCoolingDownExercise1), getString(R.string.depressionExercisesCoolingDownExercise2), getString(R.string.depressionExercisesCoolingDownExercise3)};
                        String[] strArr2 = {getString(R.string.depressionExercisesCoolingDownExercise1Sets), getString(R.string.depressionExercisesCoolingDownExercise2Sets), getString(R.string.depressionExercisesCoolingDownExercise3Sets)};
                        ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setText(getString(R.string.depressionExercisesWarmUpCTA));
                        ((RobertoTextView) _$_findCachedViewById(R.id.dialogCTA)).setText(getString(R.string.depressionExercisesWarmUpPopUp));
                        J(strArr, strArr2);
                        ((RobertoTextView) _$_findCachedViewById(R.id.dialogCTA)).setPaintFlags(((RobertoTextView) _$_findCachedViewById(R.id.dialogCTA)).getPaintFlags() | 8);
                        ((RobertoTextView) _$_findCachedViewById(R.id.dialogCTA)).setOnClickListener(new View.OnClickListener(this) { // from class: mq.r

                            /* renamed from: v  reason: collision with root package name */
                            public final /* synthetic */ s f25720v;

                            {
                                this.f25720v = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i10 = r2;
                                s this$0 = this.f25720v;
                                switch (i10) {
                                    case 0:
                                        int i11 = s.f25721w;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        this$0.K(1);
                                        return;
                                    case 1:
                                        int i12 = s.f25721w;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        this$0.K(10);
                                        return;
                                    case 2:
                                        int i13 = s.f25721w;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        this$0.K(11);
                                        return;
                                    case 3:
                                        int i14 = s.f25721w;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        this$0.K(12);
                                        return;
                                    case 4:
                                        int i15 = s.f25721w;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        this$0.K(3);
                                        return;
                                    default:
                                        int i16 = s.f25721w;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        androidx.fragment.app.p activity = this$0.getActivity();
                                        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                                        ((DepressionExerciseActivity) activity).t0();
                                        return;
                                }
                            }
                        });
                    }
                } else {
                    androidx.fragment.app.p activity = getActivity();
                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                    String str = ((DepressionExerciseActivity) activity).f10361x;
                    int hashCode = str.hashCode();
                    if (hashCode != -1326152358) {
                        if (hashCode != 782690439) {
                            if (hashCode == 1124743013 && str.equals("I exercise once in a while")) {
                                ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionExercisesModerateHead));
                                ((RobertoTextView) _$_findCachedViewById(R.id.subheader)).setText(getString(R.string.depressionExercisesModerateSubHead));
                                String[] strArr3 = {getString(R.string.depressionExercisesModerateExercise1), getString(R.string.depressionExercisesModerateExercise2), getString(R.string.depressionExercisesModerateExercise3)};
                                String[] strArr4 = {getString(R.string.depressionExercisesModerateExercise1Sets), getString(R.string.depressionExercisesModerateExercise2Sets), getString(R.string.depressionExercisesModerateExercise3Sets)};
                                ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setText(getString(R.string.depressionExercisesWarmUpCTA));
                                ((RobertoTextView) _$_findCachedViewById(R.id.dialogCTA)).setText(getString(R.string.depressionExercisesWarmUpPopUp));
                                J(strArr3, strArr4);
                                ((RobertoTextView) _$_findCachedViewById(R.id.dialogCTA)).setPaintFlags(((RobertoTextView) _$_findCachedViewById(R.id.dialogCTA)).getPaintFlags() | 8);
                                ((RobertoTextView) _$_findCachedViewById(R.id.dialogCTA)).setOnClickListener(new View.OnClickListener(this) { // from class: mq.r

                                    /* renamed from: v  reason: collision with root package name */
                                    public final /* synthetic */ s f25720v;

                                    {
                                        this.f25720v = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i10 = r2;
                                        s this$0 = this.f25720v;
                                        switch (i10) {
                                            case 0:
                                                int i11 = s.f25721w;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                this$0.K(1);
                                                return;
                                            case 1:
                                                int i12 = s.f25721w;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                this$0.K(10);
                                                return;
                                            case 2:
                                                int i13 = s.f25721w;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                this$0.K(11);
                                                return;
                                            case 3:
                                                int i14 = s.f25721w;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                this$0.K(12);
                                                return;
                                            case 4:
                                                int i15 = s.f25721w;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                this$0.K(3);
                                                return;
                                            default:
                                                int i16 = s.f25721w;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                androidx.fragment.app.p activity2 = this$0.getActivity();
                                                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                                                ((DepressionExerciseActivity) activity2).t0();
                                                return;
                                        }
                                    }
                                });
                            }
                        } else if (str.equals("I almost never exercise")) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionExercisesBeginnerHead));
                            ((RobertoTextView) _$_findCachedViewById(R.id.subheader)).setText(getString(R.string.depressionExercisesBeginnerSubHead));
                            String[] strArr5 = {getString(R.string.depressionExercisesBeginnerExercise1), getString(R.string.depressionExercisesBeginnerExercise2), getString(R.string.depressionExercisesBeginnerExercise3)};
                            String[] strArr6 = {getString(R.string.depressionExercisesBeginnerExercise1Sets), getString(R.string.depressionExercisesBeginnerExercise2Sets), getString(R.string.depressionExercisesBeginnerExercise3Sets)};
                            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setText(getString(R.string.depressionExercisesWarmUpCTA));
                            ((RobertoTextView) _$_findCachedViewById(R.id.dialogCTA)).setText(getString(R.string.depressionExercisesWarmUpPopUp));
                            J(strArr5, strArr6);
                            ((RobertoTextView) _$_findCachedViewById(R.id.dialogCTA)).setPaintFlags(((RobertoTextView) _$_findCachedViewById(R.id.dialogCTA)).getPaintFlags() | 8);
                            ((RobertoTextView) _$_findCachedViewById(R.id.dialogCTA)).setOnClickListener(new View.OnClickListener(this) { // from class: mq.r

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ s f25720v;

                                {
                                    this.f25720v = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int i10 = r2;
                                    s this$0 = this.f25720v;
                                    switch (i10) {
                                        case 0:
                                            int i11 = s.f25721w;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            this$0.K(1);
                                            return;
                                        case 1:
                                            int i12 = s.f25721w;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            this$0.K(10);
                                            return;
                                        case 2:
                                            int i13 = s.f25721w;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            this$0.K(11);
                                            return;
                                        case 3:
                                            int i14 = s.f25721w;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            this$0.K(12);
                                            return;
                                        case 4:
                                            int i15 = s.f25721w;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            this$0.K(3);
                                            return;
                                        default:
                                            int i16 = s.f25721w;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            androidx.fragment.app.p activity2 = this$0.getActivity();
                                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                                            ((DepressionExerciseActivity) activity2).t0();
                                            return;
                                    }
                                }
                            });
                        }
                    } else if (str.equals("Exercise is part of my routine")) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionExercisesAdvancedHead));
                        ((RobertoTextView) _$_findCachedViewById(R.id.subheader)).setText(getString(R.string.depressionExercisesAdvancedSubHead));
                        String[] strArr7 = {getString(R.string.depressionExercisesAdvancedExercise1), getString(R.string.depressionExercisesAdvancedExercise2), getString(R.string.depressionExercisesAdvancedExercise3)};
                        String[] strArr8 = {getString(R.string.depressionExercisesAdvancedExercise1Sets), getString(R.string.depressionExercisesAdvancedExercise2Sets), getString(R.string.depressionExercisesAdvancedExercise3Sets)};
                        ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setText(getString(R.string.depressionExercisesWarmUpCTA));
                        ((RobertoTextView) _$_findCachedViewById(R.id.dialogCTA)).setText(getString(R.string.depressionExercisesWarmUpPopUp));
                        J(strArr7, strArr8);
                        ((RobertoTextView) _$_findCachedViewById(R.id.dialogCTA)).setPaintFlags(((RobertoTextView) _$_findCachedViewById(R.id.dialogCTA)).getPaintFlags() | 8);
                        ((RobertoTextView) _$_findCachedViewById(R.id.dialogCTA)).setOnClickListener(new View.OnClickListener(this) { // from class: mq.r

                            /* renamed from: v  reason: collision with root package name */
                            public final /* synthetic */ s f25720v;

                            {
                                this.f25720v = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i10 = r2;
                                s this$0 = this.f25720v;
                                switch (i10) {
                                    case 0:
                                        int i11 = s.f25721w;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        this$0.K(1);
                                        return;
                                    case 1:
                                        int i12 = s.f25721w;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        this$0.K(10);
                                        return;
                                    case 2:
                                        int i13 = s.f25721w;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        this$0.K(11);
                                        return;
                                    case 3:
                                        int i14 = s.f25721w;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        this$0.K(12);
                                        return;
                                    case 4:
                                        int i15 = s.f25721w;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        this$0.K(3);
                                        return;
                                    default:
                                        int i16 = s.f25721w;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        androidx.fragment.app.p activity2 = this$0.getActivity();
                                        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                                        ((DepressionExerciseActivity) activity2).t0();
                                        return;
                                }
                            }
                        });
                    }
                }
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionExercisesSetWarmUpHead));
                ((RobertoTextView) _$_findCachedViewById(R.id.subheader)).setText(getString(R.string.depressionExercisesSetWarmUpSubHead));
                String[] strArr9 = {getString(R.string.depressionExercisesSetWarmUpExercise1), getString(R.string.depressionExercisesWarmUpExercise2), getString(R.string.depressionExercisesWarmUpExercise3), getString(R.string.depressionExercisesWarmUpExercise4), getString(R.string.depressionExercisesWarmUpExercise5)};
                String[] strArr10 = {getString(R.string.depressionExercisesSetWarmUpExercise1Sets), getString(R.string.depressionExercisesWarmUpExercise2Sets), getString(R.string.depressionExercisesWarmUpExercise3Sets), getString(R.string.depressionExercisesWarmUpExercise4Sets), getString(R.string.depressionExercisesWarmUpExercise5Sets)};
                ((RobertoTextView) _$_findCachedViewById(R.id.dialogCTA)).setText(getString(R.string.depressionExercisesWarmUpPopUp));
                ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setText(getString(R.string.depressionExercisesWarmUpCTA));
                J(strArr9, strArr10);
                ((RobertoTextView) _$_findCachedViewById(R.id.dialogCTA)).setPaintFlags(((RobertoTextView) _$_findCachedViewById(R.id.dialogCTA)).getPaintFlags() | 8);
                ((RobertoTextView) _$_findCachedViewById(R.id.dialogCTA)).setOnClickListener(new View.OnClickListener(this) { // from class: mq.r

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ s f25720v;

                    {
                        this.f25720v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i10 = r2;
                        s this$0 = this.f25720v;
                        switch (i10) {
                            case 0:
                                int i11 = s.f25721w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.K(1);
                                return;
                            case 1:
                                int i12 = s.f25721w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.K(10);
                                return;
                            case 2:
                                int i13 = s.f25721w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.K(11);
                                return;
                            case 3:
                                int i14 = s.f25721w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.K(12);
                                return;
                            case 4:
                                int i15 = s.f25721w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.K(3);
                                return;
                            default:
                                int i16 = s.f25721w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.fragment.app.p activity2 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                                ((DepressionExerciseActivity) activity2).t0();
                                return;
                        }
                    }
                });
            }
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setOnClickListener(new View.OnClickListener(this) { // from class: mq.r

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ s f25720v;

                {
                    this.f25720v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i10 = r2;
                    s this$0 = this.f25720v;
                    switch (i10) {
                        case 0:
                            int i11 = s.f25721w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K(1);
                            return;
                        case 1:
                            int i12 = s.f25721w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K(10);
                            return;
                        case 2:
                            int i13 = s.f25721w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K(11);
                            return;
                        case 3:
                            int i14 = s.f25721w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K(12);
                            return;
                        case 4:
                            int i15 = s.f25721w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K(3);
                            return;
                        default:
                            int i16 = s.f25721w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                            ((DepressionExerciseActivity) activity2).t0();
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f25722u, e10);
        }
    }
}
