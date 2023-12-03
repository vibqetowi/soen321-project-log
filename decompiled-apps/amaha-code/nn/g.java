package nn;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionPleasurableActivity;
import com.theinnerhour.b2b.activity.T8Activity;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel;
import com.theinnerhour.b2b.components.resetprogram.activity.ResetProgrammeActivity;
import com.theinnerhour.b2b.components.teleEntryPoint.activity.ProviderVideoActivity;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.MindfullnessModel;
import com.theinnerhour.b2b.model.ScreenResult14Model;
import com.theinnerhour.b2b.model.ScreenResult17Model;
import com.theinnerhour.b2b.model.ScreenResult19Model;
import com.theinnerhour.b2b.model.ScreenResult30Model;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import hr.t2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f26486u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f26487v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f26488w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f26489x;

    public /* synthetic */ g(int i6, Object obj, Object obj2, Object obj3) {
        this.f26486u = i6;
        this.f26487v = obj;
        this.f26488w = obj2;
        this.f26489x = obj3;
    }

    private final void a() {
        hr.c1 this$0 = (hr.c1) this.f26487v;
        kotlin.jvm.internal.x list = (kotlin.jvm.internal.x) this.f26488w;
        String resultKey = (String) this.f26489x;
        int i6 = hr.c1.f18223w;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(list, "$list");
        kotlin.jvm.internal.i.g(resultKey, "$resultKey");
        try {
            androidx.fragment.app.p activity = this$0.getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            Goal y02 = ((TemplateActivity) activity).y0();
            if (y02 != null) {
                long timeInSeconds = Utils.INSTANCE.getTimeInSeconds();
                Object obj = ((ArrayList) list.f23469u).get(0);
                kotlin.jvm.internal.i.f(obj, "list[0]");
                String str = (String) obj;
                Object obj2 = ((ArrayList) list.f23469u).get(1);
                kotlin.jvm.internal.i.f(obj2, "list[1]");
                String str2 = (String) obj2;
                Object obj3 = ((ArrayList) list.f23469u).get(2);
                kotlin.jvm.internal.i.f(obj3, "list[2]");
                String str3 = (String) obj3;
                Object obj4 = ((ArrayList) list.f23469u).get(3);
                kotlin.jvm.internal.i.f(obj4, "list[3]");
                String str4 = (String) obj4;
                Object obj5 = ((ArrayList) list.f23469u).get(4);
                kotlin.jvm.internal.i.f(obj5, "list[4]");
                String str5 = (String) obj5;
                Object obj6 = ((ArrayList) list.f23469u).get(5);
                kotlin.jvm.internal.i.f(obj6, "list[5]");
                Object obj7 = ((ArrayList) list.f23469u).get(6);
                kotlin.jvm.internal.i.f(obj7, "list[6]");
                ScreenResult19Model screenResult19Model = new ScreenResult19Model(timeInSeconds, str, str2, str3, str4, str5, (String) obj6, (String) obj7);
                if (!y02.getData().containsKey(resultKey)) {
                    y02.getData().put(resultKey, new ArrayList());
                }
                Object obj8 = y02.getData().get(resultKey);
                kotlin.jvm.internal.i.e(obj8, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult19Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult19Model> }");
                ((ArrayList) obj8).add(screenResult19Model);
                FirebasePersistence.getInstance().updateUserOnFirebase();
            }
            androidx.fragment.app.p activity2 = this$0.getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
            ((rr.a) activity2).t0();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this$0.f18224u, "exception in on click listener", e10);
        }
    }

    private final void b() {
        hr.p1 this$0 = (hr.p1) this.f26487v;
        TemplateActivity act = (TemplateActivity) this.f26488w;
        String resultKey = (String) this.f26489x;
        int i6 = hr.p1.C;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(act, "$act");
        kotlin.jvm.internal.i.g(resultKey, "$resultKey");
        try {
            androidx.fragment.app.p activity = this$0.getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            Goal y02 = ((TemplateActivity) activity).y0();
            if (y02 != null) {
                if (act.K) {
                    if (y02.getData().containsKey(resultKey)) {
                        Object obj = y02.getData().get(resultKey);
                        kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult21Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult21Model> }");
                        ArrayList arrayList = (ArrayList) obj;
                        arrayList.remove(arrayList.size() - 1);
                        arrayList.add(this$0.f18943v);
                        y02.getData().put(resultKey, arrayList);
                    } else {
                        y02.getData().put(resultKey, new ArrayList());
                        Object obj2 = y02.getData().get(resultKey);
                        kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult21Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult21Model> }");
                        ((ArrayList) obj2).add(this$0.f18943v);
                    }
                } else {
                    act.K = true;
                    if (!y02.getData().containsKey(resultKey)) {
                        y02.getData().put(resultKey, new ArrayList());
                    }
                    Object obj3 = y02.getData().get(resultKey);
                    kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult21Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult21Model> }");
                    ((ArrayList) obj3).add(this$0.f18943v);
                }
                FirebasePersistence.getInstance().updateUserOnFirebase();
            }
            androidx.fragment.app.p activity2 = this$0.getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
            ((rr.a) activity2).t0();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this$0.f18942u, "exception in on click listener", e10);
        }
    }

    private final void c() {
        t2 this$0 = (t2) this.f26487v;
        TemplateActivity act = (TemplateActivity) this.f26488w;
        ScreenResult30Model model = (ScreenResult30Model) this.f26489x;
        int i6 = t2.f19195w;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(act, "$act");
        kotlin.jvm.internal.i.g(model, "$model");
        try {
            androidx.fragment.app.p activity = this$0.getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            Goal y02 = ((TemplateActivity) activity).y0();
            if (y02 != null && (kotlin.jvm.internal.i.b(act.B0(), "s145") || kotlin.jvm.internal.i.b(act.B0(), "s148"))) {
                if (act.K) {
                    if (y02.getData().containsKey("result_30")) {
                        Object obj = y02.getData().get("result_30");
                        kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult30Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult30Model> }");
                        ArrayList arrayList = (ArrayList) obj;
                        arrayList.remove(arrayList.size() - 1);
                        arrayList.add(model);
                        y02.getData().put("result_30", arrayList);
                    } else {
                        y02.getData().put("result_30", new ArrayList());
                        Object obj2 = y02.getData().get("result_30");
                        kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult30Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult30Model> }");
                        ((ArrayList) obj2).add(model);
                    }
                } else {
                    act.K = true;
                    if (!y02.getData().containsKey("result_30")) {
                        y02.getData().put("result_30", new ArrayList());
                    }
                    Object obj3 = y02.getData().get("result_30");
                    kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult30Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult30Model> }");
                    ((ArrayList) obj3).add(model);
                }
            }
            FirebasePersistence.getInstance().updateUserOnFirebase();
            if (act.getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(act.getIntent().getStringExtra("source"), "goals")) {
                act.n0();
            } else {
                act.t0();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this$0.f19196u, "exception", e10);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        String str;
        boolean z12;
        boolean z13;
        boolean z14;
        MindfullnessModel mindfullnessModel;
        String str2;
        String str3;
        int i6 = this.f26486u;
        Object obj = this.f26489x;
        Object obj2 = this.f26488w;
        Object obj3 = this.f26487v;
        switch (i6) {
            case 0:
                EditText editText = (EditText) obj3;
                Dialog dialog = (Dialog) obj2;
                h this$0 = (h) obj;
                int i10 = h.L;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Editable text = editText.getText();
                if (text != null && !gv.n.B0(text)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    dialog.dismiss();
                    String obj4 = gv.r.i1(editText.getText().toString()).toString();
                    Locale locale = Locale.ROOT;
                    String upperCase = obj4.toUpperCase(locale);
                    kotlin.jvm.internal.i.f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    this$0.C = upperCase;
                    MonetizationViewModel M = this$0.M();
                    String upperCase2 = gv.r.i1(editText.getText().toString()).toString().toUpperCase(locale);
                    kotlin.jvm.internal.i.f(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    ta.v.H(kc.f.H(M), kotlinx.coroutines.o0.f23642c, 0, new qn.h(M, upperCase2, null), 2);
                    Bundle bundle = new Bundle();
                    bundle.putString("promo_code", editText.getText().toString());
                    gk.a.b(bundle, "plus_promo_code_click");
                    return;
                }
                Utils.INSTANCE.showCustomToast(this$0.K(), "Please enter coupon code");
                return;
            case 1:
                EditText editText2 = (EditText) obj3;
                Dialog dialog2 = (Dialog) obj2;
                s0 this$02 = (s0) obj;
                int i11 = s0.G;
                kotlin.jvm.internal.i.g(dialog2, "$dialog");
                kotlin.jvm.internal.i.g(this$02, "this$0");
                Editable text2 = editText2.getText();
                if (text2 != null && !gv.n.B0(text2)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    dialog2.dismiss();
                    this$02.F().Q(true);
                    on.b bVar = new on.b();
                    String obj5 = gv.r.i1(editText2.getText().toString()).toString();
                    Locale ROOT = Locale.ROOT;
                    kotlin.jvm.internal.i.f(ROOT, "ROOT");
                    String upperCase3 = obj5.toUpperCase(ROOT);
                    kotlin.jvm.internal.i.f(upperCase3, "this as java.lang.String).toUpperCase(locale)");
                    bVar.b(upperCase3, new r0(this$02, editText2));
                    return;
                }
                Utils.INSTANCE.showCustomToast(this$02.getActivity(), "Please enter coupon code");
                return;
            case 2:
                Dialog dialog3 = (Dialog) obj2;
                Activity activity = (Activity) obj3;
                Bundle analyticsBundle = (Bundle) obj;
                kotlin.jvm.internal.i.g(dialog3, "$dialog");
                kotlin.jvm.internal.i.g(activity, "$activity");
                kotlin.jvm.internal.i.g(analyticsBundle, "$analyticsBundle");
                dialog3.dismiss();
                activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + SubscriptionPersistence.INSTANCE.getSubscriptionType() + "&package=" + activity.getPackageName())));
                gk.a.b(analyticsBundle, "grace_hold_dialog_update_click");
                activity.finish();
                return;
            case 3:
                View this_apply = (View) obj3;
                TherapistPackagesModel it = (TherapistPackagesModel) obj2;
                ao.b this$03 = (ao.b) obj;
                kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                kotlin.jvm.internal.i.g(it, "$it");
                kotlin.jvm.internal.i.g(this$03, "this$0");
                String str4 = gk.a.f16573a;
                Bundle f = defpackage.e.f("source", "app_onboarding_matching", "action_source", "tnp_card_click");
                boolean z15 = this$03.f3362y;
                if (z15) {
                    str = "therapy";
                } else {
                    str = "psychiatry";
                }
                f.putString("flow", str);
                if (z15) {
                    f.putString("therapist_name", it.getFirstname() + ' ' + it.getLastname());
                    f.putString("therapist_uuid", it.getUuid());
                } else {
                    f.putString("psychiatrist_name", it.getFirstname() + ' ' + it.getLastname());
                    f.putString("psychiatrist_uuid", it.getUuid());
                }
                f.putString("platform", "android_app");
                hs.k kVar = hs.k.f19476a;
                gk.a.b(f, "therapy_psychiatry_video_click");
                Context context = this_apply.getContext();
                Intent putExtra = new Intent(this_apply.getContext(), ProviderVideoActivity.class).putExtra("pro_video_url", it.getVideo()).putExtra("isTherapy", z15).putExtra("isExpertCare", true);
                context.startActivity(putExtra.putExtra("provider_name", it.getFirstname() + ' ' + it.getLastname()).putExtra("provider_uuid", it.getUuid()));
                return;
            case 4:
                ResetProgrammeActivity this$04 = (ResetProgrammeActivity) obj3;
                String course = (String) obj2;
                View view2 = (View) obj;
                int i12 = ResetProgrammeActivity.f11615y;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                kotlin.jvm.internal.i.g(course, "$course");
                ArrayList<String> arrayList = this$04.f11617w;
                if (arrayList.contains(course)) {
                    arrayList.remove(course);
                    ((AppCompatImageView) view2.findViewById(R.id.rowCheck)).setImageResource(0);
                    ((AppCompatImageView) view2.findViewById(R.id.rowCheck)).setBackgroundResource(R.drawable.ic_empty_circle_grey);
                    return;
                }
                arrayList.add(course);
                ((AppCompatImageView) view2.findViewById(R.id.rowCheck)).setImageResource(R.drawable.ic_right);
                ((AppCompatImageView) view2.findViewById(R.id.rowCheck)).setImageTintList(ColorStateList.valueOf(g0.a.b(this$04, R.color.white)));
                ((AppCompatImageView) view2.findViewById(R.id.rowCheck)).setBackgroundResource(R.drawable.circle_blue);
                return;
            case 5:
                Dialog dialog4 = (Dialog) obj2;
                kp.e this$05 = (kp.e) obj3;
                Bundle analyticsBundle1 = (Bundle) obj;
                int i13 = kp.e.f23737z;
                kotlin.jvm.internal.i.g(dialog4, "$dialog");
                kotlin.jvm.internal.i.g(this$05, "this$0");
                kotlin.jvm.internal.i.g(analyticsBundle1, "$analyticsBundle1");
                dialog4.dismiss();
                this$05.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + SubscriptionPersistence.INSTANCE.getSubscriptionType() + "&package=" + this$05.requireActivity().getPackageName())));
                gk.a.b(analyticsBundle1, "grace_hold_dialog_update_click");
                this$05.requireActivity().finish();
                return;
            case 6:
                Dialog dialog5 = (Dialog) obj2;
                kp.l this$06 = (kp.l) obj3;
                Bundle analyticsBundle12 = (Bundle) obj;
                int i14 = kp.l.f23764z;
                kotlin.jvm.internal.i.g(dialog5, "$dialog");
                kotlin.jvm.internal.i.g(this$06, "this$0");
                kotlin.jvm.internal.i.g(analyticsBundle12, "$analyticsBundle1");
                dialog5.dismiss();
                this$06.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + SubscriptionPersistence.INSTANCE.getSubscriptionType() + "&package=" + this$06.requireActivity().getPackageName())));
                gk.a.b(analyticsBundle12, "grace_hold_dialog_update_click");
                this$06.requireActivity().finish();
                return;
            case 7:
                fq.b0 this$07 = (fq.b0) obj3;
                String it2 = (String) obj2;
                int i15 = fq.b0.f15662z;
                kotlin.jvm.internal.i.g(this$07, "this$0");
                kotlin.jvm.internal.i.g(it2, "$it");
                ((RobertoEditText) this$07._$_findCachedViewById(R.id.etS12Edit)).setText("");
                this$07.K(it2);
                ((LinearLayout) this$07._$_findCachedViewById(R.id.llSearch)).removeView((View) obj);
                return;
            case 8:
                fq.g0 this$08 = (fq.g0) obj3;
                kotlin.jvm.internal.x questions = (kotlin.jvm.internal.x) obj2;
                T8Activity act = (T8Activity) obj;
                int i16 = fq.g0.f15712w;
                kotlin.jvm.internal.i.g(this$08, "this$0");
                kotlin.jvm.internal.i.g(questions, "$questions");
                kotlin.jvm.internal.i.g(act, "$act");
                String valueOf = String.valueOf(((RobertoEditText) this$08._$_findCachedViewById(R.id.editText1)).getText());
                String valueOf2 = String.valueOf(((RobertoEditText) this$08._$_findCachedViewById(R.id.editText2)).getText());
                String valueOf3 = String.valueOf(((RobertoEditText) this$08._$_findCachedViewById(R.id.editText3)).getText());
                if (valueOf.length() == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    if (valueOf2.length() == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        if (valueOf3.length() == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (!z14) {
                            androidx.fragment.app.p activity2 = this$08.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T8Activity");
                            ((T8Activity) activity2).B.put("headings", questions.f23469u);
                            HashMap<String, Object> hashMap = act.B;
                            hashMap.put("list", ca.a.k(valueOf, valueOf2, valueOf3));
                            hashMap.put("s25_user_list", ca.a.k(valueOf, valueOf2, valueOf3));
                            act.s0(new fq.m());
                            return;
                        }
                    }
                }
                Utils utils = Utils.INSTANCE;
                androidx.fragment.app.p activity3 = this$08.getActivity();
                String string = this$08.getString(R.string.fill_all_three);
                kotlin.jvm.internal.i.f(string, "getString(R.string.fill_all_three)");
                utils.showCustomToast(activity3, string);
                return;
            case 9:
                fq.y0 this$09 = (fq.y0) obj3;
                String it3 = (String) obj2;
                int i17 = fq.y0.O;
                kotlin.jvm.internal.i.g(this$09, "this$0");
                kotlin.jvm.internal.i.g(it3, "$it");
                ((RobertoEditText) this$09._$_findCachedViewById(R.id.editTextAdd)).setText("");
                this$09.f15827v.add(it3);
                this$09.J(it3);
                ((LinearLayout) this$09._$_findCachedViewById(R.id.linearLayout2)).removeView((View) obj);
                return;
            case 10:
                fq.y0 this$010 = (fq.y0) obj3;
                RelativeLayout card = (RelativeLayout) obj2;
                String tt2 = (String) obj;
                int i18 = fq.y0.O;
                kotlin.jvm.internal.i.g(this$010, "this$0");
                kotlin.jvm.internal.i.g(card, "$card");
                kotlin.jvm.internal.i.g(tt2, "$tt");
                this$010.a0(card);
                this$010.I = tt2;
                return;
            case 11:
                fq.a1 this$011 = (fq.a1) obj3;
                RelativeLayout row = (RelativeLayout) obj2;
                String text3 = (String) obj;
                int i19 = fq.a1.f15652z;
                kotlin.jvm.internal.i.g(this$011, "this$0");
                kotlin.jvm.internal.i.g(row, "$row");
                kotlin.jvm.internal.i.g(text3, "$text");
                try {
                    this$011.M(row);
                    this$011.f15654v = text3;
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$011.f15653u, "exception", e10);
                    return;
                }
            case 12:
                fq.a1 this$012 = (fq.a1) obj3;
                String it4 = (String) obj2;
                int i20 = fq.a1.f15652z;
                kotlin.jvm.internal.i.g(this$012, "this$0");
                kotlin.jvm.internal.i.g(it4, "$it");
                ((RobertoEditText) this$012._$_findCachedViewById(R.id.etAddNew)).setText("");
                this$012.J(it4);
                ((LinearLayout) this$012._$_findCachedViewById(R.id.llSearch)).removeView((View) obj);
                return;
            case 13:
                oq.m this$013 = (oq.m) obj3;
                String optionText = (String) obj;
                Dialog dialog6 = (Dialog) obj2;
                int i21 = oq.m.B;
                kotlin.jvm.internal.i.g(this$013, "this$0");
                kotlin.jvm.internal.i.g(optionText, "$optionText");
                kotlin.jvm.internal.i.g(dialog6, "$dialog");
                this$013.O(optionText, true, false);
                this$013.f27748x.add(optionText);
                this$013.f27749y.remove(optionText);
                dialog6.dismiss();
                return;
            case 14:
                pq.b this$014 = (pq.b) obj3;
                String optionText2 = (String) obj;
                Dialog dialog7 = (Dialog) obj2;
                int i22 = pq.b.C;
                kotlin.jvm.internal.i.g(this$014, "this$0");
                kotlin.jvm.internal.i.g(optionText2, "$optionText");
                kotlin.jvm.internal.i.g(dialog7, "$dialog");
                this$014.K(optionText2, true);
                this$014.A.put(optionText2, Boolean.TRUE);
                dialog7.dismiss();
                return;
            case 15:
                pq.b this$015 = (pq.b) obj3;
                Chip newChip = (Chip) obj2;
                String name = (String) obj;
                int i23 = pq.b.C;
                kotlin.jvm.internal.i.g(this$015, "this$0");
                kotlin.jvm.internal.i.g(newChip, "$newChip");
                kotlin.jvm.internal.i.g(name, "$name");
                ((ChipGroup) this$015._$_findCachedViewById(R.id.chipGroupAdd)).removeView(newChip);
                if (kotlin.jvm.internal.i.b(newChip.getText().toString(), this$015.f28764v)) {
                    this$015.f28764v = "";
                    this$015.J(false);
                }
                if (this$015.f28766x.contains(name)) {
                    this$015.A.put(name, Boolean.FALSE);
                    return;
                }
                return;
            case 16:
                pq.m this$016 = (pq.m) obj3;
                String optionText3 = (String) obj;
                Dialog dialog8 = (Dialog) obj2;
                int i24 = pq.m.C;
                kotlin.jvm.internal.i.g(this$016, "this$0");
                kotlin.jvm.internal.i.g(optionText3, "$optionText");
                kotlin.jvm.internal.i.g(dialog8, "$dialog");
                this$016.K(optionText3);
                this$016.A.put(optionText3, Boolean.TRUE);
                dialog8.dismiss();
                return;
            case 17:
                pq.x this$017 = (pq.x) obj3;
                String optionText4 = (String) obj;
                Dialog dialog9 = (Dialog) obj2;
                int i25 = pq.x.A;
                kotlin.jvm.internal.i.g(this$017, "this$0");
                kotlin.jvm.internal.i.g(optionText4, "$optionText");
                kotlin.jvm.internal.i.g(dialog9, "$dialog");
                this$017.J(optionText4);
                dialog9.dismiss();
                this$017.f28836y.put(optionText4, Boolean.TRUE);
                return;
            case 18:
                pq.x this$018 = (pq.x) obj3;
                View view3 = (View) obj2;
                String optionText5 = (String) obj;
                int i26 = pq.x.A;
                kotlin.jvm.internal.i.g(this$018, "this$0");
                kotlin.jvm.internal.i.g(optionText5, "$optionText");
                this$018.K(((RobertoTextView) view3.findViewById(R.id.rowTitle)).getText().toString());
                ((RadioButton) view3.findViewById(R.id.radioToggle)).setChecked(true);
                ((RadioButton) view3.findViewById(R.id.radioToggle)).setButtonTintList(ColorStateList.valueOf(g0.a.b(this$018.requireActivity(), R.color.sea)));
                this$018.f28833v = optionText5;
                return;
            case 19:
                qq.z this$019 = (qq.z) obj3;
                String i27 = (String) obj2;
                View view4 = (View) obj;
                int i28 = qq.z.f30091y;
                kotlin.jvm.internal.i.g(this$019, "this$0");
                kotlin.jvm.internal.i.g(i27, "$i");
                androidx.fragment.app.p activity4 = this$019.getActivity();
                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                if (((DepressionPleasurableActivity) activity4).B.contains(i27)) {
                    ((AppCompatImageView) view4.findViewById(R.id.rowCheck)).setBackgroundResource(R.color.transparent);
                    ((AppCompatImageView) view4.findViewById(R.id.rowCheck)).setImageResource(R.drawable.circle_hollow_grey_high_contrast);
                    androidx.fragment.app.p activity5 = this$019.getActivity();
                    kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                    ((DepressionPleasurableActivity) activity5).B.remove(i27);
                } else {
                    ((AppCompatImageView) view4.findViewById(R.id.rowCheck)).setBackgroundResource(R.drawable.circle_blue);
                    ((AppCompatImageView) view4.findViewById(R.id.rowCheck)).setImageResource(R.drawable.ic_round_check);
                    androidx.fragment.app.p activity6 = this$019.getActivity();
                    kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                    ((DepressionPleasurableActivity) activity6).B.add(i27);
                    androidx.fragment.app.p activity7 = this$019.getActivity();
                    kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                    if (((DepressionPleasurableActivity) activity7).B.size() == 1) {
                        this$019.J(false);
                    }
                }
                androidx.fragment.app.p activity8 = this$019.getActivity();
                kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                if (((DepressionPleasurableActivity) activity8).B.isEmpty() && !this$019.f30092u) {
                    ((RobertoButton) this$019._$_findCachedViewById(R.id.continueCTA)).setBackgroundResource(R.drawable.button_border_gray);
                    return;
                } else {
                    ((RobertoButton) this$019._$_findCachedViewById(R.id.continueCTA)).setBackgroundResource(R.drawable.button_dark_grey_fill);
                    return;
                }
            case 20:
                rq.g this$020 = (rq.g) obj3;
                String optionText6 = (String) obj;
                Dialog dialog10 = (Dialog) obj2;
                int i29 = rq.g.B;
                kotlin.jvm.internal.i.g(this$020, "this$0");
                kotlin.jvm.internal.i.g(optionText6, "$optionText");
                kotlin.jvm.internal.i.g(dialog10, "$dialog");
                this$020.O(optionText6, true, false);
                this$020.f30937w.add(optionText6);
                this$020.f30938x.remove(optionText6);
                dialog10.dismiss();
                return;
            case 21:
                sq.r this$021 = (sq.r) obj3;
                String optionText7 = (String) obj;
                Dialog dialog11 = (Dialog) obj2;
                int i30 = sq.r.B;
                kotlin.jvm.internal.i.g(this$021, "this$0");
                kotlin.jvm.internal.i.g(optionText7, "$optionText");
                kotlin.jvm.internal.i.g(dialog11, "$dialog");
                this$021.J(optionText7);
                dialog11.dismiss();
                return;
            case 22:
                sq.r this$022 = (sq.r) obj3;
                View view5 = (View) obj2;
                String optionText8 = (String) obj;
                int i31 = sq.r.B;
                kotlin.jvm.internal.i.g(this$022, "this$0");
                kotlin.jvm.internal.i.g(optionText8, "$optionText");
                this$022.K(((RobertoTextView) view5.findViewById(R.id.rowTitle)).getText().toString());
                ((RadioButton) view5.findViewById(R.id.radioToggle)).setChecked(true);
                ((RadioButton) view5.findViewById(R.id.radioToggle)).setButtonTintList(ColorStateList.valueOf(g0.a.b(this$022.requireActivity(), R.color.sea)));
                this$022.f31911v = optionText8;
                return;
            case 23:
                yq.f this$023 = (yq.f) obj3;
                String str5 = (String) obj2;
                Course course2 = (Course) obj;
                int i32 = yq.f.R;
                kotlin.jvm.internal.i.g(this$023, "this$0");
                if (this$023.isAdded()) {
                    try {
                        Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.activity_dialog, this$023.getActivity(), R.style.Theme_Dialog_Fullscreen);
                        Window window = styledDialog.getWindow();
                        kotlin.jvm.internal.i.d(window);
                        window.setLayout(-1, -1);
                        Window window2 = styledDialog.getWindow();
                        kotlin.jvm.internal.i.d(window2);
                        window2.getAttributes().windowAnimations = R.style.DialogSlideInAndSlideBackOut;
                        Bundle arguments = this$023.getArguments();
                        Iterator<MindfullnessModel> it5 = yq.g.J().iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                mindfullnessModel = it5.next();
                                if (kotlin.jvm.internal.i.b(mindfullnessModel.getId(), str5)) {
                                }
                            } else {
                                mindfullnessModel = null;
                            }
                        }
                        if (arguments != null && arguments.containsKey(Constants.API_COURSE_LINK)) {
                            String string2 = arguments.getString(Constants.API_COURSE_LINK);
                            if (kotlin.jvm.internal.i.b(course2.getCourseName(), Constants.COURSE_DEPRESSION) && kotlin.jvm.internal.i.b(string2, Constants.SCREEN_T2A)) {
                                mindfullnessModel = new MindfullnessModel(Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_FOCUSSED_MEDITATION, "Focussed Meditation", R.drawable.deep_breathing, "Focussed Meditation");
                            } else if (kotlin.jvm.internal.i.b(course2.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(string2, Constants.SCREEN_T2A)) {
                                mindfullnessModel = new MindfullnessModel(Constants.DAILY_ACTIVITY_GOAL_ID_HAPPINESS_ALTERNATE_BREATHING, "Alternate Breathing", R.drawable.deep_breathing, "Alternate Breathing");
                            }
                        }
                        ((ImageView) styledDialog.findViewById(R.id.impact_img)).setVisibility(8);
                        RobertoTextView robertoTextView = (RobertoTextView) styledDialog.findViewById(R.id.txt_title);
                        if (mindfullnessModel != null) {
                            str2 = mindfullnessModel.getTitle();
                        } else {
                            str2 = null;
                        }
                        robertoTextView.setText(str2);
                        RobertoTextView robertoTextView2 = (RobertoTextView) styledDialog.findViewById(R.id.txt_desc);
                        if (mindfullnessModel != null) {
                            str3 = mindfullnessModel.getDesc();
                        } else {
                            str3 = null;
                        }
                        robertoTextView2.setText(str3);
                        ((ImageView) styledDialog.findViewById(R.id.cancel)).setOnClickListener(new nq.n(styledDialog, 14));
                        styledDialog.show();
                        return;
                    } catch (Exception e11) {
                        LogHelper.INSTANCE.e(this$023.f38899u, e11);
                        return;
                    }
                }
                return;
            case 24:
                hr.j0 this$024 = (hr.j0) obj3;
                TemplateActivity act2 = (TemplateActivity) obj2;
                ScreenResult14Model model = (ScreenResult14Model) obj;
                int i33 = hr.j0.f18606y;
                kotlin.jvm.internal.i.g(this$024, "this$0");
                kotlin.jvm.internal.i.g(act2, "$act");
                kotlin.jvm.internal.i.g(model, "$model");
                try {
                    androidx.fragment.app.p activity9 = this$024.getActivity();
                    kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    Goal y02 = ((TemplateActivity) activity9).y0();
                    if (y02 != null) {
                        if (act2.K) {
                            if (y02.getData().containsKey("result_14")) {
                                Object obj6 = y02.getData().get("result_14");
                                kotlin.jvm.internal.i.e(obj6, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult14Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult14Model> }");
                                ArrayList arrayList2 = (ArrayList) obj6;
                                arrayList2.remove(arrayList2.size() - 1);
                                arrayList2.add(model);
                                y02.getData().put("result_14", arrayList2);
                            } else {
                                y02.getData().put("result_14", new ArrayList());
                                Object obj7 = y02.getData().get("result_14");
                                kotlin.jvm.internal.i.e(obj7, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult14Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult14Model> }");
                                ((ArrayList) obj7).add(model);
                            }
                        } else {
                            act2.K = true;
                            if (!y02.getData().containsKey("result_14")) {
                                y02.getData().put("result_14", new ArrayList());
                            }
                            Object obj8 = y02.getData().get("result_14");
                            kotlin.jvm.internal.i.e(obj8, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult14Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult14Model> }");
                            ((ArrayList) obj8).add(model);
                        }
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                    }
                    androidx.fragment.app.p activity10 = this$024.getActivity();
                    kotlin.jvm.internal.i.e(activity10, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity10).t0();
                    return;
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e(this$024.f18607u, "Exception in set on click listener", e12);
                    return;
                }
            case 25:
                hr.v0 this$025 = (hr.v0) obj3;
                kotlin.jvm.internal.x list = (kotlin.jvm.internal.x) obj2;
                String resultKey = (String) obj;
                int i34 = hr.v0.f19269w;
                kotlin.jvm.internal.i.g(this$025, "this$0");
                kotlin.jvm.internal.i.g(list, "$list");
                kotlin.jvm.internal.i.g(resultKey, "$resultKey");
                try {
                    androidx.fragment.app.p activity11 = this$025.getActivity();
                    kotlin.jvm.internal.i.e(activity11, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    Goal y03 = ((TemplateActivity) activity11).y0();
                    if (y03 != null) {
                        long timeInSeconds = Utils.INSTANCE.getTimeInSeconds();
                        Object obj9 = ((ArrayList) list.f23469u).get(0);
                        kotlin.jvm.internal.i.f(obj9, "list[0]");
                        String str6 = (String) obj9;
                        Object obj10 = ((ArrayList) list.f23469u).get(1);
                        kotlin.jvm.internal.i.f(obj10, "list[1]");
                        String str7 = (String) obj10;
                        Object obj11 = ((ArrayList) list.f23469u).get(2);
                        kotlin.jvm.internal.i.f(obj11, "list[2]");
                        ScreenResult17Model screenResult17Model = new ScreenResult17Model(timeInSeconds, str6, str7, (String) obj11);
                        if (!y03.getData().containsKey(resultKey)) {
                            y03.getData().put(resultKey, new ArrayList());
                        }
                        Object obj12 = y03.getData().get(resultKey);
                        kotlin.jvm.internal.i.e(obj12, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult17Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult17Model> }");
                        ((ArrayList) obj12).add(screenResult17Model);
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                    }
                    androidx.fragment.app.p activity12 = this$025.getActivity();
                    kotlin.jvm.internal.i.e(activity12, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity12).x0();
                    return;
                } catch (Exception e13) {
                    LogHelper.INSTANCE.e(this$025.f19270u, "exception in on click listener", e13);
                    return;
                }
            case 26:
                a();
                return;
            case 27:
                hr.l1 this$026 = (hr.l1) obj3;
                String resultKey2 = (String) obj2;
                kotlin.jvm.internal.x list2 = (kotlin.jvm.internal.x) obj;
                int i35 = hr.l1.f18722w;
                kotlin.jvm.internal.i.g(this$026, "this$0");
                kotlin.jvm.internal.i.g(resultKey2, "$resultKey");
                kotlin.jvm.internal.i.g(list2, "$list");
                androidx.fragment.app.p activity13 = this$026.getActivity();
                kotlin.jvm.internal.i.e(activity13, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                Goal y04 = ((TemplateActivity) activity13).y0();
                if (y04 != null) {
                    y04.getData().put(resultKey2, list2.f23469u);
                }
                FirebasePersistence.getInstance().updateUserOnFirebase();
                androidx.fragment.app.p activity14 = this$026.getActivity();
                kotlin.jvm.internal.i.e(activity14, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity14).x0();
                return;
            case 28:
                b();
                return;
            default:
                c();
                return;
        }
    }

    public /* synthetic */ g(Dialog dialog, Object obj, Bundle bundle, int i6) {
        this.f26486u = i6;
        this.f26488w = dialog;
        this.f26487v = obj;
        this.f26489x = bundle;
    }

    public /* synthetic */ g(rr.b bVar, String str, Dialog dialog, int i6) {
        this.f26486u = i6;
        this.f26487v = bVar;
        this.f26489x = str;
        this.f26488w = dialog;
    }
}
