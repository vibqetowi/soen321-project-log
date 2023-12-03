package l4;
/* compiled from: ByteArrayAdapter.java */
/* loaded from: classes.dex */
public final class f implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24013a;

    @Override // l4.a
    public final int a() {
        switch (this.f24013a) {
            case 0:
                return 1;
            default:
                return 4;
        }
    }

    @Override // l4.a
    public final int b(Object obj) {
        switch (this.f24013a) {
            case 0:
                return ((byte[]) obj).length;
            default:
                return ((int[]) obj).length;
        }
    }

    @Override // l4.a
    public final Object newArray(int i6) {
        switch (this.f24013a) {
            case 0:
                return new byte[i6];
            default:
                return new int[i6];
        }
    }

    @Override // l4.a
    public final String w() {
        switch (this.f24013a) {
            case 0:
                return "ByteArrayPool";
            default:
                return "IntegerArrayPool";
        }
    }
}
