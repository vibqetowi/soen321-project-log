package o3;

import java.util.HashSet;
import kotlin.jvm.internal.i;
/* compiled from: TrackingOptions.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f27037b = {"adid", "city", "ip_address", "lat_lng"};

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f27038a = new HashSet();

    public final boolean a(String str) {
        return !this.f27038a.contains(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !i.b(f.class, obj.getClass())) {
            return false;
        }
        return i.b(((f) obj).f27038a, this.f27038a);
    }
}
