package lt;

import gt.b1;
import gt.c1;
import kotlin.jvm.internal.i;
/* compiled from: JavaVisibilities.kt */
/* loaded from: classes2.dex */
public final class a extends c1 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f24524c = new a();

    public a() {
        super("package", false);
    }

    @Override // gt.c1
    public final Integer a(c1 visibility) {
        i.g(visibility, "visibility");
        boolean z10 = false;
        if (this == visibility) {
            return 0;
        }
        js.b bVar = b1.f16767a;
        if ((visibility == b1.e.f16772c || visibility == b1.f.f16773c) ? true : true) {
            return 1;
        }
        return -1;
    }

    @Override // gt.c1
    public final String b() {
        return "public/*package*/";
    }

    @Override // gt.c1
    public final c1 c() {
        return b1.g.f16774c;
    }
}
