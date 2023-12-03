package qq;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionPleasurableActivity;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionPleasurableImportanceFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqq/i;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class i extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f30039w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f30041v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f30040u = LogHelper.INSTANCE.makeLogTag(i.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f30041v;
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
        this.f30041v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str = this.f30040u;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            AppCompatImageView a4Image = (AppCompatImageView) _$_findCachedViewById(R.id.a4Image);
            kotlin.jvm.internal.i.f(a4Image, "a4Image");
            insetsUtils.addStatusBarHeight(a4Image);
            ((ConstraintLayout) _$_findCachedViewById(R.id.a4Parent)).setOnClickListener(new View.OnClickListener(this) { // from class: qq.h

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ i f30038v;

                {
                    this.f30038v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    i this$0 = this.f30038v;
                    switch (i6) {
                        case 0:
                            int i10 = i.f30039w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                            ((DepressionPleasurableActivity) activity).t0();
                            return;
                        case 1:
                            int i11 = i.f30039w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.popup_screen_p1, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                            Window window = styledDialog.getWindow();
                            if (window != null) {
                                window.setLayout(-1, -1);
                            }
                            ((RobertoTextView) styledDialog.findViewById(R.id.header)).setText(this$0.getString(R.string.depressionPleasurableBrDialogHeader1));
                            ((RobertoTextView) styledDialog.findViewById(R.id.body)).setText(this$0.getString(R.string.depressionPleasurableBrDialogText1));
                            ((AppCompatImageView) styledDialog.findViewById(R.id.btnBack)).setOnClickListener(new nq.n(styledDialog, 10));
                            styledDialog.show();
                            return;
                        default:
                            int i12 = i.f30039w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Dialog styledDialog2 = UiUtils.Companion.getStyledDialog(R.layout.popup_screen_p1, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                            Window window2 = styledDialog2.getWindow();
                            if (window2 != null) {
                                window2.setLayout(-1, -1);
                            }
                            ((RobertoTextView) styledDialog2.findViewById(R.id.header)).setText(this$0.getString(R.string.depressionPleasurableBrDialogHeader2));
                            ((RobertoTextView) styledDialog2.findViewById(R.id.body)).setText(this$0.getString(R.string.depressionPleasurableBrDialogText2));
                            ((AppCompatImageView) styledDialog2.findViewById(R.id.btnBack)).setOnClickListener(new nq.n(styledDialog2, 9));
                            styledDialog2.show();
                            return;
                    }
                }
            });
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
            int i6 = ((DepressionPleasurableActivity) activity).f10376w;
            if (i6 != 5) {
                if (i6 != 6) {
                    if (i6 != 7) {
                        if (i6 != 8) {
                            if (i6 == 12) {
                                ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
                                androidx.fragment.app.p activity2 = getActivity();
                                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                                if (((DepressionPleasurableActivity) activity2).F) {
                                    ((RobertoTextView) _$_findCachedViewById(R.id.a4Title)).setText(getString(R.string.depressionPleasurableAudioBrHeader));
                                    ((RobertoTextView) _$_findCachedViewById(R.id.a4description)).setText(getString(R.string.depressionPleasurableAudioBrText));
                                    ((AppCompatImageView) _$_findCachedViewById(R.id.a4Image)).setImageResource(R.drawable.ic_headphone_tip);
                                    return;
                                }
                                ((RobertoTextView) _$_findCachedViewById(R.id.a4Title)).setText(getString(R.string.depressionPleasurableAudioBrHeader));
                                ((RobertoTextView) _$_findCachedViewById(R.id.a4description)).setText(getString(R.string.depressionPleasurableLetterBrText));
                                ((AppCompatImageView) _$_findCachedViewById(R.id.a4Image)).setImageResource(R.drawable.ic_a18_pleasurable_message);
                                return;
                            }
                            return;
                        }
                        ((RobertoTextView) _$_findCachedViewById(R.id.a4Title)).setText(getString(R.string.depressionPleasurableBrHeader4));
                        ((RobertoTextView) _$_findCachedViewById(R.id.a4description)).setText(getString(R.string.depressionPleasurableBrText4));
                        ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setText(getString(R.string.depressionPleasurableBrCTA4));
                        ((AppCompatImageView) _$_findCachedViewById(R.id.a4Image)).setImageResource(R.drawable.ic_pleasurable_celebrate);
                        ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setPaintFlags(((RobertoTextView) _$_findCachedViewById(R.id.prompt)).getPaintFlags() | 8);
                        ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setOnClickListener(new View.OnClickListener(this) { // from class: qq.h

                            /* renamed from: v  reason: collision with root package name */
                            public final /* synthetic */ i f30038v;

                            {
                                this.f30038v = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i62 = r2;
                                i this$0 = this.f30038v;
                                switch (i62) {
                                    case 0:
                                        int i10 = i.f30039w;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        androidx.fragment.app.p activity3 = this$0.getActivity();
                                        kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                                        ((DepressionPleasurableActivity) activity3).t0();
                                        return;
                                    case 1:
                                        int i11 = i.f30039w;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.popup_screen_p1, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                                        Window window = styledDialog.getWindow();
                                        if (window != null) {
                                            window.setLayout(-1, -1);
                                        }
                                        ((RobertoTextView) styledDialog.findViewById(R.id.header)).setText(this$0.getString(R.string.depressionPleasurableBrDialogHeader1));
                                        ((RobertoTextView) styledDialog.findViewById(R.id.body)).setText(this$0.getString(R.string.depressionPleasurableBrDialogText1));
                                        ((AppCompatImageView) styledDialog.findViewById(R.id.btnBack)).setOnClickListener(new nq.n(styledDialog, 10));
                                        styledDialog.show();
                                        return;
                                    default:
                                        int i12 = i.f30039w;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        Dialog styledDialog2 = UiUtils.Companion.getStyledDialog(R.layout.popup_screen_p1, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                                        Window window2 = styledDialog2.getWindow();
                                        if (window2 != null) {
                                            window2.setLayout(-1, -1);
                                        }
                                        ((RobertoTextView) styledDialog2.findViewById(R.id.header)).setText(this$0.getString(R.string.depressionPleasurableBrDialogHeader2));
                                        ((RobertoTextView) styledDialog2.findViewById(R.id.body)).setText(this$0.getString(R.string.depressionPleasurableBrDialogText2));
                                        ((AppCompatImageView) styledDialog2.findViewById(R.id.btnBack)).setOnClickListener(new nq.n(styledDialog2, 9));
                                        styledDialog2.show();
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    ((RobertoTextView) _$_findCachedViewById(R.id.a4Title)).setText(getString(R.string.depressionPleasurableBrHeader3));
                    ((RobertoTextView) _$_findCachedViewById(R.id.a4description)).setText(getString(R.string.depressionPleasurableBrText3));
                    ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setText(getString(R.string.depressionPleasurableBrCTA3));
                    ((AppCompatImageView) _$_findCachedViewById(R.id.a4Image)).setImageResource(R.drawable.ic_pleasurable_celebrate);
                    ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setPaintFlags(((RobertoTextView) _$_findCachedViewById(R.id.prompt)).getPaintFlags() | 8);
                    ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setOnClickListener(new View.OnClickListener(this) { // from class: qq.h

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ i f30038v;

                        {
                            this.f30038v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i62 = r2;
                            i this$0 = this.f30038v;
                            switch (i62) {
                                case 0:
                                    int i10 = i.f30039w;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    androidx.fragment.app.p activity3 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                                    ((DepressionPleasurableActivity) activity3).t0();
                                    return;
                                case 1:
                                    int i11 = i.f30039w;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.popup_screen_p1, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                                    Window window = styledDialog.getWindow();
                                    if (window != null) {
                                        window.setLayout(-1, -1);
                                    }
                                    ((RobertoTextView) styledDialog.findViewById(R.id.header)).setText(this$0.getString(R.string.depressionPleasurableBrDialogHeader1));
                                    ((RobertoTextView) styledDialog.findViewById(R.id.body)).setText(this$0.getString(R.string.depressionPleasurableBrDialogText1));
                                    ((AppCompatImageView) styledDialog.findViewById(R.id.btnBack)).setOnClickListener(new nq.n(styledDialog, 10));
                                    styledDialog.show();
                                    return;
                                default:
                                    int i12 = i.f30039w;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Dialog styledDialog2 = UiUtils.Companion.getStyledDialog(R.layout.popup_screen_p1, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                                    Window window2 = styledDialog2.getWindow();
                                    if (window2 != null) {
                                        window2.setLayout(-1, -1);
                                    }
                                    ((RobertoTextView) styledDialog2.findViewById(R.id.header)).setText(this$0.getString(R.string.depressionPleasurableBrDialogHeader2));
                                    ((RobertoTextView) styledDialog2.findViewById(R.id.body)).setText(this$0.getString(R.string.depressionPleasurableBrDialogText2));
                                    ((AppCompatImageView) styledDialog2.findViewById(R.id.btnBack)).setOnClickListener(new nq.n(styledDialog2, 9));
                                    styledDialog2.show();
                                    return;
                            }
                        }
                    });
                    return;
                }
                ((AppCompatImageView) _$_findCachedViewById(R.id.a4Image)).setImageResource(R.drawable.ic_a14_mastery_star);
                ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
                try {
                    ((RobertoTextView) _$_findCachedViewById(R.id.a4Title)).setText(getString(R.string.depressionPleasurableGreatName, FirebasePersistence.getInstance().getUser().getFirstName()));
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(str, e10);
                    ((RobertoTextView) _$_findCachedViewById(R.id.a4Title)).setText(getString(R.string.conditionSelectionUserChoiceSleepHeader));
                }
                ((RobertoTextView) _$_findCachedViewById(R.id.a4description)).setText(getString(R.string.depressionPleasurableBrText2));
                return;
            }
            ((AppCompatImageView) _$_findCachedViewById(R.id.a4Image)).setImageResource(R.drawable.ic_a14_mastery_star);
            ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
            try {
                ((RobertoTextView) _$_findCachedViewById(R.id.a4Title)).setText(getString(R.string.depressionPleasurableGreatName, FirebasePersistence.getInstance().getUser().getFirstName()));
            } catch (Exception e11) {
                LogHelper.INSTANCE.e(str, e11);
                ((RobertoTextView) _$_findCachedViewById(R.id.a4Title)).setText(getString(R.string.conditionSelectionUserChoiceSleepHeader));
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.a4description)).setText(getString(R.string.depressionPleasurableBrText1));
            return;
        } catch (Exception e12) {
            LogHelper.INSTANCE.e(str, e12);
        }
        LogHelper.INSTANCE.e(str, e12);
    }
}
