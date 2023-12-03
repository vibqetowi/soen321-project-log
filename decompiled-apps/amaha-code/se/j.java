package se;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* compiled from: Utils.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final long f31487b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f31488c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d  reason: collision with root package name */
    public static j f31489d;

    /* renamed from: a  reason: collision with root package name */
    public final df.b f31490a;

    public j(df.b bVar) {
        this.f31490a = bVar;
    }

    public static j a() {
        if (df.b.A == null) {
            df.b.A = new df.b(16);
        }
        df.b bVar = df.b.A;
        if (f31489d == null) {
            f31489d = new j(bVar);
        }
        return f31489d;
    }

    public final boolean b(ue.a aVar) {
        if (TextUtils.isEmpty(aVar.f34028d)) {
            return true;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f31490a.getClass();
        if (aVar.f + aVar.f34030g < timeUnit.toSeconds(System.currentTimeMillis()) + f31487b) {
            return true;
        }
        return false;
    }
}
