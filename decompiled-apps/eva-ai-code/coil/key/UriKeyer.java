package coil.key;

import android.net.Uri;
import coil.request.Options;
import coil.util.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.codec.language.Soundex;
/* compiled from: UriKeyer.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcoil/key/UriKeyer;", "Lcoil/key/Keyer;", "Landroid/net/Uri;", "()V", "key", "", "data", "options", "Lcoil/request/Options;", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UriKeyer implements Keyer<Uri> {
    @Override // coil.key.Keyer
    public String key(Uri uri, Options options) {
        if (Intrinsics.areEqual(uri.getScheme(), "android.resource")) {
            StringBuilder sb = new StringBuilder();
            sb.append(uri);
            sb.append(Soundex.SILENT_MARKER);
            sb.append(Utils.getNightMode(options.getContext().getResources().getConfiguration()));
            return sb.toString();
        }
        return uri.toString();
    }
}
