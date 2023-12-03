package n2;
/* compiled from: WorkDatabaseMigrations.kt */
/* loaded from: classes.dex */
public final class i extends y1.a {

    /* renamed from: c  reason: collision with root package name */
    public static final i f25825c = new i();

    public i() {
        super(4, 5);
    }

    @Override // y1.a
    public final void a(c2.b bVar) {
        bVar.q("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        bVar.q("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
