package f0;

import android.app.Notification;
import android.os.Bundle;
/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class s extends v {

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f14656e;

    @Override // f0.v
    public final void a(Bundle bundle) {
        super.a(bundle);
    }

    @Override // f0.v
    public final void b(w wVar) {
        Notification.BigTextStyle bigText = new Notification.BigTextStyle(wVar.f14686b).setBigContentTitle(this.f14682b).bigText(this.f14656e);
        if (this.f14684d) {
            bigText.setSummaryText(this.f14683c);
        }
    }

    @Override // f0.v
    public final String e() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    public final void j(CharSequence charSequence) {
        this.f14656e = t.c(charSequence);
    }
}
