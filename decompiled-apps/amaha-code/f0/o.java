package f0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f14644a;

    /* renamed from: b  reason: collision with root package name */
    public IconCompat f14645b;

    /* renamed from: c  reason: collision with root package name */
    public final d0[] f14646c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f14647d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f14648e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f14649g;
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    public final int f14650h;

    /* renamed from: i  reason: collision with root package name */
    public final CharSequence f14651i;

    /* renamed from: j  reason: collision with root package name */
    public final PendingIntent f14652j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f14653k;

    public o(int i6, String str, PendingIntent pendingIntent) {
        this(i6 != 0 ? IconCompat.b(null, "", i6) : null, str, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
    }

    public final IconCompat a() {
        int i6;
        if (this.f14645b == null && (i6 = this.f14650h) != 0) {
            this.f14645b = IconCompat.b(null, "", i6);
        }
        return this.f14645b;
    }

    public o(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, d0[] d0VarArr, d0[] d0VarArr2, boolean z10, int i6, boolean z11, boolean z12, boolean z13) {
        this.f14648e = true;
        this.f14645b = iconCompat;
        if (iconCompat != null && iconCompat.g() == 2) {
            this.f14650h = iconCompat.d();
        }
        this.f14651i = t.c(charSequence);
        this.f14652j = pendingIntent;
        this.f14644a = bundle == null ? new Bundle() : bundle;
        this.f14646c = d0VarArr;
        this.f14647d = z10;
        this.f = i6;
        this.f14648e = z11;
        this.f14649g = z12;
        this.f14653k = z13;
    }
}
