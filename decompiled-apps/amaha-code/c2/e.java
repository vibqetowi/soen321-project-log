package c2;

import android.database.sqlite.SQLiteStatement;
import b2.f;
import x1.m;
/* compiled from: FrameworkSQLiteStatement.kt */
/* loaded from: classes.dex */
public final class e extends m implements f {

    /* renamed from: w  reason: collision with root package name */
    public final SQLiteStatement f4762w;

    public e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f4762w = sQLiteStatement;
    }

    @Override // b2.f
    public final long G0() {
        return this.f4762w.executeInsert();
    }

    @Override // b2.f
    public final int v() {
        return this.f4762w.executeUpdateDelete();
    }
}
