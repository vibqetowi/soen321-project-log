package v2;

import android.database.Cursor;
import androidx.work.u;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import v2.s;
/* compiled from: WorkSpecDao_Impl.java */
/* loaded from: classes.dex */
public final class v implements Callable<List<s.b>> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ x1.p f34770u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ u f34771v;

    public v(u uVar, x1.p pVar) {
        this.f34771v = uVar;
        this.f34770u = pVar;
    }

    @Override // java.util.concurrent.Callable
    public final List<s.b> call() {
        String string;
        byte[] blob;
        u uVar = this.f34771v;
        x1.n nVar = uVar.f34760a;
        nVar.c();
        try {
            Cursor S = kc.f.S(nVar, this.f34770u, true);
            t.b<String, ArrayList<String>> bVar = new t.b<>();
            t.b<String, ArrayList<androidx.work.d>> bVar2 = new t.b<>();
            while (S.moveToNext()) {
                String string2 = S.getString(0);
                if (bVar.getOrDefault(string2, null) == null) {
                    bVar.put(string2, new ArrayList<>());
                }
                String string3 = S.getString(0);
                if (bVar2.getOrDefault(string3, null) == null) {
                    bVar2.put(string3, new ArrayList<>());
                }
            }
            S.moveToPosition(-1);
            uVar.x(bVar);
            uVar.w(bVar2);
            ArrayList arrayList = new ArrayList(S.getCount());
            while (S.moveToNext()) {
                if (S.isNull(0)) {
                    string = null;
                } else {
                    string = S.getString(0);
                }
                u.a F0 = ca.a.F0(S.getInt(1));
                if (S.isNull(2)) {
                    blob = null;
                } else {
                    blob = S.getBlob(2);
                }
                androidx.work.d a10 = androidx.work.d.a(blob);
                int i6 = S.getInt(3);
                int i10 = S.getInt(4);
                ArrayList<String> orDefault = bVar.getOrDefault(S.getString(0), null);
                if (orDefault == null) {
                    orDefault = new ArrayList<>();
                }
                ArrayList<String> arrayList2 = orDefault;
                ArrayList<androidx.work.d> orDefault2 = bVar2.getOrDefault(S.getString(0), null);
                if (orDefault2 == null) {
                    orDefault2 = new ArrayList<>();
                }
                arrayList.add(new s.b(string, F0, a10, i6, i10, arrayList2, orDefault2));
            }
            nVar.n();
            S.close();
            return arrayList;
        } finally {
            nVar.j();
        }
    }

    public final void finalize() {
        this.f34770u.h();
    }
}
