package n2;
/* compiled from: WorkDatabaseMigrations.kt */
/* loaded from: classes.dex */
public final class j extends y1.a {

    /* renamed from: c  reason: collision with root package name */
    public static final j f25826c = new j();

    public j() {
        super(6, 7);
    }

    @Override // y1.a
    public final void a(c2.b bVar) {
        bVar.q("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}
