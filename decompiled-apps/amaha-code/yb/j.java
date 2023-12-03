package yb;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;
import yb.f;
/* compiled from: ShapeAppearancePathProvider.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final l[] f38474a = new l[4];

    /* renamed from: b  reason: collision with root package name */
    public final Matrix[] f38475b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    public final Matrix[] f38476c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    public final PointF f38477d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    public final Path f38478e = new Path();
    public final Path f = new Path();

    /* renamed from: g  reason: collision with root package name */
    public final l f38479g = new l();

    /* renamed from: h  reason: collision with root package name */
    public final float[] f38480h = new float[2];

    /* renamed from: i  reason: collision with root package name */
    public final float[] f38481i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    public final Path f38482j = new Path();

    /* renamed from: k  reason: collision with root package name */
    public final Path f38483k = new Path();

    /* renamed from: l  reason: collision with root package name */
    public final boolean f38484l = true;

    /* compiled from: ShapeAppearancePathProvider.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final j f38485a = new j();
    }

    public j() {
        for (int i6 = 0; i6 < 4; i6++) {
            this.f38474a[i6] = new l();
            this.f38475b[i6] = new Matrix();
            this.f38476c[i6] = new Matrix();
        }
    }

    public final void a(i iVar, float f, RectF rectF, f.a aVar, Path path) {
        int i6;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        l[] lVarArr;
        float abs;
        e eVar;
        Path path2;
        f.a aVar2;
        c cVar;
        df.b bVar;
        Path path3;
        j jVar = this;
        i iVar2 = iVar;
        f.a aVar3 = aVar;
        Path path4 = path;
        path.rewind();
        Path path5 = jVar.f38478e;
        path5.rewind();
        Path path6 = jVar.f;
        path6.rewind();
        path6.addRect(rectF, Path.Direction.CW);
        int i10 = 0;
        while (true) {
            i6 = 4;
            matrixArr = jVar.f38476c;
            fArr = jVar.f38480h;
            matrixArr2 = jVar.f38475b;
            lVarArr = jVar.f38474a;
            if (i10 >= 4) {
                break;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        cVar = iVar2.f;
                    } else {
                        cVar = iVar2.f38456e;
                    }
                } else {
                    cVar = iVar2.f38458h;
                }
            } else {
                cVar = iVar2.f38457g;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        bVar = iVar2.f38453b;
                    } else {
                        bVar = iVar2.f38452a;
                    }
                } else {
                    bVar = iVar2.f38455d;
                }
            } else {
                bVar = iVar2.f38454c;
            }
            l lVar = lVarArr[i10];
            bVar.getClass();
            bVar.m(f, cVar.a(rectF), lVar);
            int i11 = i10 + 1;
            float f2 = (i11 % 4) * 90;
            matrixArr2[i10].reset();
            PointF pointF = jVar.f38477d;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        path3 = path5;
                        pointF.set(rectF.right, rectF.top);
                    } else {
                        path3 = path5;
                        pointF.set(rectF.left, rectF.top);
                    }
                } else {
                    path3 = path5;
                    pointF.set(rectF.left, rectF.bottom);
                }
            } else {
                path3 = path5;
                pointF.set(rectF.right, rectF.bottom);
            }
            matrixArr2[i10].setTranslate(pointF.x, pointF.y);
            matrixArr2[i10].preRotate(f2);
            l lVar2 = lVarArr[i10];
            fArr[0] = lVar2.f38490c;
            fArr[1] = lVar2.f38491d;
            matrixArr2[i10].mapPoints(fArr);
            matrixArr[i10].reset();
            matrixArr[i10].setTranslate(fArr[0], fArr[1]);
            matrixArr[i10].preRotate(f2);
            i10 = i11;
            path5 = path3;
        }
        Path path7 = path5;
        char c10 = 1;
        char c11 = 0;
        int i12 = 0;
        while (i12 < i6) {
            l lVar3 = lVarArr[i12];
            fArr[c11] = lVar3.f38488a;
            fArr[c10] = lVar3.f38489b;
            matrixArr2[i12].mapPoints(fArr);
            if (i12 == 0) {
                path4.moveTo(fArr[c11], fArr[c10]);
            } else {
                path4.lineTo(fArr[c11], fArr[c10]);
            }
            lVarArr[i12].c(matrixArr2[i12], path4);
            if (aVar3 != null) {
                l lVar4 = lVarArr[i12];
                Matrix matrix = matrixArr2[i12];
                f fVar = f.this;
                BitSet bitSet = fVar.f38427x;
                lVar4.getClass();
                bitSet.set(i12, false);
                lVar4.b(lVar4.f);
                fVar.f38425v[i12] = new k(new ArrayList(lVar4.f38494h), new Matrix(matrix));
            }
            int i13 = i12 + 1;
            int i14 = i13 % 4;
            l lVar5 = lVarArr[i12];
            fArr[0] = lVar5.f38490c;
            fArr[1] = lVar5.f38491d;
            matrixArr2[i12].mapPoints(fArr);
            l lVar6 = lVarArr[i14];
            float f10 = lVar6.f38488a;
            float[] fArr2 = jVar.f38481i;
            fArr2[0] = f10;
            fArr2[1] = lVar6.f38489b;
            matrixArr2[i14].mapPoints(fArr2);
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            l lVar7 = lVarArr[i12];
            fArr[0] = lVar7.f38490c;
            fArr[1] = lVar7.f38491d;
            matrixArr2[i12].mapPoints(fArr);
            if (i12 != 1 && i12 != 3) {
                abs = Math.abs(rectF.centerY() - fArr[1]);
            } else {
                abs = Math.abs(rectF.centerX() - fArr[0]);
            }
            l lVar8 = jVar.f38479g;
            lVar8.e(0.0f, 270.0f, 0.0f);
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        eVar = iVar2.f38460j;
                    } else {
                        eVar = iVar2.f38459i;
                    }
                } else {
                    eVar = iVar2.f38462l;
                }
            } else {
                eVar = iVar2.f38461k;
            }
            eVar.a(max, abs, f, lVar8);
            Path path8 = jVar.f38482j;
            path8.reset();
            lVar8.c(matrixArr[i12], path8);
            if (jVar.f38484l && (jVar.b(path8, i12) || jVar.b(path8, i14))) {
                path8.op(path8, path6, Path.Op.DIFFERENCE);
                fArr[0] = lVar8.f38488a;
                fArr[1] = lVar8.f38489b;
                matrixArr[i12].mapPoints(fArr);
                path2 = path7;
                path2.moveTo(fArr[0], fArr[1]);
                lVar8.c(matrixArr[i12], path2);
                aVar2 = aVar;
                path4 = path;
            } else {
                path2 = path7;
                path4 = path;
                lVar8.c(matrixArr[i12], path4);
                aVar2 = aVar;
            }
            if (aVar2 != null) {
                Matrix matrix2 = matrixArr[i12];
                f fVar2 = f.this;
                fVar2.f38427x.set(i12 + 4, false);
                lVar8.b(lVar8.f);
                fVar2.f38426w[i12] = new k(new ArrayList(lVar8.f38494h), new Matrix(matrix2));
            }
            jVar = this;
            iVar2 = iVar;
            aVar3 = aVar2;
            path7 = path2;
            i12 = i13;
            c10 = 1;
            i6 = 4;
            c11 = 0;
        }
        Path path9 = path7;
        path.close();
        path9.close();
        if (!path9.isEmpty()) {
            path4.op(path9, Path.Op.UNION);
        }
    }

    public final boolean b(Path path, int i6) {
        Path path2 = this.f38483k;
        path2.reset();
        this.f38474a[i6].c(this.f38475b[i6], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() > 1.0f && rectF.height() > 1.0f) {
            return true;
        }
        return false;
    }
}
