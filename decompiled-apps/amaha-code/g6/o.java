package g6;

import java.util.Arrays;
/* compiled from: LoginBehavior.kt */
/* loaded from: classes.dex */
public enum o {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_ONLY(true, true, false, false, false, true),
    /* JADX INFO: Fake field, exist only in values array */
    KATANA_ONLY(false, true, false, false, false, false),
    /* JADX INFO: Fake field, exist only in values array */
    WEB_ONLY(false, false, true, false, true, false),
    /* JADX INFO: Fake field, exist only in values array */
    DIALOG_ONLY(false, true, true, false, true, true),
    /* JADX INFO: Fake field, exist only in values array */
    DEVICE_AUTH(false, false, false, true, false, false);
    

    /* renamed from: u  reason: collision with root package name */
    public final boolean f16290u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f16291v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f16292w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f16293x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f16294y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f16295z;

    o(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f16290u = z10;
        this.f16291v = z11;
        this.f16292w = z12;
        this.f16293x = z13;
        this.f16294y = z14;
        this.f16295z = z15;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static o[] valuesCustom() {
        return (o[]) Arrays.copyOf(values(), 6);
    }
}
