package com.theinnerhour.b2b.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import androidx.lifecycle.o0;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.CustomDate;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenModel;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.NpsPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.FireStoreUtilsKt;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.ProgressDialogUtil;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import dk.c0;
import dk.d0;
import dk.g0;
import f0.a;
import hr.a1;
import hr.a3;
import hr.a9;
import hr.b4;
import hr.b9;
import hr.ba;
import hr.c1;
import hr.c5;
import hr.c6;
import hr.c7;
import hr.c8;
import hr.d1;
import hr.d2;
import hr.e0;
import hr.e5;
import hr.e6;
import hr.e7;
import hr.f2;
import hr.f3;
import hr.f5;
import hr.f8;
import hr.f9;
import hr.g1;
import hr.g7;
import hr.g9;
import hr.h0;
import hr.h2;
import hr.h3;
import hr.h6;
import hr.h7;
import hr.h9;
import hr.i1;
import hr.i5;
import hr.i9;
import hr.j0;
import hr.j4;
import hr.j6;
import hr.j7;
import hr.j8;
import hr.k0;
import hr.k4;
import hr.k5;
import hr.k9;
import hr.ka;
import hr.l0;
import hr.l1;
import hr.l3;
import hr.m1;
import hr.m3;
import hr.m9;
import hr.n0;
import hr.n2;
import hr.n4;
import hr.n9;
import hr.o2;
import hr.o8;
import hr.p1;
import hr.p4;
import hr.p5;
import hr.p6;
import hr.q0;
import hr.q2;
import hr.q5;
import hr.q7;
import hr.r1;
import hr.r4;
import hr.r6;
import hr.s0;
import hr.s4;
import hr.s5;
import hr.s6;
import hr.s7;
import hr.s8;
import hr.s9;
import hr.t4;
import hr.t7;
import hr.t8;
import hr.t9;
import hr.u1;
import hr.u6;
import hr.u8;
import hr.v0;
import hr.v3;
import hr.v5;
import hr.w0;
import hr.w1;
import hr.w4;
import hr.w5;
import hr.w7;
import hr.w8;
import hr.x3;
import hr.x6;
import hr.y0;
import hr.y2;
import hr.y6;
import hr.y8;
import hr.z1;
import hr.z3;
import hr.z6;
import hr.z7;
import is.u;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ok.c;
import sp.d;
import ss.p;
/* compiled from: TemplateActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/activity/TemplateActivity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class TemplateActivity extends rr.a {
    public static final /* synthetic */ int X = 0;
    public String A;
    public y B;
    public int C;
    public int D;
    public boolean E;
    public final HashMap<String, Object> F;
    public rr.b G;
    public CourseDayModelV1 H;
    public boolean I;
    public boolean J;
    public boolean K;
    public final ArrayList<String> L;
    public String M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public String T;
    public d U;
    public fm.a V;
    public boolean W;

    /* renamed from: w  reason: collision with root package name */
    public final String f10545w;

    /* renamed from: x  reason: collision with root package name */
    public ProgressDialogUtil f10546x;

    /* renamed from: y  reason: collision with root package name */
    public TemplateModel f10547y;

    /* renamed from: z  reason: collision with root package name */
    public String f10548z;

    /* compiled from: TemplateActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements p<Boolean, TemplateModel, hs.k> {
        public a() {
            super(2);
        }

        @Override // ss.p
        public final hs.k invoke(Boolean bool, TemplateModel templateModel) {
            boolean booleanValue = bool.booleanValue();
            TemplateModel templateModel2 = templateModel;
            TemplateActivity templateActivity = TemplateActivity.this;
            try {
                ProgressDialogUtil progressDialogUtil = templateActivity.f10546x;
                if (progressDialogUtil != null) {
                    progressDialogUtil.dismiss();
                }
                LogHelper logHelper = LogHelper.INSTANCE;
                String str = templateActivity.f10545w;
                logHelper.i(str, "fetch course content template activity " + booleanValue);
                if (booleanValue && templateModel2 != null) {
                    templateActivity.f10547y = templateModel2;
                    if (!templateActivity.getIntent().hasExtra("type")) {
                        TemplateModel templateModel3 = templateActivity.f10547y;
                        i.d(templateModel3);
                        templateModel3.setGoal_type(Constants.GOAL_TYPE_ACTIVITY_DAILY);
                    }
                    templateActivity.H0();
                    TemplateActivity.u0(templateActivity);
                    templateActivity.L0(false, false);
                } else {
                    Utils.INSTANCE.showCustomToast(templateActivity, "Something went wrong, please try again");
                    templateActivity.finish();
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(templateActivity.f10545w, "exception", e10);
                Utils.INSTANCE.showCustomToast(templateActivity, "Something went wrong, please try again");
                templateActivity.finish();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: TemplateActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements p<Boolean, TemplateModel, hs.k> {
        public b() {
            super(2);
        }

        @Override // ss.p
        public final hs.k invoke(Boolean bool, TemplateModel templateModel) {
            boolean booleanValue = bool.booleanValue();
            TemplateModel templateModel2 = templateModel;
            TemplateActivity templateActivity = TemplateActivity.this;
            try {
                ProgressDialogUtil progressDialogUtil = templateActivity.f10546x;
                if (progressDialogUtil != null) {
                    progressDialogUtil.dismiss();
                }
                LogHelper logHelper = LogHelper.INSTANCE;
                String str = templateActivity.f10545w;
                logHelper.i(str, "fetch miniCourse content template activity " + booleanValue);
                if (booleanValue && templateModel2 != null) {
                    templateActivity.f10547y = templateModel2;
                    templateModel2.setGoal_type(Constants.GOAL_TYPE_DAILY_ACTIVITY);
                    templateActivity.H0();
                    TemplateActivity.u0(templateActivity);
                    templateActivity.L0(false, false);
                } else {
                    Utils.INSTANCE.showCustomToast(templateActivity, "Something went wrong, please try again");
                    templateActivity.finish();
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(templateActivity.f10545w, "exception", e10);
                Utils.INSTANCE.showCustomToast(templateActivity, "Something went wrong, please try again");
                templateActivity.finish();
            }
            return hs.k.f19476a;
        }
    }

    public TemplateActivity() {
        new LinkedHashMap();
        this.f10545w = LogHelper.INSTANCE.makeLogTag(TemplateActivity.class);
        this.F = new HashMap<>();
        this.L = new ArrayList<>();
        this.M = "";
        this.T = "";
        this.W = sp.b.K();
    }

    public static final void u0(TemplateActivity templateActivity) {
        if (templateActivity.I) {
            TemplateModel templateModel = templateActivity.f10547y;
            i.d(templateModel);
            Iterator<ScreenModel> it = templateModel.getTemplate().iterator();
            int i6 = 0;
            while (it.hasNext()) {
                int i10 = i6 + 1;
                if (it.next().getShow_first()) {
                    templateActivity.C = i6;
                    return;
                }
                i6 = i10;
            }
        }
    }

    public final HashMap<String, Object> A0() {
        TemplateModel templateModel = this.f10547y;
        if (templateModel != null) {
            i.d(templateModel);
            if (templateModel.getTemplate().size() > this.C) {
                TemplateModel templateModel2 = this.f10547y;
                i.d(templateModel2);
                return templateModel2.getTemplate().get(this.C).getParams();
            }
        }
        return new HashMap<>();
    }

    public final String B0() {
        ArrayList<ScreenModel> template;
        ScreenModel screenModel;
        String slug;
        TemplateModel templateModel = this.f10547y;
        if (templateModel == null || (template = templateModel.getTemplate()) == null || (screenModel = template.get(this.C)) == null || (slug = screenModel.getSlug()) == null) {
            return "";
        }
        return slug;
    }

    public final HashMap<String, Object> C0() {
        return this.F;
    }

    public final void D0(Context context, RobertoEditText robertoEditText) {
        Object systemService = context.getSystemService("input_method");
        i.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(robertoEditText.getWindowToken(), 0);
    }

    public final boolean E0() {
        return this.J;
    }

    public final boolean F0() {
        return this.W;
    }

    public final void G0() {
        String str;
        ProgressDialogUtil progressDialogUtil = this.f10546x;
        if (progressDialogUtil != null) {
            progressDialogUtil.show();
        }
        CourseDayModelV1 courseDayModelV1 = this.H;
        String str2 = null;
        if (courseDayModelV1 != null) {
            str = courseDayModelV1.getContent_id();
        } else {
            str = null;
        }
        if (str == null) {
            Utils.INSTANCE.showCustomToast(this, "Something went wrong, please try again");
            finish();
        } else if (getIntent().hasExtra("type")) {
            CourseDayModelV1 courseDayModelV12 = this.H;
            if (courseDayModelV12 != null) {
                str2 = courseDayModelV12.getContent_id();
            }
            i.d(str2);
            FireStoreUtilsKt.fetchCourseContentV3("en", str2, new a());
        } else {
            CourseDayModelV1 courseDayModelV13 = this.H;
            i.d(courseDayModelV13);
            String content_id = courseDayModelV13.getContent_id();
            i.d(content_id);
            FireStoreUtilsKt.fetchCourseContent("en", content_id, new b());
        }
    }

    public final void H0() {
        TemplateModel templateModel;
        boolean z10;
        String str;
        String str2;
        if (this.H != null && (templateModel = this.f10547y) != null) {
            try {
                Iterator<ScreenModel> it = templateModel.getTemplate().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (u.Z1(ca.a.k("s16", "s18", "s25", "s29", "s30", "s31", "s34", "s37", "s38", "s45", "s51", "s55", "s56", "s68", "s117", "s118b", "s122", "s128", "s129", "s138", "s139", "s140", "s141", "s142", "s144", "s148", "s150", "s151", "s152", "s154", "r2", "r3", "r15", "r7", "r8", "r21", "r22", "s59", "s59b", "s59c"), it.next().getSlug())) {
                            z10 = true;
                            break;
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    TemplateModel templateModel2 = this.f10547y;
                    i.d(templateModel2);
                    if (templateModel2.getGoal_type() == null) {
                        TemplateModel templateModel3 = this.f10547y;
                        i.d(templateModel3);
                        templateModel3.setGoal_type(Constants.SUBSCRIPTION_NONE);
                    }
                    if (this.W && !this.O) {
                        String str3 = this.A;
                        if (str3 == null) {
                            str3 = p0();
                        }
                        String str4 = str3;
                        CourseDayModelV1 courseDayModelV1 = this.H;
                        if (courseDayModelV1 != null) {
                            str = courseDayModelV1.getContent_id();
                        } else {
                            str = null;
                        }
                        String str5 = this.f10548z;
                        if (str5 == null) {
                            str5 = rr.a.q0();
                        }
                        String str6 = str5;
                        TemplateModel templateModel4 = this.f10547y;
                        i.d(templateModel4);
                        String goalName = templateModel4.getGoalName();
                        String str7 = this.T;
                        CustomDate customDate = new CustomDate();
                        customDate.setTime(Utils.INSTANCE.getTodayTimeInSeconds());
                        hs.k kVar = hs.k.f19476a;
                        CustomDate customDate2 = new CustomDate();
                        customDate2.setTime(Calendar.getInstance().getTimeInMillis());
                        TemplateModel templateModel5 = this.f10547y;
                        if (templateModel5 != null) {
                            str2 = templateModel5.getGoal_type();
                        } else {
                            str2 = null;
                        }
                        FirestoreGoal firestoreGoal = new FirestoreGoal(str4, str, str6, goalName, str7, customDate, null, customDate2, null, false, null, str2, false, null, 320, null);
                        fm.a aVar = this.V;
                        if (aVar != null) {
                            aVar.g(firestoreGoal, false);
                        }
                        Log.d("TemplateTag", "goals created");
                        return;
                    }
                    if (!this.O) {
                        FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                        CourseDayModelV1 courseDayModelV12 = this.H;
                        i.d(courseDayModelV12);
                        String content_id = courseDayModelV12.getContent_id();
                        String str8 = this.A;
                        if (str8 == null) {
                            str8 = p0();
                        }
                        String str9 = str8;
                        TemplateModel templateModel6 = this.f10547y;
                        i.d(templateModel6);
                        String goalName2 = templateModel6.getGoalName();
                        String str10 = this.f10548z;
                        if (str10 == null) {
                            str10 = rr.a.q0();
                        }
                        String str11 = str10;
                        TemplateModel templateModel7 = this.f10547y;
                        i.d(templateModel7);
                        firebasePersistence.addNewGoalBasic(content_id, str9, goalName2, str11, false, templateModel7.getGoal_type(), this.T);
                    } else {
                        FirebasePersistence firebasePersistence2 = FirebasePersistence.getInstance();
                        CourseDayModelV1 courseDayModelV13 = this.H;
                        i.d(courseDayModelV13);
                        String content_id2 = courseDayModelV13.getContent_id();
                        String str12 = this.A;
                        if (str12 == null) {
                            str12 = p0();
                        }
                        String str13 = str12;
                        TemplateModel templateModel8 = this.f10547y;
                        i.d(templateModel8);
                        String goalName3 = templateModel8.getGoalName();
                        String str14 = this.f10548z;
                        if (str14 == null) {
                            str14 = rr.a.q0();
                        }
                        String str15 = str14;
                        TemplateModel templateModel9 = this.f10547y;
                        i.d(templateModel9);
                        firebasePersistence2.addNewGoalTopical(content_id2, str13, goalName3, str15, false, templateModel9.getGoal_type(), this.T);
                    }
                    if (y0() != null) {
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f10545w, e10);
            }
        }
    }

    public final void I0() {
        this.I = false;
    }

    public final void J0() {
        boolean z10;
        this.C++;
        this.J = false;
        ArrayList<String> arrayList = this.L;
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            y yVar = this.B;
            i.d(yVar);
            Fragment F = yVar.F(it.next());
            if (F != null) {
                F.setReturnTransition(null);
            }
        }
        arrayList.clear();
        y yVar2 = this.B;
        if (yVar2 != null && yVar2.H() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            Utils.INSTANCE.setClearingFragmentBackStack(true);
        }
        y yVar3 = this.B;
        if (yVar3 != null) {
            yVar3.X(null);
        }
        L0(false, true);
    }

    public final void K0(boolean z10) {
        if (z10) {
            ProgressDialogUtil progressDialogUtil = this.f10546x;
            if (progressDialogUtil != null) {
                progressDialogUtil.show();
                return;
            }
            return;
        }
        ProgressDialogUtil progressDialogUtil2 = this.f10546x;
        if (progressDialogUtil2 != null) {
            progressDialogUtil2.dismiss();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:436:0x06b7 A[Catch: Exception -> 0x09c0, TryCatch #0 {Exception -> 0x09c0, blocks: (B:3:0x0008, B:5:0x000c, B:7:0x0017, B:9:0x0025, B:11:0x0029, B:15:0x0033, B:17:0x0037, B:19:0x003b, B:21:0x003f, B:23:0x0043, B:25:0x0047, B:27:0x004b, B:30:0x0058, B:31:0x0062, B:32:0x006b, B:34:0x00a8, B:35:0x00ac, B:37:0x00b1, B:236:0x0383, B:599:0x0941, B:601:0x0947, B:605:0x0950, B:40:0x00bb, B:225:0x0357, B:43:0x00c5, B:313:0x04c2, B:46:0x00cf, B:49:0x00d9, B:107:0x019e, B:52:0x00e3, B:55:0x00ed, B:380:0x05d1, B:58:0x00f7, B:408:0x0648, B:61:0x0101, B:64:0x010b, B:67:0x0115, B:70:0x011f, B:598:0x093c, B:73:0x0129, B:195:0x02dd, B:76:0x0133, B:434:0x06b3, B:436:0x06b7, B:437:0x06be, B:79:0x013d, B:82:0x0147, B:83:0x014e, B:86:0x0158, B:89:0x0162, B:508:0x07dc, B:92:0x016c, B:512:0x07ed, B:95:0x0176, B:98:0x0180, B:587:0x0915, B:101:0x018a, B:104:0x0194, B:108:0x01a5, B:111:0x01af, B:523:0x0819, B:114:0x01b9, B:340:0x0527, B:117:0x01c3, B:120:0x01cd, B:123:0x01d7, B:126:0x01e1, B:129:0x01eb, B:130:0x01f2, B:183:0x02aa, B:133:0x01fc, B:136:0x0206, B:137:0x020d, B:293:0x046d, B:140:0x0217, B:143:0x0221, B:146:0x022b, B:149:0x0235, B:152:0x023f, B:155:0x0249, B:158:0x0253, B:161:0x025d, B:164:0x0267, B:167:0x0271, B:168:0x0278, B:171:0x0282, B:174:0x028c, B:177:0x0296, B:180:0x02a0, B:184:0x02b1, B:187:0x02bb, B:188:0x02c2, B:191:0x02cc, B:192:0x02d3, B:196:0x02e4, B:199:0x02ee, B:200:0x02f5, B:594:0x092d, B:203:0x02ff, B:297:0x047e, B:206:0x0309, B:209:0x0313, B:210:0x031a, B:213:0x0324, B:214:0x032b, B:217:0x0335, B:218:0x033c, B:221:0x0346, B:222:0x034d, B:226:0x035e, B:229:0x0368, B:232:0x0372, B:233:0x0379, B:237:0x038a, B:240:0x0394, B:241:0x039b, B:244:0x03a5, B:245:0x03ac, B:248:0x03b6, B:249:0x03bd, B:252:0x03c7, B:253:0x03ce, B:256:0x03d8, B:257:0x03df, B:260:0x03e9, B:261:0x03f0, B:264:0x03fa, B:265:0x0401, B:282:0x0441, B:268:0x040b, B:271:0x0415, B:272:0x041c, B:275:0x0426, B:278:0x0430, B:279:0x0437, B:283:0x0448, B:286:0x0452, B:287:0x0459, B:290:0x0463, B:294:0x0474, B:298:0x0485, B:301:0x048f, B:302:0x0496, B:305:0x04a0, B:306:0x04a7, B:309:0x04b1, B:310:0x04b8, B:314:0x04c9, B:317:0x04d3, B:320:0x04dd, B:323:0x04e7, B:326:0x04f1, B:329:0x04fb, B:330:0x0502, B:336:0x0516, B:333:0x050c, B:337:0x051d, B:341:0x052e, B:344:0x0538, B:345:0x053f, B:348:0x0549, B:349:0x0550, B:352:0x055a, B:353:0x0561, B:356:0x056b, B:357:0x0572, B:360:0x057c, B:361:0x0583, B:364:0x058d, B:365:0x0594, B:368:0x059e, B:369:0x05a5, B:372:0x05af, B:373:0x05b6, B:376:0x05c0, B:377:0x05c7, B:381:0x05d8, B:384:0x05e2, B:385:0x05e9, B:388:0x05f3, B:389:0x05fa, B:392:0x0604, B:393:0x060b, B:396:0x0615, B:397:0x061c, B:400:0x0626, B:401:0x062d, B:404:0x0637, B:405:0x063e, B:409:0x064f, B:412:0x0659, B:413:0x0660, B:416:0x066a, B:417:0x0671, B:420:0x067b, B:422:0x067f, B:423:0x0686, B:424:0x068d, B:427:0x0697, B:429:0x069b, B:430:0x06a2, B:431:0x06a9, B:438:0x06c5, B:441:0x06cf, B:443:0x06d3, B:444:0x06da, B:445:0x06e1, B:448:0x06eb, B:450:0x06ef, B:451:0x06f6, B:452:0x06fd, B:455:0x0707, B:457:0x070b, B:458:0x0712, B:459:0x0719, B:462:0x0723, B:464:0x0727, B:465:0x072e, B:466:0x0735, B:469:0x073f, B:471:0x0743, B:472:0x074a, B:473:0x0751, B:476:0x075b, B:478:0x075f, B:479:0x0766, B:480:0x076d, B:483:0x0777, B:485:0x077b, B:486:0x0782, B:487:0x0789, B:490:0x0793, B:492:0x0797, B:493:0x079e, B:494:0x07a5, B:497:0x07af, B:499:0x07b3, B:500:0x07ba, B:501:0x07c1, B:504:0x07cb, B:505:0x07d2, B:509:0x07e3, B:513:0x07f4, B:516:0x07fe, B:519:0x0808, B:520:0x080f, B:524:0x0820, B:527:0x082a, B:528:0x0831, B:531:0x083b, B:533:0x083f, B:534:0x0846, B:535:0x084d, B:538:0x0857, B:540:0x085b, B:541:0x0862, B:542:0x0869, B:545:0x0873, B:547:0x0877, B:548:0x087e, B:549:0x0885, B:552:0x088f, B:554:0x0893, B:555:0x089a, B:556:0x08a1, B:559:0x08ab, B:561:0x08af, B:562:0x08b6, B:563:0x08bd, B:566:0x08c7, B:568:0x08cb, B:569:0x08d2, B:570:0x08d9, B:573:0x08e3, B:575:0x08e7, B:576:0x08ed, B:577:0x08f3, B:580:0x08fd, B:581:0x0903, B:584:0x090c, B:588:0x091b, B:591:0x0924, B:595:0x0933, B:606:0x0970), top: B:611:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x06be A[Catch: Exception -> 0x09c0, TryCatch #0 {Exception -> 0x09c0, blocks: (B:3:0x0008, B:5:0x000c, B:7:0x0017, B:9:0x0025, B:11:0x0029, B:15:0x0033, B:17:0x0037, B:19:0x003b, B:21:0x003f, B:23:0x0043, B:25:0x0047, B:27:0x004b, B:30:0x0058, B:31:0x0062, B:32:0x006b, B:34:0x00a8, B:35:0x00ac, B:37:0x00b1, B:236:0x0383, B:599:0x0941, B:601:0x0947, B:605:0x0950, B:40:0x00bb, B:225:0x0357, B:43:0x00c5, B:313:0x04c2, B:46:0x00cf, B:49:0x00d9, B:107:0x019e, B:52:0x00e3, B:55:0x00ed, B:380:0x05d1, B:58:0x00f7, B:408:0x0648, B:61:0x0101, B:64:0x010b, B:67:0x0115, B:70:0x011f, B:598:0x093c, B:73:0x0129, B:195:0x02dd, B:76:0x0133, B:434:0x06b3, B:436:0x06b7, B:437:0x06be, B:79:0x013d, B:82:0x0147, B:83:0x014e, B:86:0x0158, B:89:0x0162, B:508:0x07dc, B:92:0x016c, B:512:0x07ed, B:95:0x0176, B:98:0x0180, B:587:0x0915, B:101:0x018a, B:104:0x0194, B:108:0x01a5, B:111:0x01af, B:523:0x0819, B:114:0x01b9, B:340:0x0527, B:117:0x01c3, B:120:0x01cd, B:123:0x01d7, B:126:0x01e1, B:129:0x01eb, B:130:0x01f2, B:183:0x02aa, B:133:0x01fc, B:136:0x0206, B:137:0x020d, B:293:0x046d, B:140:0x0217, B:143:0x0221, B:146:0x022b, B:149:0x0235, B:152:0x023f, B:155:0x0249, B:158:0x0253, B:161:0x025d, B:164:0x0267, B:167:0x0271, B:168:0x0278, B:171:0x0282, B:174:0x028c, B:177:0x0296, B:180:0x02a0, B:184:0x02b1, B:187:0x02bb, B:188:0x02c2, B:191:0x02cc, B:192:0x02d3, B:196:0x02e4, B:199:0x02ee, B:200:0x02f5, B:594:0x092d, B:203:0x02ff, B:297:0x047e, B:206:0x0309, B:209:0x0313, B:210:0x031a, B:213:0x0324, B:214:0x032b, B:217:0x0335, B:218:0x033c, B:221:0x0346, B:222:0x034d, B:226:0x035e, B:229:0x0368, B:232:0x0372, B:233:0x0379, B:237:0x038a, B:240:0x0394, B:241:0x039b, B:244:0x03a5, B:245:0x03ac, B:248:0x03b6, B:249:0x03bd, B:252:0x03c7, B:253:0x03ce, B:256:0x03d8, B:257:0x03df, B:260:0x03e9, B:261:0x03f0, B:264:0x03fa, B:265:0x0401, B:282:0x0441, B:268:0x040b, B:271:0x0415, B:272:0x041c, B:275:0x0426, B:278:0x0430, B:279:0x0437, B:283:0x0448, B:286:0x0452, B:287:0x0459, B:290:0x0463, B:294:0x0474, B:298:0x0485, B:301:0x048f, B:302:0x0496, B:305:0x04a0, B:306:0x04a7, B:309:0x04b1, B:310:0x04b8, B:314:0x04c9, B:317:0x04d3, B:320:0x04dd, B:323:0x04e7, B:326:0x04f1, B:329:0x04fb, B:330:0x0502, B:336:0x0516, B:333:0x050c, B:337:0x051d, B:341:0x052e, B:344:0x0538, B:345:0x053f, B:348:0x0549, B:349:0x0550, B:352:0x055a, B:353:0x0561, B:356:0x056b, B:357:0x0572, B:360:0x057c, B:361:0x0583, B:364:0x058d, B:365:0x0594, B:368:0x059e, B:369:0x05a5, B:372:0x05af, B:373:0x05b6, B:376:0x05c0, B:377:0x05c7, B:381:0x05d8, B:384:0x05e2, B:385:0x05e9, B:388:0x05f3, B:389:0x05fa, B:392:0x0604, B:393:0x060b, B:396:0x0615, B:397:0x061c, B:400:0x0626, B:401:0x062d, B:404:0x0637, B:405:0x063e, B:409:0x064f, B:412:0x0659, B:413:0x0660, B:416:0x066a, B:417:0x0671, B:420:0x067b, B:422:0x067f, B:423:0x0686, B:424:0x068d, B:427:0x0697, B:429:0x069b, B:430:0x06a2, B:431:0x06a9, B:438:0x06c5, B:441:0x06cf, B:443:0x06d3, B:444:0x06da, B:445:0x06e1, B:448:0x06eb, B:450:0x06ef, B:451:0x06f6, B:452:0x06fd, B:455:0x0707, B:457:0x070b, B:458:0x0712, B:459:0x0719, B:462:0x0723, B:464:0x0727, B:465:0x072e, B:466:0x0735, B:469:0x073f, B:471:0x0743, B:472:0x074a, B:473:0x0751, B:476:0x075b, B:478:0x075f, B:479:0x0766, B:480:0x076d, B:483:0x0777, B:485:0x077b, B:486:0x0782, B:487:0x0789, B:490:0x0793, B:492:0x0797, B:493:0x079e, B:494:0x07a5, B:497:0x07af, B:499:0x07b3, B:500:0x07ba, B:501:0x07c1, B:504:0x07cb, B:505:0x07d2, B:509:0x07e3, B:513:0x07f4, B:516:0x07fe, B:519:0x0808, B:520:0x080f, B:524:0x0820, B:527:0x082a, B:528:0x0831, B:531:0x083b, B:533:0x083f, B:534:0x0846, B:535:0x084d, B:538:0x0857, B:540:0x085b, B:541:0x0862, B:542:0x0869, B:545:0x0873, B:547:0x0877, B:548:0x087e, B:549:0x0885, B:552:0x088f, B:554:0x0893, B:555:0x089a, B:556:0x08a1, B:559:0x08ab, B:561:0x08af, B:562:0x08b6, B:563:0x08bd, B:566:0x08c7, B:568:0x08cb, B:569:0x08d2, B:570:0x08d9, B:573:0x08e3, B:575:0x08e7, B:576:0x08ed, B:577:0x08f3, B:580:0x08fd, B:581:0x0903, B:584:0x090c, B:588:0x091b, B:591:0x0924, B:595:0x0933, B:606:0x0970), top: B:611:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:601:0x0947 A[Catch: Exception -> 0x09c0, TryCatch #0 {Exception -> 0x09c0, blocks: (B:3:0x0008, B:5:0x000c, B:7:0x0017, B:9:0x0025, B:11:0x0029, B:15:0x0033, B:17:0x0037, B:19:0x003b, B:21:0x003f, B:23:0x0043, B:25:0x0047, B:27:0x004b, B:30:0x0058, B:31:0x0062, B:32:0x006b, B:34:0x00a8, B:35:0x00ac, B:37:0x00b1, B:236:0x0383, B:599:0x0941, B:601:0x0947, B:605:0x0950, B:40:0x00bb, B:225:0x0357, B:43:0x00c5, B:313:0x04c2, B:46:0x00cf, B:49:0x00d9, B:107:0x019e, B:52:0x00e3, B:55:0x00ed, B:380:0x05d1, B:58:0x00f7, B:408:0x0648, B:61:0x0101, B:64:0x010b, B:67:0x0115, B:70:0x011f, B:598:0x093c, B:73:0x0129, B:195:0x02dd, B:76:0x0133, B:434:0x06b3, B:436:0x06b7, B:437:0x06be, B:79:0x013d, B:82:0x0147, B:83:0x014e, B:86:0x0158, B:89:0x0162, B:508:0x07dc, B:92:0x016c, B:512:0x07ed, B:95:0x0176, B:98:0x0180, B:587:0x0915, B:101:0x018a, B:104:0x0194, B:108:0x01a5, B:111:0x01af, B:523:0x0819, B:114:0x01b9, B:340:0x0527, B:117:0x01c3, B:120:0x01cd, B:123:0x01d7, B:126:0x01e1, B:129:0x01eb, B:130:0x01f2, B:183:0x02aa, B:133:0x01fc, B:136:0x0206, B:137:0x020d, B:293:0x046d, B:140:0x0217, B:143:0x0221, B:146:0x022b, B:149:0x0235, B:152:0x023f, B:155:0x0249, B:158:0x0253, B:161:0x025d, B:164:0x0267, B:167:0x0271, B:168:0x0278, B:171:0x0282, B:174:0x028c, B:177:0x0296, B:180:0x02a0, B:184:0x02b1, B:187:0x02bb, B:188:0x02c2, B:191:0x02cc, B:192:0x02d3, B:196:0x02e4, B:199:0x02ee, B:200:0x02f5, B:594:0x092d, B:203:0x02ff, B:297:0x047e, B:206:0x0309, B:209:0x0313, B:210:0x031a, B:213:0x0324, B:214:0x032b, B:217:0x0335, B:218:0x033c, B:221:0x0346, B:222:0x034d, B:226:0x035e, B:229:0x0368, B:232:0x0372, B:233:0x0379, B:237:0x038a, B:240:0x0394, B:241:0x039b, B:244:0x03a5, B:245:0x03ac, B:248:0x03b6, B:249:0x03bd, B:252:0x03c7, B:253:0x03ce, B:256:0x03d8, B:257:0x03df, B:260:0x03e9, B:261:0x03f0, B:264:0x03fa, B:265:0x0401, B:282:0x0441, B:268:0x040b, B:271:0x0415, B:272:0x041c, B:275:0x0426, B:278:0x0430, B:279:0x0437, B:283:0x0448, B:286:0x0452, B:287:0x0459, B:290:0x0463, B:294:0x0474, B:298:0x0485, B:301:0x048f, B:302:0x0496, B:305:0x04a0, B:306:0x04a7, B:309:0x04b1, B:310:0x04b8, B:314:0x04c9, B:317:0x04d3, B:320:0x04dd, B:323:0x04e7, B:326:0x04f1, B:329:0x04fb, B:330:0x0502, B:336:0x0516, B:333:0x050c, B:337:0x051d, B:341:0x052e, B:344:0x0538, B:345:0x053f, B:348:0x0549, B:349:0x0550, B:352:0x055a, B:353:0x0561, B:356:0x056b, B:357:0x0572, B:360:0x057c, B:361:0x0583, B:364:0x058d, B:365:0x0594, B:368:0x059e, B:369:0x05a5, B:372:0x05af, B:373:0x05b6, B:376:0x05c0, B:377:0x05c7, B:381:0x05d8, B:384:0x05e2, B:385:0x05e9, B:388:0x05f3, B:389:0x05fa, B:392:0x0604, B:393:0x060b, B:396:0x0615, B:397:0x061c, B:400:0x0626, B:401:0x062d, B:404:0x0637, B:405:0x063e, B:409:0x064f, B:412:0x0659, B:413:0x0660, B:416:0x066a, B:417:0x0671, B:420:0x067b, B:422:0x067f, B:423:0x0686, B:424:0x068d, B:427:0x0697, B:429:0x069b, B:430:0x06a2, B:431:0x06a9, B:438:0x06c5, B:441:0x06cf, B:443:0x06d3, B:444:0x06da, B:445:0x06e1, B:448:0x06eb, B:450:0x06ef, B:451:0x06f6, B:452:0x06fd, B:455:0x0707, B:457:0x070b, B:458:0x0712, B:459:0x0719, B:462:0x0723, B:464:0x0727, B:465:0x072e, B:466:0x0735, B:469:0x073f, B:471:0x0743, B:472:0x074a, B:473:0x0751, B:476:0x075b, B:478:0x075f, B:479:0x0766, B:480:0x076d, B:483:0x0777, B:485:0x077b, B:486:0x0782, B:487:0x0789, B:490:0x0793, B:492:0x0797, B:493:0x079e, B:494:0x07a5, B:497:0x07af, B:499:0x07b3, B:500:0x07ba, B:501:0x07c1, B:504:0x07cb, B:505:0x07d2, B:509:0x07e3, B:513:0x07f4, B:516:0x07fe, B:519:0x0808, B:520:0x080f, B:524:0x0820, B:527:0x082a, B:528:0x0831, B:531:0x083b, B:533:0x083f, B:534:0x0846, B:535:0x084d, B:538:0x0857, B:540:0x085b, B:541:0x0862, B:542:0x0869, B:545:0x0873, B:547:0x0877, B:548:0x087e, B:549:0x0885, B:552:0x088f, B:554:0x0893, B:555:0x089a, B:556:0x08a1, B:559:0x08ab, B:561:0x08af, B:562:0x08b6, B:563:0x08bd, B:566:0x08c7, B:568:0x08cb, B:569:0x08d2, B:570:0x08d9, B:573:0x08e3, B:575:0x08e7, B:576:0x08ed, B:577:0x08f3, B:580:0x08fd, B:581:0x0903, B:584:0x090c, B:588:0x091b, B:591:0x0924, B:595:0x0933, B:606:0x0970), top: B:611:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:605:0x0950 A[Catch: Exception -> 0x09c0, TryCatch #0 {Exception -> 0x09c0, blocks: (B:3:0x0008, B:5:0x000c, B:7:0x0017, B:9:0x0025, B:11:0x0029, B:15:0x0033, B:17:0x0037, B:19:0x003b, B:21:0x003f, B:23:0x0043, B:25:0x0047, B:27:0x004b, B:30:0x0058, B:31:0x0062, B:32:0x006b, B:34:0x00a8, B:35:0x00ac, B:37:0x00b1, B:236:0x0383, B:599:0x0941, B:601:0x0947, B:605:0x0950, B:40:0x00bb, B:225:0x0357, B:43:0x00c5, B:313:0x04c2, B:46:0x00cf, B:49:0x00d9, B:107:0x019e, B:52:0x00e3, B:55:0x00ed, B:380:0x05d1, B:58:0x00f7, B:408:0x0648, B:61:0x0101, B:64:0x010b, B:67:0x0115, B:70:0x011f, B:598:0x093c, B:73:0x0129, B:195:0x02dd, B:76:0x0133, B:434:0x06b3, B:436:0x06b7, B:437:0x06be, B:79:0x013d, B:82:0x0147, B:83:0x014e, B:86:0x0158, B:89:0x0162, B:508:0x07dc, B:92:0x016c, B:512:0x07ed, B:95:0x0176, B:98:0x0180, B:587:0x0915, B:101:0x018a, B:104:0x0194, B:108:0x01a5, B:111:0x01af, B:523:0x0819, B:114:0x01b9, B:340:0x0527, B:117:0x01c3, B:120:0x01cd, B:123:0x01d7, B:126:0x01e1, B:129:0x01eb, B:130:0x01f2, B:183:0x02aa, B:133:0x01fc, B:136:0x0206, B:137:0x020d, B:293:0x046d, B:140:0x0217, B:143:0x0221, B:146:0x022b, B:149:0x0235, B:152:0x023f, B:155:0x0249, B:158:0x0253, B:161:0x025d, B:164:0x0267, B:167:0x0271, B:168:0x0278, B:171:0x0282, B:174:0x028c, B:177:0x0296, B:180:0x02a0, B:184:0x02b1, B:187:0x02bb, B:188:0x02c2, B:191:0x02cc, B:192:0x02d3, B:196:0x02e4, B:199:0x02ee, B:200:0x02f5, B:594:0x092d, B:203:0x02ff, B:297:0x047e, B:206:0x0309, B:209:0x0313, B:210:0x031a, B:213:0x0324, B:214:0x032b, B:217:0x0335, B:218:0x033c, B:221:0x0346, B:222:0x034d, B:226:0x035e, B:229:0x0368, B:232:0x0372, B:233:0x0379, B:237:0x038a, B:240:0x0394, B:241:0x039b, B:244:0x03a5, B:245:0x03ac, B:248:0x03b6, B:249:0x03bd, B:252:0x03c7, B:253:0x03ce, B:256:0x03d8, B:257:0x03df, B:260:0x03e9, B:261:0x03f0, B:264:0x03fa, B:265:0x0401, B:282:0x0441, B:268:0x040b, B:271:0x0415, B:272:0x041c, B:275:0x0426, B:278:0x0430, B:279:0x0437, B:283:0x0448, B:286:0x0452, B:287:0x0459, B:290:0x0463, B:294:0x0474, B:298:0x0485, B:301:0x048f, B:302:0x0496, B:305:0x04a0, B:306:0x04a7, B:309:0x04b1, B:310:0x04b8, B:314:0x04c9, B:317:0x04d3, B:320:0x04dd, B:323:0x04e7, B:326:0x04f1, B:329:0x04fb, B:330:0x0502, B:336:0x0516, B:333:0x050c, B:337:0x051d, B:341:0x052e, B:344:0x0538, B:345:0x053f, B:348:0x0549, B:349:0x0550, B:352:0x055a, B:353:0x0561, B:356:0x056b, B:357:0x0572, B:360:0x057c, B:361:0x0583, B:364:0x058d, B:365:0x0594, B:368:0x059e, B:369:0x05a5, B:372:0x05af, B:373:0x05b6, B:376:0x05c0, B:377:0x05c7, B:381:0x05d8, B:384:0x05e2, B:385:0x05e9, B:388:0x05f3, B:389:0x05fa, B:392:0x0604, B:393:0x060b, B:396:0x0615, B:397:0x061c, B:400:0x0626, B:401:0x062d, B:404:0x0637, B:405:0x063e, B:409:0x064f, B:412:0x0659, B:413:0x0660, B:416:0x066a, B:417:0x0671, B:420:0x067b, B:422:0x067f, B:423:0x0686, B:424:0x068d, B:427:0x0697, B:429:0x069b, B:430:0x06a2, B:431:0x06a9, B:438:0x06c5, B:441:0x06cf, B:443:0x06d3, B:444:0x06da, B:445:0x06e1, B:448:0x06eb, B:450:0x06ef, B:451:0x06f6, B:452:0x06fd, B:455:0x0707, B:457:0x070b, B:458:0x0712, B:459:0x0719, B:462:0x0723, B:464:0x0727, B:465:0x072e, B:466:0x0735, B:469:0x073f, B:471:0x0743, B:472:0x074a, B:473:0x0751, B:476:0x075b, B:478:0x075f, B:479:0x0766, B:480:0x076d, B:483:0x0777, B:485:0x077b, B:486:0x0782, B:487:0x0789, B:490:0x0793, B:492:0x0797, B:493:0x079e, B:494:0x07a5, B:497:0x07af, B:499:0x07b3, B:500:0x07ba, B:501:0x07c1, B:504:0x07cb, B:505:0x07d2, B:509:0x07e3, B:513:0x07f4, B:516:0x07fe, B:519:0x0808, B:520:0x080f, B:524:0x0820, B:527:0x082a, B:528:0x0831, B:531:0x083b, B:533:0x083f, B:534:0x0846, B:535:0x084d, B:538:0x0857, B:540:0x085b, B:541:0x0862, B:542:0x0869, B:545:0x0873, B:547:0x0877, B:548:0x087e, B:549:0x0885, B:552:0x088f, B:554:0x0893, B:555:0x089a, B:556:0x08a1, B:559:0x08ab, B:561:0x08af, B:562:0x08b6, B:563:0x08bd, B:566:0x08c7, B:568:0x08cb, B:569:0x08d2, B:570:0x08d9, B:573:0x08e3, B:575:0x08e7, B:576:0x08ed, B:577:0x08f3, B:580:0x08fd, B:581:0x0903, B:584:0x090c, B:588:0x091b, B:591:0x0924, B:595:0x0933, B:606:0x0970), top: B:611:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:612:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L0(boolean z10, boolean z11) {
        rr.b w7Var;
        y yVar;
        String str = this.f10545w;
        try {
            TemplateModel templateModel = this.f10547y;
            if (templateModel == null) {
                Utils.INSTANCE.showCustomToast(this, "Something went wrong, please try again");
                finish();
                return;
            }
            boolean z12 = false;
            if (this.C >= templateModel.getTemplate().size()) {
                CourseDayModelV1 courseDayModelV1 = this.H;
                if (courseDayModelV1 != null && courseDayModelV1.getPosition() == 3) {
                    z12 = true;
                }
                if (z12 && this.f10548z == null && this.E) {
                    v0();
                } else {
                    w0();
                }
            } else if (this.C < 0) {
                finish();
            } else {
                y yVar2 = this.B;
                i.d(yVar2);
                androidx.fragment.app.a d10 = yVar2.d();
                if (z11) {
                    if (z10) {
                        d10.g(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit);
                    } else {
                        d10.g(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit);
                    }
                }
                StringBuilder sb2 = new StringBuilder("screenn ");
                TemplateModel templateModel2 = this.f10547y;
                i.d(templateModel2);
                sb2.append(templateModel2.getTemplate().get(this.C).getSlug());
                Log.d("TemplateTag", sb2.toString());
                TemplateModel templateModel3 = this.f10547y;
                i.d(templateModel3);
                String slug = templateModel3.getTemplate().get(this.C).getSlug();
                if (slug != null) {
                    switch (slug.hashCode()) {
                        case -955847334:
                            if (!slug.equals("s118-b")) {
                                break;
                            }
                            w7Var = new w4();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null && !yVar.O()) {
                                z12 = true;
                            }
                            if (!z12) {
                                String valueOf = String.valueOf(Calendar.getInstance().getTimeInMillis());
                                rr.b bVar = this.G;
                                i.d(bVar);
                                d10.f(R.id.root_frame_layout, bVar, valueOf);
                                d10.j();
                                this.L.add(valueOf);
                                return;
                            }
                            return;
                        case -955762766:
                            if (!slug.equals("s143-b")) {
                                break;
                            }
                            w7Var = new q5();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                                z12 = true;
                                break;
                            }
                            if (!z12) {
                            }
                            break;
                        case -955762765:
                            if (!slug.equals("s143-c")) {
                                break;
                            }
                            w7Var = new q5();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case -955758923:
                            if (!slug.equals("s147-a")) {
                                break;
                            }
                            w7Var = new f8();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case -955758922:
                            if (!slug.equals("s147-b")) {
                                break;
                            }
                            w7Var = new f8();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case -571298611:
                            if (!slug.equals("pomodoro-countdown")) {
                                break;
                            } else {
                                w7Var = new w7();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 3583:
                            if (!slug.equals("r1")) {
                                break;
                            } else {
                                if (this.W) {
                                    w7Var = new i1();
                                } else {
                                    w7Var = new g1();
                                }
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 3584:
                            if (!slug.equals("r2")) {
                                break;
                            } else {
                                if (this.W) {
                                    w7Var = new q2();
                                } else {
                                    w7Var = new o2();
                                }
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 3585:
                            if (!slug.equals("r3")) {
                                break;
                            } else {
                                if (this.W) {
                                    w7Var = new a3();
                                } else {
                                    w7Var = new y2();
                                }
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 3586:
                            if (!slug.equals("r4")) {
                                break;
                            } else {
                                if (this.W) {
                                    w7Var = new h3();
                                } else {
                                    w7Var = new f3();
                                }
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 3587:
                            if (!slug.equals("r5")) {
                                break;
                            } else {
                                if (this.W) {
                                    w7Var = new m3();
                                } else {
                                    w7Var = new l3();
                                }
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 3589:
                            if (!slug.equals("r7")) {
                                break;
                            } else {
                                if (this.W) {
                                    w7Var = new x3();
                                } else {
                                    w7Var = new v3();
                                }
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 3590:
                            if (!slug.equals("r8")) {
                                break;
                            } else {
                                if (this.W) {
                                    w7Var = new b4();
                                } else {
                                    w7Var = new z3();
                                }
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 3614:
                            if (!slug.equals("s1")) {
                                break;
                            } else {
                                w7Var = new p6();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 3615:
                            if (!slug.equals("s2")) {
                                break;
                            }
                            w7Var = new e7();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3616:
                            if (!slug.equals("s3")) {
                                break;
                            } else {
                                w7Var = new t7();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 3618:
                            if (!slug.equals("s5")) {
                                break;
                            }
                            w7Var = new f8();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3619:
                            if (!slug.equals("s6")) {
                                break;
                            }
                            w7Var = new t8();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3621:
                            if (!slug.equals("s8")) {
                                break;
                            }
                            w7Var = new m9();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3622:
                            if (!slug.equals("s9")) {
                                break;
                            } else {
                                w7Var = new ka();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 111124:
                            if (!slug.equals("r13")) {
                                break;
                            } else {
                                if (this.W) {
                                    w7Var = new h0();
                                } else {
                                    w7Var = new e0();
                                }
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 111125:
                            if (!slug.equals("r14")) {
                                break;
                            } else {
                                if (this.W) {
                                    w7Var = new k0();
                                } else {
                                    w7Var = new j0();
                                }
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 111126:
                            if (!slug.equals("r15")) {
                                break;
                            } else {
                                if (this.W) {
                                    w7Var = new n0();
                                } else {
                                    w7Var = new l0();
                                }
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 111127:
                            if (!slug.equals("r16")) {
                                break;
                            } else {
                                if (this.W) {
                                    w7Var = new s0();
                                } else {
                                    w7Var = new q0();
                                }
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 111128:
                            if (!slug.equals("r17")) {
                                break;
                            } else {
                                if (this.W) {
                                    w7Var = new w0();
                                } else {
                                    w7Var = new v0();
                                }
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 111129:
                            if (!slug.equals("r18")) {
                                break;
                            } else {
                                if (this.W) {
                                    w7Var = new a1();
                                } else {
                                    w7Var = new y0();
                                }
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 111130:
                            if (!slug.equals("r19")) {
                                break;
                            } else {
                                if (this.W) {
                                    w7Var = new d1();
                                } else {
                                    w7Var = new c1();
                                }
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 111152:
                            if (!slug.equals("r20")) {
                                break;
                            } else {
                                if (this.W) {
                                    w7Var = new m1();
                                } else {
                                    w7Var = new l1();
                                }
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 111153:
                            if (!slug.equals("r21")) {
                                break;
                            } else {
                                if (this.W) {
                                    w7Var = new r1();
                                } else {
                                    w7Var = new p1();
                                }
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 111154:
                            if (!slug.equals("r22")) {
                                break;
                            }
                            if (!this.W) {
                                w7Var = new w1();
                            } else {
                                w7Var = new u1();
                            }
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 111157:
                            if (!slug.equals("r25")) {
                                break;
                            } else {
                                if (this.W) {
                                    w7Var = new d2();
                                } else {
                                    w7Var = new z1();
                                }
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 111158:
                            if (!slug.equals("r26")) {
                                break;
                            } else {
                                if (this.W) {
                                    w7Var = new h2();
                                } else {
                                    w7Var = new f2();
                                }
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 111161:
                            if (!slug.equals("r29")) {
                                break;
                            } else {
                                w7Var = new n2();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 112082:
                            if (!slug.equals("s10")) {
                                break;
                            } else {
                                w7Var = new p4();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 112084:
                            if (!slug.equals("s12")) {
                                break;
                            }
                            w7Var = new i5();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 112085:
                            if (!slug.equals("s13")) {
                                break;
                            } else {
                                w7Var = new p5();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 112086:
                            if (!slug.equals("s14")) {
                                break;
                            } else {
                                w7Var = new w5();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 112087:
                            if (!slug.equals("s15")) {
                                break;
                            } else {
                                w7Var = new c6();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 112088:
                            if (!slug.equals("s16")) {
                                break;
                            } else {
                                w7Var = new e6();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 112090:
                            if (!slug.equals("s18")) {
                                break;
                            } else {
                                w7Var = new h6();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 112091:
                            if (!slug.equals("s19")) {
                                break;
                            } else {
                                w7Var = new j6();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 112115:
                            if (!slug.equals("s22")) {
                                break;
                            }
                            w7Var = new r6();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 112116:
                            if (!slug.equals("s23")) {
                                break;
                            } else {
                                w7Var = new s6();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 112117:
                            if (!slug.equals("s24")) {
                                break;
                            } else {
                                w7Var = new u6();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 112118:
                            if (!slug.equals("s25")) {
                                break;
                            } else {
                                w7Var = new x6();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 112121:
                            if (!slug.equals("s28")) {
                                break;
                            } else {
                                w7Var = new y6();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 112122:
                            if (!slug.equals("s29")) {
                                break;
                            } else {
                                w7Var = new c7();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 112144:
                            if (!slug.equals("s30")) {
                                break;
                            } else {
                                w7Var = new g7();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 112145:
                            if (!slug.equals("s31")) {
                                break;
                            } else {
                                w7Var = new h7();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 112146:
                            if (!slug.equals("s32")) {
                                break;
                            } else {
                                w7Var = new j7();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 112148:
                            if (!slug.equals("s34")) {
                                break;
                            } else {
                                w7Var = new q7();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 112151:
                            if (!slug.equals("s37")) {
                                break;
                            }
                            w7Var = new z7();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 112152:
                            if (!slug.equals("s38")) {
                                break;
                            }
                            w7Var = new s7();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 112153:
                            if (!slug.equals("s39")) {
                                break;
                            }
                            w7Var = new s7();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 112176:
                            if (!slug.equals("s41")) {
                                break;
                            } else {
                                w7Var = new w7();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 112180:
                            if (!slug.equals("s45")) {
                                break;
                            }
                            w7Var = new z7();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 112207:
                            if (!slug.equals("s51")) {
                                break;
                            }
                            w7Var = new z7();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 112211:
                            if (!slug.equals("s55")) {
                                break;
                            }
                            w7Var = new z7();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 112212:
                            if (!slug.equals("s56")) {
                                break;
                            }
                            w7Var = new z7();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 112215:
                            if (!slug.equals("s59")) {
                                break;
                            }
                            w7Var = new c8();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 112237:
                            if (!slug.equals("s60")) {
                                break;
                            } else {
                                w7Var = new j8();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 112238:
                            if (!slug.equals("s61")) {
                                break;
                            } else {
                                w7Var = new j8();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 112241:
                            if (!slug.equals("s64")) {
                                break;
                            } else {
                                w7Var = new j0();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 112243:
                            if (!slug.equals("s66")) {
                                break;
                            }
                            w7Var = new o8();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 112245:
                            if (!slug.equals("s68")) {
                                break;
                            }
                            w7Var = new s8();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 112256:
                            if (!slug.equals("s5b")) {
                                break;
                            }
                            w7Var = new f8();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 112274:
                            if (!slug.equals("s76")) {
                                break;
                            } else {
                                w7Var = new u8();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 112275:
                            if (!slug.equals("s77")) {
                                break;
                            }
                            w7Var = new w8();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 112276:
                            if (!slug.equals("s78")) {
                                break;
                            } else {
                                w7Var = new y8();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 112287:
                            if (!slug.equals("s6b")) {
                                break;
                            }
                            w7Var = new t8();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 112299:
                            if (!slug.equals("s80")) {
                                break;
                            } else {
                                w7Var = new a9();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 112300:
                            if (!slug.equals("s81")) {
                                break;
                            }
                            w7Var = new w8();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 112301:
                            if (!slug.equals("s82")) {
                                break;
                            } else {
                                w7Var = new b9();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 112303:
                            if (!slug.equals("s84")) {
                                break;
                            } else {
                                w7Var = new f9();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 112305:
                            if (!slug.equals("s86")) {
                                break;
                            } else {
                                w7Var = new g9();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 112306:
                            if (!slug.equals("s87")) {
                                break;
                            } else {
                                w7Var = new h9();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 112307:
                            if (!slug.equals("s88")) {
                                break;
                            } else {
                                w7Var = new i9();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 112308:
                            if (!slug.equals("s89")) {
                                break;
                            } else {
                                w7Var = new k9();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 112331:
                            if (!slug.equals("s91")) {
                                break;
                            } else {
                                w7Var = new n9();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 112332:
                            if (!slug.equals("s92")) {
                                break;
                            }
                            w7Var = new s9();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 112336:
                            if (!slug.equals("s96")) {
                                break;
                            } else {
                                w7Var = new ba();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 112349:
                            if (!slug.equals("s8b")) {
                                break;
                            }
                            w7Var = new m9();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3474593:
                            if (!slug.equals("s103")) {
                                break;
                            }
                            w7Var = new t9();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3474596:
                            if (!slug.equals("s106")) {
                                break;
                            } else {
                                w7Var = new j4();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 3474598:
                            if (!slug.equals("s108")) {
                                break;
                            } else {
                                w7Var = new k4();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 3474624:
                            if (!slug.equals("s113")) {
                                break;
                            } else {
                                w7Var = new r4();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 3474625:
                            if (!slug.equals("s114")) {
                                break;
                            } else {
                                w7Var = new s4();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 3474626:
                            if (!slug.equals("s115")) {
                                break;
                            }
                            w7Var = new o8();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3474627:
                            if (!slug.equals("s116")) {
                                break;
                            }
                            w7Var = new q5();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3474628:
                            if (!slug.equals("s117")) {
                                break;
                            } else {
                                w7Var = new t4();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 3474640:
                            if (!slug.equals("s10b")) {
                                break;
                            }
                            w7Var = new n4();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3474654:
                            if (!slug.equals("s122")) {
                                break;
                            } else {
                                w7Var = new c5();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 3474655:
                            if (!slug.equals("s123")) {
                                break;
                            } else {
                                w7Var = new e5();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 3474657:
                            if (!slug.equals("s125")) {
                                break;
                            }
                            w7Var = new f5();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3474660:
                            if (!slug.equals("s128")) {
                                break;
                            }
                            w7Var = new z7();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3474661:
                            if (!slug.equals("s129")) {
                                break;
                            }
                            w7Var = new i5();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3474684:
                            if (!slug.equals("s131")) {
                                break;
                            }
                            w7Var = new m9();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3474687:
                            if (!slug.equals("s134")) {
                                break;
                            }
                            w7Var = new m9();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3474689:
                            if (!slug.equals("s136")) {
                                break;
                            } else {
                                w7Var = new k5();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 3474691:
                            if (!slug.equals("s138")) {
                                break;
                            }
                            w7Var = new z7();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3474692:
                            if (!slug.equals("s139")) {
                                break;
                            }
                            w7Var = new z7();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3474702:
                            if (!slug.equals("s12b")) {
                                break;
                            }
                            w7Var = new i5();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3474704:
                            if (!slug.equals("s12d")) {
                                break;
                            }
                            w7Var = new i5();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3474705:
                            if (!slug.equals("s12e")) {
                                break;
                            }
                            w7Var = new i5();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3474714:
                            if (!slug.equals("s140")) {
                                break;
                            }
                            w7Var = new z7();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3474715:
                            if (!slug.equals("s141")) {
                                break;
                            }
                            w7Var = new z7();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3474716:
                            if (!slug.equals("s142")) {
                                break;
                            }
                            w7Var = new z7();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3474718:
                            if (!slug.equals("s144")) {
                                break;
                            }
                            w7Var = new s8();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3474719:
                            if (!slug.equals("s145")) {
                                break;
                            } else {
                                w7Var = new s5();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 3474720:
                            if (!slug.equals("s146")) {
                                break;
                            }
                            w7Var = new f5();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3474722:
                            if (!slug.equals("s148")) {
                                break;
                            } else {
                                w7Var = new v5();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 3474745:
                            if (!slug.equals("s150")) {
                                break;
                            }
                            w7Var = new z7();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3474746:
                            if (!slug.equals("s151")) {
                                break;
                            }
                            w7Var = new z7();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3474747:
                            if (!slug.equals("s152")) {
                                break;
                            }
                            w7Var = new z7();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3474749:
                            if (!slug.equals("s154")) {
                                break;
                            }
                            w7Var = new z7();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3475508:
                            if (!slug.equals("s2-b")) {
                                break;
                            }
                            w7Var = new e7();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3475663:
                            if (!slug.equals("s22b")) {
                                break;
                            }
                            w7Var = new r6();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3475849:
                            if (!slug.equals("s28b")) {
                                break;
                            }
                            w7Var = new z6();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3475850:
                            if (!slug.equals("s28c")) {
                                break;
                            }
                            w7Var = new z6();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3478391:
                            if (!slug.equals("s5-b")) {
                                break;
                            }
                            w7Var = new f8();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3478763:
                            if (!slug.equals("s59b")) {
                                break;
                            }
                            w7Var = new c8();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3479352:
                            if (!slug.equals("s6-b")) {
                                break;
                            }
                            w7Var = new t8();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3481274:
                            if (!slug.equals("s8-b")) {
                                break;
                            }
                            w7Var = new m9();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3482390:
                            if (!slug.equals("s92b")) {
                                break;
                            }
                            w7Var = new t9();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 3482392:
                            if (!slug.equals("s92d")) {
                                break;
                            }
                            w7Var = new s9();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 51973780:
                            if (!slug.equals("top-select-self-confidence-recommendation")) {
                                break;
                            } else {
                                w7Var = new l3();
                                this.G = w7Var;
                                yVar = this.B;
                                if (yVar != null) {
                                }
                                if (!z12) {
                                }
                            }
                            break;
                        case 106820487:
                            if (!slug.equals("r22-b")) {
                                break;
                            }
                            if (!this.W) {
                            }
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 107712295:
                            if (!slug.equals("s10-b")) {
                                break;
                            }
                            w7Var = new n4();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 107713597:
                            if (!slug.equals("s118b")) {
                                break;
                            }
                            w7Var = new w4();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 107714217:
                            if (!slug.equals("s12-b")) {
                                break;
                            }
                            w7Var = new i5();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 107714218:
                            if (!slug.equals("s12-c")) {
                                break;
                            }
                            w7Var = new i5();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 107714219:
                            if (!slug.equals("s12-d")) {
                                break;
                            }
                            w7Var = new i5();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 107714220:
                            if (!slug.equals("s12-e")) {
                                break;
                            }
                            w7Var = new i5();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 107744008:
                            if (!slug.equals("s22-b")) {
                                break;
                            }
                            w7Var = new r6();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 107749774:
                            if (!slug.equals("s28-b")) {
                                break;
                            }
                            w7Var = new z6();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 107749775:
                            if (!slug.equals("s28-c")) {
                                break;
                            }
                            w7Var = new z6();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 107840108:
                            if (!slug.equals("s59-b")) {
                                break;
                            }
                            w7Var = new c8();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 107840109:
                            if (!slug.equals("s59-c")) {
                                break;
                            }
                            w7Var = new c8();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 107952545:
                            if (!slug.equals("s92-b")) {
                                break;
                            }
                            w7Var = new t9();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                        case 107952547:
                            if (!slug.equals("s92-d")) {
                                break;
                            }
                            w7Var = new s9();
                            this.G = w7Var;
                            yVar = this.B;
                            if (yVar != null) {
                            }
                            if (!z12) {
                            }
                            break;
                    }
                }
                LogHelper logHelper = LogHelper.INSTANCE;
                StringBuilder sb3 = new StringBuilder("screen not found ");
                TemplateModel templateModel4 = this.f10547y;
                i.d(templateModel4);
                sb3.append(templateModel4.getTemplate().get(this.C).getSlug());
                String sb4 = sb3.toString();
                StringBuilder sb5 = new StringBuilder("Screen not found ");
                TemplateModel templateModel5 = this.f10547y;
                i.d(templateModel5);
                sb5.append(templateModel5.getTemplate().get(this.C).getSlug());
                logHelper.e(str, sb4, new Exception(sb5.toString()));
                finish();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(str, e10);
        }
    }

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        boolean z10;
        boolean z11;
        rr.b bVar;
        androidx.fragment.app.a aVar;
        Fragment F;
        try {
            rr.b bVar2 = this.G;
            if (bVar2 != null && bVar2.I()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.J = true;
                y yVar = this.B;
                if (yVar != null && yVar.H() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    Utils.INSTANCE.setClearingFragmentBackStack(false);
                    y yVar2 = this.B;
                    if (yVar2 != null) {
                        yVar2.W();
                    }
                    ArrayList<String> arrayList = this.L;
                    arrayList.remove(u.o2(arrayList));
                    y yVar3 = this.B;
                    if (yVar3 != null && arrayList.size() > 0 && (F = yVar3.F((String) u.o2(arrayList))) != null) {
                        this.G = (rr.b) F;
                        return;
                    }
                    return;
                }
                rr.b bVar3 = this.G;
                if (bVar3 != null) {
                    bVar = bVar3.F();
                } else {
                    bVar = null;
                }
                if (bVar == null) {
                    int i6 = this.C - 1;
                    this.C = i6;
                    if (i6 < this.D) {
                        o0();
                        this.C++;
                        return;
                    }
                    L0(true, true);
                    return;
                }
                this.G = bVar;
                y yVar4 = this.B;
                if (yVar4 != null) {
                    aVar = new androidx.fragment.app.a(yVar4);
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    aVar.h(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, 0, 0);
                }
                if (aVar != null) {
                    rr.b bVar4 = this.G;
                    i.d(bVar4);
                    aVar.f(R.id.root_frame_layout, bVar4, null);
                }
                if (aVar != null) {
                    aVar.j();
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10545w, "exception", e10);
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            setContentView(R.layout.activity_template);
            this.f10546x = new ProgressDialogUtil(this);
            this.U = (d) new o0(this, new c(new sp.b())).a(d.class);
            this.V = (fm.a) new o0(this, new kk.c(MyApplication.V.a(), new fm.j0())).a(fm.a.class);
            this.B = getSupportFragmentManager();
            this.F.put("list", new ArrayList());
            if (getIntent().hasExtra("source")) {
                if (i.b(getIntent().getStringExtra("source"), "goals")) {
                    String stringExtra = getIntent().getStringExtra("goalId");
                    if (stringExtra != null) {
                        ProgressDialogUtil progressDialogUtil = this.f10546x;
                        if (progressDialogUtil != null) {
                            progressDialogUtil.show();
                        }
                        if (i.b(stringExtra, "uL13cTwsJ3cN4MT7GCpZ")) {
                            FireStoreUtilsKt.fetchCourseContent("en", stringExtra, new d0(this));
                        } else {
                            FireStoreUtilsKt.checkIfActivityPublished(stringExtra, new g0(stringExtra, this));
                        }
                    }
                    boolean booleanExtra = getIntent().getBooleanExtra("topicalGoalsClick", false);
                    this.O = booleanExtra;
                    if (booleanExtra) {
                        this.W = false;
                    }
                } else if (i.b(getIntent().getStringExtra("source"), "topical_course")) {
                    this.O = true;
                    this.W = false;
                    Bundle extras = getIntent().getExtras();
                    if (extras != null) {
                        Serializable serializable = extras.getSerializable("day_plan");
                        i.e(serializable, "null cannot be cast to non-null type com.theinnerhour.b2b.model.CourseDayModelV1");
                        this.H = (CourseDayModelV1) serializable;
                        this.I = extras.getBoolean("show_result", false);
                        if (extras.containsKey("miniCourse")) {
                            String string = extras.getString("miniCourse");
                            i.d(string);
                            this.M = string;
                        }
                    } else {
                        finish();
                    }
                    G0();
                }
            } else {
                Bundle extras2 = getIntent().getExtras();
                if (extras2 != null) {
                    Serializable serializable2 = extras2.getSerializable("day_plan");
                    i.e(serializable2, "null cannot be cast to non-null type com.theinnerhour.b2b.model.CourseDayModelV1");
                    this.H = (CourseDayModelV1) serializable2;
                    this.I = extras2.getBoolean("show_result", false);
                    if (extras2.containsKey("miniCourse")) {
                        String string2 = extras2.getString("miniCourse");
                        i.d(string2);
                        this.M = string2;
                    }
                } else {
                    finish();
                }
                if (getIntent().hasExtra("type")) {
                    this.N = true;
                }
                G0();
            }
            if (getIntent().hasExtra("goalSource")) {
                String stringExtra2 = getIntent().getStringExtra("goalSource");
                if (stringExtra2 == null) {
                    stringExtra2 = "";
                }
                this.T = stringExtra2;
            }
            if (getIntent().hasExtra("mcCourse")) {
                this.f10548z = getIntent().getStringExtra("mcCourse");
            }
            if (getIntent().hasExtra("mcCourseId")) {
                this.A = getIntent().getStringExtra("mcCourseId");
            }
            y supportFragmentManager = getSupportFragmentManager();
            c0 c0Var = new c0(this, 0);
            if (supportFragmentManager.f2316m == null) {
                supportFragmentManager.f2316m = new ArrayList<>();
            }
            supportFragmentManager.f2316m.add(c0Var);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10545w, "Exception in on create", e10);
        }
    }

    @Override // rr.a
    public final void r0(rr.b bVar) {
        androidx.fragment.app.a aVar;
        this.J = false;
        this.G = bVar;
        y yVar = this.B;
        if (yVar != null) {
            aVar = new androidx.fragment.app.a(yVar);
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        }
        String valueOf = String.valueOf(Calendar.getInstance().getTimeInMillis());
        if (aVar != null) {
            rr.b bVar2 = this.G;
            i.d(bVar2);
            aVar.f(R.id.root_frame_layout, bVar2, valueOf);
        }
        if (aVar != null) {
            aVar.j();
        }
        ArrayList<String> arrayList = this.L;
        if (arrayList.size() > 0) {
            arrayList.remove(u.o2(arrayList));
        }
        arrayList.add(valueOf);
    }

    @Override // rr.a
    public final void s0(rr.b bVar) {
        androidx.fragment.app.a aVar;
        this.J = false;
        this.G = bVar;
        y yVar = this.B;
        if (yVar != null) {
            aVar = new androidx.fragment.app.a(yVar);
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
        }
        String valueOf = String.valueOf(Calendar.getInstance().getTimeInMillis());
        if (aVar != null) {
            rr.b bVar2 = this.G;
            i.d(bVar2);
            aVar.f(R.id.root_frame_layout, bVar2, valueOf);
        }
        if (aVar != null) {
            aVar.d(null);
        }
        if (aVar != null) {
            aVar.j();
        }
        this.L.add(valueOf);
    }

    @Override // rr.a
    public final void t0() {
        boolean z10;
        if (this.I) {
            while (true) {
                TemplateModel templateModel = this.f10547y;
                i.d(templateModel);
                if (templateModel.getTemplate().get(this.C).getResult_screen()) {
                    break;
                }
                this.C++;
            }
            if (this.D == 0) {
                this.D = this.C;
            }
        } else {
            this.C++;
        }
        this.J = false;
        ArrayList<String> arrayList = this.L;
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            y yVar = this.B;
            i.d(yVar);
            Fragment F = yVar.F(it.next());
            if (F != null) {
                F.setReturnTransition(null);
            }
        }
        arrayList.clear();
        y yVar2 = this.B;
        if (yVar2 != null && yVar2.H() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            Utils.INSTANCE.setClearingFragmentBackStack(true);
        }
        y yVar3 = this.B;
        if (yVar3 != null) {
            yVar3.X(null);
        }
        L0(false, true);
    }

    public final void v0() {
        CourseDayModelV1 courseDayModelV1 = this.H;
        if (courseDayModelV1 != null) {
            NpsPersistence npsPersistence = NpsPersistence.INSTANCE;
            String courseName = rr.a.q0();
            i.f(courseName, "courseName");
            if (!npsPersistence.isNpsForMainPlanDayComplete(courseName, courseDayModelV1.getPosition())) {
                String courseName2 = rr.a.q0();
                i.f(courseName2, "courseName");
                npsPersistence.updateMainPlanDayNps(courseName2, courseDayModelV1.getPosition(), true);
                if (npsPersistence.isNpsSlotAvailable()) {
                    this.C--;
                    this.G = new hr.y();
                    NpsPersistence.updateNpsSlot$default(npsPersistence, false, 1, null);
                    y yVar = this.B;
                    i.d(yVar);
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
                    aVar.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
                    String valueOf = String.valueOf(Calendar.getInstance().getTimeInMillis());
                    rr.b bVar = this.G;
                    i.d(bVar);
                    aVar.f(R.id.root_frame_layout, bVar, valueOf);
                    aVar.j();
                    this.L.add(valueOf);
                    return;
                }
                w0();
                return;
            }
            w0();
        }
    }

    public final void w0() {
        Intent intent = new Intent();
        intent.putExtra("showSelling", this.E);
        setResult(-1, intent);
        finish();
    }

    public final void x0() {
        Intent intent = new Intent();
        intent.putExtra("temp_data", this.F);
        intent.putExtra(Constants.DAYMODEL_POSITION, this.C);
        setResult(-1, intent);
        int i6 = f0.a.f14598c;
        a.c.a(this);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006a -> B:21:0x006b). Please submit an issue!!! */
    public final Goal y0() {
        try {
            if (this.f10547y != null) {
                if (this.O) {
                    for (Goal goal : FirebasePersistence.getInstance().getTopicalGoals()) {
                        TemplateModel templateModel = this.f10547y;
                        i.d(templateModel);
                        if (i.b(templateModel.getLabel(), goal.getGoalId())) {
                            return goal;
                        }
                    }
                } else {
                    for (Goal goal2 : FirebasePersistence.getInstance().getUserGoals()) {
                        TemplateModel templateModel2 = this.f10547y;
                        i.d(templateModel2);
                        if (i.b(templateModel2.getLabel(), goal2.getGoalId())) {
                            return goal2;
                        }
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10545w, "exception in get goal", e10);
        }
        return null;
    }

    public final String z0() {
        TemplateModel templateModel = this.f10547y;
        i.d(templateModel);
        return templateModel.getLogScreenTitle();
    }
}
