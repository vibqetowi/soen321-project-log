package xl;

import java.util.ArrayList;
import kotlin.jvm.internal.i;
/* compiled from: ExpertTestimonialItemModel.kt */
/* loaded from: classes2.dex */
public final class b {
    @tf.b("message")

    /* renamed from: a  reason: collision with root package name */
    private String f37851a;
    @tf.b("testimonials")

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<a> f37852b;

    public b() {
        ArrayList<a> arrayList = new ArrayList<>();
        this.f37851a = null;
        this.f37852b = arrayList;
    }

    public final ArrayList<a> a() {
        return this.f37852b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (i.b(this.f37851a, bVar.f37851a) && i.b(this.f37852b, bVar.f37852b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f37851a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.f37852b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "ExpertTestimonialItemModel(message=" + this.f37851a + ", testimonials=" + this.f37852b + ')';
    }
}
