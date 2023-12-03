package g6;

import java.util.Arrays;
/* compiled from: LoginTargetApp.kt */
/* loaded from: classes.dex */
public enum a0 {
    FACEBOOK("facebook"),
    INSTAGRAM("instagram");
    

    /* renamed from: u  reason: collision with root package name */
    public final String f16230u;

    a0(String str) {
        this.f16230u = str;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static a0[] valuesCustom() {
        return (a0[]) Arrays.copyOf(values(), 2);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f16230u;
    }
}
