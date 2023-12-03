package m4;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.theinnerhour.b2b.utils.Constants;
/* compiled from: MemorySizeCalculator.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final int f24819a;

    /* renamed from: b  reason: collision with root package name */
    public final int f24820b;

    /* renamed from: c  reason: collision with root package name */
    public final int f24821c;

    /* compiled from: MemorySizeCalculator.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final int f24822e;

        /* renamed from: a  reason: collision with root package name */
        public final Context f24823a;

        /* renamed from: b  reason: collision with root package name */
        public final ActivityManager f24824b;

        /* renamed from: c  reason: collision with root package name */
        public final b f24825c;

        /* renamed from: d  reason: collision with root package name */
        public final float f24826d;

        static {
            int i6;
            if (Build.VERSION.SDK_INT < 26) {
                i6 = 4;
            } else {
                i6 = 1;
            }
            f24822e = i6;
        }

        public a(Context context) {
            this.f24826d = f24822e;
            this.f24823a = context;
            ActivityManager activityManager = (ActivityManager) context.getSystemService(Constants.SCREEN_ACTIVITY);
            this.f24824b = activityManager;
            this.f24825c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && activityManager.isLowRamDevice()) {
                this.f24826d = 0.0f;
            }
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final DisplayMetrics f24827a;

        public b(DisplayMetrics displayMetrics) {
            this.f24827a = displayMetrics;
        }
    }

    public i(a aVar) {
        int i6;
        float f;
        boolean z10;
        Context context = aVar.f24823a;
        ActivityManager activityManager = aVar.f24824b;
        if (activityManager.isLowRamDevice()) {
            i6 = 2097152;
        } else {
            i6 = 4194304;
        }
        this.f24821c = i6;
        float memoryClass = activityManager.getMemoryClass() * Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID * Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID;
        if (activityManager.isLowRamDevice()) {
            f = 0.33f;
        } else {
            f = 0.4f;
        }
        int round = Math.round(memoryClass * f);
        DisplayMetrics displayMetrics = aVar.f24825c.f24827a;
        float f2 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        float f10 = aVar.f24826d;
        int round2 = Math.round(f2 * f10);
        int round3 = Math.round(f2 * 2.0f);
        int i10 = round - i6;
        int i11 = round3 + round2;
        if (i11 <= i10) {
            this.f24820b = round3;
            this.f24819a = round2;
        } else {
            float f11 = i10 / (f10 + 2.0f);
            this.f24820b = Math.round(2.0f * f11);
            this.f24819a = Math.round(f11 * f10);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb2 = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb2.append(Formatter.formatFileSize(context, this.f24820b));
            sb2.append(", pool size: ");
            sb2.append(Formatter.formatFileSize(context, this.f24819a));
            sb2.append(", byte array size: ");
            sb2.append(Formatter.formatFileSize(context, i6));
            sb2.append(", memory class limited? ");
            if (i11 > round) {
                z10 = true;
            } else {
                z10 = false;
            }
            sb2.append(z10);
            sb2.append(", max size: ");
            sb2.append(Formatter.formatFileSize(context, round));
            sb2.append(", memoryClass: ");
            sb2.append(activityManager.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb2.toString());
        }
    }
}
