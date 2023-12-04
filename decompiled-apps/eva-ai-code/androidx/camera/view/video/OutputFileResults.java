package androidx.camera.view.video;

import android.net.Uri;
/* loaded from: classes.dex */
public abstract class OutputFileResults {
    public abstract Uri getSavedUri();

    public static OutputFileResults create(Uri uri) {
        return new AutoValue_OutputFileResults(uri);
    }
}
