package pq;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import ik.h0;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionMasteryPlanSelectFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpq/o;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class o extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f28805x = 0;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f28808w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f28806u = LogHelper.INSTANCE.makeLogTag(o.class);

    /* renamed from: v  reason: collision with root package name */
    public String f28807v = "";

    public final void J() {
        final View inflate = getLayoutInflater().inflate(R.layout.row_screen_a6_radio_img, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)), false);
        final View inflate2 = getLayoutInflater().inflate(R.layout.row_screen_a6_radio_img, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)), false);
        inflate.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(requireActivity(), R.color.white)));
        inflate2.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(requireActivity(), R.color.white)));
        ((AppCompatImageView) inflate.findViewById(R.id.rowImage)).setImageResource(R.drawable.ic_mastery_weekday);
        ((AppCompatImageView) inflate2.findViewById(R.id.rowImage)).setImageResource(R.drawable.ic_mastery_weekend);
        ((RobertoTextView) inflate.findViewById(R.id.rowText)).setText(getString(R.string.depressionMasteryDayWeekday));
        ((RadioButton) inflate.findViewById(R.id.radioToggle)).setVisibility(0);
        ((RadioButton) inflate.findViewById(R.id.radioToggle)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: pq.n
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                int i6 = r4;
                View view = inflate2;
                View view2 = inflate;
                o this$0 = this;
                switch (i6) {
                    case 0:
                        int i10 = o.f28805x;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (z10) {
                            ((RadioButton) view.findViewById(R.id.radioToggle)).setChecked(false);
                            ((RadioButton) view2.findViewById(R.id.radioToggle)).setChecked(true);
                            this$0.f28807v = ((RobertoTextView) view2.findViewById(R.id.rowText)).getText().toString();
                            ((RadioButton) view2.findViewById(R.id.radioToggle)).setButtonTintList(ColorStateList.valueOf(g0.a.b(this$0.requireActivity(), R.color.sea)));
                        } else {
                            ((RadioButton) view2.findViewById(R.id.radioToggle)).setChecked(false);
                            this$0.f28807v = "";
                            ((RadioButton) view2.findViewById(R.id.radioToggle)).setButtonTintList(ColorStateList.valueOf(g0.a.b(this$0.requireActivity(), R.color.title_high_contrast)));
                        }
                        ((RobertoButton) this$0._$_findCachedViewById(R.id.continueCTA)).setBackground(a.c.b(this$0.requireContext(), R.drawable.button_dark_grey_fill));
                        return;
                    default:
                        int i11 = o.f28805x;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (z10) {
                            ((RadioButton) view.findViewById(R.id.radioToggle)).setChecked(false);
                            ((RadioButton) view2.findViewById(R.id.radioToggle)).setChecked(true);
                            this$0.f28807v = ((RobertoTextView) view2.findViewById(R.id.rowText)).getText().toString();
                            ((RadioButton) view2.findViewById(R.id.radioToggle)).setButtonTintList(ColorStateList.valueOf(g0.a.b(this$0.requireActivity(), R.color.sea)));
                        } else {
                            ((RadioButton) view2.findViewById(R.id.radioToggle)).setChecked(false);
                            this$0.f28807v = "";
                            ((RadioButton) view2.findViewById(R.id.radioToggle)).setButtonTintList(ColorStateList.valueOf(g0.a.b(this$0.requireActivity(), R.color.title_high_contrast)));
                        }
                        ((RobertoButton) this$0._$_findCachedViewById(R.id.continueCTA)).setBackground(a.c.b(this$0.requireContext(), R.drawable.button_dark_grey_fill));
                        return;
                }
            }
        });
        ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)).addView(inflate);
        ((RobertoTextView) inflate2.findViewById(R.id.rowText)).setText(getString(R.string.depressionMasteryDayWeekend));
        ((RadioButton) inflate2.findViewById(R.id.radioToggle)).setVisibility(0);
        ((RadioButton) inflate2.findViewById(R.id.radioToggle)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: pq.n
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                int i6 = r4;
                View view = inflate;
                View view2 = inflate2;
                o this$0 = this;
                switch (i6) {
                    case 0:
                        int i10 = o.f28805x;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (z10) {
                            ((RadioButton) view.findViewById(R.id.radioToggle)).setChecked(false);
                            ((RadioButton) view2.findViewById(R.id.radioToggle)).setChecked(true);
                            this$0.f28807v = ((RobertoTextView) view2.findViewById(R.id.rowText)).getText().toString();
                            ((RadioButton) view2.findViewById(R.id.radioToggle)).setButtonTintList(ColorStateList.valueOf(g0.a.b(this$0.requireActivity(), R.color.sea)));
                        } else {
                            ((RadioButton) view2.findViewById(R.id.radioToggle)).setChecked(false);
                            this$0.f28807v = "";
                            ((RadioButton) view2.findViewById(R.id.radioToggle)).setButtonTintList(ColorStateList.valueOf(g0.a.b(this$0.requireActivity(), R.color.title_high_contrast)));
                        }
                        ((RobertoButton) this$0._$_findCachedViewById(R.id.continueCTA)).setBackground(a.c.b(this$0.requireContext(), R.drawable.button_dark_grey_fill));
                        return;
                    default:
                        int i11 = o.f28805x;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (z10) {
                            ((RadioButton) view.findViewById(R.id.radioToggle)).setChecked(false);
                            ((RadioButton) view2.findViewById(R.id.radioToggle)).setChecked(true);
                            this$0.f28807v = ((RobertoTextView) view2.findViewById(R.id.rowText)).getText().toString();
                            ((RadioButton) view2.findViewById(R.id.radioToggle)).setButtonTintList(ColorStateList.valueOf(g0.a.b(this$0.requireActivity(), R.color.sea)));
                        } else {
                            ((RadioButton) view2.findViewById(R.id.radioToggle)).setChecked(false);
                            this$0.f28807v = "";
                            ((RadioButton) view2.findViewById(R.id.radioToggle)).setButtonTintList(ColorStateList.valueOf(g0.a.b(this$0.requireActivity(), R.color.title_high_contrast)));
                        }
                        ((RobertoButton) this$0._$_findCachedViewById(R.id.continueCTA)).setBackground(a.c.b(this$0.requireContext(), R.drawable.button_dark_grey_fill));
                        return;
                }
            }
        });
        ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)).addView(inflate2);
        ((ConstraintLayout) inflate.findViewById(R.id.parentLayout)).setOnClickListener(new h0(inflate, 2));
        ((ConstraintLayout) inflate2.findViewById(R.id.parentLayout)).setOnClickListener(new h0(inflate2, 3));
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f28808w;
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
        return inflater.inflate(R.layout.fragment_screen_a6, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f28808w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            ScrollView a6ScrollView = (ScrollView) _$_findCachedViewById(R.id.a6ScrollView);
            kotlin.jvm.internal.i.f(a6ScrollView, "a6ScrollView");
            insetsUtils.addStatusBarHeight(a6ScrollView);
            J();
            ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionMasteryDayHeader));
            ((RobertoTextView) _$_findCachedViewById(R.id.subheader)).setText(getString(R.string.depressionMasteryDaySubheader));
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setText(getString(R.string.depressionMasteryDayCTA));
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setBackground(a.c.b(requireContext(), R.drawable.button_border_gray));
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setOnClickListener(new fq.x(20, this));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f28806u, e10);
        }
    }
}
