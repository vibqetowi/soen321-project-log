package x1;

import android.database.Cursor;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import b2.c;
import is.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import js.a;
import x1.n;
/* compiled from: RoomOpenHelper.kt */
/* loaded from: classes.dex */
public final class o extends c.a {

    /* renamed from: b  reason: collision with root package name */
    public x1.b f37543b;

    /* renamed from: c  reason: collision with root package name */
    public final a f37544c;

    /* renamed from: d  reason: collision with root package name */
    public final String f37545d;

    /* renamed from: e  reason: collision with root package name */
    public final String f37546e;

    /* compiled from: RoomOpenHelper.kt */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f37547a = 16;

        public abstract void a(c2.b bVar);

        public abstract b b(c2.b bVar);
    }

    /* compiled from: RoomOpenHelper.kt */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f37548a;

        /* renamed from: b  reason: collision with root package name */
        public final String f37549b;

        public b(boolean z10, String str) {
            this.f37548a = z10;
            this.f37549b = str;
        }
    }

    public o(x1.b bVar, WorkDatabase_Impl.a aVar) {
        super(aVar.f37547a);
        this.f37543b = bVar;
        this.f37544c = aVar;
        this.f37545d = "5181942b9ebc31ce68dacb56c16fd79f";
        this.f37546e = "ae2044fb577e65ee8bb576ca48a2f06e";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f A[ORIG_RETURN, RETURN] */
    @Override // b2.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(c2.b bVar) {
        boolean z10;
        List<? extends n.b> list;
        Cursor g5 = bVar.g("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            if (g5.moveToFirst()) {
                if (g5.getInt(0) == 0) {
                    z10 = true;
                    ca.a.z(g5, null);
                    a aVar = this.f37544c;
                    aVar.a(bVar);
                    if (!z10) {
                        b b10 = aVar.b(bVar);
                        if (!b10.f37548a) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + b10.f37549b);
                        }
                    }
                    g(bVar);
                    WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
                    list = workDatabase_Impl.f37520g;
                    if (list == null) {
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            workDatabase_Impl.f37520g.get(i6).getClass();
                        }
                        return;
                    }
                    return;
                }
            }
            z10 = false;
            ca.a.z(g5, null);
            a aVar2 = this.f37544c;
            aVar2.a(bVar);
            if (!z10) {
            }
            g(bVar);
            WorkDatabase_Impl workDatabase_Impl2 = WorkDatabase_Impl.this;
            list = workDatabase_Impl2.f37520g;
            if (list == null) {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ca.a.z(g5, th2);
                throw th3;
            }
        }
    }

    @Override // b2.c.a
    public final void d(c2.b bVar, int i6, int i10) {
        f(bVar, i6, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // b2.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(c2.b bVar) {
        boolean z10;
        b b10;
        h hVar;
        String str;
        Cursor g5 = bVar.g("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            if (g5.moveToFirst()) {
                if (g5.getInt(0) != 0) {
                    z10 = true;
                    ca.a.z(g5, null);
                    if (!z10) {
                        Cursor A = bVar.A(new b2.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                        try {
                            if (A.moveToFirst()) {
                                str = A.getString(0);
                            } else {
                                str = null;
                            }
                            ca.a.z(A, null);
                            String str2 = this.f37545d;
                            if (!kotlin.jvm.internal.i.b(str2, str) && !kotlin.jvm.internal.i.b(this.f37546e, str)) {
                                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + str2 + ", found: " + str);
                            }
                        } finally {
                        }
                    } else {
                        if (this.f37544c.b(bVar).f37548a) {
                            g(bVar);
                        } else {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + b10.f37549b);
                        }
                    }
                    WorkDatabase_Impl.a aVar = (WorkDatabase_Impl.a) this.f37544c;
                    WorkDatabase_Impl.this.f37515a = bVar;
                    bVar.q("PRAGMA foreign_keys = ON");
                    WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
                    workDatabase_Impl.getClass();
                    hVar = workDatabase_Impl.f37519e;
                    hVar.getClass();
                    synchronized (hVar.f37484m) {
                        if (hVar.f37478g) {
                            Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                        } else {
                            bVar.q("PRAGMA temp_store = MEMORY;");
                            bVar.q("PRAGMA recursive_triggers='ON';");
                            bVar.q("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                            hVar.f(bVar);
                            hVar.f37479h = bVar.w("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
                            hVar.f37478g = true;
                            hs.k kVar = hs.k.f19476a;
                        }
                    }
                    List<? extends n.b> list = WorkDatabase_Impl.this.f37520g;
                    if (list != null) {
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            WorkDatabase_Impl.this.f37520g.get(i6).a(bVar);
                        }
                    }
                    this.f37543b = null;
                    return;
                }
            }
            z10 = false;
            ca.a.z(g5, null);
            if (!z10) {
            }
            WorkDatabase_Impl.a aVar2 = (WorkDatabase_Impl.a) this.f37544c;
            WorkDatabase_Impl.this.f37515a = bVar;
            bVar.q("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl workDatabase_Impl2 = WorkDatabase_Impl.this;
            workDatabase_Impl2.getClass();
            hVar = workDatabase_Impl2.f37519e;
            hVar.getClass();
            synchronized (hVar.f37484m) {
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x007c, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
        if (r15 <= r19) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
        if (r7 < r11) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0079, code lost:
        r7 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019c A[ORIG_RETURN, RETURN] */
    @Override // b2.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(c2.b bVar, int i6, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        Iterable<y1.a> iterable;
        Set keySet;
        boolean z13;
        boolean z14;
        b b10;
        x1.b bVar2 = this.f37543b;
        a aVar = this.f37544c;
        if (bVar2 != null) {
            n.c cVar = bVar2.f37456d;
            cVar.getClass();
            if (i6 == i10) {
                iterable = w.f20676u;
            } else {
                if (i10 > i6) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ArrayList arrayList = new ArrayList();
                int i11 = i6;
                do {
                    if (!z11 ? i11 > i10 : i11 < i10) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        TreeMap treeMap = (TreeMap) cVar.f37542a.get(Integer.valueOf(i11));
                        if (treeMap == null) {
                            break;
                        }
                        if (z11) {
                            keySet = treeMap.descendingKeySet();
                        } else {
                            keySet = treeMap.keySet();
                        }
                        Iterator it = keySet.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Integer targetVersion = (Integer) it.next();
                                if (z11) {
                                    int i12 = i11 + 1;
                                    kotlin.jvm.internal.i.f(targetVersion, "targetVersion");
                                    int intValue = targetVersion.intValue();
                                    if (i12 <= intValue) {
                                    }
                                    z14 = false;
                                    continue;
                                } else {
                                    kotlin.jvm.internal.i.f(targetVersion, "targetVersion");
                                    int intValue2 = targetVersion.intValue();
                                    if (i10 <= intValue2) {
                                    }
                                    z14 = false;
                                    continue;
                                }
                                if (z14) {
                                    Object obj = treeMap.get(targetVersion);
                                    kotlin.jvm.internal.i.d(obj);
                                    arrayList.add(obj);
                                    i11 = targetVersion.intValue();
                                    z13 = true;
                                    continue;
                                    break;
                                }
                            } else {
                                z13 = false;
                                continue;
                                break;
                            }
                        }
                    } else {
                        iterable = arrayList;
                        break;
                    }
                } while (z13);
                iterable = null;
            }
            if (iterable != null) {
                ((WorkDatabase_Impl.a) aVar).getClass();
                js.a aVar2 = new js.a();
                Cursor g5 = bVar.g("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (g5.moveToNext()) {
                    try {
                        aVar2.add(g5.getString(0));
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            ca.a.z(g5, th2);
                            throw th3;
                        }
                    }
                }
                hs.k kVar = hs.k.f19476a;
                ca.a.z(g5, null);
                ca.a.o(aVar2);
                Iterator it2 = aVar2.iterator();
                while (true) {
                    a.C0343a c0343a = (a.C0343a) it2;
                    if (!c0343a.hasNext()) {
                        break;
                    }
                    String triggerName = (String) c0343a.next();
                    kotlin.jvm.internal.i.f(triggerName, "triggerName");
                    if (gv.n.H0(triggerName, "room_fts_content_sync_")) {
                        bVar.q("DROP TRIGGER IF EXISTS ".concat(triggerName));
                    }
                }
                for (y1.a aVar3 : iterable) {
                    aVar3.a(bVar);
                }
                if (aVar.b(bVar).f37548a) {
                    g(bVar);
                    z10 = true;
                    if (z10) {
                        x1.b bVar3 = this.f37543b;
                        if (bVar3 != null && !bVar3.a(i6, i10)) {
                            WorkDatabase_Impl.a aVar4 = (WorkDatabase_Impl.a) aVar;
                            aVar4.getClass();
                            bVar.q("DROP TABLE IF EXISTS `Dependency`");
                            bVar.q("DROP TABLE IF EXISTS `WorkSpec`");
                            bVar.q("DROP TABLE IF EXISTS `WorkTag`");
                            bVar.q("DROP TABLE IF EXISTS `SystemIdInfo`");
                            bVar.q("DROP TABLE IF EXISTS `WorkName`");
                            bVar.q("DROP TABLE IF EXISTS `WorkProgress`");
                            bVar.q("DROP TABLE IF EXISTS `Preference`");
                            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
                            List<? extends n.b> list = workDatabase_Impl.f37520g;
                            if (list != null) {
                                int size = list.size();
                                for (int i13 = 0; i13 < size; i13++) {
                                    workDatabase_Impl.f37520g.get(i13).getClass();
                                }
                            }
                            aVar.a(bVar);
                            return;
                        }
                        throw new IllegalStateException("A migration from " + i6 + " to " + i10 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
                    }
                    return;
                }
                throw new IllegalStateException("Migration didn't properly handle: " + b10.f37549b);
            }
        }
        z10 = false;
        if (z10) {
        }
    }

    public final void g(c2.b bVar) {
        bVar.q("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String hash = this.f37545d;
        kotlin.jvm.internal.i.g(hash, "hash");
        bVar.q("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + hash + "')");
    }

    @Override // b2.c.a
    public final void b(c2.b bVar) {
    }
}
