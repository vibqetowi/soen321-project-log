package i4;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
/* compiled from: FileDescriptorAssetPathFetcher.java */
/* loaded from: classes.dex */
public final class h extends b {

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ int f19817x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(AssetManager assetManager, String str, int i6) {
        super(assetManager, str);
        this.f19817x = i6;
    }

    @Override // i4.d
    public final Class a() {
        switch (this.f19817x) {
            case 0:
                return ParcelFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }
}
