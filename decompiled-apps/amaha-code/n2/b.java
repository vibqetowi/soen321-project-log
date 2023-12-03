package n2;

import x1.n;
/* compiled from: WorkDatabase.kt */
/* loaded from: classes.dex */
public final class b extends n.b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f25801a = new b();

    @Override // x1.n.b
    public final void a(c2.b bVar) {
        bVar.beginTransaction();
        try {
            bVar.q("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - w.f25858a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            bVar.setTransactionSuccessful();
        } finally {
            bVar.endTransaction();
        }
    }
}
