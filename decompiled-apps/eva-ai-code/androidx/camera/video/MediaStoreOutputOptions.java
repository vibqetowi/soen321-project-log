package androidx.camera.video;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import androidx.camera.video.AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal;
import androidx.camera.video.OutputOptions;
import androidx.core.util.Preconditions;
/* loaded from: classes.dex */
public final class MediaStoreOutputOptions extends OutputOptions {
    public static final ContentValues EMPTY_CONTENT_VALUES = new ContentValues();
    private final MediaStoreOutputOptionsInternal mMediaStoreOutputOptionsInternal;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class MediaStoreOutputOptionsInternal {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static abstract class Builder {
            abstract MediaStoreOutputOptionsInternal build();

            abstract Builder setCollectionUri(Uri uri);

            abstract Builder setContentResolver(ContentResolver contentResolver);

            abstract Builder setContentValues(ContentValues contentValues);

            abstract Builder setFileSizeLimit(long j);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract Uri getCollectionUri();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract ContentResolver getContentResolver();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract ContentValues getContentValues();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract long getFileSizeLimit();
    }

    MediaStoreOutputOptions(MediaStoreOutputOptionsInternal mediaStoreOutputOptionsInternal) {
        Preconditions.checkNotNull(mediaStoreOutputOptionsInternal, "MediaStoreOutputOptionsInternal can't be null.");
        this.mMediaStoreOutputOptionsInternal = mediaStoreOutputOptionsInternal;
    }

    public ContentResolver getContentResolver() {
        return this.mMediaStoreOutputOptionsInternal.getContentResolver();
    }

    public Uri getCollectionUri() {
        return this.mMediaStoreOutputOptionsInternal.getCollectionUri();
    }

    public ContentValues getContentValues() {
        return this.mMediaStoreOutputOptionsInternal.getContentValues();
    }

    @Override // androidx.camera.video.OutputOptions
    public long getFileSizeLimit() {
        return this.mMediaStoreOutputOptionsInternal.getFileSizeLimit();
    }

    public String toString() {
        return this.mMediaStoreOutputOptionsInternal.toString().replaceFirst("MediaStoreOutputOptionsInternal", "MediaStoreOutputOptions");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaStoreOutputOptions) {
            return this.mMediaStoreOutputOptionsInternal.equals(((MediaStoreOutputOptions) obj).mMediaStoreOutputOptionsInternal);
        }
        return false;
    }

    public int hashCode() {
        return this.mMediaStoreOutputOptionsInternal.hashCode();
    }

    /* loaded from: classes.dex */
    public static final class Builder implements OutputOptions.Builder<MediaStoreOutputOptions, Builder> {
        private final MediaStoreOutputOptionsInternal.Builder mInternalBuilder;

        public Builder(ContentResolver contentResolver, Uri uri) {
            MediaStoreOutputOptionsInternal.Builder fileSizeLimit = new AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal.Builder().setContentValues(MediaStoreOutputOptions.EMPTY_CONTENT_VALUES).setFileSizeLimit(0L);
            this.mInternalBuilder = fileSizeLimit;
            Preconditions.checkNotNull(contentResolver, "Content resolver can't be null.");
            Preconditions.checkNotNull(uri, "Collection Uri can't be null.");
            fileSizeLimit.setContentResolver(contentResolver).setCollectionUri(uri);
        }

        public Builder setContentValues(ContentValues contentValues) {
            Preconditions.checkNotNull(contentValues, "Content values can't be null.");
            this.mInternalBuilder.setContentValues(contentValues);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.Builder
        public Builder setFileSizeLimit(long j) {
            this.mInternalBuilder.setFileSizeLimit(j);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.Builder
        public MediaStoreOutputOptions build() {
            return new MediaStoreOutputOptions(this.mInternalBuilder.build());
        }
    }
}
