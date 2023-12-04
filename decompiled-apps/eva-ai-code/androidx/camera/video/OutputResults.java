package androidx.camera.video;

import android.net.Uri;
import androidx.core.util.Preconditions;
/* loaded from: classes.dex */
public abstract class OutputResults {
    public abstract Uri getOutputUri();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static OutputResults of(Uri uri) {
        Preconditions.checkNotNull(uri, "OutputUri cannot be null.");
        return new AutoValue_OutputResults(uri);
    }
}
