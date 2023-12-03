package y9;

import android.util.Log;
import java.util.Locale;
import v9.h;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f38388a;

    /* renamed from: b  reason: collision with root package name */
    public final String f38389b;

    /* renamed from: c  reason: collision with root package name */
    public final int f38390c;

    public a(String str, String... strArr) {
        String sb2;
        if (strArr.length == 0) {
            sb2 = "";
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('[');
            for (String str2 : strArr) {
                if (sb3.length() > 1) {
                    sb3.append(",");
                }
                sb3.append(str2);
            }
            sb3.append("] ");
            sb2 = sb3.toString();
        }
        this.f38389b = sb2;
        this.f38388a = str;
        new h(str, null);
        int i6 = 2;
        while (i6 <= 7 && !Log.isLoggable(this.f38388a, i6)) {
            i6++;
        }
        this.f38390c = i6;
    }

    public final void a(String str, Object... objArr) {
        boolean z10;
        if (this.f38390c <= 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Log.d(this.f38388a, d(str, objArr));
        }
    }

    public final void b(String str, Exception exc, Object... objArr) {
        Log.e(this.f38388a, d(str, objArr), exc);
    }

    public final void c(String str, Object... objArr) {
        Log.e(this.f38388a, d(str, objArr));
    }

    public final String d(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f38389b.concat(str);
    }

    public final void e(String str, Object... objArr) {
        boolean z10;
        if (this.f38390c <= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Log.v(this.f38388a, d(str, objArr));
        }
    }
}
