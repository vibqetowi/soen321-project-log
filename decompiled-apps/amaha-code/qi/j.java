package qi;

import java.util.ArrayList;
import java.util.List;
import r1.b0;
/* compiled from: UserInputAction.java */
/* loaded from: classes.dex */
public final class j extends bj.a {

    /* renamed from: b  reason: collision with root package name */
    public final int f29607b;

    /* renamed from: c  reason: collision with root package name */
    public final int f29608c;

    /* renamed from: d  reason: collision with root package name */
    public final List<bj.a> f29609d;

    public j(int i6, int i10, int i11, ArrayList arrayList) {
        super(i6);
        this.f29607b = i10;
        this.f29608c = i11;
        this.f29609d = arrayList;
    }

    public final String toString() {
        return "UserInputAction{userInputType=" + b0.g(this.f29607b) + ", widgetId=" + this.f29608c + ", actionList=" + this.f29609d + '}';
    }
}
