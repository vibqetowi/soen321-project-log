package qq;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionPleasurableActivity;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionPleasurableScheduleFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqq/x;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class x extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f30085x = 0;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f30088w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final HashMap<String, Boolean> f30086u = new HashMap<>();

    /* renamed from: v  reason: collision with root package name */
    public final String f30087v = LogHelper.INSTANCE.makeLogTag(x.class);

    public static boolean M(String str, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String i6 = (String) it.next();
            kotlin.jvm.internal.i.f(i6, "i");
            String lowerCase = i6.toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
            String lowerCase2 = str.toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase()");
            if (kotlin.jvm.internal.i.b(lowerCase, lowerCase2)) {
                return true;
            }
        }
        return false;
    }

    public final void J(String str) {
        HashMap<String, Boolean> hashMap = this.f30086u;
        String lowerCase = gv.r.i1(str).toString().toLowerCase();
        kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
        if (hashMap.containsKey(lowerCase)) {
            String lowerCase2 = gv.r.i1(str).toString().toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase()");
            if (kotlin.jvm.internal.i.b(hashMap.get(lowerCase2), Boolean.FALSE)) {
                String lowerCase3 = gv.r.i1(str).toString().toLowerCase();
                kotlin.jvm.internal.i.f(lowerCase3, "this as java.lang.String).toLowerCase()");
                hashMap.put(lowerCase3, Boolean.TRUE);
            }
        }
        ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)).setVisibility(0);
        View inflate = getLayoutInflater().inflate(R.layout.row_screen_a10, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)), false);
        ((RobertoTextView) inflate.findViewById(R.id.rowContent)).setText(str);
        ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)).addView(inflate);
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
        ((DepressionPleasurableActivity) activity).B.add(str);
        ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setBackgroundResource(R.drawable.button_dark_grey_fill);
        inflate.setOnClickListener(new ho.o(this, 26, inflate));
    }

    public final void K(RobertoTextView robertoTextView, View view, String str) {
        String obj = gv.r.i1(((RobertoTextView) view.findViewById(R.id.rowContent)).getText().toString()).toString();
        ((RobertoTextView) view.findViewById(R.id.rowContent)).setText(gv.r.i1(robertoTextView.getText().toString()).toString());
        HashMap<String, Boolean> hashMap = this.f30086u;
        String lowerCase = gv.r.i1(robertoTextView.getText().toString()).toString().toLowerCase();
        kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
        Boolean bool = Boolean.TRUE;
        hashMap.put(lowerCase, bool);
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
        ((DepressionPleasurableActivity) activity).B.add(gv.r.i1(robertoTextView.getText().toString()).toString());
        androidx.fragment.app.p activity2 = getActivity();
        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
        ((DepressionPleasurableActivity) activity2).B.remove(obj);
        String lowerCase2 = str.toLowerCase();
        kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase()");
        if (hashMap.containsKey(lowerCase2)) {
            String lowerCase3 = str.toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase3, "this as java.lang.String).toLowerCase()");
            if (kotlin.jvm.internal.i.b(hashMap.get(lowerCase3), bool)) {
                String lowerCase4 = str.toLowerCase();
                kotlin.jvm.internal.i.f(lowerCase4, "this as java.lang.String).toLowerCase()");
                hashMap.put(lowerCase4, Boolean.FALSE);
            }
        }
    }

    public final void O(Dialog dialog) {
        if (((RobertoEditText) dialog.findViewById(R.id.editText)).getText() != null && !kotlin.jvm.internal.i.b(gv.r.i1(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editText)).getText())).toString(), "")) {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
            if (M(gv.r.i1(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editText)).getText())).toString(), ((DepressionPleasurableActivity) activity).B)) {
                Toast.makeText(getActivity(), "This task has already been added to the schedule", 0).show();
                return;
            }
            J(gv.r.i1(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editText)).getText())).toString());
            dialog.dismiss();
            return;
        }
        Toast.makeText(getActivity(), "Please enter or select a task to add it to the schedule", 0).show();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f30088w;
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
        this.f30088w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            ScrollView a7ScrollView = (ScrollView) _$_findCachedViewById(R.id.a7ScrollView);
            kotlin.jvm.internal.i.f(a7ScrollView, "a7ScrollView");
            insetsUtils.addStatusBarHeight(a7ScrollView);
            ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionPleasurableScheduleTitle));
            ((RobertoTextView) _$_findCachedViewById(R.id.subheader)).setText(getString(R.string.depressionPleasurableScheduleSubtitle));
            ((RobertoButton) _$_findCachedViewById(R.id.btnAdd)).setText(getString(R.string.depressionPleasurableScheduleAdd));
            HashMap<String, Boolean> hashMap = this.f30086u;
            String string = getString(R.string.depressionPleasurableScheduleOption1);
            kotlin.jvm.internal.i.f(string, "getString(R.string.depre…easurableScheduleOption1)");
            String lowerCase = string.toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
            Boolean bool = Boolean.FALSE;
            hashMap.put(lowerCase, bool);
            String string2 = getString(R.string.depressionPleasurableScheduleOption2);
            kotlin.jvm.internal.i.f(string2, "getString(R.string.depre…easurableScheduleOption2)");
            String lowerCase2 = string2.toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase()");
            hashMap.put(lowerCase2, bool);
            String string3 = getString(R.string.depressionPleasurableScheduleOption3);
            kotlin.jvm.internal.i.f(string3, "getString(R.string.depre…easurableScheduleOption3)");
            String lowerCase3 = string3.toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase3, "this as java.lang.String).toLowerCase()");
            hashMap.put(lowerCase3, bool);
            String string4 = getString(R.string.depressionPleasurableScheduleOption4);
            kotlin.jvm.internal.i.f(string4, "getString(R.string.depre…easurableScheduleOption4)");
            String lowerCase4 = string4.toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase4, "this as java.lang.String).toLowerCase()");
            hashMap.put(lowerCase4, bool);
            String string5 = getString(R.string.depressionPleasurableScheduleOption5);
            kotlin.jvm.internal.i.f(string5, "getString(R.string.depre…easurableScheduleOption5)");
            String lowerCase5 = string5.toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase5, "this as java.lang.String).toLowerCase()");
            hashMap.put(lowerCase5, bool);
            String string6 = getString(R.string.depressionPleasurableScheduleOption6);
            kotlin.jvm.internal.i.f(string6, "getString(R.string.depre…easurableScheduleOption6)");
            String lowerCase6 = string6.toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase6, "this as java.lang.String).toLowerCase()");
            hashMap.put(lowerCase6, bool);
            String string7 = getString(R.string.depressionPleasurableScheduleOption7);
            kotlin.jvm.internal.i.f(string7, "getString(R.string.depre…easurableScheduleOption7)");
            String lowerCase7 = string7.toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase7, "this as java.lang.String).toLowerCase()");
            hashMap.put(lowerCase7, bool);
            String string8 = getString(R.string.depressionPleasurableScheduleOption8);
            kotlin.jvm.internal.i.f(string8, "getString(R.string.depre…easurableScheduleOption8)");
            String lowerCase8 = string8.toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase8, "this as java.lang.String).toLowerCase()");
            hashMap.put(lowerCase8, bool);
            String string9 = getString(R.string.depressionPleasurableScheduleOption9);
            kotlin.jvm.internal.i.f(string9, "getString(R.string.depre…easurableScheduleOption9)");
            String lowerCase9 = string9.toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase9, "this as java.lang.String).toLowerCase()");
            hashMap.put(lowerCase9, bool);
            String string10 = getString(R.string.depressionPleasurableScheduleOption10);
            kotlin.jvm.internal.i.f(string10, "getString(R.string.depre…asurableScheduleOption10)");
            String lowerCase10 = string10.toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase10, "this as java.lang.String).toLowerCase()");
            hashMap.put(lowerCase10, bool);
            String string11 = getString(R.string.depressionPleasurableScheduleOption11);
            kotlin.jvm.internal.i.f(string11, "getString(R.string.depre…asurableScheduleOption11)");
            String lowerCase11 = string11.toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase11, "this as java.lang.String).toLowerCase()");
            hashMap.put(lowerCase11, bool);
            String string12 = getString(R.string.depressionPleasurableScheduleOption12);
            kotlin.jvm.internal.i.f(string12, "getString(R.string.depre…asurableScheduleOption12)");
            String lowerCase12 = string12.toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase12, "this as java.lang.String).toLowerCase()");
            hashMap.put(lowerCase12, bool);
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setBackgroundResource(R.drawable.button_border_gray);
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setText(getString(R.string.depressionPleasurableScheduleMainCTA));
            ((RobertoButton) _$_findCachedViewById(R.id.btnAdd)).setOnClickListener(new View.OnClickListener(this) { // from class: qq.t

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ x f30072v;

                {
                    this.f30072v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    final x this$0 = this.f30072v;
                    switch (i6) {
                        case 0:
                            int i10 = x.f30085x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            final Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.popup_screen_a7, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                            Window window = styledDialog.getWindow();
                            if (window != null) {
                                window.setGravity(80);
                            }
                            Window window2 = styledDialog.getWindow();
                            if (window2 != null) {
                                window2.setLayout(-1, -2);
                            }
                            ((RobertoTextView) defpackage.e.j(this$0, R.string.depressionPleasurableScheduleOption11, (RobertoTextView) defpackage.e.j(this$0, R.string.depressionPleasurableScheduleOption10, (RobertoTextView) defpackage.e.j(this$0, R.string.depressionPleasurableScheduleOption9, (RobertoTextView) defpackage.e.j(this$0, R.string.depressionPleasurableScheduleOption8, (RobertoTextView) defpackage.e.j(this$0, R.string.depressionPleasurableScheduleOption7, (RobertoTextView) defpackage.e.j(this$0, R.string.depressionPleasurableScheduleOption6, (RobertoTextView) defpackage.e.j(this$0, R.string.depressionPleasurableScheduleOption5, (RobertoTextView) defpackage.e.j(this$0, R.string.depressionPleasurableScheduleOption4, (RobertoTextView) defpackage.e.j(this$0, R.string.depressionPleasurableScheduleOption3, (RobertoTextView) defpackage.e.j(this$0, R.string.depressionPleasurableScheduleOption2, (RobertoTextView) defpackage.e.j(this$0, R.string.depressionPleasurableScheduleOption1, (RobertoTextView) styledDialog.findViewById(R.id.chip1), styledDialog, R.id.chip2), styledDialog, R.id.chip3), styledDialog, R.id.chip4), styledDialog, R.id.chip5), styledDialog, R.id.chip6), styledDialog, R.id.chip7), styledDialog, R.id.chip8), styledDialog, R.id.chip9), styledDialog, R.id.chip10), styledDialog, R.id.chip11), styledDialog, R.id.chip12)).setText(this$0.getString(R.string.depressionPleasurableScheduleOption12));
                            HashMap<String, Boolean> hashMap2 = this$0.f30086u;
                            String string13 = this$0.getString(R.string.depressionPleasurableScheduleOption1);
                            kotlin.jvm.internal.i.f(string13, "getString(R.string.depre…easurableScheduleOption1)");
                            String lowerCase13 = string13.toLowerCase();
                            kotlin.jvm.internal.i.f(lowerCase13, "this as java.lang.String).toLowerCase()");
                            Boolean bool2 = hashMap2.get(lowerCase13);
                            Boolean bool3 = Boolean.TRUE;
                            if (kotlin.jvm.internal.i.b(bool2, bool3)) {
                                ((RobertoTextView) styledDialog.findViewById(R.id.chip1)).setVisibility(8);
                            }
                            if (defpackage.b.v(this$0, R.string.depressionPleasurableScheduleOption2, "getString(R.string.depre…easurableScheduleOption2)", "this as java.lang.String).toLowerCase()", hashMap2, bool3)) {
                                ((RobertoTextView) styledDialog.findViewById(R.id.chip2)).setVisibility(8);
                            }
                            if (defpackage.b.v(this$0, R.string.depressionPleasurableScheduleOption3, "getString(R.string.depre…easurableScheduleOption3)", "this as java.lang.String).toLowerCase()", hashMap2, bool3)) {
                                ((RobertoTextView) styledDialog.findViewById(R.id.chip3)).setVisibility(8);
                            }
                            if (defpackage.b.v(this$0, R.string.depressionPleasurableScheduleOption4, "getString(R.string.depre…easurableScheduleOption4)", "this as java.lang.String).toLowerCase()", hashMap2, bool3)) {
                                ((RobertoTextView) styledDialog.findViewById(R.id.chip4)).setVisibility(8);
                            }
                            if (defpackage.b.v(this$0, R.string.depressionPleasurableScheduleOption5, "getString(R.string.depre…easurableScheduleOption5)", "this as java.lang.String).toLowerCase()", hashMap2, bool3)) {
                                ((RobertoTextView) styledDialog.findViewById(R.id.chip5)).setVisibility(8);
                            }
                            if (defpackage.b.v(this$0, R.string.depressionPleasurableScheduleOption6, "getString(R.string.depre…easurableScheduleOption6)", "this as java.lang.String).toLowerCase()", hashMap2, bool3)) {
                                ((RobertoTextView) styledDialog.findViewById(R.id.chip6)).setVisibility(8);
                            }
                            if (defpackage.b.v(this$0, R.string.depressionPleasurableScheduleOption7, "getString(R.string.depre…easurableScheduleOption7)", "this as java.lang.String).toLowerCase()", hashMap2, bool3)) {
                                ((RobertoTextView) styledDialog.findViewById(R.id.chip7)).setVisibility(8);
                            }
                            if (defpackage.b.v(this$0, R.string.depressionPleasurableScheduleOption8, "getString(R.string.depre…easurableScheduleOption8)", "this as java.lang.String).toLowerCase()", hashMap2, bool3)) {
                                ((RobertoTextView) styledDialog.findViewById(R.id.chip8)).setVisibility(8);
                            }
                            if (defpackage.b.v(this$0, R.string.depressionPleasurableScheduleOption9, "getString(R.string.depre…easurableScheduleOption9)", "this as java.lang.String).toLowerCase()", hashMap2, bool3)) {
                                ((RobertoTextView) styledDialog.findViewById(R.id.chip9)).setVisibility(8);
                            }
                            if (defpackage.b.v(this$0, R.string.depressionPleasurableScheduleOption10, "getString(R.string.depre…asurableScheduleOption10)", "this as java.lang.String).toLowerCase()", hashMap2, bool3)) {
                                ((RobertoTextView) styledDialog.findViewById(R.id.chip10)).setVisibility(8);
                            }
                            if (defpackage.b.v(this$0, R.string.depressionPleasurableScheduleOption11, "getString(R.string.depre…asurableScheduleOption11)", "this as java.lang.String).toLowerCase()", hashMap2, bool3)) {
                                ((RobertoTextView) styledDialog.findViewById(R.id.chip11)).setVisibility(8);
                            }
                            if (defpackage.b.v(this$0, R.string.depressionPleasurableScheduleOption12, "getString(R.string.depre…asurableScheduleOption12)", "this as java.lang.String).toLowerCase()", hashMap2, bool3)) {
                                ((RobertoTextView) styledDialog.findViewById(R.id.chip12)).setVisibility(8);
                            }
                            styledDialog.show();
                            ((RobertoEditText) styledDialog.findViewById(R.id.editText)).requestFocus();
                            Window window3 = styledDialog.getWindow();
                            if (window3 != null) {
                                window3.setSoftInputMode(5);
                            }
                            ((AppCompatImageView) styledDialog.findViewById(R.id.add)).setOnClickListener(new View.OnClickListener() { // from class: qq.u
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    int i11 = r3;
                                    Dialog dialog = styledDialog;
                                    x this$02 = this$0;
                                    switch (i11) {
                                        case 0:
                                            int i12 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.O(dialog);
                                            return;
                                        case 1:
                                            int i13 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap3 = this$02.f30086u;
                                            String lowerCase14 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase14, "this as java.lang.String).toLowerCase()");
                                            hashMap3.put(lowerCase14, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 2:
                                            int i14 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap4 = this$02.f30086u;
                                            String lowerCase15 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase15, "this as java.lang.String).toLowerCase()");
                                            hashMap4.put(lowerCase15, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 3:
                                            int i15 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap5 = this$02.f30086u;
                                            String lowerCase16 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase16, "this as java.lang.String).toLowerCase()");
                                            hashMap5.put(lowerCase16, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 4:
                                            int i16 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap6 = this$02.f30086u;
                                            String lowerCase17 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase17, "this as java.lang.String).toLowerCase()");
                                            hashMap6.put(lowerCase17, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 5:
                                            int i17 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap7 = this$02.f30086u;
                                            String lowerCase18 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase18, "this as java.lang.String).toLowerCase()");
                                            hashMap7.put(lowerCase18, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 6:
                                            int i18 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap8 = this$02.f30086u;
                                            String lowerCase19 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase19, "this as java.lang.String).toLowerCase()");
                                            hashMap8.put(lowerCase19, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 7:
                                            int i19 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap9 = this$02.f30086u;
                                            String lowerCase20 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase20, "this as java.lang.String).toLowerCase()");
                                            hashMap9.put(lowerCase20, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 8:
                                            int i20 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap10 = this$02.f30086u;
                                            String lowerCase21 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase21, "this as java.lang.String).toLowerCase()");
                                            hashMap10.put(lowerCase21, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 9:
                                            int i21 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap11 = this$02.f30086u;
                                            String lowerCase22 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase22, "this as java.lang.String).toLowerCase()");
                                            hashMap11.put(lowerCase22, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 10:
                                            int i22 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap12 = this$02.f30086u;
                                            String lowerCase23 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase23, "this as java.lang.String).toLowerCase()");
                                            hashMap12.put(lowerCase23, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 11:
                                            int i23 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap13 = this$02.f30086u;
                                            String lowerCase24 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase24, "this as java.lang.String).toLowerCase()");
                                            hashMap13.put(lowerCase24, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        default:
                                            int i24 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap14 = this$02.f30086u;
                                            String lowerCase25 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase25, "this as java.lang.String).toLowerCase()");
                                            hashMap14.put(lowerCase25, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                    }
                                }
                            });
                            ((RobertoEditText) styledDialog.findViewById(R.id.editText)).setOnEditorActionListener(new oq.l(this$0, styledDialog));
                            ((RobertoTextView) styledDialog.findViewById(R.id.chip1)).setOnClickListener(new View.OnClickListener() { // from class: qq.u
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    int i11 = r3;
                                    Dialog dialog = styledDialog;
                                    x this$02 = this$0;
                                    switch (i11) {
                                        case 0:
                                            int i12 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.O(dialog);
                                            return;
                                        case 1:
                                            int i13 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap3 = this$02.f30086u;
                                            String lowerCase14 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase14, "this as java.lang.String).toLowerCase()");
                                            hashMap3.put(lowerCase14, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 2:
                                            int i14 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap4 = this$02.f30086u;
                                            String lowerCase15 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase15, "this as java.lang.String).toLowerCase()");
                                            hashMap4.put(lowerCase15, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 3:
                                            int i15 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap5 = this$02.f30086u;
                                            String lowerCase16 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase16, "this as java.lang.String).toLowerCase()");
                                            hashMap5.put(lowerCase16, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 4:
                                            int i16 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap6 = this$02.f30086u;
                                            String lowerCase17 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase17, "this as java.lang.String).toLowerCase()");
                                            hashMap6.put(lowerCase17, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 5:
                                            int i17 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap7 = this$02.f30086u;
                                            String lowerCase18 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase18, "this as java.lang.String).toLowerCase()");
                                            hashMap7.put(lowerCase18, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 6:
                                            int i18 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap8 = this$02.f30086u;
                                            String lowerCase19 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase19, "this as java.lang.String).toLowerCase()");
                                            hashMap8.put(lowerCase19, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 7:
                                            int i19 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap9 = this$02.f30086u;
                                            String lowerCase20 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase20, "this as java.lang.String).toLowerCase()");
                                            hashMap9.put(lowerCase20, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 8:
                                            int i20 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap10 = this$02.f30086u;
                                            String lowerCase21 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase21, "this as java.lang.String).toLowerCase()");
                                            hashMap10.put(lowerCase21, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 9:
                                            int i21 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap11 = this$02.f30086u;
                                            String lowerCase22 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase22, "this as java.lang.String).toLowerCase()");
                                            hashMap11.put(lowerCase22, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 10:
                                            int i22 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap12 = this$02.f30086u;
                                            String lowerCase23 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase23, "this as java.lang.String).toLowerCase()");
                                            hashMap12.put(lowerCase23, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 11:
                                            int i23 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap13 = this$02.f30086u;
                                            String lowerCase24 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase24, "this as java.lang.String).toLowerCase()");
                                            hashMap13.put(lowerCase24, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        default:
                                            int i24 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap14 = this$02.f30086u;
                                            String lowerCase25 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase25, "this as java.lang.String).toLowerCase()");
                                            hashMap14.put(lowerCase25, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                    }
                                }
                            });
                            ((RobertoTextView) styledDialog.findViewById(R.id.chip2)).setOnClickListener(new View.OnClickListener() { // from class: qq.u
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    int i11 = r3;
                                    Dialog dialog = styledDialog;
                                    x this$02 = this$0;
                                    switch (i11) {
                                        case 0:
                                            int i12 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.O(dialog);
                                            return;
                                        case 1:
                                            int i13 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap3 = this$02.f30086u;
                                            String lowerCase14 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase14, "this as java.lang.String).toLowerCase()");
                                            hashMap3.put(lowerCase14, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 2:
                                            int i14 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap4 = this$02.f30086u;
                                            String lowerCase15 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase15, "this as java.lang.String).toLowerCase()");
                                            hashMap4.put(lowerCase15, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 3:
                                            int i15 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap5 = this$02.f30086u;
                                            String lowerCase16 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase16, "this as java.lang.String).toLowerCase()");
                                            hashMap5.put(lowerCase16, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 4:
                                            int i16 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap6 = this$02.f30086u;
                                            String lowerCase17 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase17, "this as java.lang.String).toLowerCase()");
                                            hashMap6.put(lowerCase17, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 5:
                                            int i17 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap7 = this$02.f30086u;
                                            String lowerCase18 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase18, "this as java.lang.String).toLowerCase()");
                                            hashMap7.put(lowerCase18, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 6:
                                            int i18 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap8 = this$02.f30086u;
                                            String lowerCase19 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase19, "this as java.lang.String).toLowerCase()");
                                            hashMap8.put(lowerCase19, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 7:
                                            int i19 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap9 = this$02.f30086u;
                                            String lowerCase20 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase20, "this as java.lang.String).toLowerCase()");
                                            hashMap9.put(lowerCase20, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 8:
                                            int i20 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap10 = this$02.f30086u;
                                            String lowerCase21 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase21, "this as java.lang.String).toLowerCase()");
                                            hashMap10.put(lowerCase21, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 9:
                                            int i21 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap11 = this$02.f30086u;
                                            String lowerCase22 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase22, "this as java.lang.String).toLowerCase()");
                                            hashMap11.put(lowerCase22, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 10:
                                            int i22 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap12 = this$02.f30086u;
                                            String lowerCase23 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase23, "this as java.lang.String).toLowerCase()");
                                            hashMap12.put(lowerCase23, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 11:
                                            int i23 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap13 = this$02.f30086u;
                                            String lowerCase24 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase24, "this as java.lang.String).toLowerCase()");
                                            hashMap13.put(lowerCase24, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        default:
                                            int i24 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap14 = this$02.f30086u;
                                            String lowerCase25 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase25, "this as java.lang.String).toLowerCase()");
                                            hashMap14.put(lowerCase25, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                    }
                                }
                            });
                            ((RobertoTextView) styledDialog.findViewById(R.id.chip3)).setOnClickListener(new View.OnClickListener() { // from class: qq.u
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    int i11 = r3;
                                    Dialog dialog = styledDialog;
                                    x this$02 = this$0;
                                    switch (i11) {
                                        case 0:
                                            int i12 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.O(dialog);
                                            return;
                                        case 1:
                                            int i13 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap3 = this$02.f30086u;
                                            String lowerCase14 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase14, "this as java.lang.String).toLowerCase()");
                                            hashMap3.put(lowerCase14, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 2:
                                            int i14 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap4 = this$02.f30086u;
                                            String lowerCase15 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase15, "this as java.lang.String).toLowerCase()");
                                            hashMap4.put(lowerCase15, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 3:
                                            int i15 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap5 = this$02.f30086u;
                                            String lowerCase16 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase16, "this as java.lang.String).toLowerCase()");
                                            hashMap5.put(lowerCase16, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 4:
                                            int i16 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap6 = this$02.f30086u;
                                            String lowerCase17 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase17, "this as java.lang.String).toLowerCase()");
                                            hashMap6.put(lowerCase17, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 5:
                                            int i17 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap7 = this$02.f30086u;
                                            String lowerCase18 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase18, "this as java.lang.String).toLowerCase()");
                                            hashMap7.put(lowerCase18, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 6:
                                            int i18 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap8 = this$02.f30086u;
                                            String lowerCase19 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase19, "this as java.lang.String).toLowerCase()");
                                            hashMap8.put(lowerCase19, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 7:
                                            int i19 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap9 = this$02.f30086u;
                                            String lowerCase20 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase20, "this as java.lang.String).toLowerCase()");
                                            hashMap9.put(lowerCase20, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 8:
                                            int i20 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap10 = this$02.f30086u;
                                            String lowerCase21 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase21, "this as java.lang.String).toLowerCase()");
                                            hashMap10.put(lowerCase21, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 9:
                                            int i21 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap11 = this$02.f30086u;
                                            String lowerCase22 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase22, "this as java.lang.String).toLowerCase()");
                                            hashMap11.put(lowerCase22, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 10:
                                            int i22 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap12 = this$02.f30086u;
                                            String lowerCase23 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase23, "this as java.lang.String).toLowerCase()");
                                            hashMap12.put(lowerCase23, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 11:
                                            int i23 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap13 = this$02.f30086u;
                                            String lowerCase24 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase24, "this as java.lang.String).toLowerCase()");
                                            hashMap13.put(lowerCase24, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        default:
                                            int i24 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap14 = this$02.f30086u;
                                            String lowerCase25 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase25, "this as java.lang.String).toLowerCase()");
                                            hashMap14.put(lowerCase25, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                    }
                                }
                            });
                            ((RobertoTextView) styledDialog.findViewById(R.id.chip4)).setOnClickListener(new View.OnClickListener() { // from class: qq.u
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    int i11 = r3;
                                    Dialog dialog = styledDialog;
                                    x this$02 = this$0;
                                    switch (i11) {
                                        case 0:
                                            int i12 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.O(dialog);
                                            return;
                                        case 1:
                                            int i13 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap3 = this$02.f30086u;
                                            String lowerCase14 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase14, "this as java.lang.String).toLowerCase()");
                                            hashMap3.put(lowerCase14, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 2:
                                            int i14 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap4 = this$02.f30086u;
                                            String lowerCase15 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase15, "this as java.lang.String).toLowerCase()");
                                            hashMap4.put(lowerCase15, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 3:
                                            int i15 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap5 = this$02.f30086u;
                                            String lowerCase16 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase16, "this as java.lang.String).toLowerCase()");
                                            hashMap5.put(lowerCase16, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 4:
                                            int i16 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap6 = this$02.f30086u;
                                            String lowerCase17 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase17, "this as java.lang.String).toLowerCase()");
                                            hashMap6.put(lowerCase17, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 5:
                                            int i17 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap7 = this$02.f30086u;
                                            String lowerCase18 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase18, "this as java.lang.String).toLowerCase()");
                                            hashMap7.put(lowerCase18, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 6:
                                            int i18 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap8 = this$02.f30086u;
                                            String lowerCase19 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase19, "this as java.lang.String).toLowerCase()");
                                            hashMap8.put(lowerCase19, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 7:
                                            int i19 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap9 = this$02.f30086u;
                                            String lowerCase20 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase20, "this as java.lang.String).toLowerCase()");
                                            hashMap9.put(lowerCase20, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 8:
                                            int i20 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap10 = this$02.f30086u;
                                            String lowerCase21 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase21, "this as java.lang.String).toLowerCase()");
                                            hashMap10.put(lowerCase21, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 9:
                                            int i21 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap11 = this$02.f30086u;
                                            String lowerCase22 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase22, "this as java.lang.String).toLowerCase()");
                                            hashMap11.put(lowerCase22, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 10:
                                            int i22 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap12 = this$02.f30086u;
                                            String lowerCase23 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase23, "this as java.lang.String).toLowerCase()");
                                            hashMap12.put(lowerCase23, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 11:
                                            int i23 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap13 = this$02.f30086u;
                                            String lowerCase24 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase24, "this as java.lang.String).toLowerCase()");
                                            hashMap13.put(lowerCase24, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        default:
                                            int i24 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap14 = this$02.f30086u;
                                            String lowerCase25 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase25, "this as java.lang.String).toLowerCase()");
                                            hashMap14.put(lowerCase25, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                    }
                                }
                            });
                            ((RobertoTextView) styledDialog.findViewById(R.id.chip5)).setOnClickListener(new View.OnClickListener() { // from class: qq.u
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    int i11 = r3;
                                    Dialog dialog = styledDialog;
                                    x this$02 = this$0;
                                    switch (i11) {
                                        case 0:
                                            int i12 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.O(dialog);
                                            return;
                                        case 1:
                                            int i13 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap3 = this$02.f30086u;
                                            String lowerCase14 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase14, "this as java.lang.String).toLowerCase()");
                                            hashMap3.put(lowerCase14, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 2:
                                            int i14 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap4 = this$02.f30086u;
                                            String lowerCase15 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase15, "this as java.lang.String).toLowerCase()");
                                            hashMap4.put(lowerCase15, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 3:
                                            int i15 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap5 = this$02.f30086u;
                                            String lowerCase16 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase16, "this as java.lang.String).toLowerCase()");
                                            hashMap5.put(lowerCase16, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 4:
                                            int i16 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap6 = this$02.f30086u;
                                            String lowerCase17 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase17, "this as java.lang.String).toLowerCase()");
                                            hashMap6.put(lowerCase17, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 5:
                                            int i17 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap7 = this$02.f30086u;
                                            String lowerCase18 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase18, "this as java.lang.String).toLowerCase()");
                                            hashMap7.put(lowerCase18, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 6:
                                            int i18 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap8 = this$02.f30086u;
                                            String lowerCase19 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase19, "this as java.lang.String).toLowerCase()");
                                            hashMap8.put(lowerCase19, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 7:
                                            int i19 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap9 = this$02.f30086u;
                                            String lowerCase20 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase20, "this as java.lang.String).toLowerCase()");
                                            hashMap9.put(lowerCase20, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 8:
                                            int i20 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap10 = this$02.f30086u;
                                            String lowerCase21 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase21, "this as java.lang.String).toLowerCase()");
                                            hashMap10.put(lowerCase21, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 9:
                                            int i21 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap11 = this$02.f30086u;
                                            String lowerCase22 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase22, "this as java.lang.String).toLowerCase()");
                                            hashMap11.put(lowerCase22, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 10:
                                            int i22 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap12 = this$02.f30086u;
                                            String lowerCase23 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase23, "this as java.lang.String).toLowerCase()");
                                            hashMap12.put(lowerCase23, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 11:
                                            int i23 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap13 = this$02.f30086u;
                                            String lowerCase24 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase24, "this as java.lang.String).toLowerCase()");
                                            hashMap13.put(lowerCase24, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        default:
                                            int i24 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap14 = this$02.f30086u;
                                            String lowerCase25 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase25, "this as java.lang.String).toLowerCase()");
                                            hashMap14.put(lowerCase25, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                    }
                                }
                            });
                            ((RobertoTextView) styledDialog.findViewById(R.id.chip6)).setOnClickListener(new View.OnClickListener() { // from class: qq.u
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    int i11 = r3;
                                    Dialog dialog = styledDialog;
                                    x this$02 = this$0;
                                    switch (i11) {
                                        case 0:
                                            int i12 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.O(dialog);
                                            return;
                                        case 1:
                                            int i13 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap3 = this$02.f30086u;
                                            String lowerCase14 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase14, "this as java.lang.String).toLowerCase()");
                                            hashMap3.put(lowerCase14, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 2:
                                            int i14 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap4 = this$02.f30086u;
                                            String lowerCase15 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase15, "this as java.lang.String).toLowerCase()");
                                            hashMap4.put(lowerCase15, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 3:
                                            int i15 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap5 = this$02.f30086u;
                                            String lowerCase16 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase16, "this as java.lang.String).toLowerCase()");
                                            hashMap5.put(lowerCase16, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 4:
                                            int i16 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap6 = this$02.f30086u;
                                            String lowerCase17 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase17, "this as java.lang.String).toLowerCase()");
                                            hashMap6.put(lowerCase17, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 5:
                                            int i17 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap7 = this$02.f30086u;
                                            String lowerCase18 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase18, "this as java.lang.String).toLowerCase()");
                                            hashMap7.put(lowerCase18, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 6:
                                            int i18 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap8 = this$02.f30086u;
                                            String lowerCase19 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase19, "this as java.lang.String).toLowerCase()");
                                            hashMap8.put(lowerCase19, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 7:
                                            int i19 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap9 = this$02.f30086u;
                                            String lowerCase20 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase20, "this as java.lang.String).toLowerCase()");
                                            hashMap9.put(lowerCase20, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 8:
                                            int i20 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap10 = this$02.f30086u;
                                            String lowerCase21 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase21, "this as java.lang.String).toLowerCase()");
                                            hashMap10.put(lowerCase21, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 9:
                                            int i21 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap11 = this$02.f30086u;
                                            String lowerCase22 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase22, "this as java.lang.String).toLowerCase()");
                                            hashMap11.put(lowerCase22, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 10:
                                            int i22 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap12 = this$02.f30086u;
                                            String lowerCase23 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase23, "this as java.lang.String).toLowerCase()");
                                            hashMap12.put(lowerCase23, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 11:
                                            int i23 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap13 = this$02.f30086u;
                                            String lowerCase24 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase24, "this as java.lang.String).toLowerCase()");
                                            hashMap13.put(lowerCase24, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        default:
                                            int i24 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap14 = this$02.f30086u;
                                            String lowerCase25 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase25, "this as java.lang.String).toLowerCase()");
                                            hashMap14.put(lowerCase25, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                    }
                                }
                            });
                            ((RobertoTextView) styledDialog.findViewById(R.id.chip7)).setOnClickListener(new View.OnClickListener() { // from class: qq.u
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    int i11 = r3;
                                    Dialog dialog = styledDialog;
                                    x this$02 = this$0;
                                    switch (i11) {
                                        case 0:
                                            int i12 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.O(dialog);
                                            return;
                                        case 1:
                                            int i13 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap3 = this$02.f30086u;
                                            String lowerCase14 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase14, "this as java.lang.String).toLowerCase()");
                                            hashMap3.put(lowerCase14, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 2:
                                            int i14 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap4 = this$02.f30086u;
                                            String lowerCase15 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase15, "this as java.lang.String).toLowerCase()");
                                            hashMap4.put(lowerCase15, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 3:
                                            int i15 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap5 = this$02.f30086u;
                                            String lowerCase16 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase16, "this as java.lang.String).toLowerCase()");
                                            hashMap5.put(lowerCase16, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 4:
                                            int i16 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap6 = this$02.f30086u;
                                            String lowerCase17 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase17, "this as java.lang.String).toLowerCase()");
                                            hashMap6.put(lowerCase17, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 5:
                                            int i17 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap7 = this$02.f30086u;
                                            String lowerCase18 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase18, "this as java.lang.String).toLowerCase()");
                                            hashMap7.put(lowerCase18, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 6:
                                            int i18 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap8 = this$02.f30086u;
                                            String lowerCase19 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase19, "this as java.lang.String).toLowerCase()");
                                            hashMap8.put(lowerCase19, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 7:
                                            int i19 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap9 = this$02.f30086u;
                                            String lowerCase20 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase20, "this as java.lang.String).toLowerCase()");
                                            hashMap9.put(lowerCase20, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 8:
                                            int i20 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap10 = this$02.f30086u;
                                            String lowerCase21 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase21, "this as java.lang.String).toLowerCase()");
                                            hashMap10.put(lowerCase21, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 9:
                                            int i21 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap11 = this$02.f30086u;
                                            String lowerCase22 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase22, "this as java.lang.String).toLowerCase()");
                                            hashMap11.put(lowerCase22, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 10:
                                            int i22 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap12 = this$02.f30086u;
                                            String lowerCase23 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase23, "this as java.lang.String).toLowerCase()");
                                            hashMap12.put(lowerCase23, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 11:
                                            int i23 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap13 = this$02.f30086u;
                                            String lowerCase24 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase24, "this as java.lang.String).toLowerCase()");
                                            hashMap13.put(lowerCase24, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        default:
                                            int i24 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap14 = this$02.f30086u;
                                            String lowerCase25 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase25, "this as java.lang.String).toLowerCase()");
                                            hashMap14.put(lowerCase25, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                    }
                                }
                            });
                            ((RobertoTextView) styledDialog.findViewById(R.id.chip8)).setOnClickListener(new View.OnClickListener() { // from class: qq.u
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    int i11 = r3;
                                    Dialog dialog = styledDialog;
                                    x this$02 = this$0;
                                    switch (i11) {
                                        case 0:
                                            int i12 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.O(dialog);
                                            return;
                                        case 1:
                                            int i13 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap3 = this$02.f30086u;
                                            String lowerCase14 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase14, "this as java.lang.String).toLowerCase()");
                                            hashMap3.put(lowerCase14, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 2:
                                            int i14 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap4 = this$02.f30086u;
                                            String lowerCase15 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase15, "this as java.lang.String).toLowerCase()");
                                            hashMap4.put(lowerCase15, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 3:
                                            int i15 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap5 = this$02.f30086u;
                                            String lowerCase16 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase16, "this as java.lang.String).toLowerCase()");
                                            hashMap5.put(lowerCase16, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 4:
                                            int i16 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap6 = this$02.f30086u;
                                            String lowerCase17 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase17, "this as java.lang.String).toLowerCase()");
                                            hashMap6.put(lowerCase17, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 5:
                                            int i17 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap7 = this$02.f30086u;
                                            String lowerCase18 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase18, "this as java.lang.String).toLowerCase()");
                                            hashMap7.put(lowerCase18, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 6:
                                            int i18 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap8 = this$02.f30086u;
                                            String lowerCase19 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase19, "this as java.lang.String).toLowerCase()");
                                            hashMap8.put(lowerCase19, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 7:
                                            int i19 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap9 = this$02.f30086u;
                                            String lowerCase20 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase20, "this as java.lang.String).toLowerCase()");
                                            hashMap9.put(lowerCase20, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 8:
                                            int i20 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap10 = this$02.f30086u;
                                            String lowerCase21 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase21, "this as java.lang.String).toLowerCase()");
                                            hashMap10.put(lowerCase21, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 9:
                                            int i21 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap11 = this$02.f30086u;
                                            String lowerCase22 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase22, "this as java.lang.String).toLowerCase()");
                                            hashMap11.put(lowerCase22, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 10:
                                            int i22 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap12 = this$02.f30086u;
                                            String lowerCase23 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase23, "this as java.lang.String).toLowerCase()");
                                            hashMap12.put(lowerCase23, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 11:
                                            int i23 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap13 = this$02.f30086u;
                                            String lowerCase24 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase24, "this as java.lang.String).toLowerCase()");
                                            hashMap13.put(lowerCase24, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        default:
                                            int i24 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap14 = this$02.f30086u;
                                            String lowerCase25 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase25, "this as java.lang.String).toLowerCase()");
                                            hashMap14.put(lowerCase25, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                    }
                                }
                            });
                            ((RobertoTextView) styledDialog.findViewById(R.id.chip9)).setOnClickListener(new View.OnClickListener() { // from class: qq.u
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    int i11 = r3;
                                    Dialog dialog = styledDialog;
                                    x this$02 = this$0;
                                    switch (i11) {
                                        case 0:
                                            int i12 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.O(dialog);
                                            return;
                                        case 1:
                                            int i13 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap3 = this$02.f30086u;
                                            String lowerCase14 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase14, "this as java.lang.String).toLowerCase()");
                                            hashMap3.put(lowerCase14, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 2:
                                            int i14 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap4 = this$02.f30086u;
                                            String lowerCase15 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase15, "this as java.lang.String).toLowerCase()");
                                            hashMap4.put(lowerCase15, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 3:
                                            int i15 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap5 = this$02.f30086u;
                                            String lowerCase16 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase16, "this as java.lang.String).toLowerCase()");
                                            hashMap5.put(lowerCase16, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 4:
                                            int i16 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap6 = this$02.f30086u;
                                            String lowerCase17 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase17, "this as java.lang.String).toLowerCase()");
                                            hashMap6.put(lowerCase17, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 5:
                                            int i17 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap7 = this$02.f30086u;
                                            String lowerCase18 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase18, "this as java.lang.String).toLowerCase()");
                                            hashMap7.put(lowerCase18, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 6:
                                            int i18 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap8 = this$02.f30086u;
                                            String lowerCase19 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase19, "this as java.lang.String).toLowerCase()");
                                            hashMap8.put(lowerCase19, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 7:
                                            int i19 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap9 = this$02.f30086u;
                                            String lowerCase20 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase20, "this as java.lang.String).toLowerCase()");
                                            hashMap9.put(lowerCase20, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 8:
                                            int i20 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap10 = this$02.f30086u;
                                            String lowerCase21 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase21, "this as java.lang.String).toLowerCase()");
                                            hashMap10.put(lowerCase21, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 9:
                                            int i21 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap11 = this$02.f30086u;
                                            String lowerCase22 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase22, "this as java.lang.String).toLowerCase()");
                                            hashMap11.put(lowerCase22, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 10:
                                            int i22 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap12 = this$02.f30086u;
                                            String lowerCase23 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase23, "this as java.lang.String).toLowerCase()");
                                            hashMap12.put(lowerCase23, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 11:
                                            int i23 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap13 = this$02.f30086u;
                                            String lowerCase24 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase24, "this as java.lang.String).toLowerCase()");
                                            hashMap13.put(lowerCase24, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        default:
                                            int i24 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap14 = this$02.f30086u;
                                            String lowerCase25 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase25, "this as java.lang.String).toLowerCase()");
                                            hashMap14.put(lowerCase25, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                    }
                                }
                            });
                            ((RobertoTextView) styledDialog.findViewById(R.id.chip10)).setOnClickListener(new View.OnClickListener() { // from class: qq.u
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    int i11 = r3;
                                    Dialog dialog = styledDialog;
                                    x this$02 = this$0;
                                    switch (i11) {
                                        case 0:
                                            int i12 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.O(dialog);
                                            return;
                                        case 1:
                                            int i13 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap3 = this$02.f30086u;
                                            String lowerCase14 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase14, "this as java.lang.String).toLowerCase()");
                                            hashMap3.put(lowerCase14, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 2:
                                            int i14 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap4 = this$02.f30086u;
                                            String lowerCase15 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase15, "this as java.lang.String).toLowerCase()");
                                            hashMap4.put(lowerCase15, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 3:
                                            int i15 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap5 = this$02.f30086u;
                                            String lowerCase16 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase16, "this as java.lang.String).toLowerCase()");
                                            hashMap5.put(lowerCase16, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 4:
                                            int i16 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap6 = this$02.f30086u;
                                            String lowerCase17 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase17, "this as java.lang.String).toLowerCase()");
                                            hashMap6.put(lowerCase17, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 5:
                                            int i17 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap7 = this$02.f30086u;
                                            String lowerCase18 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase18, "this as java.lang.String).toLowerCase()");
                                            hashMap7.put(lowerCase18, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 6:
                                            int i18 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap8 = this$02.f30086u;
                                            String lowerCase19 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase19, "this as java.lang.String).toLowerCase()");
                                            hashMap8.put(lowerCase19, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 7:
                                            int i19 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap9 = this$02.f30086u;
                                            String lowerCase20 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase20, "this as java.lang.String).toLowerCase()");
                                            hashMap9.put(lowerCase20, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 8:
                                            int i20 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap10 = this$02.f30086u;
                                            String lowerCase21 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase21, "this as java.lang.String).toLowerCase()");
                                            hashMap10.put(lowerCase21, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 9:
                                            int i21 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap11 = this$02.f30086u;
                                            String lowerCase22 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase22, "this as java.lang.String).toLowerCase()");
                                            hashMap11.put(lowerCase22, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 10:
                                            int i22 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap12 = this$02.f30086u;
                                            String lowerCase23 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase23, "this as java.lang.String).toLowerCase()");
                                            hashMap12.put(lowerCase23, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 11:
                                            int i23 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap13 = this$02.f30086u;
                                            String lowerCase24 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase24, "this as java.lang.String).toLowerCase()");
                                            hashMap13.put(lowerCase24, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        default:
                                            int i24 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap14 = this$02.f30086u;
                                            String lowerCase25 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase25, "this as java.lang.String).toLowerCase()");
                                            hashMap14.put(lowerCase25, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                    }
                                }
                            });
                            ((RobertoTextView) styledDialog.findViewById(R.id.chip11)).setOnClickListener(new View.OnClickListener() { // from class: qq.u
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    int i11 = r3;
                                    Dialog dialog = styledDialog;
                                    x this$02 = this$0;
                                    switch (i11) {
                                        case 0:
                                            int i12 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.O(dialog);
                                            return;
                                        case 1:
                                            int i13 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap3 = this$02.f30086u;
                                            String lowerCase14 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase14, "this as java.lang.String).toLowerCase()");
                                            hashMap3.put(lowerCase14, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 2:
                                            int i14 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap4 = this$02.f30086u;
                                            String lowerCase15 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase15, "this as java.lang.String).toLowerCase()");
                                            hashMap4.put(lowerCase15, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 3:
                                            int i15 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap5 = this$02.f30086u;
                                            String lowerCase16 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase16, "this as java.lang.String).toLowerCase()");
                                            hashMap5.put(lowerCase16, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 4:
                                            int i16 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap6 = this$02.f30086u;
                                            String lowerCase17 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase17, "this as java.lang.String).toLowerCase()");
                                            hashMap6.put(lowerCase17, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 5:
                                            int i17 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap7 = this$02.f30086u;
                                            String lowerCase18 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase18, "this as java.lang.String).toLowerCase()");
                                            hashMap7.put(lowerCase18, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 6:
                                            int i18 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap8 = this$02.f30086u;
                                            String lowerCase19 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase19, "this as java.lang.String).toLowerCase()");
                                            hashMap8.put(lowerCase19, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 7:
                                            int i19 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap9 = this$02.f30086u;
                                            String lowerCase20 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase20, "this as java.lang.String).toLowerCase()");
                                            hashMap9.put(lowerCase20, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 8:
                                            int i20 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap10 = this$02.f30086u;
                                            String lowerCase21 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase21, "this as java.lang.String).toLowerCase()");
                                            hashMap10.put(lowerCase21, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 9:
                                            int i21 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap11 = this$02.f30086u;
                                            String lowerCase22 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase22, "this as java.lang.String).toLowerCase()");
                                            hashMap11.put(lowerCase22, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 10:
                                            int i22 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap12 = this$02.f30086u;
                                            String lowerCase23 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase23, "this as java.lang.String).toLowerCase()");
                                            hashMap12.put(lowerCase23, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 11:
                                            int i23 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap13 = this$02.f30086u;
                                            String lowerCase24 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase24, "this as java.lang.String).toLowerCase()");
                                            hashMap13.put(lowerCase24, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        default:
                                            int i24 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap14 = this$02.f30086u;
                                            String lowerCase25 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase25, "this as java.lang.String).toLowerCase()");
                                            hashMap14.put(lowerCase25, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                    }
                                }
                            });
                            ((RobertoTextView) styledDialog.findViewById(R.id.chip12)).setOnClickListener(new View.OnClickListener() { // from class: qq.u
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    int i11 = r3;
                                    Dialog dialog = styledDialog;
                                    x this$02 = this$0;
                                    switch (i11) {
                                        case 0:
                                            int i12 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.O(dialog);
                                            return;
                                        case 1:
                                            int i13 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap3 = this$02.f30086u;
                                            String lowerCase14 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase14, "this as java.lang.String).toLowerCase()");
                                            hashMap3.put(lowerCase14, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 2:
                                            int i14 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap4 = this$02.f30086u;
                                            String lowerCase15 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase15, "this as java.lang.String).toLowerCase()");
                                            hashMap4.put(lowerCase15, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 3:
                                            int i15 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap5 = this$02.f30086u;
                                            String lowerCase16 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase16, "this as java.lang.String).toLowerCase()");
                                            hashMap5.put(lowerCase16, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 4:
                                            int i16 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap6 = this$02.f30086u;
                                            String lowerCase17 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase17, "this as java.lang.String).toLowerCase()");
                                            hashMap6.put(lowerCase17, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 5:
                                            int i17 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap7 = this$02.f30086u;
                                            String lowerCase18 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase18, "this as java.lang.String).toLowerCase()");
                                            hashMap7.put(lowerCase18, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 6:
                                            int i18 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap8 = this$02.f30086u;
                                            String lowerCase19 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase19, "this as java.lang.String).toLowerCase()");
                                            hashMap8.put(lowerCase19, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 7:
                                            int i19 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap9 = this$02.f30086u;
                                            String lowerCase20 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase20, "this as java.lang.String).toLowerCase()");
                                            hashMap9.put(lowerCase20, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 8:
                                            int i20 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap10 = this$02.f30086u;
                                            String lowerCase21 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase21, "this as java.lang.String).toLowerCase()");
                                            hashMap10.put(lowerCase21, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 9:
                                            int i21 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap11 = this$02.f30086u;
                                            String lowerCase22 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase22, "this as java.lang.String).toLowerCase()");
                                            hashMap11.put(lowerCase22, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 10:
                                            int i22 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap12 = this$02.f30086u;
                                            String lowerCase23 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase23, "this as java.lang.String).toLowerCase()");
                                            hashMap12.put(lowerCase23, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 11:
                                            int i23 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap13 = this$02.f30086u;
                                            String lowerCase24 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase24, "this as java.lang.String).toLowerCase()");
                                            hashMap13.put(lowerCase24, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        default:
                                            int i24 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap14 = this$02.f30086u;
                                            String lowerCase25 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase25, "this as java.lang.String).toLowerCase()");
                                            hashMap14.put(lowerCase25, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            int i11 = x.f30085x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                            if (((DepressionPleasurableActivity) activity).B.isEmpty()) {
                                Toast.makeText(this$0.getActivity(), this$0.getString(R.string.depressionPleasurableScheduleError), 0).show();
                                return;
                            }
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                            ((DepressionPleasurableActivity) activity2).t0();
                            return;
                    }
                }
            });
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setOnClickListener(new View.OnClickListener(this) { // from class: qq.t

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ x f30072v;

                {
                    this.f30072v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    final x this$0 = this.f30072v;
                    switch (i6) {
                        case 0:
                            int i10 = x.f30085x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            final Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.popup_screen_a7, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                            Window window = styledDialog.getWindow();
                            if (window != null) {
                                window.setGravity(80);
                            }
                            Window window2 = styledDialog.getWindow();
                            if (window2 != null) {
                                window2.setLayout(-1, -2);
                            }
                            ((RobertoTextView) defpackage.e.j(this$0, R.string.depressionPleasurableScheduleOption11, (RobertoTextView) defpackage.e.j(this$0, R.string.depressionPleasurableScheduleOption10, (RobertoTextView) defpackage.e.j(this$0, R.string.depressionPleasurableScheduleOption9, (RobertoTextView) defpackage.e.j(this$0, R.string.depressionPleasurableScheduleOption8, (RobertoTextView) defpackage.e.j(this$0, R.string.depressionPleasurableScheduleOption7, (RobertoTextView) defpackage.e.j(this$0, R.string.depressionPleasurableScheduleOption6, (RobertoTextView) defpackage.e.j(this$0, R.string.depressionPleasurableScheduleOption5, (RobertoTextView) defpackage.e.j(this$0, R.string.depressionPleasurableScheduleOption4, (RobertoTextView) defpackage.e.j(this$0, R.string.depressionPleasurableScheduleOption3, (RobertoTextView) defpackage.e.j(this$0, R.string.depressionPleasurableScheduleOption2, (RobertoTextView) defpackage.e.j(this$0, R.string.depressionPleasurableScheduleOption1, (RobertoTextView) styledDialog.findViewById(R.id.chip1), styledDialog, R.id.chip2), styledDialog, R.id.chip3), styledDialog, R.id.chip4), styledDialog, R.id.chip5), styledDialog, R.id.chip6), styledDialog, R.id.chip7), styledDialog, R.id.chip8), styledDialog, R.id.chip9), styledDialog, R.id.chip10), styledDialog, R.id.chip11), styledDialog, R.id.chip12)).setText(this$0.getString(R.string.depressionPleasurableScheduleOption12));
                            HashMap<String, Boolean> hashMap2 = this$0.f30086u;
                            String string13 = this$0.getString(R.string.depressionPleasurableScheduleOption1);
                            kotlin.jvm.internal.i.f(string13, "getString(R.string.depre…easurableScheduleOption1)");
                            String lowerCase13 = string13.toLowerCase();
                            kotlin.jvm.internal.i.f(lowerCase13, "this as java.lang.String).toLowerCase()");
                            Boolean bool2 = hashMap2.get(lowerCase13);
                            Boolean bool3 = Boolean.TRUE;
                            if (kotlin.jvm.internal.i.b(bool2, bool3)) {
                                ((RobertoTextView) styledDialog.findViewById(R.id.chip1)).setVisibility(8);
                            }
                            if (defpackage.b.v(this$0, R.string.depressionPleasurableScheduleOption2, "getString(R.string.depre…easurableScheduleOption2)", "this as java.lang.String).toLowerCase()", hashMap2, bool3)) {
                                ((RobertoTextView) styledDialog.findViewById(R.id.chip2)).setVisibility(8);
                            }
                            if (defpackage.b.v(this$0, R.string.depressionPleasurableScheduleOption3, "getString(R.string.depre…easurableScheduleOption3)", "this as java.lang.String).toLowerCase()", hashMap2, bool3)) {
                                ((RobertoTextView) styledDialog.findViewById(R.id.chip3)).setVisibility(8);
                            }
                            if (defpackage.b.v(this$0, R.string.depressionPleasurableScheduleOption4, "getString(R.string.depre…easurableScheduleOption4)", "this as java.lang.String).toLowerCase()", hashMap2, bool3)) {
                                ((RobertoTextView) styledDialog.findViewById(R.id.chip4)).setVisibility(8);
                            }
                            if (defpackage.b.v(this$0, R.string.depressionPleasurableScheduleOption5, "getString(R.string.depre…easurableScheduleOption5)", "this as java.lang.String).toLowerCase()", hashMap2, bool3)) {
                                ((RobertoTextView) styledDialog.findViewById(R.id.chip5)).setVisibility(8);
                            }
                            if (defpackage.b.v(this$0, R.string.depressionPleasurableScheduleOption6, "getString(R.string.depre…easurableScheduleOption6)", "this as java.lang.String).toLowerCase()", hashMap2, bool3)) {
                                ((RobertoTextView) styledDialog.findViewById(R.id.chip6)).setVisibility(8);
                            }
                            if (defpackage.b.v(this$0, R.string.depressionPleasurableScheduleOption7, "getString(R.string.depre…easurableScheduleOption7)", "this as java.lang.String).toLowerCase()", hashMap2, bool3)) {
                                ((RobertoTextView) styledDialog.findViewById(R.id.chip7)).setVisibility(8);
                            }
                            if (defpackage.b.v(this$0, R.string.depressionPleasurableScheduleOption8, "getString(R.string.depre…easurableScheduleOption8)", "this as java.lang.String).toLowerCase()", hashMap2, bool3)) {
                                ((RobertoTextView) styledDialog.findViewById(R.id.chip8)).setVisibility(8);
                            }
                            if (defpackage.b.v(this$0, R.string.depressionPleasurableScheduleOption9, "getString(R.string.depre…easurableScheduleOption9)", "this as java.lang.String).toLowerCase()", hashMap2, bool3)) {
                                ((RobertoTextView) styledDialog.findViewById(R.id.chip9)).setVisibility(8);
                            }
                            if (defpackage.b.v(this$0, R.string.depressionPleasurableScheduleOption10, "getString(R.string.depre…asurableScheduleOption10)", "this as java.lang.String).toLowerCase()", hashMap2, bool3)) {
                                ((RobertoTextView) styledDialog.findViewById(R.id.chip10)).setVisibility(8);
                            }
                            if (defpackage.b.v(this$0, R.string.depressionPleasurableScheduleOption11, "getString(R.string.depre…asurableScheduleOption11)", "this as java.lang.String).toLowerCase()", hashMap2, bool3)) {
                                ((RobertoTextView) styledDialog.findViewById(R.id.chip11)).setVisibility(8);
                            }
                            if (defpackage.b.v(this$0, R.string.depressionPleasurableScheduleOption12, "getString(R.string.depre…asurableScheduleOption12)", "this as java.lang.String).toLowerCase()", hashMap2, bool3)) {
                                ((RobertoTextView) styledDialog.findViewById(R.id.chip12)).setVisibility(8);
                            }
                            styledDialog.show();
                            ((RobertoEditText) styledDialog.findViewById(R.id.editText)).requestFocus();
                            Window window3 = styledDialog.getWindow();
                            if (window3 != null) {
                                window3.setSoftInputMode(5);
                            }
                            ((AppCompatImageView) styledDialog.findViewById(R.id.add)).setOnClickListener(new View.OnClickListener() { // from class: qq.u
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    int i11 = r3;
                                    Dialog dialog = styledDialog;
                                    x this$02 = this$0;
                                    switch (i11) {
                                        case 0:
                                            int i12 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.O(dialog);
                                            return;
                                        case 1:
                                            int i13 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap3 = this$02.f30086u;
                                            String lowerCase14 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase14, "this as java.lang.String).toLowerCase()");
                                            hashMap3.put(lowerCase14, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 2:
                                            int i14 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap4 = this$02.f30086u;
                                            String lowerCase15 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase15, "this as java.lang.String).toLowerCase()");
                                            hashMap4.put(lowerCase15, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 3:
                                            int i15 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap5 = this$02.f30086u;
                                            String lowerCase16 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase16, "this as java.lang.String).toLowerCase()");
                                            hashMap5.put(lowerCase16, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 4:
                                            int i16 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap6 = this$02.f30086u;
                                            String lowerCase17 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase17, "this as java.lang.String).toLowerCase()");
                                            hashMap6.put(lowerCase17, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 5:
                                            int i17 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap7 = this$02.f30086u;
                                            String lowerCase18 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase18, "this as java.lang.String).toLowerCase()");
                                            hashMap7.put(lowerCase18, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 6:
                                            int i18 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap8 = this$02.f30086u;
                                            String lowerCase19 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase19, "this as java.lang.String).toLowerCase()");
                                            hashMap8.put(lowerCase19, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 7:
                                            int i19 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap9 = this$02.f30086u;
                                            String lowerCase20 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase20, "this as java.lang.String).toLowerCase()");
                                            hashMap9.put(lowerCase20, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 8:
                                            int i20 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap10 = this$02.f30086u;
                                            String lowerCase21 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase21, "this as java.lang.String).toLowerCase()");
                                            hashMap10.put(lowerCase21, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 9:
                                            int i21 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap11 = this$02.f30086u;
                                            String lowerCase22 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase22, "this as java.lang.String).toLowerCase()");
                                            hashMap11.put(lowerCase22, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 10:
                                            int i22 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap12 = this$02.f30086u;
                                            String lowerCase23 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase23, "this as java.lang.String).toLowerCase()");
                                            hashMap12.put(lowerCase23, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 11:
                                            int i23 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap13 = this$02.f30086u;
                                            String lowerCase24 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase24, "this as java.lang.String).toLowerCase()");
                                            hashMap13.put(lowerCase24, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        default:
                                            int i24 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap14 = this$02.f30086u;
                                            String lowerCase25 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase25, "this as java.lang.String).toLowerCase()");
                                            hashMap14.put(lowerCase25, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                    }
                                }
                            });
                            ((RobertoEditText) styledDialog.findViewById(R.id.editText)).setOnEditorActionListener(new oq.l(this$0, styledDialog));
                            ((RobertoTextView) styledDialog.findViewById(R.id.chip1)).setOnClickListener(new View.OnClickListener() { // from class: qq.u
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    int i11 = r3;
                                    Dialog dialog = styledDialog;
                                    x this$02 = this$0;
                                    switch (i11) {
                                        case 0:
                                            int i12 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.O(dialog);
                                            return;
                                        case 1:
                                            int i13 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap3 = this$02.f30086u;
                                            String lowerCase14 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase14, "this as java.lang.String).toLowerCase()");
                                            hashMap3.put(lowerCase14, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 2:
                                            int i14 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap4 = this$02.f30086u;
                                            String lowerCase15 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase15, "this as java.lang.String).toLowerCase()");
                                            hashMap4.put(lowerCase15, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 3:
                                            int i15 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap5 = this$02.f30086u;
                                            String lowerCase16 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase16, "this as java.lang.String).toLowerCase()");
                                            hashMap5.put(lowerCase16, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 4:
                                            int i16 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap6 = this$02.f30086u;
                                            String lowerCase17 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase17, "this as java.lang.String).toLowerCase()");
                                            hashMap6.put(lowerCase17, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 5:
                                            int i17 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap7 = this$02.f30086u;
                                            String lowerCase18 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase18, "this as java.lang.String).toLowerCase()");
                                            hashMap7.put(lowerCase18, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 6:
                                            int i18 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap8 = this$02.f30086u;
                                            String lowerCase19 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase19, "this as java.lang.String).toLowerCase()");
                                            hashMap8.put(lowerCase19, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 7:
                                            int i19 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap9 = this$02.f30086u;
                                            String lowerCase20 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase20, "this as java.lang.String).toLowerCase()");
                                            hashMap9.put(lowerCase20, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 8:
                                            int i20 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap10 = this$02.f30086u;
                                            String lowerCase21 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase21, "this as java.lang.String).toLowerCase()");
                                            hashMap10.put(lowerCase21, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 9:
                                            int i21 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap11 = this$02.f30086u;
                                            String lowerCase22 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase22, "this as java.lang.String).toLowerCase()");
                                            hashMap11.put(lowerCase22, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 10:
                                            int i22 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap12 = this$02.f30086u;
                                            String lowerCase23 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase23, "this as java.lang.String).toLowerCase()");
                                            hashMap12.put(lowerCase23, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 11:
                                            int i23 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap13 = this$02.f30086u;
                                            String lowerCase24 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase24, "this as java.lang.String).toLowerCase()");
                                            hashMap13.put(lowerCase24, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        default:
                                            int i24 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap14 = this$02.f30086u;
                                            String lowerCase25 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase25, "this as java.lang.String).toLowerCase()");
                                            hashMap14.put(lowerCase25, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                    }
                                }
                            });
                            ((RobertoTextView) styledDialog.findViewById(R.id.chip2)).setOnClickListener(new View.OnClickListener() { // from class: qq.u
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    int i11 = r3;
                                    Dialog dialog = styledDialog;
                                    x this$02 = this$0;
                                    switch (i11) {
                                        case 0:
                                            int i12 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.O(dialog);
                                            return;
                                        case 1:
                                            int i13 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap3 = this$02.f30086u;
                                            String lowerCase14 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase14, "this as java.lang.String).toLowerCase()");
                                            hashMap3.put(lowerCase14, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 2:
                                            int i14 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap4 = this$02.f30086u;
                                            String lowerCase15 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase15, "this as java.lang.String).toLowerCase()");
                                            hashMap4.put(lowerCase15, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 3:
                                            int i15 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap5 = this$02.f30086u;
                                            String lowerCase16 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase16, "this as java.lang.String).toLowerCase()");
                                            hashMap5.put(lowerCase16, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 4:
                                            int i16 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap6 = this$02.f30086u;
                                            String lowerCase17 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase17, "this as java.lang.String).toLowerCase()");
                                            hashMap6.put(lowerCase17, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 5:
                                            int i17 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap7 = this$02.f30086u;
                                            String lowerCase18 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase18, "this as java.lang.String).toLowerCase()");
                                            hashMap7.put(lowerCase18, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 6:
                                            int i18 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap8 = this$02.f30086u;
                                            String lowerCase19 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase19, "this as java.lang.String).toLowerCase()");
                                            hashMap8.put(lowerCase19, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 7:
                                            int i19 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap9 = this$02.f30086u;
                                            String lowerCase20 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase20, "this as java.lang.String).toLowerCase()");
                                            hashMap9.put(lowerCase20, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 8:
                                            int i20 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap10 = this$02.f30086u;
                                            String lowerCase21 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase21, "this as java.lang.String).toLowerCase()");
                                            hashMap10.put(lowerCase21, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 9:
                                            int i21 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap11 = this$02.f30086u;
                                            String lowerCase22 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase22, "this as java.lang.String).toLowerCase()");
                                            hashMap11.put(lowerCase22, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 10:
                                            int i22 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap12 = this$02.f30086u;
                                            String lowerCase23 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase23, "this as java.lang.String).toLowerCase()");
                                            hashMap12.put(lowerCase23, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 11:
                                            int i23 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap13 = this$02.f30086u;
                                            String lowerCase24 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase24, "this as java.lang.String).toLowerCase()");
                                            hashMap13.put(lowerCase24, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        default:
                                            int i24 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap14 = this$02.f30086u;
                                            String lowerCase25 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase25, "this as java.lang.String).toLowerCase()");
                                            hashMap14.put(lowerCase25, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                    }
                                }
                            });
                            ((RobertoTextView) styledDialog.findViewById(R.id.chip3)).setOnClickListener(new View.OnClickListener() { // from class: qq.u
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    int i11 = r3;
                                    Dialog dialog = styledDialog;
                                    x this$02 = this$0;
                                    switch (i11) {
                                        case 0:
                                            int i12 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.O(dialog);
                                            return;
                                        case 1:
                                            int i13 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap3 = this$02.f30086u;
                                            String lowerCase14 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase14, "this as java.lang.String).toLowerCase()");
                                            hashMap3.put(lowerCase14, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 2:
                                            int i14 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap4 = this$02.f30086u;
                                            String lowerCase15 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase15, "this as java.lang.String).toLowerCase()");
                                            hashMap4.put(lowerCase15, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 3:
                                            int i15 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap5 = this$02.f30086u;
                                            String lowerCase16 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase16, "this as java.lang.String).toLowerCase()");
                                            hashMap5.put(lowerCase16, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 4:
                                            int i16 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap6 = this$02.f30086u;
                                            String lowerCase17 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase17, "this as java.lang.String).toLowerCase()");
                                            hashMap6.put(lowerCase17, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 5:
                                            int i17 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap7 = this$02.f30086u;
                                            String lowerCase18 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase18, "this as java.lang.String).toLowerCase()");
                                            hashMap7.put(lowerCase18, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 6:
                                            int i18 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap8 = this$02.f30086u;
                                            String lowerCase19 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase19, "this as java.lang.String).toLowerCase()");
                                            hashMap8.put(lowerCase19, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 7:
                                            int i19 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap9 = this$02.f30086u;
                                            String lowerCase20 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase20, "this as java.lang.String).toLowerCase()");
                                            hashMap9.put(lowerCase20, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 8:
                                            int i20 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap10 = this$02.f30086u;
                                            String lowerCase21 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase21, "this as java.lang.String).toLowerCase()");
                                            hashMap10.put(lowerCase21, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 9:
                                            int i21 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap11 = this$02.f30086u;
                                            String lowerCase22 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase22, "this as java.lang.String).toLowerCase()");
                                            hashMap11.put(lowerCase22, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 10:
                                            int i22 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap12 = this$02.f30086u;
                                            String lowerCase23 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase23, "this as java.lang.String).toLowerCase()");
                                            hashMap12.put(lowerCase23, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 11:
                                            int i23 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap13 = this$02.f30086u;
                                            String lowerCase24 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase24, "this as java.lang.String).toLowerCase()");
                                            hashMap13.put(lowerCase24, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        default:
                                            int i24 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap14 = this$02.f30086u;
                                            String lowerCase25 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase25, "this as java.lang.String).toLowerCase()");
                                            hashMap14.put(lowerCase25, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                    }
                                }
                            });
                            ((RobertoTextView) styledDialog.findViewById(R.id.chip4)).setOnClickListener(new View.OnClickListener() { // from class: qq.u
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    int i11 = r3;
                                    Dialog dialog = styledDialog;
                                    x this$02 = this$0;
                                    switch (i11) {
                                        case 0:
                                            int i12 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.O(dialog);
                                            return;
                                        case 1:
                                            int i13 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap3 = this$02.f30086u;
                                            String lowerCase14 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase14, "this as java.lang.String).toLowerCase()");
                                            hashMap3.put(lowerCase14, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 2:
                                            int i14 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap4 = this$02.f30086u;
                                            String lowerCase15 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase15, "this as java.lang.String).toLowerCase()");
                                            hashMap4.put(lowerCase15, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 3:
                                            int i15 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap5 = this$02.f30086u;
                                            String lowerCase16 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase16, "this as java.lang.String).toLowerCase()");
                                            hashMap5.put(lowerCase16, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 4:
                                            int i16 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap6 = this$02.f30086u;
                                            String lowerCase17 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase17, "this as java.lang.String).toLowerCase()");
                                            hashMap6.put(lowerCase17, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 5:
                                            int i17 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap7 = this$02.f30086u;
                                            String lowerCase18 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase18, "this as java.lang.String).toLowerCase()");
                                            hashMap7.put(lowerCase18, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 6:
                                            int i18 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap8 = this$02.f30086u;
                                            String lowerCase19 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase19, "this as java.lang.String).toLowerCase()");
                                            hashMap8.put(lowerCase19, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 7:
                                            int i19 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap9 = this$02.f30086u;
                                            String lowerCase20 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase20, "this as java.lang.String).toLowerCase()");
                                            hashMap9.put(lowerCase20, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 8:
                                            int i20 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap10 = this$02.f30086u;
                                            String lowerCase21 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase21, "this as java.lang.String).toLowerCase()");
                                            hashMap10.put(lowerCase21, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 9:
                                            int i21 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap11 = this$02.f30086u;
                                            String lowerCase22 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase22, "this as java.lang.String).toLowerCase()");
                                            hashMap11.put(lowerCase22, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 10:
                                            int i22 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap12 = this$02.f30086u;
                                            String lowerCase23 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase23, "this as java.lang.String).toLowerCase()");
                                            hashMap12.put(lowerCase23, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 11:
                                            int i23 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap13 = this$02.f30086u;
                                            String lowerCase24 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase24, "this as java.lang.String).toLowerCase()");
                                            hashMap13.put(lowerCase24, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        default:
                                            int i24 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap14 = this$02.f30086u;
                                            String lowerCase25 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase25, "this as java.lang.String).toLowerCase()");
                                            hashMap14.put(lowerCase25, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                    }
                                }
                            });
                            ((RobertoTextView) styledDialog.findViewById(R.id.chip5)).setOnClickListener(new View.OnClickListener() { // from class: qq.u
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    int i11 = r3;
                                    Dialog dialog = styledDialog;
                                    x this$02 = this$0;
                                    switch (i11) {
                                        case 0:
                                            int i12 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.O(dialog);
                                            return;
                                        case 1:
                                            int i13 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap3 = this$02.f30086u;
                                            String lowerCase14 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase14, "this as java.lang.String).toLowerCase()");
                                            hashMap3.put(lowerCase14, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 2:
                                            int i14 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap4 = this$02.f30086u;
                                            String lowerCase15 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase15, "this as java.lang.String).toLowerCase()");
                                            hashMap4.put(lowerCase15, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 3:
                                            int i15 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap5 = this$02.f30086u;
                                            String lowerCase16 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase16, "this as java.lang.String).toLowerCase()");
                                            hashMap5.put(lowerCase16, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 4:
                                            int i16 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap6 = this$02.f30086u;
                                            String lowerCase17 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase17, "this as java.lang.String).toLowerCase()");
                                            hashMap6.put(lowerCase17, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 5:
                                            int i17 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap7 = this$02.f30086u;
                                            String lowerCase18 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase18, "this as java.lang.String).toLowerCase()");
                                            hashMap7.put(lowerCase18, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 6:
                                            int i18 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap8 = this$02.f30086u;
                                            String lowerCase19 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase19, "this as java.lang.String).toLowerCase()");
                                            hashMap8.put(lowerCase19, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 7:
                                            int i19 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap9 = this$02.f30086u;
                                            String lowerCase20 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase20, "this as java.lang.String).toLowerCase()");
                                            hashMap9.put(lowerCase20, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 8:
                                            int i20 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap10 = this$02.f30086u;
                                            String lowerCase21 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase21, "this as java.lang.String).toLowerCase()");
                                            hashMap10.put(lowerCase21, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 9:
                                            int i21 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap11 = this$02.f30086u;
                                            String lowerCase22 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase22, "this as java.lang.String).toLowerCase()");
                                            hashMap11.put(lowerCase22, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 10:
                                            int i22 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap12 = this$02.f30086u;
                                            String lowerCase23 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase23, "this as java.lang.String).toLowerCase()");
                                            hashMap12.put(lowerCase23, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 11:
                                            int i23 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap13 = this$02.f30086u;
                                            String lowerCase24 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase24, "this as java.lang.String).toLowerCase()");
                                            hashMap13.put(lowerCase24, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        default:
                                            int i24 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap14 = this$02.f30086u;
                                            String lowerCase25 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase25, "this as java.lang.String).toLowerCase()");
                                            hashMap14.put(lowerCase25, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                    }
                                }
                            });
                            ((RobertoTextView) styledDialog.findViewById(R.id.chip6)).setOnClickListener(new View.OnClickListener() { // from class: qq.u
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    int i11 = r3;
                                    Dialog dialog = styledDialog;
                                    x this$02 = this$0;
                                    switch (i11) {
                                        case 0:
                                            int i12 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.O(dialog);
                                            return;
                                        case 1:
                                            int i13 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap3 = this$02.f30086u;
                                            String lowerCase14 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase14, "this as java.lang.String).toLowerCase()");
                                            hashMap3.put(lowerCase14, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 2:
                                            int i14 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap4 = this$02.f30086u;
                                            String lowerCase15 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase15, "this as java.lang.String).toLowerCase()");
                                            hashMap4.put(lowerCase15, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 3:
                                            int i15 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap5 = this$02.f30086u;
                                            String lowerCase16 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase16, "this as java.lang.String).toLowerCase()");
                                            hashMap5.put(lowerCase16, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 4:
                                            int i16 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap6 = this$02.f30086u;
                                            String lowerCase17 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase17, "this as java.lang.String).toLowerCase()");
                                            hashMap6.put(lowerCase17, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 5:
                                            int i17 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap7 = this$02.f30086u;
                                            String lowerCase18 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase18, "this as java.lang.String).toLowerCase()");
                                            hashMap7.put(lowerCase18, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 6:
                                            int i18 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap8 = this$02.f30086u;
                                            String lowerCase19 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase19, "this as java.lang.String).toLowerCase()");
                                            hashMap8.put(lowerCase19, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 7:
                                            int i19 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap9 = this$02.f30086u;
                                            String lowerCase20 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase20, "this as java.lang.String).toLowerCase()");
                                            hashMap9.put(lowerCase20, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 8:
                                            int i20 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap10 = this$02.f30086u;
                                            String lowerCase21 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase21, "this as java.lang.String).toLowerCase()");
                                            hashMap10.put(lowerCase21, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 9:
                                            int i21 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap11 = this$02.f30086u;
                                            String lowerCase22 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase22, "this as java.lang.String).toLowerCase()");
                                            hashMap11.put(lowerCase22, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 10:
                                            int i22 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap12 = this$02.f30086u;
                                            String lowerCase23 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase23, "this as java.lang.String).toLowerCase()");
                                            hashMap12.put(lowerCase23, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 11:
                                            int i23 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap13 = this$02.f30086u;
                                            String lowerCase24 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase24, "this as java.lang.String).toLowerCase()");
                                            hashMap13.put(lowerCase24, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        default:
                                            int i24 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap14 = this$02.f30086u;
                                            String lowerCase25 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase25, "this as java.lang.String).toLowerCase()");
                                            hashMap14.put(lowerCase25, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                    }
                                }
                            });
                            ((RobertoTextView) styledDialog.findViewById(R.id.chip7)).setOnClickListener(new View.OnClickListener() { // from class: qq.u
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    int i11 = r3;
                                    Dialog dialog = styledDialog;
                                    x this$02 = this$0;
                                    switch (i11) {
                                        case 0:
                                            int i12 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.O(dialog);
                                            return;
                                        case 1:
                                            int i13 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap3 = this$02.f30086u;
                                            String lowerCase14 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase14, "this as java.lang.String).toLowerCase()");
                                            hashMap3.put(lowerCase14, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 2:
                                            int i14 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap4 = this$02.f30086u;
                                            String lowerCase15 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase15, "this as java.lang.String).toLowerCase()");
                                            hashMap4.put(lowerCase15, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 3:
                                            int i15 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap5 = this$02.f30086u;
                                            String lowerCase16 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase16, "this as java.lang.String).toLowerCase()");
                                            hashMap5.put(lowerCase16, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 4:
                                            int i16 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap6 = this$02.f30086u;
                                            String lowerCase17 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase17, "this as java.lang.String).toLowerCase()");
                                            hashMap6.put(lowerCase17, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 5:
                                            int i17 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap7 = this$02.f30086u;
                                            String lowerCase18 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase18, "this as java.lang.String).toLowerCase()");
                                            hashMap7.put(lowerCase18, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 6:
                                            int i18 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap8 = this$02.f30086u;
                                            String lowerCase19 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase19, "this as java.lang.String).toLowerCase()");
                                            hashMap8.put(lowerCase19, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 7:
                                            int i19 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap9 = this$02.f30086u;
                                            String lowerCase20 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase20, "this as java.lang.String).toLowerCase()");
                                            hashMap9.put(lowerCase20, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 8:
                                            int i20 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap10 = this$02.f30086u;
                                            String lowerCase21 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase21, "this as java.lang.String).toLowerCase()");
                                            hashMap10.put(lowerCase21, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 9:
                                            int i21 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap11 = this$02.f30086u;
                                            String lowerCase22 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase22, "this as java.lang.String).toLowerCase()");
                                            hashMap11.put(lowerCase22, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 10:
                                            int i22 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap12 = this$02.f30086u;
                                            String lowerCase23 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase23, "this as java.lang.String).toLowerCase()");
                                            hashMap12.put(lowerCase23, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 11:
                                            int i23 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap13 = this$02.f30086u;
                                            String lowerCase24 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase24, "this as java.lang.String).toLowerCase()");
                                            hashMap13.put(lowerCase24, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        default:
                                            int i24 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap14 = this$02.f30086u;
                                            String lowerCase25 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase25, "this as java.lang.String).toLowerCase()");
                                            hashMap14.put(lowerCase25, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                    }
                                }
                            });
                            ((RobertoTextView) styledDialog.findViewById(R.id.chip8)).setOnClickListener(new View.OnClickListener() { // from class: qq.u
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    int i11 = r3;
                                    Dialog dialog = styledDialog;
                                    x this$02 = this$0;
                                    switch (i11) {
                                        case 0:
                                            int i12 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.O(dialog);
                                            return;
                                        case 1:
                                            int i13 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap3 = this$02.f30086u;
                                            String lowerCase14 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase14, "this as java.lang.String).toLowerCase()");
                                            hashMap3.put(lowerCase14, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 2:
                                            int i14 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap4 = this$02.f30086u;
                                            String lowerCase15 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase15, "this as java.lang.String).toLowerCase()");
                                            hashMap4.put(lowerCase15, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 3:
                                            int i15 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap5 = this$02.f30086u;
                                            String lowerCase16 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase16, "this as java.lang.String).toLowerCase()");
                                            hashMap5.put(lowerCase16, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 4:
                                            int i16 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap6 = this$02.f30086u;
                                            String lowerCase17 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase17, "this as java.lang.String).toLowerCase()");
                                            hashMap6.put(lowerCase17, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 5:
                                            int i17 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap7 = this$02.f30086u;
                                            String lowerCase18 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase18, "this as java.lang.String).toLowerCase()");
                                            hashMap7.put(lowerCase18, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 6:
                                            int i18 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap8 = this$02.f30086u;
                                            String lowerCase19 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase19, "this as java.lang.String).toLowerCase()");
                                            hashMap8.put(lowerCase19, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 7:
                                            int i19 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap9 = this$02.f30086u;
                                            String lowerCase20 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase20, "this as java.lang.String).toLowerCase()");
                                            hashMap9.put(lowerCase20, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 8:
                                            int i20 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap10 = this$02.f30086u;
                                            String lowerCase21 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase21, "this as java.lang.String).toLowerCase()");
                                            hashMap10.put(lowerCase21, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 9:
                                            int i21 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap11 = this$02.f30086u;
                                            String lowerCase22 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase22, "this as java.lang.String).toLowerCase()");
                                            hashMap11.put(lowerCase22, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 10:
                                            int i22 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap12 = this$02.f30086u;
                                            String lowerCase23 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase23, "this as java.lang.String).toLowerCase()");
                                            hashMap12.put(lowerCase23, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 11:
                                            int i23 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap13 = this$02.f30086u;
                                            String lowerCase24 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase24, "this as java.lang.String).toLowerCase()");
                                            hashMap13.put(lowerCase24, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        default:
                                            int i24 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap14 = this$02.f30086u;
                                            String lowerCase25 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase25, "this as java.lang.String).toLowerCase()");
                                            hashMap14.put(lowerCase25, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                    }
                                }
                            });
                            ((RobertoTextView) styledDialog.findViewById(R.id.chip9)).setOnClickListener(new View.OnClickListener() { // from class: qq.u
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    int i11 = r3;
                                    Dialog dialog = styledDialog;
                                    x this$02 = this$0;
                                    switch (i11) {
                                        case 0:
                                            int i12 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.O(dialog);
                                            return;
                                        case 1:
                                            int i13 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap3 = this$02.f30086u;
                                            String lowerCase14 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase14, "this as java.lang.String).toLowerCase()");
                                            hashMap3.put(lowerCase14, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 2:
                                            int i14 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap4 = this$02.f30086u;
                                            String lowerCase15 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase15, "this as java.lang.String).toLowerCase()");
                                            hashMap4.put(lowerCase15, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 3:
                                            int i15 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap5 = this$02.f30086u;
                                            String lowerCase16 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase16, "this as java.lang.String).toLowerCase()");
                                            hashMap5.put(lowerCase16, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 4:
                                            int i16 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap6 = this$02.f30086u;
                                            String lowerCase17 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase17, "this as java.lang.String).toLowerCase()");
                                            hashMap6.put(lowerCase17, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 5:
                                            int i17 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap7 = this$02.f30086u;
                                            String lowerCase18 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase18, "this as java.lang.String).toLowerCase()");
                                            hashMap7.put(lowerCase18, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 6:
                                            int i18 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap8 = this$02.f30086u;
                                            String lowerCase19 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase19, "this as java.lang.String).toLowerCase()");
                                            hashMap8.put(lowerCase19, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 7:
                                            int i19 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap9 = this$02.f30086u;
                                            String lowerCase20 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase20, "this as java.lang.String).toLowerCase()");
                                            hashMap9.put(lowerCase20, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 8:
                                            int i20 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap10 = this$02.f30086u;
                                            String lowerCase21 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase21, "this as java.lang.String).toLowerCase()");
                                            hashMap10.put(lowerCase21, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 9:
                                            int i21 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap11 = this$02.f30086u;
                                            String lowerCase22 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase22, "this as java.lang.String).toLowerCase()");
                                            hashMap11.put(lowerCase22, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 10:
                                            int i22 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap12 = this$02.f30086u;
                                            String lowerCase23 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase23, "this as java.lang.String).toLowerCase()");
                                            hashMap12.put(lowerCase23, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 11:
                                            int i23 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap13 = this$02.f30086u;
                                            String lowerCase24 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase24, "this as java.lang.String).toLowerCase()");
                                            hashMap13.put(lowerCase24, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        default:
                                            int i24 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap14 = this$02.f30086u;
                                            String lowerCase25 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase25, "this as java.lang.String).toLowerCase()");
                                            hashMap14.put(lowerCase25, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                    }
                                }
                            });
                            ((RobertoTextView) styledDialog.findViewById(R.id.chip10)).setOnClickListener(new View.OnClickListener() { // from class: qq.u
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    int i11 = r3;
                                    Dialog dialog = styledDialog;
                                    x this$02 = this$0;
                                    switch (i11) {
                                        case 0:
                                            int i12 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.O(dialog);
                                            return;
                                        case 1:
                                            int i13 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap3 = this$02.f30086u;
                                            String lowerCase14 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase14, "this as java.lang.String).toLowerCase()");
                                            hashMap3.put(lowerCase14, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 2:
                                            int i14 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap4 = this$02.f30086u;
                                            String lowerCase15 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase15, "this as java.lang.String).toLowerCase()");
                                            hashMap4.put(lowerCase15, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 3:
                                            int i15 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap5 = this$02.f30086u;
                                            String lowerCase16 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase16, "this as java.lang.String).toLowerCase()");
                                            hashMap5.put(lowerCase16, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 4:
                                            int i16 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap6 = this$02.f30086u;
                                            String lowerCase17 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase17, "this as java.lang.String).toLowerCase()");
                                            hashMap6.put(lowerCase17, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 5:
                                            int i17 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap7 = this$02.f30086u;
                                            String lowerCase18 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase18, "this as java.lang.String).toLowerCase()");
                                            hashMap7.put(lowerCase18, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 6:
                                            int i18 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap8 = this$02.f30086u;
                                            String lowerCase19 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase19, "this as java.lang.String).toLowerCase()");
                                            hashMap8.put(lowerCase19, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 7:
                                            int i19 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap9 = this$02.f30086u;
                                            String lowerCase20 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase20, "this as java.lang.String).toLowerCase()");
                                            hashMap9.put(lowerCase20, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 8:
                                            int i20 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap10 = this$02.f30086u;
                                            String lowerCase21 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase21, "this as java.lang.String).toLowerCase()");
                                            hashMap10.put(lowerCase21, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 9:
                                            int i21 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap11 = this$02.f30086u;
                                            String lowerCase22 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase22, "this as java.lang.String).toLowerCase()");
                                            hashMap11.put(lowerCase22, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 10:
                                            int i22 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap12 = this$02.f30086u;
                                            String lowerCase23 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase23, "this as java.lang.String).toLowerCase()");
                                            hashMap12.put(lowerCase23, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 11:
                                            int i23 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap13 = this$02.f30086u;
                                            String lowerCase24 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase24, "this as java.lang.String).toLowerCase()");
                                            hashMap13.put(lowerCase24, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        default:
                                            int i24 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap14 = this$02.f30086u;
                                            String lowerCase25 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase25, "this as java.lang.String).toLowerCase()");
                                            hashMap14.put(lowerCase25, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                    }
                                }
                            });
                            ((RobertoTextView) styledDialog.findViewById(R.id.chip11)).setOnClickListener(new View.OnClickListener() { // from class: qq.u
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    int i11 = r3;
                                    Dialog dialog = styledDialog;
                                    x this$02 = this$0;
                                    switch (i11) {
                                        case 0:
                                            int i12 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.O(dialog);
                                            return;
                                        case 1:
                                            int i13 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap3 = this$02.f30086u;
                                            String lowerCase14 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase14, "this as java.lang.String).toLowerCase()");
                                            hashMap3.put(lowerCase14, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 2:
                                            int i14 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap4 = this$02.f30086u;
                                            String lowerCase15 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase15, "this as java.lang.String).toLowerCase()");
                                            hashMap4.put(lowerCase15, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 3:
                                            int i15 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap5 = this$02.f30086u;
                                            String lowerCase16 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase16, "this as java.lang.String).toLowerCase()");
                                            hashMap5.put(lowerCase16, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 4:
                                            int i16 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap6 = this$02.f30086u;
                                            String lowerCase17 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase17, "this as java.lang.String).toLowerCase()");
                                            hashMap6.put(lowerCase17, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 5:
                                            int i17 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap7 = this$02.f30086u;
                                            String lowerCase18 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase18, "this as java.lang.String).toLowerCase()");
                                            hashMap7.put(lowerCase18, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 6:
                                            int i18 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap8 = this$02.f30086u;
                                            String lowerCase19 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase19, "this as java.lang.String).toLowerCase()");
                                            hashMap8.put(lowerCase19, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 7:
                                            int i19 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap9 = this$02.f30086u;
                                            String lowerCase20 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase20, "this as java.lang.String).toLowerCase()");
                                            hashMap9.put(lowerCase20, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 8:
                                            int i20 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap10 = this$02.f30086u;
                                            String lowerCase21 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase21, "this as java.lang.String).toLowerCase()");
                                            hashMap10.put(lowerCase21, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 9:
                                            int i21 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap11 = this$02.f30086u;
                                            String lowerCase22 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase22, "this as java.lang.String).toLowerCase()");
                                            hashMap11.put(lowerCase22, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 10:
                                            int i22 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap12 = this$02.f30086u;
                                            String lowerCase23 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase23, "this as java.lang.String).toLowerCase()");
                                            hashMap12.put(lowerCase23, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 11:
                                            int i23 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap13 = this$02.f30086u;
                                            String lowerCase24 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase24, "this as java.lang.String).toLowerCase()");
                                            hashMap13.put(lowerCase24, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        default:
                                            int i24 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap14 = this$02.f30086u;
                                            String lowerCase25 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase25, "this as java.lang.String).toLowerCase()");
                                            hashMap14.put(lowerCase25, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                    }
                                }
                            });
                            ((RobertoTextView) styledDialog.findViewById(R.id.chip12)).setOnClickListener(new View.OnClickListener() { // from class: qq.u
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    int i11 = r3;
                                    Dialog dialog = styledDialog;
                                    x this$02 = this$0;
                                    switch (i11) {
                                        case 0:
                                            int i12 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.O(dialog);
                                            return;
                                        case 1:
                                            int i13 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap3 = this$02.f30086u;
                                            String lowerCase14 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip9)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase14, "this as java.lang.String).toLowerCase()");
                                            hashMap3.put(lowerCase14, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 2:
                                            int i14 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap4 = this$02.f30086u;
                                            String lowerCase15 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip10)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase15, "this as java.lang.String).toLowerCase()");
                                            hashMap4.put(lowerCase15, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 3:
                                            int i15 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap5 = this$02.f30086u;
                                            String lowerCase16 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip11)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase16, "this as java.lang.String).toLowerCase()");
                                            hashMap5.put(lowerCase16, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 4:
                                            int i16 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap6 = this$02.f30086u;
                                            String lowerCase17 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip12)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase17, "this as java.lang.String).toLowerCase()");
                                            hashMap6.put(lowerCase17, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 5:
                                            int i17 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap7 = this$02.f30086u;
                                            String lowerCase18 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip1)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase18, "this as java.lang.String).toLowerCase()");
                                            hashMap7.put(lowerCase18, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 6:
                                            int i18 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap8 = this$02.f30086u;
                                            String lowerCase19 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip2)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase19, "this as java.lang.String).toLowerCase()");
                                            hashMap8.put(lowerCase19, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 7:
                                            int i19 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap9 = this$02.f30086u;
                                            String lowerCase20 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip3)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase20, "this as java.lang.String).toLowerCase()");
                                            hashMap9.put(lowerCase20, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 8:
                                            int i20 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap10 = this$02.f30086u;
                                            String lowerCase21 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip4)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase21, "this as java.lang.String).toLowerCase()");
                                            hashMap10.put(lowerCase21, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 9:
                                            int i21 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap11 = this$02.f30086u;
                                            String lowerCase22 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip5)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase22, "this as java.lang.String).toLowerCase()");
                                            hashMap11.put(lowerCase22, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 10:
                                            int i22 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap12 = this$02.f30086u;
                                            String lowerCase23 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip6)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase23, "this as java.lang.String).toLowerCase()");
                                            hashMap12.put(lowerCase23, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        case 11:
                                            int i23 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap13 = this$02.f30086u;
                                            String lowerCase24 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip7)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase24, "this as java.lang.String).toLowerCase()");
                                            hashMap13.put(lowerCase24, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                        default:
                                            int i24 = x.f30085x;
                                            kotlin.jvm.internal.i.g(this$02, "this$0");
                                            kotlin.jvm.internal.i.g(dialog, "$dialog");
                                            this$02.J(gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString());
                                            HashMap<String, Boolean> hashMap14 = this$02.f30086u;
                                            String lowerCase25 = gv.r.i1(((RobertoTextView) dialog.findViewById(R.id.chip8)).getText().toString()).toString().toLowerCase();
                                            kotlin.jvm.internal.i.f(lowerCase25, "this as java.lang.String).toLowerCase()");
                                            hashMap14.put(lowerCase25, Boolean.TRUE);
                                            dialog.dismiss();
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            int i11 = x.f30085x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                            if (((DepressionPleasurableActivity) activity).B.isEmpty()) {
                                Toast.makeText(this$0.getActivity(), this$0.getString(R.string.depressionPleasurableScheduleError), 0).show();
                                return;
                            }
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                            ((DepressionPleasurableActivity) activity2).t0();
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30087v, e10);
        }
    }
}
