package tm;

import com.google.firebase.storage.OnProgressListener;
import hr.l7;
import ss.l;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements OnProgressListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f33321a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f33322b;

    public /* synthetic */ h(int i6, l lVar) {
        this.f33321a = i6;
        this.f33322b = lVar;
    }

    @Override // com.google.firebase.storage.OnProgressListener
    public final void onProgress(Object obj) {
        int i6 = this.f33321a;
        l tmp0 = this.f33322b;
        switch (i6) {
            case 0:
                tmp0.invoke(obj);
                return;
            default:
                int i10 = l7.H;
                kotlin.jvm.internal.i.g(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
        }
    }
}
