package je;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import je.y0;
import ke.l;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements oe.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21842a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f21843b;

    public /* synthetic */ j0(int i6, Object obj) {
        this.f21842a = i6;
        this.f21843b = obj;
    }

    @Override // oe.d
    public final void accept(Object obj) {
        int i6 = this.f21842a;
        Object obj2 = this.f21843b;
        switch (i6) {
            case 0:
                ((ArrayList) obj2).add(ca.a.O(((Cursor) obj).getString(0)));
                return;
            case 1:
                Cursor cursor = (Cursor) obj;
                int i10 = cursor.getInt(0);
                long j10 = cursor.getLong(1);
                ke.r rVar = new ke.r(new sc.h(cursor.getInt(3), cursor.getLong(2)));
                ke.i iVar = new ke.i(ca.a.O(cursor.getString(4)));
                int i11 = cursor.getInt(5);
                Integer valueOf = Integer.valueOf(i10);
                ke.b bVar = l.a.f23281u;
                ((Map) obj2).put(valueOf, new ke.c(j10, new ke.b(rVar, iVar, i11)));
                return;
            case 2:
                Boolean[] boolArr = (Boolean[]) obj2;
                Cursor cursor2 = (Cursor) obj;
                try {
                    int i12 = androidx.work.k.f3323a;
                    if ("BUILD_OVERLAYS".equals(cursor2.getString(0))) {
                        boolArr[0] = Boolean.TRUE;
                        return;
                    }
                    return;
                } catch (IllegalArgumentException e10) {
                    ca.a.V("SQLitePersistence.DataMigration failed to parse: %s", e10);
                    throw null;
                }
            case 3:
                ((Set) obj2).add(((Cursor) obj).getString(0));
                return;
            case 4:
                y0 y0Var = (y0) obj2;
                Cursor cursor3 = (Cursor) obj;
                y0Var.getClass();
                y0Var.f21973c = cursor3.getInt(0);
                y0Var.f21974d = cursor3.getInt(1);
                y0Var.f21975e = new ke.r(new sc.h(cursor3.getInt(3), cursor3.getLong(2)));
                y0Var.f = cursor3.getLong(4);
                return;
            default:
                y0.a aVar = (y0.a) obj2;
                aVar.f21976a = aVar.f21976a.insert(new ke.i(ca.a.O(((Cursor) obj).getString(0))));
                return;
        }
    }
}
