package x1;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: SharedSQLiteStatement.kt */
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a  reason: collision with root package name */
    public final n f37570a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f37571b;

    /* renamed from: c  reason: collision with root package name */
    public final hs.i f37572c;

    /* compiled from: SharedSQLiteStatement.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<b2.f> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final b2.f invoke() {
            return u.this.b();
        }
    }

    public u(n database) {
        kotlin.jvm.internal.i.g(database, "database");
        this.f37570a = database;
        this.f37571b = new AtomicBoolean(false);
        this.f37572c = sp.b.O(new a());
    }

    public final b2.f a() {
        this.f37570a.a();
        if (this.f37571b.compareAndSet(false, true)) {
            return (b2.f) this.f37572c.getValue();
        }
        return b();
    }

    public final b2.f b() {
        String sql = c();
        n nVar = this.f37570a;
        nVar.getClass();
        kotlin.jvm.internal.i.g(sql, "sql");
        nVar.a();
        nVar.b();
        return nVar.g().U().w(sql);
    }

    public abstract String c();

    public final void d(b2.f statement) {
        kotlin.jvm.internal.i.g(statement, "statement");
        if (statement == ((b2.f) this.f37572c.getValue())) {
            this.f37571b.set(false);
        }
    }
}
