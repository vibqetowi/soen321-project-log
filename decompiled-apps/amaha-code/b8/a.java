package b8;

import c9.q;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: Atom.java */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f3965a;

    /* compiled from: Atom.java */
    /* renamed from: b8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0077a extends a {

        /* renamed from: b  reason: collision with root package name */
        public final long f3966b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f3967c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList f3968d;

        public C0077a(int i6, long j10) {
            super(i6);
            this.f3966b = j10;
            this.f3967c = new ArrayList();
            this.f3968d = new ArrayList();
        }

        public final C0077a b(int i6) {
            ArrayList arrayList = this.f3968d;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                C0077a c0077a = (C0077a) arrayList.get(i10);
                if (c0077a.f3965a == i6) {
                    return c0077a;
                }
            }
            return null;
        }

        public final b c(int i6) {
            ArrayList arrayList = this.f3967c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = (b) arrayList.get(i10);
                if (bVar.f3965a == i6) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // b8.a
        public final String toString() {
            String a10 = a.a(this.f3965a);
            String arrays = Arrays.toString(this.f3967c.toArray());
            String arrays2 = Arrays.toString(this.f3968d.toArray());
            StringBuilder n10 = defpackage.e.n(ri.e.c(arrays2, ri.e.c(arrays, ri.e.c(a10, 22))), a10, " leaves: ", arrays, " containers: ");
            n10.append(arrays2);
            return n10.toString();
        }
    }

    /* compiled from: Atom.java */
    /* loaded from: classes.dex */
    public static final class b extends a {

        /* renamed from: b  reason: collision with root package name */
        public final q f3969b;

        public b(int i6, q qVar) {
            super(i6);
            this.f3969b = qVar;
        }
    }

    public a(int i6) {
        this.f3965a = i6;
    }

    public static String a(int i6) {
        StringBuilder sb2 = new StringBuilder(4);
        sb2.append((char) ((i6 >> 24) & 255));
        sb2.append((char) ((i6 >> 16) & 255));
        sb2.append((char) ((i6 >> 8) & 255));
        sb2.append((char) (i6 & 255));
        return sb2.toString();
    }

    public String toString() {
        return a(this.f3965a);
    }
}
