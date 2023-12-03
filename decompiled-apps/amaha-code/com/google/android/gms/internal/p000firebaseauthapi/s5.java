package com.google.android.gms.internal.p000firebaseauthapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ca.a;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.BotPwaActivity;
import com.theinnerhour.b2b.activity.WebviewActivity;
import com.theinnerhour.b2b.components.chat.model.ChatUser;
import com.theinnerhour.b2b.components.community.activity.CommunitiesPwaActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.NewDashboardSavedItemsActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.NotV4RecentActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.SuggestedActivityDetailsActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.model.SuggestedActivityModel;
import com.theinnerhour.b2b.components.expertCare.activity.ExpertCareInfoActivity;
import com.theinnerhour.b2b.components.goals.activity.FirestoreGoalsActivity;
import com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity;
import com.theinnerhour.b2b.components.journal.activity.JournalActivity;
import com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentProfileActivity;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.model.CourseDayDomainModelV1;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.PaymentUtils;
import com.theinnerhour.b2b.utils.RoutingIntentHandler;
import com.theinnerhour.b2b.utils.RoutingType;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import fm.y0;
import hs.f;
import is.u;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.e0;
import org.json.JSONObject;
import pp.c;
import r1.b0;
import sp.b;
import tr.r;
import v9.o;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.s5  reason: invalid package */
/* loaded from: classes.dex */
public final class s5 implements je {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f8125u;

    /* renamed from: v  reason: collision with root package name */
    public String f8126v;

    public /* synthetic */ s5(String str, int i6, int i10) {
        this.f8125u = i6;
        this.f8126v = str;
    }

    public static final Integer a(s5 s5Var) {
        String g5 = b.g();
        if (g5 != null) {
            switch (g5.hashCode()) {
                case -2114782937:
                    if (g5.equals(Constants.COURSE_HAPPINESS)) {
                        return Integer.valueOf((int) R.raw.happiness_suggested);
                    }
                    break;
                case -1617042330:
                    if (g5.equals(Constants.COURSE_DEPRESSION)) {
                        return Integer.valueOf((int) R.raw.depression_suggested);
                    }
                    break;
                case -891989580:
                    if (g5.equals(Constants.COURSE_STRESS)) {
                        return Integer.valueOf((int) R.raw.stress_suggested);
                    }
                    break;
                case 92960775:
                    if (g5.equals(Constants.COURSE_ANGER)) {
                        return Integer.valueOf((int) R.raw.anger_suggested);
                    }
                    break;
                case 109522647:
                    if (g5.equals(Constants.COURSE_SLEEP)) {
                        return Integer.valueOf((int) R.raw.sleep_suggested);
                    }
                    break;
                case 113319009:
                    if (g5.equals(Constants.COURSE_WORRY)) {
                        return Integer.valueOf((int) R.raw.worry_suggested);
                    }
                    break;
            }
        }
        return null;
    }

    public static ArrayList c(String str, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CourseDayModelV1 dayPlan = (CourseDayModelV1) it.next();
            i.f(dayPlan, "dayPlan");
            arrayList2.add(new CourseDayDomainModelV1(dayPlan, str, null, 4, null));
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r1.equals(com.theinnerhour.b2b.utils.Constants.COURSE_ANGER) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
        if (r1.equals(com.theinnerhour.b2b.utils.Constants.COURSE_STRESS) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
        if (r1.equals(com.theinnerhour.b2b.utils.Constants.COURSE_DEPRESSION) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String d(String str) {
        String str2;
        if (str != null) {
            switch (str.hashCode()) {
                case -2114782937:
                    if (str.equals(Constants.COURSE_HAPPINESS)) {
                        return "general well-being";
                    }
                    break;
                case -1617042330:
                    str2 = Constants.COURSE_DEPRESSION;
                    break;
                case -891989580:
                    str2 = Constants.COURSE_STRESS;
                    break;
                case 92960775:
                    str2 = Constants.COURSE_ANGER;
                    break;
                case 109522647:
                    if (str.equals(Constants.COURSE_SLEEP)) {
                        return "sleep disturbances";
                    }
                    break;
                case 113319009:
                    if (str.equals(Constants.COURSE_WORRY)) {
                        return "anxiety";
                    }
                    break;
            }
        }
        return "";
    }

    public static Integer e(String str) {
        switch (str.hashCode()) {
            case -2114782937:
                if (str.equals(Constants.COURSE_HAPPINESS)) {
                    return Integer.valueOf((int) R.color.newDbDomainHappinessCardBg);
                }
                break;
            case -1617042330:
                if (str.equals(Constants.COURSE_DEPRESSION)) {
                    return Integer.valueOf((int) R.color.newDbDomainDepressionCardBg);
                }
                break;
            case -891989580:
                if (str.equals(Constants.COURSE_STRESS)) {
                    return Integer.valueOf((int) R.color.newDbDomainStressCardBg);
                }
                break;
            case 92960775:
                if (str.equals(Constants.COURSE_ANGER)) {
                    return Integer.valueOf((int) R.color.newDbDomainAngerCardBg);
                }
                break;
            case 109522647:
                if (str.equals(Constants.COURSE_SLEEP)) {
                    return Integer.valueOf((int) R.color.newDbDomainSleepCardBg);
                }
                break;
            case 113319009:
                if (str.equals(Constants.COURSE_WORRY)) {
                    return Integer.valueOf((int) R.color.newDbDomainAnxietyCardBg);
                }
                break;
        }
        return null;
    }

    public static Integer f(String str) {
        switch (str.hashCode()) {
            case -2114782937:
                if (str.equals(Constants.COURSE_HAPPINESS)) {
                    return Integer.valueOf((int) R.color.newDbDomainHappiness);
                }
                break;
            case -1617042330:
                if (str.equals(Constants.COURSE_DEPRESSION)) {
                    return Integer.valueOf((int) R.color.newDbDomainDepression);
                }
                break;
            case -891989580:
                if (str.equals(Constants.COURSE_STRESS)) {
                    return Integer.valueOf((int) R.color.newDbDomainStress);
                }
                break;
            case 92960775:
                if (str.equals(Constants.COURSE_ANGER)) {
                    return Integer.valueOf((int) R.color.newDbDomainAnger);
                }
                break;
            case 109522647:
                if (str.equals(Constants.COURSE_SLEEP)) {
                    return Integer.valueOf((int) R.color.newDbDomainSleep);
                }
                break;
            case 113319009:
                if (str.equals(Constants.COURSE_WORRY)) {
                    return Integer.valueOf((int) R.color.newDbDomainAnxiety);
                }
                break;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:346:0x06ab A[Catch: Exception -> 0x0773, TryCatch #0 {Exception -> 0x0773, blocks: (B:4:0x001b, B:8:0x0068, B:11:0x0072, B:395:0x0777, B:12:0x007b, B:15:0x0085, B:17:0x008e, B:19:0x0094, B:20:0x009c, B:23:0x00a4, B:24:0x00ae, B:27:0x00b8, B:29:0x00c2, B:31:0x00c8, B:33:0x00d1, B:35:0x00db, B:36:0x00eb, B:39:0x00f5, B:40:0x00ff, B:43:0x0109, B:45:0x011b, B:47:0x012d, B:51:0x0144, B:52:0x0156, B:55:0x0160, B:57:0x016f, B:59:0x0177, B:61:0x017d, B:63:0x0183, B:64:0x0189, B:67:0x0193, B:69:0x01a2, B:71:0x01aa, B:72:0x01b0, B:75:0x01ba, B:76:0x01c4, B:79:0x01ce, B:80:0x01d8, B:83:0x01e2, B:85:0x01ec, B:87:0x01f2, B:89:0x01fb, B:91:0x0205, B:92:0x022b, B:95:0x0235, B:96:0x0242, B:99:0x024c, B:100:0x0253, B:103:0x025d, B:104:0x0268, B:107:0x0272, B:108:0x0276, B:111:0x0280, B:113:0x0286, B:116:0x0294, B:117:0x02a8, B:119:0x02ae, B:120:0x02bd, B:121:0x02cc, B:124:0x02d6, B:126:0x02e0, B:128:0x02e6, B:130:0x02ee, B:132:0x02f6, B:133:0x030c, B:136:0x0316, B:137:0x0320, B:140:0x0334, B:142:0x033a, B:145:0x0346, B:146:0x0358, B:148:0x035e, B:149:0x0369, B:150:0x0374, B:153:0x0380, B:154:0x0393, B:157:0x039d, B:159:0x03aa, B:161:0x03b0, B:162:0x03b6, B:165:0x03c0, B:168:0x03cb, B:173:0x03d7, B:174:0x03e0, B:177:0x03ea, B:178:0x03ee, B:181:0x03f8, B:182:0x0402, B:185:0x0416, B:187:0x041c, B:190:0x0428, B:191:0x043a, B:193:0x0440, B:194:0x044b, B:195:0x0456, B:198:0x0460, B:199:0x0469, B:203:0x0475, B:206:0x0481, B:208:0x0489, B:210:0x0494, B:212:0x0499, B:211:0x0497, B:213:0x04a5, B:216:0x04af, B:217:0x04bb, B:220:0x04c5, B:221:0x04cf, B:224:0x04d9, B:227:0x04e4, B:232:0x04f0, B:235:0x04fb, B:240:0x0507, B:243:0x0512, B:248:0x051e, B:251:0x0529, B:256:0x0535, B:259:0x0540, B:264:0x054c, B:267:0x0557, B:272:0x0563, B:275:0x056e, B:280:0x057a, B:283:0x0585, B:288:0x0591, B:290:0x059f, B:293:0x05a9, B:294:0x05b3, B:297:0x05bd, B:298:0x05ca, B:301:0x05d6, B:303:0x05e1, B:305:0x05e7, B:306:0x05ed, B:309:0x05f7, B:311:0x0601, B:313:0x0607, B:315:0x0610, B:317:0x061a, B:318:0x062a, B:321:0x0634, B:323:0x063e, B:325:0x0644, B:327:0x064c, B:329:0x0654, B:330:0x066a, B:333:0x0674, B:334:0x067b, B:335:0x0682, B:338:0x068c, B:340:0x0699, B:346:0x06ab, B:347:0x06b4, B:350:0x06c0, B:351:0x06d7, B:354:0x06e1, B:355:0x06ea, B:358:0x06fa, B:360:0x0703, B:362:0x070b, B:364:0x071a, B:370:0x0728, B:372:0x0731, B:375:0x073a, B:376:0x0742, B:379:0x074b, B:380:0x074e, B:383:0x0757, B:385:0x075c, B:388:0x0765), top: B:399:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0728 A[Catch: Exception -> 0x0773, TryCatch #0 {Exception -> 0x0773, blocks: (B:4:0x001b, B:8:0x0068, B:11:0x0072, B:395:0x0777, B:12:0x007b, B:15:0x0085, B:17:0x008e, B:19:0x0094, B:20:0x009c, B:23:0x00a4, B:24:0x00ae, B:27:0x00b8, B:29:0x00c2, B:31:0x00c8, B:33:0x00d1, B:35:0x00db, B:36:0x00eb, B:39:0x00f5, B:40:0x00ff, B:43:0x0109, B:45:0x011b, B:47:0x012d, B:51:0x0144, B:52:0x0156, B:55:0x0160, B:57:0x016f, B:59:0x0177, B:61:0x017d, B:63:0x0183, B:64:0x0189, B:67:0x0193, B:69:0x01a2, B:71:0x01aa, B:72:0x01b0, B:75:0x01ba, B:76:0x01c4, B:79:0x01ce, B:80:0x01d8, B:83:0x01e2, B:85:0x01ec, B:87:0x01f2, B:89:0x01fb, B:91:0x0205, B:92:0x022b, B:95:0x0235, B:96:0x0242, B:99:0x024c, B:100:0x0253, B:103:0x025d, B:104:0x0268, B:107:0x0272, B:108:0x0276, B:111:0x0280, B:113:0x0286, B:116:0x0294, B:117:0x02a8, B:119:0x02ae, B:120:0x02bd, B:121:0x02cc, B:124:0x02d6, B:126:0x02e0, B:128:0x02e6, B:130:0x02ee, B:132:0x02f6, B:133:0x030c, B:136:0x0316, B:137:0x0320, B:140:0x0334, B:142:0x033a, B:145:0x0346, B:146:0x0358, B:148:0x035e, B:149:0x0369, B:150:0x0374, B:153:0x0380, B:154:0x0393, B:157:0x039d, B:159:0x03aa, B:161:0x03b0, B:162:0x03b6, B:165:0x03c0, B:168:0x03cb, B:173:0x03d7, B:174:0x03e0, B:177:0x03ea, B:178:0x03ee, B:181:0x03f8, B:182:0x0402, B:185:0x0416, B:187:0x041c, B:190:0x0428, B:191:0x043a, B:193:0x0440, B:194:0x044b, B:195:0x0456, B:198:0x0460, B:199:0x0469, B:203:0x0475, B:206:0x0481, B:208:0x0489, B:210:0x0494, B:212:0x0499, B:211:0x0497, B:213:0x04a5, B:216:0x04af, B:217:0x04bb, B:220:0x04c5, B:221:0x04cf, B:224:0x04d9, B:227:0x04e4, B:232:0x04f0, B:235:0x04fb, B:240:0x0507, B:243:0x0512, B:248:0x051e, B:251:0x0529, B:256:0x0535, B:259:0x0540, B:264:0x054c, B:267:0x0557, B:272:0x0563, B:275:0x056e, B:280:0x057a, B:283:0x0585, B:288:0x0591, B:290:0x059f, B:293:0x05a9, B:294:0x05b3, B:297:0x05bd, B:298:0x05ca, B:301:0x05d6, B:303:0x05e1, B:305:0x05e7, B:306:0x05ed, B:309:0x05f7, B:311:0x0601, B:313:0x0607, B:315:0x0610, B:317:0x061a, B:318:0x062a, B:321:0x0634, B:323:0x063e, B:325:0x0644, B:327:0x064c, B:329:0x0654, B:330:0x066a, B:333:0x0674, B:334:0x067b, B:335:0x0682, B:338:0x068c, B:340:0x0699, B:346:0x06ab, B:347:0x06b4, B:350:0x06c0, B:351:0x06d7, B:354:0x06e1, B:355:0x06ea, B:358:0x06fa, B:360:0x0703, B:362:0x070b, B:364:0x071a, B:370:0x0728, B:372:0x0731, B:375:0x073a, B:376:0x0742, B:379:0x074b, B:380:0x074e, B:383:0x0757, B:385:0x075c, B:388:0x0765), top: B:399:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static RoutingIntentHandler g(String str, Bundle bundle, Intent intent, Activity context) {
        Intent putExtra;
        RoutingType routingType;
        Object obj;
        boolean z10;
        boolean z11;
        Intent intent2;
        String str2;
        boolean z12;
        boolean z13;
        Object obj2;
        HashMap<String, Object> appConfig;
        String a10;
        String str3;
        Intent intent3;
        Intent s10;
        Intent intent4;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        Intent s11;
        Intent s12;
        String str4;
        String str5;
        String str6;
        c cVar;
        Intent s13;
        boolean z22;
        String str7;
        Intent s14;
        Object obj3;
        HashMap<String, Object> appConfig2;
        RoutingType routingType2;
        String a11;
        Intent s15;
        Intent s16;
        String str8;
        String str9;
        String str10;
        int i6;
        Intent s17;
        String a12;
        Intent s18;
        String str11;
        i.g(context, "context");
        if (str != null) {
            try {
                int hashCode = str.hashCode();
                y0 y0Var = y0.MIGRATION_SUCCESS;
                c cVar2 = c.FLOW_PSYCHIATRY;
                c cVar3 = c.FLOW_THERAPY;
                switch (hashCode) {
                    case -1781254181:
                        if (!str.equals("mo_psychiatrist_listing")) {
                            break;
                        } else {
                            putExtra = new Intent(context, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, c.PSYCHIATRIST_LISTING);
                            intent2 = putExtra;
                            intent3 = intent2;
                            routingType2 = null;
                            break;
                        }
                    case -1713256037:
                        if (!str.equals("mo_tracker")) {
                            break;
                        } else {
                            routingType = RoutingType.MOOD_TRACKER_DASHBOARD_SMOOTH_SCROLL;
                            routingType2 = routingType;
                            intent3 = null;
                            break;
                        }
                    case -1676667208:
                        if (!str.equals("app_entry_comm_card")) {
                            break;
                        } else {
                            routingType = RoutingType.COMMUNITY_DASHBOARD_SMOOTH_SCROLL;
                            routingType2 = routingType;
                            intent3 = null;
                            break;
                        }
                    case -1631559437:
                        if (!str.equals("mo_not_v4_recent")) {
                            break;
                        } else {
                            putExtra = new Intent(context, NotV4RecentActivity.class);
                            intent2 = putExtra;
                            intent3 = intent2;
                            routingType2 = null;
                            break;
                        }
                    case -1560148609:
                        if (!str.equals("mo_assessment")) {
                            break;
                        } else {
                            Intent s19 = e0.s(context);
                            s19.putExtra(Constants.API_COURSE_LINK, str);
                            if (bundle != null) {
                                obj = bundle.get(Constants.DAYMODEL_POSITION);
                            } else {
                                obj = null;
                            }
                            s19.putExtra(Constants.DAYMODEL_POSITION, Integer.parseInt(String.valueOf(obj)));
                            if (intent != null) {
                                z10 = true;
                                if (intent.getBooleanExtra(Constants.NEW_COURSE_FLAG, false)) {
                                    z11 = true;
                                    if (z11) {
                                        s19.putExtra(Constants.NEW_COURSE_FLAG, z10);
                                        intent.putExtra(Constants.NEW_COURSE_FLAG, false);
                                    }
                                    intent2 = s19;
                                    intent3 = intent2;
                                    routingType2 = null;
                                    break;
                                }
                            } else {
                                z10 = true;
                            }
                            z11 = false;
                            if (z11) {
                            }
                            intent2 = s19;
                            intent3 = intent2;
                            routingType2 = null;
                        }
                    case -1557560446:
                        if (!str.equals("mo_not_v4_favourites")) {
                            break;
                        } else {
                            putExtra = new Intent(context, NewDashboardSavedItemsActivity.class);
                            intent2 = putExtra;
                            intent3 = intent2;
                            routingType2 = null;
                            break;
                        }
                    case -1245599982:
                        if (!str.equals(Constants.SCREEN_THERAPIST_PACKAGES)) {
                            break;
                        } else {
                            putExtra = new Intent(context, TelecommunicationsPWAActivity.class);
                            putExtra.putExtra(Constants.TELECOMMUNICATION_REDIRECT, c.CROSS_PROVIDER);
                            putExtra.putExtra("isTherapy", true);
                            putExtra.putExtra("providerType", "therapist");
                            intent2 = putExtra;
                            intent3 = intent2;
                            routingType2 = null;
                            break;
                        }
                    case -1049072416:
                        if (!str.equals(Constants.SCREEN_SLIDER_ASSESSMENT)) {
                            break;
                        } else {
                            intent2 = e0.s(context);
                            intent2.putExtra(Constants.API_COURSE_LINK, str);
                            if (intent != null) {
                                str2 = Constants.NEW_COURSE_FLAG;
                                z12 = true;
                                if (intent.getBooleanExtra(str2, false)) {
                                    z13 = true;
                                    if (z13) {
                                        intent2.putExtra(str2, z12);
                                        intent.putExtra(str2, false);
                                    }
                                    intent3 = intent2;
                                    routingType2 = null;
                                    break;
                                }
                            } else {
                                str2 = Constants.NEW_COURSE_FLAG;
                                z12 = true;
                            }
                            z13 = false;
                            if (z13) {
                            }
                            intent3 = intent2;
                            routingType2 = null;
                        }
                    case -1047860588:
                        str.equals(Constants.SCREEN_DASHBOARD);
                        break;
                    case -1046552926:
                        if (!str.equals(Constants.SCREEN_THERAPY_PSYCHIATRY_CHOICE)) {
                            break;
                        } else {
                            putExtra = new Intent(context, TelecommunicationsPWAActivity.class);
                            intent2 = putExtra;
                            intent3 = intent2;
                            routingType2 = null;
                            break;
                        }
                    case -994830887:
                        if (!str.equals("app_consult_psychiatry")) {
                            break;
                        } else {
                            User user = FirebasePersistence.getInstance().getUser();
                            if (user != null && (appConfig = user.getAppConfig()) != null) {
                                obj2 = appConfig.get(Constants.TELE_ENTRY_POINT_EXPERIMENT);
                            } else {
                                obj2 = null;
                            }
                            if (i.b(obj2, "f")) {
                                putExtra = new Intent(context, ExpertCareInfoActivity.class).putExtra("isPsychiatryFlow", true).putExtra("source", "homescreen");
                                intent2 = putExtra;
                                intent3 = intent2;
                                routingType2 = null;
                                break;
                            }
                        }
                        break;
                    case -906667330:
                        if (str.equals(Constants.SCREEN_PSYCHIATRIST_CHAT) && (a10 = FirebaseAuth.getInstance().a()) != null && !i.b(a10, "")) {
                            i.d(bundle);
                            if (bundle.containsKey(Constants.FIREBASE_CHAT_TO_USER_ID) && i.b(bundle.getString(Constants.FIREBASE_CHAT_TO_USER_ID), a10)) {
                                putExtra = new Intent(context, TelecommunicationsPWAActivity.class).putExtra("chat", true).putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar2);
                                intent2 = putExtra;
                                intent3 = intent2;
                                routingType2 = null;
                                break;
                            }
                        }
                        break;
                    case -823586494:
                        if (!str.equals(Constants.LINK_COMMUNITIES_NOTIFICATION)) {
                            break;
                        } else {
                            Intent intent5 = new Intent(context, CommunitiesPwaActivity.class);
                            if (bundle != null) {
                                str3 = bundle.getString(Constants.NOTIFICATION_URL, "");
                            } else {
                                str3 = null;
                            }
                            putExtra = intent5.putExtra("redirect_url", str3);
                            intent2 = putExtra;
                            intent3 = intent2;
                            routingType2 = null;
                            break;
                        }
                    case -752877989:
                        if (!str.equals("mo_couples_listing")) {
                            break;
                        } else {
                            putExtra = new Intent(context, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, c.COUPLES_LISTING);
                            intent2 = putExtra;
                            intent3 = intent2;
                            routingType2 = null;
                            break;
                        }
                    case -596003594:
                        if (!str.equals(Constants.LINK_OFFER_60_PLUS_ANNUAL)) {
                            break;
                        } else {
                            s10 = r.s(context, false);
                            putExtra = s10.putExtra("source", Constants.LINK_OFFER_60_PLUS_ANNUAL);
                            intent2 = putExtra;
                            intent3 = intent2;
                            routingType2 = null;
                            break;
                        }
                    case -479652066:
                        if (!str.equals("mo_library")) {
                            break;
                        } else {
                            intent4 = new Intent(context, LibraryActivity.class);
                            if (bundle != null && bundle.containsKey("highlight")) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z14) {
                                intent4.putExtra("highlight", bundle.getString("highlight"));
                            }
                            if (bundle != null && bundle.containsKey("view_all")) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z15) {
                                intent4.putExtra("view_all", bundle.getString("view_all"));
                            }
                            if (bundle != null && bundle.containsKey("operation")) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (z16) {
                                intent4.putExtra("operation", bundle.getString("operation"));
                            }
                            if (bundle != null && bundle.containsKey("parentType")) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (z17) {
                                intent4.putExtra("parentType", bundle.getString("parentType"));
                            }
                            if (bundle != null && bundle.containsKey("parentId")) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            if (z18) {
                                intent4.putExtra("parentId", bundle.getString("parentId"));
                            }
                            if (bundle != null && bundle.containsKey("itemType")) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if (z19) {
                                intent4.putExtra("itemType", bundle.getString("itemType"));
                            }
                            if (bundle != null && bundle.containsKey("id")) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            if (z20) {
                                intent4.putExtra("id", bundle.getString("id"));
                            }
                            if (bundle != null && bundle.containsKey("finish_on_back_pressed")) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            if (z21) {
                                intent4.putExtra("finish_on_back_pressed", Boolean.parseBoolean(bundle.getString("finish_on_back_pressed")));
                            }
                            intent3 = intent4;
                            routingType2 = null;
                            break;
                        }
                        break;
                    case -451256727:
                        if (!str.equals(Constants.LINK_OFFER_PRO_QUARTERLY_PRO_CLICK_3)) {
                            break;
                        } else {
                            s11 = r.s(context, false);
                            intent4 = s11.putExtra("source", Constants.LINK_OFFER_PRO_QUARTERLY_PRO_CLICK_3);
                            intent3 = intent4;
                            routingType2 = null;
                            break;
                        }
                    case -426874039:
                        if (!str.equals(Constants.SCREEN_MONETIZATION)) {
                            break;
                        } else {
                            s12 = r.s(context, false);
                            intent4 = s12.putExtra("source", "offer");
                            intent3 = intent4;
                            routingType2 = null;
                            break;
                        }
                    case -355503461:
                        if (!str.equals(Constants.NOTIFICATION_PROVIDER_PROFILE)) {
                            break;
                        } else {
                            if (bundle != null) {
                                str4 = "therapist";
                                str5 = bundle.getString("provider_type", str4);
                            } else {
                                str4 = "therapist";
                                str5 = null;
                            }
                            if (bundle != null) {
                                str6 = bundle.getString("provider_uuid", "");
                            } else {
                                str6 = null;
                            }
                            Intent intent6 = new Intent(context, TelecommunicationsPWAActivity.class);
                            if (i.b(str5, str4)) {
                                cVar = c.PROFILE;
                            } else {
                                cVar = c.PROFILE_PSYCHIATRIST;
                            }
                            intent4 = intent6.putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar).putExtra(SessionManager.KEY_UUID, str6);
                            intent3 = intent4;
                            routingType2 = null;
                            break;
                        }
                    case -309425751:
                        if (!str.equals(Constants.SCREEN_PROFILE)) {
                            break;
                        } else {
                            intent4 = new Intent(context, ExperimentProfileActivity.class);
                            intent3 = intent4;
                            routingType2 = null;
                            break;
                        }
                    case -289598831:
                        if (!str.equals(Constants.SCREEN_V3_ACTIVITY)) {
                            break;
                        } else {
                            if (b.K()) {
                                wn.b.f36765a.getClass();
                                if (wn.b.b() != y0Var) {
                                    Extensions extensions = Extensions.INSTANCE;
                                    String string = context.getString(R.string.goalMigrationProgress);
                                    i.f(string, "context.getString(R.string.goalMigrationProgress)");
                                    extensions.toast(context, string, 1);
                                    break;
                                }
                            }
                            intent4 = b.K() ? new Intent(context, FirestoreGoalsActivity.class).putExtra("source", Constants.SCREEN_DASHBOARD) : new Intent(context, V3GoalsActivity.class).putExtra("source", Constants.SCREEN_DASHBOARD);
                            intent3 = intent4;
                            routingType2 = null;
                            break;
                        }
                    case -275453495:
                        if (!str.equals(Constants.LINK_DYNAMIC_CAMPAIGN)) {
                            break;
                        } else {
                            s13 = r.s(context, false);
                            intent4 = s13.putExtra("source", Constants.LINK_DYNAMIC_CAMPAIGN);
                            intent3 = intent4;
                            routingType2 = null;
                            break;
                        }
                    case -251367227:
                        if (!str.equals("journal_entry_card")) {
                            break;
                        } else {
                            routingType = RoutingType.JOURNAL_DASHBOARD_SMOOTH_SCROLL;
                            routingType2 = routingType;
                            intent3 = null;
                            break;
                        }
                    case -30512757:
                        if (!str.equals("mo_not_v4_suggested")) {
                            break;
                        } else {
                            intent4 = new Intent(context, SuggestedActivityDetailsActivity.class);
                            if (bundle != null && bundle.containsKey("highlightedActivityId")) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            if (z22) {
                                intent4.putExtra("highlightedActivityId", bundle.getString("highlightedActivityId", ""));
                            }
                            intent3 = intent4;
                            routingType2 = null;
                            break;
                        }
                        break;
                    case 1197398:
                        if (!str.equals("mo_pending_tools")) {
                            break;
                        } else {
                            Intent putExtra2 = new Intent(context, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, c.PENDING_PROVIDER_TOOLS);
                            if (bundle != null) {
                                str7 = bundle.getString("provider_type", "");
                            } else {
                                str7 = null;
                            }
                            intent4 = putExtra2.putExtra("type", str7);
                            intent3 = intent4;
                            routingType2 = null;
                            break;
                        }
                    case 150940456:
                        if (!str.equals(Constants.SCREEN_BROWSER)) {
                            break;
                        } else {
                            intent4 = new Intent(context, WebviewActivity.class);
                            i.d(bundle);
                            intent4.putExtra(Constants.NOTIFICATION_URL, bundle.getString(Constants.NOTIFICATION_URL));
                            intent3 = intent4;
                            routingType2 = null;
                            break;
                        }
                    case 173432253:
                        if (!str.equals(Constants.SCREEN_GOALS_LIST)) {
                            break;
                        } else {
                            if (b.K()) {
                                wn.b.f36765a.getClass();
                                if (wn.b.b() != y0Var) {
                                    Extensions extensions2 = Extensions.INSTANCE;
                                    String string2 = context.getString(R.string.goalMigrationProgress);
                                    i.f(string2, "context.getString(R.string.goalMigrationProgress)");
                                    extensions2.toast(context, string2, 1);
                                    break;
                                }
                            }
                            intent4 = b.K() ? new Intent(context, FirestoreGoalsActivity.class).putExtra("source", Constants.SCREEN_DASHBOARD) : new Intent(context, V3GoalsActivity.class).putExtra("source", Constants.SCREEN_DASHBOARD);
                            intent3 = intent4;
                            routingType2 = null;
                            break;
                        }
                    case 178288279:
                        if (!str.equals(Constants.LINK_OFFER_PRO_QUARTERLY_PLUS_PURCHASE_CANCELLED)) {
                            break;
                        } else {
                            s14 = r.s(context, false);
                            intent4 = s14.putExtra("source", Constants.LINK_OFFER_PRO_QUARTERLY_PLUS_PURCHASE_CANCELLED);
                            intent3 = intent4;
                            routingType2 = null;
                            break;
                        }
                    case 328585464:
                        if (!str.equals("app_consult_therapy")) {
                            break;
                        } else {
                            User user2 = FirebasePersistence.getInstance().getUser();
                            if (user2 != null && (appConfig2 = user2.getAppConfig()) != null) {
                                obj3 = appConfig2.get(Constants.TELE_ENTRY_POINT_EXPERIMENT);
                            } else {
                                obj3 = null;
                            }
                            if (i.b(obj3, "f")) {
                                intent4 = new Intent(context, ExpertCareInfoActivity.class).putExtra("isPsychiatryFlow", false).putExtra("source", "homescreen");
                                intent3 = intent4;
                                routingType2 = null;
                                break;
                            }
                        }
                        break;
                    case 392182873:
                        if (!str.equals(Constants.SCREEN_COACHMARKS_1)) {
                            break;
                        } else {
                            if (b.K()) {
                                wn.b.f36765a.getClass();
                                if (wn.b.b() != y0Var) {
                                    Extensions extensions3 = Extensions.INSTANCE;
                                    String string3 = context.getString(R.string.goalMigrationProgress);
                                    i.f(string3, "context.getString(R.string.goalMigrationProgress)");
                                    extensions3.toast(context, string3, 1);
                                    break;
                                }
                            }
                            intent4 = b.K() ? new Intent(context, FirestoreGoalsActivity.class).putExtra("source", Constants.SCREEN_DASHBOARD) : new Intent(context, V3GoalsActivity.class).putExtra("source", Constants.SCREEN_DASHBOARD);
                            intent3 = intent4;
                            routingType2 = null;
                            break;
                        }
                    case 797757060:
                        if (!str.equals("tele_dashboard_listing")) {
                            break;
                        } else {
                            routingType = RoutingType.TELE_DASHBOARD_SMOOTH_SCROLL;
                            routingType2 = routingType;
                            intent3 = null;
                            break;
                        }
                    case 1096935804:
                        if (!str.equals("journal_listing")) {
                            break;
                        } else {
                            routingType2 = RoutingType.JOURNAL_ROUTE;
                            intent3 = new Intent(context, JournalActivity.class);
                            break;
                        }
                    case 1228058550:
                        if (!str.equals(Constants.SCREEN_THERAPIST_DETAIL)) {
                            break;
                        } else {
                            intent4 = new Intent(context, TelecommunicationsPWAActivity.class);
                            intent3 = intent4;
                            routingType2 = null;
                            break;
                        }
                    case 1242473058:
                        if (!str.equals("mo_therapist_listing")) {
                            break;
                        } else {
                            intent4 = new Intent(context, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, c.THERAPIST_LISTING);
                            intent3 = intent4;
                            routingType2 = null;
                            break;
                        }
                    case 1246697437:
                        if (str.equals(Constants.SCREEN_COACH_CHAT) && (a11 = FirebaseAuth.getInstance().a()) != null && !i.b(a11, "")) {
                            i.d(bundle);
                            if (bundle.containsKey(Constants.FIREBASE_CHAT_TO_USER_ID) && i.b(bundle.getString(Constants.FIREBASE_CHAT_TO_USER_ID), a11)) {
                                s15 = r.s(context, false);
                                intent4 = s15.putExtra("source", "chat");
                                ChatUser chatUser = new ChatUser();
                                chatUser.setKey(bundle.getString(Constants.FIREBASE_CHAT_FROM_USER_ID));
                                chatUser.setFirstName(bundle.getString(Constants.FIREBASE_CHAT_USERNAME));
                                intent4.putExtra("user", chatUser);
                                intent3 = intent4;
                                routingType2 = null;
                                break;
                            }
                        }
                        break;
                    case 1486150927:
                        if (!str.equals(Constants.SESSION_DASHBOARD_THERAPY)) {
                            break;
                        } else {
                            intent4 = new Intent(context, TelecommunicationsPWAActivity.class);
                            intent4.putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar3);
                            intent3 = intent4;
                            routingType2 = null;
                            break;
                        }
                    case 1514864697:
                        if (!str.equals(Constants.LINK_OFFER_PRO_QUARTERLY_FREE_TRIAL)) {
                            break;
                        } else {
                            s16 = r.s(context, false);
                            intent4 = s16.putExtra("source", Constants.LINK_OFFER_PRO_QUARTERLY_FREE_TRIAL);
                            intent3 = intent4;
                            routingType2 = null;
                            break;
                        }
                    case 1592157014:
                        if (!str.equals(Constants.LINK_TELECOMMUNICATION_CUSTOM_URL)) {
                            break;
                        } else {
                            Intent putExtra3 = new Intent(context, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, c.FLOW_REDIRECT);
                            if (bundle != null) {
                                str8 = bundle.getString(Constants.NOTIFICATION_URL, "");
                            } else {
                                str8 = null;
                            }
                            intent4 = putExtra3.putExtra("redirect_url", str8);
                            intent3 = intent4;
                            routingType2 = null;
                            break;
                        }
                    case 1678142709:
                        if (!str.equals("mo_provider_package")) {
                            break;
                        } else {
                            Intent putExtra4 = new Intent(context, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, c.PROVIDER_PACKAGE);
                            if (bundle != null) {
                                str9 = bundle.getString("provider_uuid", "");
                            } else {
                                str9 = null;
                            }
                            Intent putExtra5 = putExtra4.putExtra(SessionManager.KEY_UUID, str9);
                            if (bundle != null) {
                                str10 = bundle.getString("provider_type", "");
                            } else {
                                str10 = null;
                            }
                            intent4 = putExtra5.putExtra("type", str10);
                            intent3 = intent4;
                            routingType2 = null;
                            break;
                        }
                    case 1697506576:
                        if (str.equals(Constants.SCREEN_IN_REPURCHASE) && (i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient") || !i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE))) {
                            if (i.b(PaymentUtils.INSTANCE.getSubscriptionType(SubscriptionPersistence.INSTANCE.getSubscriptionType()), "pro")) {
                                i6 = 1;
                            } else {
                                i6 = 0;
                            }
                            s17 = r.s(context, false);
                            intent4 = s17.putExtra("source", "repurchase").putExtra("tab", i6);
                            intent3 = intent4;
                            routingType2 = null;
                            break;
                        }
                        break;
                    case 1710674670:
                        if (!str.equals(Constants.SESSION_DASHBOARD_PSYCHIATRY)) {
                            break;
                        } else {
                            intent4 = new Intent(context, TelecommunicationsPWAActivity.class);
                            intent4.putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar2);
                            intent3 = intent4;
                            routingType2 = null;
                            break;
                        }
                    case 1922467472:
                        if (str.equals(Constants.SCREEN_FIREBASE_CHAT) && (a12 = FirebaseAuth.getInstance().a()) != null && !i.b(a12, "")) {
                            i.d(bundle);
                            if (bundle.containsKey(Constants.FIREBASE_CHAT_TO_USER_ID) && i.b(bundle.getString(Constants.FIREBASE_CHAT_TO_USER_ID), a12)) {
                                intent4 = new Intent(context, TelecommunicationsPWAActivity.class).putExtra("chat", true).putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar3);
                                intent3 = intent4;
                                routingType2 = null;
                                break;
                            }
                        }
                        break;
                    case 2016976548:
                        if (!str.equals(Constants.LINK_OFFER_PLUS_ANNUAL_PLUS_CLICK_4)) {
                            break;
                        } else {
                            s18 = r.s(context, false);
                            intent4 = s18.putExtra("source", Constants.LINK_OFFER_PLUS_ANNUAL_PLUS_CLICK_4);
                            intent3 = intent4;
                            routingType2 = null;
                            break;
                        }
                    case 2130861976:
                        if (!str.equals("new_journal")) {
                            break;
                        } else {
                            RoutingType routingType3 = RoutingType.JOURNAL_ROUTE;
                            Intent intent7 = new Intent(context, JournalActivity.class);
                            if (bundle != null) {
                                str11 = bundle.getString("type", "");
                            } else {
                                str11 = null;
                            }
                            routingType2 = routingType3;
                            intent3 = intent7.putExtra("type", str11);
                            break;
                        }
                    case 2135222301:
                        if (!str.equals(Constants.SCREEN_RELIEF_BOX)) {
                            break;
                        } else {
                            intent4 = new Intent(context, BotPwaActivity.class);
                            intent3 = intent4;
                            routingType2 = null;
                            break;
                        }
                }
                return new RoutingIntentHandler(intent3, routingType2, false, 4, null);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(e10);
                return new RoutingIntentHandler(null, null, false, 4, null);
            }
        }
        intent3 = null;
        routingType2 = null;
        return new RoutingIntentHandler(intent3, routingType2, false, 4, null);
    }

    public static f h(String str, ArrayList suggestedActivitiesList) {
        i.g(suggestedActivitiesList, "suggestedActivitiesList");
        int i6 = 0;
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        for (Object obj : suggestedActivitiesList) {
            int i13 = i6 + 1;
            if (i6 >= 0) {
                SuggestedActivityModel suggestedActivityModel = (SuggestedActivityModel) obj;
                if (suggestedActivityModel.isCompleted()) {
                    i10++;
                    if (str != null) {
                        ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
                        if (i.b(applicationPersistence.getStringValue("suggested_" + str + "_recent"), suggestedActivityModel.getContent_id())) {
                            i11 = i6;
                        }
                    }
                } else if (i12 == -1) {
                    i12 = i6;
                }
                i6 = i13;
            } else {
                a.t1();
                throw null;
            }
        }
        if (i11 == suggestedActivitiesList.size() - 1) {
            return new f(Integer.valueOf(i10), Integer.valueOf(i12));
        }
        return new f(Integer.valueOf(i10), Integer.valueOf(i11 + 1));
    }

    public static Integer i(String course) {
        i.g(course, "course");
        switch (course.hashCode()) {
            case -2114782937:
                if (course.equals(Constants.COURSE_HAPPINESS)) {
                    return Integer.valueOf((int) R.drawable.ic_new_db_happiness_banner);
                }
                break;
            case -1617042330:
                if (course.equals(Constants.COURSE_DEPRESSION)) {
                    return Integer.valueOf((int) R.drawable.ic_new_db_depression_banner);
                }
                break;
            case -891989580:
                if (course.equals(Constants.COURSE_STRESS)) {
                    return Integer.valueOf((int) R.drawable.ic_new_db_stress_banner);
                }
                break;
            case 92960775:
                if (course.equals(Constants.COURSE_ANGER)) {
                    return Integer.valueOf((int) R.drawable.ic_new_db_anger_banner);
                }
                break;
            case 109522647:
                if (course.equals(Constants.COURSE_SLEEP)) {
                    return Integer.valueOf((int) R.drawable.ic_new_db_sleep_banner);
                }
                break;
            case 113319009:
                if (course.equals(Constants.COURSE_WORRY)) {
                    return Integer.valueOf((int) R.drawable.ic_new_db_anxiety_banner);
                }
                break;
        }
        return null;
    }

    public static String j(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -2114782937:
                    if (str.equals(Constants.COURSE_HAPPINESS)) {
                        return "Happiness";
                    }
                    break;
                case -1617042330:
                    if (str.equals(Constants.COURSE_DEPRESSION)) {
                        return "Depression";
                    }
                    break;
                case -891989580:
                    if (str.equals(Constants.COURSE_STRESS)) {
                        return "Stress";
                    }
                    break;
                case 92960775:
                    if (str.equals(Constants.COURSE_ANGER)) {
                        return "Anger management";
                    }
                    break;
                case 109522647:
                    if (str.equals(Constants.COURSE_SLEEP)) {
                        return "Sleep";
                    }
                    break;
                case 113319009:
                    if (str.equals(Constants.COURSE_WORRY)) {
                        return "Anxiety";
                    }
                    break;
            }
        }
        return "";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.je
    public final String S() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f8126v);
        return jSONObject.toString();
    }

    public final boolean b(Context context) {
        i.g(context, "context");
        try {
            PackageManager packageManager = context.getPackageManager();
            i.f(packageManager, "context.packageManager");
            Intent data = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", "", null));
            i.f(data, "Intent()\n               …mParts(\"http\", \"\", null))");
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(data, 0);
            i.f(queryIntentActivities, "pm.queryIntentActivities(activityIntent, 0)");
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                Intent intent = new Intent();
                intent.setAction("android.support.customtabs.action.CustomTabsService");
                intent.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent, 0) != null) {
                    arrayList.add(resolveInfo);
                }
            }
            if (arrayList.size() <= 0) {
                return false;
            }
            return true;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f8126v, e10);
            return false;
        }
    }

    public final void k(Bundle bundle) {
        boolean z10;
        boolean z11;
        Bundle bundle2 = new Bundle();
        if (bundle.containsKey(Constants.NOTIFICATION_TYPE)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && i.b(bundle.getString(Constants.NOTIFICATION_TYPE), Constants.SCREEN_ACTIVITY)) {
            String string = bundle.getString(Constants.GOAL_ID);
            bundle.putString("experiment_type", Constants.SCREEN_ACTIVITY);
            ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
            bundle.putString("experiment", applicationPersistence.getStringValue("an-experiment-" + string));
            ApplicationPersistence applicationPersistence2 = ApplicationPersistence.getInstance();
            bundle.putString("experiment_key", applicationPersistence2.getStringValue("an-experiment-key-" + string));
            bundle2 = bundle;
        }
        if (bundle.containsKey("campaign")) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            bundle2.putString("campaign", bundle.getString("campaign"));
        }
        if (u.Z1(a.k(Constants.SCREEN_COMMUNITY, Constants.SCREEN_COMMUNITY_POST, Constants.LINK_COMMUNITIES_NOTIFICATION), bundle.getString(Constants.API_COURSE_LINK))) {
            bundle2.putBoolean("community_notif", true);
        } else {
            bundle2.putBoolean("community_notif", false);
        }
        bundle2.putString(Constants.API_COURSE_LINK, bundle.getString(Constants.API_COURSE_LINK));
        UtilsKt.fireAnalytics("notification_click", bundle2);
    }

    public final void l(ConstraintLayout constraintLayout) {
        try {
            if (((RobertoTextView) constraintLayout.findViewById(R.id.faqText)).getVisibility() == 0) {
                ((AppCompatImageView) constraintLayout.findViewById(R.id.faqChevron)).startAnimation(Utils.INSTANCE.rotateBy180(0.0f, 180.0f));
            } else {
                ((AppCompatImageView) constraintLayout.findViewById(R.id.faqChevron)).startAnimation(Utils.INSTANCE.rotateBy180(180.0f, 360.0f));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f8126v, "exception", e10);
        }
    }

    public final byte[] m() {
        char c10;
        String str = this.f8126v;
        int hashCode = str.hashCode();
        if (hashCode != 984523022) {
            if (hashCode != 984524074) {
                if (hashCode == 984525777 && str.equals("HmacSha512")) {
                    c10 = 2;
                }
                c10 = 65535;
            } else {
                if (str.equals("HmacSha384")) {
                    c10 = 1;
                }
                c10 = 65535;
            }
        } else {
            if (str.equals("HmacSha256")) {
                c10 = 0;
            }
            c10 = 65535;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 == 2) {
                    return z5.f8282h;
                }
                throw new GeneralSecurityException("Could not determine HPKE KDF ID");
            }
            return z5.f8281g;
        }
        return z5.f;
    }

    public final byte[] n(byte[] bArr, byte[] bArr2, int i6) {
        Mac mac = (Mac) dc.f.a(this.f8126v);
        if (i6 <= mac.getMacLength() * 255) {
            byte[] bArr3 = new byte[i6];
            mac.init(new SecretKeySpec(bArr, this.f8126v));
            byte[] bArr4 = new byte[0];
            int i10 = 1;
            int i11 = 0;
            while (true) {
                mac.update(bArr4);
                mac.update(bArr2);
                mac.update((byte) i10);
                bArr4 = mac.doFinal();
                int length = bArr4.length;
                int i12 = i11 + length;
                if (i12 < i6) {
                    System.arraycopy(bArr4, 0, bArr3, i11, length);
                    i10++;
                    i11 = i12;
                } else {
                    System.arraycopy(bArr4, 0, bArr3, i11, i6 - i11);
                    return bArr3;
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }

    public final byte[] o(byte[] bArr, byte[] bArr2) {
        Mac mac = (Mac) dc.f.a(this.f8126v);
        if (bArr2 != null && bArr2.length != 0) {
            mac.init(new SecretKeySpec(bArr2, this.f8126v));
        } else {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], this.f8126v));
        }
        return mac.doFinal(bArr);
    }

    public final String toString() {
        switch (this.f8125u) {
            case 7:
                return b0.b(new StringBuilder("AccountMeta(appId='"), this.f8126v, "')");
            case 8:
                return b0.b(new StringBuilder("DismissCta(text='"), this.f8126v, "')");
            case 9:
                return "HeaderStyle(appNameColor=" + ((Object) this.f8126v) + ')';
            case 16:
                return this.f8126v;
            default:
                return super.toString();
        }
    }

    public s5(String name, int i6) {
        this.f8125u = i6;
        if (i6 == 3) {
            name.getClass();
            this.f8126v = name;
        } else if (i6 == 16) {
            i.g(name, "name");
            this.f8126v = name;
        } else if (i6 == 6) {
            i.g(name, "encryptionKey");
            this.f8126v = name;
        } else if (i6 == 7) {
            i.g(name, "appId");
            this.f8126v = name;
        } else if (i6 != 8) {
            o.e(name);
            this.f8126v = name;
        } else {
            i.g(name, "text");
            this.f8126v = name;
        }
    }

    public s5(int i6) {
        this.f8125u = i6;
        switch (i6) {
            case 10:
                this.f8126v = LogHelper.INSTANCE.makeLogTag("ActivityFetchingViewModelRepository");
                return;
            case 11:
                this.f8126v = LogHelper.INSTANCE.makeLogTag(s5.class);
                return;
            case 12:
                this.f8126v = LogHelper.INSTANCE.makeLogTag("NotV4DbUtils");
                return;
            case 13:
                this.f8126v = "LoginScreenRoutingUtils";
                return;
            case 14:
                this.f8126v = LogHelper.INSTANCE.makeLogTag("MonetizationUtils");
                return;
            case 15:
                this.f8126v = LogHelper.INSTANCE.makeLogTag("CustomTabChecker");
                return;
            default:
                return;
        }
    }
}
