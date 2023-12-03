package bj;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.i;
/* compiled from: NavigationAction.kt */
/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: b  reason: collision with root package name */
    public final int f4325b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4326c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, Object> f4327d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i6, int i10, String navigationUrl, HashMap hashMap) {
        super(i6);
        defpackage.d.j(i6, "action");
        defpackage.d.j(i10, "navigationType");
        i.g(navigationUrl, "navigationUrl");
        this.f4325b = i10;
        this.f4326c = navigationUrl;
        this.f4327d = hashMap;
    }

    public final String toString() {
        return "NavigationAction(navigationType=" + defpackage.c.F(this.f4325b) + ", navigationUrl='" + this.f4326c + "', keyValuePairs=" + this.f4327d + ')';
    }
}
