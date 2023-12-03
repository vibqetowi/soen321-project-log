package wu;
/* compiled from: TypeSubstitution.kt */
/* loaded from: classes2.dex */
public abstract class g1 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f37244a = new a();

    /* compiled from: TypeSubstitution.kt */
    /* loaded from: classes2.dex */
    public static final class a extends g1 {
        @Override // wu.g1
        public final d1 d(b0 b0Var) {
            return null;
        }

        public final String toString() {
            return "Empty TypeSubstitution";
        }
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public ht.h c(ht.h annotations) {
        kotlin.jvm.internal.i.g(annotations, "annotations");
        return annotations;
    }

    public abstract d1 d(b0 b0Var);

    public boolean e() {
        return this instanceof a;
    }

    public b0 f(b0 topLevelType, n1 position) {
        kotlin.jvm.internal.i.g(topLevelType, "topLevelType");
        kotlin.jvm.internal.i.g(position, "position");
        return topLevelType;
    }
}
