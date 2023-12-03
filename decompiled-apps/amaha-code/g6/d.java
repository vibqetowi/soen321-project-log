package g6;

import java.util.Arrays;
/* compiled from: DefaultAudience.kt */
/* loaded from: classes.dex */
public enum d {
    NONE(null),
    /* JADX INFO: Fake field, exist only in values array */
    ONLY_ME("only_me"),
    FRIENDS("friends"),
    /* JADX INFO: Fake field, exist only in values array */
    EVERYONE("everyone");
    

    /* renamed from: u  reason: collision with root package name */
    public final String f16242u;

    d(String str) {
        this.f16242u = str;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static d[] valuesCustom() {
        return (d[]) Arrays.copyOf(values(), 4);
    }
}
