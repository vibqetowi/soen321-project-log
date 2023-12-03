package n2;
/* compiled from: WorkDatabaseMigrations.kt */
/* loaded from: classes.dex */
public final class d extends y1.a {

    /* renamed from: c  reason: collision with root package name */
    public static final d f25806c = new d();

    public d() {
        super(11, 12);
    }

    @Override // y1.a
    public final void a(c2.b bVar) {
        bVar.q("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
