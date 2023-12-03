package k9;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class g extends w9.a {
    @RecentlyNonNull
    public static final Parcelable.Creator<g> CREATOR = new g0();

    /* renamed from: u  reason: collision with root package name */
    public final boolean f23134u;

    /* renamed from: v  reason: collision with root package name */
    public final String f23135v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f23136w;

    /* renamed from: x  reason: collision with root package name */
    public final f f23137x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g() {
        this(false, r1.toString(), false, null);
        Locale locale = Locale.getDefault();
        Pattern pattern = p9.a.f28027a;
        StringBuilder sb2 = new StringBuilder(20);
        sb2.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb2.append('-');
            sb2.append(country);
        }
        String variant = locale.getVariant();
        if (!TextUtils.isEmpty(variant)) {
            sb2.append('-');
            sb2.append(variant);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f23134u == gVar.f23134u && p9.a.e(this.f23135v, gVar.f23135v) && this.f23136w == gVar.f23136w && p9.a.e(this.f23137x, gVar.f23137x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f23134u), this.f23135v, Boolean.valueOf(this.f23136w), this.f23137x});
    }

    @RecentlyNonNull
    public final String toString() {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s, androidReceiverCompatible: %b)", Boolean.valueOf(this.f23134u), this.f23135v, Boolean.valueOf(this.f23136w));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.o0(parcel, 2, this.f23134u);
        hc.d.x0(parcel, 3, this.f23135v);
        hc.d.o0(parcel, 4, this.f23136w);
        hc.d.w0(parcel, 5, this.f23137x, i6);
        hc.d.C0(parcel, B0);
    }

    public g(boolean z10, String str, boolean z11, f fVar) {
        this.f23134u = z10;
        this.f23135v = str;
        this.f23136w = z11;
        this.f23137x = fVar;
    }
}
