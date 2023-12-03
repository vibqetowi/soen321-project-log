package je;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import je.r;
import ke.l;
import ne.f;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements oe.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21867a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f21868b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f21869c;

    public /* synthetic */ l0(Object obj, int i6, Object obj2) {
        this.f21867a = i6;
        this.f21868b = obj;
        this.f21869c = obj2;
    }

    @Override // oe.d
    public final void accept(Object obj) {
        l.b bVar;
        boolean z10;
        int i6 = this.f21867a;
        boolean z11 = true;
        Object obj2 = this.f21869c;
        Object obj3 = this.f21868b;
        switch (i6) {
            case 0:
                m0 m0Var = (m0) obj3;
                Map map = (Map) obj2;
                Cursor cursor = (Cursor) obj;
                m0Var.getClass();
                try {
                    int i10 = cursor.getInt(0);
                    String string = cursor.getString(1);
                    i iVar = m0Var.f21872b;
                    qf.a N = qf.a.N(cursor.getBlob(2));
                    iVar.getClass();
                    ArrayList a10 = i.a(N);
                    if (map.containsKey(Integer.valueOf(i10))) {
                        bVar = (l.b) map.get(Integer.valueOf(i10));
                    } else {
                        bVar = ke.l.f23280a;
                    }
                    ke.c cVar = ke.l.f23280a;
                    m0Var.o(new ke.a(i10, string, a10, bVar));
                    return;
                } catch (InvalidProtocolBufferException e10) {
                    ca.a.V("Failed to decode index: " + e10, new Object[0]);
                    throw null;
                }
            case 1:
                q0 q0Var = (q0) obj3;
                Cursor cursor2 = (Cursor) obj;
                q0Var.getClass();
                ((List) obj2).add(q0Var.k(cursor2.getBlob(1), cursor2.getInt(0)));
                return;
            case 2:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj2;
                ke.p pVar = (ke.p) obj;
                if (((r.a) obj3).a(pVar)) {
                    String k10 = pVar.k();
                    sQLiteStatement.clearBindings();
                    sQLiteStatement.bindString(1, k10);
                    sQLiteStatement.bindString(2, ca.a.R(pVar.t()));
                    sQLiteStatement.execute();
                    return;
                }
                return;
            case 3:
                SQLiteStatement sQLiteStatement2 = (SQLiteStatement) obj2;
                ((boolean[]) obj3)[0] = true;
                String string2 = ((Cursor) obj).getString(0);
                ke.p O = ca.a.O(string2);
                sQLiteStatement2.clearBindings();
                sQLiteStatement2.bindLong(1, O.p());
                sQLiteStatement2.bindString(2, string2);
                if (sQLiteStatement2.executeUpdateDelete() == -1) {
                    z11 = false;
                }
                ca.a.u0(z11, "Failed to update document path", new Object[0]);
                return;
            case 4:
                x0 x0Var = (x0) obj3;
                String str = (String) obj2;
                x0Var.getClass();
                int i11 = ((Cursor) obj).getInt(0);
                SQLiteDatabase sQLiteDatabase = x0Var.f21967a;
                SQLiteStatement compileStatement = sQLiteDatabase.compileStatement("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
                compileStatement.bindString(1, str);
                compileStatement.bindLong(2, i11);
                if (compileStatement.executeUpdateDelete() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ca.a.u0(z10, "Mutation batch (%s, %d) did not exist", str, Integer.valueOf(i11));
                sQLiteDatabase.execSQL("DELETE FROM document_mutations WHERE uid = ? AND batch_id = ?", new Object[]{str, Integer.valueOf(i11)});
                return;
            case 5:
                y0 y0Var = (y0) obj3;
                oe.d dVar = (oe.d) obj2;
                y0Var.getClass();
                try {
                    dVar.accept(y0Var.f21972b.d(me.c.d0(((Cursor) obj).getBlob(0))));
                    return;
                } catch (InvalidProtocolBufferException e11) {
                    ca.a.V("TargetData failed to parse: %s", e11);
                    throw null;
                }
            default:
                ne.x xVar = (ne.x) obj3;
                xVar.getClass();
                ((oe.a) obj2).b(new ne.u(xVar, 0, (f.a) obj));
                return;
        }
    }
}
