package is;
/* compiled from: CollectionsJVM.kt */
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f20672a;

    static {
        boolean z10;
        String property = System.getProperty("kotlin.collections.convert_arg_to_set_in_removeAll");
        if (property != null) {
            z10 = Boolean.parseBoolean(property);
        } else {
            z10 = false;
        }
        f20672a = z10;
    }
}
