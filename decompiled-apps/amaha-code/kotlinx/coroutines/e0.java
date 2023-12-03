package kotlinx.coroutines;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.firebase.database.core.ServerValues;
import com.google.zxing.WriterException;
import com.theinnerhour.b2b.components.assessments.activity.ExptInitialAssessmentActivity;
import com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import ig.c;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: DebugStrings.kt */
/* loaded from: classes2.dex */
public final class e0 implements h4.d, w4.f, fg.b, bg.d {

    /* renamed from: v  reason: collision with root package name */
    public static e0 f23499v;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f23500u;

    public e0() {
        this.f23500u = 1;
    }

    public static mh.a d(Cursor cursor) {
        String string = cursor.getString(1);
        kotlin.jvm.internal.i.f(string, "cursor.getString(ATTRIBU…UMN_INDEX_ATTRIBUTE_NAME)");
        String string2 = cursor.getString(2);
        kotlin.jvm.internal.i.f(string2, "cursor.getString(ATTRIBU…MN_INDEX_ATTRIBUTE_VALUE)");
        long j10 = cursor.getLong(3);
        String string3 = cursor.getString(4);
        kotlin.jvm.internal.i.f(string3, "cursor.getString(ATTRIBU…HE_COLUMN_INDEX_DATATYPE)");
        return new mh.a(j10, string, string2, string3);
    }

    public static ContentValues e(pi.c entity) {
        kotlin.jvm.internal.i.g(entity, "entity");
        ContentValues contentValues = new ContentValues();
        long j10 = entity.f28446a;
        if (j10 != -1) {
            contentValues.put("_id", Long.valueOf(j10));
        }
        contentValues.put(Constants.CAMPAIGN_ID, entity.f28447b);
        contentValues.put("type", entity.f28448c);
        contentValues.put("status", entity.f28449d);
        contentValues.put("state", df.b.h(entity.f).toString());
        contentValues.put("priority", Long.valueOf(entity.f28451g));
        contentValues.put("last_updated_time", Long.valueOf(entity.f28452h));
        contentValues.put("template_type", entity.f28450e);
        contentValues.put("deletion_time", Long.valueOf(entity.f28453i));
        contentValues.put("last_received_time", Long.valueOf(entity.f28454j));
        contentValues.put("campaign_meta", entity.f28455k);
        return contentValues;
    }

    public static LinkedHashSet f(Cursor cursor) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (cursor != null && cursor.moveToFirst()) {
            do {
                String string = cursor.getString(0);
                kotlin.jvm.internal.i.f(string, "cursor.getString(0)");
                linkedHashSet.add(string);
            } while (cursor.moveToNext());
            return linkedHashSet;
        }
        return linkedHashSet;
    }

    public static List g(Cursor cursor) {
        if (cursor != null && cursor.moveToFirst()) {
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(m(cursor));
            } while (cursor.moveToNext());
            return arrayList;
        }
        return is.w.f20676u;
    }

    public static ContentValues h(mh.a aVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(SessionManager.KEY_NAME, aVar.f25053a);
        contentValues.put("value", aVar.f25054b);
        contentValues.put("last_tracked_time", Long.valueOf(aVar.f25055c));
        contentValues.put("datatype", aVar.f25056d);
        return contentValues;
    }

    public static ContentValues i(mh.b batchEntity) {
        kotlin.jvm.internal.i.g(batchEntity, "batchEntity");
        ContentValues contentValues = new ContentValues();
        long j10 = batchEntity.f25057a;
        if (j10 != -1) {
            contentValues.put("_id", Long.valueOf(j10));
        }
        contentValues.put("batch_data", batchEntity.f25058b.toString());
        return contentValues;
    }

    public static ContentValues j(mh.c cVar) {
        ContentValues contentValues = new ContentValues();
        long j10 = cVar.f25059a;
        if (j10 != -1) {
            contentValues.put("_id", Long.valueOf(j10));
        }
        contentValues.put("gtime", Long.valueOf(cVar.f25060b));
        contentValues.put("details", cVar.f25061c);
        return contentValues;
    }

    public static ContentValues k(mh.e eVar) {
        ContentValues contentValues = new ContentValues();
        if (eVar.a() != -1) {
            contentValues.put("_id", Long.valueOf(eVar.a()));
        }
        contentValues.put("key", (String) eVar.f25070c);
        contentValues.put("value", (String) eVar.f25072e);
        contentValues.put(ServerValues.NAME_OP_TIMESTAMP, Long.valueOf(eVar.f25071d));
        return contentValues;
    }

    public static String l(StringBuilder sb2) {
        char c10;
        char c11;
        char c12 = 0;
        int length = sb2.length() - 0;
        if (length != 0) {
            char charAt = sb2.charAt(0);
            if (length >= 2) {
                c10 = sb2.charAt(1);
            } else {
                c10 = 0;
            }
            if (length >= 3) {
                c11 = sb2.charAt(2);
            } else {
                c11 = 0;
            }
            if (length >= 4) {
                c12 = sb2.charAt(3);
            }
            int i6 = (charAt << 18) + (c10 << '\f') + (c11 << 6) + c12;
            char c13 = (char) ((i6 >> 8) & 255);
            char c14 = (char) (i6 & 255);
            StringBuilder sb3 = new StringBuilder(3);
            sb3.append((char) ((i6 >> 16) & 255));
            if (length >= 2) {
                sb3.append(c13);
            }
            if (length >= 3) {
                sb3.append(c14);
            }
            return sb3.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    public static pi.c m(Cursor cursor) {
        kotlin.jvm.internal.i.g(cursor, "cursor");
        long j10 = cursor.getLong(0);
        String string = cursor.getString(1);
        kotlin.jvm.internal.i.f(string, "cursor.getString(INAPP_V…COLUMN_INDEX_CAMPAIGN_ID)");
        String string2 = cursor.getString(2);
        kotlin.jvm.internal.i.f(string2, "cursor.getString(INAPP_V…LUMN_INDEX_CAMPAIGN_TYPE)");
        String string3 = cursor.getString(3);
        kotlin.jvm.internal.i.f(string3, "cursor.getString(INAPP_V…MN_INDEX_CAMPAIGN_STATUS)");
        String string4 = cursor.getString(7);
        if (string4 == null) {
            string4 = "";
        }
        JSONObject jSONObject = new JSONObject(cursor.getString(4));
        f8.g gVar = new f8.g(jSONObject.optLong("show_count", 0L), jSONObject.optLong("last_show_time", 0L), jSONObject.optBoolean("is_clicked", false));
        long j11 = cursor.getLong(5);
        long j12 = cursor.getLong(6);
        long j13 = cursor.getLong(8);
        long j14 = cursor.getLong(9);
        String string5 = cursor.getString(10);
        kotlin.jvm.internal.i.f(string5, "cursor.getString(INAPP_V…LUMN_INDEX_CAMPAIGN_META)");
        return new pi.c(j10, string, string2, string3, string4, gVar, j11, j12, j13, j14, string5);
    }

    public static String n() {
        boolean z10;
        Object obj;
        HashMap<String, Object> appConfig;
        HashMap<String, Object> appConfig2;
        HashMap<String, Object> appConfig3;
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null && (appConfig3 = user.getAppConfig()) != null && !appConfig3.containsKey(Constants.COMMUNITY_ENTRY_POINT_EXPERIMENT)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            User user2 = FirebasePersistence.getInstance().getUser();
            if (user2 != null && (appConfig2 = user2.getAppConfig()) != null) {
                appConfig2.put(Constants.COMMUNITY_ENTRY_POINT_EXPERIMENT, "variant_b");
            }
            FirebasePersistence.getInstance().updateUserOnFirebase();
            String str = gk.a.f16573a;
            Bundle bundle = new Bundle();
            bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
            bundle.putString("variant", "variant_b");
            hs.k kVar = hs.k.f19476a;
            gk.a.b(bundle, Constants.COMMUNITY_ENTRY_POINT_EXPERIMENT);
        }
        User user3 = FirebasePersistence.getInstance().getUser();
        String str2 = null;
        if (user3 != null && (appConfig = user3.getAppConfig()) != null) {
            obj = appConfig.get(Constants.COMMUNITY_ENTRY_POINT_EXPERIMENT);
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str2 = (String) obj;
        }
        if (str2 == null) {
            return "variant_b";
        }
        return str2;
    }

    public static final String q(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static mh.e r(Cursor cursor) {
        long j10 = cursor.getLong(0);
        String string = cursor.getString(1);
        kotlin.jvm.internal.i.f(string, "cursor.getString(KEY_VALUE_STORE_COLUMN_INDEX_KEY)");
        String string2 = cursor.getString(2);
        kotlin.jvm.internal.i.f(string2, "cursor.getString(KEY_VAL…STORE_COLUMN_INDEX_VALUE)");
        return new mh.e(j10, string, string2, cursor.getLong(3));
    }

    public static Intent s(Context context) {
        String str;
        kotlin.jvm.internal.i.g(context, "context");
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null) {
            str = user.getVersion();
        } else {
            str = null;
        }
        if (kotlin.jvm.internal.i.b(str, Constants.USER_VERSION)) {
            return new Intent(context, ExptInitialAssessmentActivity.class);
        }
        return new Intent(context, InitialAssessmentActivity.class);
    }

    public static pi.p t(Cursor cursor) {
        return new pi.p(cursor.getLong(0), cursor.getLong(1), cursor.getString(2), new JSONObject(cursor.getString(3)));
    }

    public static ContentValues u(pi.p pVar) {
        ContentValues contentValues = new ContentValues();
        long j10 = pVar.f28511a;
        if (j10 != -1) {
            contentValues.put("_id", Long.valueOf(j10));
        }
        contentValues.put(ServerValues.NAME_OP_TIMESTAMP, Long.valueOf(pVar.f28512b));
        contentValues.put("request_id", pVar.f28513c);
        contentValues.put("payload", pVar.f28514d.toString());
        return contentValues;
    }

    public static final String w(ls.d dVar) {
        String str;
        if (dVar instanceof kotlinx.coroutines.internal.d) {
            return dVar.toString();
        }
        try {
            str = dVar + '@' + q(dVar);
        } catch (Throwable th2) {
            str = sp.b.j(th2);
        }
        Throwable a10 = hs.g.a(str);
        String str2 = str;
        if (a10 != null) {
            str2 = dVar.getClass().getName() + '@' + q(dVar);
        }
        return (String) str2;
    }

    public static final boolean x() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:372:0x0658, code lost:
        if (r0 != false) goto L302;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0161 A[LOOP:1: B:95:0x0134->B:110:0x0161, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0363 A[LOOP:3: B:214:0x0361->B:215:0x0363, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:464:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0126  */
    @Override // bg.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dg.b O(String str, bg.a aVar, int i6, int i10, Map map) {
        int i11;
        boolean equals;
        ig.b bVar;
        boolean z10;
        ig.b bVar2;
        byte[] bytes;
        int length;
        dg.a aVar2;
        bg.c cVar;
        int i12;
        int ordinal;
        int i13;
        ig.c cVar2;
        int i14;
        int i15;
        int length2;
        int i16;
        dg.a aVar3;
        int i17;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        char c10;
        int i18;
        dg.c cVar3;
        int i19;
        if (!str.isEmpty()) {
            if (aVar == bg.a.QR_CODE) {
                if (i6 >= 0 && i10 >= 0) {
                    ig.a aVar4 = ig.a.L;
                    if (map != null) {
                        bg.c cVar4 = bg.c.ERROR_CORRECTION;
                        if (map.containsKey(cVar4)) {
                            aVar4 = ig.a.valueOf(map.get(cVar4).toString());
                        }
                        bg.c cVar5 = bg.c.MARGIN;
                        if (map.containsKey(cVar5)) {
                            i11 = Integer.parseInt(map.get(cVar5).toString());
                            bg.c cVar6 = bg.c.CHARACTER_SET;
                            boolean z15 = map == null && map.containsKey(cVar6);
                            String obj = !z15 ? map.get(cVar6).toString() : "ISO-8859-1";
                            equals = "Shift_JIS".equals(obj);
                            bVar = ig.b.BYTE;
                            int[] iArr = jg.c.f22017a;
                            if (equals) {
                                try {
                                    bytes = str.getBytes("Shift_JIS");
                                    length = bytes.length;
                                } catch (UnsupportedEncodingException unused) {
                                }
                                if (length % 2 == 0) {
                                    for (int i20 = 0; i20 < length; i20 += 2) {
                                        int i21 = bytes[i20] & 255;
                                        if ((i21 >= 129 && i21 <= 159) || (i21 >= 224 && i21 <= 235)) {
                                        }
                                    }
                                    z10 = true;
                                    if (z10) {
                                        bVar2 = ig.b.KANJI;
                                        aVar2 = new dg.a();
                                        if (bVar2 == bVar && z15 && (cVar3 = (dg.c) dg.c.f12851x.get(obj)) != null) {
                                            aVar2.b(7, 4);
                                            aVar2.b(cVar3.f12853u[0], 8);
                                        }
                                        cVar = bg.c.GS1_FORMAT;
                                        if ((map == null && map.containsKey(cVar)) || !Boolean.valueOf(map.get(cVar).toString()).booleanValue()) {
                                            i12 = 4;
                                        } else {
                                            i12 = 4;
                                            aVar2.b(5, 4);
                                        }
                                        aVar2.b(bVar2.f20037v, i12);
                                        dg.a aVar5 = new dg.a();
                                        ordinal = bVar2.ordinal();
                                        if (ordinal == 1) {
                                            int length3 = str.length();
                                            int i22 = 0;
                                            while (i22 < length3) {
                                                int charAt = str.charAt(i22) - '0';
                                                int i23 = i22 + 2;
                                                if (i23 < length3) {
                                                    aVar5.b(((str.charAt(i22 + 1) - '0') * 10) + (charAt * 100) + (str.charAt(i23) - '0'), 10);
                                                    i22 += 3;
                                                } else {
                                                    i22++;
                                                    if (i22 < length3) {
                                                        aVar5.b((charAt * 10) + (str.charAt(i22) - '0'), 7);
                                                        i22 = i23;
                                                    } else {
                                                        aVar5.b(charAt, 4);
                                                    }
                                                }
                                            }
                                        } else if (ordinal == 2) {
                                            int length4 = str.length();
                                            int i24 = 0;
                                            while (i24 < length4) {
                                                char charAt2 = str.charAt(i24);
                                                int i25 = charAt2 < '`' ? iArr[charAt2] : -1;
                                                if (i25 == -1) {
                                                    throw new WriterException();
                                                }
                                                int i26 = i24 + 1;
                                                if (i26 < length4) {
                                                    char charAt3 = str.charAt(i26);
                                                    int i27 = charAt3 < '`' ? iArr[charAt3] : -1;
                                                    if (i27 != -1) {
                                                        aVar5.b((i25 * 45) + i27, 11);
                                                        i24 += 2;
                                                    } else {
                                                        throw new WriterException();
                                                    }
                                                } else {
                                                    aVar5.b(i25, 6);
                                                    i24 = i26;
                                                }
                                            }
                                        } else if (ordinal == 4) {
                                            try {
                                                for (byte b10 : str.getBytes(obj)) {
                                                    aVar5.b(b10, 8);
                                                }
                                            } catch (UnsupportedEncodingException e10) {
                                                throw new WriterException(e10);
                                            }
                                        } else if (ordinal == 6) {
                                            try {
                                                byte[] bytes2 = str.getBytes("Shift_JIS");
                                                int length5 = bytes2.length;
                                                for (int i28 = 0; i28 < length5; i28 += 2) {
                                                    int i29 = ((bytes2[i28] & 255) << 8) | (bytes2[i28 + 1] & 255);
                                                    int i30 = 33088;
                                                    if (i29 < 33088 || i29 > 40956) {
                                                        if (i29 < 57408 || i29 > 60351) {
                                                            i18 = -1;
                                                            if (i18 == -1) {
                                                                aVar5.b(((i18 >> 8) * 192) + (i18 & 255), 13);
                                                            } else {
                                                                throw new WriterException("Invalid byte sequence");
                                                            }
                                                        } else {
                                                            i30 = 49472;
                                                        }
                                                    }
                                                    i18 = i29 - i30;
                                                    if (i18 == -1) {
                                                    }
                                                }
                                            } catch (UnsupportedEncodingException e11) {
                                                throw new WriterException(e11);
                                            }
                                        } else {
                                            throw new WriterException("Invalid mode: ".concat(String.valueOf(bVar2)));
                                        }
                                        int[] iArr2 = bVar2.f20036u;
                                        if (map != null) {
                                            bg.c cVar7 = bg.c.QR_VERSION;
                                            if (map.containsKey(cVar7)) {
                                                cVar2 = ig.c.b(Integer.parseInt(map.get(cVar7).toString()));
                                                int i31 = aVar2.f12845v;
                                                int i32 = cVar2.f20039a;
                                                int i33 = iArr2[i32 <= 9 ? (char) 0 : i32 <= 26 ? (char) 1 : (char) 2] + i31 + aVar5.f12845v;
                                                c.b bVar3 = cVar2.f20040b[aVar4.ordinal()];
                                                int i34 = 0;
                                                for (c.a aVar6 : bVar3.f20045b) {
                                                    i34 += aVar6.f20042a;
                                                }
                                                if (!(cVar2.f20041c - (i34 * bVar3.f20044a) >= (i33 + 7) / 8)) {
                                                    throw new WriterException("Data too big for requested version");
                                                }
                                                dg.a aVar7 = new dg.a();
                                                i14 = aVar2.f12845v;
                                                aVar7.c(aVar7.f12845v + i14);
                                                for (i15 = 0; i15 < i14; i15++) {
                                                    aVar7.a(aVar2.d(i15));
                                                }
                                                if (bVar2 != bVar) {
                                                    length2 = (aVar5.f12845v + 7) / 8;
                                                } else {
                                                    length2 = str.length();
                                                }
                                                int i35 = cVar2.f20039a;
                                                int i36 = iArr2[i35 > 9 ? (char) 0 : i35 <= 26 ? (char) 1 : (char) 2];
                                                i16 = 1 << i36;
                                                if (length2 >= i16) {
                                                    aVar7.b(length2, i36);
                                                    int i37 = aVar5.f12845v;
                                                    aVar7.c(aVar7.f12845v + i37);
                                                    for (int i38 = 0; i38 < i37; i38++) {
                                                        aVar7.a(aVar5.d(i38));
                                                    }
                                                    c.b bVar4 = cVar2.f20040b[aVar4.ordinal()];
                                                    int i39 = 0;
                                                    for (c.a aVar8 : bVar4.f20045b) {
                                                        i39 += aVar8.f20042a;
                                                    }
                                                    int i40 = i39 * bVar4.f20044a;
                                                    int i41 = cVar2.f20041c;
                                                    int i42 = i41 - i40;
                                                    int i43 = i42 << 3;
                                                    if (aVar7.f12845v <= i43) {
                                                        for (int i44 = 0; i44 < 4 && aVar7.f12845v < i43; i44++) {
                                                            aVar7.a(false);
                                                        }
                                                        boolean z16 = false;
                                                        int i45 = aVar7.f12845v & 7;
                                                        if (i45 > 0) {
                                                            while (i45 < 8) {
                                                                aVar7.a(z16);
                                                                i45++;
                                                                z16 = false;
                                                            }
                                                        }
                                                        int i46 = i42 - ((aVar7.f12845v + 7) / 8);
                                                        for (int i47 = 0; i47 < i46; i47++) {
                                                            aVar7.b((i47 & 1) == 0 ? 236 : 17, 8);
                                                        }
                                                        if (aVar7.f12845v == i43) {
                                                            int i48 = 0;
                                                            for (c.a aVar9 : bVar4.f20045b) {
                                                                i48 += aVar9.f20042a;
                                                            }
                                                            if ((aVar7.f12845v + 7) / 8 == i42) {
                                                                ArrayList arrayList = new ArrayList(i48);
                                                                int i49 = 0;
                                                                int i50 = 0;
                                                                int i51 = 0;
                                                                int i52 = 0;
                                                                while (i49 < i48) {
                                                                    int[] iArr3 = new int[1];
                                                                    int[] iArr4 = new int[1];
                                                                    if (i49 < i48) {
                                                                        int i53 = i41 % i48;
                                                                        int i54 = i48 - i53;
                                                                        int i55 = i41 / i48;
                                                                        int i56 = i55 + 1;
                                                                        int i57 = i42 / i48;
                                                                        int i58 = i57 + 1;
                                                                        int i59 = i55 - i57;
                                                                        int i60 = i11;
                                                                        int i61 = i56 - i58;
                                                                        if (i59 != i61) {
                                                                            throw new WriterException("EC bytes mismatch");
                                                                        }
                                                                        ig.a aVar10 = aVar4;
                                                                        if (i48 != i54 + i53) {
                                                                            throw new WriterException("RS blocks mismatch");
                                                                        }
                                                                        if (i41 == ((i58 + i61) * i53) + ((i57 + i59) * i54)) {
                                                                            if (i49 < i54) {
                                                                                c10 = 0;
                                                                                iArr3[0] = i57;
                                                                                iArr4[0] = i59;
                                                                            } else {
                                                                                c10 = 0;
                                                                                iArr3[0] = i58;
                                                                                iArr4[0] = i61;
                                                                            }
                                                                            int i62 = iArr3[c10];
                                                                            byte[] bArr = new byte[i62];
                                                                            int i63 = i50 << 3;
                                                                            int i64 = 0;
                                                                            while (i64 < i62) {
                                                                                ig.c cVar8 = cVar2;
                                                                                int i65 = i41;
                                                                                int i66 = i48;
                                                                                int i67 = 0;
                                                                                for (int i68 = 0; i68 < 8; i68++) {
                                                                                    if (aVar7.d(i63)) {
                                                                                        i67 |= 1 << (7 - i68);
                                                                                    }
                                                                                    i63++;
                                                                                }
                                                                                bArr[i64 + 0] = (byte) i67;
                                                                                i64++;
                                                                                i48 = i66;
                                                                                cVar2 = cVar8;
                                                                                i41 = i65;
                                                                            }
                                                                            ig.c cVar9 = cVar2;
                                                                            int i69 = i41;
                                                                            int i70 = i48;
                                                                            int i71 = iArr4[0];
                                                                            int[] iArr5 = new int[i62 + i71];
                                                                            for (int i72 = 0; i72 < i62; i72++) {
                                                                                iArr5[i72] = bArr[i72] & 255;
                                                                            }
                                                                            new nd.z(eg.a.f13961k).f(iArr5, i71);
                                                                            byte[] bArr2 = new byte[i71];
                                                                            for (int i73 = 0; i73 < i71; i73++) {
                                                                                bArr2[i73] = (byte) iArr5[i62 + i73];
                                                                            }
                                                                            arrayList.add(new jg.a(bArr, bArr2));
                                                                            i51 = Math.max(i51, i62);
                                                                            i52 = Math.max(i52, i71);
                                                                            i50 += iArr3[0];
                                                                            i49++;
                                                                            i48 = i70;
                                                                            cVar2 = cVar9;
                                                                            i11 = i60;
                                                                            aVar4 = aVar10;
                                                                            i41 = i69;
                                                                        } else {
                                                                            throw new WriterException("Total bytes mismatch");
                                                                        }
                                                                    } else {
                                                                        throw new WriterException("Block ID too large");
                                                                    }
                                                                }
                                                                ig.c cVar10 = cVar2;
                                                                ig.a aVar11 = aVar4;
                                                                int i74 = i11;
                                                                int i75 = i41;
                                                                if (i42 == i50) {
                                                                    dg.a aVar12 = new dg.a();
                                                                    for (int i76 = 0; i76 < i51; i76++) {
                                                                        Iterator it = arrayList.iterator();
                                                                        while (it.hasNext()) {
                                                                            byte[] bArr3 = ((jg.a) it.next()).f22011a;
                                                                            if (i76 < bArr3.length) {
                                                                                aVar12.b(bArr3[i76], 8);
                                                                            }
                                                                        }
                                                                    }
                                                                    for (int i77 = 0; i77 < i52; i77++) {
                                                                        Iterator it2 = arrayList.iterator();
                                                                        while (it2.hasNext()) {
                                                                            byte[] bArr4 = ((jg.a) it2.next()).f22012b;
                                                                            if (i77 < bArr4.length) {
                                                                                aVar12.b(bArr4[i77], 8);
                                                                            }
                                                                        }
                                                                    }
                                                                    if (i75 == (aVar12.f12845v + 7) / 8) {
                                                                        int i78 = (cVar10.f20039a * 4) + 17;
                                                                        jg.b bVar5 = new jg.b(i78, i78);
                                                                        int i79 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
                                                                        int i80 = -1;
                                                                        int i81 = 0;
                                                                        for (int i82 = 8; i81 < i82; i82 = 8) {
                                                                            ig.a aVar13 = aVar11;
                                                                            kotlin.jvm.internal.h.j(aVar12, aVar13, cVar10, i81, bVar5);
                                                                            int j10 = ca.a.j(bVar5, false) + ca.a.j(bVar5, true);
                                                                            byte[][] bArr5 = (byte[][]) bVar5.f22016d;
                                                                            int i83 = bVar5.f22014b;
                                                                            int i84 = bVar5.f22015c;
                                                                            int i85 = 0;
                                                                            for (int i86 = 0; i86 < i84 - 1; i86++) {
                                                                                byte[] bArr6 = bArr5[i86];
                                                                                int i87 = 0;
                                                                                while (i87 < i83 - 1) {
                                                                                    byte b11 = bArr6[i87];
                                                                                    int i88 = i87 + 1;
                                                                                    int i89 = i83;
                                                                                    if (b11 == bArr6[i88]) {
                                                                                        byte[] bArr7 = bArr5[i86 + 1];
                                                                                        if (b11 == bArr7[i87] && b11 == bArr7[i88]) {
                                                                                            i85++;
                                                                                        }
                                                                                    }
                                                                                    i87 = i88;
                                                                                    i83 = i89;
                                                                                }
                                                                            }
                                                                            int i90 = (i85 * 3) + j10;
                                                                            byte[][] bArr8 = (byte[][]) bVar5.f22016d;
                                                                            int i91 = bVar5.f22014b;
                                                                            int i92 = bVar5.f22015c;
                                                                            int i93 = 0;
                                                                            for (int i94 = 0; i94 < i92; i94++) {
                                                                                int i95 = 0;
                                                                                while (i95 < i91) {
                                                                                    byte[] bArr9 = bArr8[i94];
                                                                                    int i96 = i95 + 6;
                                                                                    if (i96 < i91) {
                                                                                        i17 = i91;
                                                                                        aVar3 = aVar12;
                                                                                        byte b12 = 1;
                                                                                        if (bArr9[i95] == 1 && bArr9[i95 + 1] == 0 && bArr9[i95 + 2] == 1 && bArr9[i95 + 3] == 1 && bArr9[i95 + 4] == 1 && bArr9[i95 + 5] == 0 && bArr9[i96] == 1) {
                                                                                            int max = Math.max(i95 - 4, 0);
                                                                                            int min = Math.min(i95, bArr9.length);
                                                                                            while (true) {
                                                                                                if (max >= min) {
                                                                                                    z13 = true;
                                                                                                    break;
                                                                                                }
                                                                                                int i97 = min;
                                                                                                if (bArr9[max] == b12) {
                                                                                                    z13 = false;
                                                                                                    break;
                                                                                                }
                                                                                                max++;
                                                                                                b12 = 1;
                                                                                                min = i97;
                                                                                            }
                                                                                            if (!z13) {
                                                                                                int max2 = Math.max(i95 + 7, 0);
                                                                                                int min2 = Math.min(i95 + 11, bArr9.length);
                                                                                                while (true) {
                                                                                                    if (max2 >= min2) {
                                                                                                        z14 = true;
                                                                                                        break;
                                                                                                    }
                                                                                                    int i98 = min2;
                                                                                                    if (bArr9[max2] == 1) {
                                                                                                        z14 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    max2++;
                                                                                                    min2 = i98;
                                                                                                }
                                                                                            }
                                                                                            i93++;
                                                                                        }
                                                                                    } else {
                                                                                        aVar3 = aVar12;
                                                                                        i17 = i91;
                                                                                    }
                                                                                    int i99 = i94 + 6;
                                                                                    if (i99 < i92) {
                                                                                        byte b13 = 1;
                                                                                        if (bArr8[i94][i95] == 1 && bArr8[i94 + 1][i95] == 0 && bArr8[i94 + 2][i95] == 1 && bArr8[i94 + 3][i95] == 1 && bArr8[i94 + 4][i95] == 1 && bArr8[i94 + 5][i95] == 0 && bArr8[i99][i95] == 1) {
                                                                                            int max3 = Math.max(i94 - 4, 0);
                                                                                            int min3 = Math.min(i94, bArr8.length);
                                                                                            while (true) {
                                                                                                if (max3 >= min3) {
                                                                                                    z11 = true;
                                                                                                    break;
                                                                                                } else if (bArr8[max3][i95] == b13) {
                                                                                                    z11 = false;
                                                                                                    break;
                                                                                                } else {
                                                                                                    max3++;
                                                                                                    b13 = 1;
                                                                                                }
                                                                                            }
                                                                                            if (!z11) {
                                                                                                int max4 = Math.max(i94 + 7, 0);
                                                                                                int min4 = Math.min(i94 + 11, bArr8.length);
                                                                                                while (true) {
                                                                                                    if (max4 >= min4) {
                                                                                                        z12 = true;
                                                                                                        break;
                                                                                                    } else if (bArr8[max4][i95] == 1) {
                                                                                                        z12 = false;
                                                                                                        break;
                                                                                                    } else {
                                                                                                        max4++;
                                                                                                    }
                                                                                                }
                                                                                                if (!z12) {
                                                                                                }
                                                                                            }
                                                                                            i93++;
                                                                                        }
                                                                                    }
                                                                                    i95++;
                                                                                    aVar12 = aVar3;
                                                                                    i91 = i17;
                                                                                }
                                                                            }
                                                                            dg.a aVar14 = aVar12;
                                                                            int i100 = (i93 * 40) + i90;
                                                                            byte[][] bArr10 = (byte[][]) bVar5.f22016d;
                                                                            int i101 = bVar5.f22014b;
                                                                            int i102 = bVar5.f22015c;
                                                                            int i103 = 0;
                                                                            for (int i104 = 0; i104 < i102; i104++) {
                                                                                byte[] bArr11 = bArr10[i104];
                                                                                for (int i105 = 0; i105 < i101; i105++) {
                                                                                    if (bArr11[i105] == 1) {
                                                                                        i103++;
                                                                                    }
                                                                                }
                                                                            }
                                                                            int i106 = bVar5.f22015c * bVar5.f22014b;
                                                                            int abs = (((Math.abs((i103 << 1) - i106) * 10) / i106) * 10) + i100;
                                                                            if (abs < i79) {
                                                                                i80 = i81;
                                                                                i79 = abs;
                                                                            }
                                                                            i81++;
                                                                            aVar12 = aVar14;
                                                                            aVar11 = aVar13;
                                                                        }
                                                                        kotlin.jvm.internal.h.j(aVar12, aVar11, cVar10, i80, bVar5);
                                                                        int i107 = bVar5.f22014b;
                                                                        int i108 = bVar5.f22015c;
                                                                        int i109 = i74 << 1;
                                                                        int i110 = i107 + i109;
                                                                        int i111 = i109 + i108;
                                                                        int max5 = Math.max(i6, i110);
                                                                        int max6 = Math.max(i10, i111);
                                                                        int min5 = Math.min(max5 / i110, max6 / i111);
                                                                        int i112 = (max5 - (i107 * min5)) / 2;
                                                                        int i113 = (max6 - (i108 * min5)) / 2;
                                                                        dg.b bVar6 = new dg.b(max5, max6);
                                                                        int i114 = 0;
                                                                        while (i114 < i108) {
                                                                            int i115 = 0;
                                                                            int i116 = i112;
                                                                            while (i115 < i107) {
                                                                                if (bVar5.a(i115, i114) == 1) {
                                                                                    bVar6.c(i116, i113, min5, min5);
                                                                                }
                                                                                i115++;
                                                                                i116 += min5;
                                                                            }
                                                                            i114++;
                                                                            i113 += min5;
                                                                        }
                                                                        return bVar6;
                                                                    }
                                                                    StringBuilder u10 = defpackage.c.u("Interleaving error: ", i75, " and ");
                                                                    u10.append((aVar12.f12845v + 7) / 8);
                                                                    u10.append(" differ.");
                                                                    throw new WriterException(u10.toString());
                                                                }
                                                                throw new WriterException("Data bytes does not match offset");
                                                            }
                                                            throw new WriterException("Number of bits and data bytes does not match");
                                                        }
                                                        throw new WriterException("Bits size does not equal capacity");
                                                    }
                                                    throw new WriterException("data bits cannot fit in the QR Code" + aVar7.f12845v + " > " + i43);
                                                }
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append(length2);
                                                sb2.append(" is bigger than ");
                                                sb2.append(i16 - 1);
                                                throw new WriterException(sb2.toString());
                                            }
                                        }
                                        ig.c b14 = ig.c.b(1);
                                        int i117 = aVar2.f12845v;
                                        int i118 = b14.f20039a;
                                        int i119 = iArr2[i118 <= 9 ? (char) 0 : i118 <= 26 ? (char) 1 : (char) 2] + i117 + aVar5.f12845v;
                                        i13 = 1;
                                        while (i13 <= 40) {
                                            ig.c b15 = ig.c.b(i13);
                                            int i120 = b15.f20041c;
                                            c.b bVar7 = b15.f20040b[aVar4.ordinal()];
                                            c.a[] aVarArr = bVar7.f20045b;
                                            int i121 = i13;
                                            int i122 = 0;
                                            int i123 = 0;
                                            for (int length6 = aVarArr.length; i123 < length6; length6 = length6) {
                                                i122 += aVarArr[i123].f20042a;
                                                i123++;
                                            }
                                            if (i120 - (i122 * bVar7.f20044a) >= (i119 + 7) / 8) {
                                                int i124 = aVar2.f12845v;
                                                int i125 = b15.f20039a;
                                                int i126 = iArr2[i125 <= 9 ? (char) 0 : i125 <= 26 ? (char) 1 : (char) 2] + i124 + aVar5.f12845v;
                                                int i127 = 40;
                                                int i128 = 1;
                                                while (i128 <= i127) {
                                                    ig.c b16 = ig.c.b(i128);
                                                    int i129 = b16.f20041c;
                                                    c.b bVar8 = b16.f20040b[aVar4.ordinal()];
                                                    c.a[] aVarArr2 = bVar8.f20045b;
                                                    int i130 = 0;
                                                    int i131 = 0;
                                                    for (int length7 = aVarArr2.length; i131 < length7; length7 = length7) {
                                                        i130 += aVarArr2[i131].f20042a;
                                                        i131++;
                                                    }
                                                    if (i129 - (i130 * bVar8.f20044a) >= (i126 + 7) / 8) {
                                                        cVar2 = b16;
                                                        dg.a aVar72 = new dg.a();
                                                        i14 = aVar2.f12845v;
                                                        aVar72.c(aVar72.f12845v + i14);
                                                        while (i15 < i14) {
                                                        }
                                                        if (bVar2 != bVar) {
                                                        }
                                                        int i352 = cVar2.f20039a;
                                                        int i362 = iArr2[i352 > 9 ? (char) 0 : i352 <= 26 ? (char) 1 : (char) 2];
                                                        i16 = 1 << i362;
                                                        if (length2 >= i16) {
                                                        }
                                                    } else {
                                                        i128++;
                                                        i127 = 40;
                                                        i11 = i11;
                                                    }
                                                }
                                                throw new WriterException("Data too big");
                                            }
                                            i13 = i121 + 1;
                                            i11 = i11;
                                        }
                                        throw new WriterException("Data too big");
                                    }
                                }
                                z10 = false;
                                if (z10) {
                                }
                            }
                            boolean z17 = false;
                            boolean z18 = false;
                            i19 = 0;
                            while (true) {
                                if (i19 >= str.length()) {
                                    char charAt4 = str.charAt(i19);
                                    if (charAt4 < '0' || charAt4 > '9') {
                                        if ((charAt4 < '`' ? iArr[charAt4] : -1) == -1) {
                                            break;
                                        }
                                        z17 = true;
                                    } else {
                                        z18 = true;
                                    }
                                    i19++;
                                } else if (z17) {
                                    bVar2 = ig.b.ALPHANUMERIC;
                                } else if (z18) {
                                    bVar2 = ig.b.NUMERIC;
                                }
                            }
                            bVar2 = bVar;
                            aVar2 = new dg.a();
                            if (bVar2 == bVar) {
                                aVar2.b(7, 4);
                                aVar2.b(cVar3.f12853u[0], 8);
                            }
                            cVar = bg.c.GS1_FORMAT;
                            if (map == null && map.containsKey(cVar)) {
                            }
                            i12 = 4;
                            aVar2.b(bVar2.f20037v, i12);
                            dg.a aVar52 = new dg.a();
                            ordinal = bVar2.ordinal();
                            if (ordinal == 1) {
                            }
                            int[] iArr22 = bVar2.f20036u;
                            if (map != null) {
                            }
                            ig.c b142 = ig.c.b(1);
                            int i1172 = aVar2.f12845v;
                            int i1182 = b142.f20039a;
                            int i1192 = iArr22[i1182 <= 9 ? (char) 0 : i1182 <= 26 ? (char) 1 : (char) 2] + i1172 + aVar52.f12845v;
                            i13 = 1;
                            while (i13 <= 40) {
                            }
                            throw new WriterException("Data too big");
                        }
                    }
                    i11 = 4;
                    bg.c cVar62 = bg.c.CHARACTER_SET;
                    if (map == null) {
                    }
                    if (!z15) {
                    }
                    equals = "Shift_JIS".equals(obj);
                    bVar = ig.b.BYTE;
                    int[] iArr6 = jg.c.f22017a;
                    if (equals) {
                    }
                    boolean z172 = false;
                    boolean z182 = false;
                    i19 = 0;
                    while (true) {
                        if (i19 >= str.length()) {
                        }
                        i19++;
                    }
                    bVar2 = bVar;
                    aVar2 = new dg.a();
                    if (bVar2 == bVar) {
                    }
                    cVar = bg.c.GS1_FORMAT;
                    if (map == null && map.containsKey(cVar)) {
                    }
                    i12 = 4;
                    aVar2.b(bVar2.f20037v, i12);
                    dg.a aVar522 = new dg.a();
                    ordinal = bVar2.ordinal();
                    if (ordinal == 1) {
                    }
                    int[] iArr222 = bVar2.f20036u;
                    if (map != null) {
                    }
                    ig.c b1422 = ig.c.b(1);
                    int i11722 = aVar2.f12845v;
                    int i11822 = b1422.f20039a;
                    int i11922 = iArr222[i11822 <= 9 ? (char) 0 : i11822 <= 26 ? (char) 1 : (char) 2] + i11722 + aVar522.f12845v;
                    i13 = 1;
                    while (i13 <= 40) {
                    }
                    throw new WriterException("Data too big");
                }
                throw new IllegalArgumentException("Requested dimensions are too small: " + i6 + 'x' + i10);
            }
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(aVar)));
        }
        throw new IllegalArgumentException("Found empty contents");
    }

    @Override // w4.f
    public final void b(w4.g gVar) {
        gVar.n();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e1, code lost:
        throw new java.lang.IllegalStateException("Count must not exceed 4");
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e2, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e3, code lost:
        r14.f15036g = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01e5, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0153, code lost:
        r1.append((char) 31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0158, code lost:
        r7 = r1.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015c, code lost:
        if (r7 != 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0162, code lost:
        if (r7 != 1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0164, code lost:
        r14.d(r14.a());
        r10 = r14.f15037h.f15045b - r14.a();
        r0 = (r0.length() - r14.f15038i) - r14.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017e, code lost:
        if (r0 <= r10) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0180, code lost:
        r14.d(r14.a() + 1);
        r10 = r14.f15037h.f15045b - r14.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0191, code lost:
        if (r0 > r10) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0193, code lost:
        if (r10 > 2) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0196, code lost:
        if (r7 > 4) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0198, code lost:
        r7 = r7 - 1;
        r0 = l(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a2, code lost:
        if ((!r14.c()) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a4, code lost:
        if (r7 > 2) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a7, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a8, code lost:
        if (r7 > 2) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01aa, code lost:
        r14.d(r14.a() + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01bb, code lost:
        if ((r14.f15037h.f15045b - r14.a()) < 3) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01bd, code lost:
        r14.d(r14.a() + r0.length());
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ca, code lost:
        if (r5 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01cc, code lost:
        r14.f15037h = null;
        r14.f -= r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d4, code lost:
        r9.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d9, code lost:
        return;
     */
    @Override // fg.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(fg.c cVar) {
        char b10;
        int i6;
        boolean z10;
        boolean z11;
        String str = cVar.f15031a;
        boolean z12 = true;
        switch (this.f23500u) {
            case 7:
                int i10 = cVar.f;
                int length = str.length();
                if (i10 < length) {
                    char charAt = str.charAt(i10);
                    i6 = 0;
                    while (true) {
                        if (charAt >= '0' && charAt <= '9') {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11 && i10 < length) {
                            i6++;
                            i10++;
                            if (i10 < length) {
                                charAt = str.charAt(i10);
                            }
                        }
                    }
                } else {
                    i6 = 0;
                }
                if (i6 >= 2) {
                    char charAt2 = str.charAt(cVar.f);
                    char charAt3 = str.charAt(cVar.f + 1);
                    if (charAt2 >= '0' && charAt2 <= '9') {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        if ((charAt3 < '0' || charAt3 > '9') ? false : false) {
                            cVar.e((char) ((charAt3 - '0') + ((charAt2 - '0') * 10) + 130));
                            cVar.f += 2;
                            return;
                        }
                    }
                    throw new IllegalArgumentException("not digits: " + charAt2 + charAt3);
                }
                char b11 = cVar.b();
                int U0 = ca.a.U0(str, cVar.f, p());
                if (U0 != p()) {
                    if (U0 != 1) {
                        if (U0 != 2) {
                            if (U0 != 3) {
                                if (U0 != 4) {
                                    if (U0 == 5) {
                                        cVar.e((char) 231);
                                        cVar.f15036g = 5;
                                        return;
                                    }
                                    throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(U0)));
                                }
                                cVar.e((char) 240);
                                cVar.f15036g = 4;
                                return;
                            }
                            cVar.e((char) 238);
                            cVar.f15036g = 3;
                            return;
                        }
                        cVar.e((char) 239);
                        cVar.f15036g = 2;
                        return;
                    }
                    cVar.e((char) 230);
                    cVar.f15036g = 1;
                    return;
                } else if (ca.a.I0(b11)) {
                    cVar.e((char) 235);
                    cVar.e((char) ((b11 - 128) + 1));
                    cVar.f++;
                    return;
                } else {
                    cVar.e((char) (b11 + 1));
                    cVar.f++;
                    return;
                }
            default:
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    boolean c10 = cVar.c();
                    StringBuilder sb3 = cVar.f15035e;
                    if (!c10) {
                        break;
                    } else {
                        b10 = cVar.b();
                        if (b10 >= ' ' && b10 <= '?') {
                            sb2.append(b10);
                        } else if (b10 >= '@' && b10 <= '^') {
                            sb2.append((char) (b10 - '@'));
                        }
                        cVar.f++;
                        if (sb2.length() >= 4) {
                            sb3.append(l(sb2));
                            sb2.delete(0, 4);
                            if (ca.a.U0(str, cVar.f, p()) != p()) {
                                cVar.f15036g = 0;
                                break;
                            }
                        }
                    }
                }
                ca.a.x0(b10);
                throw null;
        }
    }

    @Override // h4.d
    public final boolean o(Object obj, File file, h4.g gVar) {
        try {
            d5.a.b((ByteBuffer) obj, file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e10);
            }
            return false;
        }
    }

    public final int p() {
        switch (this.f23500u) {
            case 7:
                return 0;
            default:
                return 4;
        }
    }

    public /* synthetic */ e0(int i6) {
        this.f23500u = i6;
    }

    public e0(Object obj) {
        this.f23500u = 6;
    }

    @Override // w4.f
    public final void a(w4.g gVar) {
    }
}
