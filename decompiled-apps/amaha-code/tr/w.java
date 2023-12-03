package tr;

import java.util.concurrent.atomic.AtomicLong;
/* compiled from: InternalLogId.java */
/* loaded from: classes2.dex */
public final class w {

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicLong f33586d = new AtomicLong();

    /* renamed from: a  reason: collision with root package name */
    public final String f33587a;

    /* renamed from: b  reason: collision with root package name */
    public final String f33588b;

    /* renamed from: c  reason: collision with root package name */
    public final long f33589c;

    public w(long j10, String str, String str2) {
        sc.b.w(str, "typeName");
        sc.b.s("empty type", !str.isEmpty());
        this.f33587a = str;
        this.f33588b = str2;
        this.f33589c = j10;
    }

    public static w a(Class<?> cls, String str) {
        String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return new w(f33586d.incrementAndGet(), simpleName, str);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f33587a + "<" + this.f33589c + ">");
        String str = this.f33588b;
        if (str != null) {
            sb2.append(": (");
            sb2.append(str);
            sb2.append(')');
        }
        return sb2.toString();
    }
}
