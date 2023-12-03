package hr;

import android.content.Intent;
import android.view.View;
import android.widget.RelativeLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.ScreenResult13Model;
import com.theinnerhour.b2b.model.ScreenResult15Model;
import com.theinnerhour.b2b.model.ScreenResult1Model;
import com.theinnerhour.b2b.model.ScreenResult26Model;
import com.theinnerhour.b2b.model.ScreenResult2Model;
import com.theinnerhour.b2b.model.ScreenResult3Model;
import com.theinnerhour.b2b.model.ScreenResult4Model;
import com.theinnerhour.b2b.model.ScreenResult7Model;
import com.theinnerhour.b2b.model.ScreenResult8Model;
import com.theinnerhour.b2b.model.ScreenResult9Model;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g0 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f18424u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ boolean f18425v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f18426w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f18427x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Object f18428y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Object f18429z;

    public /* synthetic */ g0(n0 n0Var, boolean z10, kotlin.jvm.internal.u uVar, String str, ScreenResult15Model screenResult15Model) {
        this.f18424u = 1;
        this.f18428y = n0Var;
        this.f18425v = z10;
        this.f18426w = uVar;
        this.f18427x = str;
        this.f18429z = screenResult15Model;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        rr.b z1Var;
        boolean z10;
        int i6 = this.f18424u;
        boolean z11 = this.f18425v;
        Object obj = this.f18429z;
        Object obj2 = this.f18427x;
        Object obj3 = this.f18428y;
        Object obj4 = this.f18426w;
        switch (i6) {
            case 0:
                kotlin.jvm.internal.u setGoal = (kotlin.jvm.internal.u) obj4;
                h0 this$0 = (h0) obj3;
                String goalId = (String) obj2;
                ScreenResult13Model model = (ScreenResult13Model) obj;
                int i10 = h0.f18483y;
                kotlin.jvm.internal.i.g(setGoal, "$setGoal");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(goalId, "$goalId");
                kotlin.jvm.internal.i.g(model, "$model");
                if (z11 && setGoal.f23466u) {
                    TemplateActivity templateActivity = this$0.f18486w;
                    if (templateActivity != null) {
                        templateActivity.K0(true);
                        fm.a aVar = (fm.a) this$0.f18485v.getValue();
                        aVar.f15174h0.e(this$0.getViewLifecycleOwner(), new pp.b(26, new i0(this$0)));
                        aVar.j(model, goalId);
                        return;
                    }
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
                TemplateActivity templateActivity2 = this$0.f18486w;
                if (templateActivity2 != null) {
                    if (templateActivity2.getIntent().hasExtra("source")) {
                        TemplateActivity templateActivity3 = this$0.f18486w;
                        if (templateActivity3 != null) {
                            if (r1.b0.c(templateActivity3, "source", "goals")) {
                                TemplateActivity templateActivity4 = this$0.f18486w;
                                if (templateActivity4 != null) {
                                    templateActivity4.n0();
                                    return;
                                } else {
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                }
                            }
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    }
                    TemplateActivity templateActivity5 = this$0.f18486w;
                    if (templateActivity5 != null) {
                        templateActivity5.t0();
                        return;
                    } else {
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
            case 1:
                n0 this$02 = (n0) obj3;
                kotlin.jvm.internal.u setGoal2 = (kotlin.jvm.internal.u) obj4;
                String goalId2 = (String) obj2;
                ScreenResult15Model model2 = (ScreenResult15Model) obj;
                int i11 = n0.C;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                kotlin.jvm.internal.i.g(setGoal2, "$setGoal");
                kotlin.jvm.internal.i.g(goalId2, "$goalId");
                kotlin.jvm.internal.i.g(model2, "$model");
                int i12 = this$02.f18859v + 1;
                this$02.f18859v = i12;
                if (i12 < this$02.f18861x.size()) {
                    this$02.K();
                    return;
                } else if (z11 && setGoal2.f23466u) {
                    TemplateActivity templateActivity6 = this$02.f18863z;
                    if (templateActivity6 != null) {
                        templateActivity6.K0(true);
                        fm.a aVar2 = (fm.a) this$02.A.getValue();
                        aVar2.f15174h0.e(this$02.getViewLifecycleOwner(), new m0(2, new o0(this$02)));
                        aVar2.j(model2, goalId2);
                        return;
                    }
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                } else {
                    TemplateActivity templateActivity7 = this$02.f18863z;
                    if (templateActivity7 != null) {
                        if (templateActivity7.getIntent().hasExtra("source")) {
                            TemplateActivity templateActivity8 = this$02.f18863z;
                            if (templateActivity8 != null) {
                                if (r1.b0.c(templateActivity8, "source", "goals")) {
                                    TemplateActivity templateActivity9 = this$02.f18863z;
                                    if (templateActivity9 != null) {
                                        templateActivity9.n0();
                                        return;
                                    } else {
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    }
                                }
                            } else {
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            }
                        }
                        TemplateActivity templateActivity10 = this$02.f18863z;
                        if (templateActivity10 != null) {
                            templateActivity10.t0();
                            return;
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    }
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            case 2:
                kotlin.jvm.internal.u setGoal3 = (kotlin.jvm.internal.u) obj4;
                ScreenResult1Model model3 = (ScreenResult1Model) obj3;
                i1 this$03 = (i1) obj;
                String goalId3 = (String) obj2;
                int i13 = i1.f18558z;
                kotlin.jvm.internal.i.g(setGoal3, "$setGoal");
                kotlin.jvm.internal.i.g(model3, "$model");
                kotlin.jvm.internal.i.g(this$03, "this$0");
                kotlin.jvm.internal.i.g(goalId3, "$goalId");
                if (z11) {
                    try {
                        if (setGoal3.f23466u) {
                            model3.setTitle(((RobertoTextView) this$03._$_findCachedViewById(R.id.textView9)).getText().toString());
                            TemplateActivity templateActivity11 = this$03.f18560v;
                            if (templateActivity11 != null) {
                                boolean z12 = templateActivity11.K;
                                androidx.lifecycle.m0 m0Var = this$03.f18561w;
                                if (z12) {
                                    templateActivity11.K0(true);
                                    fm.a aVar3 = (fm.a) m0Var.getValue();
                                    aVar3.f15174h0.e(this$03.getViewLifecycleOwner(), new m0(18, new j1(this$03)));
                                    aVar3.j(model3, goalId3);
                                    return;
                                }
                                templateActivity11.K0(true);
                                fm.a aVar4 = (fm.a) m0Var.getValue();
                                aVar4.f15177k0.e(this$03.getViewLifecycleOwner(), new m0(19, new k1(this$03)));
                                aVar4.h(model3, goalId3);
                                return;
                            }
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(this$03.f18559u, "exception", e10);
                        return;
                    }
                }
                androidx.fragment.app.p activity = this$03.getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (((TemplateActivity) activity).getIntent().hasExtra("source")) {
                    TemplateActivity templateActivity12 = this$03.f18560v;
                    if (templateActivity12 != null) {
                        if (kotlin.jvm.internal.i.b(templateActivity12.getIntent().getStringExtra("source"), "goals")) {
                            androidx.fragment.app.p activity2 = this$03.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity2).n0();
                            return;
                        }
                    } else {
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                }
                TemplateActivity templateActivity13 = this$03.f18560v;
                if (templateActivity13 != null) {
                    templateActivity13.t0();
                    return;
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            case 3:
                kotlin.jvm.internal.u saveResult = (kotlin.jvm.internal.u) obj4;
                h2 this$04 = (h2) obj3;
                String goalId4 = (String) obj2;
                ScreenResult26Model model4 = (ScreenResult26Model) obj;
                int i14 = h2.A;
                kotlin.jvm.internal.i.g(saveResult, "$saveResult");
                kotlin.jvm.internal.i.g(this$04, "this$0");
                kotlin.jvm.internal.i.g(goalId4, "$goalId");
                kotlin.jvm.internal.i.g(model4, "$model");
                if (z11 && saveResult.f23466u) {
                    TemplateActivity templateActivity14 = this$04.f18500v;
                    if (templateActivity14 != null) {
                        templateActivity14.K0(true);
                        fm.a aVar5 = (fm.a) this$04.f18501w.getValue();
                        aVar5.f15174h0.e(this$04.getViewLifecycleOwner(), new a2(4, new i2(this$04)));
                        aVar5.j(model4, goalId4);
                        return;
                    }
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
                androidx.fragment.app.p activity3 = this$04.getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (((TemplateActivity) activity3).getIntent().hasExtra("source")) {
                    TemplateActivity templateActivity15 = this$04.f18500v;
                    if (templateActivity15 != null) {
                        if (r1.b0.c(templateActivity15, "source", "goals")) {
                            androidx.fragment.app.p activity4 = this$04.getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity4).n0();
                            return;
                        }
                    } else {
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                }
                TemplateActivity templateActivity16 = this$04.f18500v;
                if (templateActivity16 != null) {
                    templateActivity16.t0();
                    return;
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            case 4:
                kotlin.jvm.internal.u setGoal4 = (kotlin.jvm.internal.u) obj4;
                q2 this$05 = (q2) obj3;
                String goalId5 = (String) obj2;
                ScreenResult2Model model5 = (ScreenResult2Model) obj;
                int i15 = q2.f18995z;
                kotlin.jvm.internal.i.g(setGoal4, "$setGoal");
                kotlin.jvm.internal.i.g(this$05, "this$0");
                kotlin.jvm.internal.i.g(goalId5, "$goalId");
                kotlin.jvm.internal.i.g(model5, "$model");
                if (z11) {
                    try {
                        if (setGoal4.f23466u) {
                            this$05.K().K0(true);
                            fm.a aVar6 = (fm.a) this$05.f18997v.getValue();
                            aVar6.f15174h0.e(this$05.getViewLifecycleOwner(), new a2(10, new r2(this$05)));
                            aVar6.j(model5, goalId5);
                            return;
                        }
                    } catch (Exception e11) {
                        LogHelper.INSTANCE.e(this$05.f18996u, "exception on click listener", e11);
                        return;
                    }
                }
                if (this$05.K().getIntent().hasExtra("source") && kotlin.jvm.internal.i.b(this$05.K().getIntent().getStringExtra("source"), "goals")) {
                    this$05.K().n0();
                } else {
                    this$05.K().t0();
                }
                return;
            case 5:
                kotlin.jvm.internal.u setGoal5 = (kotlin.jvm.internal.u) obj4;
                a3 this$06 = (a3) obj3;
                String goalId6 = (String) obj2;
                ScreenResult3Model model6 = (ScreenResult3Model) obj;
                int i16 = a3.f18139z;
                kotlin.jvm.internal.i.g(setGoal5, "$setGoal");
                kotlin.jvm.internal.i.g(this$06, "this$0");
                kotlin.jvm.internal.i.g(goalId6, "$goalId");
                kotlin.jvm.internal.i.g(model6, "$model");
                if (z11) {
                    try {
                        if (setGoal5.f23466u) {
                            TemplateActivity templateActivity17 = this$06.f18142w;
                            if (templateActivity17 != null) {
                                templateActivity17.K0(true);
                                TemplateActivity templateActivity18 = this$06.f18142w;
                                if (templateActivity18 != null) {
                                    if (kotlin.jvm.internal.i.b(templateActivity18.B0(), "r3")) {
                                        TemplateActivity templateActivity19 = this$06.f18142w;
                                        if (templateActivity19 != null) {
                                            templateActivity19.K = true;
                                            fm.a K = this$06.K();
                                            K.f15177k0.e(this$06.getViewLifecycleOwner(), new a2(16, new b3(this$06)));
                                            K.h(model6, goalId6);
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    }
                                    TemplateActivity templateActivity20 = this$06.f18142w;
                                    if (templateActivity20 != null) {
                                        if (templateActivity20.K) {
                                            fm.a K2 = this$06.K();
                                            K2.f15174h0.e(this$06.getViewLifecycleOwner(), new a2(17, new c3(this$06)));
                                            K2.j(model6, goalId6);
                                            return;
                                        }
                                        templateActivity20.K = true;
                                        fm.a K3 = this$06.K();
                                        K3.f15177k0.e(this$06.getViewLifecycleOwner(), new a2(18, new d3(this$06)));
                                        K3.h(model6, goalId6);
                                        return;
                                    }
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                }
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            }
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    } catch (Exception e12) {
                        LogHelper.INSTANCE.e(this$06.f18140u, e12);
                        return;
                    }
                }
                this$06.M();
                return;
            case 6:
                kotlin.jvm.internal.u setGoal6 = (kotlin.jvm.internal.u) obj4;
                h3 this$07 = (h3) obj3;
                String goalId7 = (String) obj2;
                ScreenResult4Model model7 = (ScreenResult4Model) obj;
                int i17 = h3.f18513z;
                kotlin.jvm.internal.i.g(setGoal6, "$setGoal");
                kotlin.jvm.internal.i.g(this$07, "this$0");
                kotlin.jvm.internal.i.g(goalId7, "$goalId");
                kotlin.jvm.internal.i.g(model7, "$model");
                if (z11) {
                    try {
                        if (setGoal6.f23466u) {
                            TemplateActivity templateActivity21 = this$07.f18516w;
                            if (templateActivity21 != null) {
                                templateActivity21.K0(true);
                                TemplateActivity templateActivity22 = this$07.f18516w;
                                if (templateActivity22 != null) {
                                    Intent intent = templateActivity22.getIntent();
                                    if (intent != null && intent.hasExtra("source")) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        TemplateActivity templateActivity23 = this$07.f18516w;
                                        if (templateActivity23 != null) {
                                            if (kotlin.jvm.internal.i.b(templateActivity23.getIntent().getStringExtra("source"), "goals")) {
                                                fm.a K4 = this$07.K();
                                                K4.f15174h0.e(this$07.getViewLifecycleOwner(), new a2(21, new i3(this$07)));
                                                K4.j(model7, goalId7);
                                                return;
                                            }
                                        } else {
                                            kotlin.jvm.internal.i.q("act");
                                        }
                                    }
                                    TemplateActivity templateActivity24 = this$07.f18516w;
                                    if (templateActivity24 != null) {
                                        if (templateActivity24.K) {
                                            fm.a K5 = this$07.K();
                                            K5.f15174h0.e(this$07.getViewLifecycleOwner(), new a2(22, new j3(this$07)));
                                            K5.j(model7, goalId7);
                                            return;
                                        }
                                        templateActivity24.K = true;
                                        fm.a K6 = this$07.K();
                                        K6.f15177k0.e(this$07.getViewLifecycleOwner(), new a2(23, new k3(this$07)));
                                        K6.h(model7, goalId7);
                                        return;
                                    }
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                }
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            }
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    } catch (Exception e13) {
                        LogHelper.INSTANCE.e(this$07.f18514u, "exception in on click listener", e13);
                        return;
                    }
                }
                this$07.M();
                return;
            case 7:
                kotlin.jvm.internal.u setGoal7 = (kotlin.jvm.internal.u) obj4;
                x3 this$08 = (x3) obj3;
                String goalId8 = (String) obj2;
                ScreenResult7Model model8 = (ScreenResult7Model) obj;
                int i18 = x3.f19371z;
                kotlin.jvm.internal.i.g(setGoal7, "$setGoal");
                kotlin.jvm.internal.i.g(this$08, "this$0");
                kotlin.jvm.internal.i.g(goalId8, "$goalId");
                kotlin.jvm.internal.i.g(model8, "$model");
                if (z11 && setGoal7.f23466u) {
                    TemplateActivity templateActivity25 = this$08.f19375x;
                    if (templateActivity25 != null) {
                        templateActivity25.K0(true);
                        fm.a aVar7 = (fm.a) this$08.f19373v.getValue();
                        aVar7.f15174h0.e(this$08.getViewLifecycleOwner(), new r3(3, new y3(this$08)));
                        aVar7.j(model8, goalId8);
                        return;
                    }
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
                androidx.fragment.app.p activity5 = this$08.getActivity();
                kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                ((rr.a) activity5).t0();
                return;
            case 8:
                kotlin.jvm.internal.u setGoal8 = (kotlin.jvm.internal.u) obj4;
                b4 this$09 = (b4) obj3;
                String goalId9 = (String) obj2;
                ScreenResult8Model model9 = (ScreenResult8Model) obj;
                int i19 = b4.f18187z;
                kotlin.jvm.internal.i.g(setGoal8, "$setGoal");
                kotlin.jvm.internal.i.g(this$09, "this$0");
                kotlin.jvm.internal.i.g(goalId9, "$goalId");
                kotlin.jvm.internal.i.g(model9, "$model");
                if (z11 && setGoal8.f23466u) {
                    TemplateActivity templateActivity26 = this$09.f18189v;
                    if (templateActivity26 != null) {
                        templateActivity26.K0(true);
                        fm.a aVar8 = (fm.a) this$09.f18190w.getValue();
                        aVar8.f15174h0.e(this$09.getViewLifecycleOwner(), new r3(6, new c4(this$09)));
                        aVar8.j(model9, goalId9);
                        return;
                    }
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
                TemplateActivity templateActivity27 = this$09.f18189v;
                if (templateActivity27 != null) {
                    if (templateActivity27.getIntent().hasExtra("source")) {
                        TemplateActivity templateActivity28 = this$09.f18189v;
                        if (templateActivity28 != null) {
                            if (r1.b0.c(templateActivity28, "source", "goals")) {
                                TemplateActivity templateActivity29 = this$09.f18189v;
                                if (templateActivity29 != null) {
                                    templateActivity29.n0();
                                    return;
                                } else {
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                }
                            }
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    }
                    TemplateActivity templateActivity30 = this$09.f18189v;
                    if (templateActivity30 != null) {
                        templateActivity30.t0();
                        return;
                    } else {
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
            case 9:
                kotlin.jvm.internal.u setGoal9 = (kotlin.jvm.internal.u) obj4;
                g4 this$010 = (g4) obj3;
                String goalId10 = (String) obj2;
                ScreenResult9Model model10 = (ScreenResult9Model) obj;
                int i20 = g4.f18438z;
                kotlin.jvm.internal.i.g(setGoal9, "$setGoal");
                kotlin.jvm.internal.i.g(this$010, "this$0");
                kotlin.jvm.internal.i.g(goalId10, "$goalId");
                kotlin.jvm.internal.i.g(model10, "$model");
                if (z11) {
                    try {
                        if (setGoal9.f23466u) {
                            TemplateActivity templateActivity31 = this$010.f18442x;
                            if (templateActivity31 != null) {
                                templateActivity31.K0(true);
                                fm.a aVar9 = (fm.a) this$010.f18440v.getValue();
                                aVar9.f15177k0.e(this$010.getViewLifecycleOwner(), new r3(9, new h4(this$010)));
                                aVar9.h(model10, goalId10);
                                return;
                            }
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    } catch (Exception e14) {
                        LogHelper.INSTANCE.e(this$010.f18439u, "exception", e14);
                        return;
                    }
                }
                TemplateActivity templateActivity32 = this$010.f18442x;
                if (templateActivity32 != null) {
                    templateActivity32.t0();
                    return;
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            default:
                ga this$011 = (ga) obj4;
                kotlin.jvm.internal.x selectedOptions = (kotlin.jvm.internal.x) obj3;
                RelativeLayout noneOfThese = (RelativeLayout) obj2;
                TemplateActivity act = (TemplateActivity) obj;
                int i21 = ga.f18476x;
                kotlin.jvm.internal.i.g(this$011, "this$0");
                kotlin.jvm.internal.i.g(selectedOptions, "$selectedOptions");
                kotlin.jvm.internal.i.g(noneOfThese, "$noneOfThese");
                kotlin.jvm.internal.i.g(act, "$act");
                try {
                    androidx.fragment.app.p activity6 = this$011.getActivity();
                    kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity6).F.put("list", new ArrayList((Collection) selectedOptions.f23469u));
                    if (z11) {
                        Object tag = noneOfThese.getTag();
                        kotlin.jvm.internal.i.e(tag, "null cannot be cast to non-null type kotlin.Boolean");
                        if (((Boolean) tag).booleanValue()) {
                            act.s0(new l6());
                        } else if (((HashSet) selectedOptions.f23469u).size() == 0) {
                            Utils utils = Utils.INSTANCE;
                            androidx.fragment.app.p activity7 = this$011.getActivity();
                            kotlin.jvm.internal.i.d(activity7);
                            String string = this$011.getString(R.string.select_option);
                            kotlin.jvm.internal.i.f(string, "getString(R.string.select_option)");
                            utils.showCustomToast(activity7, string);
                        } else if (((HashSet) selectedOptions.f23469u).size() > 3) {
                            Utils utils2 = Utils.INSTANCE;
                            androidx.fragment.app.p activity8 = this$011.getActivity();
                            kotlin.jvm.internal.i.d(activity8);
                            String string2 = this$011.getString(R.string.max_3_options_to_select);
                            kotlin.jvm.internal.i.f(string2, "getString(R.string.max_3_options_to_select)");
                            utils2.showCustomToast(activity8, string2);
                        } else {
                            androidx.fragment.app.p activity9 = this$011.getActivity();
                            kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            if (((TemplateActivity) activity9).W) {
                                z1Var = new d2();
                            } else {
                                z1Var = new z1();
                            }
                            act.s0(z1Var);
                        }
                    } else {
                        act.s0(new p6());
                    }
                    act.F.put("s99_user_data", selectedOptions.f23469u);
                    return;
                } catch (Exception e15) {
                    LogHelper.INSTANCE.e(this$011.f18477u, "exception", e15);
                    return;
                }
        }
    }

    public /* synthetic */ g0(ga gaVar, kotlin.jvm.internal.x xVar, boolean z10, RelativeLayout relativeLayout, TemplateActivity templateActivity) {
        this.f18424u = 10;
        this.f18426w = gaVar;
        this.f18428y = xVar;
        this.f18425v = z10;
        this.f18427x = relativeLayout;
        this.f18429z = templateActivity;
    }

    public /* synthetic */ g0(boolean z10, kotlin.jvm.internal.u uVar, ScreenResult1Model screenResult1Model, i1 i1Var, String str) {
        this.f18424u = 2;
        this.f18425v = z10;
        this.f18426w = uVar;
        this.f18428y = screenResult1Model;
        this.f18429z = i1Var;
        this.f18427x = str;
    }

    public /* synthetic */ g0(boolean z10, kotlin.jvm.internal.u uVar, rr.b bVar, String str, Serializable serializable, int i6) {
        this.f18424u = i6;
        this.f18425v = z10;
        this.f18426w = uVar;
        this.f18428y = bVar;
        this.f18427x = str;
        this.f18429z = serializable;
    }
}
