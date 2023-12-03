package hr;

import android.content.Context;
import android.graphics.ColorFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.ScreenResult21Model;
import com.theinnerhour.b2b.model.UrgentImportantModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenResult21Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/p1;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class p1 extends rr.b {
    public static final /* synthetic */ int C = 0;
    public int A;
    public final LinkedHashMap B = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18942u = LogHelper.INSTANCE.makeLogTag(p1.class);

    /* renamed from: v  reason: collision with root package name */
    public ScreenResult21Model f18943v = new ScreenResult21Model(0, new ArrayList(0));

    /* renamed from: w  reason: collision with root package name */
    public String f18944w = "";

    /* renamed from: x  reason: collision with root package name */
    public String f18945x = "";

    /* renamed from: y  reason: collision with root package name */
    public String f18946y = "";

    /* renamed from: z  reason: collision with root package name */
    public String f18947z = "";

    public final void J(int i6) {
        if (this.A == 1) {
            ((ConstraintLayout) _$_findCachedViewById(R.id.ll1)).setTag("-");
            ((RobertoTextView) _$_findCachedViewById(R.id.tvDetails1)).setVisibility(8);
            ConstraintLayout ll1 = (ConstraintLayout) _$_findCachedViewById(R.id.ll1);
            kotlin.jvm.internal.i.f(ll1, "ll1");
            RobertoTextView tvSec1Label = (RobertoTextView) _$_findCachedViewById(R.id.tvSec1Label);
            kotlin.jvm.internal.i.f(tvSec1Label, "tvSec1Label");
            AppCompatImageView img1 = (AppCompatImageView) _$_findCachedViewById(R.id.img1);
            kotlin.jvm.internal.i.f(img1, "img1");
            M(ll1, tvSec1Label, img1);
        }
        if (this.A == 2) {
            ((ConstraintLayout) _$_findCachedViewById(R.id.ll2)).setTag("-");
            ((RobertoTextView) _$_findCachedViewById(R.id.tvDetails2)).setVisibility(8);
            ConstraintLayout ll2 = (ConstraintLayout) _$_findCachedViewById(R.id.ll2);
            kotlin.jvm.internal.i.f(ll2, "ll2");
            RobertoTextView tvSec2Label = (RobertoTextView) _$_findCachedViewById(R.id.tvSec2Label);
            kotlin.jvm.internal.i.f(tvSec2Label, "tvSec2Label");
            AppCompatImageView img2 = (AppCompatImageView) _$_findCachedViewById(R.id.img2);
            kotlin.jvm.internal.i.f(img2, "img2");
            M(ll2, tvSec2Label, img2);
        }
        if (this.A == 3) {
            ((ConstraintLayout) _$_findCachedViewById(R.id.ll3)).setTag("-");
            ((RobertoTextView) _$_findCachedViewById(R.id.tvDetails3)).setVisibility(8);
            ConstraintLayout ll3 = (ConstraintLayout) _$_findCachedViewById(R.id.ll3);
            kotlin.jvm.internal.i.f(ll3, "ll3");
            RobertoTextView tvSec3Label = (RobertoTextView) _$_findCachedViewById(R.id.tvSec3Label);
            kotlin.jvm.internal.i.f(tvSec3Label, "tvSec3Label");
            AppCompatImageView img3 = (AppCompatImageView) _$_findCachedViewById(R.id.img3);
            kotlin.jvm.internal.i.f(img3, "img3");
            M(ll3, tvSec3Label, img3);
        }
        if (this.A == 4) {
            ((ConstraintLayout) _$_findCachedViewById(R.id.ll4)).setTag("-");
            ((RobertoTextView) _$_findCachedViewById(R.id.tvDetails4)).setVisibility(8);
            ConstraintLayout ll4 = (ConstraintLayout) _$_findCachedViewById(R.id.ll4);
            kotlin.jvm.internal.i.f(ll4, "ll4");
            RobertoTextView tvSec4Label = (RobertoTextView) _$_findCachedViewById(R.id.tvSec4Label);
            kotlin.jvm.internal.i.f(tvSec4Label, "tvSec4Label");
            AppCompatImageView img4 = (AppCompatImageView) _$_findCachedViewById(R.id.img4);
            kotlin.jvm.internal.i.f(img4, "img4");
            M(ll4, tvSec4Label, img4);
        }
        this.A = i6;
    }

    public final void K(ConstraintLayout constraintLayout, RobertoTextView robertoTextView, AppCompatImageView appCompatImageView) {
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.d(activity);
        constraintLayout.setBackgroundColor(g0.a.b(activity, R.color.selected_row));
        androidx.fragment.app.p activity2 = getActivity();
        kotlin.jvm.internal.i.d(activity2);
        robertoTextView.setTextColor(g0.a.b(activity2, R.color.selected_row_text));
        appCompatImageView.setImageResource(R.drawable.ic_keyboard_arrow_up);
        appCompatImageView.setColorFilter(-1);
    }

    public final void M(ConstraintLayout constraintLayout, RobertoTextView robertoTextView, AppCompatImageView appCompatImageView) {
        constraintLayout.setBackgroundColor(0);
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.d(activity);
        robertoTextView.setTextColor(g0.a.b(activity, R.color.grey_high_contrast));
        appCompatImageView.setImageResource(R.drawable.ic_keyboard_arrow_down);
        appCompatImageView.setColorFilter((ColorFilter) null);
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
        return inflater.inflate(R.layout.fragment_screen_result_21, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.B.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            if (kotlin.jvm.internal.i.b(templateActivity.C0().get("log"), Boolean.TRUE)) {
                if (templateActivity.C0().containsKey("data")) {
                    Object obj2 = templateActivity.C0().get("data");
                    kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult21Model");
                    this.f18943v = (ScreenResult21Model) obj2;
                }
                ((RobertoTextView) _$_findCachedViewById(R.id.tvR21Header)).setText(this.f18943v.getTitle());
                ((RobertoTextView) _$_findCachedViewById(R.id.tvSec1Label)).setText(this.f18943v.getHeading1());
                String desc1 = this.f18943v.getDesc1();
                kotlin.jvm.internal.i.d(desc1);
                this.f18944w = desc1;
                ((RobertoTextView) _$_findCachedViewById(R.id.tvSec2Label)).setText(this.f18943v.getHeading2());
                String desc2 = this.f18943v.getDesc2();
                kotlin.jvm.internal.i.d(desc2);
                this.f18945x = desc2;
                ((RobertoTextView) _$_findCachedViewById(R.id.tvSec3Label)).setText(this.f18943v.getHeading3());
                String desc3 = this.f18943v.getDesc3();
                kotlin.jvm.internal.i.d(desc3);
                this.f18946y = desc3;
                ((RobertoTextView) _$_findCachedViewById(R.id.tvSec4Label)).setText(this.f18943v.getHeading4());
                String desc4 = this.f18943v.getDesc4();
                kotlin.jvm.internal.i.d(desc4);
                this.f18947z = desc4;
                obj = "result_21";
            } else {
                if (templateActivity.C0().containsKey("result_21")) {
                    Object obj3 = templateActivity.C0().get("result_21");
                    kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult21Model");
                    this.f18943v = (ScreenResult21Model) obj3;
                }
                ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(4);
                HashMap<String, Object> A0 = templateActivity.A0();
                templateActivity.B0();
                if (A0.containsKey("r21_heading")) {
                    obj = "result_21";
                    Object obj4 = A0.get("r21_heading");
                    kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type kotlin.String");
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvR21Header)).setText((String) obj4);
                    ScreenResult21Model screenResult21Model = this.f18943v;
                    Object obj5 = A0.get("r21_heading");
                    kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type kotlin.String");
                    screenResult21Model.setTitle((String) obj5);
                } else {
                    obj = "result_21";
                }
                if (A0.containsKey("first_section_label")) {
                    Object obj6 = A0.get("first_section_label");
                    kotlin.jvm.internal.i.e(obj6, "null cannot be cast to non-null type kotlin.String");
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvSec1Label)).setText((String) obj6);
                    ScreenResult21Model screenResult21Model2 = this.f18943v;
                    Object obj7 = A0.get("first_section_label");
                    kotlin.jvm.internal.i.e(obj7, "null cannot be cast to non-null type kotlin.String");
                    screenResult21Model2.setHeading1((String) obj7);
                }
                if (A0.containsKey("first_section_description")) {
                    Object obj8 = A0.get("first_section_description");
                    kotlin.jvm.internal.i.e(obj8, "null cannot be cast to non-null type kotlin.String");
                    this.f18944w = (String) obj8;
                    ScreenResult21Model screenResult21Model3 = this.f18943v;
                    Object obj9 = A0.get("first_section_description");
                    kotlin.jvm.internal.i.e(obj9, "null cannot be cast to non-null type kotlin.String");
                    screenResult21Model3.setDesc1((String) obj9);
                }
                if (A0.containsKey("second_section_label")) {
                    Object obj10 = A0.get("second_section_label");
                    kotlin.jvm.internal.i.e(obj10, "null cannot be cast to non-null type kotlin.String");
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvSec2Label)).setText((String) obj10);
                    ScreenResult21Model screenResult21Model4 = this.f18943v;
                    Object obj11 = A0.get("second_section_label");
                    kotlin.jvm.internal.i.e(obj11, "null cannot be cast to non-null type kotlin.String");
                    screenResult21Model4.setHeading2((String) obj11);
                }
                if (A0.containsKey("second_section_description")) {
                    Object obj12 = A0.get("second_section_description");
                    kotlin.jvm.internal.i.e(obj12, "null cannot be cast to non-null type kotlin.String");
                    this.f18945x = (String) obj12;
                    ScreenResult21Model screenResult21Model5 = this.f18943v;
                    Object obj13 = A0.get("second_section_description");
                    kotlin.jvm.internal.i.e(obj13, "null cannot be cast to non-null type kotlin.String");
                    screenResult21Model5.setDesc2((String) obj13);
                }
                if (A0.containsKey("third_section_label")) {
                    Object obj14 = A0.get("third_section_label");
                    kotlin.jvm.internal.i.e(obj14, "null cannot be cast to non-null type kotlin.String");
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvSec3Label)).setText((String) obj14);
                    ScreenResult21Model screenResult21Model6 = this.f18943v;
                    Object obj15 = A0.get("third_section_label");
                    kotlin.jvm.internal.i.e(obj15, "null cannot be cast to non-null type kotlin.String");
                    screenResult21Model6.setHeading3((String) obj15);
                }
                if (A0.containsKey("third_section_description")) {
                    Object obj16 = A0.get("third_section_description");
                    kotlin.jvm.internal.i.e(obj16, "null cannot be cast to non-null type kotlin.String");
                    this.f18946y = (String) obj16;
                    ScreenResult21Model screenResult21Model7 = this.f18943v;
                    Object obj17 = A0.get("third_section_description");
                    kotlin.jvm.internal.i.e(obj17, "null cannot be cast to non-null type kotlin.String");
                    screenResult21Model7.setDesc3((String) obj17);
                }
                if (A0.containsKey("fourth_section_label")) {
                    Object obj18 = A0.get("fourth_section_label");
                    kotlin.jvm.internal.i.e(obj18, "null cannot be cast to non-null type kotlin.String");
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvSec4Label)).setText((String) obj18);
                    ScreenResult21Model screenResult21Model8 = this.f18943v;
                    Object obj19 = A0.get("fourth_section_label");
                    kotlin.jvm.internal.i.e(obj19, "null cannot be cast to non-null type kotlin.String");
                    screenResult21Model8.setHeading4((String) obj19);
                }
                if (A0.containsKey("fourth_section_description")) {
                    Object obj20 = A0.get("fourth_section_description");
                    kotlin.jvm.internal.i.e(obj20, "null cannot be cast to non-null type kotlin.String");
                    this.f18947z = (String) obj20;
                    ScreenResult21Model screenResult21Model9 = this.f18943v;
                    Object obj21 = A0.get("fourth_section_description");
                    kotlin.jvm.internal.i.e(obj21, "null cannot be cast to non-null type kotlin.String");
                    screenResult21Model9.setDesc4((String) obj21);
                }
                if (A0.containsKey("r21_btn_one_text")) {
                    Object obj22 = A0.get("r21_btn_one_text");
                    kotlin.jvm.internal.i.e(obj22, "null cannot be cast to non-null type kotlin.String");
                    ((RobertoButton) _$_findCachedViewById(R.id.btnR21ButtonOne)).setText((String) obj22);
                }
                if (A0.containsKey("r21_btn_two_text")) {
                    Object obj23 = A0.get("r21_btn_two_text");
                    kotlin.jvm.internal.i.e(obj23, "null cannot be cast to non-null type kotlin.String");
                    ((RobertoButton) _$_findCachedViewById(R.id.btnR21ButtonTwo)).setText((String) obj23);
                }
            }
            this.f18944w += "\n\n";
            this.f18946y += "\n\n";
            this.f18945x += "\n\n";
            this.f18947z += "\n\n";
            Iterator<UrgentImportantModel> it = this.f18943v.getItems().iterator();
            int i6 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (it.hasNext()) {
                UrgentImportantModel next = it.next();
                if (next.getImportant() && next.getUrgent()) {
                    i6++;
                    this.f18944w += i6 + ". " + next.getText() + '\n';
                } else if (next.getImportant() && !next.getUrgent()) {
                    i10++;
                    this.f18945x += i10 + ". " + next.getText() + '\n';
                } else if (!next.getImportant() && next.getUrgent()) {
                    i12++;
                    this.f18946y += i12 + ". " + next.getText() + '\n';
                } else {
                    i11++;
                    this.f18947z += i11 + ". " + next.getText() + '\n';
                }
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.tvDetails1)).setText(this.f18944w);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvDetails2)).setText(this.f18945x);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvDetails3)).setText(this.f18946y);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvDetails4)).setText(this.f18947z);
            ((ConstraintLayout) _$_findCachedViewById(R.id.ll1)).setTag("-");
            ((ConstraintLayout) _$_findCachedViewById(R.id.ll2)).setTag("-");
            ((ConstraintLayout) _$_findCachedViewById(R.id.ll3)).setTag("-");
            ((ConstraintLayout) _$_findCachedViewById(R.id.ll4)).setTag("-");
            ((ConstraintLayout) _$_findCachedViewById(R.id.ll1)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.o1

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ p1 f18908v;

                {
                    this.f18908v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i13 = r2;
                    p1 this$0 = this.f18908v;
                    switch (i13) {
                        case 0:
                            int i14 = p1.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (kotlin.jvm.internal.i.b(((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll1)).getTag(), "+")) {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll1)).setTag("-");
                                Utils utils = Utils.INSTANCE;
                                RobertoTextView tvDetails1 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails1);
                                kotlin.jvm.internal.i.f(tvDetails1, "tvDetails1");
                                Utils.collapse$default(utils, tvDetails1, 0L, 2, null);
                                ConstraintLayout ll1 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll1);
                                kotlin.jvm.internal.i.f(ll1, "ll1");
                                RobertoTextView tvSec1Label = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec1Label);
                                kotlin.jvm.internal.i.f(tvSec1Label, "tvSec1Label");
                                AppCompatImageView img1 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img1);
                                kotlin.jvm.internal.i.f(img1, "img1");
                                this$0.M(ll1, tvSec1Label, img1);
                            } else {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll1)).setTag("+");
                                Utils utils2 = Utils.INSTANCE;
                                RobertoTextView tvDetails12 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails1);
                                kotlin.jvm.internal.i.f(tvDetails12, "tvDetails1");
                                Utils.expand$default(utils2, tvDetails12, 0L, 2, null);
                                ConstraintLayout ll12 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll1);
                                kotlin.jvm.internal.i.f(ll12, "ll1");
                                RobertoTextView tvSec1Label2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec1Label);
                                kotlin.jvm.internal.i.f(tvSec1Label2, "tvSec1Label");
                                AppCompatImageView img12 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img1);
                                kotlin.jvm.internal.i.f(img12, "img1");
                                this$0.K(ll12, tvSec1Label2, img12);
                            }
                            if (this$0.A != 1) {
                                this$0.J(1);
                                return;
                            }
                            return;
                        case 1:
                            int i15 = p1.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (kotlin.jvm.internal.i.b(((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll2)).getTag(), "+")) {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll2)).setTag("-");
                                Utils utils3 = Utils.INSTANCE;
                                RobertoTextView tvDetails2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails2);
                                kotlin.jvm.internal.i.f(tvDetails2, "tvDetails2");
                                Utils.collapse$default(utils3, tvDetails2, 0L, 2, null);
                                ConstraintLayout ll2 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll2);
                                kotlin.jvm.internal.i.f(ll2, "ll2");
                                RobertoTextView tvSec2Label = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec2Label);
                                kotlin.jvm.internal.i.f(tvSec2Label, "tvSec2Label");
                                AppCompatImageView img2 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img2);
                                kotlin.jvm.internal.i.f(img2, "img2");
                                this$0.M(ll2, tvSec2Label, img2);
                            } else {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll2)).setTag("+");
                                Utils utils4 = Utils.INSTANCE;
                                RobertoTextView tvDetails22 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails2);
                                kotlin.jvm.internal.i.f(tvDetails22, "tvDetails2");
                                Utils.expand$default(utils4, tvDetails22, 0L, 2, null);
                                ConstraintLayout ll22 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll2);
                                kotlin.jvm.internal.i.f(ll22, "ll2");
                                RobertoTextView tvSec2Label2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec2Label);
                                kotlin.jvm.internal.i.f(tvSec2Label2, "tvSec2Label");
                                AppCompatImageView img22 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img2);
                                kotlin.jvm.internal.i.f(img22, "img2");
                                this$0.K(ll22, tvSec2Label2, img22);
                            }
                            if (this$0.A != 2) {
                                this$0.J(2);
                                return;
                            }
                            return;
                        case 2:
                            int i16 = p1.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (kotlin.jvm.internal.i.b(((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll3)).getTag(), "+")) {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll3)).setTag("-");
                                Utils utils5 = Utils.INSTANCE;
                                RobertoTextView tvDetails3 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails3);
                                kotlin.jvm.internal.i.f(tvDetails3, "tvDetails3");
                                Utils.collapse$default(utils5, tvDetails3, 0L, 2, null);
                                ConstraintLayout ll3 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll3);
                                kotlin.jvm.internal.i.f(ll3, "ll3");
                                RobertoTextView tvSec3Label = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec3Label);
                                kotlin.jvm.internal.i.f(tvSec3Label, "tvSec3Label");
                                AppCompatImageView img3 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img3);
                                kotlin.jvm.internal.i.f(img3, "img3");
                                this$0.M(ll3, tvSec3Label, img3);
                            } else {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll3)).setTag("+");
                                Utils utils6 = Utils.INSTANCE;
                                RobertoTextView tvDetails32 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails3);
                                kotlin.jvm.internal.i.f(tvDetails32, "tvDetails3");
                                Utils.expand$default(utils6, tvDetails32, 0L, 2, null);
                                ConstraintLayout ll32 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll3);
                                kotlin.jvm.internal.i.f(ll32, "ll3");
                                RobertoTextView tvSec3Label2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec3Label);
                                kotlin.jvm.internal.i.f(tvSec3Label2, "tvSec3Label");
                                AppCompatImageView img32 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img3);
                                kotlin.jvm.internal.i.f(img32, "img3");
                                this$0.K(ll32, tvSec3Label2, img32);
                            }
                            if (this$0.A != 3) {
                                this$0.J(3);
                                return;
                            }
                            return;
                        case 3:
                            int i17 = p1.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (kotlin.jvm.internal.i.b(((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll4)).getTag(), "+")) {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll4)).setTag("-");
                                Utils utils7 = Utils.INSTANCE;
                                RobertoTextView tvDetails4 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails4);
                                kotlin.jvm.internal.i.f(tvDetails4, "tvDetails4");
                                Utils.collapse$default(utils7, tvDetails4, 0L, 2, null);
                                ConstraintLayout ll4 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll4);
                                kotlin.jvm.internal.i.f(ll4, "ll4");
                                RobertoTextView tvSec4Label = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec4Label);
                                kotlin.jvm.internal.i.f(tvSec4Label, "tvSec4Label");
                                AppCompatImageView img4 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img4);
                                kotlin.jvm.internal.i.f(img4, "img4");
                                this$0.M(ll4, tvSec4Label, img4);
                            } else {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll4)).setTag("+");
                                Utils utils8 = Utils.INSTANCE;
                                RobertoTextView tvDetails42 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails4);
                                kotlin.jvm.internal.i.f(tvDetails42, "tvDetails4");
                                Utils.expand$default(utils8, tvDetails42, 0L, 2, null);
                                ConstraintLayout ll42 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll4);
                                kotlin.jvm.internal.i.f(ll42, "ll4");
                                RobertoTextView tvSec4Label2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec4Label);
                                kotlin.jvm.internal.i.f(tvSec4Label2, "tvSec4Label");
                                AppCompatImageView img42 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img4);
                                kotlin.jvm.internal.i.f(img42, "img4");
                                this$0.K(ll42, tvSec4Label2, img42);
                            }
                            if (this$0.A != 4) {
                                this$0.J(4);
                                return;
                            }
                            return;
                        default:
                            int i18 = p1.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new fq.s(this$0, 11);
                            a1Var.b();
                            return;
                    }
                }
            });
            ((ConstraintLayout) _$_findCachedViewById(R.id.ll2)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.o1

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ p1 f18908v;

                {
                    this.f18908v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i13 = r2;
                    p1 this$0 = this.f18908v;
                    switch (i13) {
                        case 0:
                            int i14 = p1.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (kotlin.jvm.internal.i.b(((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll1)).getTag(), "+")) {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll1)).setTag("-");
                                Utils utils = Utils.INSTANCE;
                                RobertoTextView tvDetails1 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails1);
                                kotlin.jvm.internal.i.f(tvDetails1, "tvDetails1");
                                Utils.collapse$default(utils, tvDetails1, 0L, 2, null);
                                ConstraintLayout ll1 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll1);
                                kotlin.jvm.internal.i.f(ll1, "ll1");
                                RobertoTextView tvSec1Label = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec1Label);
                                kotlin.jvm.internal.i.f(tvSec1Label, "tvSec1Label");
                                AppCompatImageView img1 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img1);
                                kotlin.jvm.internal.i.f(img1, "img1");
                                this$0.M(ll1, tvSec1Label, img1);
                            } else {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll1)).setTag("+");
                                Utils utils2 = Utils.INSTANCE;
                                RobertoTextView tvDetails12 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails1);
                                kotlin.jvm.internal.i.f(tvDetails12, "tvDetails1");
                                Utils.expand$default(utils2, tvDetails12, 0L, 2, null);
                                ConstraintLayout ll12 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll1);
                                kotlin.jvm.internal.i.f(ll12, "ll1");
                                RobertoTextView tvSec1Label2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec1Label);
                                kotlin.jvm.internal.i.f(tvSec1Label2, "tvSec1Label");
                                AppCompatImageView img12 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img1);
                                kotlin.jvm.internal.i.f(img12, "img1");
                                this$0.K(ll12, tvSec1Label2, img12);
                            }
                            if (this$0.A != 1) {
                                this$0.J(1);
                                return;
                            }
                            return;
                        case 1:
                            int i15 = p1.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (kotlin.jvm.internal.i.b(((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll2)).getTag(), "+")) {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll2)).setTag("-");
                                Utils utils3 = Utils.INSTANCE;
                                RobertoTextView tvDetails2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails2);
                                kotlin.jvm.internal.i.f(tvDetails2, "tvDetails2");
                                Utils.collapse$default(utils3, tvDetails2, 0L, 2, null);
                                ConstraintLayout ll2 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll2);
                                kotlin.jvm.internal.i.f(ll2, "ll2");
                                RobertoTextView tvSec2Label = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec2Label);
                                kotlin.jvm.internal.i.f(tvSec2Label, "tvSec2Label");
                                AppCompatImageView img2 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img2);
                                kotlin.jvm.internal.i.f(img2, "img2");
                                this$0.M(ll2, tvSec2Label, img2);
                            } else {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll2)).setTag("+");
                                Utils utils4 = Utils.INSTANCE;
                                RobertoTextView tvDetails22 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails2);
                                kotlin.jvm.internal.i.f(tvDetails22, "tvDetails2");
                                Utils.expand$default(utils4, tvDetails22, 0L, 2, null);
                                ConstraintLayout ll22 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll2);
                                kotlin.jvm.internal.i.f(ll22, "ll2");
                                RobertoTextView tvSec2Label2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec2Label);
                                kotlin.jvm.internal.i.f(tvSec2Label2, "tvSec2Label");
                                AppCompatImageView img22 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img2);
                                kotlin.jvm.internal.i.f(img22, "img2");
                                this$0.K(ll22, tvSec2Label2, img22);
                            }
                            if (this$0.A != 2) {
                                this$0.J(2);
                                return;
                            }
                            return;
                        case 2:
                            int i16 = p1.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (kotlin.jvm.internal.i.b(((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll3)).getTag(), "+")) {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll3)).setTag("-");
                                Utils utils5 = Utils.INSTANCE;
                                RobertoTextView tvDetails3 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails3);
                                kotlin.jvm.internal.i.f(tvDetails3, "tvDetails3");
                                Utils.collapse$default(utils5, tvDetails3, 0L, 2, null);
                                ConstraintLayout ll3 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll3);
                                kotlin.jvm.internal.i.f(ll3, "ll3");
                                RobertoTextView tvSec3Label = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec3Label);
                                kotlin.jvm.internal.i.f(tvSec3Label, "tvSec3Label");
                                AppCompatImageView img3 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img3);
                                kotlin.jvm.internal.i.f(img3, "img3");
                                this$0.M(ll3, tvSec3Label, img3);
                            } else {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll3)).setTag("+");
                                Utils utils6 = Utils.INSTANCE;
                                RobertoTextView tvDetails32 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails3);
                                kotlin.jvm.internal.i.f(tvDetails32, "tvDetails3");
                                Utils.expand$default(utils6, tvDetails32, 0L, 2, null);
                                ConstraintLayout ll32 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll3);
                                kotlin.jvm.internal.i.f(ll32, "ll3");
                                RobertoTextView tvSec3Label2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec3Label);
                                kotlin.jvm.internal.i.f(tvSec3Label2, "tvSec3Label");
                                AppCompatImageView img32 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img3);
                                kotlin.jvm.internal.i.f(img32, "img3");
                                this$0.K(ll32, tvSec3Label2, img32);
                            }
                            if (this$0.A != 3) {
                                this$0.J(3);
                                return;
                            }
                            return;
                        case 3:
                            int i17 = p1.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (kotlin.jvm.internal.i.b(((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll4)).getTag(), "+")) {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll4)).setTag("-");
                                Utils utils7 = Utils.INSTANCE;
                                RobertoTextView tvDetails4 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails4);
                                kotlin.jvm.internal.i.f(tvDetails4, "tvDetails4");
                                Utils.collapse$default(utils7, tvDetails4, 0L, 2, null);
                                ConstraintLayout ll4 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll4);
                                kotlin.jvm.internal.i.f(ll4, "ll4");
                                RobertoTextView tvSec4Label = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec4Label);
                                kotlin.jvm.internal.i.f(tvSec4Label, "tvSec4Label");
                                AppCompatImageView img4 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img4);
                                kotlin.jvm.internal.i.f(img4, "img4");
                                this$0.M(ll4, tvSec4Label, img4);
                            } else {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll4)).setTag("+");
                                Utils utils8 = Utils.INSTANCE;
                                RobertoTextView tvDetails42 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails4);
                                kotlin.jvm.internal.i.f(tvDetails42, "tvDetails4");
                                Utils.expand$default(utils8, tvDetails42, 0L, 2, null);
                                ConstraintLayout ll42 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll4);
                                kotlin.jvm.internal.i.f(ll42, "ll4");
                                RobertoTextView tvSec4Label2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec4Label);
                                kotlin.jvm.internal.i.f(tvSec4Label2, "tvSec4Label");
                                AppCompatImageView img42 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img4);
                                kotlin.jvm.internal.i.f(img42, "img4");
                                this$0.K(ll42, tvSec4Label2, img42);
                            }
                            if (this$0.A != 4) {
                                this$0.J(4);
                                return;
                            }
                            return;
                        default:
                            int i18 = p1.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new fq.s(this$0, 11);
                            a1Var.b();
                            return;
                    }
                }
            });
            ((ConstraintLayout) _$_findCachedViewById(R.id.ll3)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.o1

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ p1 f18908v;

                {
                    this.f18908v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i13 = r2;
                    p1 this$0 = this.f18908v;
                    switch (i13) {
                        case 0:
                            int i14 = p1.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (kotlin.jvm.internal.i.b(((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll1)).getTag(), "+")) {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll1)).setTag("-");
                                Utils utils = Utils.INSTANCE;
                                RobertoTextView tvDetails1 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails1);
                                kotlin.jvm.internal.i.f(tvDetails1, "tvDetails1");
                                Utils.collapse$default(utils, tvDetails1, 0L, 2, null);
                                ConstraintLayout ll1 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll1);
                                kotlin.jvm.internal.i.f(ll1, "ll1");
                                RobertoTextView tvSec1Label = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec1Label);
                                kotlin.jvm.internal.i.f(tvSec1Label, "tvSec1Label");
                                AppCompatImageView img1 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img1);
                                kotlin.jvm.internal.i.f(img1, "img1");
                                this$0.M(ll1, tvSec1Label, img1);
                            } else {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll1)).setTag("+");
                                Utils utils2 = Utils.INSTANCE;
                                RobertoTextView tvDetails12 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails1);
                                kotlin.jvm.internal.i.f(tvDetails12, "tvDetails1");
                                Utils.expand$default(utils2, tvDetails12, 0L, 2, null);
                                ConstraintLayout ll12 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll1);
                                kotlin.jvm.internal.i.f(ll12, "ll1");
                                RobertoTextView tvSec1Label2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec1Label);
                                kotlin.jvm.internal.i.f(tvSec1Label2, "tvSec1Label");
                                AppCompatImageView img12 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img1);
                                kotlin.jvm.internal.i.f(img12, "img1");
                                this$0.K(ll12, tvSec1Label2, img12);
                            }
                            if (this$0.A != 1) {
                                this$0.J(1);
                                return;
                            }
                            return;
                        case 1:
                            int i15 = p1.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (kotlin.jvm.internal.i.b(((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll2)).getTag(), "+")) {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll2)).setTag("-");
                                Utils utils3 = Utils.INSTANCE;
                                RobertoTextView tvDetails2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails2);
                                kotlin.jvm.internal.i.f(tvDetails2, "tvDetails2");
                                Utils.collapse$default(utils3, tvDetails2, 0L, 2, null);
                                ConstraintLayout ll2 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll2);
                                kotlin.jvm.internal.i.f(ll2, "ll2");
                                RobertoTextView tvSec2Label = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec2Label);
                                kotlin.jvm.internal.i.f(tvSec2Label, "tvSec2Label");
                                AppCompatImageView img2 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img2);
                                kotlin.jvm.internal.i.f(img2, "img2");
                                this$0.M(ll2, tvSec2Label, img2);
                            } else {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll2)).setTag("+");
                                Utils utils4 = Utils.INSTANCE;
                                RobertoTextView tvDetails22 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails2);
                                kotlin.jvm.internal.i.f(tvDetails22, "tvDetails2");
                                Utils.expand$default(utils4, tvDetails22, 0L, 2, null);
                                ConstraintLayout ll22 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll2);
                                kotlin.jvm.internal.i.f(ll22, "ll2");
                                RobertoTextView tvSec2Label2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec2Label);
                                kotlin.jvm.internal.i.f(tvSec2Label2, "tvSec2Label");
                                AppCompatImageView img22 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img2);
                                kotlin.jvm.internal.i.f(img22, "img2");
                                this$0.K(ll22, tvSec2Label2, img22);
                            }
                            if (this$0.A != 2) {
                                this$0.J(2);
                                return;
                            }
                            return;
                        case 2:
                            int i16 = p1.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (kotlin.jvm.internal.i.b(((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll3)).getTag(), "+")) {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll3)).setTag("-");
                                Utils utils5 = Utils.INSTANCE;
                                RobertoTextView tvDetails3 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails3);
                                kotlin.jvm.internal.i.f(tvDetails3, "tvDetails3");
                                Utils.collapse$default(utils5, tvDetails3, 0L, 2, null);
                                ConstraintLayout ll3 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll3);
                                kotlin.jvm.internal.i.f(ll3, "ll3");
                                RobertoTextView tvSec3Label = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec3Label);
                                kotlin.jvm.internal.i.f(tvSec3Label, "tvSec3Label");
                                AppCompatImageView img3 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img3);
                                kotlin.jvm.internal.i.f(img3, "img3");
                                this$0.M(ll3, tvSec3Label, img3);
                            } else {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll3)).setTag("+");
                                Utils utils6 = Utils.INSTANCE;
                                RobertoTextView tvDetails32 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails3);
                                kotlin.jvm.internal.i.f(tvDetails32, "tvDetails3");
                                Utils.expand$default(utils6, tvDetails32, 0L, 2, null);
                                ConstraintLayout ll32 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll3);
                                kotlin.jvm.internal.i.f(ll32, "ll3");
                                RobertoTextView tvSec3Label2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec3Label);
                                kotlin.jvm.internal.i.f(tvSec3Label2, "tvSec3Label");
                                AppCompatImageView img32 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img3);
                                kotlin.jvm.internal.i.f(img32, "img3");
                                this$0.K(ll32, tvSec3Label2, img32);
                            }
                            if (this$0.A != 3) {
                                this$0.J(3);
                                return;
                            }
                            return;
                        case 3:
                            int i17 = p1.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (kotlin.jvm.internal.i.b(((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll4)).getTag(), "+")) {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll4)).setTag("-");
                                Utils utils7 = Utils.INSTANCE;
                                RobertoTextView tvDetails4 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails4);
                                kotlin.jvm.internal.i.f(tvDetails4, "tvDetails4");
                                Utils.collapse$default(utils7, tvDetails4, 0L, 2, null);
                                ConstraintLayout ll4 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll4);
                                kotlin.jvm.internal.i.f(ll4, "ll4");
                                RobertoTextView tvSec4Label = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec4Label);
                                kotlin.jvm.internal.i.f(tvSec4Label, "tvSec4Label");
                                AppCompatImageView img4 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img4);
                                kotlin.jvm.internal.i.f(img4, "img4");
                                this$0.M(ll4, tvSec4Label, img4);
                            } else {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll4)).setTag("+");
                                Utils utils8 = Utils.INSTANCE;
                                RobertoTextView tvDetails42 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails4);
                                kotlin.jvm.internal.i.f(tvDetails42, "tvDetails4");
                                Utils.expand$default(utils8, tvDetails42, 0L, 2, null);
                                ConstraintLayout ll42 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll4);
                                kotlin.jvm.internal.i.f(ll42, "ll4");
                                RobertoTextView tvSec4Label2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec4Label);
                                kotlin.jvm.internal.i.f(tvSec4Label2, "tvSec4Label");
                                AppCompatImageView img42 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img4);
                                kotlin.jvm.internal.i.f(img42, "img4");
                                this$0.K(ll42, tvSec4Label2, img42);
                            }
                            if (this$0.A != 4) {
                                this$0.J(4);
                                return;
                            }
                            return;
                        default:
                            int i18 = p1.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new fq.s(this$0, 11);
                            a1Var.b();
                            return;
                    }
                }
            });
            ((ConstraintLayout) _$_findCachedViewById(R.id.ll4)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.o1

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ p1 f18908v;

                {
                    this.f18908v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i13 = r2;
                    p1 this$0 = this.f18908v;
                    switch (i13) {
                        case 0:
                            int i14 = p1.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (kotlin.jvm.internal.i.b(((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll1)).getTag(), "+")) {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll1)).setTag("-");
                                Utils utils = Utils.INSTANCE;
                                RobertoTextView tvDetails1 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails1);
                                kotlin.jvm.internal.i.f(tvDetails1, "tvDetails1");
                                Utils.collapse$default(utils, tvDetails1, 0L, 2, null);
                                ConstraintLayout ll1 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll1);
                                kotlin.jvm.internal.i.f(ll1, "ll1");
                                RobertoTextView tvSec1Label = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec1Label);
                                kotlin.jvm.internal.i.f(tvSec1Label, "tvSec1Label");
                                AppCompatImageView img1 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img1);
                                kotlin.jvm.internal.i.f(img1, "img1");
                                this$0.M(ll1, tvSec1Label, img1);
                            } else {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll1)).setTag("+");
                                Utils utils2 = Utils.INSTANCE;
                                RobertoTextView tvDetails12 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails1);
                                kotlin.jvm.internal.i.f(tvDetails12, "tvDetails1");
                                Utils.expand$default(utils2, tvDetails12, 0L, 2, null);
                                ConstraintLayout ll12 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll1);
                                kotlin.jvm.internal.i.f(ll12, "ll1");
                                RobertoTextView tvSec1Label2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec1Label);
                                kotlin.jvm.internal.i.f(tvSec1Label2, "tvSec1Label");
                                AppCompatImageView img12 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img1);
                                kotlin.jvm.internal.i.f(img12, "img1");
                                this$0.K(ll12, tvSec1Label2, img12);
                            }
                            if (this$0.A != 1) {
                                this$0.J(1);
                                return;
                            }
                            return;
                        case 1:
                            int i15 = p1.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (kotlin.jvm.internal.i.b(((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll2)).getTag(), "+")) {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll2)).setTag("-");
                                Utils utils3 = Utils.INSTANCE;
                                RobertoTextView tvDetails2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails2);
                                kotlin.jvm.internal.i.f(tvDetails2, "tvDetails2");
                                Utils.collapse$default(utils3, tvDetails2, 0L, 2, null);
                                ConstraintLayout ll2 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll2);
                                kotlin.jvm.internal.i.f(ll2, "ll2");
                                RobertoTextView tvSec2Label = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec2Label);
                                kotlin.jvm.internal.i.f(tvSec2Label, "tvSec2Label");
                                AppCompatImageView img2 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img2);
                                kotlin.jvm.internal.i.f(img2, "img2");
                                this$0.M(ll2, tvSec2Label, img2);
                            } else {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll2)).setTag("+");
                                Utils utils4 = Utils.INSTANCE;
                                RobertoTextView tvDetails22 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails2);
                                kotlin.jvm.internal.i.f(tvDetails22, "tvDetails2");
                                Utils.expand$default(utils4, tvDetails22, 0L, 2, null);
                                ConstraintLayout ll22 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll2);
                                kotlin.jvm.internal.i.f(ll22, "ll2");
                                RobertoTextView tvSec2Label2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec2Label);
                                kotlin.jvm.internal.i.f(tvSec2Label2, "tvSec2Label");
                                AppCompatImageView img22 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img2);
                                kotlin.jvm.internal.i.f(img22, "img2");
                                this$0.K(ll22, tvSec2Label2, img22);
                            }
                            if (this$0.A != 2) {
                                this$0.J(2);
                                return;
                            }
                            return;
                        case 2:
                            int i16 = p1.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (kotlin.jvm.internal.i.b(((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll3)).getTag(), "+")) {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll3)).setTag("-");
                                Utils utils5 = Utils.INSTANCE;
                                RobertoTextView tvDetails3 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails3);
                                kotlin.jvm.internal.i.f(tvDetails3, "tvDetails3");
                                Utils.collapse$default(utils5, tvDetails3, 0L, 2, null);
                                ConstraintLayout ll3 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll3);
                                kotlin.jvm.internal.i.f(ll3, "ll3");
                                RobertoTextView tvSec3Label = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec3Label);
                                kotlin.jvm.internal.i.f(tvSec3Label, "tvSec3Label");
                                AppCompatImageView img3 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img3);
                                kotlin.jvm.internal.i.f(img3, "img3");
                                this$0.M(ll3, tvSec3Label, img3);
                            } else {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll3)).setTag("+");
                                Utils utils6 = Utils.INSTANCE;
                                RobertoTextView tvDetails32 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails3);
                                kotlin.jvm.internal.i.f(tvDetails32, "tvDetails3");
                                Utils.expand$default(utils6, tvDetails32, 0L, 2, null);
                                ConstraintLayout ll32 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll3);
                                kotlin.jvm.internal.i.f(ll32, "ll3");
                                RobertoTextView tvSec3Label2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec3Label);
                                kotlin.jvm.internal.i.f(tvSec3Label2, "tvSec3Label");
                                AppCompatImageView img32 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img3);
                                kotlin.jvm.internal.i.f(img32, "img3");
                                this$0.K(ll32, tvSec3Label2, img32);
                            }
                            if (this$0.A != 3) {
                                this$0.J(3);
                                return;
                            }
                            return;
                        case 3:
                            int i17 = p1.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (kotlin.jvm.internal.i.b(((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll4)).getTag(), "+")) {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll4)).setTag("-");
                                Utils utils7 = Utils.INSTANCE;
                                RobertoTextView tvDetails4 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails4);
                                kotlin.jvm.internal.i.f(tvDetails4, "tvDetails4");
                                Utils.collapse$default(utils7, tvDetails4, 0L, 2, null);
                                ConstraintLayout ll4 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll4);
                                kotlin.jvm.internal.i.f(ll4, "ll4");
                                RobertoTextView tvSec4Label = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec4Label);
                                kotlin.jvm.internal.i.f(tvSec4Label, "tvSec4Label");
                                AppCompatImageView img4 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img4);
                                kotlin.jvm.internal.i.f(img4, "img4");
                                this$0.M(ll4, tvSec4Label, img4);
                            } else {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll4)).setTag("+");
                                Utils utils8 = Utils.INSTANCE;
                                RobertoTextView tvDetails42 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails4);
                                kotlin.jvm.internal.i.f(tvDetails42, "tvDetails4");
                                Utils.expand$default(utils8, tvDetails42, 0L, 2, null);
                                ConstraintLayout ll42 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll4);
                                kotlin.jvm.internal.i.f(ll42, "ll4");
                                RobertoTextView tvSec4Label2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec4Label);
                                kotlin.jvm.internal.i.f(tvSec4Label2, "tvSec4Label");
                                AppCompatImageView img42 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img4);
                                kotlin.jvm.internal.i.f(img42, "img4");
                                this$0.K(ll42, tvSec4Label2, img42);
                            }
                            if (this$0.A != 4) {
                                this$0.J(4);
                                return;
                            }
                            return;
                        default:
                            int i18 = p1.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new fq.s(this$0, 11);
                            a1Var.b();
                            return;
                    }
                }
            });
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new c0(templateActivity, 8));
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
            if (kotlin.jvm.internal.i.b(templateActivity.C0().get("log"), Boolean.TRUE)) {
                templateActivity.C0().put("log", Boolean.FALSE);
                ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
                ((RobertoButton) _$_findCachedViewById(R.id.btnR21ButtonOne)).setVisibility(8);
                ((RobertoButton) _$_findCachedViewById(R.id.btnR21ButtonTwo)).setVisibility(8);
                return;
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btnR21ButtonOne)).setOnClickListener(new c0(templateActivity, 9));
            ((RobertoButton) _$_findCachedViewById(R.id.btnR21ButtonTwo)).setOnClickListener(new nn.g(28, this, templateActivity, obj));
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.o1

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ p1 f18908v;

                {
                    this.f18908v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i13 = r2;
                    p1 this$0 = this.f18908v;
                    switch (i13) {
                        case 0:
                            int i14 = p1.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (kotlin.jvm.internal.i.b(((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll1)).getTag(), "+")) {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll1)).setTag("-");
                                Utils utils = Utils.INSTANCE;
                                RobertoTextView tvDetails1 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails1);
                                kotlin.jvm.internal.i.f(tvDetails1, "tvDetails1");
                                Utils.collapse$default(utils, tvDetails1, 0L, 2, null);
                                ConstraintLayout ll1 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll1);
                                kotlin.jvm.internal.i.f(ll1, "ll1");
                                RobertoTextView tvSec1Label = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec1Label);
                                kotlin.jvm.internal.i.f(tvSec1Label, "tvSec1Label");
                                AppCompatImageView img1 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img1);
                                kotlin.jvm.internal.i.f(img1, "img1");
                                this$0.M(ll1, tvSec1Label, img1);
                            } else {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll1)).setTag("+");
                                Utils utils2 = Utils.INSTANCE;
                                RobertoTextView tvDetails12 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails1);
                                kotlin.jvm.internal.i.f(tvDetails12, "tvDetails1");
                                Utils.expand$default(utils2, tvDetails12, 0L, 2, null);
                                ConstraintLayout ll12 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll1);
                                kotlin.jvm.internal.i.f(ll12, "ll1");
                                RobertoTextView tvSec1Label2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec1Label);
                                kotlin.jvm.internal.i.f(tvSec1Label2, "tvSec1Label");
                                AppCompatImageView img12 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img1);
                                kotlin.jvm.internal.i.f(img12, "img1");
                                this$0.K(ll12, tvSec1Label2, img12);
                            }
                            if (this$0.A != 1) {
                                this$0.J(1);
                                return;
                            }
                            return;
                        case 1:
                            int i15 = p1.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (kotlin.jvm.internal.i.b(((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll2)).getTag(), "+")) {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll2)).setTag("-");
                                Utils utils3 = Utils.INSTANCE;
                                RobertoTextView tvDetails2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails2);
                                kotlin.jvm.internal.i.f(tvDetails2, "tvDetails2");
                                Utils.collapse$default(utils3, tvDetails2, 0L, 2, null);
                                ConstraintLayout ll2 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll2);
                                kotlin.jvm.internal.i.f(ll2, "ll2");
                                RobertoTextView tvSec2Label = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec2Label);
                                kotlin.jvm.internal.i.f(tvSec2Label, "tvSec2Label");
                                AppCompatImageView img2 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img2);
                                kotlin.jvm.internal.i.f(img2, "img2");
                                this$0.M(ll2, tvSec2Label, img2);
                            } else {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll2)).setTag("+");
                                Utils utils4 = Utils.INSTANCE;
                                RobertoTextView tvDetails22 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails2);
                                kotlin.jvm.internal.i.f(tvDetails22, "tvDetails2");
                                Utils.expand$default(utils4, tvDetails22, 0L, 2, null);
                                ConstraintLayout ll22 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll2);
                                kotlin.jvm.internal.i.f(ll22, "ll2");
                                RobertoTextView tvSec2Label2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec2Label);
                                kotlin.jvm.internal.i.f(tvSec2Label2, "tvSec2Label");
                                AppCompatImageView img22 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img2);
                                kotlin.jvm.internal.i.f(img22, "img2");
                                this$0.K(ll22, tvSec2Label2, img22);
                            }
                            if (this$0.A != 2) {
                                this$0.J(2);
                                return;
                            }
                            return;
                        case 2:
                            int i16 = p1.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (kotlin.jvm.internal.i.b(((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll3)).getTag(), "+")) {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll3)).setTag("-");
                                Utils utils5 = Utils.INSTANCE;
                                RobertoTextView tvDetails3 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails3);
                                kotlin.jvm.internal.i.f(tvDetails3, "tvDetails3");
                                Utils.collapse$default(utils5, tvDetails3, 0L, 2, null);
                                ConstraintLayout ll3 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll3);
                                kotlin.jvm.internal.i.f(ll3, "ll3");
                                RobertoTextView tvSec3Label = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec3Label);
                                kotlin.jvm.internal.i.f(tvSec3Label, "tvSec3Label");
                                AppCompatImageView img3 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img3);
                                kotlin.jvm.internal.i.f(img3, "img3");
                                this$0.M(ll3, tvSec3Label, img3);
                            } else {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll3)).setTag("+");
                                Utils utils6 = Utils.INSTANCE;
                                RobertoTextView tvDetails32 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails3);
                                kotlin.jvm.internal.i.f(tvDetails32, "tvDetails3");
                                Utils.expand$default(utils6, tvDetails32, 0L, 2, null);
                                ConstraintLayout ll32 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll3);
                                kotlin.jvm.internal.i.f(ll32, "ll3");
                                RobertoTextView tvSec3Label2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec3Label);
                                kotlin.jvm.internal.i.f(tvSec3Label2, "tvSec3Label");
                                AppCompatImageView img32 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img3);
                                kotlin.jvm.internal.i.f(img32, "img3");
                                this$0.K(ll32, tvSec3Label2, img32);
                            }
                            if (this$0.A != 3) {
                                this$0.J(3);
                                return;
                            }
                            return;
                        case 3:
                            int i17 = p1.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (kotlin.jvm.internal.i.b(((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll4)).getTag(), "+")) {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll4)).setTag("-");
                                Utils utils7 = Utils.INSTANCE;
                                RobertoTextView tvDetails4 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails4);
                                kotlin.jvm.internal.i.f(tvDetails4, "tvDetails4");
                                Utils.collapse$default(utils7, tvDetails4, 0L, 2, null);
                                ConstraintLayout ll4 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll4);
                                kotlin.jvm.internal.i.f(ll4, "ll4");
                                RobertoTextView tvSec4Label = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec4Label);
                                kotlin.jvm.internal.i.f(tvSec4Label, "tvSec4Label");
                                AppCompatImageView img4 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img4);
                                kotlin.jvm.internal.i.f(img4, "img4");
                                this$0.M(ll4, tvSec4Label, img4);
                            } else {
                                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.ll4)).setTag("+");
                                Utils utils8 = Utils.INSTANCE;
                                RobertoTextView tvDetails42 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvDetails4);
                                kotlin.jvm.internal.i.f(tvDetails42, "tvDetails4");
                                Utils.expand$default(utils8, tvDetails42, 0L, 2, null);
                                ConstraintLayout ll42 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.ll4);
                                kotlin.jvm.internal.i.f(ll42, "ll4");
                                RobertoTextView tvSec4Label2 = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvSec4Label);
                                kotlin.jvm.internal.i.f(tvSec4Label2, "tvSec4Label");
                                AppCompatImageView img42 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.img4);
                                kotlin.jvm.internal.i.f(img42, "img4");
                                this$0.K(ll42, tvSec4Label2, img42);
                            }
                            if (this$0.A != 4) {
                                this$0.J(4);
                                return;
                            }
                            return;
                        default:
                            int i18 = p1.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new fq.s(this$0, 11);
                            a1Var.b();
                            return;
                    }
                }
            });
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new c0(templateActivity, 10));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18942u, "exception in on view created", e10);
        }
    }
}
