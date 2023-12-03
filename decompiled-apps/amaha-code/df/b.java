package df;

import a4.j;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.telephony.PhoneNumberUtils;
import android.util.Log;
import android.view.View;
import bg.d;
import c9.u;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.google.firebase.auth.FirebaseAuth;
import com.google.zxing.WriterException;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.BotPwaActivity;
import com.theinnerhour.b2b.activity.WebviewActivity;
import com.theinnerhour.b2b.components.chat.model.ChatUser;
import com.theinnerhour.b2b.components.community.activity.CommunitiesPwaActivity;
import com.theinnerhour.b2b.components.expertCare.activity.ExpertCareInfoActivity;
import com.theinnerhour.b2b.components.goals.activity.FirestoreGoalsActivity;
import com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity;
import com.theinnerhour.b2b.components.journal.activity.JournalActivity;
import com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentProfileActivity;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
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
import com.theinnerhour.b2b.utils.UtilsKt;
import d5.a;
import fg.c;
import fm.y0;
import gv.n;
import hs.k;
import is.y;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import k4.v;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.e0;
import kotlinx.coroutines.scheduling.h;
import mi.t1;
import org.json.JSONArray;
import org.json.JSONObject;
import si.e;
import si.f;
import si.g;
import tr.r;
import u7.s;
import yb.l;
/* compiled from: LogWrapper.java */
/* loaded from: classes.dex */
public class b implements v4.b, ld.a, d, fg.b, kg.a, j, h {
    public static b A;

    /* renamed from: v  reason: collision with root package name */
    public static b f12838v;

    /* renamed from: w  reason: collision with root package name */
    public static Method f12839w;

    /* renamed from: x  reason: collision with root package name */
    public static boolean f12840x;

    /* renamed from: y  reason: collision with root package name */
    public static Field f12841y;

    /* renamed from: z  reason: collision with root package name */
    public static boolean f12842z;

    /* renamed from: u  reason: collision with root package name */
    public final int f12843u;

    public /* synthetic */ b(int i6) {
        this.f12843u = i6;
    }

    public static boolean A(String str) {
        if (i.b(str, "allowed")) {
            return true;
        }
        if (i.b(str, "blocked")) {
            return false;
        }
        throw new IllegalStateException("Invalid State");
    }

    public static void B(Context context, String phoneNumber) {
        i.g(context, "context");
        i.g(phoneNumber, "phoneNumber");
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse(i.n(Uri.encode(phoneNumber), "tel:")));
        context.startActivity(intent);
    }

    public static void C(Context context, String content) {
        i.g(context, "context");
        i.g(content, "content");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", content);
        context.startActivity(Intent.createChooser(intent, "Share via"));
    }

    public static void D(c cVar, StringBuilder sb2) {
        int charAt = (sb2.charAt(1) * '(') + (sb2.charAt(0) * 1600) + sb2.charAt(2) + 1;
        cVar.f15035e.append(new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)}));
        sb2.delete(0, 3);
    }

    public static dg.b f(int i6, byte[][] bArr) {
        int i10 = i6 * 2;
        int length = bArr.length + i10;
        dg.b bVar = new dg.b(bArr[0].length + i10, length);
        int[] iArr = bVar.f12849x;
        int length2 = iArr.length;
        for (int i11 = 0; i11 < length2; i11++) {
            iArr[i11] = 0;
        }
        int i12 = (length - i6) - 1;
        int i13 = 0;
        while (i13 < bArr.length) {
            byte[] bArr2 = bArr[i13];
            for (int i14 = 0; i14 < bArr[0].length; i14++) {
                if (bArr2[i14] == 1) {
                    bVar.b(i14 + i6, i12);
                }
            }
            i13++;
            i12--;
        }
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e g(pi.c entity) {
        String str;
        f fVar;
        si.c cVar;
        boolean z10;
        g gVar;
        JSONObject optJSONObject;
        aj.a aVar;
        int i6;
        LinkedHashSet linkedHashSet;
        i.g(entity, "entity");
        String str2 = entity.f28448c;
        String str3 = entity.f28449d;
        long j10 = entity.f28453i;
        JSONObject jSONObject = new JSONObject(entity.f28455k);
        String string = jSONObject.getString(Constants.CAMPAIGN_ID);
        String string2 = jSONObject.getString("campaign_name");
        String string3 = jSONObject.getString("expiry_time");
        i.f(string3, "metaJson.getString(EXPIRY_TIME)");
        long V = sp.b.V(string3);
        String string4 = jSONObject.getString("updated_time");
        i.f(string4, "metaJson.getString(LAST_UPDATED_TIME)");
        long V2 = sp.b.V(string4);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("display");
        y yVar = y.f20678u;
        if (optJSONObject2 == null) {
            str = str3;
            cVar = new si.c(new f(null, yVar));
        } else {
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("rules");
            if (optJSONObject3 == null) {
                fVar = new f(null, yVar);
                str = str3;
            } else {
                str = str3;
                fVar = new f(optJSONObject3.optString("screen_name", null), kotlin.jvm.internal.h.O(optJSONObject3.optJSONArray("contexts"), false));
            }
            cVar = new si.c(fVar);
        }
        String string5 = jSONObject.getString("template_type");
        JSONObject jSONObject2 = jSONObject.getJSONObject("delivery");
        i.f(jSONObject2, "metaJson.getJSONObject(DELIVERY_CONTROL)");
        long j11 = jSONObject2.getLong("priority");
        JSONObject jSONObject3 = jSONObject2.getJSONObject("fc_meta");
        i.f(jSONObject3, "deliveryJson.getJSONObject(FC_META)");
        si.b bVar = new si.b(j11, new si.d(jSONObject3.getLong("count"), jSONObject3.getLong("delay"), jSONObject3.getBoolean("ignore_global_delay")));
        JSONObject optJSONObject4 = jSONObject.optJSONObject("trigger");
        if (optJSONObject4 != null && optJSONObject4.has("primary_condition") && optJSONObject4.getJSONObject("primary_condition").has("action_name")) {
            String string6 = optJSONObject4.getJSONObject("primary_condition").getString("action_name");
            if (string6 != null && !n.B0(string6)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                JSONObject jSONObject4 = optJSONObject4.getJSONObject("primary_condition");
                i.f(jSONObject4, "triggerJson.getJSONObject(PRIMARY_CONDITION)");
                gVar = new g(new si.h(jSONObject4.optJSONObject("attributes"), jSONObject4.getString("action_name")));
                optJSONObject = jSONObject.optJSONObject("campaign_context");
                if (optJSONObject != null) {
                    aVar = null;
                } else {
                    String string7 = optJSONObject.getString("cid");
                    i.f(string7, "contextJson.getString(CID)");
                    aVar = new aj.a(string7, optJSONObject, di.n.e(optJSONObject));
                }
                if (!jSONObject.has("inapp_type")) {
                    String string8 = jSONObject.getString("inapp_type");
                    i.f(string8, "metaJson.getString(INAPP_TYPE)");
                    String upperCase = string8.toUpperCase(Locale.ROOT);
                    i.f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    i6 = pl.a.o(upperCase);
                } else {
                    i6 = 0;
                }
                if (!jSONObject.has("orientations")) {
                    JSONArray jSONArray = jSONObject.getJSONArray("orientations");
                    i.f(jSONArray, "metaJson.getJSONArray(ORIENTATIONS)");
                    linkedHashSet = t1.k(jSONArray);
                } else {
                    linkedHashSet = null;
                }
                String optString = jSONObject.optString("campaign_sub_type", "GENERAL");
                i.f(optString, "metaJson.optString(CAMPA…bType.GENERAL.toString())");
                String upperCase2 = optString.toUpperCase(Locale.ROOT);
                i.f(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                aj.a aVar2 = aVar;
                return new e(str2, str, j10, new si.a(string, string2, V, V2, cVar, string5, bVar, gVar, aVar2, i6, linkedHashSet, d.B(upperCase2)), entity.f);
            }
        }
        gVar = null;
        optJSONObject = jSONObject.optJSONObject("campaign_context");
        if (optJSONObject != null) {
        }
        if (!jSONObject.has("inapp_type")) {
        }
        if (!jSONObject.has("orientations")) {
        }
        String optString2 = jSONObject.optString("campaign_sub_type", "GENERAL");
        i.f(optString2, "metaJson.optString(CAMPA…bType.GENERAL.toString())");
        String upperCase22 = optString2.toUpperCase(Locale.ROOT);
        i.f(upperCase22, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        aj.a aVar22 = aVar;
        return new e(str2, str, j10, new si.a(string, string2, V, V2, cVar, string5, bVar, gVar, aVar22, i6, linkedHashSet, d.B(upperCase22)), entity.f);
    }

    public static JSONObject h(f8.g state) {
        i.g(state, "state");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("show_count", state.f14907b).put("last_show_time", state.f14908c).put("is_clicked", state.f14909d);
        return jSONObject;
    }

    public static byte[] i(List list) {
        ArrayList<Bundle> c10 = c9.a.c(list);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", c10);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static ArrayList k(List entities) {
        i.g(entities, "entities");
        ArrayList arrayList = new ArrayList();
        Iterator it = entities.iterator();
        while (it.hasNext()) {
            arrayList.add(g((pi.c) it.next()));
        }
        return arrayList;
    }

    public static ih.d l(JSONObject jSONObject) {
        String optString = jSONObject.optString("a_s", "allowed");
        i.f(optString, "configJson.optString(RES…PP_STATE, STATUS_ALLOWED)");
        String optString2 = jSONObject.optString("i_s", "allowed");
        i.f(optString2, "configJson.optString(RES…PP_STATE, STATUS_ALLOWED)");
        String optString3 = jSONObject.optString("g_s", "allowed");
        i.f(optString3, "configJson.optString(RES…EO_STATE, STATUS_ALLOWED)");
        String optString4 = jSONObject.optString("in_s", "blocked");
        i.f(optString4, "configJson.optString(\n  …TUS_BLOCKED\n            )");
        String optString5 = jSONObject.optString("d_t", "blocked");
        i.f(optString5, "configJson.optString(\n  …TUS_BLOCKED\n            )");
        String optString6 = jSONObject.optString("mi_p_s", "blocked");
        i.f(optString6, "configJson.optString(\n  …TUS_BLOCKED\n            )");
        String optString7 = jSONObject.optString("p_f_s", "allowed");
        i.f(optString7, "configJson.optString(\n  …TUS_ALLOWED\n            )");
        String optString8 = jSONObject.optString("s_log", "blocked");
        i.f(optString8, "configJson.optString(\n  …TUS_BLOCKED\n            )");
        long optLong = jSONObject.optLong("d_s_r_i", 1800L);
        long optLong2 = jSONObject.optLong("p_f_t", 60L);
        int optInt = jSONObject.optInt("e_b_c", 30);
        long optLong3 = jSONObject.optLong("cid_ex", 2419200000L);
        long optLong4 = jSONObject.optLong("m_s_t", 10800L);
        HashSet O = kotlin.jvm.internal.h.O(jSONObject.optJSONArray("b_e"), false);
        HashSet O2 = kotlin.jvm.internal.h.O(jSONObject.optJSONArray("f_e"), false);
        long optLong5 = jSONObject.optLong("u_a_c_t", 1800L);
        HashSet O3 = kotlin.jvm.internal.h.O(jSONObject.optJSONArray("d_t_w_e"), false);
        HashSet O4 = kotlin.jvm.internal.h.O(jSONObject.optJSONArray("b_uid_r"), false);
        long optLong6 = jSONObject.optLong("dt_s_t", 10800L);
        long optLong7 = jSONObject.optLong("s_i_d", 1800L);
        HashSet O5 = kotlin.jvm.internal.h.O(jSONObject.optJSONArray("src_ext"), false);
        String optString9 = jSONObject.optString("d_e_k", "28caa46a6e9c77fbe291287e4fec061f");
        i.f(optString9, "configJson.optString(\n  …RYPTION_KEY\n            )");
        String optString10 = jSONObject.optString("log_level", "no_log");
        i.f(optString10, "configJson.optString(\n  …T_LOG_LEVEL\n            )");
        HashSet O6 = kotlin.jvm.internal.h.O(jSONObject.optJSONArray("b_ua"), false);
        String optString11 = jSONObject.optString("c_s", "blocked");
        i.f(optString11, "configJson.optString(\n  …TUS_BLOCKED\n            )");
        String optString12 = jSONObject.optString("in_st_s", "blocked");
        i.f(optString12, "configJson.optString(\n  …TUS_BLOCKED\n            )");
        return new ih.d(optString, optString2, optString3, optString4, optString5, optString6, optString7, optString8, optLong, optLong2, optInt, optLong3, optLong4, O, O2, optLong5, O3, O4, optLong6, optLong7, O5, optString9, optString10, O6, optString11, optString12, kotlin.jvm.internal.h.O(jSONObject.optJSONArray("pt_w_o"), true), kotlin.jvm.internal.h.O(jSONObject.optJSONArray("w_e"), false), jSONObject.optLong("b_m_d_s_i", 43200L));
    }

    public static String p() {
        boolean z10;
        Object obj;
        HashMap<String, Object> appConfig;
        HashMap<String, Object> appConfig2;
        HashMap<String, Object> appConfig3;
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null && (appConfig3 = user.getAppConfig()) != null && !appConfig3.containsKey(Constants.NOTIF_PERMIT_ASSESSMENT_EXPERIMENT)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            User user2 = FirebasePersistence.getInstance().getUser();
            if (user2 != null && (appConfig2 = user2.getAppConfig()) != null) {
                appConfig2.put(Constants.NOTIF_PERMIT_ASSESSMENT_EXPERIMENT, "variant_a");
            }
            FirebasePersistence.getInstance().updateUserOnFirebase();
            String str = gk.a.f16573a;
            Bundle bundle = new Bundle();
            bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
            bundle.putString("variant", "variant_a");
            k kVar = k.f19476a;
            gk.a.b(bundle, Constants.NOTIF_PERMIT_ASSESSMENT_EXPERIMENT);
        }
        User user3 = FirebasePersistence.getInstance().getUser();
        String str2 = null;
        if (user3 != null && (appConfig = user3.getAppConfig()) != null) {
            obj = appConfig.get(Constants.NOTIF_PERMIT_ASSESSMENT_EXPERIMENT);
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str2 = (String) obj;
        }
        if (str2 == null) {
            return "variant_a";
        }
        return str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:359:0x06f7 A[Catch: Exception -> 0x07a7, TryCatch #0 {Exception -> 0x07a7, blocks: (B:3:0x001b, B:6:0x0031, B:12:0x0040, B:14:0x0046, B:398:0x079d, B:20:0x0059, B:23:0x0063, B:24:0x0078, B:27:0x0082, B:29:0x0099, B:33:0x00de, B:36:0x00e8, B:37:0x00f1, B:40:0x00fb, B:42:0x0104, B:44:0x010a, B:45:0x0112, B:48:0x011a, B:49:0x0124, B:52:0x012e, B:54:0x0138, B:56:0x013e, B:58:0x0147, B:60:0x0151, B:61:0x0161, B:64:0x016b, B:65:0x0175, B:68:0x017f, B:70:0x0191, B:72:0x01a3, B:76:0x01ba, B:77:0x01cc, B:80:0x01d6, B:82:0x01e5, B:84:0x01ed, B:86:0x01f3, B:88:0x01f9, B:89:0x01ff, B:92:0x0209, B:94:0x0218, B:96:0x0220, B:97:0x0226, B:100:0x0230, B:101:0x023a, B:104:0x0244, B:105:0x024e, B:108:0x0258, B:110:0x0262, B:112:0x0268, B:114:0x0271, B:116:0x027b, B:117:0x02a1, B:120:0x02ab, B:121:0x02b8, B:124:0x02c2, B:125:0x02c9, B:128:0x02d3, B:129:0x02de, B:132:0x02e8, B:133:0x02ec, B:136:0x02f6, B:138:0x02fc, B:141:0x030a, B:142:0x031e, B:144:0x0324, B:145:0x0333, B:146:0x0342, B:149:0x034c, B:151:0x0356, B:153:0x035c, B:155:0x0364, B:157:0x036c, B:158:0x0382, B:161:0x038c, B:162:0x0396, B:165:0x03aa, B:167:0x03b0, B:170:0x03bc, B:171:0x03ce, B:173:0x03d4, B:174:0x03df, B:175:0x03ea, B:178:0x03f6, B:179:0x0409, B:182:0x0413, B:184:0x0420, B:186:0x0426, B:187:0x042c, B:190:0x0436, B:191:0x043a, B:194:0x0444, B:195:0x044e, B:198:0x0462, B:200:0x0468, B:203:0x0474, B:204:0x0486, B:206:0x048c, B:207:0x0497, B:208:0x04a2, B:211:0x04ac, B:212:0x04b5, B:216:0x04c1, B:219:0x04cd, B:221:0x04d5, B:223:0x04e0, B:225:0x04e5, B:224:0x04e3, B:226:0x04f1, B:229:0x04fb, B:230:0x0507, B:233:0x0511, B:234:0x051b, B:237:0x0525, B:240:0x0530, B:245:0x053c, B:248:0x0547, B:253:0x0553, B:256:0x055e, B:261:0x056a, B:264:0x0575, B:269:0x0581, B:272:0x058c, B:277:0x0598, B:280:0x05a3, B:285:0x05af, B:288:0x05ba, B:293:0x05c6, B:296:0x05d1, B:301:0x05dd, B:303:0x05eb, B:306:0x05f5, B:307:0x05ff, B:310:0x0609, B:311:0x0616, B:314:0x0622, B:316:0x062d, B:318:0x0633, B:319:0x0639, B:322:0x0643, B:324:0x064d, B:326:0x0653, B:328:0x065c, B:330:0x0666, B:331:0x0676, B:334:0x0680, B:336:0x068a, B:338:0x0690, B:340:0x0698, B:342:0x06a0, B:343:0x06b6, B:346:0x06c0, B:347:0x06c7, B:348:0x06ce, B:351:0x06d8, B:353:0x06e5, B:359:0x06f7, B:360:0x0700, B:363:0x070c, B:364:0x0723, B:367:0x0731, B:369:0x073c, B:371:0x0744, B:373:0x0753, B:379:0x0761, B:381:0x076a, B:384:0x0773, B:385:0x0776, B:388:0x077f, B:390:0x0784, B:393:0x078d), top: B:403:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0761 A[Catch: Exception -> 0x07a7, TryCatch #0 {Exception -> 0x07a7, blocks: (B:3:0x001b, B:6:0x0031, B:12:0x0040, B:14:0x0046, B:398:0x079d, B:20:0x0059, B:23:0x0063, B:24:0x0078, B:27:0x0082, B:29:0x0099, B:33:0x00de, B:36:0x00e8, B:37:0x00f1, B:40:0x00fb, B:42:0x0104, B:44:0x010a, B:45:0x0112, B:48:0x011a, B:49:0x0124, B:52:0x012e, B:54:0x0138, B:56:0x013e, B:58:0x0147, B:60:0x0151, B:61:0x0161, B:64:0x016b, B:65:0x0175, B:68:0x017f, B:70:0x0191, B:72:0x01a3, B:76:0x01ba, B:77:0x01cc, B:80:0x01d6, B:82:0x01e5, B:84:0x01ed, B:86:0x01f3, B:88:0x01f9, B:89:0x01ff, B:92:0x0209, B:94:0x0218, B:96:0x0220, B:97:0x0226, B:100:0x0230, B:101:0x023a, B:104:0x0244, B:105:0x024e, B:108:0x0258, B:110:0x0262, B:112:0x0268, B:114:0x0271, B:116:0x027b, B:117:0x02a1, B:120:0x02ab, B:121:0x02b8, B:124:0x02c2, B:125:0x02c9, B:128:0x02d3, B:129:0x02de, B:132:0x02e8, B:133:0x02ec, B:136:0x02f6, B:138:0x02fc, B:141:0x030a, B:142:0x031e, B:144:0x0324, B:145:0x0333, B:146:0x0342, B:149:0x034c, B:151:0x0356, B:153:0x035c, B:155:0x0364, B:157:0x036c, B:158:0x0382, B:161:0x038c, B:162:0x0396, B:165:0x03aa, B:167:0x03b0, B:170:0x03bc, B:171:0x03ce, B:173:0x03d4, B:174:0x03df, B:175:0x03ea, B:178:0x03f6, B:179:0x0409, B:182:0x0413, B:184:0x0420, B:186:0x0426, B:187:0x042c, B:190:0x0436, B:191:0x043a, B:194:0x0444, B:195:0x044e, B:198:0x0462, B:200:0x0468, B:203:0x0474, B:204:0x0486, B:206:0x048c, B:207:0x0497, B:208:0x04a2, B:211:0x04ac, B:212:0x04b5, B:216:0x04c1, B:219:0x04cd, B:221:0x04d5, B:223:0x04e0, B:225:0x04e5, B:224:0x04e3, B:226:0x04f1, B:229:0x04fb, B:230:0x0507, B:233:0x0511, B:234:0x051b, B:237:0x0525, B:240:0x0530, B:245:0x053c, B:248:0x0547, B:253:0x0553, B:256:0x055e, B:261:0x056a, B:264:0x0575, B:269:0x0581, B:272:0x058c, B:277:0x0598, B:280:0x05a3, B:285:0x05af, B:288:0x05ba, B:293:0x05c6, B:296:0x05d1, B:301:0x05dd, B:303:0x05eb, B:306:0x05f5, B:307:0x05ff, B:310:0x0609, B:311:0x0616, B:314:0x0622, B:316:0x062d, B:318:0x0633, B:319:0x0639, B:322:0x0643, B:324:0x064d, B:326:0x0653, B:328:0x065c, B:330:0x0666, B:331:0x0676, B:334:0x0680, B:336:0x068a, B:338:0x0690, B:340:0x0698, B:342:0x06a0, B:343:0x06b6, B:346:0x06c0, B:347:0x06c7, B:348:0x06ce, B:351:0x06d8, B:353:0x06e5, B:359:0x06f7, B:360:0x0700, B:363:0x070c, B:364:0x0723, B:367:0x0731, B:369:0x073c, B:371:0x0744, B:373:0x0753, B:379:0x0761, B:381:0x076a, B:384:0x0773, B:385:0x0776, B:388:0x077f, B:390:0x0784, B:393:0x078d), top: B:403:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static RoutingIntentHandler q(String str, Bundle bundle, Intent intent, Activity context) {
        boolean z10;
        Intent putExtra;
        RoutingType routingType;
        Object obj;
        boolean z11;
        boolean z12;
        Intent intent2;
        String str2;
        boolean z13;
        boolean z14;
        Object obj2;
        HashMap<String, Object> appConfig;
        String a10;
        String str3;
        Intent intent3;
        Intent s10;
        Intent intent4;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        Intent s11;
        Intent s12;
        String str4;
        String str5;
        String str6;
        pp.c cVar;
        Intent s13;
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
        try {
            Log.d("RoutingTag", "link : " + str);
            if (bundle != null && bundle.containsKey(Constants.LINK_TYPE)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                String string = bundle.getString(Constants.LINK_TYPE);
                if (string != null) {
                    int hashCode = string.hashCode();
                    if (hashCode != -1182791039) {
                        if (hashCode != -503392131) {
                            intent4 = null;
                        } else if (string.equals(Constants.APP_PSYCH_APPOINTMENT)) {
                            intent4 = new Intent(context, TelecommunicationsPWAActivity.class).putExtra(Constants.LINK_ID, bundle.getString(Constants.LINK_ID)).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.APPOINTMENT_PSYCHIATRY);
                        }
                        intent3 = intent4;
                    } else if (string.equals(Constants.APP_APPOINTMENT)) {
                        intent4 = new Intent(context, TelecommunicationsPWAActivity.class).putExtra(Constants.LINK_ID, bundle.getString(Constants.LINK_ID)).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.APPOINTMENT_THERAPY);
                        intent3 = intent4;
                    }
                }
                intent3 = null;
            } else {
                if (str != null) {
                    int hashCode2 = str.hashCode();
                    y0 y0Var = y0.MIGRATION_SUCCESS;
                    pp.c cVar2 = pp.c.FLOW_PSYCHIATRY;
                    pp.c cVar3 = pp.c.FLOW_THERAPY;
                    switch (hashCode2) {
                        case -1781254181:
                            if (!str.equals("mo_psychiatrist_listing")) {
                                break;
                            } else {
                                putExtra = new Intent(context, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.PSYCHIATRIST_LISTING);
                                intent2 = putExtra;
                                intent3 = intent2;
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
                                    z11 = true;
                                    if (intent.getBooleanExtra(Constants.NEW_COURSE_FLAG, false)) {
                                        z12 = true;
                                        if (z12) {
                                            s19.putExtra(Constants.NEW_COURSE_FLAG, z11);
                                            intent.putExtra(Constants.NEW_COURSE_FLAG, false);
                                        }
                                        intent2 = s19;
                                        intent3 = intent2;
                                        break;
                                    }
                                } else {
                                    z11 = true;
                                }
                                z12 = false;
                                if (z12) {
                                }
                                intent2 = s19;
                                intent3 = intent2;
                            }
                        case -1245599982:
                            if (!str.equals(Constants.SCREEN_THERAPIST_PACKAGES)) {
                                break;
                            } else {
                                putExtra = new Intent(context, TelecommunicationsPWAActivity.class);
                                putExtra.putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.CROSS_PROVIDER);
                                putExtra.putExtra("isTherapy", true);
                                putExtra.putExtra("providerType", "therapist");
                                intent2 = putExtra;
                                intent3 = intent2;
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
                                    z13 = true;
                                    if (intent.getBooleanExtra(str2, false)) {
                                        z14 = true;
                                        if (z14) {
                                            intent2.putExtra(str2, z13);
                                            intent.putExtra(str2, false);
                                        }
                                        intent3 = intent2;
                                        break;
                                    }
                                } else {
                                    str2 = Constants.NEW_COURSE_FLAG;
                                    z13 = true;
                                }
                                z14 = false;
                                if (z14) {
                                }
                                intent3 = intent2;
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
                                break;
                            }
                        case -752877989:
                            if (!str.equals("mo_couples_listing")) {
                                break;
                            } else {
                                putExtra = new Intent(context, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.COUPLES_LISTING);
                                intent2 = putExtra;
                                intent3 = intent2;
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
                                break;
                            }
                        case -479652066:
                            if (!str.equals("mo_library")) {
                                break;
                            } else {
                                intent4 = new Intent(context, LibraryActivity.class);
                                if (bundle != null && bundle.containsKey("highlight")) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (z15) {
                                    intent4.putExtra("highlight", bundle.getString("highlight"));
                                }
                                if (bundle != null && bundle.containsKey("view_all")) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (z16) {
                                    intent4.putExtra("view_all", bundle.getString("view_all"));
                                }
                                if (bundle != null && bundle.containsKey("operation")) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if (z17) {
                                    intent4.putExtra("operation", bundle.getString("operation"));
                                }
                                if (bundle != null && bundle.containsKey("parentType")) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                if (z18) {
                                    intent4.putExtra("parentType", bundle.getString("parentType"));
                                }
                                if (bundle != null && bundle.containsKey("parentId")) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                if (z19) {
                                    intent4.putExtra("parentId", bundle.getString("parentId"));
                                }
                                if (bundle != null && bundle.containsKey("itemType")) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                if (z20) {
                                    intent4.putExtra("itemType", bundle.getString("itemType"));
                                }
                                if (bundle != null && bundle.containsKey("id")) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                if (z21) {
                                    intent4.putExtra("id", bundle.getString("id"));
                                }
                                if (bundle != null && bundle.containsKey("finish_on_back_pressed")) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                if (z22) {
                                    intent4.putExtra("finish_on_back_pressed", Boolean.parseBoolean(bundle.getString("finish_on_back_pressed")));
                                }
                                intent3 = intent4;
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
                                break;
                            }
                        case -426874039:
                            if (!str.equals(Constants.SCREEN_MONETIZATION)) {
                                break;
                            } else {
                                s12 = r.s(context, false);
                                intent4 = s12.putExtra("source", "offer");
                                intent3 = intent4;
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
                                    cVar = pp.c.PROFILE;
                                } else {
                                    cVar = pp.c.PROFILE_PSYCHIATRIST;
                                }
                                intent4 = intent6.putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar).putExtra(SessionManager.KEY_UUID, str6);
                                intent3 = intent4;
                                break;
                            }
                        case -309425751:
                            if (!str.equals(Constants.SCREEN_PROFILE)) {
                                break;
                            } else {
                                intent4 = new Intent(context, ExperimentProfileActivity.class);
                                intent3 = intent4;
                                break;
                            }
                        case -289598831:
                            if (!str.equals(Constants.SCREEN_V3_ACTIVITY)) {
                                break;
                            } else {
                                if (sp.b.K()) {
                                    wn.b.f36765a.getClass();
                                    if (wn.b.b() != y0Var) {
                                        Extensions extensions = Extensions.INSTANCE;
                                        String string2 = context.getString(R.string.goalMigrationProgress);
                                        i.f(string2, "context.getString(R.string.goalMigrationProgress)");
                                        extensions.toast(context, string2, 1);
                                        break;
                                    }
                                }
                                intent4 = sp.b.K() ? new Intent(context, FirestoreGoalsActivity.class).putExtra("source", Constants.SCREEN_DASHBOARD) : new Intent(context, V3GoalsActivity.class).putExtra("source", Constants.SCREEN_DASHBOARD);
                                intent3 = intent4;
                                break;
                            }
                        case -275453495:
                            if (!str.equals(Constants.LINK_DYNAMIC_CAMPAIGN)) {
                                break;
                            } else {
                                s13 = r.s(context, false);
                                intent4 = s13.putExtra("source", Constants.LINK_DYNAMIC_CAMPAIGN);
                                intent3 = intent4;
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
                        case 1197398:
                            if (!str.equals("mo_pending_tools")) {
                                break;
                            } else {
                                Intent putExtra2 = new Intent(context, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.PENDING_PROVIDER_TOOLS);
                                if (bundle != null) {
                                    str7 = bundle.getString("provider_type", "");
                                } else {
                                    str7 = null;
                                }
                                intent4 = putExtra2.putExtra("type", str7);
                                intent3 = intent4;
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
                                break;
                            }
                        case 173432253:
                            if (!str.equals(Constants.SCREEN_GOALS_LIST)) {
                                break;
                            } else {
                                if (sp.b.K()) {
                                    wn.b.f36765a.getClass();
                                    if (wn.b.b() != y0Var) {
                                        Extensions extensions2 = Extensions.INSTANCE;
                                        String string3 = context.getString(R.string.goalMigrationProgress);
                                        i.f(string3, "context.getString(R.string.goalMigrationProgress)");
                                        extensions2.toast(context, string3, 1);
                                        break;
                                    }
                                }
                                intent4 = sp.b.K() ? new Intent(context, FirestoreGoalsActivity.class).putExtra("source", Constants.SCREEN_DASHBOARD) : new Intent(context, V3GoalsActivity.class).putExtra("source", Constants.SCREEN_DASHBOARD);
                                intent3 = intent4;
                                break;
                            }
                        case 178288279:
                            if (!str.equals(Constants.LINK_OFFER_PRO_QUARTERLY_PLUS_PURCHASE_CANCELLED)) {
                                break;
                            } else {
                                s14 = r.s(context, false);
                                intent4 = s14.putExtra("source", Constants.LINK_OFFER_PRO_QUARTERLY_PLUS_PURCHASE_CANCELLED);
                                intent3 = intent4;
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
                                    break;
                                }
                            }
                            break;
                        case 392182873:
                            if (!str.equals(Constants.SCREEN_COACHMARKS_1)) {
                                break;
                            } else {
                                if (sp.b.K()) {
                                    wn.b.f36765a.getClass();
                                    if (wn.b.b() != y0Var) {
                                        Extensions extensions3 = Extensions.INSTANCE;
                                        String string4 = context.getString(R.string.goalMigrationProgress);
                                        i.f(string4, "context.getString(R.string.goalMigrationProgress)");
                                        extensions3.toast(context, string4, 1);
                                        break;
                                    }
                                }
                                intent4 = sp.b.K() ? new Intent(context, FirestoreGoalsActivity.class).putExtra("source", Constants.SCREEN_DASHBOARD) : new Intent(context, V3GoalsActivity.class).putExtra("source", Constants.SCREEN_DASHBOARD);
                                intent3 = intent4;
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
                                RoutingType routingType3 = RoutingType.JOURNAL_ROUTE;
                                intent3 = new Intent(context, JournalActivity.class);
                                routingType2 = routingType3;
                                break;
                            }
                        case 1228058550:
                            if (!str.equals(Constants.SCREEN_THERAPIST_DETAIL)) {
                                break;
                            } else {
                                intent4 = new Intent(context, TelecommunicationsPWAActivity.class);
                                intent3 = intent4;
                                break;
                            }
                        case 1242473058:
                            if (!str.equals("mo_therapist_listing")) {
                                break;
                            } else {
                                intent4 = new Intent(context, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.THERAPIST_LISTING);
                                intent3 = intent4;
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
                                break;
                            }
                        case 1514864697:
                            if (!str.equals(Constants.LINK_OFFER_PRO_QUARTERLY_FREE_TRIAL)) {
                                break;
                            } else {
                                s16 = r.s(context, false);
                                intent4 = s16.putExtra("source", Constants.LINK_OFFER_PRO_QUARTERLY_FREE_TRIAL);
                                intent3 = intent4;
                                break;
                            }
                        case 1592157014:
                            if (!str.equals(Constants.LINK_TELECOMMUNICATION_CUSTOM_URL)) {
                                break;
                            } else {
                                Intent putExtra3 = new Intent(context, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.FLOW_REDIRECT);
                                if (bundle != null) {
                                    str8 = bundle.getString(Constants.NOTIFICATION_URL, "");
                                } else {
                                    str8 = null;
                                }
                                intent4 = putExtra3.putExtra("redirect_url", str8);
                                intent3 = intent4;
                                break;
                            }
                        case 1678142709:
                            if (!str.equals("mo_provider_package")) {
                                break;
                            } else {
                                Intent putExtra4 = new Intent(context, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.PROVIDER_PACKAGE);
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
                                break;
                            }
                        case 1922467472:
                            if (str.equals(Constants.SCREEN_FIREBASE_CHAT) && (a12 = FirebaseAuth.getInstance().a()) != null && !i.b(a12, "")) {
                                i.d(bundle);
                                if (bundle.containsKey(Constants.FIREBASE_CHAT_TO_USER_ID) && i.b(bundle.getString(Constants.FIREBASE_CHAT_TO_USER_ID), a12)) {
                                    intent4 = new Intent(context, TelecommunicationsPWAActivity.class).putExtra("chat", true).putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar3);
                                    intent3 = intent4;
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
                                break;
                            }
                        case 2130861976:
                            if (!str.equals("new_journal")) {
                                break;
                            } else {
                                RoutingType routingType4 = RoutingType.JOURNAL_ROUTE;
                                Intent intent7 = new Intent(context, JournalActivity.class);
                                if (bundle != null) {
                                    str11 = bundle.getString("type", "");
                                } else {
                                    str11 = null;
                                }
                                Intent putExtra6 = intent7.putExtra("type", str11);
                                routingType2 = routingType4;
                                intent3 = putExtra6;
                                break;
                            }
                        case 2135222301:
                            if (!str.equals(Constants.SCREEN_RELIEF_BOX)) {
                                break;
                            } else {
                                intent4 = new Intent(context, BotPwaActivity.class);
                                intent3 = intent4;
                                break;
                            }
                    }
                    return new RoutingIntentHandler(intent3, routingType2, false, 4, null);
                }
                intent3 = null;
            }
            routingType2 = null;
            return new RoutingIntentHandler(intent3, routingType2, false, 4, null);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
            return new RoutingIntentHandler(null, null, false, 4, null);
        }
    }

    public static boolean u(String phoneNumber) {
        i.g(phoneNumber, "phoneNumber");
        if (n.B0(phoneNumber)) {
            return false;
        }
        int length = phoneNumber.length();
        int i6 = 0;
        while (i6 < length) {
            char charAt = phoneNumber.charAt(i6);
            i6++;
            if (!PhoneNumberUtils.isDialable(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static pi.c v(JSONObject jSONObject) {
        String str;
        String string = jSONObject.getString(Constants.CAMPAIGN_ID);
        i.f(string, "campaignJson.getString(CAMPAIGN_ID)");
        if (jSONObject.optJSONObject("trigger") != null) {
            str = "smart";
        } else {
            str = "general";
        }
        String str2 = str;
        String string2 = jSONObject.getString("status");
        i.f(string2, "campaignJson.getString(STATUS)");
        String string3 = jSONObject.getString("template_type");
        i.f(string3, "campaignJson.getString(TEMPLATE_TYPE)");
        f8.g gVar = new f8.g(0L, 0L, false);
        long j10 = jSONObject.getJSONObject("delivery").getLong("priority");
        String string4 = jSONObject.getString("updated_time");
        i.f(string4, "campaignJson.getString(LAST_UPDATED_TIME)");
        long V = sp.b.V(string4);
        long n10 = sp.b.n() + 5184000;
        String string5 = jSONObject.getString("expiry_time");
        i.f(string5, "campaignJson.getString(EXPIRY_TIME)");
        long V2 = sp.b.V(string5);
        if (n10 >= V2) {
            V2 = n10;
        }
        long n11 = sp.b.n();
        String jSONObject2 = jSONObject.toString();
        i.f(jSONObject2, "campaignJson.toString()");
        return new pi.c(-1L, string, str2, string2, string3, gVar, j10, V, V2, n11, jSONObject2);
    }

    public static th.a w(ih.d dVar) {
        HashSet hashSet = new HashSet(th.b.f33018a);
        hashSet.addAll(dVar.f20066o);
        HashSet hashSet2 = new HashSet(th.b.f33019b);
        hashSet2.addAll(dVar.f20068q);
        boolean A2 = A(dVar.f20053a);
        boolean A3 = A(dVar.f20054b);
        A(dVar.f20055c);
        A(dVar.f20056d);
        A(dVar.f20057e);
        A(dVar.f);
        A(dVar.f20075y);
        mu.b bVar = new mu.b(A3);
        long j10 = 1000;
        ph.a aVar = new ph.a(dVar.f20060i, dVar.f20061j, dVar.f20062k, dVar.f20065n, hashSet, dVar.f20067p * j10, hashSet2, dVar.r, dVar.f20074x, A(dVar.f20058g), new HashSet(dVar.B), dVar.C);
        fs.c cVar = new fs.c(dVar.f20070t * j10, dVar.f20071u);
        ph.c cVar2 = new ph.c(dVar.f20063l, dVar.A);
        Integer num = hh.e.f17607a.get(dVar.f20073w);
        if (num == null) {
            num = 0;
        }
        return new th.a(A2, bVar, aVar, cVar, cVar2, new ph.b(num.intValue(), A(dVar.f20059h)), new s(dVar.f20069s * j10), new ih.g(A(dVar.f20076z)), new s5(dVar.f20072v, 6));
    }

    public static byte[][] x(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance(Byte.TYPE, bArr[0].length, bArr.length);
        for (int i6 = 0; i6 < bArr.length; i6++) {
            int length = (bArr.length - i6) - 1;
            for (int i10 = 0; i10 < bArr[0].length; i10++) {
                bArr2[i10][length] = bArr[i6][i10];
            }
        }
        return bArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x08f2 A[LOOP:29: B:419:0x08f0->B:420:0x08f2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x090b  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0914  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x099c  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0463 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0336 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:509:0x066e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0705 A[SYNTHETIC] */
    @Override // bg.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dg.b O(String str, bg.a aVar, int i6, int i10, Map map) {
        Charset charset;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10;
        int i17;
        Charset charset2;
        Charset charset3;
        boolean z11;
        int i18;
        int i19;
        int i20;
        char c10;
        int i21;
        int i22;
        boolean z12;
        boolean z13;
        boolean z14;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int[][] iArr;
        int i28;
        boolean z15;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        byte[] bytes;
        boolean z16;
        int i35;
        boolean z17;
        boolean z18;
        boolean z19;
        bg.b bVar;
        bg.b bVar2;
        int i36;
        int i37;
        int i38;
        int i39;
        dg.b bVar3;
        boolean z20;
        boolean z21;
        boolean z22;
        int i40 = 1;
        switch (this.f12843u) {
            case 18:
                if (!str.isEmpty()) {
                    if (aVar == bg.a.DATA_MATRIX) {
                        if (i6 >= 0 && i10 >= 0) {
                            fg.f fVar = fg.f.FORCE_NONE;
                            if (map != null) {
                                fg.f fVar2 = (fg.f) map.get(bg.c.DATA_MATRIX_SHAPE);
                                if (fVar2 != null) {
                                    fVar = fVar2;
                                }
                                bVar2 = (bg.b) map.get(bg.c.MIN_SIZE);
                                if (bVar2 == null) {
                                    bVar2 = null;
                                }
                                bVar = (bg.b) map.get(bg.c.MAX_SIZE);
                                if (bVar == null) {
                                    bVar = null;
                                }
                            } else {
                                bVar = null;
                                bVar2 = null;
                            }
                            fg.b[] bVarArr = {new e0(7), new b(19), new fg.g(0), new fg.g(1), new e0(8), new r()};
                            c cVar = new c(str);
                            cVar.f15032b = fVar;
                            cVar.f15033c = bVar2;
                            cVar.f15034d = bVar;
                            if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
                                cVar.e((char) 236);
                                cVar.f15038i = 2;
                                cVar.f += 7;
                            } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
                                cVar.e((char) 237);
                                cVar.f15038i = 2;
                                cVar.f += 7;
                            }
                            int i41 = 0;
                            while (cVar.c()) {
                                bVarArr[i41].c(cVar);
                                int i42 = cVar.f15036g;
                                if (i42 >= 0) {
                                    cVar.f15036g = -1;
                                    i41 = i42;
                                }
                            }
                            int a10 = cVar.a();
                            cVar.d(cVar.a());
                            int i43 = cVar.f15037h.f15045b;
                            if (a10 < i43 && i41 != 0 && i41 != 5 && i41 != 4) {
                                cVar.e((char) 254);
                            }
                            StringBuilder sb2 = cVar.f15035e;
                            if (sb2.length() < i43) {
                                sb2.append((char) 129);
                            }
                            while (sb2.length() < i43) {
                                int length = (((sb2.length() + 1) * 149) % 253) + 1 + 129;
                                if (length > 254) {
                                    length -= 254;
                                }
                                sb2.append((char) length);
                            }
                            String sb3 = sb2.toString();
                            fg.e f = fg.e.f(sb3.length(), fVar, bVar2, bVar);
                            int[] iArr2 = fg.d.f15039a;
                            int length2 = sb3.length();
                            int i44 = f.f15045b;
                            if (length2 == i44) {
                                int i45 = f.f15046c;
                                StringBuilder sb4 = new StringBuilder(i44 + i45);
                                sb4.append(sb3);
                                int c11 = f.c();
                                if (c11 == 1) {
                                    sb4.append(fg.d.a(i45, sb3));
                                } else {
                                    sb4.setLength(sb4.capacity());
                                    int[] iArr3 = new int[c11];
                                    int[] iArr4 = new int[c11];
                                    int[] iArr5 = new int[c11];
                                    int i46 = 0;
                                    while (i46 < c11) {
                                        int i47 = i46 + 1;
                                        iArr3[i46] = f.a(i47);
                                        iArr4[i46] = f.f15050h;
                                        iArr5[i46] = 0;
                                        if (i46 > 0) {
                                            iArr5[i46] = iArr5[i46 - 1] + iArr3[i46];
                                        }
                                        i46 = i47;
                                    }
                                    for (int i48 = 0; i48 < c11; i48++) {
                                        StringBuilder sb5 = new StringBuilder(iArr3[i48]);
                                        int i49 = i48;
                                        while (true) {
                                            int i50 = f.f15045b;
                                            if (i49 < i50) {
                                                sb5.append(sb3.charAt(i49));
                                                i49 += c11;
                                            } else {
                                                String a11 = fg.d.a(iArr4[i48], sb5.toString());
                                                int i51 = 0;
                                                int i52 = i48;
                                                while (i52 < iArr4[i48] * c11) {
                                                    sb4.setCharAt(i50 + i52, a11.charAt(i51));
                                                    i52 += c11;
                                                    i51++;
                                                }
                                            }
                                        }
                                    }
                                }
                                String sb6 = sb4.toString();
                                int b10 = f.b();
                                int i53 = f.f15047d;
                                int e10 = f.e();
                                int i54 = f.f15048e;
                                u uVar = new u(sb6, b10 * i53, e10 * i54);
                                int i55 = 0;
                                int i56 = 0;
                                int i57 = 4;
                                while (true) {
                                    int i58 = uVar.f5197a;
                                    if (i57 == i58 && i55 == 0) {
                                        uVar.e(i58 - 1, 0, i56, i40);
                                        uVar.e(uVar.f5197a - i40, i40, i56, 2);
                                        uVar.e(uVar.f5197a - i40, 2, i56, 3);
                                        uVar.e(0, uVar.f5198b - 2, i56, 4);
                                        uVar.e(0, uVar.f5198b - i40, i56, 5);
                                        uVar.e(i40, uVar.f5198b - i40, i56, 6);
                                        uVar.e(2, uVar.f5198b - i40, i56, 7);
                                        uVar.e(3, uVar.f5198b - i40, i56, 8);
                                        i56++;
                                    }
                                    int i59 = uVar.f5197a;
                                    if (i57 == i59 - 2 && i55 == 0 && uVar.f5198b % 4 != 0) {
                                        uVar.e(i59 - 3, 0, i56, i40);
                                        uVar.e(uVar.f5197a - 2, 0, i56, 2);
                                        uVar.e(uVar.f5197a - i40, 0, i56, 3);
                                        uVar.e(0, uVar.f5198b - 4, i56, 4);
                                        uVar.e(0, uVar.f5198b - 3, i56, 5);
                                        uVar.e(0, uVar.f5198b - 2, i56, 6);
                                        uVar.e(0, uVar.f5198b - 1, i56, 7);
                                        uVar.e(1, uVar.f5198b - 1, i56, 8);
                                        i56++;
                                    }
                                    int i60 = uVar.f5197a;
                                    if (i57 == i60 - 2 && i55 == 0 && uVar.f5198b % 8 == 4) {
                                        uVar.e(i60 - 3, 0, i56, 1);
                                        uVar.e(uVar.f5197a - 2, 0, i56, 2);
                                        uVar.e(uVar.f5197a - 1, 0, i56, 3);
                                        uVar.e(0, uVar.f5198b - 2, i56, 4);
                                        uVar.e(0, uVar.f5198b - 1, i56, 5);
                                        uVar.e(1, uVar.f5198b - 1, i56, 6);
                                        uVar.e(2, uVar.f5198b - 1, i56, 7);
                                        uVar.e(3, uVar.f5198b - 1, i56, 8);
                                        i56++;
                                    }
                                    int i61 = uVar.f5197a;
                                    if (i57 == i61 + 4 && i55 == 2 && uVar.f5198b % 8 == 0) {
                                        uVar.e(i61 - 1, 0, i56, 1);
                                        uVar.e(uVar.f5197a - 1, uVar.f5198b - 1, i56, 2);
                                        uVar.e(0, uVar.f5198b - 3, i56, 3);
                                        uVar.e(0, uVar.f5198b - 2, i56, 4);
                                        uVar.e(0, uVar.f5198b - 1, i56, 5);
                                        uVar.e(1, uVar.f5198b - 3, i56, 6);
                                        uVar.e(1, uVar.f5198b - 2, i56, 7);
                                        uVar.e(1, uVar.f5198b - 1, i56, 8);
                                        i56++;
                                    }
                                    do {
                                        if (i57 < uVar.f5197a && i55 >= 0 && !uVar.d(i55, i57)) {
                                            uVar.i(i57, i55, i56);
                                            i56++;
                                        }
                                        i57 -= 2;
                                        i55 += 2;
                                        if (i57 >= 0) {
                                        }
                                        i36 = i57 + 1;
                                        i37 = i55 + 3;
                                        do {
                                            if (i36 >= 0 && i37 < uVar.f5198b && !uVar.d(i37, i36)) {
                                                uVar.i(i36, i37, i56);
                                                i56++;
                                            }
                                            i36 += 2;
                                            i37 -= 2;
                                            i38 = uVar.f5197a;
                                            if (i36 >= i38) {
                                            }
                                            i57 = i36 + 3;
                                            i55 = i37 + 1;
                                            if (i57 < i38 && i55 >= (i39 = uVar.f5198b)) {
                                                if (!uVar.d(i39 - 1, i38 - 1)) {
                                                    int i62 = uVar.f5198b;
                                                    int i63 = uVar.f5197a;
                                                    Object obj = uVar.f5200d;
                                                    byte b11 = (byte) 1;
                                                    ((byte[]) obj)[((i63 - 1) * i62) + (i62 - 1)] = b11;
                                                    ((byte[]) obj)[((i63 - 2) * i62) + (i62 - 2)] = b11;
                                                }
                                                int b12 = f.b() * i53;
                                                int e11 = f.e() * i54;
                                                jg.b bVar4 = new jg.b(f.d(), (f.e() * i54) + (f.e() << 1));
                                                int i64 = 0;
                                                int i65 = 0;
                                                while (i64 < e11) {
                                                    int i66 = i64 % i54;
                                                    if (i66 == 0) {
                                                        int i67 = 0;
                                                        for (int i68 = 0; i68 < f.d(); i68++) {
                                                            if (i68 % 2 == 0) {
                                                                z22 = true;
                                                            } else {
                                                                z22 = false;
                                                            }
                                                            bVar4.c(i67, i65, z22);
                                                            i67++;
                                                        }
                                                        i65++;
                                                    }
                                                    int i69 = 0;
                                                    int i70 = 0;
                                                    while (i69 < b12) {
                                                        int i71 = i69 % i53;
                                                        int i72 = b12;
                                                        if (i71 == 0) {
                                                            bVar4.c(i70, i65, true);
                                                            i70++;
                                                        }
                                                        int i73 = e11;
                                                        if (((byte[]) uVar.f5200d)[(uVar.f5198b * i64) + i69] == 1) {
                                                            z20 = true;
                                                        } else {
                                                            z20 = false;
                                                        }
                                                        bVar4.c(i70, i65, z20);
                                                        i70++;
                                                        if (i71 == i53 - 1) {
                                                            if (i64 % 2 == 0) {
                                                                z21 = true;
                                                            } else {
                                                                z21 = false;
                                                            }
                                                            bVar4.c(i70, i65, z21);
                                                            i70++;
                                                        }
                                                        i69++;
                                                        b12 = i72;
                                                        e11 = i73;
                                                    }
                                                    int i74 = b12;
                                                    int i75 = e11;
                                                    i65++;
                                                    if (i66 == i54 - 1) {
                                                        int i76 = 0;
                                                        for (int i77 = 0; i77 < f.d(); i77++) {
                                                            bVar4.c(i76, i65, true);
                                                            i76++;
                                                        }
                                                        i65++;
                                                    }
                                                    i64++;
                                                    b12 = i74;
                                                    e11 = i75;
                                                }
                                                int i78 = bVar4.f22014b;
                                                int i79 = bVar4.f22015c;
                                                int max = Math.max(i6, i78);
                                                int max2 = Math.max(i10, i79);
                                                int min = Math.min(max / i78, max2 / i79);
                                                int i80 = (max - (i78 * min)) / 2;
                                                int i81 = (max2 - (i79 * min)) / 2;
                                                if (i10 >= i79 && i6 >= i78) {
                                                    bVar3 = new dg.b(i6, i10);
                                                } else {
                                                    bVar3 = new dg.b(i78, i79);
                                                    i80 = 0;
                                                    i81 = 0;
                                                }
                                                int[] iArr6 = bVar3.f12849x;
                                                int length3 = iArr6.length;
                                                for (int i82 = 0; i82 < length3; i82++) {
                                                    iArr6[i82] = 0;
                                                }
                                                int i83 = 0;
                                                while (i83 < i79) {
                                                    int i84 = 0;
                                                    int i85 = i80;
                                                    while (i84 < i78) {
                                                        if (bVar4.a(i84, i83) == 1) {
                                                            bVar3.c(i85, i81, min, min);
                                                        }
                                                        i84++;
                                                        i85 += min;
                                                    }
                                                    i83++;
                                                    i81 += min;
                                                }
                                                return bVar3;
                                            }
                                            i40 = 1;
                                        } while (i37 >= 0);
                                        i57 = i36 + 3;
                                        i55 = i37 + 1;
                                        if (i57 < i38) {
                                        }
                                        i40 = 1;
                                    } while (i55 < uVar.f5198b);
                                    i36 = i57 + 1;
                                    i37 = i55 + 3;
                                    do {
                                        if (i36 >= 0) {
                                            uVar.i(i36, i37, i56);
                                            i56++;
                                        }
                                        i36 += 2;
                                        i37 -= 2;
                                        i38 = uVar.f5197a;
                                        if (i36 >= i38) {
                                        }
                                        i57 = i36 + 3;
                                        i55 = i37 + 1;
                                        if (i57 < i38) {
                                        }
                                        i40 = 1;
                                    } while (i37 >= 0);
                                    i57 = i36 + 3;
                                    i55 = i37 + 1;
                                    if (i57 < i38) {
                                    }
                                    i40 = 1;
                                }
                            } else {
                                throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
                            }
                        } else {
                            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i6 + 'x' + i10);
                        }
                    } else {
                        throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(aVar)));
                    }
                } else {
                    throw new IllegalArgumentException("Found empty contents");
                }
                break;
            default:
                if (aVar == bg.a.PDF_417) {
                    if (map != null) {
                        bg.c cVar2 = bg.c.PDF417_COMPACT;
                        if (map.containsKey(cVar2)) {
                            z10 = Boolean.valueOf(map.get(cVar2).toString()).booleanValue();
                        } else {
                            z10 = false;
                        }
                        bg.c cVar3 = bg.c.PDF417_COMPACTION;
                        if (map.containsKey(cVar3)) {
                            i12 = d.A(map.get(cVar3).toString());
                        } else {
                            i12 = 1;
                        }
                        bg.c cVar4 = bg.c.PDF417_DIMENSIONS;
                        if (map.containsKey(cVar4)) {
                            ((hg.b) map.get(cVar4)).getClass();
                            i13 = 0;
                            i14 = 0;
                            i15 = 0;
                            i16 = 0;
                        } else {
                            i13 = 2;
                            i14 = 2;
                            i15 = 30;
                            i16 = 30;
                        }
                        bg.c cVar5 = bg.c.MARGIN;
                        if (map.containsKey(cVar5)) {
                            i11 = Integer.parseInt(map.get(cVar5).toString());
                        } else {
                            i11 = 30;
                        }
                        bg.c cVar6 = bg.c.ERROR_CORRECTION;
                        if (map.containsKey(cVar6)) {
                            i17 = Integer.parseInt(map.get(cVar6).toString());
                        } else {
                            i17 = 2;
                        }
                        bg.c cVar7 = bg.c.CHARACTER_SET;
                        if (map.containsKey(cVar7)) {
                            charset = Charset.forName(map.get(cVar7).toString());
                        } else {
                            charset = null;
                        }
                    } else {
                        charset = null;
                        i11 = 30;
                        i12 = 1;
                        i13 = 2;
                        i14 = 2;
                        i15 = 30;
                        i16 = 30;
                        z10 = false;
                        i17 = 2;
                    }
                    if (i17 >= 0 && i17 <= 8) {
                        int i86 = 1 << (i17 + 1);
                        byte[] bArr = hg.c.f17599a;
                        StringBuilder sb7 = new StringBuilder(str.length());
                        Charset charset4 = hg.c.f17603e;
                        if (charset == null) {
                            charset3 = charset4;
                        } else {
                            if (!charset4.equals(charset)) {
                                charset2 = charset;
                                dg.c cVar8 = (dg.c) dg.c.f12851x.get(charset.name());
                                if (cVar8 != null) {
                                    int i87 = cVar8.f12853u[0];
                                    if (i87 >= 0 && i87 < 900) {
                                        sb7.append((char) 927);
                                        sb7.append((char) i87);
                                    } else if (i87 < 810900) {
                                        sb7.append((char) 926);
                                        sb7.append((char) ((i87 / 900) - 1));
                                        sb7.append((char) (i87 % 900));
                                    } else if (i87 < 811800) {
                                        sb7.append((char) 925);
                                        sb7.append((char) (810900 - i87));
                                    } else {
                                        throw new WriterException("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i87)));
                                    }
                                }
                            } else {
                                charset2 = charset;
                            }
                            charset3 = charset2;
                        }
                        int length4 = str.length();
                        int d10 = v.h.d(i12);
                        if (d10 != 1) {
                            if (d10 != 2) {
                                if (d10 != 3) {
                                    int i88 = 0;
                                    int i89 = 0;
                                    while (true) {
                                        int i90 = 0;
                                        while (i89 < length4) {
                                            i28 = i11;
                                            int length5 = str.length();
                                            if (i89 < length5) {
                                                int i91 = 0;
                                                z15 = z10;
                                                int i92 = i89;
                                                char charAt = str.charAt(i89);
                                                while (true) {
                                                    if (charAt >= '0' && charAt <= '9') {
                                                        z19 = true;
                                                    } else {
                                                        z19 = false;
                                                    }
                                                    if (z19 && i92 < length5) {
                                                        i91++;
                                                        i92++;
                                                        if (i92 < length5) {
                                                            charAt = str.charAt(i92);
                                                        }
                                                    }
                                                }
                                                i29 = i91;
                                            } else {
                                                z15 = z10;
                                                i29 = 0;
                                            }
                                            char c12 = '\r';
                                            if (i29 >= 13) {
                                                break;
                                            }
                                            int length6 = str.length();
                                            int i93 = i89;
                                            while (true) {
                                                if (i93 < length6) {
                                                    i30 = i13;
                                                    int i94 = 0;
                                                    i31 = i17;
                                                    char charAt2 = str.charAt(i93);
                                                    while (i94 < c12) {
                                                        if (charAt2 >= '0' && charAt2 <= '9') {
                                                            z18 = true;
                                                        } else {
                                                            z18 = false;
                                                        }
                                                        if (z18 && i93 < length6) {
                                                            i94++;
                                                            i93++;
                                                            if (i93 < length6) {
                                                                charAt2 = str.charAt(i93);
                                                            }
                                                            c12 = '\r';
                                                        } else {
                                                            c12 = '\r';
                                                            if (i94 < c12) {
                                                                i32 = (i93 - i89) - i94;
                                                            } else {
                                                                if (i94 <= 0) {
                                                                    char charAt3 = str.charAt(i93);
                                                                    if (charAt3 != '\t' && charAt3 != '\n' && charAt3 != c12 && (charAt3 < ' ' || charAt3 > '~')) {
                                                                        z17 = false;
                                                                    } else {
                                                                        z17 = true;
                                                                    }
                                                                    if (z17) {
                                                                        i93++;
                                                                        c12 = '\r';
                                                                    }
                                                                }
                                                                i17 = i31;
                                                                i13 = i30;
                                                            }
                                                        }
                                                    }
                                                    if (i94 < c12) {
                                                    }
                                                } else {
                                                    i30 = i13;
                                                    i31 = i17;
                                                }
                                            }
                                            i32 = i93 - i89;
                                            if (i32 < 5 && i29 != length4) {
                                                CharsetEncoder newEncoder = charset3.newEncoder();
                                                int length7 = str.length();
                                                for (int i95 = i89; i95 < length7; i95++) {
                                                    char charAt4 = str.charAt(i95);
                                                    int i96 = 0;
                                                    for (int i97 = 13; i96 < i97; i97 = 13) {
                                                        if (charAt4 >= '0' && charAt4 <= '9') {
                                                            z16 = true;
                                                        } else {
                                                            z16 = false;
                                                        }
                                                        if (z16 && (i35 = i95 + (i96 = i96 + 1)) < length7) {
                                                            charAt4 = str.charAt(i35);
                                                        }
                                                        if (i96 >= 13) {
                                                            char charAt5 = str.charAt(i95);
                                                            if (!newEncoder.canEncode(charAt5)) {
                                                                throw new WriterException("Non-encodable character detected: " + charAt5 + " (Unicode: " + ((int) charAt5) + ')');
                                                            }
                                                        } else {
                                                            i34 = i95 - i89;
                                                            if (i34 == 0) {
                                                                i34 = 1;
                                                            }
                                                            int i98 = i89 + i34;
                                                            bytes = str.substring(i89, i98).getBytes(charset3);
                                                            if (bytes.length != 1 && i88 == 0) {
                                                                hg.c.a(bytes, 1, 0, sb7);
                                                            } else {
                                                                hg.c.a(bytes, bytes.length, i88, sb7);
                                                                i88 = 1;
                                                                i90 = 0;
                                                            }
                                                            i11 = i28;
                                                            i89 = i98;
                                                        }
                                                    }
                                                    if (i96 >= 13) {
                                                    }
                                                }
                                                i34 = i95 - i89;
                                                if (i34 == 0) {
                                                }
                                                int i982 = i89 + i34;
                                                bytes = str.substring(i89, i982).getBytes(charset3);
                                                if (bytes.length != 1) {
                                                }
                                                hg.c.a(bytes, bytes.length, i88, sb7);
                                                i88 = 1;
                                                i90 = 0;
                                                i11 = i28;
                                                i89 = i982;
                                            } else {
                                                if (i88 != 0) {
                                                    sb7.append((char) 900);
                                                    i33 = 0;
                                                    i88 = 0;
                                                } else {
                                                    i33 = i90;
                                                }
                                                i90 = hg.c.c(str, i89, i32, sb7, i33);
                                                i89 += i32;
                                                i11 = i28;
                                            }
                                            z10 = z15;
                                            i17 = i31;
                                            i13 = i30;
                                        }
                                        z11 = z10;
                                        i18 = i13;
                                        i19 = i11;
                                        i20 = i17;
                                        sb7.append((char) 902);
                                        hg.c.b(i89, i29, str, sb7);
                                        i89 += i29;
                                        i88 = 2;
                                        i11 = i28;
                                        z10 = z15;
                                    }
                                } else {
                                    z11 = z10;
                                    i18 = i13;
                                    i19 = i11;
                                    i20 = i17;
                                    sb7.append((char) 902);
                                    hg.c.b(0, length4, str, sb7);
                                }
                            } else {
                                z11 = z10;
                                i18 = i13;
                                i19 = i11;
                                i20 = i17;
                                byte[] bytes2 = str.getBytes(charset3);
                                hg.c.a(bytes2, bytes2.length, 1, sb7);
                            }
                        } else {
                            z11 = z10;
                            i18 = i13;
                            i19 = i11;
                            i20 = i17;
                            hg.c.c(str, 0, length4, sb7, 0);
                        }
                        String sb8 = sb7.toString();
                        int length8 = sb8.length();
                        float f2 = 0.0f;
                        int[] iArr7 = null;
                        for (int i99 = i18; i99 <= i15; i99++) {
                            int i100 = length8 + 1 + i86;
                            int i101 = (i100 / i99) + 1;
                            if (i99 * i101 >= i100 + i99) {
                                i101--;
                            }
                            if (i101 >= i14) {
                                if (i101 <= i16) {
                                    float f10 = (((i99 * 17) + 69) * 0.357f) / (i101 * 2.0f);
                                    if (iArr7 == null || Math.abs(f10 - 3.0f) <= Math.abs(f2 - 3.0f)) {
                                        iArr7 = new int[]{i99, i101};
                                        f2 = f10;
                                    }
                                }
                            } else {
                                if (iArr7 == null) {
                                    int i102 = length8 + 1 + i86;
                                    int i103 = (i102 / i18) + 1;
                                    if (i18 * i103 >= i102 + i18) {
                                        i103--;
                                    }
                                    if (i103 < i14) {
                                        c10 = 0;
                                        i21 = 1;
                                        iArr7 = new int[]{i18, i14};
                                        if (iArr7 != null) {
                                            int i104 = iArr7[c10];
                                            int i105 = iArr7[i21];
                                            int i106 = (i104 * i105) - i86;
                                            int i107 = i106 > length8 + 1 ? (i106 - length8) - 1 : 0;
                                            if (i86 + length8 + i21 <= 929) {
                                                int i108 = length8 + i107 + i21;
                                                StringBuilder sb9 = new StringBuilder(i108);
                                                sb9.append((char) i108);
                                                sb9.append(sb8);
                                                for (int i109 = 0; i109 < i107; i109++) {
                                                    sb9.append((char) 900);
                                                }
                                                String sb10 = sb9.toString();
                                                if (i20 >= 0 && (i22 = i20) <= 8) {
                                                    char[] cArr = new char[i86];
                                                    int length9 = sb10.length();
                                                    for (int i110 = 0; i110 < length9; i110++) {
                                                        int i111 = i86 - 1;
                                                        int charAt6 = (sb10.charAt(i110) + cArr[i111]) % 929;
                                                        while (true) {
                                                            iArr = kotlin.jvm.internal.h.I;
                                                            if (i111 > 0) {
                                                                int i112 = i111 - 1;
                                                                cArr[i111] = (char) ((cArr[i112] + (929 - ((iArr[i22][i111] * charAt6) % 929))) % 929);
                                                                i111 = i112;
                                                            }
                                                        }
                                                        cArr[0] = (char) ((929 - ((charAt6 * iArr[i22][0]) % 929)) % 929);
                                                    }
                                                    StringBuilder sb11 = new StringBuilder(i86);
                                                    while (true) {
                                                        i86--;
                                                        if (i86 >= 0) {
                                                            char c13 = cArr[i86];
                                                            if (c13 != 0) {
                                                                cArr[i86] = (char) (929 - c13);
                                                            }
                                                            sb11.append(cArr[i86]);
                                                        } else {
                                                            String sb12 = sb11.toString();
                                                            hg.a aVar2 = new hg.a(i105, i104);
                                                            String f11 = pl.a.f(sb10, sb12);
                                                            int i113 = 0;
                                                            for (int i114 = 0; i114 < i105; i114++) {
                                                                int i115 = i114 % 3;
                                                                aVar2.f17595a++;
                                                                f6.b.u0(130728, 17, aVar2.a());
                                                                if (i115 == 0) {
                                                                    i25 = (i114 / 3) * 30;
                                                                    i23 = ((i105 - 1) / 3) + i25;
                                                                    i26 = i104 - 1;
                                                                } else if (i115 == 1) {
                                                                    i25 = (i114 / 3) * 30;
                                                                    int i116 = i105 - 1;
                                                                    i23 = (i22 * 3) + i25 + (i116 % 3);
                                                                    i26 = i116 / 3;
                                                                } else {
                                                                    int i117 = (i114 / 3) * 30;
                                                                    i23 = (i104 - 1) + i117;
                                                                    i24 = (i22 * 3) + i117 + ((i105 - 1) % 3);
                                                                    int[][] iArr8 = f6.b.C;
                                                                    f6.b.u0(iArr8[i115][i23], 17, aVar2.a());
                                                                    for (i27 = 0; i27 < i104; i27++) {
                                                                        f6.b.u0(iArr8[i115][f11.charAt(i113)], 17, aVar2.a());
                                                                        i113++;
                                                                    }
                                                                    if (!z11) {
                                                                        f6.b.u0(260649, 1, aVar2.a());
                                                                    } else {
                                                                        f6.b.u0(iArr8[i115][i24], 17, aVar2.a());
                                                                        f6.b.u0(260649, 18, aVar2.a());
                                                                    }
                                                                }
                                                                i24 = i26 + i25;
                                                                int[][] iArr82 = f6.b.C;
                                                                f6.b.u0(iArr82[i115][i23], 17, aVar2.a());
                                                                while (i27 < i104) {
                                                                }
                                                                if (!z11) {
                                                                }
                                                            }
                                                            byte[][] b13 = aVar2.b(1, 4);
                                                            if (i10 > i6) {
                                                                z12 = true;
                                                            } else {
                                                                z12 = false;
                                                            }
                                                            if (b13[0].length < b13.length) {
                                                                z13 = true;
                                                            } else {
                                                                z13 = false;
                                                            }
                                                            if (z12 != z13) {
                                                                b13 = x(b13);
                                                                z14 = true;
                                                            } else {
                                                                z14 = false;
                                                            }
                                                            int length10 = i6 / b13[0].length;
                                                            int length11 = i10 / b13.length;
                                                            if (length10 >= length11) {
                                                                length10 = length11;
                                                            }
                                                            if (length10 > 1) {
                                                                byte[][] b14 = aVar2.b(length10, length10 << 2);
                                                                if (z14) {
                                                                    b14 = x(b14);
                                                                }
                                                                return f(i19, b14);
                                                            }
                                                            return f(i19, b13);
                                                        }
                                                    }
                                                } else {
                                                    throw new IllegalArgumentException("Error correction level must be between 0 and 8!");
                                                }
                                            } else {
                                                throw new WriterException("Encoded message contains too many code words, message too big (" + str.length() + " bytes)");
                                            }
                                        } else {
                                            throw new WriterException("Unable to fit message in columns");
                                        }
                                    }
                                }
                                c10 = 0;
                                i21 = 1;
                                if (iArr7 != null) {
                                }
                            }
                        }
                        if (iArr7 == null) {
                        }
                        c10 = 0;
                        i21 = 1;
                        if (iArr7 != null) {
                        }
                    } else {
                        throw new IllegalArgumentException("Error correction level must be between 0 and 8!");
                    }
                } else {
                    throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(aVar)));
                }
                break;
        }
    }

    @Override // a4.j
    public a4.i b(a4.d dVar) {
        switch (this.f12843u) {
            case 0:
                return new a4.a(dVar);
            default:
                return new a4.b();
        }
    }

    @Override // fg.b
    public void c(c cVar) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!cVar.c()) {
                break;
            }
            char b10 = cVar.b();
            cVar.f++;
            int j10 = j(b10, sb2);
            int a10 = cVar.a() + ((sb2.length() / 3) << 1);
            cVar.d(a10);
            int i6 = cVar.f15037h.f15045b - a10;
            if (!cVar.c()) {
                StringBuilder sb3 = new StringBuilder();
                if (sb2.length() % 3 == 2 && (i6 < 2 || i6 > 2)) {
                    int length = sb2.length();
                    sb2.delete(length - j10, length);
                    cVar.f--;
                    j10 = j(cVar.b(), sb3);
                    cVar.f15037h = null;
                }
                while (sb2.length() % 3 == 1 && ((j10 <= 3 && i6 != 1) || j10 > 3)) {
                    int length2 = sb2.length();
                    sb2.delete(length2 - j10, length2);
                    cVar.f--;
                    j10 = j(cVar.b(), sb3);
                    cVar.f15037h = null;
                }
            } else if (sb2.length() % 3 == 0) {
                if (ca.a.U0(cVar.f15031a, cVar.f, o()) != o()) {
                    cVar.f15036g = 0;
                    break;
                }
            }
        }
        s(cVar, sb2);
    }

    @Override // kotlinx.coroutines.scheduling.h
    public int d() {
        return this.f12843u;
    }

    @Override // ld.a
    public void e(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    public int j(char c10, StringBuilder sb2) {
        if (c10 == ' ') {
            sb2.append((char) 3);
            return 1;
        } else if (c10 >= '0' && c10 <= '9') {
            sb2.append((char) ((c10 - '0') + 4));
            return 1;
        } else if (c10 >= 'A' && c10 <= 'Z') {
            sb2.append((char) ((c10 - 'A') + 14));
            return 1;
        } else if (c10 < ' ') {
            sb2.append((char) 0);
            sb2.append(c10);
            return 2;
        } else if (c10 >= '!' && c10 <= '/') {
            sb2.append((char) 1);
            sb2.append((char) (c10 - '!'));
            return 2;
        } else if (c10 >= ':' && c10 <= '@') {
            sb2.append((char) 1);
            sb2.append((char) ((c10 - ':') + 15));
            return 2;
        } else if (c10 >= '[' && c10 <= '_') {
            sb2.append((char) 1);
            sb2.append((char) ((c10 - '[') + 22));
            return 2;
        } else if (c10 >= '`' && c10 <= 127) {
            sb2.append((char) 2);
            sb2.append((char) (c10 - '`'));
            return 2;
        } else {
            sb2.append("\u0001\u001e");
            return j((char) (c10 - 128), sb2) + 2;
        }
    }

    public void m(float f, float f2, l lVar) {
        throw null;
    }

    @Override // v4.b
    public v n(v vVar, h4.g gVar) {
        a.b bVar;
        byte[] bArr;
        ByteBuffer asReadOnlyBuffer = ((GifDrawable) vVar.get()).f5980u.f5986a.f5987a.getData().asReadOnlyBuffer();
        int i6 = d5.a.f12178a;
        if (!asReadOnlyBuffer.isReadOnly() && asReadOnlyBuffer.hasArray()) {
            bVar = new a.b(asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.array(), asReadOnlyBuffer.limit());
        } else {
            bVar = null;
        }
        if (bVar != null && bVar.f12181a == 0) {
            if (bVar.f12182b == bVar.f12183c.length) {
                bArr = asReadOnlyBuffer.array();
                return new s4.b(bArr);
            }
        }
        ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
        byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
        asReadOnlyBuffer2.position(0);
        asReadOnlyBuffer2.get(bArr2);
        bArr = bArr2;
        return new s4.b(bArr);
    }

    public int o() {
        return 1;
    }

    public String r(com.hbb20.a aVar) {
        if (aVar == null) {
            return null;
        }
        return aVar.f10144w + " phone code is +" + aVar.f10143v;
    }

    public void s(c cVar, StringBuilder sb2) {
        int length = sb2.length() % 3;
        int a10 = cVar.a() + ((sb2.length() / 3) << 1);
        cVar.d(a10);
        int i6 = cVar.f15037h.f15045b - a10;
        if (length == 2) {
            sb2.append((char) 0);
            while (sb2.length() >= 3) {
                D(cVar, sb2);
            }
            if (cVar.c()) {
                cVar.e((char) 254);
            }
        } else if (i6 == 1 && length == 1) {
            while (sb2.length() >= 3) {
                D(cVar, sb2);
            }
            if (cVar.c()) {
                cVar.e((char) 254);
            }
            cVar.f--;
        } else if (length == 0) {
            while (sb2.length() >= 3) {
                D(cVar, sb2);
            }
            if (i6 > 0 || cVar.c()) {
                cVar.e((char) 254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        cVar.f15036g = 0;
    }

    public void t(Bundle bundle) {
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
        if (is.u.Z1(ca.a.k(Constants.SCREEN_COMMUNITY, Constants.SCREEN_COMMUNITY_POST, Constants.LINK_COMMUNITIES_NOTIFICATION), bundle.getString(Constants.API_COURSE_LINK))) {
            bundle2.putBoolean("community_notif", true);
        } else {
            bundle2.putBoolean("community_notif", false);
        }
        bundle2.putString(Constants.API_COURSE_LINK, bundle.getString(Constants.API_COURSE_LINK));
        UtilsKt.fireAnalytics("notification_click", bundle2);
    }

    public void y(View view, int i6, int i10, int i11, int i12) {
        if (!f12840x) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                f12839w = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e10);
            }
            f12840x = true;
        }
        Method method = f12839w;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i6), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11.getCause());
            }
        }
    }

    public void z(int i6, View view) {
        if (!f12842z) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f12841y = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f12842z = true;
        }
        Field field = f12841y;
        if (field != null) {
            try {
                f12841y.setInt(view, i6 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public /* synthetic */ b(JSONObject jSONObject) {
        this.f12843u = 3;
        jSONObject.getInt("commitmentPaymentsCount");
        jSONObject.optInt("subsequentCommitmentPaymentsCount");
    }

    @Override // kotlinx.coroutines.scheduling.h
    public void a() {
    }
}
