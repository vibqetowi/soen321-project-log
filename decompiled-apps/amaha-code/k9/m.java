package k9;

import java.util.Arrays;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final long f23166a;

    /* renamed from: b  reason: collision with root package name */
    public final int f23167b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f23168c = false;

    /* renamed from: d  reason: collision with root package name */
    public final JSONObject f23169d;

    public /* synthetic */ m(long j10, int i6, JSONObject jSONObject) {
        this.f23166a = j10;
        this.f23167b = i6;
        this.f23169d = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f23166a == mVar.f23166a && this.f23167b == mVar.f23167b && this.f23168c == mVar.f23168c && v9.m.a(this.f23169d, mVar.f23169d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f23166a), Integer.valueOf(this.f23167b), Boolean.valueOf(this.f23168c), this.f23169d});
    }
}
