package j$.time.temporal;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
/* loaded from: classes3.dex */
public final class w implements Serializable {

    /* renamed from: g  reason: collision with root package name */
    private static final ConcurrentHashMap f21027g = new ConcurrentHashMap(4, 0.75f, 2);

    /* renamed from: h  reason: collision with root package name */
    public static final s f21028h;
    private static final long serialVersionUID = -1177360819670808121L;

    /* renamed from: a  reason: collision with root package name */
    private final j$.time.f f21029a;

    /* renamed from: b  reason: collision with root package name */
    private final int f21030b;

    /* renamed from: c  reason: collision with root package name */
    private final transient p f21031c = v.g(this);

    /* renamed from: d  reason: collision with root package name */
    private final transient p f21032d = v.j(this);

    /* renamed from: e  reason: collision with root package name */
    private final transient p f21033e;
    private final transient p f;

    static {
        new w(j$.time.f.MONDAY, 4);
        g(j$.time.f.SUNDAY, 1);
        f21028h = i.f21000d;
    }

    private w(j$.time.f fVar, int i6) {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
        this.f21033e = v.k(this);
        this.f = v.i(this);
        Objects.requireNonNull(fVar, "firstDayOfWeek");
        if (i6 < 1 || i6 > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.f21029a = fVar;
        this.f21030b = i6;
    }

    public static w g(j$.time.f fVar, int i6) {
        String str = fVar.toString() + i6;
        ConcurrentHashMap concurrentHashMap = f21027g;
        w wVar = (w) concurrentHashMap.get(str);
        if (wVar == null) {
            concurrentHashMap.putIfAbsent(str, new w(fVar, i6));
            return (w) concurrentHashMap.get(str);
        }
        return wVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (this.f21029a == null) {
            throw new InvalidObjectException("firstDayOfWeek is null");
        }
        int i6 = this.f21030b;
        if (i6 < 1 || i6 > 7) {
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private Object readResolve() {
        try {
            return g(this.f21029a, this.f21030b);
        } catch (IllegalArgumentException e10) {
            String message = e10.getMessage();
            throw new InvalidObjectException("Invalid serialized WeekFields: " + message);
        }
    }

    public final p d() {
        return this.f21031c;
    }

    public final j$.time.f e() {
        return this.f21029a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && hashCode() == obj.hashCode();
    }

    public final int f() {
        return this.f21030b;
    }

    public final p h() {
        return this.f;
    }

    public final int hashCode() {
        return (this.f21029a.ordinal() * 7) + this.f21030b;
    }

    public final p i() {
        return this.f21032d;
    }

    public final p j() {
        return this.f21033e;
    }

    public final String toString() {
        return "WeekFields[" + this.f21029a + "," + this.f21030b + "]";
    }
}
