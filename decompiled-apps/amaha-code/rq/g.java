package rq;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionThoughtsActivity;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionThoughtsFeelingsFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrq/g;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class g extends rr.b {
    public static final /* synthetic */ int B = 0;
    public final LinkedHashMap A = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f30935u = LogHelper.INSTANCE.makeLogTag(g.class);

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList<Chip> f30936v = new ArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList<String> f30937w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<String> f30938x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<String> f30939y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList<String> f30940z = new ArrayList<>();

    public final void J(Chip chip) {
        chip.setOnCheckedChangeListener(new fl.m(chip, 4, this));
        chip.setOnCloseIconClickListener(new ho.o(this, 28, chip));
    }

    public final int K(String ch2, ArrayList list) {
        kotlin.jvm.internal.i.g(list, "list");
        kotlin.jvm.internal.i.g(ch2, "ch");
        try {
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                Object obj = list.get(i6);
                kotlin.jvm.internal.i.f(obj, "list[i]");
                String lowerCase = gv.r.i1((String) obj).toString().toLowerCase();
                kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
                String lowerCase2 = gv.r.i1(ch2).toString().toLowerCase();
                kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase()");
                if (lowerCase.equals(lowerCase2)) {
                    return i6;
                }
            }
            return -1;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30935u, "Exception in finding String element in ArrayList", e10);
            return -1;
        }
    }

    public final void M() {
        Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_screen_a22_search, getActivity(), R.style.Theme_Dialog_Fullscreen);
        View childAt = ((LinearLayout) styledDialog.findViewById(R.id.optionsContainerLayout)).getChildAt(0);
        kotlin.jvm.internal.i.e(childAt, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
        RobertoTextView robertoTextView = (RobertoTextView) childAt;
        ((LinearLayout) styledDialog.findViewById(R.id.optionsContainerLayout)).removeViewAt(0);
        ArrayList<String> arrayList = this.f30938x;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            View inflate = getLayoutInflater().inflate(R.layout.grounding_picker_option_row, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.optionsContainerLayout)), false);
            ((RobertoTextView) inflate.findViewById(R.id.optionTitle)).setText(arrayList.get(i6));
            inflate.setOnClickListener(new nn.g(this, gv.r.i1(((RobertoTextView) inflate.findViewById(R.id.optionTitle)).getText().toString()).toString(), styledDialog, 20));
            ((LinearLayout) styledDialog.findViewById(R.id.optionsContainerLayout)).addView(inflate);
        }
        ((LinearLayout) styledDialog.findViewById(R.id.optionsContainerLayout)).addView(robertoTextView);
        robertoTextView.setText(getString(R.string.depressionThoughtsFeelingsn));
        ((AppCompatImageView) styledDialog.findViewById(R.id.btnSelectionBack)).setOnClickListener(new nq.n(styledDialog, 11));
        ((RobertoEditText) styledDialog.findViewById(R.id.editTextOption)).addTextChangedListener(new a(styledDialog));
        ((RobertoTextView) styledDialog.findViewById(R.id.addNew)).setOnClickListener(new ho.o(styledDialog, 27, this));
        ((RobertoEditText) styledDialog.findViewById(R.id.editTextOption)).setOnEditorActionListener(new oq.l(styledDialog, this, 5));
        Window window = styledDialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        styledDialog.show();
    }

    public final void O(String str, boolean z10, boolean z11) {
        String str2 = this.f30935u;
        try {
            this.f30939y.add(gv.r.i1(str).toString());
            ArrayList<Chip> arrayList = this.f30936v;
            if (z11) {
                try {
                    Chip chip = new Chip(((ChipGroup) _$_findCachedViewById(R.id.chipGroupPre)).getContext(), null);
                    chip.setLayoutParams(new ChipGroup.b());
                    chip.setText(str);
                    chip.setCheckable(true);
                    chip.setGravity(17);
                    chip.setCheckedIconVisible(false);
                    chip.setChipIconVisible(false);
                    chip.setCloseIconVisible(false);
                    chip.setCloseIconTint(null);
                    chip.setChipMinHeightResource(R.dimen._32sdp);
                    chip.setChipStrokeWidthResource(R.dimen._1sdp);
                    chip.setChipCornerRadiusResource(R.dimen.margin_8);
                    chip.setChipStartPaddingResource(R.dimen.margin_16);
                    chip.setChipEndPaddingResource(R.dimen.margin_16);
                    chip.setChecked(z10);
                    if (z10) {
                        androidx.fragment.app.p activity = getActivity();
                        kotlin.jvm.internal.i.d(activity);
                        chip.setTextColor(g0.a.b(activity, R.color.white));
                        chip.setChipBackgroundColorResource(R.color.sea);
                        chip.setChipStrokeColorResource(R.color.sea);
                    } else {
                        androidx.fragment.app.p activity2 = getActivity();
                        kotlin.jvm.internal.i.d(activity2);
                        chip.setTextColor(g0.a.b(activity2, R.color.title_high_contrast));
                        chip.setChipBackgroundColorResource(R.color.white);
                        chip.setChipStrokeColorResource(R.color.title_high_contrast);
                    }
                    ((ChipGroup) _$_findCachedViewById(R.id.chipGroupPre)).addView(chip);
                    J(chip);
                    if (z10) {
                        arrayList.add(chip);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(str2, "Exception when setting up the pre-added chips", e10);
                    return;
                }
            }
            try {
                View childAt = ((ChipGroup) _$_findCachedViewById(R.id.chipGroupAdd)).getChildAt(((ChipGroup) _$_findCachedViewById(R.id.chipGroupAdd)).getChildCount() - 1);
                ((ChipGroup) _$_findCachedViewById(R.id.chipGroupAdd)).removeViewAt(((ChipGroup) _$_findCachedViewById(R.id.chipGroupAdd)).getChildCount() - 1);
                Chip chip2 = new Chip(((ChipGroup) _$_findCachedViewById(R.id.chipGroupAdd)).getContext(), null);
                chip2.setLayoutParams(new ChipGroup.b());
                chip2.setText(str);
                chip2.setCheckable(true);
                chip2.setGravity(17);
                chip2.setCheckedIconVisible(false);
                chip2.setChipIconVisible(false);
                chip2.setCloseIconVisible(true);
                chip2.setCloseIconTint(null);
                chip2.setChipMinHeightResource(R.dimen._32sdp);
                chip2.setChipStrokeWidthResource(R.dimen._1sdp);
                chip2.setChipCornerRadiusResource(R.dimen.margin_8);
                chip2.setChipStartPaddingResource(R.dimen.margin_16);
                chip2.setChipEndPaddingResource(R.dimen.margin_16);
                chip2.setChecked(z10);
                if (z10) {
                    androidx.fragment.app.p activity3 = getActivity();
                    kotlin.jvm.internal.i.d(activity3);
                    chip2.setTextColor(g0.a.b(activity3, R.color.white));
                    chip2.setCloseIconResource(R.drawable.ic_remove_circle_black);
                    chip2.setChipBackgroundColorResource(R.color.sea);
                    chip2.setChipStrokeColorResource(R.color.sea);
                    ((ChipGroup) _$_findCachedViewById(R.id.chipGroupAdd)).addView(chip2);
                    J(chip2);
                    arrayList.add(chip2);
                    ((ChipGroup) _$_findCachedViewById(R.id.chipGroupAdd)).addView(childAt);
                    if (arrayList.size() == 1) {
                        ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setBackgroundResource(R.drawable.button_dark_grey_fill);
                    }
                } else {
                    androidx.fragment.app.p activity4 = getActivity();
                    kotlin.jvm.internal.i.d(activity4);
                    chip2.setTextColor(g0.a.b(activity4, R.color.title_high_contrast));
                    chip2.setCloseIconResource(R.drawable.ic_remove_circle_black_outline);
                    chip2.setChipBackgroundColorResource(R.color.white);
                    chip2.setChipStrokeColorResource(R.color.title_high_contrast);
                    ((ChipGroup) _$_findCachedViewById(R.id.chipGroupAdd)).addView(chip2);
                    J(chip2);
                    ((ChipGroup) _$_findCachedViewById(R.id.chipGroupAdd)).addView(childAt);
                }
                return;
            } catch (Exception e11) {
                LogHelper.INSTANCE.e(str2, "Exception when adding user entered chip", e11);
                return;
            }
        } catch (Exception e12) {
            LogHelper.INSTANCE.e(str2, "Thoughts Feelings", e12);
        }
        LogHelper.INSTANCE.e(str2, "Thoughts Feelings", e12);
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.A;
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
        return inflater.inflate(R.layout.fragment_screen_a28, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.A.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
        ScrollView a28ScrollView = (ScrollView) _$_findCachedViewById(R.id.a28ScrollView);
        kotlin.jvm.internal.i.f(a28ScrollView, "a28ScrollView");
        insetsUtils.addStatusBarHeight(a28ScrollView);
        try {
            ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionThoughtsFeelingsHead));
            ((RobertoTextView) _$_findCachedViewById(R.id.subheader)).setText(getString(R.string.depressionThoughtsFeelingsSubHead));
            ((RobertoTextView) _$_findCachedViewById(R.id.example)).setText(getString(R.string.depressionThoughtsFeelingsExample));
            ((RobertoTextView) _$_findCachedViewById(R.id.exampleText)).setText(getString(R.string.depressionThoughtsFeelingsExampleDescription));
            ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setText(getString(R.string.depressionThoughtsFeelingsText1));
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setText(getString(R.string.depressionThoughtsViewPagerCTAText));
            ArrayList<String> arrayList = this.f30940z;
            arrayList.addAll(ca.a.P0(getString(R.string.depressionThoughtsFeelingsSearchOption1), getString(R.string.depressionThoughtsFeelingsSearchOption2), getString(R.string.depressionThoughtsFeelingsSearchOption3), getString(R.string.depressionThoughtsFeelingsSearchOption4), getString(R.string.depressionThoughtsFeelingsSearchOption5), getString(R.string.depressionThoughtsFeelingsSearchOption6), getString(R.string.depressionThoughtsFeelingsSearchOption7), getString(R.string.depressionThoughtsFeelingsSearchOption8), getString(R.string.depressionThoughtsFeelingsSearchOption9), getString(R.string.depressionThoughtsFeelingsSearchOption10), getString(R.string.depressionThoughtsFeelingsSearchOption11), getString(R.string.depressionThoughtsFeelingsSearchOption12), getString(R.string.depressionThoughtsFeelingsSearchOption13), getString(R.string.depressionThoughtsFeelingsSearchOption14)));
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setBackgroundResource(R.drawable.button_border_gray);
            String string = getString(R.string.depressionThoughtsFeelingsOptions1);
            kotlin.jvm.internal.i.f(string, "getString(R.string.depre…ThoughtsFeelingsOptions1)");
            O(string, false, true);
            String string2 = getString(R.string.depressionThoughtsFeelingsOptions2);
            kotlin.jvm.internal.i.f(string2, "getString(R.string.depre…ThoughtsFeelingsOptions2)");
            O(string2, false, true);
            String string3 = getString(R.string.depressionThoughtsFeelingsOptions3);
            kotlin.jvm.internal.i.f(string3, "getString(R.string.depre…ThoughtsFeelingsOptions3)");
            O(string3, false, true);
            String string4 = getString(R.string.depressionThoughtsFeelingsOptions4);
            kotlin.jvm.internal.i.f(string4, "getString(R.string.depre…ThoughtsFeelingsOptions4)");
            O(string4, false, true);
            String string5 = getString(R.string.depressionThoughtsFeelingsOptions5);
            kotlin.jvm.internal.i.f(string5, "getString(R.string.depre…ThoughtsFeelingsOptions5)");
            O(string5, false, true);
            String string6 = getString(R.string.depressionThoughtsFeelingsOptions6);
            kotlin.jvm.internal.i.f(string6, "getString(R.string.depre…ThoughtsFeelingsOptions6)");
            O(string6, false, true);
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                ArrayList<String> arrayList2 = this.f30938x;
                String str = arrayList.get(i6);
                kotlin.jvm.internal.i.f(str, "sample[i]");
                arrayList2.add(gv.r.i1(str).toString());
            }
            ((Chip) _$_findCachedViewById(R.id.addChip)).setOnCloseIconClickListener(new View.OnClickListener(this) { // from class: rq.f

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ g f30934v;

                {
                    this.f30934v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i10 = r2;
                    g this$0 = this.f30934v;
                    switch (i10) {
                        case 0:
                            int i11 = g.B;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 1:
                            int i12 = g.B;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        default:
                            int i13 = g.B;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ArrayList<Chip> arrayList3 = this$0.f30936v;
                            if (arrayList3.isEmpty()) {
                                Toast.makeText(this$0.getActivity(), this$0.getString(R.string.depressionThoughtsErrorMessage01), 0).show();
                                return;
                            }
                            int size2 = arrayList3.size();
                            for (int i14 = 0; i14 < size2; i14++) {
                                androidx.fragment.app.p activity = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
                                ((DepressionThoughtsActivity) activity).D.add(arrayList3.get(i14).getText().toString());
                            }
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
                            ((DepressionThoughtsActivity) activity2).t0();
                            return;
                    }
                }
            });
            ((Chip) _$_findCachedViewById(R.id.addChip)).setOnClickListener(new View.OnClickListener(this) { // from class: rq.f

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ g f30934v;

                {
                    this.f30934v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i10 = r2;
                    g this$0 = this.f30934v;
                    switch (i10) {
                        case 0:
                            int i11 = g.B;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 1:
                            int i12 = g.B;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        default:
                            int i13 = g.B;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ArrayList<Chip> arrayList3 = this$0.f30936v;
                            if (arrayList3.isEmpty()) {
                                Toast.makeText(this$0.getActivity(), this$0.getString(R.string.depressionThoughtsErrorMessage01), 0).show();
                                return;
                            }
                            int size2 = arrayList3.size();
                            for (int i14 = 0; i14 < size2; i14++) {
                                androidx.fragment.app.p activity = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
                                ((DepressionThoughtsActivity) activity).D.add(arrayList3.get(i14).getText().toString());
                            }
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
                            ((DepressionThoughtsActivity) activity2).t0();
                            return;
                    }
                }
            });
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setOnClickListener(new View.OnClickListener(this) { // from class: rq.f

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ g f30934v;

                {
                    this.f30934v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i10 = r2;
                    g this$0 = this.f30934v;
                    switch (i10) {
                        case 0:
                            int i11 = g.B;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 1:
                            int i12 = g.B;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        default:
                            int i13 = g.B;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ArrayList<Chip> arrayList3 = this$0.f30936v;
                            if (arrayList3.isEmpty()) {
                                Toast.makeText(this$0.getActivity(), this$0.getString(R.string.depressionThoughtsErrorMessage01), 0).show();
                                return;
                            }
                            int size2 = arrayList3.size();
                            for (int i14 = 0; i14 < size2; i14++) {
                                androidx.fragment.app.p activity = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
                                ((DepressionThoughtsActivity) activity).D.add(arrayList3.get(i14).getText().toString());
                            }
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
                            ((DepressionThoughtsActivity) activity2).t0();
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30935u, "Depression Thoughts Feelins", e10);
        }
    }

    /* compiled from: DepressionThoughtsFeelingsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements TextWatcher {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Dialog f30942v;

        public a(Dialog dialog) {
            this.f30942v = dialog;
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
            Dialog dialog = this.f30942v;
            String lowerCase = String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editTextOption)).getText()).toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
            g gVar = g.this;
            gVar.getClass();
            try {
                int childCount = ((LinearLayout) dialog.findViewById(R.id.optionsContainerLayout)).getChildCount() - 1;
                for (int i12 = 0; i12 < childCount; i12++) {
                    RobertoTextView robertoTextView = (RobertoTextView) ((LinearLayout) dialog.findViewById(R.id.optionsContainerLayout)).getChildAt(i12).findViewById(R.id.optionTitle);
                    if (robertoTextView != null) {
                        String lowerCase2 = robertoTextView.getText().toString().toLowerCase();
                        kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase()");
                        if (gv.r.J0(lowerCase2, lowerCase)) {
                            ((LinearLayout) dialog.findViewById(R.id.optionsContainerLayout)).getChildAt(i12).setVisibility(0);
                        }
                    }
                    ((LinearLayout) dialog.findViewById(R.id.optionsContainerLayout)).getChildAt(i12).setVisibility(8);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(gVar.f30935u, "Exception in elastic search implementation " + e10.getMessage());
            }
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        }
    }
}
