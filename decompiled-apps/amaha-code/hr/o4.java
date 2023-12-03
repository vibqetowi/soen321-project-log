package hr;

import android.app.TimePickerDialog;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.CustomDate;
import com.theinnerhour.b2b.model.GamificationModel;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenResult28Model;
import com.theinnerhour.b2b.model.TaskIn2Min;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import hr.g7;
import hr.h7;
import hr.q7;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class o4 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f18914u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f18915v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f18916w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f18917x;

    public /* synthetic */ o4(int i6, Object obj, Object obj2, Object obj3) {
        this.f18914u = i6;
        this.f18915v = obj;
        this.f18916w = obj2;
        this.f18917x = obj3;
    }

    private final void a() {
        ka this$0 = (ka) this.f18915v;
        View view = (View) this.f18916w;
        String it = (String) this.f18917x;
        int i6 = ka.A;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(it, "$it");
        String valueOf = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.input1)).getText());
        String valueOf2 = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.input2)).getText());
        String valueOf3 = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.input3)).getText());
        String lowerCase = gv.r.i1(valueOf).toString().toLowerCase();
        kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
        String lowerCase2 = gv.r.i1(((RobertoTextView) view.findViewById(R.id.tvLabelSearch)).getText().toString()).toString().toLowerCase();
        kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase()");
        if (!kotlin.jvm.internal.i.b(lowerCase, lowerCase2)) {
            String lowerCase3 = gv.r.i1(valueOf2).toString().toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase3, "this as java.lang.String).toLowerCase()");
            String lowerCase4 = gv.r.i1(((RobertoTextView) view.findViewById(R.id.tvLabelSearch)).getText().toString()).toString().toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase4, "this as java.lang.String).toLowerCase()");
            if (!kotlin.jvm.internal.i.b(lowerCase3, lowerCase4)) {
                String lowerCase5 = gv.r.i1(valueOf3).toString().toLowerCase();
                kotlin.jvm.internal.i.f(lowerCase5, "this as java.lang.String).toLowerCase()");
                String lowerCase6 = gv.r.i1(((RobertoTextView) view.findViewById(R.id.tvLabelSearch)).getText().toString()).toString().toLowerCase();
                kotlin.jvm.internal.i.f(lowerCase6, "this as java.lang.String).toLowerCase()");
                if (!kotlin.jvm.internal.i.b(lowerCase5, lowerCase6)) {
                    RobertoEditText robertoEditText = this$0.f18699v;
                    kotlin.jvm.internal.i.d(robertoEditText);
                    robertoEditText.setText(it);
                    androidx.fragment.app.p activity = this$0.getActivity();
                    kotlin.jvm.internal.i.d(activity);
                    Object systemService = activity.getSystemService("input_method");
                    kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    ((InputMethodManager) systemService).toggleSoftInput(1, 0);
                    this$0.I();
                    return;
                }
            }
        }
        Utils.INSTANCE.showCustomToast(this$0.getActivity(), "That has already been selected");
    }

    private final void b() {
        boolean z10;
        RobertoEditText input = (RobertoEditText) this.f18915v;
        ka this$0 = (ka) this.f18916w;
        ImageButton imgAdd = (ImageButton) this.f18917x;
        int i6 = ka.A;
        kotlin.jvm.internal.i.g(input, "$input");
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(imgAdd, "$imgAdd");
        if (String.valueOf(input.getText()).length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Utils utils = Utils.INSTANCE;
            androidx.fragment.app.p activity = this$0.getActivity();
            String string = this$0.getString(R.string.enter_text);
            kotlin.jvm.internal.i.f(string, "getString(R.string.enter_text)");
            utils.showCustomToast(activity, string);
            return;
        }
        imgAdd.setVisibility(8);
        this$0.I();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        rr.b f3Var;
        String str;
        ArrayList<GamificationModel> goalgamificationList;
        String str2;
        CustomDate customDate;
        String str3;
        String str4;
        boolean z12;
        int i6 = this.f18914u;
        CharSequence charSequence = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Object obj = this.f18917x;
        Object obj2 = this.f18916w;
        Object obj3 = this.f18915v;
        switch (i6) {
            case 0:
                p4 this$0 = (p4) obj3;
                HashMap params = (HashMap) obj2;
                TemplateActivity act = (TemplateActivity) obj;
                int i10 = p4.F;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(params, "$params");
                kotlin.jvm.internal.i.g(act, "$act");
                int i11 = this$0.D;
                if (i11 == 0) {
                    if (this$0.f18954v == null) {
                        Utils utils = Utils.INSTANCE;
                        androidx.fragment.app.p activity = this$0.getActivity();
                        String string = this$0.getString(R.string.select_option);
                        kotlin.jvm.internal.i.f(string, "getString(R.string.select_option)");
                        utils.showCustomToast(activity, string);
                        return;
                    }
                    this$0.D = i11 + 1;
                    if (this$0.C.size() > 0) {
                        ArrayList<String> arrayList = this$0.C;
                        RelativeLayout relativeLayout = this$0.f18954v;
                        kotlin.jvm.internal.i.d(relativeLayout);
                        arrayList.set(0, ((RobertoTextView) relativeLayout.findViewById(R.id.tvLabel)).getText().toString());
                    } else {
                        RelativeLayout relativeLayout2 = this$0.f18954v;
                        kotlin.jvm.internal.i.d(relativeLayout2);
                        this$0.C = ca.a.k(((RobertoTextView) relativeLayout2.findViewById(R.id.tvLabel)).getText().toString());
                    }
                    ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvS10Header)).setText(UtilFunKt.paramsMapToString(params.get("s10_donts_heading")));
                    this$0.J(this$0.f18958z, this$0.B);
                    return;
                } else if (i11 == 1) {
                    if (this$0.f18955w == null) {
                        Utils utils2 = Utils.INSTANCE;
                        androidx.fragment.app.p activity2 = this$0.getActivity();
                        String string2 = this$0.getString(R.string.select_option);
                        kotlin.jvm.internal.i.f(string2, "getString(R.string.select_option)");
                        utils2.showCustomToast(activity2, string2);
                        return;
                    }
                    if (this$0.C.size() > 1) {
                        ArrayList<String> arrayList2 = this$0.C;
                        RelativeLayout relativeLayout3 = this$0.f18955w;
                        kotlin.jvm.internal.i.d(relativeLayout3);
                        arrayList2.set(1, ((RobertoTextView) relativeLayout3.findViewById(R.id.tvLabel)).getText().toString());
                    } else {
                        RelativeLayout relativeLayout4 = this$0.f18954v;
                        kotlin.jvm.internal.i.d(relativeLayout4);
                        RelativeLayout relativeLayout5 = this$0.f18955w;
                        kotlin.jvm.internal.i.d(relativeLayout5);
                        this$0.C = ca.a.k(((RobertoTextView) relativeLayout4.findViewById(R.id.tvLabel)).getText().toString(), ((RobertoTextView) relativeLayout5.findViewById(R.id.tvLabel)).getText().toString());
                    }
                    HashMap<String, Object> hashMap = act.F;
                    RelativeLayout relativeLayout6 = this$0.f18954v;
                    kotlin.jvm.internal.i.d(relativeLayout6);
                    RelativeLayout relativeLayout7 = this$0.f18955w;
                    kotlin.jvm.internal.i.d(relativeLayout7);
                    hashMap.put("list", ca.a.k(((RobertoTextView) relativeLayout6.findViewById(R.id.tvLabel)).getText(), ((RobertoTextView) relativeLayout7.findViewById(R.id.tvLabel)).getText()));
                    hashMap.put("s10_user_list", this$0.C);
                    act.t0();
                    return;
                } else {
                    return;
                }
            case 1:
                i5 this$02 = (i5) obj3;
                String it = (String) obj2;
                int i12 = i5.A;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                kotlin.jvm.internal.i.g(it, "$it");
                ((RobertoEditText) this$02._$_findCachedViewById(R.id.etS12Edit)).setText("");
                this$02.K(it);
                ((LinearLayout) this$02._$_findCachedViewById(R.id.llSearch)).removeView((View) obj);
                return;
            case 2:
                g6 this$03 = (g6) obj3;
                HashMap params2 = (HashMap) obj2;
                TemplateActivity act2 = (TemplateActivity) obj;
                int i13 = g6.f18453w;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                kotlin.jvm.internal.i.g(params2, "$params");
                kotlin.jvm.internal.i.g(act2, "$act");
                Editable text = ((RobertoEditText) this$03._$_findCachedViewById(R.id.edt_letter)).getText();
                if (text != null && text.length() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    if (params2.containsKey("s17_error")) {
                        Utils.INSTANCE.showCustomToast(this$03.getActivity(), UtilFunKt.paramsMapToString(params2.get("s17_error")));
                        return;
                    } else {
                        Utils.INSTANCE.showCustomToast(this$03.getActivity(), "Please enter some text to proceed");
                        return;
                    }
                }
                HashMap<String, Object> hashMap2 = act2.F;
                hashMap2.put("data", String.valueOf(((RobertoEditText) this$03._$_findCachedViewById(R.id.edt_letter)).getText()));
                hashMap2.put("s17_user_data", String.valueOf(((RobertoEditText) this$03._$_findCachedViewById(R.id.edt_letter)).getText()));
                androidx.fragment.app.p activity3 = this$03.getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                ((rr.a) activity3).s0(new q9());
                return;
            case 3:
                h6 this$04 = (h6) obj3;
                HashMap params3 = (HashMap) obj2;
                TemplateActivity act3 = (TemplateActivity) obj;
                int i14 = h6.f18533w;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                kotlin.jvm.internal.i.g(params3, "$params");
                kotlin.jvm.internal.i.g(act3, "$act");
                Editable text2 = ((RobertoEditText) this$04._$_findCachedViewById(R.id.editText)).getText();
                if (text2 != null) {
                    charSequence = gv.r.i1(text2);
                }
                if (charSequence != null && charSequence.length() != 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    if (params3.containsKey("s18_error")) {
                        Utils utils3 = Utils.INSTANCE;
                        androidx.fragment.app.p activity4 = this$04.getActivity();
                        kotlin.jvm.internal.i.d(activity4);
                        utils3.showCustomToast(activity4, UtilFunKt.paramsMapToString(params3.get("s18_error")));
                        return;
                    }
                    Utils utils4 = Utils.INSTANCE;
                    androidx.fragment.app.p activity5 = this$04.getActivity();
                    kotlin.jvm.internal.i.d(activity5);
                    String string3 = this$04.getString(R.string.enter_text);
                    kotlin.jvm.internal.i.f(string3, "getString(R.string.enter_text)");
                    utils4.showCustomToast(activity5, string3);
                    return;
                }
                HashMap<String, Object> hashMap3 = act3.F;
                hashMap3.put("list", ca.a.k(String.valueOf(((RobertoEditText) this$04._$_findCachedViewById(R.id.editText)).getText())));
                hashMap3.put("s18_user_data", String.valueOf(((RobertoEditText) this$04._$_findCachedViewById(R.id.editText)).getText()));
                if (act3.W) {
                    f3Var = new h3();
                } else {
                    f3Var = new f3();
                }
                act3.s0(f3Var);
                return;
            case 4:
                s6 this$05 = (s6) obj3;
                HashMap params4 = (HashMap) obj2;
                TemplateActivity act4 = (TemplateActivity) obj;
                int i15 = s6.f19154z;
                kotlin.jvm.internal.i.g(this$05, "this$0");
                kotlin.jvm.internal.i.g(params4, "$params");
                kotlin.jvm.internal.i.g(act4, "$act");
                int i16 = this$05.f19156v;
                if (i16 == -1) {
                    Utils.INSTANCE.showCustomToast(this$05.getActivity(), UtilFunKt.paramsMapToString(params4.get("s23_error")));
                    return;
                }
                HashMap<String, Object> hashMap4 = act4.F;
                hashMap4.put("list", ca.a.k(this$05.f19158x.get(i16)));
                hashMap4.put("s23_user_list", this$05.f19158x);
                hashMap4.put("s23_user_data", Integer.valueOf(this$05.f19156v));
                act4.t0();
                return;
            case 5:
                RelativeLayout row = (RelativeLayout) obj3;
                z6 this$06 = (z6) obj2;
                TemplateActivity act5 = (TemplateActivity) obj;
                int i17 = z6.f19444w;
                kotlin.jvm.internal.i.g(row, "$row");
                kotlin.jvm.internal.i.g(this$06, "this$0");
                kotlin.jvm.internal.i.g(act5, "$act");
                androidx.fragment.app.p activity6 = this$06.getActivity();
                kotlin.jvm.internal.i.d(activity6);
                row.setBackgroundColor(g0.a.b(activity6, R.color.selected_row));
                androidx.fragment.app.p activity7 = this$06.getActivity();
                kotlin.jvm.internal.i.d(activity7);
                ((RobertoTextView) row.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity7, R.color.selected_row_text));
                act5.s0(new p6());
                return;
            case 6:
                g7 this$07 = (g7) obj3;
                kotlin.jvm.internal.u goalVisible = (kotlin.jvm.internal.u) obj2;
                kotlin.jvm.internal.u goalAddedBefore = (kotlin.jvm.internal.u) obj;
                int i18 = g7.J;
                kotlin.jvm.internal.i.g(this$07, "this$0");
                kotlin.jvm.internal.i.g(goalVisible, "$goalVisible");
                kotlin.jvm.internal.i.g(goalAddedBefore, "$goalAddedBefore");
                TemplateActivity templateActivity = this$07.D;
                if (templateActivity != null) {
                    if (templateActivity.W) {
                        this$07.H = this$07.f18460y.getTimeInMillis() / 1000;
                        TemplateActivity templateActivity2 = this$07.D;
                        if (templateActivity2 != null) {
                            TemplateModel templateModel = templateActivity2.f10547y;
                            if (templateModel != null) {
                                str = templateModel.getLabel();
                            } else {
                                str = null;
                            }
                            fd.f fVar = FirebaseAuth.getInstance().f;
                            if (fVar != null) {
                                str8 = fVar.j0();
                            }
                            String str9 = str8;
                            if (str != null && str9 != null) {
                                fm.a aVar = (fm.a) this$07.B.getValue();
                                aVar.D(str9, str, this$07.F, Boolean.valueOf(this$07.G), Long.valueOf(this$07.H));
                                aVar.f15173g0.e(this$07.getViewLifecycleOwner(), new r3(18, new g7.c(aVar, this$07)));
                                return;
                            }
                            androidx.fragment.app.p activity8 = this$07.getActivity();
                            kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity8).t0();
                            return;
                        }
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                    Goal y02 = templateActivity.y0();
                    if (y02 != null) {
                        y02.getScheduledDate().setTime(this$07.f18460y.getTimeInMillis() / 1000);
                        if (goalVisible.f23466u && !goalAddedBefore.f23466u) {
                            GamificationModel gamificationModel = new GamificationModel(10, Constants.GAMIFICATION_ADD_NEW_GOAL_TASK, defpackage.b.g(), Constants.getGoalName(y02.getGoalId()));
                            y02.getGoalgamificationList().add(gamificationModel);
                            FirebasePersistence.getInstance().addUserGamificationPointsToFirebase(gamificationModel);
                        } else {
                            FirebasePersistence.getInstance().updateUserOnFirebase();
                        }
                    }
                    TemplateActivity templateActivity3 = this$07.D;
                    if (templateActivity3 != null) {
                        new dk.h0(templateActivity3, this$07.f18460y.getTimeInMillis()).execute(new Void[0]);
                        androidx.fragment.app.p activity9 = this$07.getActivity();
                        kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                        ((rr.a) activity9).t0();
                        return;
                    }
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
            case 7:
                h7 this$08 = (h7) obj3;
                kotlin.jvm.internal.u goalVisible2 = (kotlin.jvm.internal.u) obj2;
                kotlin.jvm.internal.u goalAddedBefore2 = (kotlin.jvm.internal.u) obj;
                int i19 = h7.B;
                kotlin.jvm.internal.i.g(this$08, "this$0");
                kotlin.jvm.internal.i.g(goalVisible2, "$goalVisible");
                kotlin.jvm.internal.i.g(goalAddedBefore2, "$goalAddedBefore");
                TemplateActivity templateActivity4 = this$08.f18540y;
                if (templateActivity4 != null) {
                    if (templateActivity4.W) {
                        TemplateModel templateModel2 = templateActivity4.f10547y;
                        if (templateModel2 != null) {
                            str2 = templateModel2.getLabel();
                        } else {
                            str2 = null;
                        }
                        fd.f fVar2 = FirebaseAuth.getInstance().f;
                        if (fVar2 != null) {
                            str6 = fVar2.j0();
                        }
                        String str10 = str6;
                        if (str2 != null && str10 != null) {
                            fm.a aVar2 = (fm.a) this$08.f18537v.getValue();
                            aVar2.D(str10, str2, this$08.f18541z, null, null);
                            aVar2.f15173g0.e(this$08.getViewLifecycleOwner(), new r3(20, new h7.b()));
                            return;
                        }
                        androidx.fragment.app.p activity10 = this$08.getActivity();
                        kotlin.jvm.internal.i.e(activity10, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                        ((rr.a) activity10).t0();
                        return;
                    }
                    if (this$08.f18539x != null && goalVisible2.f23466u && !goalAddedBefore2.f23466u) {
                        String g5 = defpackage.b.g();
                        Goal goal = this$08.f18539x;
                        if (goal != null) {
                            str7 = goal.getGoalId();
                        }
                        GamificationModel gamificationModel2 = new GamificationModel(10, Constants.GAMIFICATION_ADD_NEW_GOAL_TASK, g5, Constants.getGoalName(str7));
                        Goal goal2 = this$08.f18539x;
                        if (goal2 != null && (goalgamificationList = goal2.getGoalgamificationList()) != null) {
                            goalgamificationList.add(gamificationModel2);
                        }
                        FirebasePersistence.getInstance().addUserGamificationPointsToFirebase(gamificationModel2);
                    } else {
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                    }
                    androidx.fragment.app.p activity11 = this$08.getActivity();
                    kotlin.jvm.internal.i.e(activity11, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                    ((rr.a) activity11).t0();
                    return;
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
            case 8:
                q7 this$09 = (q7) obj3;
                kotlin.jvm.internal.u goalVisible3 = (kotlin.jvm.internal.u) obj2;
                kotlin.jvm.internal.u goalAddedBefore3 = (kotlin.jvm.internal.u) obj;
                int i20 = q7.H;
                kotlin.jvm.internal.i.g(this$09, "this$0");
                kotlin.jvm.internal.i.g(goalVisible3, "$goalVisible");
                kotlin.jvm.internal.i.g(goalAddedBefore3, "$goalAddedBefore");
                TemplateActivity templateActivity5 = this$09.C;
                if (templateActivity5 != null) {
                    if (templateActivity5.W) {
                        this$09.F = this$09.f19027x.getTimeInMillis() / 1000;
                        TemplateActivity templateActivity6 = this$09.C;
                        if (templateActivity6 != null) {
                            TemplateModel templateModel3 = templateActivity6.f10547y;
                            if (templateModel3 != null) {
                                str4 = templateModel3.getLabel();
                            } else {
                                str4 = null;
                            }
                            fd.f fVar3 = FirebaseAuth.getInstance().f;
                            if (fVar3 != null) {
                                str5 = fVar3.j0();
                            }
                            String str11 = str5;
                            if (str4 != null && str11 != null) {
                                fm.a aVar3 = (fm.a) this$09.A.getValue();
                                aVar3.D(str11, str4, this$09.D, Boolean.valueOf(this$09.E), Long.valueOf(this$09.F));
                                aVar3.f15173g0.e(this$09.getViewLifecycleOwner(), new r3(25, new q7.c(aVar3, this$09)));
                                return;
                            }
                            androidx.fragment.app.p activity12 = this$09.getActivity();
                            kotlin.jvm.internal.i.e(activity12, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity12).t0();
                            return;
                        }
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                    Goal y03 = templateActivity5.y0();
                    if (y03 != null) {
                        customDate = y03.getScheduledDate();
                    } else {
                        customDate = null;
                    }
                    if (customDate != null) {
                        customDate.setTime(this$09.f19027x.getTimeInMillis() / 1000);
                    }
                    if (goalVisible3.f23466u && !goalAddedBefore3.f23466u) {
                        String g10 = defpackage.b.g();
                        TemplateActivity templateActivity7 = this$09.C;
                        if (templateActivity7 != null) {
                            Goal y04 = templateActivity7.y0();
                            if (y04 != null) {
                                str3 = y04.getGoalId();
                            } else {
                                str3 = null;
                            }
                            GamificationModel gamificationModel3 = new GamificationModel(10, Constants.GAMIFICATION_ADD_NEW_GOAL_TASK, g10, Constants.getGoalName(str3));
                            TemplateActivity templateActivity8 = this$09.C;
                            if (templateActivity8 != null) {
                                Goal y05 = templateActivity8.y0();
                                kotlin.jvm.internal.i.d(y05);
                                y05.getGoalgamificationList().add(gamificationModel3);
                                FirebasePersistence.getInstance().addUserGamificationPointsToFirebase(gamificationModel3);
                            } else {
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    } else {
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                    }
                    TemplateActivity templateActivity9 = this$09.C;
                    if (templateActivity9 != null) {
                        new dk.h0(templateActivity9, this$09.f19027x.getTimeInMillis()).execute(new Void[0]);
                        androidx.fragment.app.p activity13 = this$09.getActivity();
                        kotlin.jvm.internal.i.e(activity13, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                        ((rr.a) activity13).t0();
                        return;
                    }
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
            case 9:
                z7 this$010 = (z7) obj3;
                String it2 = (String) obj2;
                int i21 = z7.K;
                kotlin.jvm.internal.i.g(this$010, "this$0");
                kotlin.jvm.internal.i.g(it2, "$it");
                ((RobertoEditText) this$010._$_findCachedViewById(R.id.editTextAdd)).setText("");
                this$010.f19448v.add(it2);
                this$010.J(it2);
                ((LinearLayout) this$010._$_findCachedViewById(R.id.linearLayout2)).removeView((View) obj);
                return;
            case 10:
                z7 this$011 = (z7) obj3;
                RelativeLayout card = (RelativeLayout) obj2;
                String tt2 = (String) obj;
                int i22 = z7.K;
                kotlin.jvm.internal.i.g(this$011, "this$0");
                kotlin.jvm.internal.i.g(card, "$card");
                kotlin.jvm.internal.i.g(tt2, "$tt");
                this$011.g0(card);
                this$011.E = tt2;
                return;
            case 11:
                c8 this$012 = (c8) obj3;
                HashMap params5 = (HashMap) obj2;
                TemplateActivity act6 = (TemplateActivity) obj;
                int i23 = c8.f18261w;
                kotlin.jvm.internal.i.g(this$012, "this$0");
                kotlin.jvm.internal.i.g(params5, "$params");
                kotlin.jvm.internal.i.g(act6, "$act");
                if (String.valueOf(((RobertoEditText) this$012._$_findCachedViewById(R.id.editText1)).getText()).length() == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (params5.containsKey("s59b_error")) {
                        Utils utils5 = Utils.INSTANCE;
                        androidx.fragment.app.p activity14 = this$012.getActivity();
                        Object obj4 = params5.get("s59b_error");
                        kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type kotlin.String");
                        utils5.showCustomToast(activity14, (String) obj4);
                        return;
                    }
                    Utils utils6 = Utils.INSTANCE;
                    androidx.fragment.app.p activity15 = this$012.getActivity();
                    String string4 = this$012.getString(R.string.enter_text);
                    kotlin.jvm.internal.i.f(string4, "getString(R.string.enter_text)");
                    utils6.showCustomToast(activity15, string4);
                    return;
                }
                HashMap<String, Object> hashMap5 = act6.F;
                hashMap5.put("list", ca.a.k(String.valueOf(((RobertoEditText) this$012._$_findCachedViewById(R.id.editText1)).getText())));
                hashMap5.put("s59_user_data", String.valueOf(((RobertoEditText) this$012._$_findCachedViewById(R.id.editText1)).getText()));
                if (!kotlin.jvm.internal.i.b(act6.B0(), "s59-b") && !kotlin.jvm.internal.i.b(act6.B0(), "s59b")) {
                    if (kotlin.jvm.internal.i.b(act6.B0(), "s59-c")) {
                        act6.s0(new z6());
                        return;
                    } else {
                        act6.t0();
                        return;
                    }
                }
                act6.s0(new j8());
                return;
            case 12:
                f8 this$013 = (f8) obj3;
                RelativeLayout row2 = (RelativeLayout) obj2;
                String text3 = (String) obj;
                int i24 = f8.C;
                kotlin.jvm.internal.i.g(this$013, "this$0");
                kotlin.jvm.internal.i.g(row2, "$row");
                kotlin.jvm.internal.i.g(text3, "$text");
                try {
                    this$013.O(row2);
                    this$013.f18391v = text3;
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$013.f18390u, "exception", e10);
                    return;
                }
            case 13:
                f8 this$014 = (f8) obj3;
                String it3 = (String) obj2;
                int i25 = f8.C;
                kotlin.jvm.internal.i.g(this$014, "this$0");
                kotlin.jvm.internal.i.g(it3, "$it");
                ((RobertoEditText) this$014._$_findCachedViewById(R.id.etAddNew)).setText("");
                this$014.J(it3);
                ((LinearLayout) this$014._$_findCachedViewById(R.id.llSearch)).removeView((View) obj);
                return;
            case 14:
                o8 this$015 = (o8) obj3;
                String it4 = (String) obj2;
                int i26 = o8.H;
                kotlin.jvm.internal.i.g(this$015, "this$0");
                kotlin.jvm.internal.i.g(it4, "$it");
                ((RobertoEditText) this$015._$_findCachedViewById(R.id.etAddNew)).setText("");
                this$015.J(it4);
                ((LinearLayout) this$015._$_findCachedViewById(R.id.llSearch)).removeView((View) obj);
                return;
            case 15:
                TemplateActivity act7 = (TemplateActivity) obj;
                w8 this$016 = (w8) obj3;
                HashMap params6 = (HashMap) obj2;
                int i27 = w8.f19358y;
                kotlin.jvm.internal.i.g(act7, "$act");
                kotlin.jvm.internal.i.g(this$016, "this$0");
                kotlin.jvm.internal.i.g(params6, "$params");
                HashMap<String, Object> hashMap6 = act7.F;
                try {
                    HashSet<String> hashSet = this$016.f19360v;
                    hashMap6.put("list", new ArrayList(hashSet));
                    hashMap6.put("s77_user_list", new ArrayList(hashSet));
                    hashMap6.put("userAdded", new ArrayList(hashSet));
                    String str12 = this$016.f19361w;
                    int hashCode = str12.hashCode();
                    if (hashCode != 112275) {
                        if (hashCode != 3474628) {
                            if (hashCode == 3474654 && str12.equals("s122")) {
                                Object obj5 = hashMap6.get("3u_model");
                                kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult28Model");
                                ScreenResult28Model screenResult28Model = (ScreenResult28Model) obj5;
                                screenResult28Model.setList(new ArrayList<>(hashSet));
                                hashMap6.put("3u_model", screenResult28Model);
                                act7.s0(new t8());
                                return;
                            }
                            act7.t0();
                            return;
                        } else if (str12.equals("s117")) {
                            if (hashSet.size() > 0) {
                                act7.s0(new t8());
                            } else {
                                Utils.INSTANCE.showCustomToast(this$016.getActivity(), "Please add atleast one item");
                            }
                            return;
                        } else {
                            act7.t0();
                            return;
                        }
                    }
                    if (str12.equals("s77")) {
                        if (hashSet.size() > 0) {
                            act7.t0();
                        } else {
                            Utils.INSTANCE.showCustomToast(this$016.getActivity(), UtilFunKt.paramsMapToString(params6.get("s77_error")));
                        }
                        return;
                    }
                    act7.t0();
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$016.f19359u, "exception in on click listener", e11);
                    return;
                }
                LogHelper.INSTANCE.e(this$016.f19359u, "exception in on click listener", e11);
                return;
            case 16:
                HashMap temp = (HashMap) obj2;
                kotlin.jvm.internal.x urgentImportantList = (kotlin.jvm.internal.x) obj3;
                y8 this$017 = (y8) obj;
                int i28 = y8.f19422w;
                kotlin.jvm.internal.i.g(temp, "$temp");
                kotlin.jvm.internal.i.g(urgentImportantList, "$urgentImportantList");
                kotlin.jvm.internal.i.g(this$017, "this$0");
                temp.put("s78_user_list", urgentImportantList.f23469u);
                Context context = this$017.getContext();
                kotlin.jvm.internal.i.d(context);
                androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$017._$_findCachedViewById(R.id.ivEllipses));
                a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                a1Var.f1346d = new hd.a(12, this$017);
                a1Var.b();
                return;
            case 17:
                TaskIn2Min tt3 = (TaskIn2Min) obj3;
                b9 this$018 = (b9) obj2;
                kotlin.jvm.internal.x urgentImportantList2 = (kotlin.jvm.internal.x) obj;
                int i29 = b9.f18209w;
                kotlin.jvm.internal.i.g(tt3, "$tt");
                kotlin.jvm.internal.i.g(this$018, "this$0");
                kotlin.jvm.internal.i.g(urgentImportantList2, "$urgentImportantList");
                if (tt3.getIn2Min()) {
                    View childAt = ((LinearLayout) this$018._$_findCachedViewById(R.id.llS82List)).getChildAt(((ArrayList) urgentImportantList2.f23469u).indexOf(tt3));
                    androidx.fragment.app.p activity16 = this$018.getActivity();
                    kotlin.jvm.internal.i.d(activity16);
                    Object obj6 = g0.a.f16164a;
                    ((ImageView) childAt.findViewById(R.id.chkBxSelected)).setImageDrawable(a.c.b(activity16, R.drawable.ic_check_box_outline_blank_gray_24dp));
                    Context context2 = this$018.getContext();
                    kotlin.jvm.internal.i.d(context2);
                    ((RobertoTextView) childAt.findViewById(R.id.tvLabel)).setTypeface(Typeface.createFromAsset(context2.getAssets(), "fonts/Lato-Medium.ttf"));
                    androidx.fragment.app.p activity17 = this$018.getActivity();
                    kotlin.jvm.internal.i.d(activity17);
                    ((RobertoTextView) childAt.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity17, R.color.grey_high_contrast));
                    tt3.setIn2Min(false);
                    return;
                }
                View childAt2 = ((LinearLayout) this$018._$_findCachedViewById(R.id.llS82List)).getChildAt(((ArrayList) urgentImportantList2.f23469u).indexOf(tt3));
                androidx.fragment.app.p activity18 = this$018.getActivity();
                kotlin.jvm.internal.i.d(activity18);
                Object obj7 = g0.a.f16164a;
                ((ImageView) childAt2.findViewById(R.id.chkBxSelected)).setImageDrawable(a.c.b(activity18, R.drawable.ic_check_box_orange_24dp));
                Context context3 = this$018.getContext();
                kotlin.jvm.internal.i.d(context3);
                ((RobertoTextView) childAt2.findViewById(R.id.tvLabel)).setTypeface(Typeface.createFromAsset(context3.getAssets(), "fonts/Lato-Bold.ttf"));
                androidx.fragment.app.p activity19 = this$018.getActivity();
                kotlin.jvm.internal.i.d(activity19);
                ((RobertoTextView) childAt2.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity19, R.color.title_high_contrast));
                tt3.setIn2Min(true);
                return;
            case 18:
                s9 this$019 = (s9) obj3;
                kotlin.jvm.internal.x calendar = (kotlin.jvm.internal.x) obj2;
                ss.a updateTime = (ss.a) obj;
                int i30 = s9.f19179w;
                kotlin.jvm.internal.i.g(this$019, "this$0");
                kotlin.jvm.internal.i.g(calendar, "$calendar");
                kotlin.jvm.internal.i.g(updateTime, "$updateTime");
                androidx.fragment.app.p activity20 = this$019.getActivity();
                kotlin.jvm.internal.i.d(activity20);
                TimePickerDialog timePickerDialog = new TimePickerDialog(activity20, new r9(calendar, updateTime, 0), ((Calendar) calendar.f23469u).get(11), ((Calendar) calendar.f23469u).get(12), false);
                timePickerDialog.setTitle("Select Time");
                timePickerDialog.show();
                return;
            case 19:
                t9 this$020 = (t9) obj3;
                kotlin.jvm.internal.x calendar2 = (kotlin.jvm.internal.x) obj2;
                ss.a updateTime2 = (ss.a) obj;
                int i31 = t9.f19215w;
                kotlin.jvm.internal.i.g(this$020, "this$0");
                kotlin.jvm.internal.i.g(calendar2, "$calendar");
                kotlin.jvm.internal.i.g(updateTime2, "$updateTime");
                androidx.fragment.app.p activity21 = this$020.getActivity();
                kotlin.jvm.internal.i.d(activity21);
                TimePickerDialog timePickerDialog2 = new TimePickerDialog(activity21, new r9(calendar2, updateTime2, 1), ((Calendar) calendar2.f23469u).get(11), ((Calendar) calendar2.f23469u).get(12), false);
                timePickerDialog2.setTitle("Select Time");
                timePickerDialog2.show();
                return;
            case 20:
                kotlin.jvm.internal.x calendar3 = (kotlin.jvm.internal.x) obj3;
                TemplateActivity act8 = (TemplateActivity) obj;
                t9 this$021 = (t9) obj2;
                int i32 = t9.f19215w;
                kotlin.jvm.internal.i.g(calendar3, "$calendar");
                kotlin.jvm.internal.i.g(act8, "$act");
                kotlin.jvm.internal.i.g(this$021, "this$0");
                ((Calendar) calendar3.f23469u).clear(2);
                ((Calendar) calendar3.f23469u).clear(1);
                ((Calendar) calendar3.f23469u).clear(5);
                HashMap<String, Object> hashMap7 = act8.F;
                Object calendar4 = calendar3.f23469u;
                kotlin.jvm.internal.i.f(calendar4, "calendar");
                hashMap7.put("s92b_user_data", calendar4);
                androidx.fragment.app.p activity22 = this$021.getActivity();
                kotlin.jvm.internal.i.e(activity22, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                HashMap<String, Object> hashMap8 = ((TemplateActivity) activity22).F;
                Object calendar5 = calendar3.f23469u;
                kotlin.jvm.internal.i.f(calendar5, "calendar");
                hashMap8.put("sleep_time", calendar5);
                androidx.fragment.app.p activity23 = this$021.getActivity();
                kotlin.jvm.internal.i.e(activity23, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                ((rr.a) activity23).s0(new u9());
                return;
            case 21:
                u9 this$022 = (u9) obj3;
                kotlin.jvm.internal.x calendar6 = (kotlin.jvm.internal.x) obj2;
                ss.a updateTime3 = (ss.a) obj;
                int i33 = u9.f19255w;
                kotlin.jvm.internal.i.g(this$022, "this$0");
                kotlin.jvm.internal.i.g(calendar6, "$calendar");
                kotlin.jvm.internal.i.g(updateTime3, "$updateTime");
                androidx.fragment.app.p activity24 = this$022.getActivity();
                kotlin.jvm.internal.i.d(activity24);
                TimePickerDialog timePickerDialog3 = new TimePickerDialog(activity24, new r9(calendar6, updateTime3, 2), ((Calendar) calendar6.f23469u).get(11), ((Calendar) calendar6.f23469u).get(12), false);
                timePickerDialog3.setTitle("Select Time");
                timePickerDialog3.show();
                return;
            case 22:
                kotlin.jvm.internal.x calendar7 = (kotlin.jvm.internal.x) obj3;
                TemplateActivity act9 = (TemplateActivity) obj;
                u9 this$023 = (u9) obj2;
                int i34 = u9.f19255w;
                kotlin.jvm.internal.i.g(calendar7, "$calendar");
                kotlin.jvm.internal.i.g(act9, "$act");
                kotlin.jvm.internal.i.g(this$023, "this$0");
                ((Calendar) calendar7.f23469u).clear(2);
                ((Calendar) calendar7.f23469u).clear(1);
                ((Calendar) calendar7.f23469u).clear(5);
                HashMap<String, Object> hashMap9 = act9.F;
                Object calendar8 = calendar7.f23469u;
                kotlin.jvm.internal.i.f(calendar8, "calendar");
                hashMap9.put("s92c_user_data", calendar8);
                androidx.fragment.app.p activity25 = this$023.getActivity();
                kotlin.jvm.internal.i.e(activity25, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                HashMap<String, Object> hashMap10 = ((TemplateActivity) activity25).F;
                Object calendar9 = calendar7.f23469u;
                kotlin.jvm.internal.i.f(calendar9, "calendar");
                hashMap10.put("wake_up_time", calendar9);
                androidx.fragment.app.p activity26 = this$023.getActivity();
                kotlin.jvm.internal.i.e(activity26, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                ((rr.a) activity26).s0(new ba());
                return;
            case 23:
                RelativeLayout noneOfThese = (RelativeLayout) obj3;
                ga this$024 = (ga) obj2;
                kotlin.jvm.internal.x selectedOptions = (kotlin.jvm.internal.x) obj;
                int i35 = ga.f18476x;
                kotlin.jvm.internal.i.g(noneOfThese, "$noneOfThese");
                kotlin.jvm.internal.i.g(this$024, "this$0");
                kotlin.jvm.internal.i.g(selectedOptions, "$selectedOptions");
                try {
                    Object tag = noneOfThese.getTag();
                    kotlin.jvm.internal.i.e(tag, "null cannot be cast to non-null type kotlin.Boolean");
                    if (((Boolean) tag).booleanValue()) {
                        noneOfThese.setTag(Boolean.FALSE);
                        this$024.K(noneOfThese);
                        return;
                    }
                    noneOfThese.setTag(Boolean.TRUE);
                    this$024.J(noneOfThese);
                    ArrayList<RelativeLayout> arrayList3 = this$024.f18478v;
                    Iterator<RelativeLayout> it5 = arrayList3.iterator();
                    while (it5.hasNext()) {
                        RelativeLayout temp2 = it5.next();
                        kotlin.jvm.internal.i.f(temp2, "temp");
                        this$024.K(temp2);
                    }
                    arrayList3.clear();
                    ((HashSet) selectedOptions.f23469u).clear();
                    return;
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e(this$024.f18477u, "Exception", e12);
                    return;
                }
            case 24:
                a();
                return;
            default:
                b();
                return;
        }
    }

    public /* synthetic */ o4(TemplateActivity templateActivity, w8 w8Var, HashMap hashMap) {
        this.f18914u = 15;
        this.f18917x = templateActivity;
        this.f18915v = w8Var;
        this.f18916w = hashMap;
    }

    public /* synthetic */ o4(HashMap hashMap, kotlin.jvm.internal.x xVar, y8 y8Var) {
        this.f18914u = 16;
        this.f18916w = hashMap;
        this.f18915v = xVar;
        this.f18917x = y8Var;
    }

    public /* synthetic */ o4(kotlin.jvm.internal.x xVar, TemplateActivity templateActivity, rr.b bVar, int i6) {
        this.f18914u = i6;
        this.f18915v = xVar;
        this.f18917x = templateActivity;
        this.f18916w = bVar;
    }
}
