package coil.map;

import android.net.Uri;
import coil.request.Options;
import coil.util.Utils;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: FileUriMapper.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcoil/map/FileUriMapper;", "Lcoil/map/Mapper;", "Landroid/net/Uri;", "Ljava/io/File;", "()V", "isApplicable", "", "data", "map", "options", "Lcoil/request/Options;", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FileUriMapper implements Mapper<Uri, File> {
    @Override // coil.map.Mapper
    public File map(Uri uri, Options options) {
        if (isApplicable(uri)) {
            if (Intrinsics.areEqual(uri.getScheme(), ShareInternalUtility.STAGING_PARAM)) {
                String path = uri.getPath();
                if (path != null) {
                    return new File(path);
                }
                return null;
            }
            return new File(uri.toString());
        }
        return null;
    }

    private final boolean isApplicable(Uri uri) {
        if (Utils.isAssetUri(uri)) {
            return false;
        }
        String scheme = uri.getScheme();
        if (scheme == null || Intrinsics.areEqual(scheme, ShareInternalUtility.STAGING_PARAM)) {
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            return StringsKt.startsWith$default((CharSequence) path, '/', false, 2, (Object) null) && Utils.getFirstPathSegment(uri) != null;
        }
        return false;
    }
}
