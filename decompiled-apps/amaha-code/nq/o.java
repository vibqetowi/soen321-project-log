package nq;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionGoodthingsActivity;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionGoodthingsSeparatorFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnq/o;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class o extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f26747w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f26749v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f26748u = LogHelper.INSTANCE.makeLogTag(o.class);

    public final View J(String str, Dialog dialog) {
        View inflate = getLayoutInflater().inflate(R.layout.row_screen_a6, (ViewGroup) ((LinearLayout) dialog.findViewById(R.id.rowItemContainer)), false);
        ((RobertoTextView) inflate.findViewById(R.id.rowTitle)).setText(str);
        ((RobertoTextView) inflate.findViewById(R.id.rowNumber)).setText("1.");
        ((AppCompatImageView) inflate.findViewById(R.id.rowCheck)).setVisibility(8);
        inflate.findViewById(R.id.divider).setVisibility(8);
        return inflate;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f26749v;
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
        this.f26749v.clear();
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
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
            int i6 = ((DepressionGoodthingsActivity) activity).f10364w;
            if (i6 != 3) {
                if (i6 == 5) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
                    ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setVisibility(8);
                    ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.a2header)).setText(getString(R.string.goodthingsWriteAffirmation));
                    ((ConstraintLayout) _$_findCachedViewById(R.id.a2parent)).setOnClickListener(new View.OnClickListener(this) { // from class: nq.m

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ o f26744v;

                        {
                            this.f26744v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i10 = r2;
                            o this$0 = this.f26744v;
                            switch (i10) {
                                case 0:
                                    int i11 = o.f26747w;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.popup_screen_p2, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                                    Window window = styledDialog.getWindow();
                                    if (window != null) {
                                        window.setLayout(-1, -1);
                                    }
                                    ((RobertoTextView) styledDialog.findViewById(R.id.header)).setText(this$0.getString(R.string.goodthingsAimDialogTitle));
                                    String string = this$0.getString(R.string.goodthingsSuggestion1);
                                    kotlin.jvm.internal.i.f(string, "getString(R.string.goodthingsSuggestion1)");
                                    ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string, styledDialog));
                                    String string2 = this$0.getString(R.string.goodthingsSuggestion2);
                                    kotlin.jvm.internal.i.f(string2, "getString(R.string.goodthingsSuggestion2)");
                                    ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string2, styledDialog));
                                    String string3 = this$0.getString(R.string.goodthingsSuggestion3);
                                    kotlin.jvm.internal.i.f(string3, "getString(R.string.goodthingsSuggestion3)");
                                    ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string3, styledDialog));
                                    String string4 = this$0.getString(R.string.goodthingsSuggestion4);
                                    kotlin.jvm.internal.i.f(string4, "getString(R.string.goodthingsSuggestion4)");
                                    ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string4, styledDialog));
                                    String string5 = this$0.getString(R.string.goodthingsSuggestion5);
                                    kotlin.jvm.internal.i.f(string5, "getString(R.string.goodthingsSuggestion5)");
                                    ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string5, styledDialog));
                                    String string6 = this$0.getString(R.string.goodthingsSuggestion6);
                                    kotlin.jvm.internal.i.f(string6, "getString(R.string.goodthingsSuggestion6)");
                                    ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string6, styledDialog));
                                    String string7 = this$0.getString(R.string.goodthingsSuggestion7);
                                    kotlin.jvm.internal.i.f(string7, "getString(R.string.goodthingsSuggestion7)");
                                    ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string7, styledDialog));
                                    String string8 = this$0.getString(R.string.goodthingsSuggestion8);
                                    kotlin.jvm.internal.i.f(string8, "getString(R.string.goodthingsSuggestion8)");
                                    ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string8, styledDialog));
                                    String string9 = this$0.getString(R.string.goodthingsSuggestion9);
                                    kotlin.jvm.internal.i.f(string9, "getString(R.string.goodthingsSuggestion9)");
                                    ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string9, styledDialog));
                                    String string10 = this$0.getString(R.string.goodthingsSuggestion10);
                                    kotlin.jvm.internal.i.f(string10, "getString(R.string.goodthingsSuggestion10)");
                                    ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string10, styledDialog));
                                    String string11 = this$0.getString(R.string.goodthingsSuggestion11);
                                    kotlin.jvm.internal.i.f(string11, "getString(R.string.goodthingsSuggestion11)");
                                    ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string11, styledDialog));
                                    String string12 = this$0.getString(R.string.goodthingsSuggestion12);
                                    kotlin.jvm.internal.i.f(string12, "getString(R.string.goodthingsSuggestion12)");
                                    ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string12, styledDialog));
                                    String string13 = this$0.getString(R.string.goodthingsSuggestion13);
                                    kotlin.jvm.internal.i.f(string13, "getString(R.string.goodthingsSuggestion13)");
                                    ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string13, styledDialog));
                                    int childCount = ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).getChildCount();
                                    int i12 = 0;
                                    while (i12 < childCount) {
                                        StringBuilder sb2 = new StringBuilder();
                                        i12++;
                                        sb2.append(i12);
                                        sb2.append('.');
                                        ((RobertoTextView) ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).getChildAt(i12).findViewById(R.id.rowNumber)).setText(sb2.toString());
                                    }
                                    ((AppCompatImageView) styledDialog.findViewById(R.id.btnBack)).setOnClickListener(new n(styledDialog, 0));
                                    styledDialog.show();
                                    return;
                                case 1:
                                    int i13 = o.f26747w;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    androidx.fragment.app.p activity2 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
                                    ((DepressionGoodthingsActivity) activity2).t0();
                                    return;
                                default:
                                    int i14 = o.f26747w;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    androidx.fragment.app.p activity3 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
                                    ((DepressionGoodthingsActivity) activity3).t0();
                                    return;
                            }
                        }
                    });
                }
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(0);
                ((RobertoTextView) _$_findCachedViewById(R.id.a2header)).setText(getString(R.string.goodthingsAim));
                ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setText(getString(R.string.goodthingsAimCTA));
                ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setPaintFlags(((RobertoTextView) _$_findCachedViewById(R.id.prompt)).getPaintFlags() | 8);
                ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setOnClickListener(new View.OnClickListener(this) { // from class: nq.m

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ o f26744v;

                    {
                        this.f26744v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i10 = r2;
                        o this$0 = this.f26744v;
                        switch (i10) {
                            case 0:
                                int i11 = o.f26747w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.popup_screen_p2, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                                Window window = styledDialog.getWindow();
                                if (window != null) {
                                    window.setLayout(-1, -1);
                                }
                                ((RobertoTextView) styledDialog.findViewById(R.id.header)).setText(this$0.getString(R.string.goodthingsAimDialogTitle));
                                String string = this$0.getString(R.string.goodthingsSuggestion1);
                                kotlin.jvm.internal.i.f(string, "getString(R.string.goodthingsSuggestion1)");
                                ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string, styledDialog));
                                String string2 = this$0.getString(R.string.goodthingsSuggestion2);
                                kotlin.jvm.internal.i.f(string2, "getString(R.string.goodthingsSuggestion2)");
                                ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string2, styledDialog));
                                String string3 = this$0.getString(R.string.goodthingsSuggestion3);
                                kotlin.jvm.internal.i.f(string3, "getString(R.string.goodthingsSuggestion3)");
                                ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string3, styledDialog));
                                String string4 = this$0.getString(R.string.goodthingsSuggestion4);
                                kotlin.jvm.internal.i.f(string4, "getString(R.string.goodthingsSuggestion4)");
                                ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string4, styledDialog));
                                String string5 = this$0.getString(R.string.goodthingsSuggestion5);
                                kotlin.jvm.internal.i.f(string5, "getString(R.string.goodthingsSuggestion5)");
                                ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string5, styledDialog));
                                String string6 = this$0.getString(R.string.goodthingsSuggestion6);
                                kotlin.jvm.internal.i.f(string6, "getString(R.string.goodthingsSuggestion6)");
                                ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string6, styledDialog));
                                String string7 = this$0.getString(R.string.goodthingsSuggestion7);
                                kotlin.jvm.internal.i.f(string7, "getString(R.string.goodthingsSuggestion7)");
                                ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string7, styledDialog));
                                String string8 = this$0.getString(R.string.goodthingsSuggestion8);
                                kotlin.jvm.internal.i.f(string8, "getString(R.string.goodthingsSuggestion8)");
                                ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string8, styledDialog));
                                String string9 = this$0.getString(R.string.goodthingsSuggestion9);
                                kotlin.jvm.internal.i.f(string9, "getString(R.string.goodthingsSuggestion9)");
                                ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string9, styledDialog));
                                String string10 = this$0.getString(R.string.goodthingsSuggestion10);
                                kotlin.jvm.internal.i.f(string10, "getString(R.string.goodthingsSuggestion10)");
                                ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string10, styledDialog));
                                String string11 = this$0.getString(R.string.goodthingsSuggestion11);
                                kotlin.jvm.internal.i.f(string11, "getString(R.string.goodthingsSuggestion11)");
                                ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string11, styledDialog));
                                String string12 = this$0.getString(R.string.goodthingsSuggestion12);
                                kotlin.jvm.internal.i.f(string12, "getString(R.string.goodthingsSuggestion12)");
                                ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string12, styledDialog));
                                String string13 = this$0.getString(R.string.goodthingsSuggestion13);
                                kotlin.jvm.internal.i.f(string13, "getString(R.string.goodthingsSuggestion13)");
                                ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string13, styledDialog));
                                int childCount = ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).getChildCount();
                                int i12 = 0;
                                while (i12 < childCount) {
                                    StringBuilder sb2 = new StringBuilder();
                                    i12++;
                                    sb2.append(i12);
                                    sb2.append('.');
                                    ((RobertoTextView) ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).getChildAt(i12).findViewById(R.id.rowNumber)).setText(sb2.toString());
                                }
                                ((AppCompatImageView) styledDialog.findViewById(R.id.btnBack)).setOnClickListener(new n(styledDialog, 0));
                                styledDialog.show();
                                return;
                            case 1:
                                int i13 = o.f26747w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.fragment.app.p activity2 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
                                ((DepressionGoodthingsActivity) activity2).t0();
                                return;
                            default:
                                int i14 = o.f26747w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.fragment.app.p activity3 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
                                ((DepressionGoodthingsActivity) activity3).t0();
                                return;
                        }
                    }
                });
                ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setVisibility(8);
                ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setVisibility(0);
                ((ConstraintLayout) _$_findCachedViewById(R.id.a2parent)).setOnClickListener(new View.OnClickListener(this) { // from class: nq.m

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ o f26744v;

                    {
                        this.f26744v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i10 = r2;
                        o this$0 = this.f26744v;
                        switch (i10) {
                            case 0:
                                int i11 = o.f26747w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.popup_screen_p2, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                                Window window = styledDialog.getWindow();
                                if (window != null) {
                                    window.setLayout(-1, -1);
                                }
                                ((RobertoTextView) styledDialog.findViewById(R.id.header)).setText(this$0.getString(R.string.goodthingsAimDialogTitle));
                                String string = this$0.getString(R.string.goodthingsSuggestion1);
                                kotlin.jvm.internal.i.f(string, "getString(R.string.goodthingsSuggestion1)");
                                ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string, styledDialog));
                                String string2 = this$0.getString(R.string.goodthingsSuggestion2);
                                kotlin.jvm.internal.i.f(string2, "getString(R.string.goodthingsSuggestion2)");
                                ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string2, styledDialog));
                                String string3 = this$0.getString(R.string.goodthingsSuggestion3);
                                kotlin.jvm.internal.i.f(string3, "getString(R.string.goodthingsSuggestion3)");
                                ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string3, styledDialog));
                                String string4 = this$0.getString(R.string.goodthingsSuggestion4);
                                kotlin.jvm.internal.i.f(string4, "getString(R.string.goodthingsSuggestion4)");
                                ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string4, styledDialog));
                                String string5 = this$0.getString(R.string.goodthingsSuggestion5);
                                kotlin.jvm.internal.i.f(string5, "getString(R.string.goodthingsSuggestion5)");
                                ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string5, styledDialog));
                                String string6 = this$0.getString(R.string.goodthingsSuggestion6);
                                kotlin.jvm.internal.i.f(string6, "getString(R.string.goodthingsSuggestion6)");
                                ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string6, styledDialog));
                                String string7 = this$0.getString(R.string.goodthingsSuggestion7);
                                kotlin.jvm.internal.i.f(string7, "getString(R.string.goodthingsSuggestion7)");
                                ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string7, styledDialog));
                                String string8 = this$0.getString(R.string.goodthingsSuggestion8);
                                kotlin.jvm.internal.i.f(string8, "getString(R.string.goodthingsSuggestion8)");
                                ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string8, styledDialog));
                                String string9 = this$0.getString(R.string.goodthingsSuggestion9);
                                kotlin.jvm.internal.i.f(string9, "getString(R.string.goodthingsSuggestion9)");
                                ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string9, styledDialog));
                                String string10 = this$0.getString(R.string.goodthingsSuggestion10);
                                kotlin.jvm.internal.i.f(string10, "getString(R.string.goodthingsSuggestion10)");
                                ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string10, styledDialog));
                                String string11 = this$0.getString(R.string.goodthingsSuggestion11);
                                kotlin.jvm.internal.i.f(string11, "getString(R.string.goodthingsSuggestion11)");
                                ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string11, styledDialog));
                                String string12 = this$0.getString(R.string.goodthingsSuggestion12);
                                kotlin.jvm.internal.i.f(string12, "getString(R.string.goodthingsSuggestion12)");
                                ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string12, styledDialog));
                                String string13 = this$0.getString(R.string.goodthingsSuggestion13);
                                kotlin.jvm.internal.i.f(string13, "getString(R.string.goodthingsSuggestion13)");
                                ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).addView(this$0.J(string13, styledDialog));
                                int childCount = ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).getChildCount();
                                int i12 = 0;
                                while (i12 < childCount) {
                                    StringBuilder sb2 = new StringBuilder();
                                    i12++;
                                    sb2.append(i12);
                                    sb2.append('.');
                                    ((RobertoTextView) ((LinearLayout) styledDialog.findViewById(R.id.rowItemContainer)).getChildAt(i12).findViewById(R.id.rowNumber)).setText(sb2.toString());
                                }
                                ((AppCompatImageView) styledDialog.findViewById(R.id.btnBack)).setOnClickListener(new n(styledDialog, 0));
                                styledDialog.show();
                                return;
                            case 1:
                                int i13 = o.f26747w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.fragment.app.p activity2 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
                                ((DepressionGoodthingsActivity) activity2).t0();
                                return;
                            default:
                                int i14 = o.f26747w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.fragment.app.p activity3 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
                                ((DepressionGoodthingsActivity) activity3).t0();
                                return;
                        }
                    }
                });
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26748u, e10);
        }
    }
}
