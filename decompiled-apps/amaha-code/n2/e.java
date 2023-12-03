package n2;
/* compiled from: WorkDatabaseMigrations.kt */
/* loaded from: classes.dex */
public final class e extends y1.a {

    /* renamed from: c  reason: collision with root package name */
    public static final e f25821c = new e();

    public e() {
        super(12, 13);
    }

    @Override // y1.a
    public final void a(c2.b bVar) {
        bVar.q("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        bVar.q("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
