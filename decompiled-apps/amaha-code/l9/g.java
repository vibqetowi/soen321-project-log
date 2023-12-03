package l9;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public final Context f24179a;

    /* renamed from: b  reason: collision with root package name */
    public final String f24180b;

    /* renamed from: c  reason: collision with root package name */
    public final w f24181c = new w(this);

    public g(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        v9.o.h(context);
        this.f24179a = context.getApplicationContext();
        v9.o.e(str);
        this.f24180b = str;
    }

    @RecentlyNullable
    public abstract c a(@RecentlyNonNull String str);

    public abstract boolean b();
}
