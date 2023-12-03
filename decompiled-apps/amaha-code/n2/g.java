package n2;
/* compiled from: WorkDatabaseMigrations.kt */
/* loaded from: classes.dex */
public final class g extends y1.a {

    /* renamed from: c  reason: collision with root package name */
    public static final g f25823c = new g();

    public g() {
        super(1, 2);
    }

    @Override // y1.a
    public final void a(c2.b bVar) {
        bVar.q("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        bVar.q("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        bVar.q("DROP TABLE IF EXISTS alarmInfo");
        bVar.q("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
