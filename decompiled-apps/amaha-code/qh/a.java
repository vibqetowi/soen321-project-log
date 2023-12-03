package qh;

import kotlin.jvm.internal.i;
import r1.b0;
/* compiled from: SdkIdentifiers.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29589a;

    /* renamed from: b  reason: collision with root package name */
    public final String f29590b;

    /* renamed from: c  reason: collision with root package name */
    public final String f29591c;

    /* renamed from: d  reason: collision with root package name */
    public final String f29592d;

    public a(String title, String message, String str, int i6) {
        this.f29589a = i6;
        if (i6 != 1) {
            if (i6 != 2) {
                this.f29590b = title;
                this.f29591c = message;
                this.f29592d = str;
                return;
            }
            i.g(title, "title");
            i.g(message, "message");
            this.f29590b = title;
            this.f29591c = message;
            this.f29592d = str;
            return;
        }
        i.g(title, "title");
        i.g(message, "message");
        this.f29590b = title;
        this.f29591c = message;
        this.f29592d = str;
    }

    public final String toString() {
        int i6 = this.f29589a;
        String str = this.f29592d;
        String str2 = this.f29591c;
        String str3 = this.f29590b;
        switch (i6) {
            case 1:
                StringBuilder sb2 = new StringBuilder("NotificationText(title='");
                sb2.append(str3);
                sb2.append("', message='");
                sb2.append(str2);
                sb2.append("', summary='");
                return b0.b(sb2, str, "')");
            case 2:
                StringBuilder sb3 = new StringBuilder("DefaultText(title='");
                sb3.append(str3);
                sb3.append("', message='");
                sb3.append(str2);
                sb3.append("', summary='");
                return b0.b(sb3, str, "')");
            default:
                return super.toString();
        }
    }
}
