package wo;

import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import wo.n;
/* compiled from: ExperimentEditProfileRepository.kt */
/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.k implements ss.l<UploadTask.TaskSnapshot, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ StorageReference f36989u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ n f36990v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ls.d<String> f36991w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(StorageReference storageReference, n nVar, ls.h hVar) {
        super(1);
        this.f36989u = storageReference;
        this.f36990v = nVar;
        this.f36991w = hVar;
    }

    @Override // ss.l
    public final hs.k invoke(UploadTask.TaskSnapshot taskSnapshot) {
        this.f36989u.getDownloadUrl().addOnSuccessListener(new n.a(new s(this.f36990v, this.f36991w)));
        return hs.k.f19476a;
    }
}
