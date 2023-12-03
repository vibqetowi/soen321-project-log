package vk;

import com.theinnerhour.b2b.utils.SessionManager;
import kotlin.jvm.internal.i;
import v.g;
/* compiled from: CommunityPostsModel.kt */
/* loaded from: classes2.dex */
public final class c {
    @tf.b("image")

    /* renamed from: a  reason: collision with root package name */
    private String f35248a = null;
    @tf.b(SessionManager.KEY_NAME)

    /* renamed from: b  reason: collision with root package name */
    private String f35249b = null;
    @tf.b(SessionManager.KEY_B2B_IS_VERIFIED)

    /* renamed from: c  reason: collision with root package name */
    private Boolean f35250c = null;
    @tf.b("body")

    /* renamed from: d  reason: collision with root package name */
    private String f35251d = null;

    public final String a() {
        return this.f35251d;
    }

    public final String b() {
        return this.f35248a;
    }

    public final String c() {
        return this.f35249b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (i.b(this.f35248a, cVar.f35248a) && i.b(this.f35249b, cVar.f35249b) && i.b(this.f35250c, cVar.f35250c) && i.b(this.f35251d, cVar.f35251d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.f35248a;
        int i6 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.f35249b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        Boolean bool = this.f35250c;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str3 = this.f35251d;
        if (str3 != null) {
            i6 = str3.hashCode();
        }
        return i12 + i6;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommunityPostList(image=");
        sb2.append(this.f35248a);
        sb2.append(", name=");
        sb2.append(this.f35249b);
        sb2.append(", isVerified=");
        sb2.append(this.f35250c);
        sb2.append(", body=");
        return g.c(sb2, this.f35251d, ')');
    }
}
