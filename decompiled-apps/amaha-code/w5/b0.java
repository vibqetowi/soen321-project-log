package w5;

import java.util.Arrays;
import java.util.EnumSet;
/* compiled from: SmartLoginOption.kt */
/* loaded from: classes.dex */
public enum b0 {
    /* JADX INFO: Fake field, exist only in values array */
    None(0),
    Enabled(1),
    RequireConfirm(2);
    

    /* renamed from: v  reason: collision with root package name */
    public static final EnumSet<b0> f36437v;

    /* renamed from: u  reason: collision with root package name */
    public final long f36441u;

    static {
        EnumSet<b0> allOf = EnumSet.allOf(b0.class);
        kotlin.jvm.internal.i.f(allOf, "allOf(SmartLoginOption::class.java)");
        f36437v = allOf;
    }

    b0(int i6) {
        this.f36441u = r2;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static b0[] valuesCustom() {
        return (b0[]) Arrays.copyOf(values(), 3);
    }
}
