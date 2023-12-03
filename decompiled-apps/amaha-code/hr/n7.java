package hr;

import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
/* compiled from: ScreenS33Fragment.kt */
/* loaded from: classes2.dex */
public final class n7 extends kotlin.jvm.internal.k implements ss.l<UploadTask.TaskSnapshot, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ StorageReference f18890u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ l7 f18891v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(StorageReference storageReference, l7 l7Var) {
        super(1);
        this.f18890u = storageReference;
        this.f18891v = l7Var;
    }

    @Override // ss.l
    public final hs.k invoke(UploadTask.TaskSnapshot taskSnapshot) {
        this.f18890u.getDownloadUrl().addOnSuccessListener(new rk.b(11, new m7(this.f18891v)));
        return hs.k.f19476a;
    }
}
