package f0;

import android.app.Notification;
import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.theinnerhour.b2b.R;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class u extends v {
    @Override // f0.v
    public final void b(w wVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            wVar.f14686b.setStyle(new Notification.DecoratedCustomViewStyle());
        }
    }

    @Override // f0.v
    public final String e() {
        return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
    }

    @Override // f0.v
    public final RemoteViews f() {
        if (Build.VERSION.SDK_INT >= 24) {
            return null;
        }
        t tVar = this.f14681a;
        RemoteViews remoteViews = tVar.f14679y;
        if (remoteViews == null) {
            remoteViews = tVar.f14678x;
        }
        if (remoteViews == null) {
            return null;
        }
        return j(remoteViews, true);
    }

    @Override // f0.v
    public final RemoteViews g() {
        RemoteViews remoteViews;
        if (Build.VERSION.SDK_INT >= 24 || (remoteViews = this.f14681a.f14678x) == null) {
            return null;
        }
        return j(remoteViews, false);
    }

    @Override // f0.v
    public final void h() {
        if (Build.VERSION.SDK_INT >= 24) {
            return;
        }
        this.f14681a.getClass();
        RemoteViews remoteViews = this.f14681a.f14678x;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RemoteViews j(RemoteViews remoteViews, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        t tVar;
        long j10;
        int i6;
        int i10;
        ArrayList<o> arrayList;
        ArrayList arrayList2;
        boolean z15;
        int i11;
        float f;
        int min;
        boolean z16;
        int i12;
        Resources resources = this.f14681a.f14657a.getResources();
        RemoteViews remoteViews2 = new RemoteViews(this.f14681a.f14657a.getPackageName(), (int) R.layout.notification_template_custom_big);
        t tVar2 = this.f14681a;
        int i13 = tVar2.f14665j;
        if (tVar2.f14663h != null) {
            remoteViews2.setViewVisibility(R.id.icon, 0);
            remoteViews2.setImageViewBitmap(R.id.icon, this.f14681a.f14663h);
            if (this.f14681a.D.icon != 0) {
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_right_icon_size);
                t tVar3 = this.f14681a;
                remoteViews2.setImageViewBitmap(R.id.right_icon, d(tVar3.D.icon, dimensionPixelSize, dimensionPixelSize - (resources.getDimensionPixelSize(R.dimen.notification_small_icon_background_padding) * 2), tVar3.f14676v));
                remoteViews2.setViewVisibility(R.id.right_icon, 0);
            }
        } else if (tVar2.D.icon != 0) {
            remoteViews2.setViewVisibility(R.id.icon, 0);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.notification_large_icon_width) - resources.getDimensionPixelSize(R.dimen.notification_big_circle_margin);
            int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.notification_small_icon_size_as_large);
            t tVar4 = this.f14681a;
            remoteViews2.setImageViewBitmap(R.id.icon, d(tVar4.D.icon, dimensionPixelSize2, dimensionPixelSize3, tVar4.f14676v));
        }
        CharSequence charSequence = this.f14681a.f14661e;
        if (charSequence != null) {
            remoteViews2.setTextViewText(R.id.title, charSequence);
        }
        CharSequence charSequence2 = this.f14681a.f;
        if (charSequence2 != null) {
            remoteViews2.setTextViewText(R.id.text, charSequence2);
            z11 = true;
        } else {
            z11 = false;
        }
        this.f14681a.getClass();
        if (this.f14681a.f14664i > 0) {
            if (this.f14681a.f14664i > resources.getInteger(R.integer.status_bar_notification_info_maxnum)) {
                remoteViews2.setTextViewText(R.id.info, resources.getString(R.string.status_bar_notification_info_overflow));
            } else {
                remoteViews2.setTextViewText(R.id.info, NumberFormat.getIntegerInstance().format(this.f14681a.f14664i));
            }
            remoteViews2.setViewVisibility(R.id.info, 0);
            z12 = true;
            z13 = true;
        } else {
            remoteViews2.setViewVisibility(R.id.info, 8);
            z12 = z11;
            z13 = false;
        }
        CharSequence charSequence3 = this.f14681a.f14669n;
        if (charSequence3 != null) {
            remoteViews2.setTextViewText(R.id.text, charSequence3);
            CharSequence charSequence4 = this.f14681a.f;
            if (charSequence4 != null) {
                remoteViews2.setTextViewText(R.id.text2, charSequence4);
                remoteViews2.setViewVisibility(R.id.text2, 0);
                z14 = true;
                if (z14) {
                    remoteViews2.setViewPadding(R.id.line1, 0, 0, 0, 0);
                }
                tVar = this.f14681a;
                long j11 = 0;
                if (!tVar.f14666k) {
                    j10 = tVar.D.when;
                } else {
                    j10 = 0;
                }
                if (j10 != 0) {
                    if (tVar.f14667l) {
                        remoteViews2.setViewVisibility(R.id.chronometer, 0);
                        t tVar5 = this.f14681a;
                        if (tVar5.f14666k) {
                            j11 = tVar5.D.when;
                        }
                        remoteViews2.setLong(R.id.chronometer, "setBase", (SystemClock.elapsedRealtime() - System.currentTimeMillis()) + j11);
                        remoteViews2.setBoolean(R.id.chronometer, "setStarted", true);
                        this.f14681a.getClass();
                    } else {
                        remoteViews2.setViewVisibility(R.id.time, 0);
                        t tVar6 = this.f14681a;
                        if (tVar6.f14666k) {
                            j11 = tVar6.D.when;
                        }
                        remoteViews2.setLong(R.id.time, "setTime", j11);
                    }
                    z13 = true;
                }
                if (!z13) {
                    i6 = 0;
                } else {
                    i6 = 8;
                }
                remoteViews2.setViewVisibility(R.id.right_side, i6);
                if (!z12) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                remoteViews2.setViewVisibility(R.id.line3, i10);
                remoteViews2.removeAllViews(R.id.actions);
                arrayList = this.f14681a.f14658b;
                if (arrayList != null) {
                    arrayList2 = null;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<o> it = arrayList.iterator();
                    while (it.hasNext()) {
                        o next = it.next();
                        if (!next.f14649g) {
                            arrayList3.add(next);
                        }
                    }
                    arrayList2 = arrayList3;
                }
                if (!z10 && arrayList2 != null && (min = Math.min(arrayList2.size(), 3)) > 0) {
                    for (int i14 = 0; i14 < min; i14++) {
                        o oVar = (o) arrayList2.get(i14);
                        if (oVar.f14652j == null) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        String packageName = this.f14681a.f14657a.getPackageName();
                        if (z16) {
                            i12 = R.layout.notification_action_tombstone;
                        } else {
                            i12 = R.layout.notification_action;
                        }
                        RemoteViews remoteViews3 = new RemoteViews(packageName, i12);
                        IconCompat a10 = oVar.a();
                        if (a10 != null) {
                            remoteViews3.setImageViewBitmap(R.id.action_image, c(a10, this.f14681a.f14657a.getResources().getColor(R.color.notification_action_color_filter), 0));
                        }
                        CharSequence charSequence5 = oVar.f14651i;
                        remoteViews3.setTextViewText(R.id.action_text, charSequence5);
                        if (!z16) {
                            remoteViews3.setOnClickPendingIntent(R.id.action_container, oVar.f14652j);
                        }
                        remoteViews3.setContentDescription(R.id.action_container, charSequence5);
                        remoteViews2.addView(R.id.actions, remoteViews3);
                    }
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (!z15) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                remoteViews2.setViewVisibility(R.id.actions, i11);
                remoteViews2.setViewVisibility(R.id.action_divider, i11);
                remoteViews2.setViewVisibility(R.id.title, 8);
                remoteViews2.setViewVisibility(R.id.text2, 8);
                remoteViews2.setViewVisibility(R.id.text, 8);
                remoteViews2.removeAllViews(R.id.notification_main_column);
                remoteViews2.addView(R.id.notification_main_column, remoteViews.clone());
                remoteViews2.setViewVisibility(R.id.notification_main_column, 0);
                Resources resources2 = this.f14681a.f14657a.getResources();
                int dimensionPixelSize4 = resources2.getDimensionPixelSize(R.dimen.notification_top_pad);
                int dimensionPixelSize5 = resources2.getDimensionPixelSize(R.dimen.notification_top_pad_large_text);
                f = resources2.getConfiguration().fontScale;
                if (f >= 1.0f) {
                    f = 1.0f;
                } else if (f > 1.3f) {
                    f = 1.3f;
                }
                float f2 = (f - 1.0f) / 0.29999995f;
                remoteViews2.setViewPadding(R.id.notification_main_column_container, 0, Math.round((f2 * dimensionPixelSize5) + ((1.0f - f2) * dimensionPixelSize4)), 0, 0);
                return remoteViews2;
            }
            remoteViews2.setViewVisibility(R.id.text2, 8);
        }
        z14 = false;
        if (z14) {
        }
        tVar = this.f14681a;
        long j112 = 0;
        if (!tVar.f14666k) {
        }
        if (j10 != 0) {
        }
        if (!z13) {
        }
        remoteViews2.setViewVisibility(R.id.right_side, i6);
        if (!z12) {
        }
        remoteViews2.setViewVisibility(R.id.line3, i10);
        remoteViews2.removeAllViews(R.id.actions);
        arrayList = this.f14681a.f14658b;
        if (arrayList != null) {
        }
        if (!z10) {
        }
        z15 = false;
        if (!z15) {
        }
        remoteViews2.setViewVisibility(R.id.actions, i11);
        remoteViews2.setViewVisibility(R.id.action_divider, i11);
        remoteViews2.setViewVisibility(R.id.title, 8);
        remoteViews2.setViewVisibility(R.id.text2, 8);
        remoteViews2.setViewVisibility(R.id.text, 8);
        remoteViews2.removeAllViews(R.id.notification_main_column);
        remoteViews2.addView(R.id.notification_main_column, remoteViews.clone());
        remoteViews2.setViewVisibility(R.id.notification_main_column, 0);
        Resources resources22 = this.f14681a.f14657a.getResources();
        int dimensionPixelSize42 = resources22.getDimensionPixelSize(R.dimen.notification_top_pad);
        int dimensionPixelSize52 = resources22.getDimensionPixelSize(R.dimen.notification_top_pad_large_text);
        f = resources22.getConfiguration().fontScale;
        if (f >= 1.0f) {
        }
        float f22 = (f - 1.0f) / 0.29999995f;
        remoteViews2.setViewPadding(R.id.notification_main_column_container, 0, Math.round((f22 * dimensionPixelSize52) + ((1.0f - f22) * dimensionPixelSize42)), 0, 0);
        return remoteViews2;
    }
}
