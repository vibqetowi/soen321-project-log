package f0;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class p extends v {

    /* renamed from: e  reason: collision with root package name */
    public IconCompat f14654e;
    public IconCompat f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f14655g;

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
            bigPictureStyle.bigLargeIcon(bitmap);
        }

        public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
            bigPictureStyle.setSummaryText(charSequence);
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigLargeIcon(icon);
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class c {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigPicture(icon);
        }

        public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
            bigPictureStyle.setContentDescription(charSequence);
        }

        public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
            bigPictureStyle.showBigPictureWhenCollapsed(z10);
        }
    }

    @Override // f0.v
    public final void b(w wVar) {
        int i6 = Build.VERSION.SDK_INT;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(wVar.f14686b).setBigContentTitle(this.f14682b);
        IconCompat iconCompat = this.f14654e;
        Context context = wVar.f14685a;
        if (iconCompat != null) {
            if (i6 >= 31) {
                c.a(bigContentTitle, iconCompat.j(context));
            } else if (iconCompat.g() == 1) {
                bigContentTitle = bigContentTitle.bigPicture(this.f14654e.c());
            }
        }
        if (this.f14655g) {
            IconCompat iconCompat2 = this.f;
            if (iconCompat2 == null) {
                a.a(bigContentTitle, null);
            } else if (i6 >= 23) {
                b.a(bigContentTitle, iconCompat2.j(context));
            } else if (iconCompat2.g() == 1) {
                a.a(bigContentTitle, this.f.c());
            } else {
                a.a(bigContentTitle, null);
            }
        }
        if (this.f14684d) {
            a.b(bigContentTitle, this.f14683c);
        }
        if (i6 >= 31) {
            c.c(bigContentTitle, false);
            c.b(bigContentTitle, null);
        }
    }

    @Override // f0.v
    public final String e() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
