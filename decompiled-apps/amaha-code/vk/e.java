package vk;

import kotlin.jvm.internal.i;
import v.g;
/* compiled from: Communities.kt */
/* loaded from: classes2.dex */
public final class e {
    @tf.b("code")

    /* renamed from: a  reason: collision with root package name */
    private Integer f35253a;
    @tf.b("message")

    /* renamed from: b  reason: collision with root package name */
    private String f35254b;

    public e() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (i.b(this.f35253a, eVar.f35253a) && i.b(this.f35254b, eVar.f35254b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.f35253a;
        int i6 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i10 = hashCode * 31;
        String str = this.f35254b;
        if (str != null) {
            i6 = str.hashCode();
        }
        return i10 + i6;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Status(code=");
        sb2.append(this.f35253a);
        sb2.append(", message=");
        return g.c(sb2, this.f35254b, ')');
    }

    public e(int i6) {
        this.f35253a = null;
        this.f35254b = null;
    }
}
