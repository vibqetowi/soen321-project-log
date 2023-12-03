package n2;
/* compiled from: WorkDatabaseMigrations.kt */
/* loaded from: classes.dex */
public final class k extends y1.a {

    /* renamed from: c  reason: collision with root package name */
    public static final k f25827c = new k();

    public k() {
        super(7, 8);
    }

    @Override // y1.a
    public final void a(c2.b bVar) {
        bVar.q("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
