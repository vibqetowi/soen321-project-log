package s9;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.internal.c1;
import com.theinnerhour.b2b.R;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f31336c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final e f31337d = new e();

    public static AlertDialog e(Context context, int i6, v9.y yVar, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        AlertDialog.Builder builder = null;
        if (i6 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(v9.v.b(i6, context));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = context.getResources();
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    string = resources.getString(17039370);
                } else {
                    string = resources.getString(R.string.common_google_play_services_enable_button);
                }
            } else {
                string = resources.getString(R.string.common_google_play_services_update_button);
            }
        } else {
            string = resources.getString(R.string.common_google_play_services_install_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, yVar);
        }
        String c10 = v9.v.c(i6, context);
        if (c10 != null) {
            builder.setTitle(c10);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i6)), new IllegalArgumentException());
        return builder.create();
    }

    public static void f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof androidx.fragment.app.p) {
                androidx.fragment.app.y supportFragmentManager = ((androidx.fragment.app.p) activity).getSupportFragmentManager();
                j jVar = new j();
                if (alertDialog != null) {
                    alertDialog.setOnCancelListener(null);
                    alertDialog.setOnDismissListener(null);
                    jVar.f31348u = alertDialog;
                    if (onCancelListener != null) {
                        jVar.f31349v = onCancelListener;
                    }
                    jVar.show(supportFragmentManager, str);
                    return;
                }
                throw new NullPointerException("Cannot display null dialog");
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        if (alertDialog != null) {
            alertDialog.setOnCancelListener(null);
            alertDialog.setOnDismissListener(null);
            cVar.f31330u = alertDialog;
            if (onCancelListener != null) {
                cVar.f31331v = onCancelListener;
            }
            cVar.show(fragmentManager, str);
            return;
        }
        throw new NullPointerException("Cannot display null dialog");
    }

    @Override // s9.f
    public final Intent a(Context context, String str, int i6) {
        return super.a(context, str, i6);
    }

    @Override // s9.f
    public final int b(int i6, Context context) {
        return super.b(i6, context);
    }

    public final int c(Context context) {
        return b(f.f31338a, context);
    }

    public final void d(Activity activity, int i6, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog e10 = e(activity, i6, new v9.w(activity, super.a(activity, "d", i6)), onCancelListener);
        if (e10 == null) {
            return;
        }
        f(activity, e10, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void g(Context context, int i6, PendingIntent pendingIntent) {
        String c10;
        String d10;
        int i10;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i6), null), new IllegalArgumentException());
        if (i6 == 18) {
            new k(this, context).sendEmptyMessageDelayed(1, 120000L);
        } else if (pendingIntent == null) {
            if (i6 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        } else {
            if (i6 == 6) {
                c10 = v9.v.e(context, "common_google_play_services_resolution_required_title");
            } else {
                c10 = v9.v.c(i6, context);
            }
            if (c10 == null) {
                c10 = context.getResources().getString(R.string.common_google_play_services_notification_ticker);
            }
            if (i6 != 6 && i6 != 19) {
                d10 = v9.v.b(i6, context);
            } else {
                d10 = v9.v.d(context, "common_google_play_services_resolution_required_text", v9.v.a(context));
            }
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            v9.o.h(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            f0.t tVar = new f0.t(context, null);
            tVar.f14672q = true;
            tVar.g(16, true);
            tVar.e(c10);
            f0.s sVar = new f0.s();
            sVar.j(d10);
            tVar.j(sVar);
            PackageManager packageManager = context.getPackageManager();
            if (aa.d.f441a == null) {
                aa.d.f441a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            }
            if (aa.d.f441a.booleanValue()) {
                tVar.D.icon = context.getApplicationInfo().icon;
                tVar.f14665j = 2;
                if (aa.d.a(context)) {
                    tVar.a(R.drawable.common_full_open_on_phone, resources.getString(R.string.common_open_on_phone), pendingIntent);
                } else {
                    tVar.f14662g = pendingIntent;
                }
            } else {
                tVar.D.icon = 17301642;
                tVar.l(resources.getString(R.string.common_google_play_services_notification_ticker));
                tVar.D.when = System.currentTimeMillis();
                tVar.f14662g = pendingIntent;
                tVar.d(d10);
            }
            if (aa.g.a()) {
                if (aa.g.a()) {
                    synchronized (f31336c) {
                    }
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                    String string = context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
                    } else if (!string.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(string);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                    tVar.f14680z = "com.google.android.gms.availability";
                } else {
                    throw new IllegalStateException();
                }
            }
            Notification b10 = tVar.b();
            if (i6 != 1 && i6 != 2 && i6 != 3) {
                i10 = 39789;
            } else {
                h.f31341a.set(false);
                i10 = 10436;
            }
            notificationManager.notify(i10, b10);
        }
    }

    public final void h(Activity activity, com.google.android.gms.common.api.internal.h hVar, int i6, c1 c1Var) {
        AlertDialog e10 = e(activity, i6, new v9.x(super.a(activity, "d", i6), hVar), c1Var);
        if (e10 == null) {
            return;
        }
        f(activity, e10, "GooglePlayServicesErrorDialog", c1Var);
    }
}
