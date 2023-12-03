package vk;

import java.util.ArrayList;
import kotlin.jvm.internal.i;
/* compiled from: Communities.kt */
/* loaded from: classes2.dex */
public final class a {
    @tf.b("data")

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<b> f35241a;
    @tf.b("status")

    /* renamed from: b  reason: collision with root package name */
    private e f35242b;

    public a() {
        ArrayList<b> arrayList = new ArrayList<>();
        e eVar = new e(0);
        this.f35241a = arrayList;
        this.f35242b = eVar;
    }

    public final ArrayList<b> a() {
        return this.f35241a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (i.b(this.f35241a, aVar.f35241a) && i.b(this.f35242b, aVar.f35242b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f35241a.hashCode() * 31;
        e eVar = this.f35242b;
        if (eVar == null) {
            hashCode = 0;
        } else {
            hashCode = eVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Communities(list=" + this.f35241a + ", status=" + this.f35242b + ')';
    }
}
