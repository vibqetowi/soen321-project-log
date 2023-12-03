package p9;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class b {
    @RecentlyNonNull

    /* renamed from: a  reason: collision with root package name */
    public final String f28035a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f28036b;

    /* renamed from: c  reason: collision with root package name */
    public String f28037c;

    public b(@RecentlyNonNull String str) {
        boolean z10;
        v9.o.f("The log tag cannot be null or empty.", str);
        this.f28035a = str;
        if (str.length() <= 23) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28036b = z10;
    }

    public final void a(@RecentlyNonNull String str, @RecentlyNonNull Exception exc, @RecentlyNonNull Object... objArr) {
        boolean z10;
        String str2 = this.f28035a;
        if (this.f28036b && Log.isLoggable(str2, 3)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        Log.d(str2, f(str, objArr), exc);
    }

    public final void b(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        boolean z10;
        String str2 = this.f28035a;
        if (this.f28036b && Log.isLoggable(str2, 3)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        Log.d(str2, f(str, objArr));
    }

    public final void c(@RecentlyNonNull String str, @RecentlyNonNull Exception exc, @RecentlyNonNull Object... objArr) {
        Log.e(this.f28035a, f(str, objArr), exc);
    }

    public final void d(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        Log.e(this.f28035a, f(str, objArr));
    }

    public final void e(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        Log.w(this.f28035a, f(str, objArr));
    }

    @RecentlyNonNull
    public final String f(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        if (!TextUtils.isEmpty(this.f28037c)) {
            String valueOf = String.valueOf(this.f28037c);
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                return valueOf.concat(valueOf2);
            }
            return new String(valueOf);
        }
        return str;
    }
}
