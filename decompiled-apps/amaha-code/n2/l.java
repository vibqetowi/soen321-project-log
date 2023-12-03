package n2;
/* compiled from: WorkDatabaseMigrations.kt */
/* loaded from: classes.dex */
public final class l extends y1.a {

    /* renamed from: c  reason: collision with root package name */
    public static final l f25828c = new l();

    public l() {
        super(8, 9);
    }

    @Override // y1.a
    public final void a(c2.b bVar) {
        bVar.q("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
