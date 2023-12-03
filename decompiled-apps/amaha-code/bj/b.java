package bj;

import java.util.HashMap;
import java.util.Map;
/* compiled from: CustomAction.kt */
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, Object> f4324b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i6, HashMap hashMap) {
        super(i6);
        defpackage.d.j(i6, "action");
        this.f4324b = hashMap;
    }

    public final String toString() {
        return "CustomAction(keyValuePairs=" + this.f4324b + ')';
    }
}
