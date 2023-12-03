package z3;

import java.util.Map;
import kotlin.jvm.internal.i;
/* compiled from: EventBridge.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f39139a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, Object> f39140b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Object> f39141c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, Object> f39142d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, ? extends Object> f39143e;

    public a(String eventType, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, Map<String, ? extends Object> map4) {
        i.g(eventType, "eventType");
        this.f39139a = eventType;
        this.f39140b = map;
        this.f39141c = map2;
        this.f39142d = map3;
        this.f39143e = map4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (i.b(this.f39139a, aVar.f39139a) && i.b(this.f39140b, aVar.f39140b) && i.b(this.f39141c, aVar.f39141c) && i.b(this.f39142d, aVar.f39142d) && i.b(this.f39143e, aVar.f39143e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f39139a.hashCode() * 31;
        int i6 = 0;
        Map<String, Object> map = this.f39140b;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int i10 = (hashCode4 + hashCode) * 31;
        Map<String, Object> map2 = this.f39141c;
        if (map2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = map2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        Map<String, Object> map3 = this.f39142d;
        if (map3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = map3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        Map<String, ? extends Object> map4 = this.f39143e;
        if (map4 != null) {
            i6 = map4.hashCode();
        }
        return i12 + i6;
    }

    public final String toString() {
        return "Event(eventType=" + this.f39139a + ", eventProperties=" + this.f39140b + ", userProperties=" + this.f39141c + ", groups=" + this.f39142d + ", groupProperties=" + this.f39143e + ')';
    }
}
