package c3;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/* compiled from: MergePathsContent.java */
/* loaded from: classes.dex */
public final class k implements l, i {

    /* renamed from: a  reason: collision with root package name */
    public final Path f4830a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final Path f4831b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final Path f4832c = new Path();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f4833d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final h3.g f4834e;

    public k(h3.g gVar) {
        gVar.getClass();
        this.f4834e = gVar;
    }

    public final void a(Path.Op op2) {
        Matrix matrix;
        Matrix matrix2;
        Path path = this.f4831b;
        path.reset();
        Path path2 = this.f4830a;
        path2.reset();
        ArrayList arrayList = this.f4833d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            l lVar = (l) arrayList.get(size);
            if (lVar instanceof c) {
                c cVar = (c) lVar;
                ArrayList arrayList2 = (ArrayList) cVar.f();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path path3 = ((l) arrayList2.get(size2)).getPath();
                    d3.l lVar2 = cVar.f4787k;
                    if (lVar2 != null) {
                        matrix2 = lVar2.d();
                    } else {
                        matrix2 = cVar.f4780c;
                        matrix2.reset();
                    }
                    path3.transform(matrix2);
                    path.addPath(path3);
                }
            } else {
                path.addPath(lVar.getPath());
            }
        }
        int i6 = 0;
        l lVar3 = (l) arrayList.get(0);
        if (lVar3 instanceof c) {
            c cVar2 = (c) lVar3;
            List<l> f = cVar2.f();
            while (true) {
                ArrayList arrayList3 = (ArrayList) f;
                if (i6 >= arrayList3.size()) {
                    break;
                }
                Path path4 = ((l) arrayList3.get(i6)).getPath();
                d3.l lVar4 = cVar2.f4787k;
                if (lVar4 != null) {
                    matrix = lVar4.d();
                } else {
                    matrix = cVar2.f4780c;
                    matrix.reset();
                }
                path4.transform(matrix);
                path2.addPath(path4);
                i6++;
            }
        } else {
            path2.set(lVar3.getPath());
        }
        this.f4832c.op(path2, path, op2);
    }

    @Override // c3.b
    public final void c(List<b> list, List<b> list2) {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f4833d;
            if (i6 < arrayList.size()) {
                ((l) arrayList.get(i6)).c(list, list2);
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // c3.i
    public final void f(ListIterator<b> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            b previous = listIterator.previous();
            if (previous instanceof l) {
                this.f4833d.add((l) previous);
                listIterator.remove();
            }
        }
    }

    @Override // c3.l
    public final Path getPath() {
        Path path = this.f4832c;
        path.reset();
        h3.g gVar = this.f4834e;
        if (gVar.f17109b) {
            return path;
        }
        int d10 = v.h.d(gVar.f17108a);
        if (d10 != 0) {
            if (d10 != 1) {
                if (d10 != 2) {
                    if (d10 != 3) {
                        if (d10 == 4) {
                            a(Path.Op.XOR);
                        }
                    } else {
                        a(Path.Op.INTERSECT);
                    }
                } else {
                    a(Path.Op.REVERSE_DIFFERENCE);
                }
            } else {
                a(Path.Op.UNION);
            }
        } else {
            int i6 = 0;
            while (true) {
                ArrayList arrayList = this.f4833d;
                if (i6 >= arrayList.size()) {
                    break;
                }
                path.addPath(((l) arrayList.get(i6)).getPath());
                i6++;
            }
        }
        return path;
    }
}
