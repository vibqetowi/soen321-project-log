package hr;

import android.view.View;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.CompassionLetterModel;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenResult11Model;
import com.theinnerhour.b2b.model.ScreenResult23Model;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import hr.f9;
import hr.q9;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d9 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f18318u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f18319v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f18320w;

    public /* synthetic */ d9(Object obj, int i6, Object obj2) {
        this.f18318u = i6;
        this.f18319v = obj;
        this.f18320w = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        rr.b g1Var;
        HashMap<String, Object> data;
        String label;
        String label2;
        String label3;
        int i6 = this.f18318u;
        Object obj = this.f18320w;
        Object obj2 = this.f18319v;
        switch (i6) {
            case 0:
                f9 this$0 = (f9) obj2;
                HashMap params = (HashMap) obj;
                int i10 = f9.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(params, "$params");
                try {
                    if (this$0.P().Q) {
                        this$0.X();
                        return;
                    }
                    HashSet<String> hashSet = this$0.f18398v;
                    if (hashSet.isEmpty()) {
                        Utils.INSTANCE.showCustomToast(this$0.getActivity(), UtilFunKt.paramsMapToString(params.get("s84_error")));
                        return;
                    }
                    this$0.P().F.put("list", new ArrayList(hashSet));
                    this$0.P().F.put("S84_user_list", new ArrayList(hashSet));
                    this$0.P().F.put("userAdded", new ArrayList(hashSet));
                    if (this$0.P().W) {
                        this$0.f18401y.clear();
                        Iterator<String> it = hashSet.iterator();
                        while (it.hasNext()) {
                            this$0.f18401y.add(new ScreenResult23Model(Calendar.getInstance().getTimeInMillis() / 1000, it.next(), 0L));
                        }
                        androidx.fragment.app.p activity = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        TemplateModel templateModel = ((TemplateActivity) activity).f10547y;
                        if (templateModel != null && (label = templateModel.getLabel()) != null) {
                            fm.a Q = this$0.Q();
                            HashMap hashMap = new HashMap();
                            hashMap.put("list", this$0.f18401y);
                            hs.k kVar = hs.k.f19476a;
                            Q.j(hashMap, label);
                            Q.f15174h0.e(this$0.getViewLifecycleOwner(), new r3(27, new f9.e()));
                            return;
                        }
                        return;
                    }
                    androidx.fragment.app.p activity2 = this$0.getActivity();
                    kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    Goal y02 = ((TemplateActivity) activity2).y0();
                    String str = this$0.A;
                    if (y02 != null && y02.getData().containsKey(str)) {
                        y02.getData().put(str, new ArrayList());
                    }
                    this$0.f18401y.clear();
                    for (Iterator<String> it2 = hashSet.iterator(); it2.hasNext(); it2 = it2) {
                        this$0.f18401y.add(new ScreenResult23Model(Calendar.getInstance().getTimeInMillis() / 1000, it2.next(), 0L));
                    }
                    if (y02 != null && (data = y02.getData()) != null) {
                        data.put(str, this$0.f18401y);
                    }
                    FirebasePersistence.getInstance().updateUserOnFirebase();
                    if (this$0.P().getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(this$0.P().getIntent().getStringExtra("source"), "goals")) {
                        this$0.P().n0();
                        return;
                    } else {
                        this$0.P().t0();
                        return;
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f18397u, "exception in on click listener", e10);
                    return;
                }
            case 1:
                m9 this$02 = (m9) obj2;
                TemplateActivity act = (TemplateActivity) obj;
                int i11 = m9.f18846w;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                kotlin.jvm.internal.i.g(act, "$act");
                androidx.fragment.app.p activity3 = this$02.getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (((TemplateActivity) activity3).getIntent().hasExtra("source") && r1.b0.c(act, "source", "goals")) {
                    androidx.fragment.app.p activity4 = this$02.getActivity();
                    kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity4).Q = true;
                    androidx.fragment.app.p activity5 = this$02.getActivity();
                    kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity5).J0();
                    return;
                }
                act.onBackPressed();
                return;
            case 2:
                kotlin.jvm.internal.x selectedOptions = (kotlin.jvm.internal.x) obj2;
                n9 this$03 = (n9) obj;
                int i12 = n9.f18894w;
                kotlin.jvm.internal.i.g(selectedOptions, "$selectedOptions");
                kotlin.jvm.internal.i.g(this$03, "this$0");
                if (((ArrayList) selectedOptions.f23469u).size() == 0) {
                    Utils utils = Utils.INSTANCE;
                    androidx.fragment.app.p activity6 = this$03.getActivity();
                    kotlin.jvm.internal.i.d(activity6);
                    String string = this$03.getString(R.string.select_option);
                    kotlin.jvm.internal.i.f(string, "getString(R.string.select_option)");
                    utils.showCustomToast(activity6, string);
                    return;
                } else if (((ArrayList) selectedOptions.f23469u).size() > 2) {
                    Utils utils2 = Utils.INSTANCE;
                    androidx.fragment.app.p activity7 = this$03.getActivity();
                    kotlin.jvm.internal.i.d(activity7);
                    String string2 = this$03.getString(R.string.max_2_options_to_select);
                    kotlin.jvm.internal.i.f(string2, "getString(R.string.max_2_options_to_select)");
                    utils2.showCustomToast(activity7, string2);
                    return;
                } else {
                    androidx.fragment.app.p activity8 = this$03.getActivity();
                    kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity8).F.put("list", selectedOptions.f23469u);
                    androidx.fragment.app.p activity9 = this$03.getActivity();
                    kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                    ((rr.a) activity9).t0();
                    return;
                }
            case 3:
                TemplateActivity act2 = (TemplateActivity) obj2;
                q9 this$04 = (q9) obj;
                int i13 = q9.f19040z;
                kotlin.jvm.internal.i.g(act2, "$act");
                kotlin.jvm.internal.i.g(this$04, "this$0");
                boolean z10 = act2.W;
                String str2 = this$04.f19044x;
                if (z10) {
                    androidx.fragment.app.p activity10 = this$04.getActivity();
                    kotlin.jvm.internal.i.e(activity10, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    TemplateModel templateModel2 = ((TemplateActivity) activity10).f10547y;
                    androidx.lifecycle.m0 m0Var = this$04.f19043w;
                    if (templateModel2 != null && (label3 = templateModel2.getLabel()) != null) {
                        fm.a aVar = (fm.a) m0Var.getValue();
                        aVar.f15178l0.e(this$04.getViewLifecycleOwner(), new r3(29, new q9.a(aVar, label3)));
                        aVar.f15181o0.e(this$04.getViewLifecycleOwner(), new p9(0, new q9.b(act2, this$04, aVar, label3)));
                        aVar.f15174h0.e(this$04.getViewLifecycleOwner(), new p9(1, new q9.c(act2)));
                    }
                    TemplateModel templateModel3 = act2.f10547y;
                    if (templateModel3 != null && (label2 = templateModel3.getLabel()) != null) {
                        ((fm.a) m0Var.getValue()).m(label2, str2);
                        return;
                    }
                    return;
                }
                androidx.fragment.app.p activity11 = this$04.getActivity();
                kotlin.jvm.internal.i.e(activity11, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                Goal y03 = ((TemplateActivity) activity11).y0();
                kotlin.jvm.internal.i.d(y03);
                ScreenResult11Model gratitudeLetterMapToObject = UtilFunKt.gratitudeLetterMapToObject(y03.getData().get(str2));
                if (act2.K) {
                    ArrayList<CompassionLetterModel> gratitude_in_app_letter = gratitudeLetterMapToObject.getGratitude_in_app_letter();
                    gratitude_in_app_letter.remove(gratitude_in_app_letter.size() - 1);
                    androidx.fragment.app.p activity12 = this$04.getActivity();
                    kotlin.jvm.internal.i.e(activity12, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    Object obj3 = ((TemplateActivity) activity12).F.get("data");
                    kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.String");
                    gratitude_in_app_letter.add(new CompassionLetterModel((String) obj3));
                    y03.getData().put(str2, gratitude_in_app_letter);
                } else {
                    act2.K = true;
                    ArrayList<CompassionLetterModel> gratitude_in_app_letter2 = gratitudeLetterMapToObject.getGratitude_in_app_letter();
                    androidx.fragment.app.p activity13 = this$04.getActivity();
                    kotlin.jvm.internal.i.e(activity13, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    Object obj4 = ((TemplateActivity) activity13).F.get("data");
                    kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type kotlin.String");
                    gratitude_in_app_letter2.add(new CompassionLetterModel((String) obj4));
                }
                y03.getData().put(str2, gratitudeLetterMapToObject);
                FirebasePersistence.getInstance().updateUserOnFirebase();
                if (act2.getIntent().hasExtra("source") && r1.b0.c(act2, "source", "goals")) {
                    act2.n0();
                    return;
                } else {
                    act2.t0();
                    return;
                }
            case 4:
                TemplateActivity act3 = (TemplateActivity) obj2;
                kotlin.jvm.internal.x calendar = (kotlin.jvm.internal.x) obj;
                int i14 = s9.f19179w;
                kotlin.jvm.internal.i.g(act3, "$act");
                kotlin.jvm.internal.i.g(calendar, "$calendar");
                HashMap<String, Object> hashMap2 = act3.F;
                Object calendar2 = calendar.f23469u;
                kotlin.jvm.internal.i.f(calendar2, "calendar");
                hashMap2.put("s92_user_data", calendar2);
                if (kotlin.jvm.internal.i.b(act3.B0(), "s92")) {
                    Object calendar3 = calendar.f23469u;
                    kotlin.jvm.internal.i.f(calendar3, "calendar");
                    hashMap2.put("calendar", calendar3);
                    act3.s0(new w9());
                    return;
                } else if (kotlin.jvm.internal.i.b(act3.B0(), "s92-d")) {
                    Object calendar4 = calendar.f23469u;
                    kotlin.jvm.internal.i.f(calendar4, "calendar");
                    hashMap2.put("sleep_time", calendar4);
                    act3.s0(new k4());
                    return;
                } else {
                    return;
                }
            case 5:
                s9 this$05 = (s9) obj2;
                TemplateActivity act4 = (TemplateActivity) obj;
                int i15 = s9.f19179w;
                kotlin.jvm.internal.i.g(this$05, "this$0");
                kotlin.jvm.internal.i.g(act4, "$act");
                androidx.fragment.app.p activity14 = this$05.getActivity();
                kotlin.jvm.internal.i.e(activity14, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (((TemplateActivity) activity14).getIntent().hasExtra("source")) {
                    androidx.fragment.app.p activity15 = this$05.getActivity();
                    kotlin.jvm.internal.i.e(activity15, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    if (r1.b0.c((TemplateActivity) activity15, "source", "goals")) {
                        this$05.I();
                        return;
                    }
                }
                act4.onBackPressed();
                return;
            case 6:
                t9 this$06 = (t9) obj2;
                TemplateActivity act5 = (TemplateActivity) obj;
                int i16 = t9.f19215w;
                kotlin.jvm.internal.i.g(this$06, "this$0");
                kotlin.jvm.internal.i.g(act5, "$act");
                androidx.fragment.app.p activity16 = this$06.getActivity();
                kotlin.jvm.internal.i.e(activity16, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (((TemplateActivity) activity16).getIntent().hasExtra("source") && r1.b0.c(act5, "source", "goals")) {
                    androidx.fragment.app.p activity17 = this$06.getActivity();
                    kotlin.jvm.internal.i.e(activity17, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity17).Q = true;
                    act5.s0(new u9());
                    return;
                }
                act5.onBackPressed();
                return;
            default:
                ka this$07 = (ka) obj2;
                TemplateActivity act6 = (TemplateActivity) obj;
                int i17 = ka.A;
                kotlin.jvm.internal.i.g(this$07, "this$0");
                kotlin.jvm.internal.i.g(act6, "$act");
                androidx.fragment.app.p activity18 = this$07.getActivity();
                kotlin.jvm.internal.i.e(activity18, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (((TemplateActivity) activity18).getIntent().hasExtra("source") && r1.b0.c(act6, "source", "goals")) {
                    androidx.fragment.app.p activity19 = this$07.getActivity();
                    kotlin.jvm.internal.i.e(activity19, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity19).Q = true;
                    androidx.fragment.app.p activity20 = this$07.getActivity();
                    kotlin.jvm.internal.i.e(activity20, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    TemplateActivity templateActivity = (TemplateActivity) activity20;
                    if (act6.W) {
                        g1Var = new i1();
                    } else {
                        g1Var = new g1();
                    }
                    templateActivity.s0(g1Var);
                    return;
                }
                act6.onBackPressed();
                return;
        }
    }
}
