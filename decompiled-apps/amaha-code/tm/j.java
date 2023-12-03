package tm;

import android.net.Uri;
import androidx.lifecycle.w;
import com.google.firebase.storage.StorageReference;
import com.theinnerhour.b2b.components.journal.model.ImageResponse;
import com.theinnerhour.b2b.utils.LogHelper;
import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: JournalParentViewModel.kt */
/* loaded from: classes2.dex */
public final class j extends k implements l<Uri, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e f33325u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ StorageReference f33326v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(StorageReference storageReference, e eVar) {
        super(1);
        this.f33325u = eVar;
        this.f33326v = storageReference;
    }

    @Override // ss.l
    public final hs.k invoke(Uri uri) {
        Uri uri2 = uri;
        e eVar = this.f33325u;
        try {
            String uri3 = uri2.toString();
            kotlin.jvm.internal.i.f(uri3, "tt.toString()");
            eVar.N.i(new ImageResponse.Success(uri3, this.f33326v));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(eVar.f33302z, e10);
            w<ImageResponse> wVar = eVar.N;
            String localizedMessage = e10.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "";
            }
            wVar.i(new ImageResponse.Failure(localizedMessage));
        }
        return hs.k.f19476a;
    }
}
