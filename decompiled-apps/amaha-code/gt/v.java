package gt;

import java.util.List;
import zu.i;
/* compiled from: InlineClassRepresentation.kt */
/* loaded from: classes2.dex */
public final class v<Type extends zu.i> extends x0<Type> {

    /* renamed from: a  reason: collision with root package name */
    public final fu.e f16821a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f16822b;

    public v(fu.e underlyingPropertyName, Type underlyingType) {
        kotlin.jvm.internal.i.g(underlyingPropertyName, "underlyingPropertyName");
        kotlin.jvm.internal.i.g(underlyingType, "underlyingType");
        this.f16821a = underlyingPropertyName;
        this.f16822b = underlyingType;
    }

    @Override // gt.x0
    public final List<hs.f<fu.e, Type>> a() {
        return ca.a.O0(new hs.f(this.f16821a, this.f16822b));
    }
}
