package xl;

import com.theinnerhour.b2b.utils.SessionManager;
import kotlin.jvm.internal.i;
import v.g;
/* compiled from: ExpertTestimonialItemModel.kt */
/* loaded from: classes2.dex */
public final class c {
    @tf.b(SessionManager.KEY_UUID)

    /* renamed from: a  reason: collision with root package name */
    private String f37853a;
    @tf.b(SessionManager.KEY_NAME)

    /* renamed from: b  reason: collision with root package name */
    private String f37854b;
    @tf.b("img")

    /* renamed from: c  reason: collision with root package name */
    private String f37855c;
    @tf.b("usertype")

    /* renamed from: d  reason: collision with root package name */
    private String f37856d;

    public c() {
        this(0);
    }

    public final String a() {
        return this.f37854b;
    }

    public final String b() {
        return this.f37853a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (i.b(this.f37853a, cVar.f37853a) && i.b(this.f37854b, cVar.f37854b) && i.b(this.f37855c, cVar.f37855c) && i.b(this.f37856d, cVar.f37856d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.f37853a;
        int i6 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.f37854b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.f37855c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.f37856d;
        if (str4 != null) {
            i6 = str4.hashCode();
        }
        return i12 + i6;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProviderInfo(uuid=");
        sb2.append(this.f37853a);
        sb2.append(", name=");
        sb2.append(this.f37854b);
        sb2.append(", img=");
        sb2.append(this.f37855c);
        sb2.append(", usertype=");
        return g.c(sb2, this.f37856d, ')');
    }

    public c(int i6) {
        this.f37853a = null;
        this.f37854b = null;
        this.f37855c = null;
        this.f37856d = null;
    }
}
