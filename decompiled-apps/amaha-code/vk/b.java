package vk;

import com.theinnerhour.b2b.utils.SessionManager;
import kotlin.jvm.internal.i;
import v.g;
/* compiled from: Communities.kt */
/* loaded from: classes2.dex */
public final class b {
    @tf.b("id")

    /* renamed from: a  reason: collision with root package name */
    private Integer f35243a = null;
    @tf.b("slug")

    /* renamed from: b  reason: collision with root package name */
    private String f35244b = null;
    @tf.b(SessionManager.KEY_NAME)

    /* renamed from: c  reason: collision with root package name */
    private String f35245c = null;
    @tf.b("avatar_png")

    /* renamed from: d  reason: collision with root package name */
    private String f35246d = null;
    @tf.b("description")

    /* renamed from: e  reason: collision with root package name */
    private String f35247e = null;
    @tf.b("short_description")
    private String f = null;

    public final String a() {
        return this.f35246d;
    }

    public final String b() {
        return this.f35245c;
    }

    public final String c() {
        return this.f35244b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (i.b(this.f35243a, bVar.f35243a) && i.b(this.f35244b, bVar.f35244b) && i.b(this.f35245c, bVar.f35245c) && i.b(this.f35246d, bVar.f35246d) && i.b(this.f35247e, bVar.f35247e) && i.b(this.f, bVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        Integer num = this.f35243a;
        int i6 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i10 = hashCode * 31;
        String str = this.f35244b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str2 = this.f35245c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str3 = this.f35246d;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        String str4 = this.f35247e;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        String str5 = this.f;
        if (str5 != null) {
            i6 = str5.hashCode();
        }
        return i14 + i6;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommunityGroupList(id=");
        sb2.append(this.f35243a);
        sb2.append(", slug=");
        sb2.append(this.f35244b);
        sb2.append(", name=");
        sb2.append(this.f35245c);
        sb2.append(", avatar=");
        sb2.append(this.f35246d);
        sb2.append(", description=");
        sb2.append(this.f35247e);
        sb2.append(", shortDescription=");
        return g.c(sb2, this.f, ')');
    }
}
