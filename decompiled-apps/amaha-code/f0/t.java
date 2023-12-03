package f0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.theinnerhour.b2b.R;
import java.util.ArrayList;
/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class t {
    public long B;
    public final boolean C;
    public final Notification D;
    public boolean E;
    @Deprecated
    public final ArrayList<String> F;

    /* renamed from: a  reason: collision with root package name */
    public final Context f14657a;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f14661e;
    public CharSequence f;

    /* renamed from: g  reason: collision with root package name */
    public PendingIntent f14662g;

    /* renamed from: h  reason: collision with root package name */
    public Bitmap f14663h;

    /* renamed from: i  reason: collision with root package name */
    public int f14664i;

    /* renamed from: j  reason: collision with root package name */
    public int f14665j;

    /* renamed from: l  reason: collision with root package name */
    public boolean f14667l;

    /* renamed from: m  reason: collision with root package name */
    public v f14668m;

    /* renamed from: n  reason: collision with root package name */
    public CharSequence f14669n;

    /* renamed from: o  reason: collision with root package name */
    public String f14670o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f14671p;
    public boolean r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f14673s;

    /* renamed from: t  reason: collision with root package name */
    public String f14674t;

    /* renamed from: u  reason: collision with root package name */
    public Bundle f14675u;

    /* renamed from: x  reason: collision with root package name */
    public RemoteViews f14678x;

    /* renamed from: y  reason: collision with root package name */
    public RemoteViews f14679y;

    /* renamed from: z  reason: collision with root package name */
    public String f14680z;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<o> f14658b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<b0> f14659c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<o> f14660d = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public boolean f14666k = true;

    /* renamed from: q  reason: collision with root package name */
    public boolean f14672q = false;

    /* renamed from: v  reason: collision with root package name */
    public int f14676v = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f14677w = 0;
    public int A = 0;

    public t(Context context, String str) {
        Notification notification = new Notification();
        this.D = notification;
        this.f14657a = context;
        this.f14680z = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f14665j = 0;
        this.F = new ArrayList<>();
        this.C = true;
    }

    public static CharSequence c(CharSequence charSequence) {
        if (charSequence == null) {
            return charSequence;
        }
        if (charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    public final void a(int i6, String str, PendingIntent pendingIntent) {
        this.f14658b.add(new o(i6, str, pendingIntent));
    }

    public final Notification b() {
        RemoteViews remoteViews;
        Notification notification;
        Bundle bundle;
        RemoteViews f;
        w wVar = new w(this);
        t tVar = wVar.f14687c;
        v vVar = tVar.f14668m;
        if (vVar != null) {
            vVar.b(wVar);
        }
        if (vVar != null) {
            remoteViews = vVar.g();
        } else {
            remoteViews = null;
        }
        int i6 = Build.VERSION.SDK_INT;
        Notification.Builder builder = wVar.f14686b;
        if (i6 >= 26) {
            notification = builder.build();
        } else {
            int i10 = wVar.f14690g;
            if (i6 >= 24) {
                notification = builder.build();
                if (i10 != 0) {
                    if (notification.getGroup() != null && (notification.flags & 512) != 0 && i10 == 2) {
                        w.a(notification);
                    }
                    if (notification.getGroup() != null && (notification.flags & 512) == 0 && i10 == 1) {
                        w.a(notification);
                    }
                }
            } else {
                builder.setExtras(wVar.f);
                Notification build = builder.build();
                RemoteViews remoteViews2 = wVar.f14688d;
                if (remoteViews2 != null) {
                    build.contentView = remoteViews2;
                }
                RemoteViews remoteViews3 = wVar.f14689e;
                if (remoteViews3 != null) {
                    build.bigContentView = remoteViews3;
                }
                if (i10 != 0) {
                    if (build.getGroup() != null && (build.flags & 512) != 0 && i10 == 2) {
                        w.a(build);
                    }
                    if (build.getGroup() != null && (build.flags & 512) == 0 && i10 == 1) {
                        w.a(build);
                    }
                }
                notification = build;
            }
        }
        if (remoteViews != null) {
            notification.contentView = remoteViews;
        } else {
            RemoteViews remoteViews4 = tVar.f14678x;
            if (remoteViews4 != null) {
                notification.contentView = remoteViews4;
            }
        }
        if (vVar != null && (f = vVar.f()) != null) {
            notification.bigContentView = f;
        }
        if (vVar != null) {
            tVar.f14668m.h();
        }
        if (vVar != null && (bundle = notification.extras) != null) {
            vVar.a(bundle);
        }
        return notification;
    }

    public final void d(CharSequence charSequence) {
        this.f = c(charSequence);
    }

    public final void e(CharSequence charSequence) {
        this.f14661e = c(charSequence);
    }

    public final void f(int i6) {
        Notification notification = this.D;
        notification.defaults = i6;
        if ((i6 & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void g(int i6, boolean z10) {
        Notification notification = this.D;
        if (z10) {
            notification.flags = i6 | notification.flags;
            return;
        }
        notification.flags = (~i6) & notification.flags;
    }

    public final void h(Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT < 27) {
            Resources resources = this.f14657a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
            }
        }
        this.f14663h = bitmap;
    }

    public final void i(Uri uri) {
        Notification notification = this.D;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
    }

    public final void j(v vVar) {
        if (this.f14668m != vVar) {
            this.f14668m = vVar;
            if (vVar != null) {
                vVar.i(this);
            }
        }
    }

    public final void k(CharSequence charSequence) {
        this.f14669n = c(charSequence);
    }

    public final void l(CharSequence charSequence) {
        this.D.tickerText = c(charSequence);
    }
}
