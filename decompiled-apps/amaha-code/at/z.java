package at;

import java.lang.annotation.Annotation;
import java.util.List;
/* compiled from: KParameterImpl.kt */
/* loaded from: classes2.dex */
public final class z extends kotlin.jvm.internal.k implements ss.a<List<? extends Annotation>> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ b0 f3626u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(b0 b0Var) {
        super(0);
        this.f3626u = b0Var;
    }

    @Override // ss.a
    public final List<? extends Annotation> invoke() {
        return t0.d(this.f3626u.e());
    }
}
