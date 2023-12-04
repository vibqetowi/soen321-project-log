package androidx.camera.view.video;

import android.net.Uri;
/* loaded from: classes.dex */
final class AutoValue_OutputFileResults extends OutputFileResults {
    private final Uri savedUri;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_OutputFileResults(Uri uri) {
        this.savedUri = uri;
    }

    @Override // androidx.camera.view.video.OutputFileResults
    public Uri getSavedUri() {
        return this.savedUri;
    }

    public String toString() {
        return "OutputFileResults{savedUri=" + this.savedUri + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OutputFileResults) {
            Uri uri = this.savedUri;
            Uri savedUri = ((OutputFileResults) obj).getSavedUri();
            return uri == null ? savedUri == null : uri.equals(savedUri);
        }
        return false;
    }

    public int hashCode() {
        Uri uri = this.savedUri;
        return (uri == null ? 0 : uri.hashCode()) ^ 1000003;
    }
}
