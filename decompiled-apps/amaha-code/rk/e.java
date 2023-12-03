package rk;

import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: ChatViewModel.kt */
/* loaded from: classes2.dex */
public final class e extends k implements l<UploadTask.TaskSnapshot, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ StorageReference f30778u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ f f30779v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f30780w = "File";

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ boolean f30781x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f30782y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(StorageReference storageReference, f fVar, boolean z10, String str) {
        super(1);
        this.f30778u = storageReference;
        this.f30779v = fVar;
        this.f30781x = z10;
        this.f30782y = str;
    }

    @Override // ss.l
    public final hs.k invoke(UploadTask.TaskSnapshot taskSnapshot) {
        this.f30778u.getDownloadUrl().addOnSuccessListener(new b(1, new d(taskSnapshot, this.f30779v, this.f30780w, this.f30781x, this.f30782y)));
        return hs.k.f19476a;
    }
}
