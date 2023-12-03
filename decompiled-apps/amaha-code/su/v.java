package su;
/* compiled from: IncompatibleVersionErrorData.kt */
/* loaded from: classes2.dex */
public final class v<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f32069a;

    /* renamed from: b  reason: collision with root package name */
    public final T f32070b;

    /* renamed from: c  reason: collision with root package name */
    public final String f32071c;

    /* renamed from: d  reason: collision with root package name */
    public final fu.b f32072d;

    /* JADX WARN: Multi-variable type inference failed */
    public v(eu.e eVar, eu.e eVar2, String filePath, fu.b classId) {
        kotlin.jvm.internal.i.g(filePath, "filePath");
        kotlin.jvm.internal.i.g(classId, "classId");
        this.f32069a = eVar;
        this.f32070b = eVar2;
        this.f32071c = filePath;
        this.f32072d = classId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (kotlin.jvm.internal.i.b(this.f32069a, vVar.f32069a) && kotlin.jvm.internal.i.b(this.f32070b, vVar.f32070b) && kotlin.jvm.internal.i.b(this.f32071c, vVar.f32071c) && kotlin.jvm.internal.i.b(this.f32072d, vVar.f32072d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i6 = 0;
        T t3 = this.f32069a;
        if (t3 == null) {
            hashCode = 0;
        } else {
            hashCode = t3.hashCode();
        }
        int i10 = hashCode * 31;
        T t10 = this.f32070b;
        if (t10 != null) {
            i6 = t10.hashCode();
        }
        return this.f32072d.hashCode() + pl.a.c(this.f32071c, (i10 + i6) * 31, 31);
    }

    public final String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f32069a + ", expectedVersion=" + this.f32070b + ", filePath=" + this.f32071c + ", classId=" + this.f32072d + ')';
    }
}
