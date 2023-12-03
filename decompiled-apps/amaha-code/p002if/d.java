package p002if;

import android.app.ActivityManager;
import android.content.Context;
import com.theinnerhour.b2b.utils.Constants;
import df.a;
/* compiled from: GaugeMetadataManager.java */
/* renamed from: if.d  reason: invalid package */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Runtime f20018a = Runtime.getRuntime();

    /* renamed from: b  reason: collision with root package name */
    public final ActivityManager f20019b;

    /* renamed from: c  reason: collision with root package name */
    public final ActivityManager.MemoryInfo f20020c;

    static {
        a.d();
    }

    public d(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(Constants.SCREEN_ACTIVITY);
        this.f20019b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f20020c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
