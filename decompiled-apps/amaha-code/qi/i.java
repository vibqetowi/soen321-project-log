package qi;

import java.util.HashMap;
import java.util.Map;
import r1.b0;
/* compiled from: TrackAction.java */
/* loaded from: classes.dex */
public final class i extends bj.a {

    /* renamed from: b  reason: collision with root package name */
    public final int f29603b;

    /* renamed from: c  reason: collision with root package name */
    public final String f29604c;

    /* renamed from: d  reason: collision with root package name */
    public final String f29605d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, Object> f29606e;

    public i(int i6, int i10, String str, String str2, HashMap hashMap) {
        super(i6);
        this.f29603b = i10;
        this.f29604c = str;
        this.f29605d = str2;
        this.f29606e = hashMap;
    }

    public final String toString() {
        return "TrackAction{trackType=" + b0.f(this.f29603b) + ", value='" + this.f29604c + "', name='" + this.f29605d + "', attributes=" + this.f29606e + '}';
    }
}
