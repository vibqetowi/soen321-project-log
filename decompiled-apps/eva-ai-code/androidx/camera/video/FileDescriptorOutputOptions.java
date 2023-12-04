package androidx.camera.video;

import android.os.ParcelFileDescriptor;
import androidx.camera.video.AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal;
import androidx.camera.video.OutputOptions;
import androidx.core.util.Preconditions;
/* loaded from: classes.dex */
public final class FileDescriptorOutputOptions extends OutputOptions {
    private final FileDescriptorOutputOptionsInternal mFileDescriptorOutputOptionsInternal;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class FileDescriptorOutputOptionsInternal {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static abstract class Builder {
            abstract FileDescriptorOutputOptionsInternal build();

            abstract Builder setFileSizeLimit(long j);

            abstract Builder setParcelFileDescriptor(ParcelFileDescriptor parcelFileDescriptor);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract long getFileSizeLimit();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract ParcelFileDescriptor getParcelFileDescriptor();
    }

    FileDescriptorOutputOptions(FileDescriptorOutputOptionsInternal fileDescriptorOutputOptionsInternal) {
        Preconditions.checkNotNull(fileDescriptorOutputOptionsInternal, "FileDescriptorOutputOptionsInternal can't be null.");
        this.mFileDescriptorOutputOptionsInternal = fileDescriptorOutputOptionsInternal;
    }

    public ParcelFileDescriptor getParcelFileDescriptor() {
        return this.mFileDescriptorOutputOptionsInternal.getParcelFileDescriptor();
    }

    @Override // androidx.camera.video.OutputOptions
    public long getFileSizeLimit() {
        return this.mFileDescriptorOutputOptionsInternal.getFileSizeLimit();
    }

    public String toString() {
        return this.mFileDescriptorOutputOptionsInternal.toString().replaceFirst("FileDescriptorOutputOptionsInternal", "FileDescriptorOutputOptions");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FileDescriptorOutputOptions) {
            return this.mFileDescriptorOutputOptionsInternal.equals(((FileDescriptorOutputOptions) obj).mFileDescriptorOutputOptionsInternal);
        }
        return false;
    }

    public int hashCode() {
        return this.mFileDescriptorOutputOptionsInternal.hashCode();
    }

    /* loaded from: classes.dex */
    public static final class Builder implements OutputOptions.Builder<FileDescriptorOutputOptions, Builder> {
        private final FileDescriptorOutputOptionsInternal.Builder mInternalBuilder;

        public Builder(ParcelFileDescriptor parcelFileDescriptor) {
            FileDescriptorOutputOptionsInternal.Builder fileSizeLimit = new AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal.Builder().setFileSizeLimit(0L);
            this.mInternalBuilder = fileSizeLimit;
            Preconditions.checkNotNull(parcelFileDescriptor, "File descriptor can't be null.");
            fileSizeLimit.setParcelFileDescriptor(parcelFileDescriptor);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.Builder
        public Builder setFileSizeLimit(long j) {
            this.mInternalBuilder.setFileSizeLimit(j);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.Builder
        public FileDescriptorOutputOptions build() {
            return new FileDescriptorOutputOptions(this.mInternalBuilder.build());
        }
    }
}
