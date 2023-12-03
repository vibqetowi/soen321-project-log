package nd;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import com.theinnerhour.b2b.utils.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import pd.b0;
import pd.o;
import pd.s;
import pd.t;
/* compiled from: CrashlyticsReportDataCapture.java */
/* loaded from: classes.dex */
public final class a0 {
    public static final HashMap f;

    /* renamed from: g  reason: collision with root package name */
    public static final String f26023g;

    /* renamed from: a  reason: collision with root package name */
    public final Context f26024a;

    /* renamed from: b  reason: collision with root package name */
    public final h0 f26025b;

    /* renamed from: c  reason: collision with root package name */
    public final a f26026c;

    /* renamed from: d  reason: collision with root package name */
    public final vd.b f26027d;

    /* renamed from: e  reason: collision with root package name */
    public final ud.f f26028e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        pl.a.h(5, hashMap, "armeabi", 6, "armeabi-v7a", 9, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        f26023g = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.3.5");
    }

    public a0(Context context, h0 h0Var, a aVar, a9.a aVar2, ud.d dVar) {
        this.f26024a = context;
        this.f26025b = h0Var;
        this.f26026c = aVar;
        this.f26027d = aVar2;
        this.f26028e = dVar;
    }

    public static pd.p c(v.c cVar, int i6) {
        String str = (String) cVar.f34632w;
        String str2 = (String) cVar.f34631v;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) cVar.f34633x;
        int i10 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        v.c cVar2 = (v.c) cVar.f34634y;
        if (i6 >= 8) {
            v.c cVar3 = cVar2;
            while (cVar3 != null) {
                cVar3 = (v.c) cVar3.f34634y;
                i10++;
            }
        }
        if (str != null) {
            pd.c0 c0Var = new pd.c0(d(stackTraceElementArr, 4));
            Integer valueOf = Integer.valueOf(i10);
            pd.p pVar = null;
            if (cVar2 != null && i10 == 0) {
                pVar = c(cVar2, i6 + 1);
            }
            String str3 = "";
            if (valueOf == null) {
                str3 = pl.a.f("", " overflowCount");
            }
            if (str3.isEmpty()) {
                return new pd.p(str, str2, c0Var, pVar, valueOf.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str3));
        }
        throw new NullPointerException("Null type");
    }

    public static pd.c0 d(StackTraceElement[] stackTraceElementArr, int i6) {
        long j10;
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            s.a aVar = new s.a();
            aVar.f28353e = Integer.valueOf(i6);
            long j11 = 0;
            if (stackTraceElement.isNativeMethod()) {
                j10 = Math.max(stackTraceElement.getLineNumber(), 0L);
            } else {
                j10 = 0;
            }
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j11 = stackTraceElement.getLineNumber();
            }
            aVar.f28349a = Long.valueOf(j10);
            if (str != null) {
                aVar.f28350b = str;
                aVar.f28351c = fileName;
                aVar.f28352d = Long.valueOf(j11);
                arrayList.add(aVar.a());
            } else {
                throw new NullPointerException("Null symbol");
            }
        }
        return new pd.c0(arrayList);
    }

    public static pd.r e(Thread thread, StackTraceElement[] stackTraceElementArr, int i6) {
        String name = thread.getName();
        if (name != null) {
            Integer valueOf = Integer.valueOf(i6);
            pd.c0 c0Var = new pd.c0(d(stackTraceElementArr, i6));
            String str = "";
            if (valueOf == null) {
                str = "".concat(" importance");
            }
            if (str.isEmpty()) {
                return new pd.r(name, valueOf.intValue(), c0Var);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
        throw new NullPointerException("Null name");
    }

    public final pd.c0<b0.e.d.a.b.AbstractC0474a> a() {
        b0.e.d.a.b.AbstractC0474a[] abstractC0474aArr = new b0.e.d.a.b.AbstractC0474a[1];
        o.a aVar = new o.a();
        aVar.f28329a = 0L;
        aVar.f28330b = 0L;
        a aVar2 = this.f26026c;
        String str = aVar2.f26020e;
        if (str != null) {
            aVar.f28331c = str;
            aVar.f28332d = aVar2.f26017b;
            abstractC0474aArr[0] = aVar.a();
            return new pd.c0<>(Arrays.asList(abstractC0474aArr));
        }
        throw new NullPointerException("Null name");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pd.t b(int i6) {
        boolean z10;
        Float f2;
        StatFs statFs;
        Intent registerReceiver;
        Context context = this.f26024a;
        boolean z11 = true;
        int i10 = 2;
        Double d10 = null;
        try {
            registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (IllegalStateException e10) {
            e = e10;
            z10 = false;
        }
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            if (intExtra == -1 || (intExtra != 2 && intExtra != 5)) {
                z10 = false;
            } else {
                z10 = true;
            }
            try {
                int intExtra2 = registerReceiver.getIntExtra("level", -1);
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                if (intExtra2 != -1 && intExtra3 != -1) {
                    f2 = Float.valueOf(intExtra2 / intExtra3);
                }
            } catch (IllegalStateException e11) {
                e = e11;
                Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
                f2 = null;
                if (f2 != null) {
                }
                if (!z10) {
                }
                i10 = 1;
                if (f.i()) {
                }
                long g5 = f.g();
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService(Constants.SCREEN_ACTIVITY)).getMemoryInfo(memoryInfo);
                long j10 = g5 - memoryInfo.availMem;
                long blockSize = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
                t.a aVar = new t.a();
                aVar.f28359a = d10;
                aVar.f28360b = Integer.valueOf(i10);
                aVar.f28361c = Boolean.valueOf(z11);
                aVar.f28362d = Integer.valueOf(i6);
                aVar.f28363e = Long.valueOf(j10);
                aVar.f = Long.valueOf((statFs.getBlockCount() * blockSize) - (blockSize * statFs.getAvailableBlocks()));
                return aVar.a();
            }
            f2 = null;
        } else {
            f2 = null;
            z10 = false;
        }
        if (f2 != null) {
            d10 = Double.valueOf(f2.doubleValue());
        }
        if (!z10 && f2 != null) {
            if (f2.floatValue() >= 0.99d) {
                i10 = 3;
            }
        } else {
            i10 = 1;
        }
        z11 = (!f.i() || ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) ? false : false;
        long g52 = f.g();
        ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService(Constants.SCREEN_ACTIVITY)).getMemoryInfo(memoryInfo2);
        long j102 = g52 - memoryInfo2.availMem;
        long blockSize2 = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
        t.a aVar2 = new t.a();
        aVar2.f28359a = d10;
        aVar2.f28360b = Integer.valueOf(i10);
        aVar2.f28361c = Boolean.valueOf(z11);
        aVar2.f28362d = Integer.valueOf(i6);
        aVar2.f28363e = Long.valueOf(j102);
        aVar2.f = Long.valueOf((statFs.getBlockCount() * blockSize2) - (blockSize2 * statFs.getAvailableBlocks()));
        return aVar2.a();
    }
}
