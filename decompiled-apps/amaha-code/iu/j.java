package iu;

import gt.k0;
import gt.u0;
import java.util.Comparator;
/* compiled from: MemberComparator.java */
/* loaded from: classes2.dex */
public final class j implements Comparator<gt.j> {

    /* renamed from: u  reason: collision with root package name */
    public static final j f20697u = new j();

    public static int a(gt.j jVar) {
        if (g.m(jVar)) {
            return 8;
        }
        if (jVar instanceof gt.i) {
            return 7;
        }
        if (jVar instanceof k0) {
            if (((k0) jVar).k0() == null) {
                return 6;
            }
            return 5;
        } else if (jVar instanceof gt.u) {
            if (((gt.u) jVar).k0() == null) {
                return 4;
            }
            return 3;
        } else if (jVar instanceof gt.e) {
            return 2;
        } else {
            if (jVar instanceof u0) {
                return 1;
            }
            return 0;
        }
    }

    @Override // java.util.Comparator
    public final int compare(gt.j jVar, gt.j jVar2) {
        Integer num;
        gt.j jVar3 = jVar;
        gt.j jVar4 = jVar2;
        int a10 = a(jVar4) - a(jVar3);
        if (a10 != 0) {
            num = Integer.valueOf(a10);
        } else if (g.m(jVar3) && g.m(jVar4)) {
            num = 0;
        } else {
            int compareTo = jVar3.getName().f15930u.compareTo(jVar4.getName().f15930u);
            if (compareTo != 0) {
                num = Integer.valueOf(compareTo);
            } else {
                num = null;
            }
        }
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
