package fj;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import com.moengage.pushbase.activities.PushTracker;
import com.moengage.pushbase.push.PushMessageListener;
import hh.g;
import java.util.Map;
import qg.g0;
/* compiled from: PushHelper.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static e f15075b;

    /* renamed from: a  reason: collision with root package name */
    public final String f15076a = "PushBase_6.6.0_PushHelper";

    /* compiled from: PushHelper.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static e a() {
            e eVar;
            e eVar2 = e.f15075b;
            if (eVar2 == null) {
                synchronized (e.class) {
                    eVar = e.f15075b;
                    if (eVar == null) {
                        eVar = new e();
                    }
                    e.f15075b = eVar;
                }
                return eVar;
            }
            return eVar2;
        }
    }

    /* compiled from: PushHelper.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" createMoEngageChannels() : ", e.this.f15076a);
        }
    }

    /* compiled from: PushHelper.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {
        public c() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" createMoEngageChannels() : ", e.this.f15076a);
        }
    }

    /* compiled from: PushHelper.kt */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<String> {
        public d() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" handlePushPayload() : ", e.this.f15076a);
        }
    }

    public static void a(Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        if (Build.VERSION.SDK_INT < 26 || y.h(context, "moe_default_channel")) {
            return;
        }
        Object systemService = context.getSystemService("notification");
        if (systemService != null) {
            NotificationChannel notificationChannel = new NotificationChannel("moe_default_channel", "General", 3);
            notificationChannel.enableVibration(true);
            ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
    }

    public static ih.p c(Bundle pushPayload) {
        kotlin.jvm.internal.i.g(pushPayload, "pushPayload");
        ng.a.f26311a.getClass();
        String a10 = ng.a.a(pushPayload);
        if (a10 == null) {
            return null;
        }
        return g0.b(a10);
    }

    public final void b(Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        try {
            hh.a aVar = hh.g.f17610d;
            g.a.b(0, new b(), 3);
            a(context);
        } catch (Throwable th2) {
            hh.a aVar2 = hh.g.f17610d;
            g.a.a(1, th2, new c());
        }
    }

    public final void d(Context context, Bundle pushPayload) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(pushPayload, "pushPayload");
        ca.a.Z0(pushPayload);
        ih.p c10 = c(pushPayload);
        if (c10 == null) {
            return;
        }
        e(context, pushPayload, c10);
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x030b A[Catch: all -> 0x0156, TryCatch #3 {all -> 0x048e, blocks: (B:255:0x048a, B:22:0x005a, B:24:0x0083, B:27:0x0092, B:30:0x00a1, B:35:0x00ad, B:40:0x00b3, B:42:0x00b9, B:45:0x00d4, B:47:0x00f3, B:49:0x0108, B:51:0x0115, B:54:0x012e, B:56:0x0134, B:58:0x0140, B:60:0x014b, B:67:0x015c, B:70:0x016b, B:72:0x0175, B:75:0x017f, B:79:0x0190, B:80:0x019c, B:83:0x01a4, B:86:0x01bf, B:91:0x01db, B:94:0x01ea, B:96:0x01ee, B:98:0x01f8, B:100:0x01fc, B:101:0x0202, B:102:0x0207, B:103:0x0208, B:105:0x020c, B:107:0x021e, B:110:0x0226, B:113:0x023d, B:115:0x0271, B:117:0x027d, B:120:0x0287, B:123:0x0291, B:125:0x029e, B:127:0x02b5, B:129:0x02b9, B:130:0x02c5, B:131:0x02ca, B:132:0x02cb, B:134:0x02cf, B:136:0x02ea, B:138:0x02f2, B:140:0x02f8, B:147:0x030b, B:148:0x031f, B:150:0x0325, B:153:0x0333, B:155:0x0337, B:157:0x033d, B:162:0x0346, B:167:0x0359, B:169:0x036b, B:174:0x0383, B:175:0x0388, B:177:0x038c, B:184:0x0398, B:186:0x039e, B:187:0x03a2, B:188:0x03a7, B:189:0x03a8, B:191:0x03ac, B:194:0x03b4, B:196:0x03b8, B:198:0x03be, B:205:0x03d2, B:207:0x03d6, B:209:0x03da, B:215:0x03e6, B:217:0x03f6, B:218:0x03fb, B:219:0x0400, B:220:0x0401, B:221:0x0406, B:223:0x0409, B:227:0x0418, B:199:0x03c3, B:200:0x03c8, B:172:0x037d, B:201:0x03c9, B:202:0x03ce, B:165:0x0353, B:228:0x0427, B:229:0x042c, B:145:0x0304, B:230:0x042d, B:231:0x0432, B:232:0x0433, B:233:0x043a, B:234:0x043b, B:235:0x0446, B:236:0x0447, B:237:0x044c, B:238:0x044d, B:239:0x0452, B:240:0x0453, B:241:0x0458, B:242:0x0459, B:243:0x045e, B:244:0x045f, B:245:0x0464, B:246:0x0465, B:247:0x046a, B:248:0x046b, B:249:0x0470, B:250:0x0471, B:251:0x0476, B:252:0x0477, B:253:0x047c, B:31:0x00a2, B:33:0x00a6, B:34:0x00ab), top: B:263:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0325 A[Catch: all -> 0x0156, TRY_LEAVE, TryCatch #3 {all -> 0x048e, blocks: (B:255:0x048a, B:22:0x005a, B:24:0x0083, B:27:0x0092, B:30:0x00a1, B:35:0x00ad, B:40:0x00b3, B:42:0x00b9, B:45:0x00d4, B:47:0x00f3, B:49:0x0108, B:51:0x0115, B:54:0x012e, B:56:0x0134, B:58:0x0140, B:60:0x014b, B:67:0x015c, B:70:0x016b, B:72:0x0175, B:75:0x017f, B:79:0x0190, B:80:0x019c, B:83:0x01a4, B:86:0x01bf, B:91:0x01db, B:94:0x01ea, B:96:0x01ee, B:98:0x01f8, B:100:0x01fc, B:101:0x0202, B:102:0x0207, B:103:0x0208, B:105:0x020c, B:107:0x021e, B:110:0x0226, B:113:0x023d, B:115:0x0271, B:117:0x027d, B:120:0x0287, B:123:0x0291, B:125:0x029e, B:127:0x02b5, B:129:0x02b9, B:130:0x02c5, B:131:0x02ca, B:132:0x02cb, B:134:0x02cf, B:136:0x02ea, B:138:0x02f2, B:140:0x02f8, B:147:0x030b, B:148:0x031f, B:150:0x0325, B:153:0x0333, B:155:0x0337, B:157:0x033d, B:162:0x0346, B:167:0x0359, B:169:0x036b, B:174:0x0383, B:175:0x0388, B:177:0x038c, B:184:0x0398, B:186:0x039e, B:187:0x03a2, B:188:0x03a7, B:189:0x03a8, B:191:0x03ac, B:194:0x03b4, B:196:0x03b8, B:198:0x03be, B:205:0x03d2, B:207:0x03d6, B:209:0x03da, B:215:0x03e6, B:217:0x03f6, B:218:0x03fb, B:219:0x0400, B:220:0x0401, B:221:0x0406, B:223:0x0409, B:227:0x0418, B:199:0x03c3, B:200:0x03c8, B:172:0x037d, B:201:0x03c9, B:202:0x03ce, B:165:0x0353, B:228:0x0427, B:229:0x042c, B:145:0x0304, B:230:0x042d, B:231:0x0432, B:232:0x0433, B:233:0x043a, B:234:0x043b, B:235:0x0446, B:236:0x0447, B:237:0x044c, B:238:0x044d, B:239:0x0452, B:240:0x0453, B:241:0x0458, B:242:0x0459, B:243:0x045e, B:244:0x045f, B:245:0x0464, B:246:0x0465, B:247:0x046a, B:248:0x046b, B:249:0x0470, B:250:0x0471, B:251:0x0476, B:252:0x0477, B:253:0x047c, B:31:0x00a2, B:33:0x00a6, B:34:0x00ab), top: B:263:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0333 A[Catch: all -> 0x0156, TRY_ENTER, TryCatch #3 {all -> 0x048e, blocks: (B:255:0x048a, B:22:0x005a, B:24:0x0083, B:27:0x0092, B:30:0x00a1, B:35:0x00ad, B:40:0x00b3, B:42:0x00b9, B:45:0x00d4, B:47:0x00f3, B:49:0x0108, B:51:0x0115, B:54:0x012e, B:56:0x0134, B:58:0x0140, B:60:0x014b, B:67:0x015c, B:70:0x016b, B:72:0x0175, B:75:0x017f, B:79:0x0190, B:80:0x019c, B:83:0x01a4, B:86:0x01bf, B:91:0x01db, B:94:0x01ea, B:96:0x01ee, B:98:0x01f8, B:100:0x01fc, B:101:0x0202, B:102:0x0207, B:103:0x0208, B:105:0x020c, B:107:0x021e, B:110:0x0226, B:113:0x023d, B:115:0x0271, B:117:0x027d, B:120:0x0287, B:123:0x0291, B:125:0x029e, B:127:0x02b5, B:129:0x02b9, B:130:0x02c5, B:131:0x02ca, B:132:0x02cb, B:134:0x02cf, B:136:0x02ea, B:138:0x02f2, B:140:0x02f8, B:147:0x030b, B:148:0x031f, B:150:0x0325, B:153:0x0333, B:155:0x0337, B:157:0x033d, B:162:0x0346, B:167:0x0359, B:169:0x036b, B:174:0x0383, B:175:0x0388, B:177:0x038c, B:184:0x0398, B:186:0x039e, B:187:0x03a2, B:188:0x03a7, B:189:0x03a8, B:191:0x03ac, B:194:0x03b4, B:196:0x03b8, B:198:0x03be, B:205:0x03d2, B:207:0x03d6, B:209:0x03da, B:215:0x03e6, B:217:0x03f6, B:218:0x03fb, B:219:0x0400, B:220:0x0401, B:221:0x0406, B:223:0x0409, B:227:0x0418, B:199:0x03c3, B:200:0x03c8, B:172:0x037d, B:201:0x03c9, B:202:0x03ce, B:165:0x0353, B:228:0x0427, B:229:0x042c, B:145:0x0304, B:230:0x042d, B:231:0x0432, B:232:0x0433, B:233:0x043a, B:234:0x043b, B:235:0x0446, B:236:0x0447, B:237:0x044c, B:238:0x044d, B:239:0x0452, B:240:0x0453, B:241:0x0458, B:242:0x0459, B:243:0x045e, B:244:0x045f, B:245:0x0464, B:246:0x0465, B:247:0x046a, B:248:0x046b, B:249:0x0470, B:250:0x0471, B:251:0x0476, B:252:0x0477, B:253:0x047c, B:31:0x00a2, B:33:0x00a6, B:34:0x00ab), top: B:263:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x039e A[Catch: all -> 0x0156, TryCatch #3 {all -> 0x048e, blocks: (B:255:0x048a, B:22:0x005a, B:24:0x0083, B:27:0x0092, B:30:0x00a1, B:35:0x00ad, B:40:0x00b3, B:42:0x00b9, B:45:0x00d4, B:47:0x00f3, B:49:0x0108, B:51:0x0115, B:54:0x012e, B:56:0x0134, B:58:0x0140, B:60:0x014b, B:67:0x015c, B:70:0x016b, B:72:0x0175, B:75:0x017f, B:79:0x0190, B:80:0x019c, B:83:0x01a4, B:86:0x01bf, B:91:0x01db, B:94:0x01ea, B:96:0x01ee, B:98:0x01f8, B:100:0x01fc, B:101:0x0202, B:102:0x0207, B:103:0x0208, B:105:0x020c, B:107:0x021e, B:110:0x0226, B:113:0x023d, B:115:0x0271, B:117:0x027d, B:120:0x0287, B:123:0x0291, B:125:0x029e, B:127:0x02b5, B:129:0x02b9, B:130:0x02c5, B:131:0x02ca, B:132:0x02cb, B:134:0x02cf, B:136:0x02ea, B:138:0x02f2, B:140:0x02f8, B:147:0x030b, B:148:0x031f, B:150:0x0325, B:153:0x0333, B:155:0x0337, B:157:0x033d, B:162:0x0346, B:167:0x0359, B:169:0x036b, B:174:0x0383, B:175:0x0388, B:177:0x038c, B:184:0x0398, B:186:0x039e, B:187:0x03a2, B:188:0x03a7, B:189:0x03a8, B:191:0x03ac, B:194:0x03b4, B:196:0x03b8, B:198:0x03be, B:205:0x03d2, B:207:0x03d6, B:209:0x03da, B:215:0x03e6, B:217:0x03f6, B:218:0x03fb, B:219:0x0400, B:220:0x0401, B:221:0x0406, B:223:0x0409, B:227:0x0418, B:199:0x03c3, B:200:0x03c8, B:172:0x037d, B:201:0x03c9, B:202:0x03ce, B:165:0x0353, B:228:0x0427, B:229:0x042c, B:145:0x0304, B:230:0x042d, B:231:0x0432, B:232:0x0433, B:233:0x043a, B:234:0x043b, B:235:0x0446, B:236:0x0447, B:237:0x044c, B:238:0x044d, B:239:0x0452, B:240:0x0453, B:241:0x0458, B:242:0x0459, B:243:0x045e, B:244:0x045f, B:245:0x0464, B:246:0x0465, B:247:0x046a, B:248:0x046b, B:249:0x0470, B:250:0x0471, B:251:0x0476, B:252:0x0477, B:253:0x047c, B:31:0x00a2, B:33:0x00a6, B:34:0x00ab), top: B:263:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03a2 A[Catch: all -> 0x0156, TryCatch #3 {all -> 0x048e, blocks: (B:255:0x048a, B:22:0x005a, B:24:0x0083, B:27:0x0092, B:30:0x00a1, B:35:0x00ad, B:40:0x00b3, B:42:0x00b9, B:45:0x00d4, B:47:0x00f3, B:49:0x0108, B:51:0x0115, B:54:0x012e, B:56:0x0134, B:58:0x0140, B:60:0x014b, B:67:0x015c, B:70:0x016b, B:72:0x0175, B:75:0x017f, B:79:0x0190, B:80:0x019c, B:83:0x01a4, B:86:0x01bf, B:91:0x01db, B:94:0x01ea, B:96:0x01ee, B:98:0x01f8, B:100:0x01fc, B:101:0x0202, B:102:0x0207, B:103:0x0208, B:105:0x020c, B:107:0x021e, B:110:0x0226, B:113:0x023d, B:115:0x0271, B:117:0x027d, B:120:0x0287, B:123:0x0291, B:125:0x029e, B:127:0x02b5, B:129:0x02b9, B:130:0x02c5, B:131:0x02ca, B:132:0x02cb, B:134:0x02cf, B:136:0x02ea, B:138:0x02f2, B:140:0x02f8, B:147:0x030b, B:148:0x031f, B:150:0x0325, B:153:0x0333, B:155:0x0337, B:157:0x033d, B:162:0x0346, B:167:0x0359, B:169:0x036b, B:174:0x0383, B:175:0x0388, B:177:0x038c, B:184:0x0398, B:186:0x039e, B:187:0x03a2, B:188:0x03a7, B:189:0x03a8, B:191:0x03ac, B:194:0x03b4, B:196:0x03b8, B:198:0x03be, B:205:0x03d2, B:207:0x03d6, B:209:0x03da, B:215:0x03e6, B:217:0x03f6, B:218:0x03fb, B:219:0x0400, B:220:0x0401, B:221:0x0406, B:223:0x0409, B:227:0x0418, B:199:0x03c3, B:200:0x03c8, B:172:0x037d, B:201:0x03c9, B:202:0x03ce, B:165:0x0353, B:228:0x0427, B:229:0x042c, B:145:0x0304, B:230:0x042d, B:231:0x0432, B:232:0x0433, B:233:0x043a, B:234:0x043b, B:235:0x0446, B:236:0x0447, B:237:0x044c, B:238:0x044d, B:239:0x0452, B:240:0x0453, B:241:0x0458, B:242:0x0459, B:243:0x045e, B:244:0x045f, B:245:0x0464, B:246:0x0465, B:247:0x046a, B:248:0x046b, B:249:0x0470, B:250:0x0471, B:251:0x0476, B:252:0x0477, B:253:0x047c, B:31:0x00a2, B:33:0x00a6, B:34:0x00ab), top: B:263:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03ac A[Catch: all -> 0x0156, TryCatch #3 {all -> 0x048e, blocks: (B:255:0x048a, B:22:0x005a, B:24:0x0083, B:27:0x0092, B:30:0x00a1, B:35:0x00ad, B:40:0x00b3, B:42:0x00b9, B:45:0x00d4, B:47:0x00f3, B:49:0x0108, B:51:0x0115, B:54:0x012e, B:56:0x0134, B:58:0x0140, B:60:0x014b, B:67:0x015c, B:70:0x016b, B:72:0x0175, B:75:0x017f, B:79:0x0190, B:80:0x019c, B:83:0x01a4, B:86:0x01bf, B:91:0x01db, B:94:0x01ea, B:96:0x01ee, B:98:0x01f8, B:100:0x01fc, B:101:0x0202, B:102:0x0207, B:103:0x0208, B:105:0x020c, B:107:0x021e, B:110:0x0226, B:113:0x023d, B:115:0x0271, B:117:0x027d, B:120:0x0287, B:123:0x0291, B:125:0x029e, B:127:0x02b5, B:129:0x02b9, B:130:0x02c5, B:131:0x02ca, B:132:0x02cb, B:134:0x02cf, B:136:0x02ea, B:138:0x02f2, B:140:0x02f8, B:147:0x030b, B:148:0x031f, B:150:0x0325, B:153:0x0333, B:155:0x0337, B:157:0x033d, B:162:0x0346, B:167:0x0359, B:169:0x036b, B:174:0x0383, B:175:0x0388, B:177:0x038c, B:184:0x0398, B:186:0x039e, B:187:0x03a2, B:188:0x03a7, B:189:0x03a8, B:191:0x03ac, B:194:0x03b4, B:196:0x03b8, B:198:0x03be, B:205:0x03d2, B:207:0x03d6, B:209:0x03da, B:215:0x03e6, B:217:0x03f6, B:218:0x03fb, B:219:0x0400, B:220:0x0401, B:221:0x0406, B:223:0x0409, B:227:0x0418, B:199:0x03c3, B:200:0x03c8, B:172:0x037d, B:201:0x03c9, B:202:0x03ce, B:165:0x0353, B:228:0x0427, B:229:0x042c, B:145:0x0304, B:230:0x042d, B:231:0x0432, B:232:0x0433, B:233:0x043a, B:234:0x043b, B:235:0x0446, B:236:0x0447, B:237:0x044c, B:238:0x044d, B:239:0x0452, B:240:0x0453, B:241:0x0458, B:242:0x0459, B:243:0x045e, B:244:0x045f, B:245:0x0464, B:246:0x0465, B:247:0x046a, B:248:0x046b, B:249:0x0470, B:250:0x0471, B:251:0x0476, B:252:0x0477, B:253:0x047c, B:31:0x00a2, B:33:0x00a6, B:34:0x00ab), top: B:263:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03c3 A[Catch: all -> 0x0156, TryCatch #3 {all -> 0x048e, blocks: (B:255:0x048a, B:22:0x005a, B:24:0x0083, B:27:0x0092, B:30:0x00a1, B:35:0x00ad, B:40:0x00b3, B:42:0x00b9, B:45:0x00d4, B:47:0x00f3, B:49:0x0108, B:51:0x0115, B:54:0x012e, B:56:0x0134, B:58:0x0140, B:60:0x014b, B:67:0x015c, B:70:0x016b, B:72:0x0175, B:75:0x017f, B:79:0x0190, B:80:0x019c, B:83:0x01a4, B:86:0x01bf, B:91:0x01db, B:94:0x01ea, B:96:0x01ee, B:98:0x01f8, B:100:0x01fc, B:101:0x0202, B:102:0x0207, B:103:0x0208, B:105:0x020c, B:107:0x021e, B:110:0x0226, B:113:0x023d, B:115:0x0271, B:117:0x027d, B:120:0x0287, B:123:0x0291, B:125:0x029e, B:127:0x02b5, B:129:0x02b9, B:130:0x02c5, B:131:0x02ca, B:132:0x02cb, B:134:0x02cf, B:136:0x02ea, B:138:0x02f2, B:140:0x02f8, B:147:0x030b, B:148:0x031f, B:150:0x0325, B:153:0x0333, B:155:0x0337, B:157:0x033d, B:162:0x0346, B:167:0x0359, B:169:0x036b, B:174:0x0383, B:175:0x0388, B:177:0x038c, B:184:0x0398, B:186:0x039e, B:187:0x03a2, B:188:0x03a7, B:189:0x03a8, B:191:0x03ac, B:194:0x03b4, B:196:0x03b8, B:198:0x03be, B:205:0x03d2, B:207:0x03d6, B:209:0x03da, B:215:0x03e6, B:217:0x03f6, B:218:0x03fb, B:219:0x0400, B:220:0x0401, B:221:0x0406, B:223:0x0409, B:227:0x0418, B:199:0x03c3, B:200:0x03c8, B:172:0x037d, B:201:0x03c9, B:202:0x03ce, B:165:0x0353, B:228:0x0427, B:229:0x042c, B:145:0x0304, B:230:0x042d, B:231:0x0432, B:232:0x0433, B:233:0x043a, B:234:0x043b, B:235:0x0446, B:236:0x0447, B:237:0x044c, B:238:0x044d, B:239:0x0452, B:240:0x0453, B:241:0x0458, B:242:0x0459, B:243:0x045e, B:244:0x045f, B:245:0x0464, B:246:0x0465, B:247:0x046a, B:248:0x046b, B:249:0x0470, B:250:0x0471, B:251:0x0476, B:252:0x0477, B:253:0x047c, B:31:0x00a2, B:33:0x00a6, B:34:0x00ab), top: B:263:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03d2 A[Catch: all -> 0x0156, TryCatch #3 {all -> 0x048e, blocks: (B:255:0x048a, B:22:0x005a, B:24:0x0083, B:27:0x0092, B:30:0x00a1, B:35:0x00ad, B:40:0x00b3, B:42:0x00b9, B:45:0x00d4, B:47:0x00f3, B:49:0x0108, B:51:0x0115, B:54:0x012e, B:56:0x0134, B:58:0x0140, B:60:0x014b, B:67:0x015c, B:70:0x016b, B:72:0x0175, B:75:0x017f, B:79:0x0190, B:80:0x019c, B:83:0x01a4, B:86:0x01bf, B:91:0x01db, B:94:0x01ea, B:96:0x01ee, B:98:0x01f8, B:100:0x01fc, B:101:0x0202, B:102:0x0207, B:103:0x0208, B:105:0x020c, B:107:0x021e, B:110:0x0226, B:113:0x023d, B:115:0x0271, B:117:0x027d, B:120:0x0287, B:123:0x0291, B:125:0x029e, B:127:0x02b5, B:129:0x02b9, B:130:0x02c5, B:131:0x02ca, B:132:0x02cb, B:134:0x02cf, B:136:0x02ea, B:138:0x02f2, B:140:0x02f8, B:147:0x030b, B:148:0x031f, B:150:0x0325, B:153:0x0333, B:155:0x0337, B:157:0x033d, B:162:0x0346, B:167:0x0359, B:169:0x036b, B:174:0x0383, B:175:0x0388, B:177:0x038c, B:184:0x0398, B:186:0x039e, B:187:0x03a2, B:188:0x03a7, B:189:0x03a8, B:191:0x03ac, B:194:0x03b4, B:196:0x03b8, B:198:0x03be, B:205:0x03d2, B:207:0x03d6, B:209:0x03da, B:215:0x03e6, B:217:0x03f6, B:218:0x03fb, B:219:0x0400, B:220:0x0401, B:221:0x0406, B:223:0x0409, B:227:0x0418, B:199:0x03c3, B:200:0x03c8, B:172:0x037d, B:201:0x03c9, B:202:0x03ce, B:165:0x0353, B:228:0x0427, B:229:0x042c, B:145:0x0304, B:230:0x042d, B:231:0x0432, B:232:0x0433, B:233:0x043a, B:234:0x043b, B:235:0x0446, B:236:0x0447, B:237:0x044c, B:238:0x044d, B:239:0x0452, B:240:0x0453, B:241:0x0458, B:242:0x0459, B:243:0x045e, B:244:0x045f, B:245:0x0464, B:246:0x0465, B:247:0x046a, B:248:0x046b, B:249:0x0470, B:250:0x0471, B:251:0x0476, B:252:0x0477, B:253:0x047c, B:31:0x00a2, B:33:0x00a6, B:34:0x00ab), top: B:263:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03e6 A[Catch: all -> 0x0156, TryCatch #3 {all -> 0x048e, blocks: (B:255:0x048a, B:22:0x005a, B:24:0x0083, B:27:0x0092, B:30:0x00a1, B:35:0x00ad, B:40:0x00b3, B:42:0x00b9, B:45:0x00d4, B:47:0x00f3, B:49:0x0108, B:51:0x0115, B:54:0x012e, B:56:0x0134, B:58:0x0140, B:60:0x014b, B:67:0x015c, B:70:0x016b, B:72:0x0175, B:75:0x017f, B:79:0x0190, B:80:0x019c, B:83:0x01a4, B:86:0x01bf, B:91:0x01db, B:94:0x01ea, B:96:0x01ee, B:98:0x01f8, B:100:0x01fc, B:101:0x0202, B:102:0x0207, B:103:0x0208, B:105:0x020c, B:107:0x021e, B:110:0x0226, B:113:0x023d, B:115:0x0271, B:117:0x027d, B:120:0x0287, B:123:0x0291, B:125:0x029e, B:127:0x02b5, B:129:0x02b9, B:130:0x02c5, B:131:0x02ca, B:132:0x02cb, B:134:0x02cf, B:136:0x02ea, B:138:0x02f2, B:140:0x02f8, B:147:0x030b, B:148:0x031f, B:150:0x0325, B:153:0x0333, B:155:0x0337, B:157:0x033d, B:162:0x0346, B:167:0x0359, B:169:0x036b, B:174:0x0383, B:175:0x0388, B:177:0x038c, B:184:0x0398, B:186:0x039e, B:187:0x03a2, B:188:0x03a7, B:189:0x03a8, B:191:0x03ac, B:194:0x03b4, B:196:0x03b8, B:198:0x03be, B:205:0x03d2, B:207:0x03d6, B:209:0x03da, B:215:0x03e6, B:217:0x03f6, B:218:0x03fb, B:219:0x0400, B:220:0x0401, B:221:0x0406, B:223:0x0409, B:227:0x0418, B:199:0x03c3, B:200:0x03c8, B:172:0x037d, B:201:0x03c9, B:202:0x03ce, B:165:0x0353, B:228:0x0427, B:229:0x042c, B:145:0x0304, B:230:0x042d, B:231:0x0432, B:232:0x0433, B:233:0x043a, B:234:0x043b, B:235:0x0446, B:236:0x0447, B:237:0x044c, B:238:0x044d, B:239:0x0452, B:240:0x0453, B:241:0x0458, B:242:0x0459, B:243:0x045e, B:244:0x045f, B:245:0x0464, B:246:0x0465, B:247:0x046a, B:248:0x046b, B:249:0x0470, B:250:0x0471, B:251:0x0476, B:252:0x0477, B:253:0x047c, B:31:0x00a2, B:33:0x00a6, B:34:0x00ab), top: B:263:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0409 A[Catch: all -> 0x0156, TRY_LEAVE, TryCatch #3 {all -> 0x048e, blocks: (B:255:0x048a, B:22:0x005a, B:24:0x0083, B:27:0x0092, B:30:0x00a1, B:35:0x00ad, B:40:0x00b3, B:42:0x00b9, B:45:0x00d4, B:47:0x00f3, B:49:0x0108, B:51:0x0115, B:54:0x012e, B:56:0x0134, B:58:0x0140, B:60:0x014b, B:67:0x015c, B:70:0x016b, B:72:0x0175, B:75:0x017f, B:79:0x0190, B:80:0x019c, B:83:0x01a4, B:86:0x01bf, B:91:0x01db, B:94:0x01ea, B:96:0x01ee, B:98:0x01f8, B:100:0x01fc, B:101:0x0202, B:102:0x0207, B:103:0x0208, B:105:0x020c, B:107:0x021e, B:110:0x0226, B:113:0x023d, B:115:0x0271, B:117:0x027d, B:120:0x0287, B:123:0x0291, B:125:0x029e, B:127:0x02b5, B:129:0x02b9, B:130:0x02c5, B:131:0x02ca, B:132:0x02cb, B:134:0x02cf, B:136:0x02ea, B:138:0x02f2, B:140:0x02f8, B:147:0x030b, B:148:0x031f, B:150:0x0325, B:153:0x0333, B:155:0x0337, B:157:0x033d, B:162:0x0346, B:167:0x0359, B:169:0x036b, B:174:0x0383, B:175:0x0388, B:177:0x038c, B:184:0x0398, B:186:0x039e, B:187:0x03a2, B:188:0x03a7, B:189:0x03a8, B:191:0x03ac, B:194:0x03b4, B:196:0x03b8, B:198:0x03be, B:205:0x03d2, B:207:0x03d6, B:209:0x03da, B:215:0x03e6, B:217:0x03f6, B:218:0x03fb, B:219:0x0400, B:220:0x0401, B:221:0x0406, B:223:0x0409, B:227:0x0418, B:199:0x03c3, B:200:0x03c8, B:172:0x037d, B:201:0x03c9, B:202:0x03ce, B:165:0x0353, B:228:0x0427, B:229:0x042c, B:145:0x0304, B:230:0x042d, B:231:0x0432, B:232:0x0433, B:233:0x043a, B:234:0x043b, B:235:0x0446, B:236:0x0447, B:237:0x044c, B:238:0x044d, B:239:0x0452, B:240:0x0453, B:241:0x0458, B:242:0x0459, B:243:0x045e, B:244:0x045f, B:245:0x0464, B:246:0x0465, B:247:0x046a, B:248:0x046b, B:249:0x0470, B:250:0x0471, B:251:0x0476, B:252:0x0477, B:253:0x047c, B:31:0x00a2, B:33:0x00a6, B:34:0x00ab), top: B:263:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015c A[Catch: all -> 0x0156, TRY_LEAVE, TryCatch #3 {all -> 0x048e, blocks: (B:255:0x048a, B:22:0x005a, B:24:0x0083, B:27:0x0092, B:30:0x00a1, B:35:0x00ad, B:40:0x00b3, B:42:0x00b9, B:45:0x00d4, B:47:0x00f3, B:49:0x0108, B:51:0x0115, B:54:0x012e, B:56:0x0134, B:58:0x0140, B:60:0x014b, B:67:0x015c, B:70:0x016b, B:72:0x0175, B:75:0x017f, B:79:0x0190, B:80:0x019c, B:83:0x01a4, B:86:0x01bf, B:91:0x01db, B:94:0x01ea, B:96:0x01ee, B:98:0x01f8, B:100:0x01fc, B:101:0x0202, B:102:0x0207, B:103:0x0208, B:105:0x020c, B:107:0x021e, B:110:0x0226, B:113:0x023d, B:115:0x0271, B:117:0x027d, B:120:0x0287, B:123:0x0291, B:125:0x029e, B:127:0x02b5, B:129:0x02b9, B:130:0x02c5, B:131:0x02ca, B:132:0x02cb, B:134:0x02cf, B:136:0x02ea, B:138:0x02f2, B:140:0x02f8, B:147:0x030b, B:148:0x031f, B:150:0x0325, B:153:0x0333, B:155:0x0337, B:157:0x033d, B:162:0x0346, B:167:0x0359, B:169:0x036b, B:174:0x0383, B:175:0x0388, B:177:0x038c, B:184:0x0398, B:186:0x039e, B:187:0x03a2, B:188:0x03a7, B:189:0x03a8, B:191:0x03ac, B:194:0x03b4, B:196:0x03b8, B:198:0x03be, B:205:0x03d2, B:207:0x03d6, B:209:0x03da, B:215:0x03e6, B:217:0x03f6, B:218:0x03fb, B:219:0x0400, B:220:0x0401, B:221:0x0406, B:223:0x0409, B:227:0x0418, B:199:0x03c3, B:200:0x03c8, B:172:0x037d, B:201:0x03c9, B:202:0x03ce, B:165:0x0353, B:228:0x0427, B:229:0x042c, B:145:0x0304, B:230:0x042d, B:231:0x0432, B:232:0x0433, B:233:0x043a, B:234:0x043b, B:235:0x0446, B:236:0x0447, B:237:0x044c, B:238:0x044d, B:239:0x0452, B:240:0x0453, B:241:0x0458, B:242:0x0459, B:243:0x045e, B:244:0x045f, B:245:0x0464, B:246:0x0465, B:247:0x046a, B:248:0x046b, B:249:0x0470, B:250:0x0471, B:251:0x0476, B:252:0x0477, B:253:0x047c, B:31:0x00a2, B:33:0x00a6, B:34:0x00ab), top: B:263:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016b A[Catch: all -> 0x0156, TRY_ENTER, TryCatch #3 {all -> 0x048e, blocks: (B:255:0x048a, B:22:0x005a, B:24:0x0083, B:27:0x0092, B:30:0x00a1, B:35:0x00ad, B:40:0x00b3, B:42:0x00b9, B:45:0x00d4, B:47:0x00f3, B:49:0x0108, B:51:0x0115, B:54:0x012e, B:56:0x0134, B:58:0x0140, B:60:0x014b, B:67:0x015c, B:70:0x016b, B:72:0x0175, B:75:0x017f, B:79:0x0190, B:80:0x019c, B:83:0x01a4, B:86:0x01bf, B:91:0x01db, B:94:0x01ea, B:96:0x01ee, B:98:0x01f8, B:100:0x01fc, B:101:0x0202, B:102:0x0207, B:103:0x0208, B:105:0x020c, B:107:0x021e, B:110:0x0226, B:113:0x023d, B:115:0x0271, B:117:0x027d, B:120:0x0287, B:123:0x0291, B:125:0x029e, B:127:0x02b5, B:129:0x02b9, B:130:0x02c5, B:131:0x02ca, B:132:0x02cb, B:134:0x02cf, B:136:0x02ea, B:138:0x02f2, B:140:0x02f8, B:147:0x030b, B:148:0x031f, B:150:0x0325, B:153:0x0333, B:155:0x0337, B:157:0x033d, B:162:0x0346, B:167:0x0359, B:169:0x036b, B:174:0x0383, B:175:0x0388, B:177:0x038c, B:184:0x0398, B:186:0x039e, B:187:0x03a2, B:188:0x03a7, B:189:0x03a8, B:191:0x03ac, B:194:0x03b4, B:196:0x03b8, B:198:0x03be, B:205:0x03d2, B:207:0x03d6, B:209:0x03da, B:215:0x03e6, B:217:0x03f6, B:218:0x03fb, B:219:0x0400, B:220:0x0401, B:221:0x0406, B:223:0x0409, B:227:0x0418, B:199:0x03c3, B:200:0x03c8, B:172:0x037d, B:201:0x03c9, B:202:0x03ce, B:165:0x0353, B:228:0x0427, B:229:0x042c, B:145:0x0304, B:230:0x042d, B:231:0x0432, B:232:0x0433, B:233:0x043a, B:234:0x043b, B:235:0x0446, B:236:0x0447, B:237:0x044c, B:238:0x044d, B:239:0x0452, B:240:0x0453, B:241:0x0458, B:242:0x0459, B:243:0x045e, B:244:0x045f, B:245:0x0464, B:246:0x0465, B:247:0x046a, B:248:0x046b, B:249:0x0470, B:250:0x0471, B:251:0x0476, B:252:0x0477, B:253:0x047c, B:31:0x00a2, B:33:0x00a6, B:34:0x00ab), top: B:263:0x005a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Context context, Bundle payload, ih.p pVar) {
        boolean z10;
        boolean z11;
        int i6;
        int i10;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean isTemplateSupported;
        jj.c buildTemplate;
        pj.b bVar;
        pj.b bVar2;
        ej.b bVar3;
        if (kotlin.jvm.internal.i.b(Looper.myLooper(), Looper.getMainLooper())) {
            pVar.f20106e.c(new ah.e("PUSH_BASE_PUSH_WORKER_TASK", false, new u5.f(this, context, pVar, payload, 7)));
            return;
        }
        if (ej.b.f14047b == null) {
            synchronized (ej.b.class) {
                ej.b bVar4 = ej.b.f14047b;
                if (bVar4 == null) {
                    bVar4 = new ej.b();
                }
                ej.b.f14047b = bVar4;
            }
        }
        PushMessageListener a10 = ej.b.a(pVar);
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(payload, "payload");
        synchronized (a10.f) {
            try {
                hh.g.b(a10.f10242h.f20105d, 0, new rj.o(a10), 3);
                tr.r rVar = a10.f10241g;
                ih.p sdkInstance = a10.f10242h;
                rVar.getClass();
                kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
                fj.d.f15071a.getClass();
                if (!fj.d.b(context, sdkInstance).d()) {
                    hh.g.b(a10.f10242h.f20105d, 2, new rj.p(a10), 2);
                    return;
                }
                di.b.w(a10.f10242h.f20105d, a10.f10236a, payload);
                ej.b bVar5 = ej.b.f14047b;
                if (bVar5 == null) {
                    synchronized (ej.b.class) {
                        bVar3 = ej.b.f14047b;
                        if (bVar3 == null) {
                            bVar3 = new ej.b();
                        }
                        ej.b.f14047b = bVar3;
                    }
                    bVar5 = bVar3;
                }
                if (!bVar5.b(payload)) {
                    hh.g.b(a10.f10242h.f20105d, 2, new rj.q(a10), 2);
                    hh.g.b(a10.f10242h.f20105d, 0, new rj.x(a10), 3);
                    return;
                }
                a10.f10240e = new lj.h(a10.f10242h).d(payload);
                boolean z15 = payload.getBoolean("moe_re_notify", false);
                a10.f10243i.c(context, payload);
                n nVar = a10.f10243i;
                pj.b bVar6 = a10.f10240e;
                if (bVar6 != null) {
                    nVar.a(context, bVar6);
                    hh.g.b(a10.f10242h.f20105d, 0, new rj.r(a10), 3);
                    tr.r rVar2 = a10.f10241g;
                    pj.b bVar7 = a10.f10240e;
                    if (bVar7 != null) {
                        rVar2.getClass();
                        if (kotlin.jvm.internal.i.b("gcm_silentNotification", bVar7.f28526a)) {
                            hh.g.b(a10.f10242h.f20105d, 0, new rj.s(a10), 3);
                            new kj.a(a10.f10242h).a(context);
                            return;
                        }
                        tr.r rVar3 = a10.f10241g;
                        pj.b bVar8 = a10.f10240e;
                        if (bVar8 != null) {
                            rVar3.getClass();
                            if (!gv.n.B0(bVar8.f28527b)) {
                                qh.a aVar = bVar8.f28528c;
                                if ((!gv.n.B0(aVar.f29590b)) && (!gv.n.B0(aVar.f29591c))) {
                                    z10 = true;
                                    if (z10) {
                                        hh.g.b(a10.f10242h.f20105d, 0, new rj.t(a10), 3);
                                        return;
                                    }
                                    lj.k b10 = fj.d.b(context, a10.f10242h);
                                    pj.b bVar9 = a10.f10240e;
                                    if (bVar9 != null) {
                                        if (b10.q(bVar9.f28527b) && !z15) {
                                            hh.g.b(a10.f10242h.f20105d, 0, new rj.u(a10), 3);
                                            return;
                                        }
                                        if (!z15) {
                                            hh.g.b(a10.f10242h.f20105d, 0, new rj.a0(a10), 3);
                                        }
                                        if (!a10.c(context, payload) && !z15) {
                                            hh.g.b(a10.f10242h.f20105d, 0, new rj.v(a10), 3);
                                            hh.g.b(a10.f10242h.f20105d, 0, new rj.z(a10), 3);
                                            return;
                                        }
                                        tr.r rVar4 = a10.f10241g;
                                        dh.a config = a10.f10242h.f20103b;
                                        rVar4.getClass();
                                        kotlin.jvm.internal.i.g(config, "config");
                                        if (config.f12858d.f28417b.f28414a != -1) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (!z11) {
                                            hh.g.b(a10.f10242h.f20105d, 0, new rj.w(a10), 3);
                                            return;
                                        }
                                        pj.b bVar10 = a10.f10240e;
                                        if (bVar10 != null) {
                                            boolean b11 = a10.b(context, b10, bVar10.f28532h.f28523h);
                                            if (!z15) {
                                                pj.b bVar11 = a10.f10240e;
                                                if (bVar11 != null) {
                                                    b10.m(bVar11.f28527b);
                                                } else {
                                                    kotlin.jvm.internal.i.q("notificationPayload");
                                                    throw null;
                                                }
                                            }
                                            pj.b bVar12 = a10.f10240e;
                                            if (bVar12 != null) {
                                                b10.p(bVar12.f28527b);
                                                payload.putLong("MOE_MSG_RECEIVED_TIME", System.currentTimeMillis());
                                                pj.b bVar13 = a10.f10240e;
                                                if (bVar13 != null) {
                                                    if (bVar13.f28532h.f28519c && !z15) {
                                                        hh.g.b(a10.f10242h.f20105d, 0, new rj.h(a10), 3);
                                                        a10.d(context, payload);
                                                        y.a(context, payload, a10.f10242h);
                                                        return;
                                                    }
                                                    hh.g.b(a10.f10242h.f20105d, 3, new rj.i(a10), 2);
                                                    Intent intent = new Intent(context, PushTracker.class);
                                                    intent.setAction(kotlin.jvm.internal.i.n(Long.valueOf(System.currentTimeMillis()), ""));
                                                    intent.setFlags(268435456);
                                                    intent.putExtras(payload);
                                                    int i11 = payload.getInt("MOE_NOTIFICATION_ID", -1);
                                                    if (i11 == -1) {
                                                        lj.k b12 = fj.d.b(context, a10.f10242h);
                                                        int e10 = b12.e();
                                                        if (b11) {
                                                            int i12 = e10 + 1;
                                                            if (i12 - 17987 >= 101) {
                                                                i12 = 17987;
                                                            }
                                                            int i13 = i12 + 1;
                                                            b12.k(i13);
                                                            i6 = i13;
                                                        } else {
                                                            i6 = e10;
                                                        }
                                                    } else {
                                                        i6 = i11;
                                                    }
                                                    intent.putExtra("MOE_NOTIFICATION_ID", i6);
                                                    ih.p pVar2 = a10.f10242h;
                                                    pj.b bVar14 = a10.f10240e;
                                                    if (bVar14 != null) {
                                                        int i14 = i6;
                                                        fj.c cVar = new fj.c(context, pVar2, bVar14, i6, intent);
                                                        a10.f10239d = cVar;
                                                        f0.t a11 = a10.a(context, z15, cVar);
                                                        if (!z15) {
                                                            pj.b bVar15 = a10.f10240e;
                                                            if (bVar15 != null) {
                                                                bVar15.f28533i.putLong("moe_notification_posted_time", System.currentTimeMillis());
                                                            } else {
                                                                kotlin.jvm.internal.i.q("notificationPayload");
                                                                throw null;
                                                            }
                                                        }
                                                        pj.b bVar16 = a10.f10240e;
                                                        if (bVar16 != null) {
                                                            a11.D.when = bVar16.f28533i.getLong("moe_notification_posted_time");
                                                            a11.E = z15;
                                                            Notification b13 = a11.b();
                                                            kotlin.jvm.internal.i.f(b13, "notificationCompatBuilder.build()");
                                                            if (a10.f10237b) {
                                                                Object systemService = context.getSystemService("notification");
                                                                if (systemService != null) {
                                                                    NotificationManager notificationManager = (NotificationManager) systemService;
                                                                    pj.b bVar17 = a10.f10240e;
                                                                    if (bVar17 != null) {
                                                                        if (bVar17.f28532h.f28520d && z15) {
                                                                            i10 = i14;
                                                                            if (!z15) {
                                                                                y.a(context, payload, a10.f10242h);
                                                                                a10.d(context, payload);
                                                                                hh.g.b(a10.f10242h.f20105d, 0, new rj.b0(a10), 3);
                                                                            }
                                                                            a10.f10237b = false;
                                                                            if (a10.f10238c) {
                                                                                hh.g.b(a10.f10242h.f20105d, 0, rj.j.f30750u, 3);
                                                                                a10.f10238c = false;
                                                                                return;
                                                                            }
                                                                            pj.b bVar18 = a10.f10240e;
                                                                            if (bVar18 != null) {
                                                                                if (bVar18.f28532h.f28520d) {
                                                                                    if (nj.c.f26377a != null) {
                                                                                        z14 = true;
                                                                                    } else {
                                                                                        z14 = false;
                                                                                    }
                                                                                    if (z14) {
                                                                                        ih.p sdkInstance2 = a10.f10242h;
                                                                                        kotlin.jvm.internal.i.g(sdkInstance2, "sdkInstance");
                                                                                        nj.a aVar2 = nj.c.f26377a;
                                                                                        if (aVar2 == null) {
                                                                                            isTemplateSupported = false;
                                                                                        } else {
                                                                                            isTemplateSupported = aVar2.isTemplateSupported(context, bVar18, sdkInstance2);
                                                                                        }
                                                                                        if (isTemplateSupported) {
                                                                                            hh.g.b(a10.f10242h.f20105d, 0, new rj.k(a10), 3);
                                                                                            pj.b bVar19 = a10.f10240e;
                                                                                            if (bVar19 != null) {
                                                                                                jj.b bVar20 = new jj.b(bVar19, a11, intent, i10);
                                                                                                ih.p sdkInstance3 = a10.f10242h;
                                                                                                kotlin.jvm.internal.i.g(sdkInstance3, "sdkInstance");
                                                                                                nj.a aVar3 = nj.c.f26377a;
                                                                                                if (aVar3 == null) {
                                                                                                    buildTemplate = null;
                                                                                                } else {
                                                                                                    buildTemplate = aVar3.buildTemplate(context, bVar20, sdkInstance3);
                                                                                                }
                                                                                                if (buildTemplate == null) {
                                                                                                    buildTemplate = new jj.c(false, false);
                                                                                                }
                                                                                                if (!buildTemplate.f22069a && !buildTemplate.f22070b) {
                                                                                                    z12 = false;
                                                                                                    if (z12 && !z15) {
                                                                                                        ih.p pVar3 = a10.f10242h;
                                                                                                        bVar2 = a10.f10240e;
                                                                                                        if (bVar2 == null) {
                                                                                                            p.d(context, bVar2, pVar3);
                                                                                                        } else {
                                                                                                            kotlin.jvm.internal.i.q("notificationPayload");
                                                                                                            throw null;
                                                                                                        }
                                                                                                    }
                                                                                                    bVar = a10.f10240e;
                                                                                                    if (bVar == null) {
                                                                                                        if (bVar.f28532h.f28521e && z12 && (buildTemplate.f22070b || Build.VERSION.SDK_INT < 31)) {
                                                                                                            a11.g(2, true);
                                                                                                        }
                                                                                                        if (!z12) {
                                                                                                            pj.b bVar21 = a10.f10240e;
                                                                                                            if (bVar21 != null) {
                                                                                                                String str = bVar21.f28529d;
                                                                                                                if (str != null && !gv.n.B0(str)) {
                                                                                                                    z13 = false;
                                                                                                                    if (!z13) {
                                                                                                                        hh.g.b(a10.f10242h.f20105d, 0, new rj.l(a10), 3);
                                                                                                                        fj.c cVar2 = a10.f10239d;
                                                                                                                        if (cVar2 != null) {
                                                                                                                            cVar2.a(a11);
                                                                                                                            z12 = true;
                                                                                                                        } else {
                                                                                                                            kotlin.jvm.internal.i.q("notificationBuilder");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                z13 = true;
                                                                                                                if (!z13) {
                                                                                                                }
                                                                                                            } else {
                                                                                                                kotlin.jvm.internal.i.q("notificationPayload");
                                                                                                                throw null;
                                                                                                            }
                                                                                                        }
                                                                                                        if (z12) {
                                                                                                            hh.g.b(a10.f10242h.f20105d, 0, new rj.m(a10), 3);
                                                                                                            return;
                                                                                                        }
                                                                                                        a11.E = true;
                                                                                                        Notification b14 = a11.b();
                                                                                                        kotlin.jvm.internal.i.f(b14, "notificationCompatBuilder.build()");
                                                                                                        notificationManager.notify(i10, b14);
                                                                                                        hs.k kVar = hs.k.f19476a;
                                                                                                        return;
                                                                                                    }
                                                                                                    kotlin.jvm.internal.i.q("notificationPayload");
                                                                                                    throw null;
                                                                                                }
                                                                                                z12 = true;
                                                                                                if (z12) {
                                                                                                    ih.p pVar32 = a10.f10242h;
                                                                                                    bVar2 = a10.f10240e;
                                                                                                    if (bVar2 == null) {
                                                                                                    }
                                                                                                }
                                                                                                bVar = a10.f10240e;
                                                                                                if (bVar == null) {
                                                                                                }
                                                                                            } else {
                                                                                                kotlin.jvm.internal.i.q("notificationPayload");
                                                                                                throw null;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                z12 = false;
                                                                                if (!z12) {
                                                                                }
                                                                                if (z12) {
                                                                                }
                                                                            } else {
                                                                                kotlin.jvm.internal.i.q("notificationPayload");
                                                                                throw null;
                                                                            }
                                                                        }
                                                                        i10 = i14;
                                                                        notificationManager.notify(i10, b13);
                                                                        if (!z15) {
                                                                        }
                                                                        a10.f10237b = false;
                                                                        if (a10.f10238c) {
                                                                        }
                                                                    } else {
                                                                        kotlin.jvm.internal.i.q("notificationPayload");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
                                                                }
                                                            } else {
                                                                throw new IllegalStateException("super.isNotificationRequired() not called.".toString());
                                                            }
                                                        } else {
                                                            kotlin.jvm.internal.i.q("notificationPayload");
                                                            throw null;
                                                        }
                                                    } else {
                                                        kotlin.jvm.internal.i.q("notificationPayload");
                                                        throw null;
                                                    }
                                                } else {
                                                    kotlin.jvm.internal.i.q("notificationPayload");
                                                    throw null;
                                                }
                                            } else {
                                                kotlin.jvm.internal.i.q("notificationPayload");
                                                throw null;
                                            }
                                        } else {
                                            kotlin.jvm.internal.i.q("notificationPayload");
                                            throw null;
                                        }
                                    } else {
                                        kotlin.jvm.internal.i.q("notificationPayload");
                                        throw null;
                                    }
                                }
                            }
                            z10 = false;
                            if (z10) {
                            }
                        } else {
                            kotlin.jvm.internal.i.q("notificationPayload");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.i.q("notificationPayload");
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.i.q("notificationPayload");
                    throw null;
                }
            }
        }
    }

    public final void f(Context context, Map<String, String> map) {
        try {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            di.b.v(bundle, this.f15076a);
            d(context, bundle);
        } catch (Throwable th2) {
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, th2, new d());
        }
    }
}
