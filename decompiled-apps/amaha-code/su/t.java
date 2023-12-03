package su;

import java.util.ArrayList;
/* compiled from: ErrorReporter.java */
/* loaded from: classes2.dex */
public interface t {
    public static final a r = new a();

    /* compiled from: ErrorReporter.java */
    /* loaded from: classes2.dex */
    public static class a implements t {
        public static /* synthetic */ void a(int i6) {
            Object[] objArr = new Object[3];
            if (i6 != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i6 != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // su.t
        public final void b(kt.b bVar, ArrayList arrayList) {
            if (bVar != null) {
                return;
            }
            a(0);
            throw null;
        }

        @Override // su.t
        public final void c(gt.b bVar) {
            if (bVar != null) {
                return;
            }
            a(2);
            throw null;
        }
    }

    void b(kt.b bVar, ArrayList arrayList);

    void c(gt.b bVar);
}
