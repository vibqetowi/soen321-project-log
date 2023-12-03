package xl;

import com.theinnerhour.b2b.utils.SessionManager;
import kotlin.jvm.internal.i;
/* compiled from: ExpertTestimonialItemModel.kt */
/* loaded from: classes2.dex */
public final class a {
    @tf.b("body")

    /* renamed from: a  reason: collision with root package name */
    private String f37846a;
    @tf.b(SessionManager.KEY_NAME)

    /* renamed from: b  reason: collision with root package name */
    private String f37847b;
    @tf.b("designation")

    /* renamed from: c  reason: collision with root package name */
    private String f37848c;
    @tf.b("highlighted_text")

    /* renamed from: d  reason: collision with root package name */
    private String f37849d;
    @tf.b("provider_info")

    /* renamed from: e  reason: collision with root package name */
    private c f37850e;

    public a() {
        c cVar = new c(0);
        this.f37846a = null;
        this.f37847b = null;
        this.f37848c = null;
        this.f37849d = null;
        this.f37850e = cVar;
    }

    public final String a() {
        return this.f37846a;
    }

    public final String b() {
        return this.f37848c;
    }

    public final String c() {
        return this.f37849d;
    }

    public final String d() {
        return this.f37847b;
    }

    public final c e() {
        return this.f37850e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (i.b(this.f37846a, aVar.f37846a) && i.b(this.f37847b, aVar.f37847b) && i.b(this.f37848c, aVar.f37848c) && i.b(this.f37849d, aVar.f37849d) && i.b(this.f37850e, aVar.f37850e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.f37846a;
        int i6 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.f37847b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.f37848c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.f37849d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        c cVar = this.f37850e;
        if (cVar != null) {
            i6 = cVar.hashCode();
        }
        return i13 + i6;
    }

    public final String toString() {
        return "ExpertTestimonialItem(body=" + this.f37846a + ", name=" + this.f37847b + ", designation=" + this.f37848c + ", highLightedText=" + this.f37849d + ", providerInfo=" + this.f37850e + ')';
    }
}
