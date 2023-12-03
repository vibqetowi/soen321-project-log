package cv;
/* compiled from: modifierChecks.kt */
/* loaded from: classes2.dex */
public interface e {

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static String a(e eVar, gt.u functionDescriptor) {
            kotlin.jvm.internal.i.g(functionDescriptor, "functionDescriptor");
            if (!eVar.c(functionDescriptor)) {
                return eVar.a();
            }
            return null;
        }
    }

    String a();

    String b(gt.u uVar);

    boolean c(gt.u uVar);
}
