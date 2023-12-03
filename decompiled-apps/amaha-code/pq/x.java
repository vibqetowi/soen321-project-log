package pq;

import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionMasteryActivity;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionMasterySingleSelectFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpq/x;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class x extends rr.b {
    public static final /* synthetic */ int A = 0;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap f28837z = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f28832u = LogHelper.INSTANCE.makeLogTag(x.class);

    /* renamed from: v  reason: collision with root package name */
    public String f28833v = "";

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList f28834w = new ArrayList();

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<String> f28835x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public final HashMap<String, Boolean> f28836y = new HashMap<>();

    public final void J(String str) {
        boolean z10;
        ArrayList arrayList = this.f28834w;
        try {
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String lowerCase = ((String) it.next()).toLowerCase();
                    kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
                    String lowerCase2 = str.toLowerCase();
                    kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase()");
                    if (kotlin.jvm.internal.i.b(lowerCase, lowerCase2)) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            if (z10) {
                arrayList.add(str);
                View inflate = getLayoutInflater().inflate(R.layout.row_screen_a6_radio, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)), false);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)).getChildCount() + 1);
                sb2.append('.');
                ((RobertoTextView) inflate.findViewById(R.id.rowNumber)).setText(sb2.toString());
                ((RobertoTextView) inflate.findViewById(R.id.rowTitle)).setText(str);
                ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)).addView(inflate);
                ((RadioButton) inflate.findViewById(R.id.radioToggle)).setClickable(false);
                ((ConstraintLayout) inflate.findViewById(R.id.parentLayout)).setOnClickListener(new nn.g(18, this, inflate, str));
                K(((RobertoTextView) inflate.findViewById(R.id.rowTitle)).getText().toString());
                ((RadioButton) inflate.findViewById(R.id.radioToggle)).setChecked(true);
                ((RadioButton) inflate.findViewById(R.id.radioToggle)).setButtonTintList(ColorStateList.valueOf(g0.a.b(requireActivity(), R.color.sea)));
                ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setBackground(a.c.b(requireContext(), R.drawable.button_dark_grey_fill));
                this.f28833v = str;
                return;
            }
            Toast.makeText(requireContext(), "Item already exists.", 0).show();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f28832u, "Error showing elastic search dialog.", e10);
        }
    }

    public final void K(String str) {
        int childCount = ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)).getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)).getChildAt(i6);
            if (!kotlin.jvm.internal.i.b(((RobertoTextView) childAt.findViewById(R.id.rowTitle)).getText(), str)) {
                ((RadioButton) childAt.findViewById(R.id.radioToggle)).setButtonTintList(ColorStateList.valueOf(g0.a.b(requireActivity(), R.color.title_high_contrast)));
                ((RadioButton) childAt.findViewById(R.id.radioToggle)).setChecked(false);
            }
        }
        this.f28833v = str;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f28837z;
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
        this.f28837z.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionMasteryRockHeader));
            ((RobertoTextView) _$_findCachedViewById(R.id.subheader)).setText(getString(R.string.depressionMasteryRockSubheader));
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
            boolean b10 = kotlin.jvm.internal.i.b(((DepressionMasteryActivity) activity).A, getString(R.string.depressionMasteryDayWeekday));
            ArrayList<String> arrayList = this.f28835x;
            ArrayList arrayList2 = this.f28834w;
            if (b10) {
                String string = getString(R.string.depressionMasteryRockRow1);
                kotlin.jvm.internal.i.f(string, "getString(R.string.depressionMasteryRockRow1)");
                arrayList2.add(string);
                String string2 = getString(R.string.depressionMasteryRockRow2);
                kotlin.jvm.internal.i.f(string2, "getString(R.string.depressionMasteryRockRow2)");
                arrayList2.add(string2);
                String string3 = getString(R.string.depressionMasteryRockRow3);
                kotlin.jvm.internal.i.f(string3, "getString(R.string.depressionMasteryRockRow3)");
                arrayList2.add(string3);
                String string4 = getString(R.string.depressionMasteryRockRow4);
                kotlin.jvm.internal.i.f(string4, "getString(R.string.depressionMasteryRockRow4)");
                arrayList2.add(string4);
                String string5 = getString(R.string.depressionMasteryRockRow5);
                kotlin.jvm.internal.i.f(string5, "getString(R.string.depressionMasteryRockRow5)");
                arrayList2.add(string5);
                String string6 = getString(R.string.depressionMasteryRockRow6);
                kotlin.jvm.internal.i.f(string6, "getString(R.string.depressionMasteryRockRow6)");
                arrayList2.add(string6);
                String string7 = getString(R.string.depressionMasteryRockRow7);
                kotlin.jvm.internal.i.f(string7, "getString(R.string.depressionMasteryRockRow7)");
                arrayList2.add(string7);
                String string8 = getString(R.string.depressionMasteryRockRow8);
                kotlin.jvm.internal.i.f(string8, "getString(R.string.depressionMasteryRockRow8)");
                arrayList2.add(string8);
                arrayList.add(getString(R.string.depressionMasteryRockSearch1));
                arrayList.add(getString(R.string.depressionMasteryRockSearch2));
                arrayList.add(getString(R.string.depressionMasteryRockSearch3));
                arrayList.add(getString(R.string.depressionMasteryRockSearch4));
                arrayList.add(getString(R.string.depressionMasteryRockSearch5));
                arrayList.add(getString(R.string.depressionMasteryRockSearch6));
                arrayList.add(getString(R.string.depressionMasteryRockSearch7));
            } else {
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                if (kotlin.jvm.internal.i.b(((DepressionMasteryActivity) activity2).A, getString(R.string.depressionMasteryDayWeekend))) {
                    String string9 = getString(R.string.depressionMasteryRockRowA1);
                    kotlin.jvm.internal.i.f(string9, "getString(R.string.depressionMasteryRockRowA1)");
                    arrayList2.add(string9);
                    String string10 = getString(R.string.depressionMasteryRockRowA2);
                    kotlin.jvm.internal.i.f(string10, "getString(R.string.depressionMasteryRockRowA2)");
                    arrayList2.add(string10);
                    String string11 = getString(R.string.depressionMasteryRockRowA3);
                    kotlin.jvm.internal.i.f(string11, "getString(R.string.depressionMasteryRockRowA3)");
                    arrayList2.add(string11);
                    String string12 = getString(R.string.depressionMasteryRockRowA4);
                    kotlin.jvm.internal.i.f(string12, "getString(R.string.depressionMasteryRockRowA4)");
                    arrayList2.add(string12);
                    String string13 = getString(R.string.depressionMasteryRockRowA5);
                    kotlin.jvm.internal.i.f(string13, "getString(R.string.depressionMasteryRockRowA5)");
                    arrayList2.add(string13);
                    String string14 = getString(R.string.depressionMasteryRockRowA6);
                    kotlin.jvm.internal.i.f(string14, "getString(R.string.depressionMasteryRockRowA6)");
                    arrayList2.add(string14);
                    String string15 = getString(R.string.depressionMasteryRockRowA7);
                    kotlin.jvm.internal.i.f(string15, "getString(R.string.depressionMasteryRockRowA7)");
                    arrayList2.add(string15);
                    String string16 = getString(R.string.depressionMasteryRockRowA8);
                    kotlin.jvm.internal.i.f(string16, "getString(R.string.depressionMasteryRockRowA8)");
                    arrayList2.add(string16);
                    arrayList.add(getString(R.string.depressionMasteryRockSearchA1));
                    arrayList.add(getString(R.string.depressionMasteryRockSearchA2));
                    arrayList.add(getString(R.string.depressionMasteryRockSearchA3));
                    arrayList.add(getString(R.string.depressionMasteryRockSearchA4));
                    arrayList.add(getString(R.string.depressionMasteryRockSearchA5));
                    arrayList.add(getString(R.string.depressionMasteryRockSearchA6));
                    arrayList.add(getString(R.string.depressionMasteryRockSearchA7));
                    arrayList.add(getString(R.string.depressionMasteryRockSearchA8));
                    arrayList.add(getString(R.string.depressionMasteryRockSearchA9));
                }
            }
            HashMap<String, Boolean> hashMap = this.f28836y;
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                String str = next;
                String str2 = next;
                hashMap.put(str, Boolean.FALSE);
            }
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            ScrollView a6ScrollView = (ScrollView) _$_findCachedViewById(R.id.a6ScrollView);
            kotlin.jvm.internal.i.f(a6ScrollView, "a6ScrollView");
            insetsUtils.addStatusBarHeight(a6ScrollView);
            ((RobertoButton) _$_findCachedViewById(R.id.btnAdd)).setVisibility(0);
            ((RobertoButton) _$_findCachedViewById(R.id.btnAdd)).setText(getString(R.string.depressionMasteryAddCTA));
            ((RobertoButton) _$_findCachedViewById(R.id.btnAdd)).setOnClickListener(new View.OnClickListener(this) { // from class: pq.v

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ x f28829v;

                {
                    this.f28829v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    x this$0 = this.f28829v;
                    switch (i6) {
                        case 0:
                            int i10 = x.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_screen_a22_search, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                                View childAt = ((LinearLayout) styledDialog.findViewById(R.id.optionsContainerLayout)).getChildAt(0);
                                kotlin.jvm.internal.i.e(childAt, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                                RobertoTextView robertoTextView = (RobertoTextView) childAt;
                                ((LinearLayout) styledDialog.findViewById(R.id.optionsContainerLayout)).removeViewAt(0);
                                ArrayList<String> arrayList3 = this$0.f28835x;
                                int size = arrayList3.size();
                                for (int i11 = 0; i11 < size; i11++) {
                                    HashMap<String, Boolean> hashMap2 = this$0.f28836y;
                                    if (hashMap2.get(arrayList3.get(i11)) != null) {
                                        Boolean bool = hashMap2.get(arrayList3.get(i11));
                                        kotlin.jvm.internal.i.d(bool);
                                        if (!bool.booleanValue()) {
                                            View inflate = this$0.getLayoutInflater().inflate(R.layout.grounding_picker_option_row, (ViewGroup) ((LinearLayout) this$0._$_findCachedViewById(R.id.optionsContainerLayout)), false);
                                            ((RobertoTextView) inflate.findViewById(R.id.optionTitle)).setText(arrayList3.get(i11));
                                            inflate.setOnClickListener(new nn.g(this$0, gv.r.i1(((RobertoTextView) inflate.findViewById(R.id.optionTitle)).getText().toString()).toString(), styledDialog, 17));
                                            ((LinearLayout) styledDialog.findViewById(R.id.optionsContainerLayout)).addView(inflate);
                                        }
                                    }
                                }
                                ((LinearLayout) styledDialog.findViewById(R.id.optionsContainerLayout)).addView(robertoTextView);
                                ((RobertoEditText) styledDialog.findViewById(R.id.editTextOption)).addTextChangedListener(new w(this$0, styledDialog));
                                ((RobertoEditText) styledDialog.findViewById(R.id.editTextOption)).setOnEditorActionListener(new oq.l(styledDialog, this$0, 3));
                                robertoTextView.setText(this$0.getString(R.string.depressionMasterySearchAdd));
                                robertoTextView.setOnClickListener(new ho.o(styledDialog, 24, this$0));
                                ((AppCompatImageView) styledDialog.findViewById(R.id.btnSelectionBack)).setOnClickListener(new nq.n(styledDialog, 6));
                                Window window = styledDialog.getWindow();
                                if (window != null) {
                                    window.setLayout(-1, -1);
                                }
                                Editable text = ((RobertoEditText) styledDialog.findViewById(R.id.editTextOption)).getText();
                                if (text != null) {
                                    text.clear();
                                }
                                styledDialog.show();
                                ((RobertoEditText) styledDialog.findViewById(R.id.editTextOption)).requestFocus();
                                Window window2 = styledDialog.getWindow();
                                if (window2 != null) {
                                    window2.setSoftInputMode(4);
                                    return;
                                }
                                return;
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f28832u, e10);
                                return;
                            }
                        default:
                            int i12 = x.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (kotlin.jvm.internal.i.b(this$0.f28833v, "")) {
                                Toast.makeText(this$0.requireContext(), this$0.getString(R.string.depressionMasterySelect1Error), 0).show();
                                return;
                            }
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                            String str3 = this$0.f28833v;
                            kotlin.jvm.internal.i.g(str3, "<set-?>");
                            ((DepressionMasteryActivity) activity3).B = str3;
                            androidx.fragment.app.p activity4 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                            ((DepressionMasteryActivity) activity4).t0();
                            return;
                    }
                }
            });
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setText(getString(R.string.depressionMasteryDoneCTA));
            Context requireContext = requireContext();
            Object obj = g0.a.f16164a;
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setBackground(a.c.b(requireContext, R.drawable.button_border_gray));
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setOnClickListener(new View.OnClickListener(this) { // from class: pq.v

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ x f28829v;

                {
                    this.f28829v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    x this$0 = this.f28829v;
                    switch (i6) {
                        case 0:
                            int i10 = x.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_screen_a22_search, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                                View childAt = ((LinearLayout) styledDialog.findViewById(R.id.optionsContainerLayout)).getChildAt(0);
                                kotlin.jvm.internal.i.e(childAt, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                                RobertoTextView robertoTextView = (RobertoTextView) childAt;
                                ((LinearLayout) styledDialog.findViewById(R.id.optionsContainerLayout)).removeViewAt(0);
                                ArrayList<String> arrayList3 = this$0.f28835x;
                                int size = arrayList3.size();
                                for (int i11 = 0; i11 < size; i11++) {
                                    HashMap<String, Boolean> hashMap2 = this$0.f28836y;
                                    if (hashMap2.get(arrayList3.get(i11)) != null) {
                                        Boolean bool = hashMap2.get(arrayList3.get(i11));
                                        kotlin.jvm.internal.i.d(bool);
                                        if (!bool.booleanValue()) {
                                            View inflate = this$0.getLayoutInflater().inflate(R.layout.grounding_picker_option_row, (ViewGroup) ((LinearLayout) this$0._$_findCachedViewById(R.id.optionsContainerLayout)), false);
                                            ((RobertoTextView) inflate.findViewById(R.id.optionTitle)).setText(arrayList3.get(i11));
                                            inflate.setOnClickListener(new nn.g(this$0, gv.r.i1(((RobertoTextView) inflate.findViewById(R.id.optionTitle)).getText().toString()).toString(), styledDialog, 17));
                                            ((LinearLayout) styledDialog.findViewById(R.id.optionsContainerLayout)).addView(inflate);
                                        }
                                    }
                                }
                                ((LinearLayout) styledDialog.findViewById(R.id.optionsContainerLayout)).addView(robertoTextView);
                                ((RobertoEditText) styledDialog.findViewById(R.id.editTextOption)).addTextChangedListener(new w(this$0, styledDialog));
                                ((RobertoEditText) styledDialog.findViewById(R.id.editTextOption)).setOnEditorActionListener(new oq.l(styledDialog, this$0, 3));
                                robertoTextView.setText(this$0.getString(R.string.depressionMasterySearchAdd));
                                robertoTextView.setOnClickListener(new ho.o(styledDialog, 24, this$0));
                                ((AppCompatImageView) styledDialog.findViewById(R.id.btnSelectionBack)).setOnClickListener(new nq.n(styledDialog, 6));
                                Window window = styledDialog.getWindow();
                                if (window != null) {
                                    window.setLayout(-1, -1);
                                }
                                Editable text = ((RobertoEditText) styledDialog.findViewById(R.id.editTextOption)).getText();
                                if (text != null) {
                                    text.clear();
                                }
                                styledDialog.show();
                                ((RobertoEditText) styledDialog.findViewById(R.id.editTextOption)).requestFocus();
                                Window window2 = styledDialog.getWindow();
                                if (window2 != null) {
                                    window2.setSoftInputMode(4);
                                    return;
                                }
                                return;
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f28832u, e10);
                                return;
                            }
                        default:
                            int i12 = x.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (kotlin.jvm.internal.i.b(this$0.f28833v, "")) {
                                Toast.makeText(this$0.requireContext(), this$0.getString(R.string.depressionMasterySelect1Error), 0).show();
                                return;
                            }
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                            String str3 = this$0.f28833v;
                            kotlin.jvm.internal.i.g(str3, "<set-?>");
                            ((DepressionMasteryActivity) activity3).B = str3;
                            androidx.fragment.app.p activity4 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                            ((DepressionMasteryActivity) activity4).t0();
                            return;
                    }
                }
            });
            int size = arrayList2.size();
            int i6 = 0;
            while (i6 < size) {
                View inflate = getLayoutInflater().inflate(R.layout.row_screen_a6_radio, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)), false);
                StringBuilder sb2 = new StringBuilder();
                int i10 = i6 + 1;
                sb2.append(i10);
                sb2.append('.');
                ((RobertoTextView) inflate.findViewById(R.id.rowNumber)).setText(sb2.toString());
                ((RobertoTextView) inflate.findViewById(R.id.rowTitle)).setText((CharSequence) arrayList2.get(i6));
                if (i6 == 0) {
                    inflate.findViewById(R.id.divider).setVisibility(8);
                }
                ((ConstraintLayout) inflate.findViewById(R.id.parentLayout)).setOnClickListener(new ho.o(this, 23, inflate));
                ((RadioButton) inflate.findViewById(R.id.radioToggle)).setClickable(false);
                ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)).addView(inflate);
                i6 = i10;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f28832u, e10);
        }
    }
}
