package lt;

import gt.b1;
import gt.c1;
import kotlin.jvm.internal.i;
/* compiled from: JavaVisibilities.kt */
/* loaded from: classes2.dex */
public final class b extends c1 {

    /* renamed from: c  reason: collision with root package name */
    public static final b f24525c = new b();

    public b() {
        super("protected_and_package", true);
    }

    @Override // gt.c1
    public final Integer a(c1 visibility) {
        i.g(visibility, "visibility");
        boolean z10 = false;
        if (i.b(this, visibility)) {
            return 0;
        }
        if (visibility == b1.b.f16769c) {
            return null;
        }
        js.b bVar = b1.f16767a;
        int i6 = 1;
        if (!((visibility == b1.e.f16772c || visibility == b1.f.f16773c) ? true : true)) {
            i6 = -1;
        }
        return Integer.valueOf(i6);
    }

    @Override // gt.c1
    public final String b() {
        return "protected/*protected and package*/";
    }

    @Override // gt.c1
    public final c1 c() {
        return b1.g.f16774c;
    }
}
