package yn;

import android.os.Build;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import df.b;
import hs.f;
/* compiled from: NotificationCheckerUtils.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f38694a = new b(26);

    /* renamed from: b  reason: collision with root package name */
    public int f38695b = ApplicationPersistence.getInstance().getIntValue(Constants.APP_OPEN_DAY, 0);

    /* renamed from: c  reason: collision with root package name */
    public int f38696c = ApplicationPersistence.getInstance().getIntValue(Constants.NOTIFICATION_ASK_DAY, 0);

    /* renamed from: d  reason: collision with root package name */
    public int f38697d = ApplicationPersistence.getInstance().getIntValue(Constants.NOTIFICATION_ASK_COUNT, 0);

    /* renamed from: e  reason: collision with root package name */
    public final int f38698e = ApplicationPersistence.getInstance().getIntValue(Constants.APP_SESSION_COUNT, 0);
    public int f = ApplicationPersistence.getInstance().getIntValue(Constants.NOTIFICATION_DIALOG_SHOW_COUNT, 0);

    /* renamed from: g  reason: collision with root package name */
    public int f38699g = ApplicationPersistence.getInstance().getIntValue(Constants.NOTIFICATION_DIALOG_DENY_COUNT, 0);

    /* renamed from: h  reason: collision with root package name */
    public int f38700h = ApplicationPersistence.getInstance().getIntValue(Constants.NOTIFICATION_DIALOG_DISMISS_COUNT, 0);

    public static boolean b() {
        if (Build.VERSION.SDK_INT >= 33 && g0.a.a(MyApplication.V.a(), "android.permission.POST_NOTIFICATIONS") != 0) {
            return false;
        }
        return true;
    }

    public static void d() {
        ej.b bVar;
        ej.b bVar2 = ej.b.f14047b;
        if (bVar2 == null) {
            synchronized (ej.b.class) {
                bVar = ej.b.f14047b;
                if (bVar == null) {
                    bVar = new ej.b();
                }
                ej.b.f14047b = bVar;
            }
            bVar2 = bVar;
        }
        bVar2.c(false, MyApplication.V.a());
    }

    public final f<Boolean, Boolean> a(boolean z10) {
        boolean z11 = false;
        int intValue = ApplicationPersistence.getInstance().getIntValue(Constants.APP_OPEN_DAY, 0);
        this.f38695b = intValue;
        if (intValue != this.f38696c) {
            this.f38697d = 0;
            ApplicationPersistence.getInstance().setIntValue(Constants.NOTIFICATION_ASK_COUNT, 0);
        }
        if (z10) {
            f();
            z11 = true;
        } else if (!MyApplication.V.a().I && this.f38700h <= 5) {
            int i6 = this.f38697d;
            if (i6 == 0 || ((this.f38695b == 1 && i6 < 3) || (this.f38698e == 2 && this.f38699g == 0))) {
                z11 = true;
            }
            if (z11) {
                f();
            }
        }
        if (z11 && this.f38699g >= 2) {
            return new f<>(Boolean.FALSE, Boolean.TRUE);
        }
        return new f<>(Boolean.valueOf(z11), Boolean.FALSE);
    }

    public final void c() {
        this.f38700h++;
        ApplicationPersistence.getInstance().setIntValue(Constants.NOTIFICATION_DIALOG_DISMISS_COUNT, this.f38700h);
    }

    public final void e() {
        this.f38699g++;
        ApplicationPersistence.getInstance().setIntValue(Constants.NOTIFICATION_DIALOG_DENY_COUNT, this.f38699g);
    }

    public final void f() {
        this.f38696c = this.f38695b;
        this.f38697d++;
        ApplicationPersistence.getInstance().setIntValue(Constants.NOTIFICATION_ASK_COUNT, this.f38697d);
        ApplicationPersistence.getInstance().setIntValue(Constants.NOTIFICATION_ASK_DAY, this.f38695b);
        MyApplication.V.a().I = true;
    }
}
