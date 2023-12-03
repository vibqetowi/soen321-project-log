package qj;

import android.os.Bundle;
/* compiled from: NavigateAction.kt */
/* loaded from: classes.dex */
public final class g extends a {

    /* renamed from: c  reason: collision with root package name */
    public final String f29616c;

    /* renamed from: d  reason: collision with root package name */
    public final String f29617d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f29618e;

    public g(a aVar, String str, String str2, Bundle bundle) {
        super(aVar.f29611b, aVar.f29610a);
        this.f29616c = str;
        this.f29617d = str2;
        this.f29618e = bundle;
    }

    @Override // qj.a
    public final String toString() {
        return "NavigateAction(actionType=" + this.f29610a + ", payload=" + this.f29611b + ", navigationType='" + this.f29616c + "', navigationUrl='" + this.f29617d + "', keyValue=" + this.f29618e + ')';
    }
}
