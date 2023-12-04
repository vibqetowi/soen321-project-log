package androidx.camera.video;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import androidx.camera.video.MediaStoreOutputOptions;
/* loaded from: classes.dex */
final class AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal extends MediaStoreOutputOptions.MediaStoreOutputOptionsInternal {
    private final Uri collectionUri;
    private final ContentResolver contentResolver;
    private final ContentValues contentValues;
    private final long fileSizeLimit;

    private AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal(ContentResolver contentResolver, Uri uri, ContentValues contentValues, long j) {
        this.contentResolver = contentResolver;
        this.collectionUri = uri;
        this.contentValues = contentValues;
        this.fileSizeLimit = j;
    }

    @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal
    ContentResolver getContentResolver() {
        return this.contentResolver;
    }

    @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal
    Uri getCollectionUri() {
        return this.collectionUri;
    }

    @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal
    ContentValues getContentValues() {
        return this.contentValues;
    }

    @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal
    long getFileSizeLimit() {
        return this.fileSizeLimit;
    }

    public String toString() {
        return "MediaStoreOutputOptionsInternal{contentResolver=" + this.contentResolver + ", collectionUri=" + this.collectionUri + ", contentValues=" + this.contentValues + ", fileSizeLimit=" + this.fileSizeLimit + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MediaStoreOutputOptions.MediaStoreOutputOptionsInternal) {
            MediaStoreOutputOptions.MediaStoreOutputOptionsInternal mediaStoreOutputOptionsInternal = (MediaStoreOutputOptions.MediaStoreOutputOptionsInternal) obj;
            return this.contentResolver.equals(mediaStoreOutputOptionsInternal.getContentResolver()) && this.collectionUri.equals(mediaStoreOutputOptionsInternal.getCollectionUri()) && this.contentValues.equals(mediaStoreOutputOptionsInternal.getContentValues()) && this.fileSizeLimit == mediaStoreOutputOptionsInternal.getFileSizeLimit();
        }
        return false;
    }

    public int hashCode() {
        long j = this.fileSizeLimit;
        return ((((((this.contentResolver.hashCode() ^ 1000003) * 1000003) ^ this.collectionUri.hashCode()) * 1000003) ^ this.contentValues.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    /* loaded from: classes.dex */
    static final class Builder extends MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder {
        private Uri collectionUri;
        private ContentResolver contentResolver;
        private ContentValues contentValues;
        private Long fileSizeLimit;

        @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder
        MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder setContentResolver(ContentResolver contentResolver) {
            if (contentResolver == null) {
                throw new NullPointerException("Null contentResolver");
            }
            this.contentResolver = contentResolver;
            return this;
        }

        @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder
        MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder setCollectionUri(Uri uri) {
            if (uri == null) {
                throw new NullPointerException("Null collectionUri");
            }
            this.collectionUri = uri;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder
        public MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder setContentValues(ContentValues contentValues) {
            if (contentValues == null) {
                throw new NullPointerException("Null contentValues");
            }
            this.contentValues = contentValues;
            return this;
        }

        @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder
        MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder setFileSizeLimit(long j) {
            this.fileSizeLimit = Long.valueOf(j);
            return this;
        }

        @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder
        MediaStoreOutputOptions.MediaStoreOutputOptionsInternal build() {
            String str = this.contentResolver == null ? " contentResolver" : "";
            if (this.collectionUri == null) {
                str = str + " collectionUri";
            }
            if (this.contentValues == null) {
                str = str + " contentValues";
            }
            if (this.fileSizeLimit == null) {
                str = str + " fileSizeLimit";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal(this.contentResolver, this.collectionUri, this.contentValues, this.fileSizeLimit.longValue());
        }
    }
}
