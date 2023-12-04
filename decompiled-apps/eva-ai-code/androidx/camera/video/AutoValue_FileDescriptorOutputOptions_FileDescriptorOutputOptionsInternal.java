package androidx.camera.video;

import android.os.ParcelFileDescriptor;
import androidx.camera.video.FileDescriptorOutputOptions;
/* loaded from: classes.dex */
final class AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal extends FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal {
    private final long fileSizeLimit;
    private final ParcelFileDescriptor parcelFileDescriptor;

    private AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal(ParcelFileDescriptor parcelFileDescriptor, long j) {
        this.parcelFileDescriptor = parcelFileDescriptor;
        this.fileSizeLimit = j;
    }

    @Override // androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal
    ParcelFileDescriptor getParcelFileDescriptor() {
        return this.parcelFileDescriptor;
    }

    @Override // androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal
    long getFileSizeLimit() {
        return this.fileSizeLimit;
    }

    public String toString() {
        return "FileDescriptorOutputOptionsInternal{parcelFileDescriptor=" + this.parcelFileDescriptor + ", fileSizeLimit=" + this.fileSizeLimit + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal) {
            FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal fileDescriptorOutputOptionsInternal = (FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal) obj;
            return this.parcelFileDescriptor.equals(fileDescriptorOutputOptionsInternal.getParcelFileDescriptor()) && this.fileSizeLimit == fileDescriptorOutputOptionsInternal.getFileSizeLimit();
        }
        return false;
    }

    public int hashCode() {
        long j = this.fileSizeLimit;
        return ((this.parcelFileDescriptor.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    /* loaded from: classes.dex */
    static final class Builder extends FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder {
        private Long fileSizeLimit;
        private ParcelFileDescriptor parcelFileDescriptor;

        @Override // androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder
        FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder setParcelFileDescriptor(ParcelFileDescriptor parcelFileDescriptor) {
            if (parcelFileDescriptor == null) {
                throw new NullPointerException("Null parcelFileDescriptor");
            }
            this.parcelFileDescriptor = parcelFileDescriptor;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder
        public FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder setFileSizeLimit(long j) {
            this.fileSizeLimit = Long.valueOf(j);
            return this;
        }

        @Override // androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder
        FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal build() {
            String str = this.parcelFileDescriptor == null ? " parcelFileDescriptor" : "";
            if (this.fileSizeLimit == null) {
                str = str + " fileSizeLimit";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal(this.parcelFileDescriptor, this.fileSizeLimit.longValue());
        }
    }
}
