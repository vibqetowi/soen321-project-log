package v;
/* compiled from: Pools.java */
/* loaded from: classes.dex */
public class e implements s0.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f34651a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f34652b;

    /* renamed from: c  reason: collision with root package name */
    public int f34653c;

    public e(int i6, int i10) {
        this.f34651a = i10;
        if (i10 != 1) {
            if (i6 > 0) {
                this.f34652b = new Object[i6];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        } else if (i6 > 0) {
            this.f34652b = new Object[i6];
        } else {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
    }

    @Override // s0.d
    public boolean a(Object obj) {
        int i6;
        boolean z10;
        int i10 = this.f34651a;
        Object[] objArr = this.f34652b;
        switch (i10) {
            case 0:
                int i11 = this.f34653c;
                if (i11 >= objArr.length) {
                    return false;
                }
                objArr[i11] = obj;
                this.f34653c = i11 + 1;
                return true;
            default:
                int i12 = 0;
                while (true) {
                    i6 = this.f34653c;
                    if (i12 < i6) {
                        if (objArr[i12] == obj) {
                            z10 = true;
                        } else {
                            i12++;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!z10) {
                    if (i6 >= objArr.length) {
                        return false;
                    }
                    objArr[i6] = obj;
                    this.f34653c = i6 + 1;
                    return true;
                }
                throw new IllegalStateException("Already in the pool!");
        }
    }

    @Override // s0.d
    public Object b() {
        int i6 = this.f34651a;
        Object[] objArr = this.f34652b;
        switch (i6) {
            case 0:
                int i10 = this.f34653c;
                if (i10 <= 0) {
                    return null;
                }
                int i11 = i10 - 1;
                Object obj = objArr[i11];
                objArr[i11] = null;
                this.f34653c = i11;
                return obj;
            default:
                int i12 = this.f34653c;
                if (i12 <= 0) {
                    return null;
                }
                int i13 = i12 - 1;
                Object obj2 = objArr[i13];
                objArr[i13] = null;
                this.f34653c = i13;
                return obj2;
        }
    }
}
