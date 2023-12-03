package f0;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import f0.b0;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: NotificationCompatBuilder.java */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final Context f14685a;

    /* renamed from: b  reason: collision with root package name */
    public final Notification.Builder f14686b;

    /* renamed from: c  reason: collision with root package name */
    public final t f14687c;

    /* renamed from: d  reason: collision with root package name */
    public final RemoteViews f14688d;

    /* renamed from: e  reason: collision with root package name */
    public final RemoteViews f14689e;
    public final Bundle f;

    /* renamed from: g  reason: collision with root package name */
    public final int f14690g;

    public w(t tVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        String str;
        Notification notification;
        ArrayList<b0> arrayList;
        int i6;
        Bundle bundle;
        ArrayList<o> arrayList2;
        Notification notification2;
        String str2;
        ArrayList<b0> arrayList3;
        Bundle[] bundleArr;
        CharSequence charSequence;
        Notification.Action.Builder builder;
        int i10;
        Bundle bundle2;
        Icon icon;
        w wVar = this;
        new ArrayList();
        wVar.f = new Bundle();
        wVar.f14687c = tVar;
        Context context = tVar.f14657a;
        wVar.f14685a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            wVar.f14686b = new Notification.Builder(context, tVar.f14680z);
        } else {
            wVar.f14686b = new Notification.Builder(context);
        }
        Notification notification3 = tVar.D;
        ArrayList<String> arrayList4 = null;
        Notification.Builder lights = wVar.f14686b.setWhen(notification3.when).setSmallIcon(notification3.icon, notification3.iconLevel).setContent(notification3.contentView).setTicker(notification3.tickerText, null).setVibrate(notification3.vibrate).setLights(notification3.ledARGB, notification3.ledOnMS, notification3.ledOffMS);
        if ((notification3.flags & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z10);
        if ((notification3.flags & 8) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z11);
        if ((notification3.flags & 16) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z12).setDefaults(notification3.defaults).setContentTitle(tVar.f14661e).setContentText(tVar.f).setContentInfo(null).setContentIntent(tVar.f14662g).setDeleteIntent(notification3.deleteIntent);
        if ((notification3.flags & 128) != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        deleteIntent.setFullScreenIntent(null, z13).setLargeIcon(tVar.f14663h).setNumber(tVar.f14664i).setProgress(0, 0, false);
        wVar.f14686b.setSubText(tVar.f14669n).setUsesChronometer(tVar.f14667l).setPriority(tVar.f14665j);
        Iterator<o> it = tVar.f14658b.iterator();
        while (true) {
            str = "android.support.allowGeneratedReplies";
            if (!it.hasNext()) {
                break;
            }
            o next = it.next();
            int i11 = Build.VERSION.SDK_INT;
            IconCompat a10 = next.a();
            PendingIntent pendingIntent = next.f14652j;
            CharSequence charSequence2 = next.f14651i;
            if (i11 >= 23) {
                if (a10 != null) {
                    icon = a10.j(null);
                } else {
                    icon = null;
                }
                builder = new Notification.Action.Builder(icon, charSequence2, pendingIntent);
            } else {
                if (a10 != null) {
                    i10 = a10.d();
                } else {
                    i10 = 0;
                }
                builder = new Notification.Action.Builder(i10, charSequence2, pendingIntent);
            }
            d0[] d0VarArr = next.f14646c;
            if (d0VarArr != null) {
                int length = d0VarArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                for (int i12 = 0; i12 < d0VarArr.length; i12++) {
                    remoteInputArr[i12] = d0.a(d0VarArr[i12]);
                }
                for (int i13 = 0; i13 < length; i13++) {
                    builder.addRemoteInput(remoteInputArr[i13]);
                }
            }
            Bundle bundle3 = next.f14644a;
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            boolean z14 = next.f14647d;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z14);
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 24) {
                builder.setAllowGeneratedReplies(z14);
            }
            int i15 = next.f;
            bundle2.putInt("android.support.action.semanticAction", i15);
            if (i14 >= 28) {
                builder.setSemanticAction(i15);
            }
            if (i14 >= 29) {
                builder.setContextual(next.f14649g);
            }
            if (i14 >= 31) {
                builder.setAuthenticationRequired(next.f14653k);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", next.f14648e);
            builder.addExtras(bundle2);
            wVar.f14686b.addAction(builder.build());
        }
        Bundle bundle4 = tVar.f14675u;
        if (bundle4 != null) {
            wVar.f.putAll(bundle4);
        }
        int i16 = Build.VERSION.SDK_INT;
        wVar.f14688d = tVar.f14678x;
        wVar.f14689e = tVar.f14679y;
        wVar.f14686b.setShowWhen(tVar.f14666k);
        wVar.f14686b.setLocalOnly(tVar.f14672q).setGroup(tVar.f14670o).setGroupSummary(tVar.f14671p).setSortKey(null);
        wVar.f14690g = 0;
        wVar.f14686b.setCategory(tVar.f14674t).setColor(tVar.f14676v).setVisibility(tVar.f14677w).setPublicVersion(null).setSound(notification3.sound, notification3.audioAttributes);
        ArrayList<b0> arrayList5 = tVar.f14659c;
        ArrayList<String> arrayList6 = tVar.F;
        if (i16 < 28) {
            if (arrayList5 != null) {
                arrayList4 = new ArrayList<>(arrayList5.size());
                Iterator<b0> it2 = arrayList5.iterator();
                while (it2.hasNext()) {
                    b0 next2 = it2.next();
                    String str3 = next2.f14606c;
                    if (str3 == null) {
                        if (next2.f14604a != null) {
                            str3 = "name:" + ((Object) charSequence);
                        } else {
                            str3 = "";
                        }
                    }
                    arrayList4.add(str3);
                }
            }
            if (arrayList4 != null) {
                if (arrayList6 != null) {
                    t.d dVar = new t.d(arrayList6.size() + arrayList4.size());
                    dVar.addAll(arrayList4);
                    dVar.addAll(arrayList6);
                    arrayList4 = new ArrayList<>(dVar);
                }
                arrayList6 = arrayList4;
            }
        }
        if (arrayList6 != null && !arrayList6.isEmpty()) {
            for (String str4 : arrayList6) {
                wVar.f14686b.addPerson(str4);
            }
        }
        ArrayList<o> arrayList7 = tVar.f14660d;
        if (arrayList7.size() > 0) {
            if (tVar.f14675u == null) {
                tVar.f14675u = new Bundle();
            }
            Bundle bundle5 = tVar.f14675u.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i17 = 0;
            while (i17 < arrayList7.size()) {
                String num = Integer.toString(i17);
                o oVar = arrayList7.get(i17);
                Object obj = x.f14691a;
                Bundle bundle8 = new Bundle();
                IconCompat a11 = oVar.a();
                if (a11 != null) {
                    i6 = a11.d();
                } else {
                    i6 = 0;
                }
                bundle8.putInt("icon", i6);
                bundle8.putCharSequence("title", oVar.f14651i);
                bundle8.putParcelable("actionIntent", oVar.f14652j);
                Bundle bundle9 = oVar.f14644a;
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean(str, oVar.f14647d);
                bundle8.putBundle("extras", bundle);
                d0[] d0VarArr2 = oVar.f14646c;
                if (d0VarArr2 == null) {
                    bundleArr = null;
                    notification2 = notification3;
                    arrayList2 = arrayList7;
                    arrayList3 = arrayList5;
                    str2 = str;
                } else {
                    arrayList2 = arrayList7;
                    Bundle[] bundleArr2 = new Bundle[d0VarArr2.length];
                    notification2 = notification3;
                    str2 = str;
                    int i18 = 0;
                    while (i18 < d0VarArr2.length) {
                        d0 d0Var = d0VarArr2[i18];
                        d0[] d0VarArr3 = d0VarArr2;
                        Bundle bundle10 = new Bundle();
                        d0Var.getClass();
                        bundle10.putString("resultKey", null);
                        bundle10.putCharSequence("label", null);
                        bundle10.putCharSequenceArray("choices", null);
                        bundle10.putBoolean("allowFreeFormInput", false);
                        bundle10.putBundle("extras", null);
                        bundleArr2[i18] = bundle10;
                        i18++;
                        d0VarArr2 = d0VarArr3;
                        arrayList5 = arrayList5;
                    }
                    arrayList3 = arrayList5;
                    bundleArr = bundleArr2;
                }
                bundle8.putParcelableArray("remoteInputs", bundleArr);
                bundle8.putBoolean("showsUserInterface", oVar.f14648e);
                bundle8.putInt("semanticAction", oVar.f);
                bundle7.putBundle(num, bundle8);
                i17++;
                arrayList7 = arrayList2;
                notification3 = notification2;
                str = str2;
                arrayList5 = arrayList3;
            }
            notification = notification3;
            arrayList = arrayList5;
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (tVar.f14675u == null) {
                tVar.f14675u = new Bundle();
            }
            tVar.f14675u.putBundle("android.car.EXTENSIONS", bundle5);
            wVar = this;
            wVar.f.putBundle("android.car.EXTENSIONS", bundle6);
        } else {
            notification = notification3;
            arrayList = arrayList5;
        }
        int i19 = Build.VERSION.SDK_INT;
        if (i19 >= 24) {
            wVar.f14686b.setExtras(tVar.f14675u).setRemoteInputHistory(null);
            RemoteViews remoteViews = tVar.f14678x;
            if (remoteViews != null) {
                wVar.f14686b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = tVar.f14679y;
            if (remoteViews2 != null) {
                wVar.f14686b.setCustomBigContentView(remoteViews2);
            }
        }
        if (i19 >= 26) {
            wVar.f14686b.setBadgeIconType(tVar.A).setSettingsText(null).setShortcutId(null).setTimeoutAfter(tVar.B).setGroupAlertBehavior(0);
            if (tVar.f14673s) {
                wVar.f14686b.setColorized(tVar.r);
            }
            if (!TextUtils.isEmpty(tVar.f14680z)) {
                wVar.f14686b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i19 >= 28) {
            Iterator<b0> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                b0 next3 = it3.next();
                Notification.Builder builder2 = wVar.f14686b;
                next3.getClass();
                builder2.addPerson(b0.a.b(next3));
            }
        }
        int i20 = Build.VERSION.SDK_INT;
        if (i20 >= 29) {
            wVar.f14686b.setAllowSystemGeneratedContextualActions(tVar.C);
            wVar.f14686b.setBubbleMetadata(null);
        }
        if (tVar.E) {
            if (wVar.f14687c.f14671p) {
                wVar.f14690g = 2;
            } else {
                wVar.f14690g = 1;
            }
            wVar.f14686b.setVibrate(null);
            wVar.f14686b.setSound(null);
            Notification notification4 = notification;
            int i21 = notification4.defaults & (-2) & (-3);
            notification4.defaults = i21;
            wVar.f14686b.setDefaults(i21);
            if (i20 >= 26) {
                if (TextUtils.isEmpty(wVar.f14687c.f14670o)) {
                    wVar.f14686b.setGroup("silent");
                }
                wVar.f14686b.setGroupAlertBehavior(wVar.f14690g);
            }
        }
    }

    public static void a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & (-2) & (-3);
    }
}
