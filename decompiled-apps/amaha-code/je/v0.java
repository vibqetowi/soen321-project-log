package je;

import android.database.sqlite.SQLiteDatabase;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f21963u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ x0 f21964v;

    public /* synthetic */ v0(x0 x0Var, int i6) {
        this.f21963u = i6;
        this.f21964v = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f21963u;
        x0 x0Var = this.f21964v;
        switch (i6) {
            case 0:
                SQLiteDatabase sQLiteDatabase = x0Var.f21967a;
                sQLiteDatabase.execSQL("CREATE TABLE targets (target_id INTEGER PRIMARY KEY, canonical_id TEXT, snapshot_version_seconds INTEGER, snapshot_version_nanos INTEGER, resume_token BLOB, last_listen_sequence_number INTEGER,target_proto BLOB)");
                sQLiteDatabase.execSQL("CREATE INDEX query_targets ON targets (canonical_id, target_id)");
                sQLiteDatabase.execSQL("CREATE TABLE target_globals (highest_target_id INTEGER, highest_listen_sequence_number INTEGER, last_remote_snapshot_version_seconds INTEGER, last_remote_snapshot_version_nanos INTEGER)");
                sQLiteDatabase.execSQL("CREATE TABLE target_documents (target_id INTEGER, path TEXT, PRIMARY KEY (target_id, path))");
                sQLiteDatabase.execSQL("CREATE INDEX document_targets ON target_documents (path, target_id)");
                return;
            case 1:
                x0Var.f21967a.execSQL("CREATE TABLE data_migrations (migration_name TEXT, PRIMARY KEY (migration_name))");
                return;
            case 2:
                SQLiteDatabase sQLiteDatabase2 = x0Var.f21967a;
                sQLiteDatabase2.execSQL("CREATE TABLE document_overlays (uid TEXT, collection_path TEXT, document_id TEXT, collection_group TEXT, largest_batch_id INTEGER, overlay_mutation BLOB, PRIMARY KEY (uid, collection_path, document_id))");
                sQLiteDatabase2.execSQL("CREATE INDEX batch_id_overlay ON document_overlays (uid, largest_batch_id)");
                sQLiteDatabase2.execSQL("CREATE INDEX collection_group_overlay ON document_overlays (uid, collection_group)");
                return;
            case 3:
                SQLiteDatabase sQLiteDatabase3 = x0Var.f21967a;
                sQLiteDatabase3.execSQL("CREATE TABLE index_configuration (index_id INTEGER, collection_group TEXT, index_proto BLOB, PRIMARY KEY (index_id))");
                sQLiteDatabase3.execSQL("CREATE TABLE index_state (index_id INTEGER, uid TEXT, sequence_number INTEGER, read_time_seconds INTEGER, read_time_nanos INTEGER, document_key TEXT, largest_batch_id INTEGER, PRIMARY KEY (index_id, uid))");
                sQLiteDatabase3.execSQL("CREATE TABLE index_entries (index_id INTEGER, uid TEXT, array_value BLOB, directional_value BLOB, document_key TEXT, PRIMARY KEY (index_id, uid, array_value, directional_value, document_key))");
                sQLiteDatabase3.execSQL("CREATE INDEX read_time ON remote_documents(read_time_seconds, read_time_nanos)");
                return;
            case 4:
                x0Var.f21967a.execSQL("CREATE TABLE remote_documents (path TEXT PRIMARY KEY, contents BLOB)");
                return;
            case 5:
                SQLiteDatabase sQLiteDatabase4 = x0Var.f21967a;
                sQLiteDatabase4.execSQL("CREATE TABLE bundles (bundle_id TEXT PRIMARY KEY, create_time_seconds INTEGER, create_time_nanos INTEGER, schema_version INTEGER, total_documents INTEGER, total_bytes INTEGER)");
                sQLiteDatabase4.execSQL("CREATE TABLE named_queries (name TEXT PRIMARY KEY, read_time_seconds INTEGER, read_time_nanos INTEGER, bundled_query_proto BLOB)");
                return;
            case 6:
                SQLiteDatabase sQLiteDatabase5 = x0Var.f21967a;
                sQLiteDatabase5.execSQL("CREATE TABLE mutation_queues (uid TEXT PRIMARY KEY, last_acknowledged_batch_id INTEGER, last_stream_token BLOB)");
                sQLiteDatabase5.execSQL("CREATE TABLE mutations (uid TEXT, batch_id INTEGER, mutations BLOB, PRIMARY KEY (uid, batch_id))");
                sQLiteDatabase5.execSQL("CREATE TABLE document_mutations (uid TEXT, path TEXT, batch_id INTEGER, PRIMARY KEY (uid, path, batch_id))");
                return;
            default:
                x0Var.f21967a.execSQL("CREATE TABLE collection_parents (collection_id TEXT, parent TEXT, PRIMARY KEY(collection_id, parent))");
                return;
        }
    }
}
