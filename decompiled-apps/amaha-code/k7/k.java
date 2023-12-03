package k7;

import android.database.sqlite.SQLiteDatabase;
import com.theinnerhour.b2b.utils.SessionManager;
import d7.h;
import d7.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Set;
import k7.o;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements o.a {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f23040u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ o f23041v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ s f23042w;

    public /* synthetic */ k(o oVar, s sVar, int i6) {
        this.f23040u = i6;
        this.f23041v = oVar;
        this.f23042w = sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d9  */
    @Override // k7.o.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object apply(Object obj) {
        a7.d[] values;
        ListIterator listIterator;
        int i6 = this.f23040u;
        s sVar = this.f23042w;
        o oVar = this.f23041v;
        switch (i6) {
            case 0:
                oVar.getClass();
                Long m10 = o.m((SQLiteDatabase) obj, sVar);
                if (m10 == null) {
                    return Boolean.FALSE;
                }
                return (Boolean) o.J(oVar.j().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{m10.toString()}), new p7.b(26));
            default:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                e eVar = oVar.f23055x;
                ArrayList s10 = oVar.s(sQLiteDatabase, sVar, eVar.c());
                for (a7.d dVar : a7.d.values()) {
                    if (dVar != sVar.d()) {
                        int c10 = eVar.c() - s10.size();
                        if (c10 > 0) {
                            s10.addAll(oVar.s(sQLiteDatabase, sVar.e(dVar), c10));
                        } else {
                            HashMap hashMap = new HashMap();
                            StringBuilder sb2 = new StringBuilder("event_id IN (");
                            for (int i10 = 0; i10 < s10.size(); i10++) {
                                sb2.append(((i) s10.get(i10)).b());
                                if (i10 < s10.size() - 1) {
                                    sb2.append(',');
                                }
                            }
                            sb2.append(')');
                            o.J(sQLiteDatabase.query("event_metadata", new String[]{"event_id", SessionManager.KEY_NAME, "value"}, sb2.toString(), null, null, null, null), new f0.b(14, hashMap));
                            listIterator = s10.listIterator();
                            while (listIterator.hasNext()) {
                                i iVar = (i) listIterator.next();
                                if (hashMap.containsKey(Long.valueOf(iVar.b()))) {
                                    h.a i11 = iVar.a().i();
                                    for (o.b bVar : (Set) hashMap.get(Long.valueOf(iVar.b()))) {
                                        i11.a(bVar.f23057a, bVar.f23058b);
                                    }
                                    listIterator.set(new b(iVar.b(), iVar.c(), i11.b()));
                                }
                            }
                            return s10;
                        }
                    }
                }
                HashMap hashMap2 = new HashMap();
                StringBuilder sb22 = new StringBuilder("event_id IN (");
                while (i10 < s10.size()) {
                }
                sb22.append(')');
                o.J(sQLiteDatabase.query("event_metadata", new String[]{"event_id", SessionManager.KEY_NAME, "value"}, sb22.toString(), null, null, null, null), new f0.b(14, hashMap2));
                listIterator = s10.listIterator();
                while (listIterator.hasNext()) {
                }
                return s10;
        }
    }
}
