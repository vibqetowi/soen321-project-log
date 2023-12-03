package m9;

import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.p;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k9.e;
import k9.l;
import k9.x0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class g implements e.d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f24984a;

    /* renamed from: b  reason: collision with root package name */
    public final com.google.android.gms.internal.cast.f f24985b;

    /* renamed from: c  reason: collision with root package name */
    public final p9.l f24986c;

    /* renamed from: d  reason: collision with root package name */
    public final s1.s f24987d;

    /* renamed from: e  reason: collision with root package name */
    public final d f24988e;
    public x0 f;

    /* renamed from: g  reason: collision with root package name */
    public final CopyOnWriteArrayList f24989g = new CopyOnWriteArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final CopyOnWriteArrayList f24990h = new CopyOnWriteArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final ConcurrentHashMap f24991i;

    /* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
    @Deprecated
    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b();

        void c();

        void d();

        void e();

        void f();
    }

    /* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
    /* loaded from: classes.dex */
    public interface c extends t9.c {
    }

    static {
        String str = p9.l.P;
    }

    public g(p9.l lVar) {
        new ConcurrentHashMap();
        this.f24991i = new ConcurrentHashMap();
        this.f24984a = new Object();
        this.f24985b = new com.google.android.gms.internal.cast.f(Looper.getMainLooper());
        s1.s sVar = new s1.s(this);
        this.f24987d = sVar;
        this.f24986c = lVar;
        lVar.C = new u(this);
        lVar.f34633x = sVar;
        this.f24988e = new d(this);
    }

    @RecentlyNonNull
    public static p m() {
        p pVar = new p();
        pVar.a(new o(new Status(17, null)));
        return pVar;
    }

    public static final void o(s sVar) {
        try {
            sVar.o();
        } catch (IllegalArgumentException e10) {
            throw e10;
        } catch (Throwable unused) {
            sVar.a(new r(new Status(2100, null)));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:161:0x034c A[Catch: JSONException -> 0x03cb, TryCatch #1 {JSONException -> 0x03cb, blocks: (B:3:0x001a, B:40:0x00a9, B:41:0x00b0, B:43:0x00b9, B:44:0x00c6, B:46:0x00cc, B:47:0x00de, B:48:0x00ea, B:50:0x00f0, B:51:0x00fa, B:53:0x0103, B:60:0x0126, B:62:0x012e, B:84:0x016a, B:85:0x0176, B:87:0x017c, B:88:0x0186, B:89:0x0192, B:91:0x0198, B:92:0x01a2, B:93:0x01ae, B:95:0x01b4, B:96:0x01be, B:97:0x01ca, B:99:0x01d0, B:56:0x0110, B:57:0x0117, B:59:0x011d, B:100:0x01da, B:102:0x01e3, B:110:0x0202, B:111:0x020e, B:113:0x0214, B:105:0x01ea, B:106:0x01f1, B:108:0x01f7, B:114:0x021e, B:115:0x0226, B:117:0x022c, B:118:0x023a, B:121:0x0240, B:122:0x024f, B:124:0x0255, B:125:0x025f, B:126:0x0272, B:128:0x0278, B:129:0x0286, B:130:0x0291, B:131:0x029a, B:132:0x02ad, B:134:0x02b3, B:135:0x02c1, B:137:0x02cd, B:138:0x02da, B:145:0x02e9, B:154:0x0300, B:157:0x0305, B:159:0x0348, B:161:0x034c, B:162:0x0355, B:164:0x0359, B:165:0x0362, B:167:0x0366, B:168:0x036c, B:170:0x0370, B:171:0x0373, B:173:0x0377, B:174:0x037a, B:176:0x037e, B:177:0x0381, B:179:0x0385, B:181:0x038f, B:182:0x0394, B:184:0x0398, B:190:0x03b3, B:191:0x03bb, B:193:0x03c1, B:158:0x030a, B:147:0x02ef, B:149:0x02f5, B:189:0x03a5, B:139:0x02db, B:143:0x02e6), top: B:198:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0359 A[Catch: JSONException -> 0x03cb, TryCatch #1 {JSONException -> 0x03cb, blocks: (B:3:0x001a, B:40:0x00a9, B:41:0x00b0, B:43:0x00b9, B:44:0x00c6, B:46:0x00cc, B:47:0x00de, B:48:0x00ea, B:50:0x00f0, B:51:0x00fa, B:53:0x0103, B:60:0x0126, B:62:0x012e, B:84:0x016a, B:85:0x0176, B:87:0x017c, B:88:0x0186, B:89:0x0192, B:91:0x0198, B:92:0x01a2, B:93:0x01ae, B:95:0x01b4, B:96:0x01be, B:97:0x01ca, B:99:0x01d0, B:56:0x0110, B:57:0x0117, B:59:0x011d, B:100:0x01da, B:102:0x01e3, B:110:0x0202, B:111:0x020e, B:113:0x0214, B:105:0x01ea, B:106:0x01f1, B:108:0x01f7, B:114:0x021e, B:115:0x0226, B:117:0x022c, B:118:0x023a, B:121:0x0240, B:122:0x024f, B:124:0x0255, B:125:0x025f, B:126:0x0272, B:128:0x0278, B:129:0x0286, B:130:0x0291, B:131:0x029a, B:132:0x02ad, B:134:0x02b3, B:135:0x02c1, B:137:0x02cd, B:138:0x02da, B:145:0x02e9, B:154:0x0300, B:157:0x0305, B:159:0x0348, B:161:0x034c, B:162:0x0355, B:164:0x0359, B:165:0x0362, B:167:0x0366, B:168:0x036c, B:170:0x0370, B:171:0x0373, B:173:0x0377, B:174:0x037a, B:176:0x037e, B:177:0x0381, B:179:0x0385, B:181:0x038f, B:182:0x0394, B:184:0x0398, B:190:0x03b3, B:191:0x03bb, B:193:0x03c1, B:158:0x030a, B:147:0x02ef, B:149:0x02f5, B:189:0x03a5, B:139:0x02db, B:143:0x02e6), top: B:198:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0366 A[Catch: JSONException -> 0x03cb, TryCatch #1 {JSONException -> 0x03cb, blocks: (B:3:0x001a, B:40:0x00a9, B:41:0x00b0, B:43:0x00b9, B:44:0x00c6, B:46:0x00cc, B:47:0x00de, B:48:0x00ea, B:50:0x00f0, B:51:0x00fa, B:53:0x0103, B:60:0x0126, B:62:0x012e, B:84:0x016a, B:85:0x0176, B:87:0x017c, B:88:0x0186, B:89:0x0192, B:91:0x0198, B:92:0x01a2, B:93:0x01ae, B:95:0x01b4, B:96:0x01be, B:97:0x01ca, B:99:0x01d0, B:56:0x0110, B:57:0x0117, B:59:0x011d, B:100:0x01da, B:102:0x01e3, B:110:0x0202, B:111:0x020e, B:113:0x0214, B:105:0x01ea, B:106:0x01f1, B:108:0x01f7, B:114:0x021e, B:115:0x0226, B:117:0x022c, B:118:0x023a, B:121:0x0240, B:122:0x024f, B:124:0x0255, B:125:0x025f, B:126:0x0272, B:128:0x0278, B:129:0x0286, B:130:0x0291, B:131:0x029a, B:132:0x02ad, B:134:0x02b3, B:135:0x02c1, B:137:0x02cd, B:138:0x02da, B:145:0x02e9, B:154:0x0300, B:157:0x0305, B:159:0x0348, B:161:0x034c, B:162:0x0355, B:164:0x0359, B:165:0x0362, B:167:0x0366, B:168:0x036c, B:170:0x0370, B:171:0x0373, B:173:0x0377, B:174:0x037a, B:176:0x037e, B:177:0x0381, B:179:0x0385, B:181:0x038f, B:182:0x0394, B:184:0x0398, B:190:0x03b3, B:191:0x03bb, B:193:0x03c1, B:158:0x030a, B:147:0x02ef, B:149:0x02f5, B:189:0x03a5, B:139:0x02db, B:143:0x02e6), top: B:198:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0370 A[Catch: JSONException -> 0x03cb, TryCatch #1 {JSONException -> 0x03cb, blocks: (B:3:0x001a, B:40:0x00a9, B:41:0x00b0, B:43:0x00b9, B:44:0x00c6, B:46:0x00cc, B:47:0x00de, B:48:0x00ea, B:50:0x00f0, B:51:0x00fa, B:53:0x0103, B:60:0x0126, B:62:0x012e, B:84:0x016a, B:85:0x0176, B:87:0x017c, B:88:0x0186, B:89:0x0192, B:91:0x0198, B:92:0x01a2, B:93:0x01ae, B:95:0x01b4, B:96:0x01be, B:97:0x01ca, B:99:0x01d0, B:56:0x0110, B:57:0x0117, B:59:0x011d, B:100:0x01da, B:102:0x01e3, B:110:0x0202, B:111:0x020e, B:113:0x0214, B:105:0x01ea, B:106:0x01f1, B:108:0x01f7, B:114:0x021e, B:115:0x0226, B:117:0x022c, B:118:0x023a, B:121:0x0240, B:122:0x024f, B:124:0x0255, B:125:0x025f, B:126:0x0272, B:128:0x0278, B:129:0x0286, B:130:0x0291, B:131:0x029a, B:132:0x02ad, B:134:0x02b3, B:135:0x02c1, B:137:0x02cd, B:138:0x02da, B:145:0x02e9, B:154:0x0300, B:157:0x0305, B:159:0x0348, B:161:0x034c, B:162:0x0355, B:164:0x0359, B:165:0x0362, B:167:0x0366, B:168:0x036c, B:170:0x0370, B:171:0x0373, B:173:0x0377, B:174:0x037a, B:176:0x037e, B:177:0x0381, B:179:0x0385, B:181:0x038f, B:182:0x0394, B:184:0x0398, B:190:0x03b3, B:191:0x03bb, B:193:0x03c1, B:158:0x030a, B:147:0x02ef, B:149:0x02f5, B:189:0x03a5, B:139:0x02db, B:143:0x02e6), top: B:198:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0377 A[Catch: JSONException -> 0x03cb, TryCatch #1 {JSONException -> 0x03cb, blocks: (B:3:0x001a, B:40:0x00a9, B:41:0x00b0, B:43:0x00b9, B:44:0x00c6, B:46:0x00cc, B:47:0x00de, B:48:0x00ea, B:50:0x00f0, B:51:0x00fa, B:53:0x0103, B:60:0x0126, B:62:0x012e, B:84:0x016a, B:85:0x0176, B:87:0x017c, B:88:0x0186, B:89:0x0192, B:91:0x0198, B:92:0x01a2, B:93:0x01ae, B:95:0x01b4, B:96:0x01be, B:97:0x01ca, B:99:0x01d0, B:56:0x0110, B:57:0x0117, B:59:0x011d, B:100:0x01da, B:102:0x01e3, B:110:0x0202, B:111:0x020e, B:113:0x0214, B:105:0x01ea, B:106:0x01f1, B:108:0x01f7, B:114:0x021e, B:115:0x0226, B:117:0x022c, B:118:0x023a, B:121:0x0240, B:122:0x024f, B:124:0x0255, B:125:0x025f, B:126:0x0272, B:128:0x0278, B:129:0x0286, B:130:0x0291, B:131:0x029a, B:132:0x02ad, B:134:0x02b3, B:135:0x02c1, B:137:0x02cd, B:138:0x02da, B:145:0x02e9, B:154:0x0300, B:157:0x0305, B:159:0x0348, B:161:0x034c, B:162:0x0355, B:164:0x0359, B:165:0x0362, B:167:0x0366, B:168:0x036c, B:170:0x0370, B:171:0x0373, B:173:0x0377, B:174:0x037a, B:176:0x037e, B:177:0x0381, B:179:0x0385, B:181:0x038f, B:182:0x0394, B:184:0x0398, B:190:0x03b3, B:191:0x03bb, B:193:0x03c1, B:158:0x030a, B:147:0x02ef, B:149:0x02f5, B:189:0x03a5, B:139:0x02db, B:143:0x02e6), top: B:198:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x037e A[Catch: JSONException -> 0x03cb, TryCatch #1 {JSONException -> 0x03cb, blocks: (B:3:0x001a, B:40:0x00a9, B:41:0x00b0, B:43:0x00b9, B:44:0x00c6, B:46:0x00cc, B:47:0x00de, B:48:0x00ea, B:50:0x00f0, B:51:0x00fa, B:53:0x0103, B:60:0x0126, B:62:0x012e, B:84:0x016a, B:85:0x0176, B:87:0x017c, B:88:0x0186, B:89:0x0192, B:91:0x0198, B:92:0x01a2, B:93:0x01ae, B:95:0x01b4, B:96:0x01be, B:97:0x01ca, B:99:0x01d0, B:56:0x0110, B:57:0x0117, B:59:0x011d, B:100:0x01da, B:102:0x01e3, B:110:0x0202, B:111:0x020e, B:113:0x0214, B:105:0x01ea, B:106:0x01f1, B:108:0x01f7, B:114:0x021e, B:115:0x0226, B:117:0x022c, B:118:0x023a, B:121:0x0240, B:122:0x024f, B:124:0x0255, B:125:0x025f, B:126:0x0272, B:128:0x0278, B:129:0x0286, B:130:0x0291, B:131:0x029a, B:132:0x02ad, B:134:0x02b3, B:135:0x02c1, B:137:0x02cd, B:138:0x02da, B:145:0x02e9, B:154:0x0300, B:157:0x0305, B:159:0x0348, B:161:0x034c, B:162:0x0355, B:164:0x0359, B:165:0x0362, B:167:0x0366, B:168:0x036c, B:170:0x0370, B:171:0x0373, B:173:0x0377, B:174:0x037a, B:176:0x037e, B:177:0x0381, B:179:0x0385, B:181:0x038f, B:182:0x0394, B:184:0x0398, B:190:0x03b3, B:191:0x03bb, B:193:0x03c1, B:158:0x030a, B:147:0x02ef, B:149:0x02f5, B:189:0x03a5, B:139:0x02db, B:143:0x02e6), top: B:198:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0385 A[Catch: JSONException -> 0x03cb, TryCatch #1 {JSONException -> 0x03cb, blocks: (B:3:0x001a, B:40:0x00a9, B:41:0x00b0, B:43:0x00b9, B:44:0x00c6, B:46:0x00cc, B:47:0x00de, B:48:0x00ea, B:50:0x00f0, B:51:0x00fa, B:53:0x0103, B:60:0x0126, B:62:0x012e, B:84:0x016a, B:85:0x0176, B:87:0x017c, B:88:0x0186, B:89:0x0192, B:91:0x0198, B:92:0x01a2, B:93:0x01ae, B:95:0x01b4, B:96:0x01be, B:97:0x01ca, B:99:0x01d0, B:56:0x0110, B:57:0x0117, B:59:0x011d, B:100:0x01da, B:102:0x01e3, B:110:0x0202, B:111:0x020e, B:113:0x0214, B:105:0x01ea, B:106:0x01f1, B:108:0x01f7, B:114:0x021e, B:115:0x0226, B:117:0x022c, B:118:0x023a, B:121:0x0240, B:122:0x024f, B:124:0x0255, B:125:0x025f, B:126:0x0272, B:128:0x0278, B:129:0x0286, B:130:0x0291, B:131:0x029a, B:132:0x02ad, B:134:0x02b3, B:135:0x02c1, B:137:0x02cd, B:138:0x02da, B:145:0x02e9, B:154:0x0300, B:157:0x0305, B:159:0x0348, B:161:0x034c, B:162:0x0355, B:164:0x0359, B:165:0x0362, B:167:0x0366, B:168:0x036c, B:170:0x0370, B:171:0x0373, B:173:0x0377, B:174:0x037a, B:176:0x037e, B:177:0x0381, B:179:0x0385, B:181:0x038f, B:182:0x0394, B:184:0x0398, B:190:0x03b3, B:191:0x03bb, B:193:0x03c1, B:158:0x030a, B:147:0x02ef, B:149:0x02f5, B:189:0x03a5, B:139:0x02db, B:143:0x02e6), top: B:198:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0398 A[Catch: JSONException -> 0x03cb, TRY_LEAVE, TryCatch #1 {JSONException -> 0x03cb, blocks: (B:3:0x001a, B:40:0x00a9, B:41:0x00b0, B:43:0x00b9, B:44:0x00c6, B:46:0x00cc, B:47:0x00de, B:48:0x00ea, B:50:0x00f0, B:51:0x00fa, B:53:0x0103, B:60:0x0126, B:62:0x012e, B:84:0x016a, B:85:0x0176, B:87:0x017c, B:88:0x0186, B:89:0x0192, B:91:0x0198, B:92:0x01a2, B:93:0x01ae, B:95:0x01b4, B:96:0x01be, B:97:0x01ca, B:99:0x01d0, B:56:0x0110, B:57:0x0117, B:59:0x011d, B:100:0x01da, B:102:0x01e3, B:110:0x0202, B:111:0x020e, B:113:0x0214, B:105:0x01ea, B:106:0x01f1, B:108:0x01f7, B:114:0x021e, B:115:0x0226, B:117:0x022c, B:118:0x023a, B:121:0x0240, B:122:0x024f, B:124:0x0255, B:125:0x025f, B:126:0x0272, B:128:0x0278, B:129:0x0286, B:130:0x0291, B:131:0x029a, B:132:0x02ad, B:134:0x02b3, B:135:0x02c1, B:137:0x02cd, B:138:0x02da, B:145:0x02e9, B:154:0x0300, B:157:0x0305, B:159:0x0348, B:161:0x034c, B:162:0x0355, B:164:0x0359, B:165:0x0362, B:167:0x0366, B:168:0x036c, B:170:0x0370, B:171:0x0373, B:173:0x0377, B:174:0x037a, B:176:0x037e, B:177:0x0381, B:179:0x0385, B:181:0x038f, B:182:0x0394, B:184:0x0398, B:190:0x03b3, B:191:0x03bb, B:193:0x03c1, B:158:0x030a, B:147:0x02ef, B:149:0x02f5, B:189:0x03a5, B:139:0x02db, B:143:0x02e6), top: B:198:0x001a }] */
    @Override // k9.e.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(@RecentlyNonNull String str) {
        char c10;
        boolean z10;
        int i6;
        int i10;
        k9.n nVar;
        char c11;
        p9.l lVar = this.f24986c;
        p9.n nVar2 = lVar.I;
        p9.n nVar3 = lVar.H;
        ((p9.b) lVar.f34631v).b("message received: %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("type");
            long optLong = jSONObject.optLong("requestId", -1L);
            switch (string.hashCode()) {
                case -1830647528:
                    if (string.equals("LOAD_CANCELLED")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1790231854:
                    if (string.equals("QUEUE_ITEMS")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1125000185:
                    if (string.equals("INVALID_REQUEST")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -262628938:
                    if (string.equals("LOAD_FAILED")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -61993624:
                    if (string.equals("SESSION_STATE")) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 66247144:
                    if (string.equals("ERROR")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 154411710:
                    if (string.equals("QUEUE_CHANGE")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 431600379:
                    if (string.equals("INVALID_PLAYER_STATE")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 823510221:
                    if (string.equals("MEDIA_STATUS")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2107149050:
                    if (string.equals("QUEUE_ITEM_IDS")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            p9.n nVar4 = lVar.D;
            int[] iArr = null;
            switch (c10) {
                case 0:
                    JSONArray jSONArray = jSONObject.getJSONArray("status");
                    if (jSONArray.length() > 0) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(0);
                        boolean c12 = nVar4.c(optLong);
                        nVar3.getClass();
                        synchronized (p9.n.f28041g) {
                            if (nVar3.f28044c != -1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        }
                        if ((z10 && !nVar3.c(optLong)) || (nVar2.b() && !nVar2.c(optLong))) {
                            i6 = 1;
                        } else {
                            i6 = 0;
                        }
                        if (!c12 && (nVar = lVar.A) != null) {
                            i10 = nVar.f0(i6, jSONObject2);
                            if ((i10 & 1) != 0) {
                                lVar.f28040z = SystemClock.elapsedRealtime();
                                lVar.w();
                            }
                            if ((i10 & 2) != 0) {
                                lVar.f28040z = SystemClock.elapsedRealtime();
                                lVar.w();
                            }
                            if ((i10 & 128) != 0) {
                                lVar.f28040z = SystemClock.elapsedRealtime();
                            }
                            if ((i10 & 4) != 0) {
                                lVar.x();
                            }
                            if ((i10 & 8) != 0) {
                                lVar.y();
                            }
                            if ((i10 & 16) != 0) {
                                lVar.z();
                            }
                            if ((i10 & 32) != 0) {
                                lVar.f28040z = SystemClock.elapsedRealtime();
                                p9.j jVar = lVar.C;
                                if (jVar != null) {
                                    ((u) jVar).a();
                                }
                            }
                            if ((i10 & 64) != 0) {
                                lVar.f28040z = SystemClock.elapsedRealtime();
                                lVar.w();
                            }
                        }
                        k9.n nVar5 = new k9.n(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
                        nVar5.f0(0, jSONObject2);
                        lVar.A = nVar5;
                        lVar.f28040z = SystemClock.elapsedRealtime();
                        i10 = 127;
                        if ((i10 & 1) != 0) {
                        }
                        if ((i10 & 2) != 0) {
                        }
                        if ((i10 & 128) != 0) {
                        }
                        if ((i10 & 4) != 0) {
                        }
                        if ((i10 & 8) != 0) {
                        }
                        if ((i10 & 16) != 0) {
                        }
                        if ((i10 & 32) != 0) {
                        }
                        if ((i10 & 64) != 0) {
                        }
                    } else {
                        lVar.A = null;
                        lVar.w();
                        lVar.x();
                        lVar.y();
                        lVar.z();
                    }
                    for (p9.n nVar6 : (List) lVar.f34634y) {
                        nVar6.d(0, optLong, null);
                    }
                    return;
                case 1:
                    ((p9.b) lVar.f34631v).e("received unexpected error: Invalid Player State.", new Object[0]);
                    for (p9.n nVar7 : (List) lVar.f34634y) {
                        nVar7.d(2100, optLong, p9.l.B(jSONObject));
                    }
                    return;
                case 2:
                    nVar4.d(2100, optLong, p9.l.B(jSONObject));
                    return;
                case 3:
                    nVar4.d(2101, optLong, p9.l.B(jSONObject));
                    return;
                case 4:
                    ((p9.b) lVar.f34631v).e("received unexpected error: Invalid Request.", new Object[0]);
                    for (p9.n nVar8 : (List) lVar.f34634y) {
                        nVar8.d(2100, optLong, p9.l.B(jSONObject));
                    }
                    return;
                case 5:
                    for (p9.n nVar9 : (List) lVar.f34634y) {
                        nVar9.d(2100, optLong, p9.l.B(jSONObject));
                    }
                    if (lVar.C != null) {
                        MediaError.f0(jSONObject);
                        Iterator it = ((u) lVar.C).f25009a.f24990h.iterator();
                        while (it.hasNext()) {
                            ((a) it.next()).getClass();
                        }
                        return;
                    }
                    return;
                case 6:
                    lVar.L.d(0, optLong, null);
                    if (lVar.C != null) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("itemIds");
                        if (jSONArray2 != null) {
                            iArr = new int[jSONArray2.length()];
                            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                                iArr[i11] = jSONArray2.getInt(i11);
                            }
                        }
                        if (iArr != null) {
                            Iterator it2 = ((u) lVar.C).f25009a.f24990h.iterator();
                            while (it2.hasNext()) {
                                ((a) it2.next()).b(iArr);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 7:
                    lVar.N.d(0, optLong, null);
                    if (lVar.C != null) {
                        String string2 = jSONObject.getString("changeType");
                        JSONArray jSONArray3 = jSONObject.getJSONArray("itemIds");
                        if (jSONArray3 != null) {
                            iArr = new int[jSONArray3.length()];
                            for (int i12 = 0; i12 < jSONArray3.length(); i12++) {
                                iArr[i12] = jSONArray3.getInt(i12);
                            }
                        }
                        int optInt = jSONObject.optInt("insertBefore", 0);
                        if (iArr != null) {
                            switch (string2.hashCode()) {
                                case -2130463047:
                                    if (string2.equals("INSERT")) {
                                        c11 = 0;
                                        break;
                                    }
                                    c11 = 65535;
                                    break;
                                case -1881281404:
                                    if (string2.equals("REMOVE")) {
                                        c11 = 2;
                                        break;
                                    }
                                    c11 = 65535;
                                    break;
                                case -1785516855:
                                    if (string2.equals("UPDATE")) {
                                        c11 = 3;
                                        break;
                                    }
                                    c11 = 65535;
                                    break;
                                case 1122976047:
                                    if (string2.equals("ITEMS_CHANGE")) {
                                        c11 = 1;
                                        break;
                                    }
                                    c11 = 65535;
                                    break;
                                default:
                                    c11 = 65535;
                                    break;
                            }
                            if (c11 != 0) {
                                if (c11 != 1) {
                                    if (c11 != 2) {
                                        if (c11 == 3) {
                                            Iterator it3 = ((u) lVar.C).f25009a.f24990h.iterator();
                                            while (it3.hasNext()) {
                                                ((a) it3.next()).b(iArr);
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    Iterator it4 = ((u) lVar.C).f25009a.f24990h.iterator();
                                    while (it4.hasNext()) {
                                        ((a) it4.next()).e(iArr);
                                    }
                                    return;
                                }
                                Iterator it5 = ((u) lVar.C).f25009a.f24990h.iterator();
                                while (it5.hasNext()) {
                                    ((a) it5.next()).d(iArr);
                                }
                                return;
                            }
                            Iterator it6 = ((u) lVar.C).f25009a.f24990h.iterator();
                            while (it6.hasNext()) {
                                ((a) it6.next()).c(iArr, optInt);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case '\b':
                    lVar.M.d(0, optLong, null);
                    if (lVar.C != null) {
                        JSONArray jSONArray4 = jSONObject.getJSONArray("items");
                        k9.l[] lVarArr = new k9.l[jSONArray4.length()];
                        for (int i13 = 0; i13 < jSONArray4.length(); i13++) {
                            lVarArr[i13] = new l.a(jSONArray4.getJSONObject(i13)).a();
                        }
                        Iterator it7 = ((u) lVar.C).f25009a.f24990h.iterator();
                        while (it7.hasNext()) {
                            ((a) it7.next()).f(lVarArr);
                        }
                        return;
                    }
                    return;
                case '\t':
                    lVar.O.d(0, optLong, null);
                    return;
                default:
                    return;
            }
        } catch (JSONException e10) {
            ((p9.b) lVar.f34631v).e("Message is malformed (%s); ignoring: %s", e10.getMessage(), str);
        }
    }

    public final long b() {
        long D;
        synchronized (this.f24984a) {
            v9.o.d("Must be called from the main thread.");
            D = this.f24986c.D();
        }
        return D;
    }

    @RecentlyNullable
    public final MediaInfo c() {
        MediaInfo mediaInfo;
        synchronized (this.f24984a) {
            v9.o.d("Must be called from the main thread.");
            k9.n nVar = this.f24986c.A;
            if (nVar == null) {
                mediaInfo = null;
            } else {
                mediaInfo = nVar.f23170u;
            }
        }
        return mediaInfo;
    }

    @RecentlyNullable
    public final k9.n d() {
        k9.n nVar;
        synchronized (this.f24984a) {
            v9.o.d("Must be called from the main thread.");
            nVar = this.f24986c.A;
        }
        return nVar;
    }

    public final boolean e() {
        boolean z10;
        boolean z11;
        boolean z12;
        v9.o.d("Must be called from the main thread.");
        v9.o.d("Must be called from the main thread.");
        k9.n d10 = d();
        if (d10 != null && d10.f23174y == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            v9.o.d("Must be called from the main thread.");
            k9.n d11 = d();
            if (d11 != null && d11.f23174y == 5) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                v9.o.d("Must be called from the main thread.");
                k9.n d12 = d();
                if (d12 != null && d12.f23174y == 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12 && !h() && !g()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f() {
        v9.o.d("Must be called from the main thread.");
        MediaInfo c10 = c();
        if (c10 != null && c10.f7260v == 2) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        v9.o.d("Must be called from the main thread.");
        k9.n d10 = d();
        if (d10 != null && d10.F != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        int i6;
        v9.o.d("Must be called from the main thread.");
        k9.n d10 = d();
        if (d10 == null) {
            return false;
        }
        if (d10.f23174y != 3) {
            if (!f()) {
                return false;
            }
            synchronized (this.f24984a) {
                v9.o.d("Must be called from the main thread.");
                k9.n d11 = d();
                if (d11 != null) {
                    i6 = d11.f23175z;
                } else {
                    i6 = 0;
                }
            }
            if (i6 != 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean i() {
        v9.o.d("Must be called from the main thread.");
        k9.n d10 = d();
        if (d10 != null && d10.L) {
            return true;
        }
        return false;
    }

    public final void j() {
        int i6;
        v9.o.d("Must be called from the main thread.");
        synchronized (this.f24984a) {
            v9.o.d("Must be called from the main thread.");
            k9.n d10 = d();
            if (d10 != null) {
                i6 = d10.f23174y;
            } else {
                i6 = 1;
            }
        }
        if (i6 != 4 && i6 != 2) {
            v9.o.d("Must be called from the main thread.");
            if (!n()) {
                m();
                return;
            } else {
                o(new k(this, 3));
                return;
            }
        }
        v9.o.d("Must be called from the main thread.");
        if (!n()) {
            m();
        } else {
            o(new k(this, 2));
        }
    }

    public final void k(k9.f0 f0Var) {
        e.d dVar;
        x0 x0Var = this.f;
        if (x0Var == f0Var) {
            return;
        }
        if (x0Var != null) {
            this.f24986c.C();
            this.f24988e.a();
            v9.o.d("Must be called from the main thread.");
            String str = (String) this.f24986c.f34632w;
            k9.f0 f0Var2 = (k9.f0) x0Var;
            if (!TextUtils.isEmpty(str)) {
                synchronized (f0Var2.C) {
                    dVar = (e.d) f0Var2.C.remove(str);
                }
                p.a aVar = new p.a();
                aVar.f7418a = new k9.y(f0Var2, dVar, str);
                aVar.f7421d = 8414;
                f0Var2.b(1, aVar.a());
                this.f24987d.f31224v = null;
                this.f24985b.removeCallbacksAndMessages(null);
            } else {
                throw new IllegalArgumentException("Channel namespace cannot be null or empty");
            }
        }
        this.f = f0Var;
        if (f0Var != null) {
            this.f24987d.f31224v = f0Var;
        }
    }

    public final void l() {
        x0 x0Var = this.f;
        if (x0Var == null) {
            return;
        }
        v9.o.d("Must be called from the main thread.");
        String str = (String) this.f24986c.f34632w;
        k9.f0 f0Var = (k9.f0) x0Var;
        p9.a.d(str);
        synchronized (f0Var.C) {
            f0Var.C.put(str, this);
        }
        p.a aVar = new p.a();
        aVar.f7418a = new k9.y(f0Var, str, this);
        aVar.f7421d = 8413;
        f0Var.b(1, aVar.a());
        v9.o.d("Must be called from the main thread.");
        if (!n()) {
            m();
        } else {
            o(new j(this));
        }
    }

    public final boolean n() {
        if (this.f != null) {
            return true;
        }
        return false;
    }

    /* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
    /* loaded from: classes.dex */
    public static abstract class a {
        public void a() {
        }

        public void b(@RecentlyNonNull int[] iArr) {
        }

        public void d(@RecentlyNonNull int[] iArr) {
        }

        public void e(@RecentlyNonNull int[] iArr) {
        }

        public void f(@RecentlyNonNull k9.l[] lVarArr) {
        }

        public void c(@RecentlyNonNull int[] iArr, int i6) {
        }
    }
}
