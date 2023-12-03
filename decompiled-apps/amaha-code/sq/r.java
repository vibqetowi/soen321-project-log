package sq;

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
import com.theinnerhour.b2b.activity.DepressionTimeoutActivity;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionTimeoutSingleSelectFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsq/r;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class r extends rr.b {
    public static final /* synthetic */ int B = 0;
    public final LinkedHashMap A = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f31910u = LogHelper.INSTANCE.makeLogTag(r.class);

    /* renamed from: v  reason: collision with root package name */
    public String f31911v = "";

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList f31912w = new ArrayList();

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<String> f31913x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<String> f31914y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public int f31915z;

    public final void J(String str) {
        boolean z10;
        try {
            if (((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)).getChildCount() > this.f31915z) {
                ((RobertoTextView) ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)).getChildAt(((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)).getChildCount() - 1).findViewById(R.id.rowTitle)).setText(str);
                this.f31911v = str;
                return;
            }
            ArrayList arrayList = this.f31912w;
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
                ((ConstraintLayout) inflate.findViewById(R.id.parentLayout)).setOnClickListener(new nn.g(22, this, inflate, str));
                K(((RobertoTextView) inflate.findViewById(R.id.rowTitle)).getText().toString());
                ((RadioButton) inflate.findViewById(R.id.radioToggle)).setChecked(true);
                ((RadioButton) inflate.findViewById(R.id.radioToggle)).setButtonTintList(ColorStateList.valueOf(g0.a.b(requireActivity(), R.color.sea)));
                ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setBackground(a.c.b(requireContext(), R.drawable.button_dark_grey_fill));
                this.f31911v = str;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f31910u, e10);
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
        this.f31911v = str;
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
        return inflater.inflate(R.layout.fragment_screen_a6, viewGroup, false);
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
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            ScrollView a6ScrollView = (ScrollView) _$_findCachedViewById(R.id.a6ScrollView);
            kotlin.jvm.internal.i.f(a6ScrollView, "a6ScrollView");
            insetsUtils.addStatusBarHeight(a6ScrollView);
            ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionTimeoutSingleSelectHead));
            ((RobertoTextView) _$_findCachedViewById(R.id.subheader)).setText(getString(R.string.depressionTimeoutSingleSelectSubHead));
            ArrayList<String> arrayList = this.f31913x;
            arrayList.add(getString(R.string.depressionTimeoutOptions1));
            arrayList.add(getString(R.string.depressionTimeoutOptions2));
            arrayList.add(getString(R.string.depressionTimeoutOptions3));
            arrayList.add(getString(R.string.depressionTimeoutOptions4));
            arrayList.add(getString(R.string.depressionTimeoutOptions5));
            arrayList.add(getString(R.string.depressionTimeoutOptions6));
            arrayList.add(getString(R.string.depressionTimeoutOptions7));
            ArrayList<String> arrayList2 = this.f31914y;
            arrayList2.add(getString(R.string.depressionTimeoutSearchOptions0));
            arrayList2.add(getString(R.string.depressionTimeoutSearchOptions1));
            arrayList2.add(getString(R.string.depressionTimeoutSearchOptions2));
            arrayList2.add(getString(R.string.depressionTimeoutSearchOptions3));
            arrayList2.add(getString(R.string.depressionTimeoutSearchOptions4));
            arrayList2.add(getString(R.string.depressionTimeoutSearchOptions5));
            arrayList2.add(getString(R.string.depressionTimeoutSearchOptions6));
            arrayList2.add(getString(R.string.depressionTimeoutSearchOptions7));
            arrayList2.add(getString(R.string.depressionTimeoutSearchOptions8));
            arrayList2.add(getString(R.string.depressionTimeoutSearchOptions9));
            arrayList2.add(getString(R.string.depressionTimeoutSearchOptions10));
            arrayList2.add(getString(R.string.depressionTimeoutSearchOptions11));
            ((RobertoButton) _$_findCachedViewById(R.id.btnAdd)).setVisibility(0);
            ((RobertoButton) _$_findCachedViewById(R.id.btnAdd)).setText(getString(R.string.depressionTimeoutAddButtonText));
            ((RobertoButton) _$_findCachedViewById(R.id.btnAdd)).setOnClickListener(new View.OnClickListener(this) { // from class: sq.o

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ r f31904v;

                {
                    this.f31904v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    r this$0 = this.f31904v;
                    int i10 = 1;
                    switch (i6) {
                        case 0:
                            int i11 = r.B;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_screen_a22_search, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                            ((RobertoTextView) styledDialog.findViewById(R.id.addNew)).setText(this$0.getString(R.string.depressionTimeoutSearchCTA));
                            View childAt = ((LinearLayout) styledDialog.findViewById(R.id.optionsContainerLayout)).getChildAt(0);
                            kotlin.jvm.internal.i.e(childAt, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                            RobertoTextView robertoTextView = (RobertoTextView) childAt;
                            ((LinearLayout) styledDialog.findViewById(R.id.optionsContainerLayout)).removeViewAt(0);
                            ArrayList<String> arrayList3 = this$0.f31914y;
                            int size = arrayList3.size();
                            while (i10 < size) {
                                View inflate = this$0.getLayoutInflater().inflate(R.layout.grounding_picker_option_row, (ViewGroup) ((LinearLayout) this$0._$_findCachedViewById(R.id.optionsContainerLayout)), false);
                                ((RobertoTextView) inflate.findViewById(R.id.optionTitle)).setText(arrayList3.get(i10));
                                inflate.setOnClickListener(new nn.g(this$0, gv.r.i1(((RobertoTextView) inflate.findViewById(R.id.optionTitle)).getText().toString()).toString(), styledDialog, 21));
                                ((LinearLayout) styledDialog.findViewById(R.id.optionsContainerLayout)).addView(inflate);
                                i10++;
                            }
                            ((LinearLayout) styledDialog.findViewById(R.id.optionsContainerLayout)).addView(robertoTextView);
                            ((RobertoEditText) styledDialog.findViewById(R.id.editTextOption)).addTextChangedListener(new q(styledDialog, this$0));
                            ((RobertoEditText) styledDialog.findViewById(R.id.editTextOption)).setOnEditorActionListener(new oq.l(styledDialog, this$0, 6));
                            robertoTextView.setOnClickListener(new p(styledDialog, this$0));
                            ((AppCompatImageView) styledDialog.findViewById(R.id.btnSelectionBack)).setOnClickListener(new nq.n(styledDialog, 13));
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
                        default:
                            int i12 = r.B;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (gv.r.i1(this$0.f31911v).toString().length() != 0) {
                                i10 = 0;
                            }
                            if (i10 == 0) {
                                androidx.fragment.app.p activity = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionTimeoutActivity");
                                String str = this$0.f31911v;
                                kotlin.jvm.internal.i.g(str, "<set-?>");
                                ((DepressionTimeoutActivity) activity).B = str;
                                androidx.fragment.app.p activity2 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionTimeoutActivity");
                                ((DepressionTimeoutActivity) activity2).t0();
                                return;
                            }
                            Toast.makeText(this$0.requireContext(), this$0.getText(R.string.depressionTimeoutErrorMessages), 0).show();
                            return;
                    }
                }
            });
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setEnabled(true);
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setText(getString(R.string.depressionTimeoutSingleSelectCTA));
            Context requireContext = requireContext();
            Object obj = g0.a.f16164a;
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setBackground(a.c.b(requireContext, R.drawable.button_border_gray));
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setOnClickListener(new View.OnClickListener(this) { // from class: sq.o

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ r f31904v;

                {
                    this.f31904v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    r this$0 = this.f31904v;
                    int i10 = 1;
                    switch (i6) {
                        case 0:
                            int i11 = r.B;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_screen_a22_search, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                            ((RobertoTextView) styledDialog.findViewById(R.id.addNew)).setText(this$0.getString(R.string.depressionTimeoutSearchCTA));
                            View childAt = ((LinearLayout) styledDialog.findViewById(R.id.optionsContainerLayout)).getChildAt(0);
                            kotlin.jvm.internal.i.e(childAt, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                            RobertoTextView robertoTextView = (RobertoTextView) childAt;
                            ((LinearLayout) styledDialog.findViewById(R.id.optionsContainerLayout)).removeViewAt(0);
                            ArrayList<String> arrayList3 = this$0.f31914y;
                            int size = arrayList3.size();
                            while (i10 < size) {
                                View inflate = this$0.getLayoutInflater().inflate(R.layout.grounding_picker_option_row, (ViewGroup) ((LinearLayout) this$0._$_findCachedViewById(R.id.optionsContainerLayout)), false);
                                ((RobertoTextView) inflate.findViewById(R.id.optionTitle)).setText(arrayList3.get(i10));
                                inflate.setOnClickListener(new nn.g(this$0, gv.r.i1(((RobertoTextView) inflate.findViewById(R.id.optionTitle)).getText().toString()).toString(), styledDialog, 21));
                                ((LinearLayout) styledDialog.findViewById(R.id.optionsContainerLayout)).addView(inflate);
                                i10++;
                            }
                            ((LinearLayout) styledDialog.findViewById(R.id.optionsContainerLayout)).addView(robertoTextView);
                            ((RobertoEditText) styledDialog.findViewById(R.id.editTextOption)).addTextChangedListener(new q(styledDialog, this$0));
                            ((RobertoEditText) styledDialog.findViewById(R.id.editTextOption)).setOnEditorActionListener(new oq.l(styledDialog, this$0, 6));
                            robertoTextView.setOnClickListener(new p(styledDialog, this$0));
                            ((AppCompatImageView) styledDialog.findViewById(R.id.btnSelectionBack)).setOnClickListener(new nq.n(styledDialog, 13));
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
                        default:
                            int i12 = r.B;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (gv.r.i1(this$0.f31911v).toString().length() != 0) {
                                i10 = 0;
                            }
                            if (i10 == 0) {
                                androidx.fragment.app.p activity = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionTimeoutActivity");
                                String str = this$0.f31911v;
                                kotlin.jvm.internal.i.g(str, "<set-?>");
                                ((DepressionTimeoutActivity) activity).B = str;
                                androidx.fragment.app.p activity2 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionTimeoutActivity");
                                ((DepressionTimeoutActivity) activity2).t0();
                                return;
                            }
                            Toast.makeText(this$0.requireContext(), this$0.getText(R.string.depressionTimeoutErrorMessages), 0).show();
                            return;
                    }
                }
            });
            int size = arrayList.size();
            int i6 = 0;
            while (true) {
                ArrayList arrayList3 = this.f31912w;
                if (i6 < size) {
                    View inflate = getLayoutInflater().inflate(R.layout.row_screen_a6_radio, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)), false);
                    StringBuilder sb2 = new StringBuilder();
                    int i10 = i6 + 1;
                    sb2.append(i10);
                    sb2.append('.');
                    ((RobertoTextView) inflate.findViewById(R.id.rowNumber)).setText(sb2.toString());
                    ((RobertoTextView) inflate.findViewById(R.id.rowTitle)).setText(arrayList.get(i6));
                    String str = arrayList.get(i6);
                    kotlin.jvm.internal.i.f(str, "options[i]");
                    arrayList3.add(str);
                    if (i6 == 0) {
                        inflate.findViewById(R.id.divider).setVisibility(8);
                    }
                    ((ConstraintLayout) inflate.findViewById(R.id.parentLayout)).setOnClickListener(new p(this, 0, inflate));
                    ((RadioButton) inflate.findViewById(R.id.radioToggle)).setClickable(false);
                    ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)).addView(inflate);
                    i6 = i10;
                } else {
                    this.f31915z = arrayList3.size();
                    return;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f31910u, e10);
        }
    }
}
