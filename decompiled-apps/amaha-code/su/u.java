package su;
/* compiled from: FlexibleTypeDeserializer.kt */
/* loaded from: classes2.dex */
public interface u {

    /* compiled from: FlexibleTypeDeserializer.kt */
    /* loaded from: classes2.dex */
    public static final class a implements u {

        /* renamed from: u  reason: collision with root package name */
        public static final a f32068u = new a();

        @Override // su.u
        public final wu.b0 b(au.p proto, String flexibleId, wu.i0 lowerBound, wu.i0 upperBound) {
            kotlin.jvm.internal.i.g(proto, "proto");
            kotlin.jvm.internal.i.g(flexibleId, "flexibleId");
            kotlin.jvm.internal.i.g(lowerBound, "lowerBound");
            kotlin.jvm.internal.i.g(upperBound, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    wu.b0 b(au.p pVar, String str, wu.i0 i0Var, wu.i0 i0Var2);
}
