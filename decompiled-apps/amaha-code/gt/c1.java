package gt;
/* compiled from: Visibility.kt */
/* loaded from: classes2.dex */
public abstract class c1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f16788a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f16789b;

    public c1(String str, boolean z10) {
        this.f16788a = str;
        this.f16789b = z10;
    }

    public Integer a(c1 visibility) {
        kotlin.jvm.internal.i.g(visibility, "visibility");
        js.b bVar = b1.f16767a;
        if (this == visibility) {
            return 0;
        }
        js.b bVar2 = b1.f16767a;
        Integer num = (Integer) bVar2.get(this);
        Integer num2 = (Integer) bVar2.get(visibility);
        if (num != null && num2 != null && !kotlin.jvm.internal.i.b(num, num2)) {
            return Integer.valueOf(num.intValue() - num2.intValue());
        }
        return null;
    }

    public String b() {
        return this.f16788a;
    }

    public final String toString() {
        return b();
    }

    public c1 c() {
        return this;
    }
}
