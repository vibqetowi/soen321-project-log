package pq;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
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
import java.util.Map;
import kotlin.Metadata;
/* compiled from: DepressionMasteryMultiSelectFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpq/m;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class m extends rr.b {
    public static final /* synthetic */ int C = 0;
    public final LinkedHashMap B = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f28795u = LogHelper.INSTANCE.makeLogTag(m.class);

    /* renamed from: v  reason: collision with root package name */
    public final HashMap<String, Boolean> f28796v = new HashMap<>();

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList f28797w = new ArrayList();

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<String> f28798x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public int f28799y = -1;

    /* renamed from: z  reason: collision with root package name */
    public int f28800z = -1;
    public final HashMap<String, Boolean> A = new HashMap<>();

    public final void J(View view, String str) {
        HashMap<String, Boolean> hashMap = this.f28796v;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Boolean> entry : hashMap.entrySet()) {
            if (entry.getValue().booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.size() == this.f28800z) {
            if (hashMap.containsKey(str)) {
                Boolean bool = hashMap.get(str);
                kotlin.jvm.internal.i.d(bool);
                if (bool.booleanValue()) {
                    ((AppCompatImageView) view.findViewById(R.id.rowCheck)).setBackgroundResource(R.drawable.ic_empty_circle_grey);
                    hashMap.put(str, Boolean.FALSE);
                    return;
                }
                Context context = getContext();
                kotlin.jvm.internal.i.d(context);
                Toast.makeText(context, "You have already selected " + this.f28800z + " items.", 0).show();
                return;
            }
            Context context2 = getContext();
            kotlin.jvm.internal.i.d(context2);
            Toast.makeText(context2, "You have already selected " + this.f28800z + " items.", 0).show();
        } else if (hashMap.containsKey(str)) {
            Boolean bool2 = hashMap.get(str);
            kotlin.jvm.internal.i.d(bool2);
            hashMap.put(str, Boolean.valueOf(!bool2.booleanValue()));
            Boolean bool3 = hashMap.get(str);
            kotlin.jvm.internal.i.d(bool3);
            if (bool3.booleanValue()) {
                ((AppCompatImageView) view.findViewById(R.id.rowCheck)).setImageResource(R.drawable.ic_right);
                ((AppCompatImageView) view.findViewById(R.id.rowCheck)).setColorFilter(Color.argb(255, 255, 255, 255));
                ((AppCompatImageView) view.findViewById(R.id.rowCheck)).setBackgroundResource(R.drawable.circle_blue);
                return;
            }
            ((AppCompatImageView) view.findViewById(R.id.rowCheck)).setBackgroundResource(R.drawable.ic_empty_circle_grey);
        } else {
            hashMap.put(str, Boolean.TRUE);
            ((AppCompatImageView) view.findViewById(R.id.rowCheck)).setImageResource(R.drawable.ic_right);
            ((AppCompatImageView) view.findViewById(R.id.rowCheck)).setColorFilter(Color.argb(255, 255, 255, 255));
            ((AppCompatImageView) view.findViewById(R.id.rowCheck)).setBackgroundResource(R.drawable.circle_blue);
        }
    }

    public final void K(String str) {
        boolean z10;
        ArrayList arrayList = this.f28797w;
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
                View inflate = getLayoutInflater().inflate(R.layout.row_screen_a6, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)), false);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)).getChildCount() + 1);
                sb2.append('.');
                ((RobertoTextView) inflate.findViewById(R.id.rowNumber)).setText(sb2.toString());
                ((RobertoTextView) inflate.findViewById(R.id.rowTitle)).setText(str);
                ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)).addView(inflate);
                ((ConstraintLayout) inflate.findViewById(R.id.parentLayout)).setOnClickListener(new k(this, inflate, 1));
                J(inflate, ((RobertoTextView) inflate.findViewById(R.id.rowTitle)).getText().toString());
                M();
                arrayList.add(str);
                return;
            }
            Context context = getContext();
            kotlin.jvm.internal.i.d(context);
            Toast.makeText(context, "Item already exists.", 0).show();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f28795u, e10);
        }
    }

    public final void M() {
        HashMap<String, Boolean> hashMap = this.f28796v;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Boolean> entry : hashMap.entrySet()) {
            if (entry.getValue().booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!linkedHashMap.isEmpty()) {
            Context context = getContext();
            kotlin.jvm.internal.i.d(context);
            Object obj = g0.a.f16164a;
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setBackground(a.c.b(context, R.drawable.button_dark_grey_fill));
            return;
        }
        Context context2 = getContext();
        kotlin.jvm.internal.i.d(context2);
        Object obj2 = g0.a.f16164a;
        ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setBackground(a.c.b(context2, R.drawable.button_border_gray));
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.B;
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
        return inflater.inflate(R.layout.fragment_screen_a7, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.B.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        try {
            ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)).setVisibility(0);
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            ScrollView a7ScrollView = (ScrollView) _$_findCachedViewById(R.id.a7ScrollView);
            kotlin.jvm.internal.i.f(a7ScrollView, "a7ScrollView");
            insetsUtils.addStatusBarHeight(a7ScrollView);
            this.f28799y = requireArguments().getInt("multiSelect");
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
            boolean b10 = kotlin.jvm.internal.i.b(((DepressionMasteryActivity) activity).A, getString(R.string.depressionMasteryDayWeekday));
            ArrayList<String> arrayList = this.f28798x;
            ArrayList arrayList2 = this.f28797w;
            if (b10) {
                if (this.f28799y == 1) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionMasteryPebbleHeader));
                    ((RobertoTextView) _$_findCachedViewById(R.id.subheader)).setText(getString(R.string.depressionMasteryPebbleSubheader));
                    String string = getString(R.string.depressionMasteryPebbleRow1);
                    kotlin.jvm.internal.i.f(string, "getString(R.string.depressionMasteryPebbleRow1)");
                    arrayList2.add(string);
                    String string2 = getString(R.string.depressionMasteryPebbleRow2);
                    kotlin.jvm.internal.i.f(string2, "getString(R.string.depressionMasteryPebbleRow2)");
                    arrayList2.add(string2);
                    String string3 = getString(R.string.depressionMasteryPebbleRow3);
                    kotlin.jvm.internal.i.f(string3, "getString(R.string.depressionMasteryPebbleRow3)");
                    arrayList2.add(string3);
                    String string4 = getString(R.string.depressionMasteryPebbleRow4);
                    kotlin.jvm.internal.i.f(string4, "getString(R.string.depressionMasteryPebbleRow4)");
                    arrayList2.add(string4);
                    String string5 = getString(R.string.depressionMasteryPebbleRow5);
                    kotlin.jvm.internal.i.f(string5, "getString(R.string.depressionMasteryPebbleRow5)");
                    arrayList2.add(string5);
                    String string6 = getString(R.string.depressionMasteryPebbleRow6);
                    kotlin.jvm.internal.i.f(string6, "getString(R.string.depressionMasteryPebbleRow6)");
                    arrayList2.add(string6);
                    String string7 = getString(R.string.depressionMasteryPebbleRow7);
                    kotlin.jvm.internal.i.f(string7, "getString(R.string.depressionMasteryPebbleRow7)");
                    arrayList2.add(string7);
                    String string8 = getString(R.string.depressionMasteryPebbleRow8);
                    kotlin.jvm.internal.i.f(string8, "getString(R.string.depressionMasteryPebbleRow8)");
                    arrayList2.add(string8);
                    arrayList.add(getString(R.string.depressionMasteryPebbleSearch1));
                    arrayList.add(getString(R.string.depressionMasteryPebbleSearch2));
                    arrayList.add(getString(R.string.depressionMasteryPebbleSearch3));
                    arrayList.add(getString(R.string.depressionMasteryPebbleSearch4));
                    arrayList.add(getString(R.string.depressionMasteryPebbleSearch5));
                    arrayList.add(getString(R.string.depressionMasteryPebbleSearch6));
                    arrayList.add(getString(R.string.depressionMasteryPebbleSearch7));
                } else {
                    ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionMasterySandHeader));
                    ((RobertoTextView) _$_findCachedViewById(R.id.subheader)).setText(getString(R.string.depressionMasterySandSubheader));
                    String string9 = getString(R.string.depressionMasterySandRow1);
                    kotlin.jvm.internal.i.f(string9, "getString(R.string.depressionMasterySandRow1)");
                    arrayList2.add(string9);
                    String string10 = getString(R.string.depressionMasterySandRow2);
                    kotlin.jvm.internal.i.f(string10, "getString(R.string.depressionMasterySandRow2)");
                    arrayList2.add(string10);
                    String string11 = getString(R.string.depressionMasterySandRow3);
                    kotlin.jvm.internal.i.f(string11, "getString(R.string.depressionMasterySandRow3)");
                    arrayList2.add(string11);
                    String string12 = getString(R.string.depressionMasterySandRow4);
                    kotlin.jvm.internal.i.f(string12, "getString(R.string.depressionMasterySandRow4)");
                    arrayList2.add(string12);
                    String string13 = getString(R.string.depressionMasterySandRow5);
                    kotlin.jvm.internal.i.f(string13, "getString(R.string.depressionMasterySandRow5)");
                    arrayList2.add(string13);
                    String string14 = getString(R.string.depressionMasterySandRow6);
                    kotlin.jvm.internal.i.f(string14, "getString(R.string.depressionMasterySandRow6)");
                    arrayList2.add(string14);
                    String string15 = getString(R.string.depressionMasterySandRow7);
                    kotlin.jvm.internal.i.f(string15, "getString(R.string.depressionMasterySandRow7)");
                    arrayList2.add(string15);
                    String string16 = getString(R.string.depressionMasterySandRow8);
                    kotlin.jvm.internal.i.f(string16, "getString(R.string.depressionMasterySandRow8)");
                    arrayList2.add(string16);
                    arrayList.add(getString(R.string.depressionMasterySandSearch1));
                    arrayList.add(getString(R.string.depressionMasterySandSearch2));
                    arrayList.add(getString(R.string.depressionMasterySandSearch3));
                    arrayList.add(getString(R.string.depressionMasterySandSearch4));
                    arrayList.add(getString(R.string.depressionMasterySandSearch5));
                    arrayList.add(getString(R.string.depressionMasterySandSearch6));
                    arrayList.add(getString(R.string.depressionMasterySandSearch7));
                }
            } else {
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                if (kotlin.jvm.internal.i.b(((DepressionMasteryActivity) activity2).A, getString(R.string.depressionMasteryDayWeekend))) {
                    if (this.f28799y == 1) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionMasteryPebbleHeader));
                        ((RobertoTextView) _$_findCachedViewById(R.id.subheader)).setText(getString(R.string.depressionMasteryPebbleSubheader));
                        String string17 = getString(R.string.depressionMasteryPebbleRowA1);
                        kotlin.jvm.internal.i.f(string17, "getString(R.string.depressionMasteryPebbleRowA1)");
                        arrayList2.add(string17);
                        String string18 = getString(R.string.depressionMasteryPebbleRowA2);
                        kotlin.jvm.internal.i.f(string18, "getString(R.string.depressionMasteryPebbleRowA2)");
                        arrayList2.add(string18);
                        String string19 = getString(R.string.depressionMasteryPebbleRowA3);
                        kotlin.jvm.internal.i.f(string19, "getString(R.string.depressionMasteryPebbleRowA3)");
                        arrayList2.add(string19);
                        String string20 = getString(R.string.depressionMasteryPebbleRowA4);
                        kotlin.jvm.internal.i.f(string20, "getString(R.string.depressionMasteryPebbleRowA4)");
                        arrayList2.add(string20);
                        String string21 = getString(R.string.depressionMasteryPebbleRowA5);
                        kotlin.jvm.internal.i.f(string21, "getString(R.string.depressionMasteryPebbleRowA5)");
                        arrayList2.add(string21);
                        String string22 = getString(R.string.depressionMasteryPebbleRowA6);
                        kotlin.jvm.internal.i.f(string22, "getString(R.string.depressionMasteryPebbleRowA6)");
                        arrayList2.add(string22);
                        String string23 = getString(R.string.depressionMasteryPebbleRowA7);
                        kotlin.jvm.internal.i.f(string23, "getString(R.string.depressionMasteryPebbleRowA7)");
                        arrayList2.add(string23);
                        String string24 = getString(R.string.depressionMasteryPebbleRowA8);
                        kotlin.jvm.internal.i.f(string24, "getString(R.string.depressionMasteryPebbleRowA8)");
                        arrayList2.add(string24);
                        arrayList.add(getString(R.string.depressionMasteryPebbleSearchA1));
                        arrayList.add(getString(R.string.depressionMasteryPebbleSearchA2));
                        arrayList.add(getString(R.string.depressionMasteryPebbleSearchA3));
                        arrayList.add(getString(R.string.depressionMasteryPebbleSearchA4));
                    } else {
                        ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionMasterySandHeader));
                        ((RobertoTextView) _$_findCachedViewById(R.id.subheader)).setText(getString(R.string.depressionMasterySandSubheader));
                        String string25 = getString(R.string.depressionMasterySandRowA1);
                        kotlin.jvm.internal.i.f(string25, "getString(R.string.depressionMasterySandRowA1)");
                        arrayList2.add(string25);
                        String string26 = getString(R.string.depressionMasterySandRow2);
                        kotlin.jvm.internal.i.f(string26, "getString(R.string.depressionMasterySandRow2)");
                        arrayList2.add(string26);
                        String string27 = getString(R.string.depressionMasterySandRow3);
                        kotlin.jvm.internal.i.f(string27, "getString(R.string.depressionMasterySandRow3)");
                        arrayList2.add(string27);
                        String string28 = getString(R.string.depressionMasterySandRow4);
                        kotlin.jvm.internal.i.f(string28, "getString(R.string.depressionMasterySandRow4)");
                        arrayList2.add(string28);
                        String string29 = getString(R.string.depressionMasterySandRow5);
                        kotlin.jvm.internal.i.f(string29, "getString(R.string.depressionMasterySandRow5)");
                        arrayList2.add(string29);
                        String string30 = getString(R.string.depressionMasterySandRow6);
                        kotlin.jvm.internal.i.f(string30, "getString(R.string.depressionMasterySandRow6)");
                        arrayList2.add(string30);
                        String string31 = getString(R.string.depressionMasterySandRow7);
                        kotlin.jvm.internal.i.f(string31, "getString(R.string.depressionMasterySandRow7)");
                        arrayList2.add(string31);
                        String string32 = getString(R.string.depressionMasterySandRow8);
                        kotlin.jvm.internal.i.f(string32, "getString(R.string.depressionMasterySandRow8)");
                        arrayList2.add(string32);
                        arrayList.add(getString(R.string.depressionMasterySandSearch1));
                        arrayList.add(getString(R.string.depressionMasterySandSearch2));
                        arrayList.add(getString(R.string.depressionMasterySandSearch3));
                        arrayList.add(getString(R.string.depressionMasterySandSearch4));
                        arrayList.add(getString(R.string.depressionMasterySandSearch5));
                        arrayList.add(getString(R.string.depressionMasterySandSearch6));
                        arrayList.add(getString(R.string.depressionMasterySandSearch7));
                    }
                }
            }
            HashMap<String, Boolean> hashMap = this.A;
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                String str = next;
                String str2 = next;
                hashMap.put(str, Boolean.FALSE);
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btnAdd)).setText(getString(R.string.depressionMasteryAddCTA));
            ((RobertoButton) _$_findCachedViewById(R.id.btnAdd)).setOnClickListener(new View.OnClickListener(this) { // from class: pq.j

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ m f28789v;

                {
                    this.f28789v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    m this$0 = this.f28789v;
                    switch (i6) {
                        case 0:
                            int i10 = m.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_screen_a22_search, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                            View childAt = ((LinearLayout) styledDialog.findViewById(R.id.optionsContainerLayout)).getChildAt(0);
                            kotlin.jvm.internal.i.e(childAt, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                            RobertoTextView robertoTextView = (RobertoTextView) childAt;
                            ((LinearLayout) styledDialog.findViewById(R.id.optionsContainerLayout)).removeViewAt(0);
                            Iterator<String> it2 = this$0.f28798x.iterator();
                            while (it2.hasNext()) {
                                String next2 = it2.next();
                                HashMap<String, Boolean> hashMap2 = this$0.A;
                                if (hashMap2.get(next2) != null) {
                                    Boolean bool = hashMap2.get(next2);
                                    kotlin.jvm.internal.i.d(bool);
                                    if (!bool.booleanValue()) {
                                        View inflate = this$0.getLayoutInflater().inflate(R.layout.grounding_picker_option_row, (ViewGroup) ((LinearLayout) this$0._$_findCachedViewById(R.id.optionsContainerLayout)), false);
                                        ((RobertoTextView) inflate.findViewById(R.id.optionTitle)).setText(next2);
                                        inflate.setOnClickListener(new nn.g(this$0, gv.r.i1(((RobertoTextView) inflate.findViewById(R.id.optionTitle)).getText().toString()).toString(), styledDialog, 16));
                                        ((LinearLayout) styledDialog.findViewById(R.id.optionsContainerLayout)).addView(inflate);
                                    }
                                }
                            }
                            ((LinearLayout) styledDialog.findViewById(R.id.optionsContainerLayout)).addView(robertoTextView);
                            robertoTextView.setText(this$0.getString(R.string.depressionMasteryAddToMyDay));
                            ((RobertoEditText) styledDialog.findViewById(R.id.editTextOption)).addTextChangedListener(new l(this$0, styledDialog));
                            ((RobertoEditText) styledDialog.findViewById(R.id.editTextOption)).setOnEditorActionListener(new oq.l(styledDialog, this$0, 2));
                            robertoTextView.setOnClickListener(new ho.o(styledDialog, 22, this$0));
                            ((AppCompatImageView) styledDialog.findViewById(R.id.btnSelectionBack)).setOnClickListener(new nq.n(styledDialog, 4));
                            Window window = styledDialog.getWindow();
                            if (window != null) {
                                window.setLayout(-1, -1);
                            }
                            Editable text = ((RobertoEditText) styledDialog.findViewById(R.id.editTextOption)).getText();
                            if (text != null) {
                                text.clear();
                            }
                            styledDialog.show();
                            return;
                        default:
                            int i11 = m.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            HashMap<String, Boolean> hashMap3 = this$0.f28796v;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry<String, Boolean> entry : hashMap3.entrySet()) {
                                if (entry.getValue().booleanValue()) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                            if (linkedHashMap.isEmpty()) {
                                Context context = this$0.getContext();
                                kotlin.jvm.internal.i.d(context);
                                Toast.makeText(context, "Please select at least 1 to continue.", 0).show();
                                return;
                            }
                            int i12 = this$0.f28799y;
                            if (i12 != 1) {
                                if (i12 == 2) {
                                    androidx.fragment.app.p activity3 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                                    DepressionMasteryActivity depressionMasteryActivity = (DepressionMasteryActivity) activity3;
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    for (Map.Entry<String, Boolean> entry2 : hashMap3.entrySet()) {
                                        if (entry2.getValue().booleanValue()) {
                                            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                                        }
                                    }
                                    depressionMasteryActivity.D = new ArrayList<>(linkedHashMap2.keySet());
                                }
                            } else {
                                androidx.fragment.app.p activity4 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                                DepressionMasteryActivity depressionMasteryActivity2 = (DepressionMasteryActivity) activity4;
                                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                for (Map.Entry<String, Boolean> entry3 : hashMap3.entrySet()) {
                                    if (entry3.getValue().booleanValue()) {
                                        linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                                    }
                                }
                                depressionMasteryActivity2.C = new ArrayList<>(linkedHashMap3.keySet());
                            }
                            androidx.fragment.app.p activity5 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                            ((DepressionMasteryActivity) activity5).t0();
                            return;
                    }
                }
            });
            Context context = getContext();
            kotlin.jvm.internal.i.d(context);
            Object obj = g0.a.f16164a;
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setBackground(a.c.b(context, R.drawable.button_border_gray));
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setOnClickListener(new View.OnClickListener(this) { // from class: pq.j

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ m f28789v;

                {
                    this.f28789v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    m this$0 = this.f28789v;
                    switch (i6) {
                        case 0:
                            int i10 = m.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_screen_a22_search, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                            View childAt = ((LinearLayout) styledDialog.findViewById(R.id.optionsContainerLayout)).getChildAt(0);
                            kotlin.jvm.internal.i.e(childAt, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                            RobertoTextView robertoTextView = (RobertoTextView) childAt;
                            ((LinearLayout) styledDialog.findViewById(R.id.optionsContainerLayout)).removeViewAt(0);
                            Iterator<String> it2 = this$0.f28798x.iterator();
                            while (it2.hasNext()) {
                                String next2 = it2.next();
                                HashMap<String, Boolean> hashMap2 = this$0.A;
                                if (hashMap2.get(next2) != null) {
                                    Boolean bool = hashMap2.get(next2);
                                    kotlin.jvm.internal.i.d(bool);
                                    if (!bool.booleanValue()) {
                                        View inflate = this$0.getLayoutInflater().inflate(R.layout.grounding_picker_option_row, (ViewGroup) ((LinearLayout) this$0._$_findCachedViewById(R.id.optionsContainerLayout)), false);
                                        ((RobertoTextView) inflate.findViewById(R.id.optionTitle)).setText(next2);
                                        inflate.setOnClickListener(new nn.g(this$0, gv.r.i1(((RobertoTextView) inflate.findViewById(R.id.optionTitle)).getText().toString()).toString(), styledDialog, 16));
                                        ((LinearLayout) styledDialog.findViewById(R.id.optionsContainerLayout)).addView(inflate);
                                    }
                                }
                            }
                            ((LinearLayout) styledDialog.findViewById(R.id.optionsContainerLayout)).addView(robertoTextView);
                            robertoTextView.setText(this$0.getString(R.string.depressionMasteryAddToMyDay));
                            ((RobertoEditText) styledDialog.findViewById(R.id.editTextOption)).addTextChangedListener(new l(this$0, styledDialog));
                            ((RobertoEditText) styledDialog.findViewById(R.id.editTextOption)).setOnEditorActionListener(new oq.l(styledDialog, this$0, 2));
                            robertoTextView.setOnClickListener(new ho.o(styledDialog, 22, this$0));
                            ((AppCompatImageView) styledDialog.findViewById(R.id.btnSelectionBack)).setOnClickListener(new nq.n(styledDialog, 4));
                            Window window = styledDialog.getWindow();
                            if (window != null) {
                                window.setLayout(-1, -1);
                            }
                            Editable text = ((RobertoEditText) styledDialog.findViewById(R.id.editTextOption)).getText();
                            if (text != null) {
                                text.clear();
                            }
                            styledDialog.show();
                            return;
                        default:
                            int i11 = m.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            HashMap<String, Boolean> hashMap3 = this$0.f28796v;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry<String, Boolean> entry : hashMap3.entrySet()) {
                                if (entry.getValue().booleanValue()) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                            if (linkedHashMap.isEmpty()) {
                                Context context2 = this$0.getContext();
                                kotlin.jvm.internal.i.d(context2);
                                Toast.makeText(context2, "Please select at least 1 to continue.", 0).show();
                                return;
                            }
                            int i12 = this$0.f28799y;
                            if (i12 != 1) {
                                if (i12 == 2) {
                                    androidx.fragment.app.p activity3 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                                    DepressionMasteryActivity depressionMasteryActivity = (DepressionMasteryActivity) activity3;
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    for (Map.Entry<String, Boolean> entry2 : hashMap3.entrySet()) {
                                        if (entry2.getValue().booleanValue()) {
                                            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                                        }
                                    }
                                    depressionMasteryActivity.D = new ArrayList<>(linkedHashMap2.keySet());
                                }
                            } else {
                                androidx.fragment.app.p activity4 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                                DepressionMasteryActivity depressionMasteryActivity2 = (DepressionMasteryActivity) activity4;
                                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                for (Map.Entry<String, Boolean> entry3 : hashMap3.entrySet()) {
                                    if (entry3.getValue().booleanValue()) {
                                        linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                                    }
                                }
                                depressionMasteryActivity2.C = new ArrayList<>(linkedHashMap3.keySet());
                            }
                            androidx.fragment.app.p activity5 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                            ((DepressionMasteryActivity) activity5).t0();
                            return;
                    }
                }
            });
            int i6 = this.f28799y;
            if (i6 != 1) {
                if (i6 == 2) {
                    this.f28800z = 5;
                }
            } else {
                this.f28800z = 3;
            }
            if (this.f28800z == 5) {
                ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setText(getString(R.string.depressionMasteryPickerDone));
            } else {
                ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setText(getString(R.string.depressionMasteryDoneCTA));
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str3 = (String) it2.next();
                View inflate = getLayoutInflater().inflate(R.layout.row_screen_a6, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)), false);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(arrayList2.indexOf(str3) + 1);
                sb2.append('.');
                ((RobertoTextView) inflate.findViewById(R.id.rowNumber)).setText(sb2.toString());
                ((RobertoTextView) inflate.findViewById(R.id.rowTitle)).setText(str3);
                if (arrayList2.indexOf(str3) == 0) {
                    inflate.findViewById(R.id.divider).setVisibility(8);
                }
                ((ConstraintLayout) inflate.findViewById(R.id.parentLayout)).setOnClickListener(new k(this, inflate, 0));
                ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)).addView(inflate);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f28795u, e10);
        }
    }
}
