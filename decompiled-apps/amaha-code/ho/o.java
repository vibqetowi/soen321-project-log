package ho;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.Glide;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.ActivitiesActivity;
import com.theinnerhour.b2b.activity.DepressionPleasurableActivity;
import com.theinnerhour.b2b.activity.T1Activity;
import com.theinnerhour.b2b.activity.T4CActivity;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentEditProfileActivity;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentProfileActivity;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.components.resetprogram.activity.ResetProgrammeActivity;
import com.theinnerhour.b2b.components.resetprogram.activity.ResetProgrammeLoadingActivity;
import com.theinnerhour.b2b.components.resources.model.ResourceData;
import com.theinnerhour.b2b.fragment.coping.a;
import com.theinnerhour.b2b.model.CourseDayDomainModelV1;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GoalNotificationContent;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.model.GratitudeLetterModel;
import com.theinnerhour.b2b.model.PostsRead;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.CustomViewPager;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import fq.a1;
import fq.v0;
import g0.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import vp.a;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f18033u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f18034v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f18035w;

    public /* synthetic */ o(Object obj, int i6, Object obj2) {
        this.f18033u = i6;
        this.f18035w = obj;
        this.f18034v = obj2;
    }

    private final void a() {
        pq.x this$0 = (pq.x) this.f18035w;
        View view = (View) this.f18034v;
        int i6 = pq.x.A;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        this$0.K(((RobertoTextView) view.findViewById(R.id.rowTitle)).getText().toString());
        this$0.f28833v = ((RobertoTextView) view.findViewById(R.id.rowTitle)).getText().toString();
        ((RadioButton) view.findViewById(R.id.radioToggle)).setChecked(true);
        ((RadioButton) view.findViewById(R.id.radioToggle)).setButtonTintList(ColorStateList.valueOf(g0.a.b(this$0.requireActivity(), R.color.sea)));
        ((RobertoButton) this$0._$_findCachedViewById(R.id.continueCTA)).setBackground(a.c.b(this$0.requireContext(), R.drawable.button_dark_grey_fill));
    }

    private final void b() {
        qq.p this$0 = (qq.p) this.f18035w;
        View view = (View) this.f18034v;
        int i6 = qq.p.f30056x;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        ((RobertoButton) this$0._$_findCachedViewById(R.id.continueCTA)).setBackgroundResource(R.drawable.button_dark_grey_fill);
        View view2 = this$0.f30057u;
        if (view2 != null) {
            view2.setBackgroundResource(R.drawable.background_curved_grey_corner_5dp);
            View view3 = this$0.f30057u;
            kotlin.jvm.internal.i.d(view3);
            view3.setEnabled(true);
        }
        view.setEnabled(false);
        view.setBackgroundResource(R.drawable.grey_rounded_corners_blue_stroke);
        this$0.f30057u = view;
    }

    /* JADX WARN: Type inference failed for: r2v61, types: [T, java.lang.String] */
    private final void c() {
        final qq.x this$0 = (qq.x) this.f18035w;
        final View v10 = (View) this.f18034v;
        int i6 = qq.x.f30085x;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.f(v10, "v");
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
        HashMap<String, Boolean> hashMap = this$0.f30086u;
        String string = this$0.getString(R.string.depressionPleasurableScheduleOption1);
        kotlin.jvm.internal.i.f(string, "getString(R.string.depre…easurableScheduleOption1)");
        String lowerCase = string.toLowerCase();
        kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
        Boolean bool = hashMap.get(lowerCase);
        Boolean bool2 = Boolean.TRUE;
        if (kotlin.jvm.internal.i.b(bool, bool2)) {
            ((RobertoTextView) styledDialog.findViewById(R.id.chip1)).setVisibility(8);
        }
        if (defpackage.b.v(this$0, R.string.depressionPleasurableScheduleOption2, "getString(R.string.depre…easurableScheduleOption2)", "this as java.lang.String).toLowerCase()", hashMap, bool2)) {
            ((RobertoTextView) styledDialog.findViewById(R.id.chip2)).setVisibility(8);
        }
        if (defpackage.b.v(this$0, R.string.depressionPleasurableScheduleOption3, "getString(R.string.depre…easurableScheduleOption3)", "this as java.lang.String).toLowerCase()", hashMap, bool2)) {
            ((RobertoTextView) styledDialog.findViewById(R.id.chip3)).setVisibility(8);
        }
        if (defpackage.b.v(this$0, R.string.depressionPleasurableScheduleOption4, "getString(R.string.depre…easurableScheduleOption4)", "this as java.lang.String).toLowerCase()", hashMap, bool2)) {
            ((RobertoTextView) styledDialog.findViewById(R.id.chip4)).setVisibility(8);
        }
        if (defpackage.b.v(this$0, R.string.depressionPleasurableScheduleOption5, "getString(R.string.depre…easurableScheduleOption5)", "this as java.lang.String).toLowerCase()", hashMap, bool2)) {
            ((RobertoTextView) styledDialog.findViewById(R.id.chip5)).setVisibility(8);
        }
        if (defpackage.b.v(this$0, R.string.depressionPleasurableScheduleOption6, "getString(R.string.depre…easurableScheduleOption6)", "this as java.lang.String).toLowerCase()", hashMap, bool2)) {
            ((RobertoTextView) styledDialog.findViewById(R.id.chip6)).setVisibility(8);
        }
        if (defpackage.b.v(this$0, R.string.depressionPleasurableScheduleOption7, "getString(R.string.depre…easurableScheduleOption7)", "this as java.lang.String).toLowerCase()", hashMap, bool2)) {
            ((RobertoTextView) styledDialog.findViewById(R.id.chip7)).setVisibility(8);
        }
        if (defpackage.b.v(this$0, R.string.depressionPleasurableScheduleOption8, "getString(R.string.depre…easurableScheduleOption8)", "this as java.lang.String).toLowerCase()", hashMap, bool2)) {
            ((RobertoTextView) styledDialog.findViewById(R.id.chip8)).setVisibility(8);
        }
        if (defpackage.b.v(this$0, R.string.depressionPleasurableScheduleOption9, "getString(R.string.depre…easurableScheduleOption9)", "this as java.lang.String).toLowerCase()", hashMap, bool2)) {
            ((RobertoTextView) styledDialog.findViewById(R.id.chip9)).setVisibility(8);
        }
        if (defpackage.b.v(this$0, R.string.depressionPleasurableScheduleOption10, "getString(R.string.depre…asurableScheduleOption10)", "this as java.lang.String).toLowerCase()", hashMap, bool2)) {
            ((RobertoTextView) styledDialog.findViewById(R.id.chip10)).setVisibility(8);
        }
        if (defpackage.b.v(this$0, R.string.depressionPleasurableScheduleOption11, "getString(R.string.depre…asurableScheduleOption11)", "this as java.lang.String).toLowerCase()", hashMap, bool2)) {
            ((RobertoTextView) styledDialog.findViewById(R.id.chip11)).setVisibility(8);
        }
        if (defpackage.b.v(this$0, R.string.depressionPleasurableScheduleOption12, "getString(R.string.depre…asurableScheduleOption12)", "this as java.lang.String).toLowerCase()", hashMap, bool2)) {
            ((RobertoTextView) styledDialog.findViewById(R.id.chip12)).setVisibility(8);
        }
        styledDialog.show();
        final kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        xVar.f23469u = ((RobertoTextView) v10.findViewById(R.id.rowContent)).getText().toString();
        ((RobertoEditText) styledDialog.findViewById(R.id.editText)).setText((CharSequence) xVar.f23469u);
        ((RobertoEditText) styledDialog.findViewById(R.id.editText)).requestFocus();
        Window window3 = styledDialog.getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(5);
        }
        ((AppCompatImageView) styledDialog.findViewById(R.id.add)).setOnClickListener(new qq.v(styledDialog, this$0, xVar, v10));
        ((RobertoEditText) styledDialog.findViewById(R.id.editText)).setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: qq.w
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                int i11 = x.f30085x;
                Dialog dialog = styledDialog;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                x this$02 = this$0;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                kotlin.jvm.internal.x currText = xVar;
                kotlin.jvm.internal.i.g(currText, "$currText");
                View v11 = v10;
                kotlin.jvm.internal.i.g(v11, "$v");
                if (i10 == 6) {
                    if (kotlin.jvm.internal.i.b(gv.r.i1(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editText)).getText())).toString(), "")) {
                        Toast.makeText(this$02.getActivity(), "Please enter or select a task to add it to the schedule", 0).show();
                        return true;
                    }
                    androidx.fragment.app.p activity = this$02.getActivity();
                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                    if (x.M(gv.r.i1(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editText)).getText())).toString(), ((DepressionPleasurableActivity) activity).B)) {
                        Toast.makeText(this$02.getActivity(), "This task has already been added to the schedule", 0).show();
                        return true;
                    }
                    HashMap<String, Boolean> hashMap2 = this$02.f30086u;
                    String lowerCase2 = ((String) currText.f23469u).toLowerCase();
                    kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase()");
                    if (hashMap2.containsKey(lowerCase2)) {
                        String lowerCase3 = ((String) currText.f23469u).toLowerCase();
                        kotlin.jvm.internal.i.f(lowerCase3, "this as java.lang.String).toLowerCase()");
                        if (kotlin.jvm.internal.i.b(hashMap2.get(lowerCase3), Boolean.TRUE)) {
                            String lowerCase4 = ((String) currText.f23469u).toLowerCase();
                            kotlin.jvm.internal.i.f(lowerCase4, "this as java.lang.String).toLowerCase()");
                            hashMap2.put(lowerCase4, Boolean.FALSE);
                        }
                    }
                    String lowerCase5 = gv.r.i1(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editText)).getText())).toString().toLowerCase();
                    kotlin.jvm.internal.i.f(lowerCase5, "this as java.lang.String).toLowerCase()");
                    if (hashMap2.containsKey(lowerCase5)) {
                        String lowerCase6 = gv.r.i1(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editText)).getText())).toString().toLowerCase();
                        kotlin.jvm.internal.i.f(lowerCase6, "this as java.lang.String).toLowerCase()");
                        if (kotlin.jvm.internal.i.b(hashMap2.get(lowerCase6), Boolean.FALSE)) {
                            String lowerCase7 = gv.r.i1(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editText)).getText())).toString().toLowerCase();
                            kotlin.jvm.internal.i.f(lowerCase7, "this as java.lang.String).toLowerCase()");
                            hashMap2.put(lowerCase7, Boolean.TRUE);
                        }
                    }
                    androidx.fragment.app.p activity2 = this$02.getActivity();
                    kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                    ((DepressionPleasurableActivity) activity2).B.remove(((RobertoTextView) v11.findViewById(R.id.rowContent)).getText().toString());
                    ((RobertoTextView) v11.findViewById(R.id.rowContent)).setText(gv.r.i1(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editText)).getText())).toString());
                    androidx.fragment.app.p activity3 = this$02.getActivity();
                    kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                    ((DepressionPleasurableActivity) activity3).B.add(gv.r.i1(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editText)).getText())).toString());
                    dialog.dismiss();
                    return true;
                }
                return true;
            }
        });
        ((RobertoTextView) styledDialog.findViewById(R.id.chip1)).setOnClickListener(new qq.v(this$0, styledDialog, v10, xVar, 5));
        ((RobertoTextView) styledDialog.findViewById(R.id.chip2)).setOnClickListener(new qq.v(this$0, styledDialog, v10, xVar, 6));
        ((RobertoTextView) styledDialog.findViewById(R.id.chip3)).setOnClickListener(new qq.v(this$0, styledDialog, v10, xVar, 7));
        ((RobertoTextView) styledDialog.findViewById(R.id.chip4)).setOnClickListener(new qq.v(this$0, styledDialog, v10, xVar, 8));
        ((RobertoTextView) styledDialog.findViewById(R.id.chip5)).setOnClickListener(new qq.v(this$0, styledDialog, v10, xVar, 9));
        ((RobertoTextView) styledDialog.findViewById(R.id.chip6)).setOnClickListener(new qq.v(this$0, styledDialog, v10, xVar, 10));
        ((RobertoTextView) styledDialog.findViewById(R.id.chip7)).setOnClickListener(new qq.v(this$0, styledDialog, v10, xVar, 11));
        ((RobertoTextView) styledDialog.findViewById(R.id.chip8)).setOnClickListener(new qq.v(this$0, styledDialog, v10, xVar, 12));
        ((RobertoTextView) styledDialog.findViewById(R.id.chip9)).setOnClickListener(new qq.v(this$0, styledDialog, v10, xVar, 1));
        ((RobertoTextView) styledDialog.findViewById(R.id.chip10)).setOnClickListener(new qq.v(this$0, styledDialog, v10, xVar, 2));
        ((RobertoTextView) styledDialog.findViewById(R.id.chip11)).setOnClickListener(new qq.v(this$0, styledDialog, v10, xVar, 3));
        ((RobertoTextView) styledDialog.findViewById(R.id.chip12)).setOnClickListener(new qq.v(this$0, styledDialog, v10, xVar, 4));
    }

    private final void d() {
        boolean z10;
        Dialog dialog = (Dialog) this.f18035w;
        rq.g this$0 = (rq.g) this.f18034v;
        int i6 = rq.g.B;
        kotlin.jvm.internal.i.g(dialog, "$dialog");
        kotlin.jvm.internal.i.g(this$0, "this$0");
        Editable text = ((RobertoEditText) dialog.findViewById(R.id.editTextOption)).getText();
        if (text != null && !gv.n.B0(text)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            if (this$0.K(gv.r.i1(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editTextOption)).getText())).toString(), this$0.f30939y) != -1) {
                Context context = this$0.getContext();
                kotlin.jvm.internal.i.d(context);
                Toast.makeText(context, "This Chip is Already added", 1).show();
                return;
            }
            ArrayList<String> arrayList = this$0.f30938x;
            if (this$0.K(gv.r.i1(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editTextOption)).getText())).toString(), arrayList) != -1) {
                this$0.f30937w.add(arrayList.remove(this$0.K(gv.r.i1(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editTextOption)).getText())).toString(), arrayList)));
            }
            this$0.O(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editTextOption)).getText()), true, false);
            dialog.dismiss();
            return;
        }
        Context context2 = this$0.getContext();
        kotlin.jvm.internal.i.d(context2);
        Toast.makeText(context2, "Type Something", 1).show();
    }

    private final void e() {
        rq.g this$0 = (rq.g) this.f18035w;
        Chip ch2 = (Chip) this.f18034v;
        int i6 = rq.g.B;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(ch2, "$ch");
        this$0.f30939y.remove(gv.r.i1(ch2.getText().toString()).toString());
        ((ChipGroup) this$0._$_findCachedViewById(R.id.chipGroupAdd)).removeView(ch2);
        this$0.f30936v.remove(ch2);
        if (ch2.isChecked()) {
            ch2.setChecked(false);
        }
        ArrayList<String> arrayList = this$0.f30937w;
        if (this$0.K(gv.r.i1(ch2.getText().toString()).toString(), arrayList) != -1) {
            this$0.f30938x.add(arrayList.remove(this$0.K(gv.r.i1(ch2.getText().toString()).toString(), arrayList)));
        }
    }

    private final void f() {
        rq.q this$0 = (rq.q) this.f18035w;
        kotlin.jvm.internal.v position = (kotlin.jvm.internal.v) this.f18034v;
        int i6 = rq.q.f30978x;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(position, "$position");
        ((CustomViewPager) this$0._$_findCachedViewById(R.id.a25ViewPager)).v(position.f23467u);
        position.f23467u++;
    }

    /* JADX WARN: Type inference failed for: r0v164, types: [T, com.theinnerhour.b2b.model.Goal] */
    /* JADX WARN: Type inference failed for: r5v18, types: [T, androidx.fragment.app.n, com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RobertoButton robertoButton;
        View childAt;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z10;
        boolean z11;
        boolean z12;
        long parseInt;
        boolean z13;
        String string;
        Intent intent;
        boolean z14;
        int i6 = this.f18033u;
        Object obj5 = this.f18034v;
        Object obj6 = this.f18035w;
        boolean z15 = false;
        int i10 = 0;
        char c10 = 0;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        switch (i6) {
            case 0:
                p this$0 = (p) obj6;
                View view2 = (View) obj5;
                int i11 = p.f18036y;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                int childCount = ((LinearLayout) this$0._$_findCachedViewById(R.id.proactiveOptionsLL)).getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    LinearLayout linearLayout = (LinearLayout) this$0._$_findCachedViewById(R.id.proactiveOptionsLL);
                    if (linearLayout != null && (childAt = linearLayout.getChildAt(i12)) != null) {
                        robertoButton = (RobertoButton) childAt.findViewById(R.id.optionButton);
                    } else {
                        robertoButton = null;
                    }
                    if (robertoButton != null) {
                        robertoButton.setSelected(false);
                    }
                }
                RobertoEditText robertoEditText = (RobertoEditText) view2.findViewById(R.id.optionEditText);
                if (robertoEditText != null) {
                    robertoEditText.setVisibility(0);
                    UiUtils.Companion companion = UiUtils.Companion;
                    Context requireContext = this$0.requireContext();
                    kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                    companion.showKeyboardFrom(requireContext, robertoEditText);
                }
                RobertoButton robertoButton2 = (RobertoButton) view2.findViewById(R.id.optionButton);
                if (robertoButton2 != null) {
                    robertoButton2.setSelected(true);
                }
                ScrollView scrollView = (ScrollView) this$0._$_findCachedViewById(R.id.proactiveScrollView);
                if (scrollView != null) {
                    scrollView.post(new tl.o(12, this$0));
                }
                this$0.f18039w = true;
                Editable text = ((RobertoEditText) view2.findViewById(R.id.optionEditText)).getText();
                this$0.J(!((text == null || gv.n.B0(text)) ? true : true));
                return;
            case 1:
                Editable editable = null;
                s this$02 = (s) obj6;
                View view3 = (View) obj5;
                int i13 = s.f18048y;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                if (this$02.f18051w) {
                    RobertoEditText robertoEditText2 = (RobertoEditText) view3.findViewById(R.id.optionEditText);
                    if (robertoEditText2 != null) {
                        robertoEditText2.setVisibility(8);
                    }
                    RobertoButton robertoButton3 = (RobertoButton) view3.findViewById(R.id.optionButton);
                    if (robertoButton3 != null) {
                        robertoButton3.setSelected(false);
                    }
                    this$02.J(!this$02.f18050v.isEmpty());
                } else {
                    RobertoEditText robertoEditText3 = (RobertoEditText) view3.findViewById(R.id.optionEditText);
                    if (robertoEditText3 != null) {
                        robertoEditText3.setVisibility(0);
                    }
                    RobertoButton robertoButton4 = (RobertoButton) view3.findViewById(R.id.optionButton);
                    if (robertoButton4 != null) {
                        robertoButton4.setSelected(true);
                    }
                    ScrollView scrollView2 = (ScrollView) this$02._$_findCachedViewById(R.id.supportKindScrollView);
                    if (scrollView2 != null) {
                        scrollView2.post(new tl.o(13, this$02));
                    }
                    RobertoEditText robertoEditText4 = (RobertoEditText) view3.findViewById(R.id.optionEditText);
                    if (robertoEditText4 != null) {
                        editable = robertoEditText4.getText();
                    }
                    this$02.J(!((editable == null || gv.n.B0(editable)) ? true : true));
                }
                this$02.f18051w = !this$02.f18051w;
                return;
            case 2:
                kotlin.jvm.internal.u otpValid = (kotlin.jvm.internal.u) obj6;
                ExperimentEditProfileActivity this$03 = (ExperimentEditProfileActivity) obj5;
                int i14 = ExperimentEditProfileActivity.P;
                kotlin.jvm.internal.i.g(otpValid, "$otpValid");
                kotlin.jvm.internal.i.g(this$03, "this$0");
                if (otpValid.f23466u) {
                    ((RobertoTextView) this$03.r0().findViewById(R.id.tvOTPDialogError)).setVisibility(8);
                    StringBuilder sb2 = new StringBuilder();
                    RobertoEditText robertoEditText5 = (RobertoEditText) this$03.r0().findViewById(R.id.etOTPDialog1);
                    if (robertoEditText5 != null) {
                        obj = robertoEditText5.getText();
                    } else {
                        obj = null;
                    }
                    sb2.append(obj);
                    RobertoEditText robertoEditText6 = (RobertoEditText) this$03.r0().findViewById(R.id.etOTPDialog2);
                    if (robertoEditText6 != null) {
                        obj2 = robertoEditText6.getText();
                    } else {
                        obj2 = null;
                    }
                    sb2.append(obj2);
                    RobertoEditText robertoEditText7 = (RobertoEditText) this$03.r0().findViewById(R.id.etOTPDialog3);
                    if (robertoEditText7 != null) {
                        obj3 = robertoEditText7.getText();
                    } else {
                        obj3 = null;
                    }
                    sb2.append(obj3);
                    RobertoEditText robertoEditText8 = (RobertoEditText) this$03.r0().findViewById(R.id.etOTPDialog4);
                    if (robertoEditText8 != null) {
                        obj4 = robertoEditText8.getText();
                    } else {
                        obj4 = null;
                    }
                    sb2.append(obj4);
                    String enteredOTP = sb2.toString();
                    wo.v vVar = this$03.f11567w;
                    if (vVar != null) {
                        kotlin.jvm.internal.i.g(enteredOTP, "enteredOTP");
                        ta.v.H(kc.f.H(vVar), null, 0, new wo.x(vVar, enteredOTP, null), 3);
                        return;
                    }
                    kotlin.jvm.internal.i.q("editProfileViewModel");
                    throw null;
                }
                return;
            case 3:
                Dialog this_apply = (Dialog) obj6;
                ExperimentProfileActivity this$04 = (ExperimentProfileActivity) obj5;
                int i15 = ExperimentProfileActivity.S;
                kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                kotlin.jvm.internal.i.g(this$04, "this$0");
                try {
                    this_apply.dismiss();
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$04.f11575w, e10);
                    return;
                }
            case 4:
                ExperimentProfileActivity this$05 = (ExperimentProfileActivity) obj6;
                kotlin.jvm.internal.x subscriptionModel = (kotlin.jvm.internal.x) obj5;
                int i16 = ExperimentProfileActivity.S;
                kotlin.jvm.internal.i.g(this$05, "this$0");
                kotlin.jvm.internal.i.g(subscriptionModel, "$subscriptionModel");
                this$05.startActivity(tr.r.s(this$05, false).putExtra("source", Constants.SCREEN_PROFILE));
                Bundle bundle = new Bundle();
                defpackage.d.m(bundle, "course");
                bundle.putBoolean("subscription_active", SubscriptionPersistence.INSTANCE.getSubscriptionEnabled());
                bundle.putInt("bookmarked_activity_count", this$05.G);
                if (subscriptionModel.f23469u != 0) {
                    z18 = true;
                }
                bundle.putBoolean("subscription_expired", z18);
                gk.a.b(bundle, "bookmark_profile_null_state_click");
                return;
            case 5:
                ss.l activityClick = (ss.l) obj6;
                CourseDayDomainModelV1 model = (CourseDayDomainModelV1) obj5;
                kotlin.jvm.internal.i.g(activityClick, "$activityClick");
                kotlin.jvm.internal.i.g(model, "$model");
                activityClick.invoke(model);
                return;
            case 6:
                yo.a this$06 = (yo.a) obj6;
                RecommendedActivityModel model2 = (RecommendedActivityModel) obj5;
                kotlin.jvm.internal.i.g(this$06, "this$0");
                kotlin.jvm.internal.i.g(model2, "$model");
                this$06.f38703z.invoke(model2);
                return;
            case 7:
                Dialog dialog = (Dialog) obj6;
                ResetProgrammeActivity this$07 = (ResetProgrammeActivity) obj5;
                int i17 = ResetProgrammeActivity.f11615y;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(this$07, "this$0");
                dialog.dismiss();
                Intent intent2 = new Intent(this$07, ResetProgrammeLoadingActivity.class);
                intent2.addFlags(268468224);
                intent2.putStringArrayListExtra("courses", this$07.f11617w);
                this$07.startActivity(intent2);
                this$07.finish();
                return;
            case 8:
                ResourceData model3 = (ResourceData) obj6;
                dp.a this$08 = (dp.a) obj5;
                kotlin.jvm.internal.i.g(model3, "$model");
                kotlin.jvm.internal.i.g(this$08, "this$0");
                Iterator<PostsRead> it = FirebasePersistence.getInstance().getUser().getPostsRead().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (kotlin.jvm.internal.i.b(it.next().getPostId(), model3.getId())) {
                            z17 = true;
                        }
                    }
                }
                this$08.f13188x.invoke(model3, Boolean.valueOf(z17));
                return;
            case 9:
                ResourceData model4 = (ResourceData) obj6;
                dp.b this$09 = (dp.b) obj5;
                kotlin.jvm.internal.i.g(model4, "$model");
                kotlin.jvm.internal.i.g(this$09, "this$0");
                try {
                    Iterator<PostsRead> it2 = FirebasePersistence.getInstance().getUser().getPostsRead().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (kotlin.jvm.internal.i.b(it2.next().getPostId(), model4.getId())) {
                                z16 = true;
                            }
                        }
                    }
                    this$09.f13191x.invoke(model4, Boolean.valueOf(z16));
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$09.f13192y, e11);
                    return;
                }
            case 10:
                vp.a this$010 = (vp.a) obj6;
                GratitudeLetterModel logData = (GratitudeLetterModel) obj5;
                kotlin.jvm.internal.i.g(this$010, "this$0");
                kotlin.jvm.internal.i.g(logData, "$logData");
                Context context = this$010.f35296y;
                Dialog dialog2 = new Dialog(context, 16973834);
                dialog2.setContentView(R.layout.dialog_image_fullscreen);
                com.bumptech.glide.f g5 = Glide.g(context);
                z4.f fVar = this$010.B;
                synchronized (g5) {
                    g5.s(fVar);
                }
                com.bumptech.glide.e<Bitmap> a10 = g5.a();
                a10.Z = "https://" + logData.getDownloadUrl();
                a10.f5953b0 = true;
                a10.z(new a.c(dialog2));
                View findViewById = dialog2.findViewById(R.id.ivClose);
                kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
                ((ImageView) findViewById).setOnClickListener(new lm.f(dialog2, 26));
                Window window = dialog2.getWindow();
                if (window != null) {
                    window.setLayout(-1, -1);
                }
                dialog2.show();
                return;
            case 11:
                cq.b bVar = (cq.b) obj6;
                int i18 = cq.b.f11891x;
                bVar.getClass();
                String goalId = ((GoalType) obj5).getGoalId();
                try {
                    ((ActivitiesActivity) bVar.requireActivity()).C = true;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("activity_id", goalId);
                    bundle2.putBoolean("proceed_on_schedule", true);
                    com.theinnerhour.b2b.fragment.coping.a aVar = new com.theinnerhour.b2b.fragment.coping.a();
                    aVar.setArguments(bundle2);
                    ((ActivitiesActivity) bVar.requireActivity()).r0(aVar);
                    return;
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e(e12);
                    return;
                }
            case 12:
                fq.k this$011 = (fq.k) obj6;
                T1Activity act = (T1Activity) obj5;
                int i19 = fq.k.f15738z;
                kotlin.jvm.internal.i.g(this$011, "this$0");
                kotlin.jvm.internal.i.g(act, "$act");
                int i20 = this$011.f15740v + 1;
                this$011.f15740v = i20;
                if (i20 < this$011.f15741w.size()) {
                    this$011.J();
                    return;
                } else {
                    act.t0();
                    return;
                }
            case 13:
                fq.b0 this$012 = (fq.b0) obj6;
                T1Activity act2 = (T1Activity) obj5;
                int i21 = fq.b0.f15662z;
                kotlin.jvm.internal.i.g(this$012, "this$0");
                kotlin.jvm.internal.i.g(act2, "$act");
                try {
                    int size = this$012.f15665w.size();
                    HashMap<String, Object> hashMap = act2.B;
                    if (size == 0) {
                        Utils utils = Utils.INSTANCE;
                        androidx.fragment.app.p activity = this$012.getActivity();
                        kotlin.jvm.internal.i.d(activity);
                        utils.showCustomToast(activity, "Select an item to proceed");
                    } else if (this$012.f15665w.size() > 3) {
                        Utils utils2 = Utils.INSTANCE;
                        androidx.fragment.app.p activity2 = this$012.getActivity();
                        kotlin.jvm.internal.i.d(activity2);
                        utils2.showCustomToast(activity2, "You can't select more items!");
                    } else {
                        hashMap.put("list", new ArrayList(this$012.f15665w));
                        hashMap.put("userAdded", new ArrayList(this$012.f15664v));
                        act2.t0();
                    }
                    hashMap.put("s12_user_list", this$012.f15665w);
                    return;
                } catch (Exception e13) {
                    LogHelper.INSTANCE.e(this$012.f15663u, "exception", e13);
                    return;
                }
            case 14:
                fq.b0 this$013 = (fq.b0) obj6;
                String text2 = (String) obj5;
                int i22 = fq.b0.f15662z;
                kotlin.jvm.internal.i.g(this$013, "this$0");
                kotlin.jvm.internal.i.g(text2, "$text");
                if (this$013.f15665w.contains(text2)) {
                    View childAt2 = ((LinearLayout) this$013._$_findCachedViewById(R.id.llS12List)).getChildAt(this$013.f15666x.indexOf(text2));
                    androidx.fragment.app.p activity3 = this$013.getActivity();
                    kotlin.jvm.internal.i.d(activity3);
                    Object obj7 = g0.a.f16164a;
                    ((RobertoTextView) defpackage.e.g(activity3, R.drawable.ic_check_box_outline_blank_gray_24dp, (ImageView) childAt2.findViewById(R.id.chkBxSelected), childAt2, R.id.tvLabel)).setFont("Lato-Medium.ttf");
                    androidx.fragment.app.p activity4 = this$013.getActivity();
                    kotlin.jvm.internal.i.d(activity4);
                    ((RobertoTextView) childAt2.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity4, R.color.colorTextGrey));
                    this$013.f15665w.remove(text2);
                    return;
                } else if (!this$013.O(true)) {
                    this$013.f15665w.add(text2);
                    View childAt3 = ((LinearLayout) this$013._$_findCachedViewById(R.id.llS12List)).getChildAt(this$013.f15666x.indexOf(text2));
                    androidx.fragment.app.p activity5 = this$013.getActivity();
                    kotlin.jvm.internal.i.d(activity5);
                    Object obj8 = g0.a.f16164a;
                    ((RobertoTextView) defpackage.e.g(activity5, R.drawable.ic_check_box_orange_24dp, (ImageView) childAt3.findViewById(R.id.chkBxSelected), childAt3, R.id.tvLabel)).setFont("Lato-Bold.ttf");
                    androidx.fragment.app.p activity6 = this$013.getActivity();
                    kotlin.jvm.internal.i.d(activity6);
                    ((RobertoTextView) childAt3.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity6, R.color.page_title));
                    return;
                } else {
                    return;
                }
            case 15:
                fq.c0 this$014 = (fq.c0) obj6;
                T4CActivity act3 = (T4CActivity) obj5;
                int i23 = fq.c0.f15674v;
                kotlin.jvm.internal.i.g(this$014, "this$0");
                kotlin.jvm.internal.i.g(act3, "$act");
                Editable text3 = ((EditText) this$014._$_findCachedViewById(R.id.editText)).getText();
                if (text3 != null && text3.length() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    Utils utils3 = Utils.INSTANCE;
                    androidx.fragment.app.p activity7 = this$014.getActivity();
                    kotlin.jvm.internal.i.d(activity7);
                    utils3.showCustomToast(activity7, "Please enter text to proceed");
                    return;
                }
                HashMap<String, Object> hashMap2 = act3.C;
                hashMap2.put("list", ca.a.k(((EditText) this$014._$_findCachedViewById(R.id.editText)).getText().toString()));
                hashMap2.put("s18_user_data", ((EditText) this$014._$_findCachedViewById(R.id.editText)).getText().toString());
                act3.s0(new fq.p());
                return;
            case 16:
                Dialog dialog3 = (Dialog) obj6;
                v0 this$015 = (v0) obj5;
                int i24 = v0.D;
                kotlin.jvm.internal.i.g(dialog3, "$dialog");
                kotlin.jvm.internal.i.g(this$015, "this$0");
                Editable text4 = ((RobertoEditText) dialog3.findViewById(R.id.dialog_edit_mins)).getText();
                if (text4 != null && text4.length() != 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    ((RobertoEditText) dialog3.findViewById(R.id.dialog_edit_mins)).setError("Please set focus duration to at least 1 minute");
                    return;
                } else if (Integer.parseInt(String.valueOf(((RobertoEditText) dialog3.findViewById(R.id.dialog_edit_mins)).getText())) < 1) {
                    Utils.INSTANCE.showCustomToast(this$015.getActivity(), "Please set focus duration to at least 1 minute");
                    return;
                } else {
                    Editable text5 = ((RobertoEditText) dialog3.findViewById(R.id.dialog_edit_secs)).getText();
                    if (text5 != null && text5.length() != 0) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (!z12 && Integer.parseInt(String.valueOf(((RobertoEditText) dialog3.findViewById(R.id.dialog_edit_secs)).getText())) > 60) {
                        ((RobertoEditText) dialog3.findViewById(R.id.dialog_edit_secs)).setText("60");
                    }
                    long parseInt2 = Integer.parseInt(String.valueOf(((RobertoEditText) dialog3.findViewById(R.id.dialog_edit_mins)).getText())) * 60 * 1000;
                    Editable text6 = ((RobertoEditText) dialog3.findViewById(R.id.dialog_edit_secs)).getText();
                    if (((text6 == null || text6.length() == 0) ? (char) 1 : (char) 1) != 0) {
                        parseInt = 0;
                    } else {
                        parseInt = Integer.parseInt(String.valueOf(((RobertoEditText) dialog3.findViewById(R.id.dialog_edit_secs)).getText())) * 1000;
                    }
                    long j10 = parseInt2 + parseInt;
                    this$015.f15815y = j10;
                    this$015.f15816z = j10;
                    dialog3.dismiss();
                    this$015.f15814x = true;
                    this$015.J();
                    return;
                }
            case 17:
                a1 this$016 = (a1) obj6;
                T1Activity act4 = (T1Activity) obj5;
                int i25 = a1.f15652z;
                kotlin.jvm.internal.i.g(this$016, "this$0");
                kotlin.jvm.internal.i.g(act4, "$act");
                try {
                    if (this$016.f15654v != null) {
                        HashMap<String, Object> hashMap3 = act4.B;
                        if (hashMap3.containsKey(Constants.DAYMODEL_POSITION)) {
                            Object obj9 = hashMap3.get(Constants.DAYMODEL_POSITION);
                            kotlin.jvm.internal.i.e(obj9, "null cannot be cast to non-null type kotlin.Int");
                            i10 = ((Integer) obj9).intValue();
                        }
                        Object obj10 = hashMap3.get("list");
                        kotlin.jvm.internal.i.e(obj10, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                        ArrayList arrayList = (ArrayList) obj10;
                        String str = this$016.f15654v;
                        kotlin.jvm.internal.i.d(str);
                        arrayList.add(i10, str);
                        hashMap3.put("userAdded" + i10, new ArrayList(this$016.f15655w));
                        Object obj11 = this$016.f15654v;
                        kotlin.jvm.internal.i.d(obj11);
                        hashMap3.put("s5_user_data" + i10, obj11);
                        hashMap3.put("list", arrayList);
                        hashMap3.put(Constants.DAYMODEL_POSITION, Integer.valueOf(i10 + 1));
                        act4.t0();
                        return;
                    }
                    Utils utils4 = Utils.INSTANCE;
                    androidx.fragment.app.p activity8 = this$016.getActivity();
                    kotlin.jvm.internal.i.d(activity8);
                    String string2 = this$016.getString(R.string.select_1_option);
                    kotlin.jvm.internal.i.f(string2, "getString(R.string.select_1_option)");
                    utils4.showCustomToast(activity8, string2);
                    return;
                } catch (Exception e14) {
                    e14.printStackTrace();
                    return;
                }
            case 18:
                com.theinnerhour.b2b.fragment.coping.a this$017 = (com.theinnerhour.b2b.fragment.coping.a) obj6;
                kotlin.jvm.internal.x goal = (kotlin.jvm.internal.x) obj5;
                int i26 = com.theinnerhour.b2b.fragment.coping.a.f11685k0;
                kotlin.jvm.internal.i.g(this$017, "this$0");
                kotlin.jvm.internal.i.g(goal, "$goal");
                if (this$017.C) {
                    androidx.fragment.app.p activity9 = this$017.getActivity();
                    if (activity9 != null && (intent = activity9.getIntent()) != null && intent.hasExtra("source")) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        androidx.fragment.app.p activity10 = this$017.getActivity();
                        kotlin.jvm.internal.i.e(activity10, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                        ((rr.a) activity10).n0();
                        return;
                    }
                    T t3 = goal.f23469u;
                    if (t3 != 0 && ((Goal) t3).isVisible()) {
                        if (this$017.T && this$017.U) {
                            com.google.android.exoplayer2.a0 a0Var = this$017.X;
                            if (a0Var != null && a0Var.isPlaying()) {
                                com.google.android.exoplayer2.a0 a0Var2 = this$017.X;
                                if (a0Var2 != null) {
                                    a0Var2.z(false);
                                    this$017.g0(true);
                                    this$017.u0(false);
                                } else {
                                    kotlin.jvm.internal.i.q("simpleExoplayer");
                                    throw null;
                                }
                            }
                            this$017.q0();
                            return;
                        }
                        androidx.fragment.app.p activity11 = this$017.getActivity();
                        kotlin.jvm.internal.i.e(activity11, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                        ((rr.a) activity11).t0();
                        return;
                    }
                    if (goal.f23469u == 0) {
                        FirebasePersistence.getInstance().addNewGoal(this$017.f11695v, this$017.X(), false, false);
                        goal.f23469u = FirebasePersistence.getInstance().getGoalById(this$017.f11695v, this$017.X());
                    }
                    yn.a aVar2 = this$017.f11688d0;
                    aVar2.getClass();
                    if (yn.a.b()) {
                        this$017.r0(null, (Goal) goal.f23469u);
                    } else {
                        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                        ?? notificationPermissionBottomSheet = new NotificationPermissionBottomSheet("ra_audio", aVar2.a(true), "goals", this$017.f11688d0, new a.f(goal, xVar));
                        xVar.f23469u = notificationPermissionBottomSheet;
                        notificationPermissionBottomSheet.show(this$017.requireActivity().getSupportFragmentManager(), "permission");
                    }
                    Bundle bundle3 = new Bundle();
                    defpackage.d.m(bundle3, "course");
                    bundle3.putString(Constants.GOAL_ID, this$017.f11695v);
                    GoalType goalType = this$017.f11699z;
                    if (goalType != null) {
                        bundle3.putString(Constants.GOAL_NAME, goalType.getGoalName());
                        bundle3.putString(Constants.GOAL_TYPE, goalType.getType());
                    }
                    GoalNotificationContent goalNotificationContent = this$017.K;
                    if (goalNotificationContent != null) {
                        bundle3.putString("experiment_type", Constants.SCREEN_ACTIVITY);
                        bundle3.putString("experiment", goalNotificationContent.getExperiment());
                        bundle3.putString("experiment_key", goalNotificationContent.getKey());
                    }
                    bundle3.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                    Bundle arguments = this$017.getArguments();
                    if (arguments != null && (string = arguments.getString("exp_source")) != null) {
                        bundle3.putString("source", string);
                    }
                    gk.a.b(bundle3, "activity_remind_click");
                    return;
                } else if (this$017.T && this$017.U) {
                    com.google.android.exoplayer2.a0 a0Var3 = this$017.X;
                    if (a0Var3 != null && a0Var3.isPlaying()) {
                        com.google.android.exoplayer2.a0 a0Var4 = this$017.X;
                        if (a0Var4 != null) {
                            a0Var4.z(false);
                            this$017.g0(true);
                            this$017.u0(false);
                        } else {
                            kotlin.jvm.internal.i.q("simpleExoplayer");
                            throw null;
                        }
                    }
                    this$017.q0();
                    return;
                } else {
                    androidx.fragment.app.p activity12 = this$017.getActivity();
                    kotlin.jvm.internal.i.e(activity12, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                    ((rr.a) activity12).t0();
                    return;
                }
            case 19:
                oq.m this$018 = (oq.m) obj6;
                Chip ch2 = (Chip) obj5;
                int i27 = oq.m.B;
                kotlin.jvm.internal.i.g(this$018, "this$0");
                kotlin.jvm.internal.i.g(ch2, "$ch");
                this$018.f27750z.remove(gv.r.i1(ch2.getText().toString()).toString());
                ((ChipGroup) this$018._$_findCachedViewById(R.id.chipGroupAdd)).removeView(ch2);
                this$018.f27746v.remove(ch2);
                if (ch2.isChecked()) {
                    ch2.setChecked(false);
                }
                ArrayList<String> arrayList2 = this$018.f27748x;
                if (this$018.K(gv.r.i1(ch2.getText().toString()).toString(), arrayList2) != -1) {
                    this$018.f27749y.add(arrayList2.remove(this$018.K(gv.r.i1(ch2.getText().toString()).toString(), arrayList2)));
                    return;
                }
                return;
            case 20:
                Dialog dialog4 = (Dialog) obj6;
                oq.m this$019 = (oq.m) obj5;
                int i28 = oq.m.B;
                kotlin.jvm.internal.i.g(dialog4, "$dialog");
                kotlin.jvm.internal.i.g(this$019, "this$0");
                Editable text7 = ((RobertoEditText) dialog4.findViewById(R.id.editTextOption)).getText();
                if (text7 != null && !gv.n.B0(text7)) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                if (!z14) {
                    if (this$019.K(gv.r.i1(String.valueOf(((RobertoEditText) dialog4.findViewById(R.id.editTextOption)).getText())).toString(), this$019.f27750z) != -1) {
                        Context context2 = this$019.getContext();
                        kotlin.jvm.internal.i.d(context2);
                        Toast.makeText(context2, "This Chip is Already added", 1).show();
                        return;
                    }
                    ArrayList<String> arrayList3 = this$019.f27749y;
                    if (this$019.K(gv.r.i1(String.valueOf(((RobertoEditText) dialog4.findViewById(R.id.editTextOption)).getText())).toString(), arrayList3) != -1) {
                        this$019.f27748x.add(arrayList3.remove(this$019.K(gv.r.i1(String.valueOf(((RobertoEditText) dialog4.findViewById(R.id.editTextOption)).getText())).toString(), arrayList3)));
                    }
                    this$019.O(String.valueOf(((RobertoEditText) dialog4.findViewById(R.id.editTextOption)).getText()), true, false);
                    dialog4.dismiss();
                    return;
                }
                Context context3 = this$019.getContext();
                kotlin.jvm.internal.i.d(context3);
                Toast.makeText(context3, "Type Something", 1).show();
                return;
            case 21:
                Dialog dialog5 = (Dialog) obj6;
                pq.b this$020 = (pq.b) obj5;
                int i29 = pq.b.C;
                kotlin.jvm.internal.i.g(dialog5, "$dialog");
                kotlin.jvm.internal.i.g(this$020, "this$0");
                String obj12 = gv.r.i1(String.valueOf(((RobertoEditText) dialog5.findViewById(R.id.editTextOption)).getText())).toString();
                if (gv.n.B0(obj12)) {
                    Context context4 = this$020.getContext();
                    kotlin.jvm.internal.i.d(context4);
                    Toast.makeText(context4, "Please type something.", 0).show();
                    return;
                }
                ArrayList<String> arrayList4 = this$020.f28765w;
                ArrayList arrayList5 = new ArrayList();
                Iterator<String> it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    String next = it3.next();
                    String lowerCase = next.toLowerCase();
                    kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
                    String lowerCase2 = obj12.toLowerCase();
                    kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase()");
                    if (kotlin.jvm.internal.i.b(lowerCase, lowerCase2)) {
                        arrayList5.add(next);
                    }
                }
                if (!(!arrayList5.isEmpty())) {
                    ArrayList<String> arrayList6 = this$020.f28766x;
                    ArrayList arrayList7 = new ArrayList();
                    Iterator<String> it4 = arrayList6.iterator();
                    while (it4.hasNext()) {
                        String next2 = it4.next();
                        String lowerCase3 = next2.toLowerCase();
                        kotlin.jvm.internal.i.f(lowerCase3, "this as java.lang.String).toLowerCase()");
                        String lowerCase4 = obj12.toLowerCase();
                        kotlin.jvm.internal.i.f(lowerCase4, "this as java.lang.String).toLowerCase()");
                        if (kotlin.jvm.internal.i.b(lowerCase3, lowerCase4)) {
                            arrayList7.add(next2);
                        }
                    }
                    if (!(!arrayList7.isEmpty())) {
                        this$020.K(gv.r.i1(String.valueOf(((RobertoEditText) dialog5.findViewById(R.id.editTextOption)).getText())).toString(), true);
                        dialog5.dismiss();
                        return;
                    }
                }
                Context context5 = this$020.getContext();
                kotlin.jvm.internal.i.d(context5);
                Toast.makeText(context5, "Item already exists.", 0).show();
                dialog5.dismiss();
                return;
            case 22:
                Dialog dialog6 = (Dialog) obj6;
                pq.m this$021 = (pq.m) obj5;
                int i30 = pq.m.C;
                kotlin.jvm.internal.i.g(dialog6, "$dialog");
                kotlin.jvm.internal.i.g(this$021, "this$0");
                if (!gv.n.B0(String.valueOf(((RobertoEditText) dialog6.findViewById(R.id.editTextOption)).getText()))) {
                    this$021.K(gv.r.i1(String.valueOf(((RobertoEditText) dialog6.findViewById(R.id.editTextOption)).getText())).toString());
                    dialog6.dismiss();
                    return;
                }
                return;
            case 23:
                a();
                return;
            case 24:
                Dialog dialog7 = (Dialog) obj6;
                pq.x this$022 = (pq.x) obj5;
                int i31 = pq.x.A;
                kotlin.jvm.internal.i.g(dialog7, "$dialog");
                kotlin.jvm.internal.i.g(this$022, "this$0");
                if (!gv.n.B0(String.valueOf(((RobertoEditText) dialog7.findViewById(R.id.editTextOption)).getText()))) {
                    this$022.J(gv.r.i1(String.valueOf(((RobertoEditText) dialog7.findViewById(R.id.editTextOption)).getText())).toString());
                    dialog7.dismiss();
                    return;
                }
                return;
            case 25:
                b();
                return;
            case 26:
                c();
                return;
            case 27:
                d();
                return;
            case 28:
                e();
                return;
            default:
                f();
                return;
        }
    }
}
