package hr;

import android.graphics.ColorFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.ScreenResult21Model;
import com.theinnerhour.b2b.model.TemplateModel;
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
/* compiled from: ScreenResult21FragmentNew.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/r1;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class r1 extends rr.b {
    public static final /* synthetic */ int F = 0;
    public int A;
    public TemplateActivity C;
    public final LinkedHashMap E = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19067u = LogHelper.INSTANCE.makeLogTag(r1.class);

    /* renamed from: v  reason: collision with root package name */
    public ScreenResult21Model f19068v = new ScreenResult21Model(0, new ArrayList(0));

    /* renamed from: w  reason: collision with root package name */
    public String f19069w = "";

    /* renamed from: x  reason: collision with root package name */
    public String f19070x = "";

    /* renamed from: y  reason: collision with root package name */
    public String f19071y = "";

    /* renamed from: z  reason: collision with root package name */
    public String f19072z = "";
    public final androidx.lifecycle.m0 B = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new b(this), new c(this), new d(this));
    public final String D = "result_21";

    /* compiled from: ScreenResult21FragmentNew.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends FirestoreGoal>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f19074v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.f19074v = str;
        }

        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends FirestoreGoal> fVar) {
            boolean z10;
            hs.f<? extends Boolean, ? extends FirestoreGoal> fVar2 = fVar;
            if (fVar2 != null) {
                if (fVar2.f19465v != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                final r1 r1Var = r1.this;
                TemplateActivity templateActivity = r1Var.C;
                if (templateActivity != null) {
                    if (kotlin.jvm.internal.i.b(templateActivity.F.get("log"), Boolean.TRUE)) {
                        TemplateActivity templateActivity2 = r1Var.C;
                        if (templateActivity2 != null) {
                            if (templateActivity2.F.containsKey("data")) {
                                TemplateActivity templateActivity3 = r1Var.C;
                                if (templateActivity3 != null) {
                                    Object obj = templateActivity3.F.get("data");
                                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult21Model");
                                    r1Var.f19068v = (ScreenResult21Model) obj;
                                } else {
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                }
                            }
                            ((RobertoTextView) r1Var._$_findCachedViewById(R.id.tvR21Header)).setText(r1Var.f19068v.getTitle());
                            ((RobertoTextView) r1Var._$_findCachedViewById(R.id.tvSec1Label)).setText(r1Var.f19068v.getHeading1());
                            String desc1 = r1Var.f19068v.getDesc1();
                            kotlin.jvm.internal.i.d(desc1);
                            r1Var.f19069w = desc1;
                            ((RobertoTextView) r1Var._$_findCachedViewById(R.id.tvSec2Label)).setText(r1Var.f19068v.getHeading2());
                            String desc2 = r1Var.f19068v.getDesc2();
                            kotlin.jvm.internal.i.d(desc2);
                            r1Var.f19070x = desc2;
                            ((RobertoTextView) r1Var._$_findCachedViewById(R.id.tvSec3Label)).setText(r1Var.f19068v.getHeading3());
                            String desc3 = r1Var.f19068v.getDesc3();
                            kotlin.jvm.internal.i.d(desc3);
                            r1Var.f19071y = desc3;
                            ((RobertoTextView) r1Var._$_findCachedViewById(R.id.tvSec4Label)).setText(r1Var.f19068v.getHeading4());
                            String desc4 = r1Var.f19068v.getDesc4();
                            kotlin.jvm.internal.i.d(desc4);
                            r1Var.f19072z = desc4;
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    } else {
                        TemplateActivity templateActivity4 = r1Var.C;
                        if (templateActivity4 != null) {
                            HashMap<String, Object> hashMap = templateActivity4.F;
                            String str = r1Var.D;
                            if (hashMap.containsKey(str)) {
                                TemplateActivity templateActivity5 = r1Var.C;
                                if (templateActivity5 != null) {
                                    Object obj2 = templateActivity5.F.get(str);
                                    kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult21Model");
                                    r1Var.f19068v = (ScreenResult21Model) obj2;
                                } else {
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                }
                            }
                            ((ImageView) r1Var._$_findCachedViewById(R.id.ivHelp)).setVisibility(4);
                            TemplateActivity templateActivity6 = r1Var.C;
                            if (templateActivity6 != null) {
                                HashMap<String, Object> A0 = templateActivity6.A0();
                                if (A0.containsKey("r21_heading")) {
                                    Object obj3 = A0.get("r21_heading");
                                    kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.String");
                                    ((RobertoTextView) r1Var._$_findCachedViewById(R.id.tvR21Header)).setText((String) obj3);
                                    ScreenResult21Model screenResult21Model = r1Var.f19068v;
                                    Object obj4 = A0.get("r21_heading");
                                    kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type kotlin.String");
                                    screenResult21Model.setTitle((String) obj4);
                                }
                                if (A0.containsKey("first_section_label")) {
                                    Object obj5 = A0.get("first_section_label");
                                    kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type kotlin.String");
                                    ((RobertoTextView) r1Var._$_findCachedViewById(R.id.tvSec1Label)).setText((String) obj5);
                                    ScreenResult21Model screenResult21Model2 = r1Var.f19068v;
                                    Object obj6 = A0.get("first_section_label");
                                    kotlin.jvm.internal.i.e(obj6, "null cannot be cast to non-null type kotlin.String");
                                    screenResult21Model2.setHeading1((String) obj6);
                                }
                                if (A0.containsKey("first_section_description")) {
                                    Object obj7 = A0.get("first_section_description");
                                    kotlin.jvm.internal.i.e(obj7, "null cannot be cast to non-null type kotlin.String");
                                    r1Var.f19069w = (String) obj7;
                                    ScreenResult21Model screenResult21Model3 = r1Var.f19068v;
                                    Object obj8 = A0.get("first_section_description");
                                    kotlin.jvm.internal.i.e(obj8, "null cannot be cast to non-null type kotlin.String");
                                    screenResult21Model3.setDesc1((String) obj8);
                                }
                                if (A0.containsKey("second_section_label")) {
                                    Object obj9 = A0.get("second_section_label");
                                    kotlin.jvm.internal.i.e(obj9, "null cannot be cast to non-null type kotlin.String");
                                    ((RobertoTextView) r1Var._$_findCachedViewById(R.id.tvSec2Label)).setText((String) obj9);
                                    ScreenResult21Model screenResult21Model4 = r1Var.f19068v;
                                    Object obj10 = A0.get("second_section_label");
                                    kotlin.jvm.internal.i.e(obj10, "null cannot be cast to non-null type kotlin.String");
                                    screenResult21Model4.setHeading2((String) obj10);
                                }
                                if (A0.containsKey("second_section_description")) {
                                    Object obj11 = A0.get("second_section_description");
                                    kotlin.jvm.internal.i.e(obj11, "null cannot be cast to non-null type kotlin.String");
                                    r1Var.f19070x = (String) obj11;
                                    ScreenResult21Model screenResult21Model5 = r1Var.f19068v;
                                    Object obj12 = A0.get("second_section_description");
                                    kotlin.jvm.internal.i.e(obj12, "null cannot be cast to non-null type kotlin.String");
                                    screenResult21Model5.setDesc2((String) obj12);
                                }
                                if (A0.containsKey("third_section_label")) {
                                    Object obj13 = A0.get("third_section_label");
                                    kotlin.jvm.internal.i.e(obj13, "null cannot be cast to non-null type kotlin.String");
                                    ((RobertoTextView) r1Var._$_findCachedViewById(R.id.tvSec3Label)).setText((String) obj13);
                                    ScreenResult21Model screenResult21Model6 = r1Var.f19068v;
                                    Object obj14 = A0.get("third_section_label");
                                    kotlin.jvm.internal.i.e(obj14, "null cannot be cast to non-null type kotlin.String");
                                    screenResult21Model6.setHeading3((String) obj14);
                                }
                                if (A0.containsKey("third_section_description")) {
                                    Object obj15 = A0.get("third_section_description");
                                    kotlin.jvm.internal.i.e(obj15, "null cannot be cast to non-null type kotlin.String");
                                    r1Var.f19071y = (String) obj15;
                                    ScreenResult21Model screenResult21Model7 = r1Var.f19068v;
                                    Object obj16 = A0.get("third_section_description");
                                    kotlin.jvm.internal.i.e(obj16, "null cannot be cast to non-null type kotlin.String");
                                    screenResult21Model7.setDesc3((String) obj16);
                                }
                                if (A0.containsKey("fourth_section_label")) {
                                    Object obj17 = A0.get("fourth_section_label");
                                    kotlin.jvm.internal.i.e(obj17, "null cannot be cast to non-null type kotlin.String");
                                    ((RobertoTextView) r1Var._$_findCachedViewById(R.id.tvSec4Label)).setText((String) obj17);
                                    ScreenResult21Model screenResult21Model8 = r1Var.f19068v;
                                    Object obj18 = A0.get("fourth_section_label");
                                    kotlin.jvm.internal.i.e(obj18, "null cannot be cast to non-null type kotlin.String");
                                    screenResult21Model8.setHeading4((String) obj18);
                                }
                                if (A0.containsKey("fourth_section_description")) {
                                    Object obj19 = A0.get("fourth_section_description");
                                    kotlin.jvm.internal.i.e(obj19, "null cannot be cast to non-null type kotlin.String");
                                    r1Var.f19072z = (String) obj19;
                                    ScreenResult21Model screenResult21Model9 = r1Var.f19068v;
                                    Object obj20 = A0.get("fourth_section_description");
                                    kotlin.jvm.internal.i.e(obj20, "null cannot be cast to non-null type kotlin.String");
                                    screenResult21Model9.setDesc4((String) obj20);
                                }
                                if (A0.containsKey("r21_btn_one_text")) {
                                    Object obj21 = A0.get("r21_btn_one_text");
                                    kotlin.jvm.internal.i.e(obj21, "null cannot be cast to non-null type kotlin.String");
                                    ((RobertoButton) r1Var._$_findCachedViewById(R.id.btnR21ButtonOne)).setText((String) obj21);
                                }
                                if (A0.containsKey("r21_btn_two_text")) {
                                    Object obj22 = A0.get("r21_btn_two_text");
                                    kotlin.jvm.internal.i.e(obj22, "null cannot be cast to non-null type kotlin.String");
                                    ((RobertoButton) r1Var._$_findCachedViewById(R.id.btnR21ButtonTwo)).setText((String) obj22);
                                }
                            } else {
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    }
                    r1Var.f19069w = r1.b0.b(new StringBuilder(), r1Var.f19069w, "\n\n");
                    r1Var.f19071y = r1.b0.b(new StringBuilder(), r1Var.f19071y, "\n\n");
                    r1Var.f19070x = r1.b0.b(new StringBuilder(), r1Var.f19070x, "\n\n");
                    r1Var.f19072z = r1.b0.b(new StringBuilder(), r1Var.f19072z, "\n\n");
                    Iterator<UrgentImportantModel> it = r1Var.f19068v.getItems().iterator();
                    int i6 = 0;
                    int i10 = 0;
                    int i11 = 0;
                    int i12 = 0;
                    while (it.hasNext()) {
                        UrgentImportantModel next = it.next();
                        if (next.getImportant() && next.getUrgent()) {
                            i6++;
                            r1Var.f19069w += i6 + ". " + next.getText() + '\n';
                        } else if (next.getImportant() && !next.getUrgent()) {
                            i10++;
                            r1Var.f19070x += i10 + ". " + next.getText() + '\n';
                        } else if (!next.getImportant() && next.getUrgent()) {
                            i12++;
                            r1Var.f19071y += i12 + ". " + next.getText() + '\n';
                        } else {
                            i11++;
                            r1Var.f19072z += i11 + ". " + next.getText() + '\n';
                        }
                    }
                    ((RobertoTextView) r1Var._$_findCachedViewById(R.id.tvDetails1)).setText(r1Var.f19069w);
                    ((RobertoTextView) r1Var._$_findCachedViewById(R.id.tvDetails2)).setText(r1Var.f19070x);
                    ((RobertoTextView) r1Var._$_findCachedViewById(R.id.tvDetails3)).setText(r1Var.f19071y);
                    ((RobertoTextView) r1Var._$_findCachedViewById(R.id.tvDetails4)).setText(r1Var.f19072z);
                    ((ConstraintLayout) r1Var._$_findCachedViewById(R.id.ll1)).setTag("-");
                    ((ConstraintLayout) r1Var._$_findCachedViewById(R.id.ll2)).setTag("-");
                    ((ConstraintLayout) r1Var._$_findCachedViewById(R.id.ll3)).setTag("-");
                    ((ConstraintLayout) r1Var._$_findCachedViewById(R.id.ll4)).setTag("-");
                    ((ConstraintLayout) r1Var._$_findCachedViewById(R.id.ll1)).setOnClickListener(new View.OnClickListener() { // from class: hr.q1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i13 = r2;
                            r1 this$0 = r1Var;
                            switch (i13) {
                                case 0:
                                    int i14 = r1.F;
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
                                    int i15 = r1.F;
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
                                    int i16 = r1.F;
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
                                    int i17 = r1.F;
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
                                case 4:
                                    int i18 = r1.F;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    TemplateActivity templateActivity7 = this$0.C;
                                    if (templateActivity7 != null) {
                                        androidx.fragment.app.y yVar = templateActivity7.B;
                                        kotlin.jvm.internal.i.d(yVar);
                                        yVar.W();
                                        return;
                                    }
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                case 5:
                                    int i19 = r1.F;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    TemplateActivity templateActivity8 = this$0.C;
                                    if (templateActivity8 != null) {
                                        templateActivity8.onBackPressed();
                                        TemplateActivity templateActivity9 = this$0.C;
                                        if (templateActivity9 != null) {
                                            templateActivity9.onBackPressed();
                                            return;
                                        } else {
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        }
                                    }
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                case 6:
                                    int i20 = r1.F;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                                    a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                                    a1Var.f1346d = new fq.s(this$0, 12);
                                    a1Var.b();
                                    return;
                                default:
                                    int i21 = r1.F;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    TemplateActivity templateActivity10 = this$0.C;
                                    if (templateActivity10 != null) {
                                        templateActivity10.onBackPressed();
                                        return;
                                    } else {
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    }
                            }
                        }
                    });
                    ((ConstraintLayout) r1Var._$_findCachedViewById(R.id.ll2)).setOnClickListener(new View.OnClickListener() { // from class: hr.q1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i13 = r2;
                            r1 this$0 = r1Var;
                            switch (i13) {
                                case 0:
                                    int i14 = r1.F;
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
                                    int i15 = r1.F;
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
                                    int i16 = r1.F;
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
                                    int i17 = r1.F;
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
                                case 4:
                                    int i18 = r1.F;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    TemplateActivity templateActivity7 = this$0.C;
                                    if (templateActivity7 != null) {
                                        androidx.fragment.app.y yVar = templateActivity7.B;
                                        kotlin.jvm.internal.i.d(yVar);
                                        yVar.W();
                                        return;
                                    }
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                case 5:
                                    int i19 = r1.F;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    TemplateActivity templateActivity8 = this$0.C;
                                    if (templateActivity8 != null) {
                                        templateActivity8.onBackPressed();
                                        TemplateActivity templateActivity9 = this$0.C;
                                        if (templateActivity9 != null) {
                                            templateActivity9.onBackPressed();
                                            return;
                                        } else {
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        }
                                    }
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                case 6:
                                    int i20 = r1.F;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                                    a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                                    a1Var.f1346d = new fq.s(this$0, 12);
                                    a1Var.b();
                                    return;
                                default:
                                    int i21 = r1.F;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    TemplateActivity templateActivity10 = this$0.C;
                                    if (templateActivity10 != null) {
                                        templateActivity10.onBackPressed();
                                        return;
                                    } else {
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    }
                            }
                        }
                    });
                    ((ConstraintLayout) r1Var._$_findCachedViewById(R.id.ll3)).setOnClickListener(new View.OnClickListener() { // from class: hr.q1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i13 = r2;
                            r1 this$0 = r1Var;
                            switch (i13) {
                                case 0:
                                    int i14 = r1.F;
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
                                    int i15 = r1.F;
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
                                    int i16 = r1.F;
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
                                    int i17 = r1.F;
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
                                case 4:
                                    int i18 = r1.F;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    TemplateActivity templateActivity7 = this$0.C;
                                    if (templateActivity7 != null) {
                                        androidx.fragment.app.y yVar = templateActivity7.B;
                                        kotlin.jvm.internal.i.d(yVar);
                                        yVar.W();
                                        return;
                                    }
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                case 5:
                                    int i19 = r1.F;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    TemplateActivity templateActivity8 = this$0.C;
                                    if (templateActivity8 != null) {
                                        templateActivity8.onBackPressed();
                                        TemplateActivity templateActivity9 = this$0.C;
                                        if (templateActivity9 != null) {
                                            templateActivity9.onBackPressed();
                                            return;
                                        } else {
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        }
                                    }
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                case 6:
                                    int i20 = r1.F;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                                    a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                                    a1Var.f1346d = new fq.s(this$0, 12);
                                    a1Var.b();
                                    return;
                                default:
                                    int i21 = r1.F;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    TemplateActivity templateActivity10 = this$0.C;
                                    if (templateActivity10 != null) {
                                        templateActivity10.onBackPressed();
                                        return;
                                    } else {
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    }
                            }
                        }
                    });
                    ((ConstraintLayout) r1Var._$_findCachedViewById(R.id.ll4)).setOnClickListener(new View.OnClickListener() { // from class: hr.q1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i13 = r2;
                            r1 this$0 = r1Var;
                            switch (i13) {
                                case 0:
                                    int i14 = r1.F;
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
                                    int i15 = r1.F;
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
                                    int i16 = r1.F;
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
                                    int i17 = r1.F;
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
                                case 4:
                                    int i18 = r1.F;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    TemplateActivity templateActivity7 = this$0.C;
                                    if (templateActivity7 != null) {
                                        androidx.fragment.app.y yVar = templateActivity7.B;
                                        kotlin.jvm.internal.i.d(yVar);
                                        yVar.W();
                                        return;
                                    }
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                case 5:
                                    int i19 = r1.F;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    TemplateActivity templateActivity8 = this$0.C;
                                    if (templateActivity8 != null) {
                                        templateActivity8.onBackPressed();
                                        TemplateActivity templateActivity9 = this$0.C;
                                        if (templateActivity9 != null) {
                                            templateActivity9.onBackPressed();
                                            return;
                                        } else {
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        }
                                    }
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                case 6:
                                    int i20 = r1.F;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                                    a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                                    a1Var.f1346d = new fq.s(this$0, 12);
                                    a1Var.b();
                                    return;
                                default:
                                    int i21 = r1.F;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    TemplateActivity templateActivity10 = this$0.C;
                                    if (templateActivity10 != null) {
                                        templateActivity10.onBackPressed();
                                        return;
                                    } else {
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    }
                            }
                        }
                    });
                    ((ImageView) r1Var._$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener() { // from class: hr.q1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i13 = r2;
                            r1 this$0 = r1Var;
                            switch (i13) {
                                case 0:
                                    int i14 = r1.F;
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
                                    int i15 = r1.F;
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
                                    int i16 = r1.F;
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
                                    int i17 = r1.F;
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
                                case 4:
                                    int i18 = r1.F;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    TemplateActivity templateActivity7 = this$0.C;
                                    if (templateActivity7 != null) {
                                        androidx.fragment.app.y yVar = templateActivity7.B;
                                        kotlin.jvm.internal.i.d(yVar);
                                        yVar.W();
                                        return;
                                    }
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                case 5:
                                    int i19 = r1.F;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    TemplateActivity templateActivity8 = this$0.C;
                                    if (templateActivity8 != null) {
                                        templateActivity8.onBackPressed();
                                        TemplateActivity templateActivity9 = this$0.C;
                                        if (templateActivity9 != null) {
                                            templateActivity9.onBackPressed();
                                            return;
                                        } else {
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        }
                                    }
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                case 6:
                                    int i20 = r1.F;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                                    a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                                    a1Var.f1346d = new fq.s(this$0, 12);
                                    a1Var.b();
                                    return;
                                default:
                                    int i21 = r1.F;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    TemplateActivity templateActivity10 = this$0.C;
                                    if (templateActivity10 != null) {
                                        templateActivity10.onBackPressed();
                                        return;
                                    } else {
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    }
                            }
                        }
                    });
                    ((ImageView) r1Var._$_findCachedViewById(R.id.ivHelp)).setVisibility(8);
                    TemplateActivity templateActivity7 = r1Var.C;
                    if (templateActivity7 != null) {
                        if (kotlin.jvm.internal.i.b(templateActivity7.F.get("log"), Boolean.TRUE)) {
                            TemplateActivity templateActivity8 = r1Var.C;
                            if (templateActivity8 != null) {
                                templateActivity8.F.put("log", Boolean.FALSE);
                                ((ImageView) r1Var._$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
                                ((RobertoButton) r1Var._$_findCachedViewById(R.id.btnR21ButtonOne)).setVisibility(8);
                                ((RobertoButton) r1Var._$_findCachedViewById(R.id.btnR21ButtonTwo)).setVisibility(8);
                            } else {
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            }
                        } else {
                            ((RobertoButton) r1Var._$_findCachedViewById(R.id.btnR21ButtonOne)).setOnClickListener(new View.OnClickListener() { // from class: hr.q1
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i13 = r2;
                                    r1 this$0 = r1Var;
                                    switch (i13) {
                                        case 0:
                                            int i14 = r1.F;
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
                                            int i15 = r1.F;
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
                                            int i16 = r1.F;
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
                                            int i17 = r1.F;
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
                                        case 4:
                                            int i18 = r1.F;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            TemplateActivity templateActivity72 = this$0.C;
                                            if (templateActivity72 != null) {
                                                androidx.fragment.app.y yVar = templateActivity72.B;
                                                kotlin.jvm.internal.i.d(yVar);
                                                yVar.W();
                                                return;
                                            }
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        case 5:
                                            int i19 = r1.F;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            TemplateActivity templateActivity82 = this$0.C;
                                            if (templateActivity82 != null) {
                                                templateActivity82.onBackPressed();
                                                TemplateActivity templateActivity9 = this$0.C;
                                                if (templateActivity9 != null) {
                                                    templateActivity9.onBackPressed();
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.i.q("act");
                                                    throw null;
                                                }
                                            }
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        case 6:
                                            int i20 = r1.F;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                                            a1Var.f1346d = new fq.s(this$0, 12);
                                            a1Var.b();
                                            return;
                                        default:
                                            int i21 = r1.F;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            TemplateActivity templateActivity10 = this$0.C;
                                            if (templateActivity10 != null) {
                                                templateActivity10.onBackPressed();
                                                return;
                                            } else {
                                                kotlin.jvm.internal.i.q("act");
                                                throw null;
                                            }
                                    }
                                }
                            });
                            ((RobertoButton) r1Var._$_findCachedViewById(R.id.btnR21ButtonTwo)).setOnClickListener(new dl.l0(r1Var, this.f19074v, z10));
                            ((ImageView) r1Var._$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
                            ((ImageView) r1Var._$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new View.OnClickListener() { // from class: hr.q1
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i13 = r2;
                                    r1 this$0 = r1Var;
                                    switch (i13) {
                                        case 0:
                                            int i14 = r1.F;
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
                                            int i15 = r1.F;
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
                                            int i16 = r1.F;
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
                                            int i17 = r1.F;
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
                                        case 4:
                                            int i18 = r1.F;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            TemplateActivity templateActivity72 = this$0.C;
                                            if (templateActivity72 != null) {
                                                androidx.fragment.app.y yVar = templateActivity72.B;
                                                kotlin.jvm.internal.i.d(yVar);
                                                yVar.W();
                                                return;
                                            }
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        case 5:
                                            int i19 = r1.F;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            TemplateActivity templateActivity82 = this$0.C;
                                            if (templateActivity82 != null) {
                                                templateActivity82.onBackPressed();
                                                TemplateActivity templateActivity9 = this$0.C;
                                                if (templateActivity9 != null) {
                                                    templateActivity9.onBackPressed();
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.i.q("act");
                                                    throw null;
                                                }
                                            }
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        case 6:
                                            int i20 = r1.F;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                                            a1Var.f1346d = new fq.s(this$0, 12);
                                            a1Var.b();
                                            return;
                                        default:
                                            int i21 = r1.F;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            TemplateActivity templateActivity10 = this$0.C;
                                            if (templateActivity10 != null) {
                                                templateActivity10.onBackPressed();
                                                return;
                                            } else {
                                                kotlin.jvm.internal.i.q("act");
                                                throw null;
                                            }
                                    }
                                }
                            });
                            ((ImageView) r1Var._$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener() { // from class: hr.q1
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i13 = r2;
                                    r1 this$0 = r1Var;
                                    switch (i13) {
                                        case 0:
                                            int i14 = r1.F;
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
                                            int i15 = r1.F;
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
                                            int i16 = r1.F;
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
                                            int i17 = r1.F;
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
                                        case 4:
                                            int i18 = r1.F;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            TemplateActivity templateActivity72 = this$0.C;
                                            if (templateActivity72 != null) {
                                                androidx.fragment.app.y yVar = templateActivity72.B;
                                                kotlin.jvm.internal.i.d(yVar);
                                                yVar.W();
                                                return;
                                            }
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        case 5:
                                            int i19 = r1.F;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            TemplateActivity templateActivity82 = this$0.C;
                                            if (templateActivity82 != null) {
                                                templateActivity82.onBackPressed();
                                                TemplateActivity templateActivity9 = this$0.C;
                                                if (templateActivity9 != null) {
                                                    templateActivity9.onBackPressed();
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.i.q("act");
                                                    throw null;
                                                }
                                            }
                                            kotlin.jvm.internal.i.q("act");
                                            throw null;
                                        case 6:
                                            int i20 = r1.F;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                                            a1Var.f1346d = new fq.s(this$0, 12);
                                            a1Var.b();
                                            return;
                                        default:
                                            int i21 = r1.F;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            TemplateActivity templateActivity10 = this$0.C;
                                            if (templateActivity10 != null) {
                                                templateActivity10.onBackPressed();
                                                return;
                                            } else {
                                                kotlin.jvm.internal.i.q("act");
                                                throw null;
                                            }
                                    }
                                }
                            });
                        }
                    } else {
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f19075u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f19075u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f19075u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f19076u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f19076u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f19076u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f19077u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f19077u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f19077u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

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
        constraintLayout.setBackgroundColor(g0.a.b(requireContext(), R.color.selected_row));
        robertoTextView.setTextColor(g0.a.b(requireContext(), R.color.selected_row_text));
        appCompatImageView.setImageResource(R.drawable.ic_keyboard_arrow_up);
        appCompatImageView.setColorFilter(-1);
    }

    public final void M(ConstraintLayout constraintLayout, RobertoTextView robertoTextView, AppCompatImageView appCompatImageView) {
        constraintLayout.setBackgroundColor(0);
        robertoTextView.setTextColor(g0.a.b(requireContext(), R.color.grey_high_contrast));
        appCompatImageView.setImageResource(R.drawable.ic_keyboard_arrow_down);
        appCompatImageView.setColorFilter((ColorFilter) null);
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.E;
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
        fm.a aVar = (fm.a) this.B.getValue();
        aVar.f15174h0.k(getViewLifecycleOwner());
        aVar.f15177k0.k(getViewLifecycleOwner());
        aVar.f15178l0.k(getViewLifecycleOwner());
        aVar.f15180n0.k(getViewLifecycleOwner());
        aVar.f15181o0.k(getViewLifecycleOwner());
        aVar.f15182p0.k(getViewLifecycleOwner());
        aVar.w();
        super.onDestroyView();
        this.E.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String label;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            this.C = templateActivity;
            TemplateModel templateModel = templateActivity.f10547y;
            if (templateModel != null && (label = templateModel.getLabel()) != null) {
                fm.a aVar = (fm.a) this.B.getValue();
                aVar.f15178l0.e(getViewLifecycleOwner(), new m0(23, new a(label)));
                aVar.m(label, this.D);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19067u, "exception in on view created", e10);
        }
    }
}
