package z1;

import android.database.Cursor;
import com.theinnerhour.b2b.utils.SessionManager;
import gv.n;
import gv.r;
import is.u;
import is.x;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import js.g;
import kotlin.jvm.internal.i;
import r1.b0;
/* compiled from: TableInfo.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f39114a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, C0668a> f39115b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<b> f39116c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<d> f39117d;

    /* compiled from: TableInfo.kt */
    /* renamed from: z1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0668a {

        /* renamed from: a  reason: collision with root package name */
        public final String f39118a;

        /* renamed from: b  reason: collision with root package name */
        public final String f39119b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f39120c;

        /* renamed from: d  reason: collision with root package name */
        public final int f39121d;

        /* renamed from: e  reason: collision with root package name */
        public final String f39122e;
        public final int f;

        /* renamed from: g  reason: collision with root package name */
        public final int f39123g;

        /* compiled from: TableInfo.kt */
        /* renamed from: z1.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0669a {
            public static boolean a(String current, String str) {
                boolean z10;
                boolean z11;
                i.g(current, "current");
                if (i.b(current, str)) {
                    return true;
                }
                if (current.length() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    int i6 = 0;
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i6 < current.length()) {
                            char charAt = current.charAt(i6);
                            int i12 = i11 + 1;
                            if (i11 == 0 && charAt != '(') {
                                break;
                            }
                            if (charAt == '(') {
                                i10++;
                            } else if (charAt == ')' && i10 - 1 == 0 && i11 != current.length() - 1) {
                                break;
                            }
                            i6++;
                            i11 = i12;
                        } else if (i10 == 0) {
                            z11 = true;
                        }
                    }
                }
                z11 = false;
                if (!z11) {
                    return false;
                }
                String substring = current.substring(1, current.length() - 1);
                i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return i.b(r.i1(substring).toString(), str);
            }
        }

        public C0668a(int i6, int i10, String str, String str2, String str3, boolean z10) {
            int i11;
            this.f39118a = str;
            this.f39119b = str2;
            this.f39120c = z10;
            this.f39121d = i6;
            this.f39122e = str3;
            this.f = i10;
            Locale US = Locale.US;
            i.f(US, "US");
            String upperCase = str2.toUpperCase(US);
            i.f(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (r.J0(upperCase, "INT")) {
                i11 = 3;
            } else if (!r.J0(upperCase, "CHAR") && !r.J0(upperCase, "CLOB") && !r.J0(upperCase, "TEXT")) {
                if (r.J0(upperCase, "BLOB")) {
                    i11 = 5;
                } else if (!r.J0(upperCase, "REAL") && !r.J0(upperCase, "FLOA") && !r.J0(upperCase, "DOUB")) {
                    i11 = 1;
                } else {
                    i11 = 4;
                }
            } else {
                i11 = 2;
            }
            this.f39123g = i11;
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x0057, code lost:
            r1 = true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0668a)) {
                return false;
            }
            C0668a c0668a = (C0668a) obj;
            if (this.f39121d != c0668a.f39121d) {
                return false;
            }
            if (!i.b(this.f39118a, c0668a.f39118a) || this.f39120c != c0668a.f39120c) {
                return false;
            }
            int i6 = c0668a.f;
            String str = c0668a.f39122e;
            String str2 = this.f39122e;
            int i10 = this.f;
            if (i10 == 1 && i6 == 2 && str2 != null && !C0669a.a(str2, str)) {
                return false;
            }
            if (i10 == 2 && i6 == 1 && str != null && !C0669a.a(str, str2)) {
                return false;
            }
            if (i10 != 0 && i10 == i6) {
                boolean z10 = str2 != null ? false : false;
                if (z10) {
                    return false;
                }
            }
            if (this.f39123g == c0668a.f39123g) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i6;
            int hashCode = ((this.f39118a.hashCode() * 31) + this.f39123g) * 31;
            if (this.f39120c) {
                i6 = 1231;
            } else {
                i6 = 1237;
            }
            return ((hashCode + i6) * 31) + this.f39121d;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Column{name='");
            sb2.append(this.f39118a);
            sb2.append("', type='");
            sb2.append(this.f39119b);
            sb2.append("', affinity='");
            sb2.append(this.f39123g);
            sb2.append("', notNull=");
            sb2.append(this.f39120c);
            sb2.append(", primaryKeyPosition=");
            sb2.append(this.f39121d);
            sb2.append(", defaultValue='");
            String str = this.f39122e;
            if (str == null) {
                str = "undefined";
            }
            return b0.b(sb2, str, "'}");
        }
    }

    /* compiled from: TableInfo.kt */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f39124a;

        /* renamed from: b  reason: collision with root package name */
        public final String f39125b;

        /* renamed from: c  reason: collision with root package name */
        public final String f39126c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f39127d;

        /* renamed from: e  reason: collision with root package name */
        public final List<String> f39128e;

        public b(String str, String str2, String str3, List<String> columnNames, List<String> referenceColumnNames) {
            i.g(columnNames, "columnNames");
            i.g(referenceColumnNames, "referenceColumnNames");
            this.f39124a = str;
            this.f39125b = str2;
            this.f39126c = str3;
            this.f39127d = columnNames;
            this.f39128e = referenceColumnNames;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!i.b(this.f39124a, bVar.f39124a) || !i.b(this.f39125b, bVar.f39125b) || !i.b(this.f39126c, bVar.f39126c) || !i.b(this.f39127d, bVar.f39127d)) {
                return false;
            }
            return i.b(this.f39128e, bVar.f39128e);
        }

        public final int hashCode() {
            int c10 = pl.a.c(this.f39126c, pl.a.c(this.f39125b, this.f39124a.hashCode() * 31, 31), 31);
            return this.f39128e.hashCode() + ((this.f39127d.hashCode() + c10) * 31);
        }

        public final String toString() {
            return "ForeignKey{referenceTable='" + this.f39124a + "', onDelete='" + this.f39125b + " +', onUpdate='" + this.f39126c + "', columnNames=" + this.f39127d + ", referenceColumnNames=" + this.f39128e + '}';
        }
    }

    /* compiled from: TableInfo.kt */
    /* loaded from: classes.dex */
    public static final class c implements Comparable<c> {

        /* renamed from: u  reason: collision with root package name */
        public final int f39129u;

        /* renamed from: v  reason: collision with root package name */
        public final int f39130v;

        /* renamed from: w  reason: collision with root package name */
        public final String f39131w;

        /* renamed from: x  reason: collision with root package name */
        public final String f39132x;

        public c(String str, int i6, int i10, String str2) {
            this.f39129u = i6;
            this.f39130v = i10;
            this.f39131w = str;
            this.f39132x = str2;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            c other = cVar;
            i.g(other, "other");
            int i6 = this.f39129u - other.f39129u;
            if (i6 == 0) {
                return this.f39130v - other.f39130v;
            }
            return i6;
        }
    }

    /* compiled from: TableInfo.kt */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f39133a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f39134b;

        /* renamed from: c  reason: collision with root package name */
        public final List<String> f39135c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f39136d;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.util.Collection, java.lang.Object, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
        public d(String str, List columns, List orders, boolean z10) {
            i.g(columns, "columns");
            i.g(orders, "orders");
            this.f39133a = str;
            this.f39134b = z10;
            this.f39135c = columns;
            this.f39136d = orders;
            if (orders.isEmpty()) {
                int size = columns.size();
                orders = new ArrayList(size);
                for (int i6 = 0; i6 < size; i6++) {
                    orders.add("ASC");
                }
            }
            this.f39136d = orders;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f39134b != dVar.f39134b || !i.b(this.f39135c, dVar.f39135c) || !i.b(this.f39136d, dVar.f39136d)) {
                return false;
            }
            String str = this.f39133a;
            boolean H0 = n.H0(str, "index_");
            String str2 = dVar.f39133a;
            if (H0) {
                return n.H0(str2, "index_");
            }
            return i.b(str, str2);
        }

        public final int hashCode() {
            int hashCode;
            String str = this.f39133a;
            if (n.H0(str, "index_")) {
                hashCode = -1184239155;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode2 = this.f39135c.hashCode();
            return this.f39136d.hashCode() + ((hashCode2 + (((hashCode * 31) + (this.f39134b ? 1 : 0)) * 31)) * 31);
        }

        public final String toString() {
            return "Index{name='" + this.f39133a + "', unique=" + this.f39134b + ", columns=" + this.f39135c + ", orders=" + this.f39136d + "'}";
        }
    }

    public a(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        this.f39114a = str;
        this.f39115b = map;
        this.f39116c = abstractSet;
        this.f39117d = abstractSet2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x030f, code lost:
        ca.a.q(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0312, code lost:
        ca.a.z(r2, null);
        r11 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02f5 A[Catch: all -> 0x0325, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x0325, blocks: (B:46:0x01ea, B:51:0x0203, B:52:0x0208, B:54:0x020e, B:57:0x021b, B:61:0x0229, B:81:0x02dc, B:86:0x02f5, B:82:0x02e1, B:95:0x030f, B:62:0x0241, B:68:0x0264, B:69:0x0270, B:71:0x0276, B:74:0x027d, B:78:0x0292, B:79:0x02b6), top: B:127:0x01ea }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final a a(c2.b bVar, String str) {
        Map map;
        boolean z10;
        g gVar;
        boolean z11;
        int i6;
        String str2;
        int i10;
        int i11;
        Throwable th2;
        d dVar;
        String str3;
        boolean z12;
        c2.b bVar2 = bVar;
        StringBuilder sb2 = new StringBuilder("PRAGMA table_info(`");
        sb2.append(str);
        String str4 = "`)";
        sb2.append("`)");
        Cursor g5 = bVar2.g(sb2.toString());
        try {
            int columnCount = g5.getColumnCount();
            String str5 = SessionManager.KEY_NAME;
            if (columnCount <= 0) {
                map = x.f20677u;
                ca.a.z(g5, null);
            } else {
                int columnIndex = g5.getColumnIndex(SessionManager.KEY_NAME);
                int columnIndex2 = g5.getColumnIndex("type");
                int columnIndex3 = g5.getColumnIndex("notnull");
                int columnIndex4 = g5.getColumnIndex("pk");
                int columnIndex5 = g5.getColumnIndex("dflt_value");
                js.b bVar3 = new js.b();
                while (g5.moveToNext()) {
                    String name = g5.getString(columnIndex);
                    String type = g5.getString(columnIndex2);
                    if (g5.getInt(columnIndex3) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i12 = g5.getInt(columnIndex4);
                    String string = g5.getString(columnIndex5);
                    i.f(name, "name");
                    i.f(type, "type");
                    bVar3.put(name, new C0668a(i12, 2, name, type, string, z10));
                    columnIndex = columnIndex;
                }
                bVar3.b();
                bVar3.F = true;
                ca.a.z(g5, null);
                map = bVar3;
            }
            g5 = bVar2.g("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = g5.getColumnIndex("id");
                int columnIndex7 = g5.getColumnIndex("seq");
                int columnIndex8 = g5.getColumnIndex("table");
                int columnIndex9 = g5.getColumnIndex("on_delete");
                int columnIndex10 = g5.getColumnIndex("on_update");
                int columnIndex11 = g5.getColumnIndex("id");
                int columnIndex12 = g5.getColumnIndex("seq");
                int columnIndex13 = g5.getColumnIndex("from");
                int columnIndex14 = g5.getColumnIndex("to");
                js.a aVar = new js.a();
                while (g5.moveToNext()) {
                    String str6 = str5;
                    int i13 = g5.getInt(columnIndex11);
                    int i14 = columnIndex11;
                    int i15 = g5.getInt(columnIndex12);
                    int i16 = columnIndex12;
                    String string2 = g5.getString(columnIndex13);
                    int i17 = columnIndex13;
                    i.f(string2, "cursor.getString(fromColumnIndex)");
                    String string3 = g5.getString(columnIndex14);
                    i.f(string3, "cursor.getString(toColumnIndex)");
                    aVar.add(new c(string2, i13, i15, string3));
                    map = map;
                    str5 = str6;
                    columnIndex11 = i14;
                    columnIndex12 = i16;
                    columnIndex13 = i17;
                    columnIndex14 = columnIndex14;
                }
                Map map2 = map;
                String str7 = str5;
                ca.a.o(aVar);
                List C2 = u.C2(aVar);
                g5.moveToPosition(-1);
                g gVar2 = new g();
                while (g5.moveToNext()) {
                    if (g5.getInt(columnIndex7) == 0) {
                        int i18 = g5.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : C2) {
                            List list = C2;
                            if (((c) obj).f39129u == i18) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                arrayList3.add(obj);
                            }
                            C2 = list;
                        }
                        List list2 = C2;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            c cVar = (c) it.next();
                            arrayList.add(cVar.f39131w);
                            arrayList2.add(cVar.f39132x);
                        }
                        String string4 = g5.getString(columnIndex8);
                        i.f(string4, "cursor.getString(tableColumnIndex)");
                        String string5 = g5.getString(columnIndex9);
                        i.f(string5, "cursor.getString(onDeleteColumnIndex)");
                        String string6 = g5.getString(columnIndex10);
                        i.f(string6, "cursor.getString(onUpdateColumnIndex)");
                        gVar2.add(new b(string4, string5, string6, arrayList, arrayList2));
                        columnIndex6 = columnIndex6;
                        C2 = list2;
                    }
                }
                ca.a.q(gVar2);
                ca.a.z(g5, null);
                g5 = bVar2.g("PRAGMA index_list(`" + str + "`)");
                String str8 = str7;
                try {
                    int columnIndex15 = g5.getColumnIndex(str8);
                    int columnIndex16 = g5.getColumnIndex("origin");
                    int columnIndex17 = g5.getColumnIndex("unique");
                    if (columnIndex15 != -1 && columnIndex16 != -1 && columnIndex17 != -1) {
                        g gVar3 = new g();
                        while (true) {
                            if (!g5.moveToNext()) {
                                break;
                            } else if (i.b("c", g5.getString(columnIndex16))) {
                                String string7 = g5.getString(columnIndex15);
                                if (g5.getInt(columnIndex17) == 1) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                i.f(string7, str8);
                                Cursor g10 = bVar2.g("PRAGMA index_xinfo(`" + string7 + str4);
                                int columnIndex18 = g10.getColumnIndex("seqno");
                                int columnIndex19 = g10.getColumnIndex("cid");
                                int columnIndex20 = g10.getColumnIndex(str8);
                                int columnIndex21 = g10.getColumnIndex("desc");
                                String str9 = str8;
                                if (columnIndex18 != -1 && columnIndex19 != -1 && columnIndex20 != -1 && columnIndex21 != -1) {
                                    TreeMap treeMap = new TreeMap();
                                    i6 = columnIndex15;
                                    TreeMap treeMap2 = new TreeMap();
                                    while (g10.moveToNext()) {
                                        if (g10.getInt(columnIndex19) >= 0) {
                                            int i19 = g10.getInt(columnIndex18);
                                            String str10 = str4;
                                            String columnName = g10.getString(columnIndex20);
                                            if (g10.getInt(columnIndex21) > 0) {
                                                str3 = "DESC";
                                            } else {
                                                str3 = "ASC";
                                            }
                                            int i20 = columnIndex21;
                                            String str11 = str3;
                                            int i21 = columnIndex16;
                                            Integer valueOf = Integer.valueOf(i19);
                                            i.f(columnName, "columnName");
                                            treeMap.put(valueOf, columnName);
                                            treeMap2.put(Integer.valueOf(i19), str11);
                                            str4 = str10;
                                            columnIndex16 = i21;
                                            columnIndex21 = i20;
                                            columnIndex17 = columnIndex17;
                                        }
                                    }
                                    str2 = str4;
                                    i10 = columnIndex16;
                                    i11 = columnIndex17;
                                    Collection values = treeMap.values();
                                    i.f(values, "columnsMap.values");
                                    List I2 = u.I2(values);
                                    Collection values2 = treeMap2.values();
                                    i.f(values2, "ordersMap.values");
                                    dVar = new d(string7, I2, u.I2(values2), z11);
                                    ca.a.z(g10, null);
                                    th2 = null;
                                    if (dVar != null) {
                                        ca.a.z(g5, th2);
                                        gVar = null;
                                        break;
                                    }
                                    gVar3.add(dVar);
                                    bVar2 = bVar;
                                    str8 = str9;
                                    columnIndex15 = i6;
                                    str4 = str2;
                                    columnIndex16 = i10;
                                    columnIndex17 = i11;
                                }
                                i6 = columnIndex15;
                                str2 = str4;
                                i10 = columnIndex16;
                                i11 = columnIndex17;
                                th2 = null;
                                ca.a.z(g10, null);
                                dVar = null;
                                if (dVar != null) {
                                }
                            }
                        }
                        return new a(str, map2, gVar2, gVar);
                    }
                    ca.a.z(g5, null);
                    gVar = null;
                    return new a(str, map2, gVar2, gVar);
                } finally {
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public final boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!i.b(this.f39114a, aVar.f39114a) || !i.b(this.f39115b, aVar.f39115b) || !i.b(this.f39116c, aVar.f39116c)) {
            return false;
        }
        Set<d> set2 = this.f39117d;
        if (set2 == null || (set = aVar.f39117d) == null) {
            return true;
        }
        return i.b(set2, set);
    }

    public final int hashCode() {
        int hashCode = this.f39115b.hashCode();
        return this.f39116c.hashCode() + ((hashCode + (this.f39114a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f39114a + "', columns=" + this.f39115b + ", foreignKeys=" + this.f39116c + ", indices=" + this.f39117d + '}';
    }
}
