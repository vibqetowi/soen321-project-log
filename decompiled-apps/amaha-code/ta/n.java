package ta;

import android.accounts.AccountManager;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class n extends e4 {
    public long A;

    /* renamed from: w  reason: collision with root package name */
    public long f32754w;

    /* renamed from: x  reason: collision with root package name */
    public String f32755x;

    /* renamed from: y  reason: collision with root package name */
    public AccountManager f32756y;

    /* renamed from: z  reason: collision with root package name */
    public Boolean f32757z;

    public n(y3 y3Var) {
        super(y3Var);
    }

    @Override // ta.e4
    public final boolean i() {
        Calendar calendar = Calendar.getInstance();
        this.f32754w = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f32755x = defpackage.d.f(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }

    public final long l() {
        h();
        return this.A;
    }

    public final long m() {
        j();
        return this.f32754w;
    }

    public final String n() {
        j();
        return this.f32755x;
    }
}
