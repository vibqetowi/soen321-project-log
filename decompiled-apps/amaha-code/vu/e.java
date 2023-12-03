package vu;

import vu.c;
import wu.f;
/* compiled from: LockBasedStorageManager.java */
/* loaded from: classes2.dex */
public final class e extends c.i<Object> {

    /* renamed from: y */
    public final /* synthetic */ ss.l f36161y;

    /* renamed from: z */
    public final /* synthetic */ ss.l f36162z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, f.b bVar, f.c cVar2, f.d dVar) {
        super(cVar, bVar);
        this.f36161y = cVar2;
        this.f36162z = dVar;
    }

    public static /* synthetic */ void a(int i6) {
        String str;
        int i10;
        if (i6 != 2) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i6 != 2) {
            i10 = 2;
        } else {
            i10 = 3;
        }
        Object[] objArr = new Object[i10];
        if (i6 != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i6 != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i6 == 2) {
            objArr[2] = "doPostCompute";
        }
        String format = String.format(str, objArr);
        if (i6 != 2) {
            throw new IllegalStateException(format);
        }
        throw new IllegalArgumentException(format);
    }

    @Override // vu.c.f
    public final c.m<Object> c(boolean z10) {
        ss.l lVar = this.f36161y;
        if (lVar == null) {
            c.m<Object> c10 = super.c(z10);
            if (c10 != null) {
                return c10;
            }
            a(0);
            throw null;
        }
        return new c.m<>(lVar.invoke(Boolean.valueOf(z10)), false);
    }
}
