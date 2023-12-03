package b9;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: HttpDataSource.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f4197a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public Map<String, String> f4198b;

    public final synchronized Map<String, String> a() {
        if (this.f4198b == null) {
            this.f4198b = Collections.unmodifiableMap(new HashMap(this.f4197a));
        }
        return this.f4198b;
    }
}
