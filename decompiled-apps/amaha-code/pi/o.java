package pi;
/* compiled from: Spacing.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f28506a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28507b;

    /* renamed from: c  reason: collision with root package name */
    public final int f28508c;

    /* renamed from: d  reason: collision with root package name */
    public final int f28509d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28510e;

    public /* synthetic */ o(int i6, int i10, int i11, int i12, int i13) {
        this.f28506a = i13;
        this.f28507b = i6;
        this.f28508c = i10;
        this.f28509d = i11;
        this.f28510e = i12;
    }

    public final String toString() {
        int i6 = this.f28506a;
        int i10 = this.f28510e;
        int i11 = this.f28509d;
        int i12 = this.f28508c;
        int i13 = this.f28507b;
        switch (i6) {
            case 0:
                return "{left=" + i13 + ", right=" + i12 + ", top=" + i11 + ", bottom=" + i10 + '}';
            default:
                return "CardWidget(cardId=" + i13 + ", verticalImageId=" + i12 + ", horizontalCenterCropImageId=" + i11 + ", horizontalFitCenterImageId=" + i10 + ')';
        }
    }
}
