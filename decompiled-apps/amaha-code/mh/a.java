package mh;

import com.theinnerhour.b2b.utils.SessionManager;
import di.k;
import java.util.Date;
import kotlin.jvm.internal.i;
import r1.b0;
/* compiled from: AttributeEntity.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f25053a;

    /* renamed from: b  reason: collision with root package name */
    public String f25054b;

    /* renamed from: c  reason: collision with root package name */
    public final long f25055c;

    /* renamed from: d  reason: collision with root package name */
    public final String f25056d;

    public a(long j10, String str, String str2, String str3) {
        defpackage.e.u(str, SessionManager.KEY_NAME, str2, "value", str3, "dataType");
        this.f25053a = str;
        this.f25054b = str2;
        this.f25055c = j10;
        this.f25056d = str3;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        if (!i.b(a.class, cls)) {
            return false;
        }
        if (obj != null) {
            a aVar = (a) obj;
            if (i.b(this.f25053a, aVar.f25053a) && i.b(this.f25054b, aVar.f25054b) && this.f25055c == aVar.f25055c && i.b(this.f25056d, aVar.f25056d)) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.moengage.core.internal.model.database.entity.AttributeEntity");
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MoEAttribute(name='");
        sb2.append(this.f25053a);
        sb2.append("', value='");
        sb2.append(this.f25054b);
        sb2.append("', lastTrackedTime=");
        sb2.append((Object) k.b(new Date(this.f25055c)));
        sb2.append(",dataType='");
        return b0.b(sb2, this.f25056d, "')");
    }
}
