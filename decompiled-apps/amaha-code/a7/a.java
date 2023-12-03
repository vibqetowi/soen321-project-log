package a7;
/* compiled from: AutoValue_Event.java */
/* loaded from: classes.dex */
public final class a<T> extends c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f330a;

    /* renamed from: b  reason: collision with root package name */
    public final T f331b;

    /* renamed from: c  reason: collision with root package name */
    public final d f332c;

    public a(Integer num, T t3, d dVar) {
        this.f330a = num;
        if (t3 != null) {
            this.f331b = t3;
            this.f332c = dVar;
            return;
        }
        throw new NullPointerException("Null payload");
    }

    @Override // a7.c
    public final Integer a() {
        return this.f330a;
    }

    @Override // a7.c
    public final T b() {
        return this.f331b;
    }

    @Override // a7.c
    public final d c() {
        return this.f332c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Integer num = this.f330a;
        if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
            if (this.f331b.equals(cVar.b()) && this.f332c.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.f330a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return ((((hashCode ^ 1000003) * 1000003) ^ this.f331b.hashCode()) * 1000003) ^ this.f332c.hashCode();
    }

    public final String toString() {
        return "Event{code=" + this.f330a + ", payload=" + this.f331b + ", priority=" + this.f332c + "}";
    }
}
